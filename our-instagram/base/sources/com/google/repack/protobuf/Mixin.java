package com.google.repack.protobuf;

import X.InterfaceC65289ThM;
import X.InterfaceC65446TkI;
import X.RaB;
import X.TEY;

/* loaded from: classes10.dex */
public final class Mixin extends RaB implements InterfaceC65446TkI {
    public static final Mixin DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static volatile InterfaceC65289ThM PARSER = null;
    public static final int ROOT_FIELD_NUMBER = 2;
    public String name_ = "";
    public String root_ = "";

    static {
        Mixin mixin = new Mixin();
        DEFAULT_INSTANCE = mixin;
        TEY.A03(Mixin.class, mixin);
    }
}
