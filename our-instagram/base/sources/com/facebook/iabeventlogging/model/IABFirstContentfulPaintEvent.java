package com.facebook.iabeventlogging.model;

import X.AbstractC167027dH;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.C14360o3;
import X.EnumC61218RhI;

/* loaded from: classes10.dex */
public final class IABFirstContentfulPaintEvent extends IABEvent {
    public final long A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IABFirstContentfulPaintEvent(String str, long j, long j2) {
        super(EnumC61218RhI.IAB_FIRST_CONTENTFUL_PAINT, str, j, j2);
        C14360o3.A0B(str, 1);
        this.A00 = j2;
    }

    public final String toString() {
        StringBuilder A0s = AbstractC58318PtA.A0s("IABFirstContentfulPaintEvent{");
        A0s.append(", iabSessionId='");
        AbstractC58319PtB.A1K(A0s, this.A03);
        A0s.append(", eventTs=");
        AbstractC58319PtB.A18(this.A01, A0s);
        A0s.append(this.A00);
        String A0R = AbstractC167027dH.A0R(A0s);
        C14360o3.A07(A0R);
        return A0R;
    }
}
