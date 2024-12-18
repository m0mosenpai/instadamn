package com.google.protobuf;

import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.InterfaceC65691TsD;
import X.RWF;
import X.RYn;

/* loaded from: classes10.dex */
public final class Enum extends RYn implements InterfaceC65445TkH {
    public static final Enum DEFAULT_INSTANCE;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    public InterfaceC65691TsD enumvalue_;
    public String name_ = "";
    public InterfaceC65691TsD options_;
    public SourceContext sourceContext_;
    public int syntax_;

    static {
        Enum r1 = new Enum();
        DEFAULT_INSTANCE = r1;
        RYn.A0B(r1, Enum.class);
    }

    public Enum() {
        RWF rwf = RWF.A02;
        this.enumvalue_ = rwf;
        this.options_ = rwf;
    }
}
