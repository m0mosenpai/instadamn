package X;

/* renamed from: X.3zN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89813zN extends AbstractC89823zO {
    public final void A01(float f) {
        A04(new C89853zR(f));
    }

    public final void A02(float f) {
        A05(new C89853zR(f));
    }

    public final void A04(InterfaceC89863zS interfaceC89863zS) {
        C89843zQ c89843zQ = this.A01;
        if (c89843zQ != null && c89843zQ.A00 == C05F.A01) {
            this.A03 = interfaceC89863zS;
            return;
        }
        throw new RuntimeException("Must specify a single property using #animate() before specifying an appearFrom value!");
    }

    public final void A05(InterfaceC89863zS interfaceC89863zS) {
        C89843zQ c89843zQ = this.A01;
        if (c89843zQ != null && c89843zQ.A00 == C05F.A01) {
            this.A04 = interfaceC89863zS;
            return;
        }
        throw new RuntimeException("Must specify a single property using #animate() before specifying an disappearTo value!");
    }

    public final void A03(InterfaceC79483gv interfaceC79483gv) {
        A00();
        this.A01 = new C89843zQ(C05F.A01, interfaceC79483gv);
    }

    public final void A06(InterfaceC79483gv... interfaceC79483gvArr) {
        A00();
        this.A01 = new C89843zQ(C05F.A00, interfaceC79483gvArr);
    }
}
