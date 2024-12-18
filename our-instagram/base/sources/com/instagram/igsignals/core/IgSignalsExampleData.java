package com.instagram.igsignals.core;

import X.AbstractC68612VXn;
import X.AbstractC73763Sg;
import X.C00O;
import X.C0w9;
import X.C3R9;
import X.C3SG;
import X.C5KX;
import X.C5KZ;
import X.C71739X0e;
import X.C71740X0f;
import X.C71741X0g;
import X.C71821X5z;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class IgSignalsExampleData {
    public static final C3R9[] A06;
    public static final Companion Companion = new Object();
    public final double A00;
    public final long A01;
    public final String A02;
    public final List A03;
    public final List A04;
    public final List A05;

    /* loaded from: classes11.dex */
    public final class Companion {
        public static final IgSignalsExampleData A00(String str) {
            C5KZ A00 = C5KX.A00(C71821X5z.A00, AbstractC73763Sg.A03);
            try {
                C3R9[] c3r9Arr = IgSignalsExampleData.A06;
                return (IgSignalsExampleData) A00.A00(str, C71739X0e.A00);
            } catch (IllegalStateException | Exception unused) {
                C0w9.A03("IgSignalsExample", "Corrupted example data");
                return null;
            }
        }

        public final C3R9 serializer() {
            return C71739X0e.A00;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.instagram.igsignals.core.IgSignalsExampleData$Companion] */
    static {
        C71740X0f c71740X0f = C71740X0f.A00;
        A06 = new C3R9[]{null, null, new C3SG(c71740X0f), null, new C3SG(c71740X0f), new C3SG(C71741X0g.A00)};
    }

    public /* synthetic */ IgSignalsExampleData(String str, List list, List list2, List list3, double d, int i, long j) {
        if (63 != (i & 63)) {
            AbstractC68612VXn.A00(C71739X0e.A01, i, 63);
            throw C00O.createAndThrow();
        }
        this.A02 = str;
        this.A00 = d;
        this.A03 = list;
        this.A01 = j;
        this.A04 = list2;
        this.A05 = list3;
    }

    public IgSignalsExampleData(String str, List list, List list2, List list3, double d, long j) {
        this.A02 = str;
        this.A00 = d;
        this.A03 = list;
        this.A01 = j;
        this.A04 = list2;
        this.A05 = list3;
    }
}
