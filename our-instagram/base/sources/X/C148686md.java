package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.6md, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148686md {
    public final Context A00;
    public final UserSession A01;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (X.C18U.A06(r4, r9, 36322418163394784L) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (X.C18U.A06(r4, r9, 36322418163263710L) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (X.C18U.A06(r4, r9, 36322418163460321L) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A00() {
        /*
            r17 = this;
            r2 = r17
            com.instagram.common.session.UserSession r9 = r2.A01
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36317990052697863(0x810705000c1707, double:3.0309813779094113E-306)
            boolean r0 = X.C18U.A06(r4, r9, r0)
            if (r0 != 0) goto L1e
            r0 = 36322418163263710(0x810b0c000128de, double:3.033781732861823E-306)
            boolean r0 = X.C18U.A06(r4, r9, r0)
            r16 = 0
            if (r0 == 0) goto L20
        L1e:
            r16 = 1
        L20:
            r0 = 36317990052763400(0x810705000d1708, double:3.030981377950857E-306)
            boolean r0 = X.C18U.A06(r4, r9, r0)
            if (r0 != 0) goto L37
            r0 = 36322418163460321(0x810b0c000428e1, double:3.0337817329861606E-306)
            boolean r0 = X.C18U.A06(r4, r9, r0)
            r15 = 0
            if (r0 == 0) goto L38
        L37:
            r15 = 1
        L38:
            r0 = 36317990052828937(0x810705000e1709, double:3.030981377992303E-306)
            boolean r0 = X.C18U.A06(r4, r9, r0)
            if (r0 != 0) goto L4f
            r0 = 36322418163394784(0x810b0c000328e0, double:3.033781732944715E-306)
            boolean r0 = X.C18U.A06(r4, r9, r0)
            r14 = 0
            if (r0 == 0) goto L50
        L4f:
            r14 = 1
        L50:
            r0 = 36603893141017592(0x820b0c001113f8, double:3.2117876422021395E-306)
            long r12 = X.C18U.A01(r4, r9, r0)
            r0 = 36603893141345273(0x820b0c001613f9, double:3.211787642409366E-306)
            long r10 = X.C18U.A01(r4, r9, r0)
            android.content.Context r0 = r2.A00
            X.0IE r1 = new X.0IE
            r1.<init>(r0)
            java.lang.String r0 = r0.getPackageName()
            X.0I8 r0 = X.C0I9.A00(r1, r0)
            long r2 = r0.A00
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            long r0 = r0.getTimeInMillis()
            long r0 = r0 - r2
            long r6 = r8.toDays(r0)
            r5 = 0
            if (r16 == 0) goto L93
            r2 = 0
            r1 = 1
            if (r15 == 0) goto L94
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 < 0) goto Lbb
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 > 0) goto L93
        L92:
            r5 = 1
        L93:
            return r5
        L94:
            if (r14 == 0) goto L93
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 == 0) goto L93
            r0 = 36603893140886519(0x820b0c000f13f7, double:3.2117876421192484E-306)
            long r3 = X.C18U.A01(r4, r9, r0)
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            long r0 = r0.getTimeInMillis()
            long r1 = r8.toSeconds(r0)
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 <= 0) goto L93
            r0 = 7
            long r3 = r3 * r0
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 <= 0) goto L93
            goto L92
        Lbb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148686md.A00():boolean");
    }

    public C148686md(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A00 = context;
    }
}
