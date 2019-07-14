//package com.example.android.alc4phase1;
//
//import android.content.Context;
//import android.content.DialogInterface;
//import android.net.http.SslError;
//import android.support.v7.app.AlertDialog;
//import android.webkit.SslErrorHandler;
//import android.webkit.WebView;
//import android.webkit.WebViewClient;
//
//import com.example.android.alc4phase1.R;
//
//public class WvClient extends WebViewClient {
//
//    @Override
//    public void onReceivedSslError(WebView view, final SslErrorHandler handler, SslError error) {
//        // for SSLErrorHandler
//        Context context = null;
//        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
//        builder.setMessage(R.string.notification_error_ssl_cert_invalid);
//        builder.setPositiveButton("continue", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                handler.proceed();
//            }
//        });
//        builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                handler.cancel();
//            }
//        });
//        final AlertDialog dialog = builder.create();
//        dialog.show();
//    }
//}
