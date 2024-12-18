package X;

import java.util.Collections;

/* renamed from: X.WkA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70907WkA implements InterfaceC17700u7 {
    public final /* synthetic */ C70810WhQ A00;

    public C70907WkA(C70810WhQ c70810WhQ) {
        this.A00 = c70810WhQ;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.Vu8] */
    @Override // X.InterfaceC17700u7
    public final void E28(int i) {
        C70810WhQ c70810WhQ = this.A00;
        C69018Vfu c69018Vfu = c70810WhQ.A01;
        if (c69018Vfu != null) {
            C69018Vfu c69018Vfu2 = new C69018Vfu();
            for (C69713Vu8 c69713Vu8 : Collections.unmodifiableList(c69018Vfu.A01)) {
                ?? obj = new Object();
                obj.A05 = c69713Vu8.A05;
                obj.A04 = c69713Vu8.A04;
                obj.A03 = c69713Vu8.A03;
                obj.A00 = c69713Vu8.A00;
                obj.A02 = c69713Vu8.A02;
                obj.A01 = c69713Vu8.A01;
                obj.A06 = c69713Vu8.A06;
                c69018Vfu2.A01.add(obj);
            }
            c69018Vfu2.A00 = c70810WhQ.A01.A00;
            c70810WhQ.A04.ATO(new V6S(c69018Vfu2, this));
        }
    }
}
