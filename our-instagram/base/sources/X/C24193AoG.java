package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.AoG, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24193AoG implements BDW {
    public AnonymousClass815 A00;
    public final UserSession A01;
    public final C22979ABd A02;
    public final HashMap A03;
    public final int A04;
    public final HashMap A05;

    @Override // X.BDW
    public final void A8j(C5NJ c5nj) {
        try {
            UserSession userSession = this.A01;
            AbstractC166987dD.A0t(userSession).A07();
            this.A03.put(c5nj, new C22890A7k(this.A02.A00(c5nj)));
            AbstractC166987dD.A0t(userSession).A08();
        } catch (Exception e) {
            AbstractC166987dD.A0t(this.A01).A06();
            AbstractC167017dG.A1J(C18950wb.A01, "StickerTextureProviderfailed to render sticker", e, 817900213);
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf  */
    @Override // X.BDW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC197718oi C6s(X.C5NJ r24, long r25, long r27) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24193AoG.C6s(X.5NJ, long, long):X.8oi");
    }

    @Override // X.BDW
    public final void cleanup() {
        HashMap hashMap = this.A03;
        Iterator A0t = AbstractC167017dG.A0t(hashMap);
        while (A0t.hasNext()) {
            ((C22890A7k) A0t.next()).A01.recycle();
        }
        hashMap.clear();
    }

    public C24193AoG(UserSession userSession, C22979ABd c22979ABd, int i) {
        AbstractC167017dG.A1P(userSession, c22979ABd);
        this.A01 = userSession;
        this.A02 = c22979ABd;
        this.A04 = i;
        this.A03 = AbstractC166987dD.A1G();
        this.A05 = AbstractC166987dD.A1G();
    }
}
