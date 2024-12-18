package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;

/* renamed from: X.6xU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C154796xU {
    public final Handler A00;
    public final UserSession A01;
    public final C1GL A02;
    public final C154806xV A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C154796xU(Context context, AbstractC018607g abstractC018607g, UserSession userSession) {
        this(context, abstractC018607g, userSession, null, false);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(abstractC018607g, 3);
    }

    public final Integer A01(AbstractC154286wd abstractC154286wd, String str, long j, boolean z) {
        C14360o3.A0B(str, 0);
        C154806xV c154806xV = this.A03;
        if (c154806xV.A03 != C05F.A00) {
            return C1P2.A00(this.A01).A05(new C152456tY(null, null, abstractC154286wd, c154806xV), this.A02, str, j, z, false);
        }
        return C05F.A0C;
    }

    public final Integer A02(AbstractC154286wd abstractC154286wd, String str, long j, boolean z, boolean z2) {
        C14360o3.A0B(str, 0);
        C154806xV c154806xV = this.A03;
        if (c154806xV.A03 != C05F.A00) {
            return C1I9.A00(this.A01).A05(new C154196wU(null, abstractC154286wd, c154806xV), this.A02, str, j, z, z2, false);
        }
        return C05F.A0C;
    }

    public final void A03(C1ON c1on, AbstractC154286wd abstractC154286wd) {
        C14360o3.A0B(c1on, 0);
        C154806xV c154806xV = this.A03;
        if (c154806xV.A03 != C05F.A00) {
            c1on.A00 = new C152456tY(c1on, null, abstractC154286wd, c154806xV);
            this.A02.schedule(c1on);
        }
    }

    public final void A04(C24531Hw c24531Hw, AbstractC154286wd abstractC154286wd) {
        C14360o3.A0B(c24531Hw, 0);
        C154806xV c154806xV = this.A03;
        if (c154806xV.A03 != C05F.A00) {
            c24531Hw.A02(new C154196wU(c24531Hw, abstractC154286wd, c154806xV));
            this.A02.schedule(c24531Hw);
        }
    }

    public final boolean A06() {
        return A07(0, 0, true, false);
    }

    public final C154796xU A00(String str) {
        UserSession userSession = this.A01;
        C1GL c1gl = this.A02;
        Handler handler = this.A00;
        C154806xV c154806xV = this.A03;
        return new C154796xU(handler, userSession, c1gl, str, c154806xV.A05, c154806xV.A0A);
    }

    public final boolean A05() {
        C154806xV c154806xV = this.A03;
        if (AbstractC13670mt.A0B(c154806xV.A07) && AbstractC13670mt.A0B(c154806xV.A09)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r1.longValue()) > java.util.concurrent.TimeUnit.SECONDS.toMillis(r8)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        if (r1 != X.C05F.A01) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A07(int r7, int r8, boolean r9, boolean r10) {
        /*
            r6 = this;
            if (r10 != 0) goto L56
            com.instagram.common.session.UserSession r3 = r6.A01
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36323307221429399(0x810bdb00002c97, double:3.0343439768257547E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L56
            X.6xV r5 = r6.A03
            java.lang.Integer r2 = r5.A03
            java.lang.Integer r0 = X.C05F.A0C
            if (r2 == r0) goto L3d
            if (r7 <= 0) goto L54
            if (r8 <= 0) goto L54
            java.lang.Long r1 = r5.A04
            java.lang.Integer r0 = X.C05F.A01
            if (r2 != r0) goto L54
            int r0 = r5.A00
            if (r0 >= r7) goto L54
            if (r1 == 0) goto L54
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r1.longValue()
            long r3 = r3 - r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = (long) r8
            long r1 = r2.toMillis(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L54
        L3d:
            boolean r0 = r6.A05()
            if (r0 != 0) goto L4f
            if (r9 != 0) goto L54
            java.lang.String r0 = r5.A06
            boolean r0 = X.AbstractC13670mt.A0B(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L54
        L4f:
            boolean r1 = r5.A0A
            r0 = 1
            if (r1 != 0) goto L55
        L54:
            r0 = 0
        L55:
            return r0
        L56:
            X.6xV r5 = r6.A03
            java.lang.Integer r1 = r5.A03
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 == r0) goto L3d
            java.lang.Integer r0 = X.C05F.A01
            if (r1 != r0) goto L54
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C154796xU.A07(int, int, boolean, boolean):boolean");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C154796xU(Context context, AbstractC018607g abstractC018607g, UserSession userSession, String str) {
        this(context, abstractC018607g, userSession, str, str != null);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(abstractC018607g, 3);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.6xV, java.lang.Object] */
    public C154796xU(Handler handler, UserSession userSession, C1GL c1gl, String str, String str2, boolean z) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = c1gl;
        this.A00 = handler;
        ?? obj = new Object();
        this.A03 = obj;
        obj.A0A = z;
        obj.A07 = str;
        obj.A05 = str2;
        if (str != null) {
            obj.A03 = C05F.A0C;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C154796xU(Context context, AbstractC018607g abstractC018607g, UserSession userSession, String str, boolean z) {
        this(new Handler(Looper.getMainLooper()), userSession, new C61972ry(context, abstractC018607g, null), str, null, z);
        C14360o3.A0B(userSession, 2);
    }
}
