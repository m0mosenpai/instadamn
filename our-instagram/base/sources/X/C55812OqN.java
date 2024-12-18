package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.OqN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55812OqN implements C2JL {
    public int A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.A00 = 0;
    }

    public C55812OqN(UserSession userSession, String str) {
        this.A01 = userSession;
        this.A02 = str;
    }

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        int i = this.A00;
        if (i < 7) {
            this.A00 = i + 1;
            AbstractC53861Nrp.A00(this, this.A01, this.A02);
        }
    }
}
