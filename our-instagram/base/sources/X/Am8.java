package X;

/* loaded from: classes4.dex */
public final class Am8 implements InterfaceC57997Pnh {
    public final /* synthetic */ C8JN A00;
    public final /* synthetic */ boolean A01;

    public Am8(C8JN c8jn, boolean z) {
        this.A00 = c8jn;
        this.A01 = z;
    }

    @Override // X.InterfaceC57997Pnh
    public final void Dd6(C54845OMq c54845OMq) {
        Boolean bool;
        C14360o3.A0B(c54845OMq, 0);
        C8JN c8jn = this.A00;
        if (c8jn.A03()) {
            c54845OMq.A05(EnumC223469td.A0J);
        }
        AbstractC55198Oe5 abstractC55198Oe5 = c54845OMq.A09;
        if (abstractC55198Oe5 != null) {
            bool = Boolean.valueOf(abstractC55198Oe5.A0C);
        } else {
            bool = null;
        }
        C8JN.A01(c54845OMq, c8jn, bool, false, this.A01);
    }
}
