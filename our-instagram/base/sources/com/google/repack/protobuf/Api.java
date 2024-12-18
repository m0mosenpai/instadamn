package com.google.repack.protobuf;

import X.InterfaceC65289ThM;
import X.InterfaceC65446TkI;
import X.InterfaceC65692TsE;
import X.RYz;
import X.RaB;
import X.TEY;

/* loaded from: classes10.dex */
public final class Api extends RaB implements InterfaceC65446TkI {
    public static final Api DEFAULT_INSTANCE;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    public static volatile InterfaceC65289ThM PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    public InterfaceC65692TsE methods_;
    public InterfaceC65692TsE mixins_;
    public String name_ = "";
    public InterfaceC65692TsE options_;
    public SourceContext sourceContext_;
    public int syntax_;
    public String version_;

    static {
        Api api = new Api();
        DEFAULT_INSTANCE = api;
        TEY.A03(Api.class, api);
    }

    public Api() {
        RYz rYz = RYz.A02;
        this.methods_ = rYz;
        this.options_ = rYz;
        this.version_ = "";
        this.mixins_ = rYz;
    }
}
