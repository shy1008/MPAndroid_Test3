package com.example.mpandroidchart_example;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private LineChart mpLineChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        lineChart = (LineChart) findViewById(R.id.line_chart);
//
//        ArrayList<String> xAXES = new ArrayList<>();
//        ArrayList<Entry> yAXESsin = new ArrayList<>();
//        ArrayList<Entry> yAXEScos = new ArrayList<>();
//
//        double x = 0;
//        int numDataPoints = 6;
//
//        for (int i = 0; i < numDataPoints; i++) {
//            float sinFunction = Float.parseFloat(String.valueOf(Math.sin(x)));
//            float cosFunction = Float.parseFloat(String.valueOf(Math.cos(x)));
//            x += 0.1;
//            yAXESsin.add(new Entry(sinFunction, i));
//            yAXEScos.add(new Entry(cosFunction, i));
//            xAXES.add(i, String.valueOf(x));
//        }
//        String[] xaxes = new String[xAXES.size()];
//        for (int i=0; i<xAXES.size(); i ++){
//            xaxes[i] = xAXES.get(i).toString();
//        }
//
//        ArrayList<LineDataSet> lineDataSets = new ArrayList<>();
//        LineDataSet lineDataSet1 = new LineDataSet(yAXEScos,"cos");
//        lineDataSet1.setDrawCircles(false);
//        lineDataSet1.setColor(Color.BLUE);
//
//        LineDataSet lineDataSet2 = new LineDataSet(yAXESsin,"cos");
//        lineDataSet2.setDrawCircles(false);
//        lineDataSet2.setColor(Color.RED);
//
//        lineDataSets.add(lineDataSet1);
//        lineDataSets.add(lineDataSet2);
//
//        LineData data = new LineData((ILineDataSet) lineDataSets);
//
//        lineChart.setData(data);
//        lineChart.setVisibleXRangeMaximum(65f);
//
//

        mpLineChart = (LineChart) findViewById(R.id.line_chart);
        LineDataSet lineDataSet = new LineDataSet(dataValue1(), "Data set1");
        LineDataSet lineDataSet2 = new LineDataSet(dataValue2(), "Data set2");

        ArrayList<ILineDataSet> dataSets = new ArrayList<>();
        dataSets.add(lineDataSet);
        dataSets.add(lineDataSet2);

        LineData data = new LineData(dataSets);
        mpLineChart.setData(data);
        mpLineChart.invalidate();

    }

    private  ArrayList<Entry> dataValue1(){
        ArrayList<Entry> datavalue = new ArrayList<Entry>();
        datavalue.add(new Entry(0,20));
        datavalue.add(new Entry(1,24));
        datavalue.add(new Entry(2,10));
        datavalue.add(new Entry(3,14));
        datavalue.add(new Entry(4,30));

        return datavalue;
    }

    private  ArrayList<Entry> dataValue2(){
        ArrayList<Entry> datavalue = new ArrayList<Entry>();
        datavalue.add(new Entry(0,12));
        datavalue.add(new Entry(2,12));
        datavalue.add(new Entry(3,16));
        datavalue.add(new Entry(5,23));
        datavalue.add(new Entry(7,12));

        return datavalue;
    }
}
