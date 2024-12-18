package com.facebook.memory.ion;

import X.C09170dP;

/* loaded from: classes4.dex */
public class IonMemory {
    public static native synchronized boolean allocate(int i);

    public static native synchronized boolean freeAllPreviousAllocations();

    public static native synchronized void listIonHeaps();

    static {
        C09170dP.A0C("ionmemory");
    }
}
