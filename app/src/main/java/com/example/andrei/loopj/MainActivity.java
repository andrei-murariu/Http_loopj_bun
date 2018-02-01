package com.example.andrei.loopj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.ResponseHandlerInterface;

import java.io.IOException;
import java.net.URI;

import cz.msebera.android.httpclient.Header;
import cz.msebera.android.httpclient.HttpResponse;
import cz.msebera.android.httpclient.entity.StringEntity;


public class MainActivity extends AppCompatActivity {
    Button http_post;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        http_post = (Button)findViewById(R.id.http_post);

        http_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test();
            }
        });


    }

    private void test(){
        AsyncHttpClient client = new AsyncHttpClient();
        client.setBasicAuth("Mrzq7cU9Qu\\RD2keAsIbB","l0J2xg9A");

        StringEntity payload = new StringEntity("{\"value\":2}", "utf-8");

        client.post(this, "https://iot.simfony.net/8189b50fa17c2c1d9f0920544fea15da94897120/MTI5NQ==/test", payload, Commons.CONTENT_TYPE, new ResponseHandlerInterface() {
            @Override
            public void sendResponseMessage(HttpResponse response) throws IOException {

            }

            @Override
            public void sendStartMessage() {

            }

            @Override
            public void sendFinishMessage() {

            }

            @Override
            public void sendProgressMessage(long bytesWritten, long bytesTotal) {

            }

            @Override
            public void sendCancelMessage() {

            }

            @Override
            public void sendSuccessMessage(int statusCode, Header[] headers, byte[] responseBody) {
                System.out.println("donne");
            }

            @Override
            public void sendFailureMessage(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }

            @Override
            public void sendRetryMessage(int retryNo) {

            }

            @Override
            public URI getRequestURI() {
                return null;
            }

            @Override
            public void setRequestURI(URI requestURI) {

            }

            @Override
            public Header[] getRequestHeaders() {
                return new Header[0];
            }

            @Override
            public void setRequestHeaders(Header[] requestHeaders) {

            }

            @Override
            public boolean getUseSynchronousMode() {
                return false;
            }

            @Override
            public void setUseSynchronousMode(boolean useSynchronousMode) {

            }

            @Override
            public boolean getUsePoolThread() {
                return false;
            }

            @Override
            public void setUsePoolThread(boolean usePoolThread) {

            }

            @Override
            public void onPreProcessResponse(ResponseHandlerInterface instance, HttpResponse response) {

            }

            @Override
            public void onPostProcessResponse(ResponseHandlerInterface instance, HttpResponse response) {

            }

            @Override
            public Object getTag() {
                return null;
            }

            @Override
            public void setTag(Object TAG) {

            }
        });
    }



}
