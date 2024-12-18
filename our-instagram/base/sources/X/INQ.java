package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.UUID;

/* loaded from: classes7.dex */
public final class INQ {
    public InterfaceC74623Ww A00;
    public C5TA A01;
    public final Context A02;
    public final UserSession A03;
    public final InterfaceC60442pS A04;
    public final JGX A05;
    public final C6C3 A06;
    public final C6C3 A07;
    public final boolean A08;

    public INQ(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, JGX jgx) {
        UUID.randomUUID().toString();
        this.A07 = new C39442HbU(this, 0);
        this.A06 = new C39442HbU(this, 1);
        this.A02 = context;
        this.A03 = userSession;
        this.A04 = interfaceC60442pS;
        this.A08 = true;
        this.A05 = jgx;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (r0.A0D() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r1 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.C38321qM r19) {
        /*
            r18 = this;
            r11 = 0
            X.4S7 r6 = new X.4S7
            r4 = r19
            r6.<init>(r4, r11)
            r2 = r18
            X.5TA r0 = r2.A01
            if (r0 == 0) goto L15
            boolean r1 = r0.A0D()
            r0 = 1
            if (r1 != 0) goto L16
        L15:
            r0 = 0
        L16:
            r6.A00 = r0
            X.5TA r0 = r2.A01
            if (r0 != 0) goto L3e
            boolean r0 = r2.A08
            r3 = 0
            if (r0 == 0) goto L69
            com.instagram.common.session.UserSession r1 = r2.A03
            X.2pS r0 = r2.A04
            X.30O r15 = new X.30O
            r15.<init>(r1, r0, r3, r11)
        L2a:
            android.content.Context r13 = r2.A02
            com.instagram.common.session.UserSession r14 = r2.A03
            X.6C3 r0 = r2.A07
            java.lang.String r17 = "instagram_shopping_pdp"
            X.5TA r12 = new X.5TA
            r16 = r0
            r12.<init>(r13, r14, r15, r16, r17)
            r2.A01 = r12
            r12.A01()
        L3e:
            X.5TA r3 = r2.A01
            java.lang.String r7 = r4.A0M
            X.3a3 r5 = r4.A2H()
            X.3Ww r4 = r2.A00
            if (r4 != 0) goto L53
            android.content.Context r0 = r2.A02
            com.instagram.ui.widget.framelayout.MediaFrameLayout r4 = new com.instagram.ui.widget.framelayout.MediaFrameLayout
            r4.<init>(r0)
            r2.A00 = r4
        L53:
            X.5TA r0 = r2.A01
            if (r0 == 0) goto L5f
            boolean r0 = r0.A0D()
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L60
        L5f:
            r9 = 0
        L60:
            r10 = -1
            r12 = 1
            java.lang.String r8 = "instagram_shopping_pdp"
            r13 = r12
            r3.A08(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L69:
            r15 = r3
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.INQ.A00(X.1qM):void");
    }

    public final void A01(InterfaceC74623Ww interfaceC74623Ww) {
        C5TA c5ta = this.A01;
        if (c5ta != null) {
            c5ta.A06(interfaceC74623Ww);
        }
    }

    public final void A02(String str) {
        C5TA c5ta = this.A01;
        if (c5ta != null) {
            c5ta.A0A(str);
            this.A01 = null;
            this.A00 = null;
        }
    }

    public final void A03(String str) {
        C5TA c5ta = this.A01;
        if (c5ta != null) {
            c5ta.A0C(str, true);
        }
    }
}
