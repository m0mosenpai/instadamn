package com.google.protobuf;

import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.InterfaceC65691TsD;
import X.RWF;
import X.RYn;

/* loaded from: classes10.dex */
public final class Api extends RYn implements InterfaceC65445TkH {
    public static final Api DEFAULT_INSTANCE;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    public InterfaceC65691TsD methods_;
    public InterfaceC65691TsD mixins_;
    public String name_ = "";
    public InterfaceC65691TsD options_;
    public SourceContext sourceContext_;
    public int syntax_;
    public String version_;

    static {
        Api api = new Api();
        DEFAULT_INSTANCE = api;
        RYn.A0B(api, Api.class);
    }

    public Api() {
        RWF rwf = RWF.A02;
        this.methods_ = rwf;
        this.options_ = rwf;
        this.version_ = "";
        this.mixins_ = rwf;
    }
}
