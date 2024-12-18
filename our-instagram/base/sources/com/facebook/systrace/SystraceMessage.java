package com.facebook.systrace;

import X.AbstractC09720ep;
import X.C09710eo;
import X.C19520xc;
import X.InterfaceC09730eq;

/* loaded from: classes.dex */
public abstract class SystraceMessage {
    public static final AbstractC09720ep A02 = new Object();
    public static final ThreadLocal A03 = new ThreadLocal() { // from class: X.0en
        @Override // java.lang.ThreadLocal
        public final /* bridge */ /* synthetic */ Object initialValue() {
            return new C19520xc();
        }
    };
    public static final InterfaceC09730eq A00 = new Object();
    public static final InterfaceC09730eq A01 = new Object();

    public static AbstractC09720ep A00(InterfaceC09730eq interfaceC09730eq, String str, long j) {
        if (!Systrace.A0E(j)) {
            return A02;
        }
        C19520xc c19520xc = (C19520xc) A03.get();
        c19520xc.A00 = j;
        c19520xc.A02 = interfaceC09730eq;
        c19520xc.A03 = str;
        C09710eo c09710eo = c19520xc.A01;
        for (int i = 0; i < c09710eo.A00; i++) {
            c09710eo.A01[i] = null;
        }
        c09710eo.A00 = 0;
        return c19520xc;
    }
}
