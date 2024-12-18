package com.google.repack.protobuf;

import X.InterfaceC65289ThM;
import X.InterfaceC65446TkI;
import X.InterfaceC65692TsE;
import X.RYz;
import X.RaB;
import X.TEY;

/* loaded from: classes10.dex */
public final class Method extends RaB implements InterfaceC65446TkI {
    public static final Method DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    public static volatile InterfaceC65289ThM PARSER = null;
    public static final int REQUEST_STREAMING_FIELD_NUMBER = 3;
    public static final int REQUEST_TYPE_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_STREAMING_FIELD_NUMBER = 5;
    public static final int RESPONSE_TYPE_URL_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public boolean requestStreaming_;
    public boolean responseStreaming_;
    public int syntax_;
    public String name_ = "";
    public String requestTypeUrl_ = "";
    public String responseTypeUrl_ = "";
    public InterfaceC65692TsE options_ = RYz.A02;

    static {
        Method method = new Method();
        DEFAULT_INSTANCE = method;
        TEY.A03(Method.class, method);
    }
}
