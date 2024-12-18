package X;

import android.webkit.RenderProcessGoneDetail;

/* renamed from: X.9Wt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211459Wt extends AbstractC62758SPp {
    @Override // X.AbstractC62758SPp
    public final void A06(QF6 qf6, String str) {
        A9E a9e = AbstractC23086AFs.A02;
        if (a9e != null && a9e.A00 == null) {
            a9e.A00 = Long.valueOf(System.currentTimeMillis());
        }
    }

    @Override // X.AbstractC62758SPp
    public final boolean A07(RenderProcessGoneDetail renderProcessGoneDetail, QF6 qf6) {
        AbstractC23086AFs.A00();
        return true;
    }
}
