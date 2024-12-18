package X;

import com.facebook.browser.lite.BrowserLiteFragment;

/* renamed from: X.Abd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23523Abd implements C2n2 {
    public final /* synthetic */ C172707mf A00;

    public C23523Abd(C172707mf c172707mf) {
        this.A00 = c172707mf;
    }

    @Override // X.C2n2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        QF4 A05;
        String A0Q = AbstractC167027dH.A0Q(obj);
        QF6 C9a = this.A00.C9a();
        if (C9a == null || (A05 = BrowserLiteFragment.A05(C9a)) == null) {
            return null;
        }
        return A05.A04(A0Q).A01;
    }
}
