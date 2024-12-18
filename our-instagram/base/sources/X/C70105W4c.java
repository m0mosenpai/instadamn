package X;

import android.transition.Scene;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.W4c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70105W4c {
    public static final /* synthetic */ C0YR[] A07 = {new AnonymousClass013(C70105W4c.class, "headerExpanded", "getHeaderExpanded()Z", 0)};
    public Scene A00;
    public Scene A01;
    public ViewGroup A02;
    public boolean A03;
    public final UserSession A04;
    public final Hashtag A05;
    public final InterfaceC16530ry A06;

    public C70105W4c(UserSession userSession, Hashtag hashtag) {
        AbstractC167007dF.A1D(userSession, 1, hashtag);
        this.A04 = userSession;
        this.A05 = hashtag;
        this.A03 = true;
        this.A06 = new X6H(7, this, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (X.C18U.A06(r2, r3, 2342159783789990540L) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.EnumC68206VFy r6) {
        /*
            r5 = this;
            android.view.ViewGroup r4 = r5.A02
            if (r4 != 0) goto Le
            java.lang.String r0 = "useHashatagViewGroup"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Le:
            boolean r0 = r5.A03
            if (r0 != 0) goto L3d
            X.VFy r0 = X.EnumC68206VFy.A05
            if (r6 == r0) goto L38
            X.VFy r0 = X.EnumC68206VFy.A08
            if (r6 == r0) goto L1e
            X.VFy r0 = X.EnumC68206VFy.A0A
            if (r6 != r0) goto L3d
        L1e:
            com.instagram.common.session.UserSession r3 = r5.A04
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 2342159783789925003(0x208105ea0001128b, double:4.062850994486333E-152)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L3d
            r0 = 2342159783789990540(0x208105ea0002128c, double:4.062850994541903E-152)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L3d
        L38:
            r0 = 0
        L39:
            r4.setVisibility(r0)
            return
        L3d:
            r0 = 8
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70105W4c.A00(X.VFy):void");
    }
}
