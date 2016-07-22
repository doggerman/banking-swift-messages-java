package com.qoomon.banking.swift.submessage.field;

/**
 * Created by qoomon on 08/07/2016.
 */
public class PageSeparator implements SwiftField {

    public static final String TAG = "-";

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public String getContent() {
        return "";
    }
}