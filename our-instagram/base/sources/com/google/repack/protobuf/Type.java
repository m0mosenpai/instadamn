package com.google.repack.protobuf;

import X.InterfaceC65289ThM;
import X.InterfaceC65446TkI;
import X.InterfaceC65692TsE;
import X.RYz;
import X.RaB;
import X.TEY;

/* loaded from: classes10.dex */
public final class Type extends RaB implements InterfaceC65446TkI {
    public static final Type DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    public static volatile InterfaceC65289ThM PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    public InterfaceC65692TsE fields_;
    public String name_ = "";
    public InterfaceC65692TsE oneofs_;
    public InterfaceC65692TsE options_;
    public SourceContext sourceContext_;
    public int syntax_;

    static {
        Type type = new Type();
        DEFAULT_INSTANCE = type;
        TEY.A03(Type.class, type);
    }

    public Type() {
        RYz rYz = RYz.A02;
        this.fields_ = rYz;
        this.oneofs_ = rYz;
        this.options_ = rYz;
    }
}