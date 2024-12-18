package com.google.repack.protobuf;

import X.InterfaceC65289ThM;
import X.InterfaceC65446TkI;
import X.RaB;
import X.TEY;

/* loaded from: classes10.dex */
public final class Timestamp extends RaB implements InterfaceC65446TkI {
    public static final Timestamp DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    public static volatile InterfaceC65289ThM PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    public int nanos_;
    public long seconds_;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.RaB, java.lang.Object, com.google.repack.protobuf.Timestamp] */
    static {
        ?? raB = new RaB();
        DEFAULT_INSTANCE = raB;
        TEY.A03(Timestamp.class, raB);
    }
}
