package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7nY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C173207nY {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C8B7 A01;

    public C173207nY(C8B7 c8b7, int i) {
        this.A01 = c8b7;
        this.A00 = i;
    }

    public final void A00(Throwable th) {
        C8B7 c8b7 = this.A01;
        C05A c05a = c8b7.A04;
        if (!(c05a.getValue() instanceof C3NX)) {
            c05a.Egh(new C194848jk(C0eB.A00));
        }
        if (c8b7.A0A) {
            C05A c05a2 = c8b7.A06;
            if (!(c05a2.getValue() instanceof C3NX)) {
                c05a2.Egh(new C194848jk(C0eB.A00));
            }
        }
        UserSession userSession = c8b7.A03;
        int i = this.A00;
        String valueOf = String.valueOf(th);
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(valueOf, 2);
        C006802i.A0p.markerAnnotate(383656871, i, "error_reason", valueOf);
        AbstractC173097nN.A02(i, (short) 97);
        c8b7.A01 = false;
    }
}
