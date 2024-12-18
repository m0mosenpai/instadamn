package androidx.compose.foundation.gestures;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25235BEs;
import X.AbstractC25236BEt;
import X.BZW;
import X.C14360o3;
import X.C58J;
import X.C58N;
import X.C5XO;
import X.C6M3;
import X.DJ8;
import X.InterfaceC16610sE;
import X.InterfaceC16660sJ;
import X.InterfaceC30902DiF;

/* loaded from: classes5.dex */
public final class DraggableElement extends C58N {
    public static final InterfaceC16660sJ A07 = DJ8.A00;
    public final InterfaceC30902DiF A00;
    public final C6M3 A01;
    public final C5XO A02;
    public final InterfaceC16610sE A03;
    public final InterfaceC16610sE A04;
    public final boolean A05;
    public final boolean A06;

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        boolean z;
        BZW bzw = (BZW) c58j;
        InterfaceC30902DiF interfaceC30902DiF = this.A00;
        InterfaceC16660sJ interfaceC16660sJ = A07;
        C6M3 c6m3 = this.A01;
        boolean z2 = this.A05;
        C5XO c5xo = this.A02;
        boolean z3 = this.A06;
        InterfaceC16610sE interfaceC16610sE = this.A03;
        InterfaceC16610sE interfaceC16610sE2 = this.A04;
        if (!C14360o3.A0K(bzw.A00, interfaceC30902DiF)) {
            bzw.A00 = interfaceC30902DiF;
            z = true;
        } else {
            z = false;
        }
        if (bzw.A01 != c6m3) {
            bzw.A01 = c6m3;
            z = true;
        }
        bzw.A02 = interfaceC16610sE;
        bzw.A03 = interfaceC16610sE2;
        bzw.A04 = z3;
        bzw.A0L(c6m3, c5xo, interfaceC16660sJ, z2, z);
    }

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                DraggableElement draggableElement = (DraggableElement) obj;
                if (!C14360o3.A0K(this.A00, draggableElement.A00) || this.A01 != draggableElement.A01 || this.A05 != draggableElement.A05 || !C14360o3.A0K(this.A02, draggableElement.A02) || this.A06 != draggableElement.A06 || !C14360o3.A0K(this.A03, draggableElement.A03) || !C14360o3.A0K(this.A04, draggableElement.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.gestures.DragGestureNode, X.BZW, X.58J] */
    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        InterfaceC30902DiF interfaceC30902DiF = this.A00;
        InterfaceC16660sJ interfaceC16660sJ = A07;
        C6M3 c6m3 = this.A01;
        boolean z = this.A05;
        C5XO c5xo = this.A02;
        boolean z2 = this.A06;
        InterfaceC16610sE interfaceC16610sE = this.A03;
        InterfaceC16610sE interfaceC16610sE2 = this.A04;
        ?? dragGestureNode = new DragGestureNode(c6m3, c5xo, interfaceC16660sJ, z);
        dragGestureNode.A00 = interfaceC30902DiF;
        dragGestureNode.A01 = c6m3;
        dragGestureNode.A04 = z2;
        dragGestureNode.A02 = interfaceC16610sE;
        dragGestureNode.A03 = interfaceC16610sE2;
        return dragGestureNode;
    }

    @Override // X.C58N
    public final int hashCode() {
        return AbstractC25236BEt.A05(this.A04, AbstractC166997dE.A0J(this.A03, AbstractC167007dF.A0D(this.A06, (AbstractC167007dF.A0D(this.A05, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A00))) + AbstractC25235BEs.A06(this.A02)) * 31)));
    }

    public DraggableElement(InterfaceC30902DiF interfaceC30902DiF, C6M3 c6m3, C5XO c5xo, InterfaceC16610sE interfaceC16610sE, InterfaceC16610sE interfaceC16610sE2, boolean z, boolean z2) {
        this.A00 = interfaceC30902DiF;
        this.A01 = c6m3;
        this.A05 = z;
        this.A02 = c5xo;
        this.A06 = z2;
        this.A03 = interfaceC16610sE;
        this.A04 = interfaceC16610sE2;
    }
}
