package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.AoC, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24189AoC implements BDV {
    public final int A00;
    public final UserSession A01;
    public final C22979ABd A02;
    public final HashMap A03;
    public final HashMap A04;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r0 != null) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.BDV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC197718oi C6s(X.C5NJ r7, long r8, long r10) {
        /*
            r6 = this;
            r1 = 0
            java.util.HashMap r0 = r6.A03
            java.lang.Object r3 = r0.get(r7)
            X.A7j r3 = (X.C22889A7j) r3
            r0 = 0
            if (r3 == 0) goto L50
            X.ABd r0 = r6.A02
            android.graphics.drawable.Drawable r5 = r0.A00(r7)
            android.graphics.Bitmap r2 = r3.A01
            r2.eraseColor(r1)
            boolean r0 = r5 instanceof X.C5RQ
            if (r0 == 0) goto L25
            r4 = r5
            X.5RQ r4 = (X.C5RQ) r4
            if (r4 == 0) goto L25
            int r1 = (int) r8
            int r0 = (int) r10
            r4.EUp(r1, r0)
        L25:
            boolean r1 = r5 instanceof X.C5RM
            if (r1 == 0) goto L31
            r0 = r5
            X.5RM r0 = (X.C5RM) r0
            if (r0 == 0) goto L31
            r0.A09()
        L31:
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r2)
            r5.draw(r0)
            if (r1 == 0) goto L51
            X.5RM r5 = (X.C5RM) r5
            android.graphics.drawable.Drawable r1 = r5.A0A
            boolean r0 = r1 instanceof X.BBE
            if (r0 == 0) goto L51
            if (r1 == 0) goto L51
            r1 = 1
            java.util.HashMap r0 = r6.A04
            java.lang.Object r0 = r0.get(r7)
            X.8oi r0 = (X.InterfaceC197718oi) r0
            if (r0 == 0) goto L52
        L50:
            return r0
        L51:
            r1 = 0
        L52:
            int r0 = r6.A00
            X.8oi r2 = X.C209089Mq.A02(r2, r0)
            r3.A00 = r2
            if (r1 == 0) goto L66
            java.util.HashMap r1 = r6.A04
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.filterkit.surface.InputSurface"
            X.C14360o3.A0C(r2, r0)
            r1.put(r7, r2)
        L66:
            X.8oi r0 = r3.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24189AoC.C6s(X.5NJ, long, long):X.8oi");
    }

    @Override // X.BDV
    public final void A8j(C5NJ c5nj) {
        try {
            UserSession userSession = this.A01;
            AbstractC166987dD.A0t(userSession).A07();
            this.A03.put(c5nj, new C22889A7j(this.A02.A00(c5nj)));
            AbstractC166987dD.A0t(userSession).A08();
        } catch (Exception e) {
            AbstractC166987dD.A0t(this.A01).A06();
            AbstractC167017dG.A1J(C18950wb.A01, "StickerTextureProviderfailed to render sticker", e, 817900213);
            throw e;
        }
    }

    @Override // X.BDV
    public final void cleanup() {
        HashMap hashMap = this.A03;
        Iterator A0t = AbstractC167017dG.A0t(hashMap);
        while (A0t.hasNext()) {
            ((C22889A7j) A0t.next()).A01.recycle();
        }
        hashMap.clear();
    }

    public C24189AoC(UserSession userSession, C22979ABd c22979ABd, int i) {
        AbstractC167017dG.A1P(userSession, c22979ABd);
        this.A01 = userSession;
        this.A02 = c22979ABd;
        this.A00 = i;
        this.A03 = AbstractC166987dD.A1G();
        this.A04 = AbstractC166987dD.A1G();
    }
}
