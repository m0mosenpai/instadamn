package X;

import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* renamed from: X.83m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1815983m implements C5NL {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public User A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;

    @Override // X.C5NL
    public final /* synthetic */ List B6F() {
        return C16930sl.A00;
    }

    @Override // X.C5NL
    public final C5NG BlQ() {
        C5NG c5ng = new C5NG();
        c5ng.A01 = C5NH.A04;
        c5ng.A06 = Collections.singletonList("igtv_countdown_sticker_id");
        return c5ng;
    }

    @Override // X.C5NL
    public final Integer CBq() {
        return C05F.A06;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (r6.A1U().A02 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1815983m(com.instagram.common.session.UserSession r5, X.C38321qM r6, int r7, int r8) {
        /*
            r4 = this;
            r4.<init>()
            com.instagram.user.model.User r0 = r6.A2E(r5)
            r4.A04 = r0
            java.lang.String r0 = r6.A38()
            r4.A06 = r0
            X.4Vc r1 = r6.A1U()
            java.lang.String r0 = "IGTV media should have a video aspect ratio"
            X.C18C.A07(r1, r0)
            X.4Vc r0 = r6.A1U()
            r3 = 1
            if (r0 == 0) goto L28
            X.4Vc r0 = r6.A1U()
            boolean r1 = r0.A02
            r0 = 1
            if (r1 != 0) goto L29
        L28:
            r0 = 0
        L29:
            r4.A08 = r0
            X.4Vc r2 = r6.A1U()
            int r0 = r2.A01
            float r1 = (float) r0
            int r0 = r2.A00
            float r0 = (float) r0
            float r1 = r1 / r0
            r4.A00 = r1
            X.1rF r0 = r6.A0C
            java.lang.String r0 = r0.getTitle()
            if (r0 != 0) goto L67
            java.lang.String r0 = ""
        L42:
            r4.A05 = r0
            long r1 = r6.A1C()
            int r0 = (int) r1
            r4.A03 = r0
            r4.A01 = r8
            r4.A02 = r7
            X.1rF r0 = r6.A0C
            com.instagram.model.shopping.clips.IGTVShoppingInfoIntf r0 = r0.BGP()
            if (r0 != 0) goto L5e
            boolean r0 = r6.A53()
            if (r0 != 0) goto L5e
            r3 = 0
        L5e:
            r4.A09 = r3
            boolean r0 = r6.A4j()
            r4.A07 = r0
            return
        L67:
            X.1rF r0 = r6.A0C
            java.lang.String r0 = r0.getTitle()
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1815983m.<init>(com.instagram.common.session.UserSession, X.1qM, int, int):void");
    }

    public C1815983m() {
    }
}
