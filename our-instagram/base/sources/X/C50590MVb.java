package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.MVb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50590MVb implements InterfaceC13000lm {
    public C55209OeS A00;
    public final Object A01;
    public final UserSession A02;
    public volatile HashMap A03;

    public C50590MVb(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A03 = AbstractC166987dD.A1G();
        this.A01 = new Object();
    }

    public final HashMap A00() {
        HashMap hashMap;
        synchronized (this.A01) {
            hashMap = this.A03;
        }
        return hashMap;
    }

    public final void A01(C38663Gz4 c38663Gz4) {
        synchronized (this.A01) {
            HashMap hashMap = this.A03;
            Integer valueOf = Integer.valueOf(c38663Gz4.A01);
            if (hashMap.containsKey(valueOf)) {
                AbstractC166987dD.A1T(C18950wb.A01, "ClipsMidcardCache: Trying to cache duplicated midcard at the same position", 817892914);
            }
            this.A03.put(valueOf, c38663Gz4);
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A03 = AbstractC166987dD.A1G();
    }
}
