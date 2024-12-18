package com.google.repack.protobuf;

import X.InterfaceC65289ThM;
import X.InterfaceC65446TkI;
import X.RaB;
import X.TEY;

/* loaded from: classes10.dex */
public final class SourceContext extends RaB implements InterfaceC65446TkI {
    public static final SourceContext DEFAULT_INSTANCE;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    public static volatile InterfaceC65289ThM PARSER;
    public String fileName_ = "";

    static {
        SourceContext sourceContext = new SourceContext();
        DEFAULT_INSTANCE = sourceContext;
        TEY.A03(SourceContext.class, sourceContext);
    }
}
