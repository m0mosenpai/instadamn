package X;

/* renamed from: X.Am5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24066Am5 implements InterfaceC57997Pnh {
    public final int A00;
    public final Object A01;

    public C24066Am5(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC57997Pnh
    public final void Dd6(C54845OMq c54845OMq) {
        Boolean bool;
        if (this.A00 != 0) {
            C14360o3.A0B(c54845OMq, 0);
            C8JN c8jn = (C8JN) this.A01;
            AbstractC55198Oe5 abstractC55198Oe5 = c54845OMq.A09;
            if (abstractC55198Oe5 != null) {
                bool = Boolean.valueOf(abstractC55198Oe5.A0C);
            } else {
                bool = null;
            }
            C8JN.A01(c54845OMq, c8jn, bool, false, false);
            return;
        }
        C14360o3.A0B(c54845OMq, 0);
        ((C207549Gh) this.A01).A00 = c54845OMq;
    }
}
