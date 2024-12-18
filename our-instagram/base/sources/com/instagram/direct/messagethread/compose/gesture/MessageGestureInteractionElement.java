package com.instagram.direct.messagethread.compose.gesture;

import X.C14360o3;
import X.C58J;
import X.C58N;
import X.C5ED;
import X.L3T;

/* loaded from: classes5.dex */
public final class MessageGestureInteractionElement extends C58N {
    public final L3T A00;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof MessageGestureInteractionElement) && C14360o3.A0K(this.A00, ((MessageGestureInteractionElement) obj).A00));
    }

    @Override // X.C58N
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        return new C5ED(this.A00);
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        C5ED c5ed = (C5ED) c58j;
        C14360o3.A0B(c5ed, 0);
        L3T l3t = this.A00;
        C14360o3.A0B(l3t, 0);
        c5ed.A00 = l3t;
    }

    public MessageGestureInteractionElement(L3T l3t) {
        this.A00 = l3t;
    }
}
