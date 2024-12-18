package com.google.protobuf;

import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.InterfaceC65691TsD;
import X.RWF;
import X.RYn;

/* loaded from: classes10.dex */
public final class Type extends RYn implements InterfaceC65445TkH {
    public static final Type DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    public InterfaceC65691TsD fields_;
    public String name_ = "";
    public InterfaceC65691TsD oneofs_;
    public InterfaceC65691TsD options_;
    public SourceContext sourceContext_;
    public int syntax_;

    static {
        Type type = new Type();
        DEFAULT_INSTANCE = type;
        RYn.A0B(type, Type.class);
    }

    public Type() {
        RWF rwf = RWF.A02;
        this.fields_ = rwf;
        this.oneofs_ = rwf;
        this.options_ = rwf;
    }
}
