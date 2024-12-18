package com.meta.compose.material.bottomsheet;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.C14360o3;
import X.C25753BZs;
import X.C58J;
import X.C58N;
import X.C6M3;
import X.InterfaceC16620sF;

/* loaded from: classes5.dex */
public final class DraggableAnchorsElement extends C58N {
    public final C6M3 A00;
    public final AnchoredDraggableState A01;
    public final InterfaceC16620sF A02;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.meta.compose.material.bottomsheet.DraggableAnchorsElement<*>");
            DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
            if (!C14360o3.A0K(this.A01, draggableAnchorsElement.A01) || !C14360o3.A0K(this.A02, draggableAnchorsElement.A02) || this.A00 != draggableAnchorsElement.A00) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.BZs, X.58J] */
    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        AnchoredDraggableState anchoredDraggableState = this.A01;
        InterfaceC16620sF interfaceC16620sF = this.A02;
        C6M3 c6m3 = this.A00;
        AbstractC167027dH.A13(anchoredDraggableState, interfaceC16620sF, c6m3);
        ?? c58j = new C58J();
        c58j.A01 = anchoredDraggableState;
        c58j.A02 = interfaceC16620sF;
        c58j.A00 = c6m3;
        return c58j;
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        C25753BZs c25753BZs = (C25753BZs) c58j;
        C14360o3.A0B(c25753BZs, 0);
        AnchoredDraggableState anchoredDraggableState = this.A01;
        C14360o3.A0B(anchoredDraggableState, 0);
        c25753BZs.A01 = anchoredDraggableState;
        InterfaceC16620sF interfaceC16620sF = this.A02;
        C14360o3.A0B(interfaceC16620sF, 0);
        c25753BZs.A02 = interfaceC16620sF;
        C6M3 c6m3 = this.A00;
        C14360o3.A0B(c6m3, 0);
        c25753BZs.A00 = c6m3;
    }

    @Override // X.C58N
    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A01)));
    }

    public DraggableAnchorsElement(C6M3 c6m3, AnchoredDraggableState anchoredDraggableState, InterfaceC16620sF interfaceC16620sF) {
        this.A01 = anchoredDraggableState;
        this.A02 = interfaceC16620sF;
        this.A00 = c6m3;
    }
}
