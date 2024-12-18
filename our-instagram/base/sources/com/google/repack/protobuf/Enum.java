package com.google.repack.protobuf;

import X.InterfaceC65289ThM;
import X.InterfaceC65446TkI;
import X.InterfaceC65692TsE;
import X.RYz;
import X.RaB;
import X.TEY;

/* loaded from: classes10.dex */
public final class Enum extends RaB implements InterfaceC65446TkI {
    public static final Enum DEFAULT_INSTANCE;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    public static volatile InterfaceC65289ThM PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    public InterfaceC65692TsE enumvalue_;
    public String name_ = "";
    public InterfaceC65692TsE options_;
    public SourceContext sourceContext_;
    public int syntax_;

    static {
        Enum r1 = new Enum();
        DEFAULT_INSTANCE = r1;
        TEY.A03(Enum.class, r1);
    }

    public Enum() {
        RYz rYz = RYz.A02;
        this.enumvalue_ = rYz;
        this.options_ = rYz;
    }
}
