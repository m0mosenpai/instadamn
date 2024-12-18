package com.facebook.iabeventlogging.model;

import X.AbstractC167027dH;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.EnumC61218RhI;

/* loaded from: classes10.dex */
public class IABEmptyEvent extends IABEvent {
    public IABEmptyEvent() {
        super(EnumC61218RhI.EMPTY, "", -1L, -1L);
    }

    public final String toString() {
        StringBuilder A0s = AbstractC58318PtA.A0s("IABEmptyEvent{");
        AbstractC58321PtD.A1I(this, "type=", A0s);
        AbstractC58319PtB.A18(this.A01, A0s);
        AbstractC58318PtA.A1L(this, A0s);
        return AbstractC167027dH.A0R(A0s);
    }
}
