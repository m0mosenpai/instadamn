package X;

import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7VJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7VJ extends C7VK {
    public final UserSession A00;

    public C7VJ(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x031b, code lost:
    
        if (r2 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x025f, code lost:
    
        if (r2 == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03a9, code lost:
    
        if (r5 != null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x03c1, code lost:
    
        if (X.C18U.A06(r6, r4, 36330123334599366L) != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x043a, code lost:
    
        if (r1 != null) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0476, code lost:
    
        if (X.C18U.A06(r6, r11, r1) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x04e4, code lost:
    
        if (r2 == null) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x04f4, code lost:
    
        if (r1 == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4, 36323195552279622L) == false) goto L26;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x0160. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01db  */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v2, types: [android.content.Context, boolean] */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r27v1, types: [boolean, X.7VJ] */
    /* JADX WARN: Type inference failed for: r28v1, types: [boolean, X.7Is] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C7AM A00(android.content.Context r26, X.C7VJ r27, X.C160847Is r28) {
        /*
            Method dump skipped, instructions count: 1324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7VJ.A00(android.content.Context, X.7VJ, X.7Is):X.7AM");
    }

    public static final C7AL A01(C160847Is c160847Is) {
        C7AK c7ak;
        if (c160847Is.A0Q && !c160847Is.A0S && !c160847Is.A0a) {
            if (c160847Is.A0d) {
                c7ak = C7AK.A0I;
            } else {
                c7ak = C7AK.A0F;
            }
            return new C7AL(null, c7ak, null, null, 1.0f);
        }
        return null;
    }

    public static final C7AL A02(C160847Is c160847Is) {
        C9BW c9bw = null;
        if (!c160847Is.A0k) {
            return null;
        }
        int i = c160847Is.A05;
        if (i > 0) {
            Integer valueOf = Integer.valueOf(R.attr.infoButtonIcon);
            if (i > 10000) {
                i = 10000;
            }
            c9bw = new C9BW(11, Integer.valueOf(i), valueOf);
        }
        return new C7AL(c9bw, C7AK.A0L, null, null, 1.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
    
        if (r3 == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.ArrayList A03(X.C160847Is r10) {
        /*
            r9 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r2 = r10.A0h
            if (r2 != 0) goto Le
            boolean r0 = r10.A0s
            if (r0 != 0) goto Le
        Ld:
            return r1
        Le:
            boolean r0 = r10.A0M
            if (r0 != 0) goto L44
            boolean r0 = r10.A0N
            if (r0 == 0) goto L2c
            X.7AK r4 = X.C7AK.A0N
        L18:
            r3 = 0
            r0 = 2131959650(0x7f131f62, float:1.9555946E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r7 = 1065353216(0x3f800000, float:1.0)
            X.7AL r2 = new X.7AL
            r6 = r3
            r2.<init>(r3, r4, r5, r6, r7)
        L28:
            r1.add(r2)
            return r1
        L2c:
            if (r2 == 0) goto L47
            boolean r0 = r10.A0s
            if (r0 == 0) goto L47
            boolean r0 = r10.A0P
            if (r0 == 0) goto L47
            X.7AK r4 = X.C7AK.A0J
            r3 = 0
            java.lang.Integer r6 = X.C05F.A0N
            r7 = 1065353216(0x3f800000, float:1.0)
            X.7AL r2 = new X.7AL
            r5 = r3
            r2.<init>(r3, r4, r5, r6, r7)
            goto L28
        L44:
            X.7AK r4 = X.C7AK.A0M
            goto L18
        L47:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r2 == 0) goto L61
            boolean r2 = r10.A0o
            if (r2 == 0) goto Lb8
            X.7AK r4 = X.C7AK.A05
        L54:
            r3 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            X.7AL r2 = new X.7AL
            r5 = r3
            r6 = r3
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r2)
        L61:
            boolean r2 = r10.A0s
            if (r2 == 0) goto L9c
            boolean r2 = r10.A0m
            r5 = 0
            if (r2 == 0) goto Lb6
            X.1QL r3 = X.C1QI.A0E()
            X.1QL r2 = X.C1QL.A04
            if (r3 != r2) goto L7b
            boolean r3 = X.C14640oc.A0B()
            r2 = 2130970349(0x7f0406ed, float:1.7549406E38)
            if (r3 != 0) goto L7e
        L7b:
            r2 = 2130970252(0x7f04068c, float:1.7549209E38)
        L7e:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r7 = 2
            r8 = 11
            X.9BW r3 = new X.9BW
            r6 = r5
            r3.<init>(r4, r5, r6, r7, r8)
        L8b:
            boolean r2 = r10.A0o
            if (r2 == 0) goto La8
            X.7AK r4 = X.C7AK.A09
            r7 = 1065353216(0x3f800000, float:1.0)
            X.7AL r2 = new X.7AL
            r6 = r5
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r2)
        L9c:
            boolean r2 = r0.isEmpty()
            r2 = r2 ^ 1
            if (r2 == 0) goto Ld
            r1.addAll(r0)
            return r1
        La8:
            X.7AK r4 = X.C7AK.A0T
            r7 = 1065353216(0x3f800000, float:1.0)
            X.7AL r2 = new X.7AL
            r6 = r5
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r2)
            goto L9c
        Lb6:
            r3 = r5
            goto L8b
        Lb8:
            X.7AK r4 = X.C7AK.A0A
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7VJ.A03(X.7Is):java.util.ArrayList");
    }

    private final boolean A04(C160847Is c160847Is) {
        if (c160847Is.A0U || c160847Is.A0V) {
            return false;
        }
        UserSession userSession = this.A00;
        if (C4K3.A01(userSession)) {
            return true;
        }
        if (!C2E7.A01(C17060sy.A01.A01(userSession))) {
            return false;
        }
        return C18U.A06(C06090Tz.A05, userSession, 36316813231133345L);
    }
}
