package X;

import android.graphics.Path;
import java.util.Iterator;

/* renamed from: X.AeB, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23676AeB implements InterfaceC25177BCa {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C202728xq A01;
    public final /* synthetic */ C8NW A02;
    public final /* synthetic */ C191048d0 A03;
    public final /* synthetic */ boolean A04;

    @Override // X.InterfaceC25177BCa
    public final void DZL() {
    }

    public C23676AeB(C202728xq c202728xq, C8NW c8nw, C191048d0 c191048d0, int i, boolean z) {
        this.A03 = c191048d0;
        this.A04 = z;
        this.A02 = c8nw;
        this.A01 = c202728xq;
        this.A00 = i;
    }

    @Override // X.InterfaceC25177BCa
    public final void DQ0() {
        Object obj;
        C191048d0 c191048d0 = this.A03;
        c191048d0.EFh(this);
        if (this.A04) {
            C186238Nr c186238Nr = (C186238Nr) this.A02.A1t.getValue();
            C202728xq c202728xq = this.A01;
            Path A03 = c202728xq.A03();
            C8OJ c8oj = c186238Nr.A00;
            Iterator it = c8oj.A04.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((C37669Gi2) obj).A00 == c8oj.A00) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C37669Gi2 c37669Gi2 = (C37669Gi2) obj;
            if (c37669Gi2 != null) {
                c37669Gi2.A02 = A03;
            }
            Path path = c202728xq.A03;
            if (path == null) {
                path = c202728xq.A03();
            }
            c191048d0.A01.set(path);
            c191048d0.A01.computeBounds(c191048d0.A0D, false);
            c191048d0.invalidateSelf();
        }
        C8NW c8nw = this.A02;
        C186238Nr.A01((C186238Nr) c8nw.A1t.getValue(), this.A00);
        c8nw.A1l.A0k(c191048d0);
    }
}
