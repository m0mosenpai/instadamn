package X;

import java.lang.ref.Reference;

/* renamed from: X.J4i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43119J4i implements Runnable {
    public final /* synthetic */ C41132IIx A00;
    public final /* synthetic */ C81233js A01;

    public RunnableC43119J4i(C41132IIx c41132IIx, C81233js c81233js) {
        this.A01 = c81233js;
        this.A00 = c41132IIx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C75113Zb c75113Zb;
        C81233js c81233js = this.A01;
        C41132IIx c41132IIx = this.A00;
        if (c81233js.A01.containsKey(c41132IIx.A03)) {
            C38321qM A0h = AbstractC25229BEm.A0h(c81233js.A00, AnonymousClass001.A0T(c41132IIx.A03, c41132IIx.A02.A00, '_'));
            if (A0h != null && !c41132IIx.A04) {
                A0h.A42(c41132IIx.A01.A00.intValue());
                A0h.A0C.ERm(c41132IIx.A00.A00);
                Reference reference = (Reference) c81233js.A02.get(A0h.A38());
                if (reference != null && (c75113Zb = (C75113Zb) reference.get()) != null) {
                    C75113Zb.A00(c75113Zb, 12);
                }
            }
        }
    }
}
