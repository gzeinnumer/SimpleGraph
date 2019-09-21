package com.example.simplegraph;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    LineGraphSeries<DataPoint> series2;
    double x,y;
    GraphView graph;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        graph = (GraphView) findViewById(R.id.graph);
        GraphView graph2 = (GraphView) findViewById(R.id.graph2);

        //versi 1
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[] {
                new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(2, 3),
                new DataPoint(3, 2),
                new DataPoint(4, 6)
        });

        graph.addSeries(series);

        //versi 2
        x =-5.0;
        series2 = new LineGraphSeries<DataPoint>();
        for(int i=0; i<500; i++){
            x = x +0.1;
            y = Math.sin(x);
            series2.appendData(new DataPoint(x,y), true, 500);
        }
        graph2.addSeries(series2);
    }

    Date date;
    List<ReadSensorItem> dataItem = new ArrayList<>();

    private void initdataToGraphView() {
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>();

        for (int i=dataItem.size()-1; i>=0; i--) {
            @SuppressLint("SimpleDateFormat") SimpleDateFormat curTime = new SimpleDateFormat("hh:mm:ss");
            try {
                date = curTime.parse(dataItem.get(i).getTime()); //13:00:13
            } catch (ParseException e) {
                e.printStackTrace();
            } finally {
                series.appendData(new DataPoint(date,
                        Double.parseDouble(dataItem.get(i).getKelembabanTanah())), true, 10);
            }

        }
        graph.addSeries(series);
    }
}
