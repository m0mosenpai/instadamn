package com.google.protobuf;

import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.InterfaceC65691TsD;
import X.RWF;
import X.RYn;

/* loaded from: classes10.dex */
public final class Method extends RYn implements InterfaceC65445TkH {
    public static final Method DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    public static volatile InterfaceC50386MMo PARSER = null;
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
    public InterfaceC65691TsD options_ = RWF.A02;

    static {
        Method method = new Method();
        DEFAULT_INSTANCE = method;
        RYn.A0B(method, Method.class);
    }
}
