package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LJ4 {
    public final Activity A00;
    public final UserSession A01;
    public final LLR A02;
    public final InterfaceC09390do A03;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (A01() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r9.A01, 2342164731594876678L) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
    
        if (X.AbstractC167017dG.A1b(r3, r3.A1M, X.C23031Ai.A8c, 497) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a1, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r9.A01, 2342164731594876678L) == false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C50634MWv A02(java.lang.Integer r10) {
        /*
            r9 = this;
            r5 = 0
            X.C14360o3.A0B(r10, r5)
            android.app.Activity r1 = r9.A00
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            X.7lh r7 = X.AbstractC23451Ch.A00(r1, r0)
            X.C14360o3.A07(r7)
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            X.7lh r8 = X.AbstractC23451Ch.A00(r1, r0)
            X.C14360o3.A07(r8)
            boolean r0 = r1.isFinishing()
            if (r0 == 0) goto L26
            r1 = 7
            r0 = 5
            X.MWv r3 = new X.MWv
            r3.<init>(r1, r0, r5, r5)
            return r3
        L26:
            int r1 = r10.intValue()
            r4 = 0
            r2 = 1
            if (r1 == r5) goto Lb8
            r0 = 3
            if (r1 == r0) goto Lab
            if (r1 == r2) goto L5b
            r0 = 2
            if (r1 != r0) goto La6
            X.7lh r1 = X.EnumC172127lh.A05
            if (r7 == r1) goto L3c
            if (r8 != r1) goto L3d
        L3c:
            r5 = 1
        L3d:
            if (r7 == r1) goto L48
            if (r8 == r1) goto L48
            boolean r0 = r9.A01()
            r6 = 1
            if (r0 != 0) goto L49
        L48:
            r6 = 0
        L49:
            boolean r0 = r9.A01()
            if (r0 == 0) goto L53
            if (r8 != r1) goto L54
            if (r7 == r1) goto L54
        L53:
            r4 = 1
        L54:
            r0 = 5
            X.MWv r3 = new X.MWv
            r3.<init>(r5, r6, r4, r0)
            return r3
        L5b:
            X.7lh r6 = X.EnumC172127lh.A05
            if (r7 == r6) goto L70
            if (r8 == r6) goto L70
            com.instagram.common.session.UserSession r3 = r9.A01
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 2342164731594876678(0x20810a6a00292706, double:4.067046313374838E-152)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L71
        L70:
            r5 = 1
        L71:
            if (r7 == r6) goto La4
            if (r8 == r6) goto La4
            boolean r0 = r9.A01()
            if (r0 != 0) goto L8d
            X.0do r0 = r9.A03
            X.1Ai r3 = X.AbstractC25226BEj.A10(r0)
            X.0ry r2 = r3.A1M
            X.0YR[] r1 = X.C23031Ai.A8c
            r0 = 497(0x1f1, float:6.96E-43)
            boolean r0 = X.AbstractC167017dG.A1b(r3, r2, r1, r0)
            if (r0 != 0) goto La4
        L8d:
            r6 = 1
        L8e:
            boolean r0 = r9.A01()
            if (r0 != 0) goto L54
            com.instagram.common.session.UserSession r3 = r9.A01
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 2342164731594876678(0x20810a6a00292706, double:4.067046313374838E-152)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L54
            goto L53
        La4:
            r6 = 0
            goto L8e
        La6:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lab:
            X.7lh r0 = X.EnumC172127lh.A05
            boolean r1 = X.AbstractC167007dF.A1X(r7, r0)
            r0 = 5
            X.MWv r3 = new X.MWv
            r3.<init>(r1, r5, r2, r0)
            return r3
        Lb8:
            X.7lh r0 = X.EnumC172127lh.A05
            if (r7 == r0) goto Lc4
            r2 = 0
            boolean r0 = r9.A01()
            if (r0 == 0) goto Lc4
            r4 = 1
        Lc4:
            boolean r0 = r9.A01()
            r1 = r0 ^ 1
            r0 = 5
            X.MWv r3 = new X.MWv
            r3.<init>(r2, r4, r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LJ4.A02(java.lang.Integer):X.MWv");
    }

    public static final void A00(LJ4 lj4, InterfaceC16820sZ interfaceC16820sZ) {
        UserSession userSession = lj4.A01;
        if (C18U.A06(C06090Tz.A05, userSession, 36330411097408358L)) {
            C1VW c1vw = C1VW.A00;
            if (c1vw != null) {
                c1vw.requestLocationPermission(lj4.A00, userSession, new C70966WlD(interfaceC16820sZ, 2), true, "FriendMapPermissionManager", VDJ.A08);
                return;
            }
            return;
        }
        AbstractC43592JPx.A1C(lj4.A00, new C44325JiI(interfaceC16820sZ, 6), "android.permission.ACCESS_FINE_LOCATION");
    }

    private final boolean A01() {
        Activity activity = this.A00;
        EnumC172127lh A00 = AbstractC23451Ch.A00(activity, "android.permission.ACCESS_FINE_LOCATION");
        C14360o3.A07(A00);
        if (!A00.A00 && AbstractC23451Ch.A05(activity, "android.permission.ACCESS_FINE_LOCATION")) {
            return true;
        }
        return false;
    }

    public final void A03() {
        Activity activity = this.A00;
        if (!activity.isFinishing()) {
            WGH.A06(activity, null);
        }
    }

    public final boolean A04() {
        EnumC172127lh A00 = AbstractC23451Ch.A00(this.A00, "android.permission.ACCESS_COARSE_LOCATION");
        C14360o3.A07(A00);
        return AbstractC167007dF.A1X(A00, EnumC172127lh.A05);
    }

    public final boolean A05() {
        EnumC172127lh A00 = AbstractC23451Ch.A00(this.A00, "android.permission.ACCESS_FINE_LOCATION");
        C14360o3.A07(A00);
        return AbstractC167007dF.A1X(A00, EnumC172127lh.A05);
    }

    public LJ4(Activity activity, UserSession userSession, LLR llr) {
        AbstractC167017dG.A1R(userSession, llr);
        this.A00 = activity;
        this.A01 = userSession;
        this.A02 = llr;
        this.A03 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50158MDl(this, 19));
    }
}
