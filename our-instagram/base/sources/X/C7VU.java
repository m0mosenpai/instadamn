package X;

import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.7VU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7VU implements C7VV {
    public boolean A00;
    public final int A01;
    public final UserSession A02;
    public final C7VS A03;
    public final C2EF A04;
    public final Map A05 = new LinkedHashMap();

    /* JADX WARN: Code restructure failed: missing block: B:185:0x0430, code lost:
    
        if (r0.CVQ() == true) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x04f5, code lost:
    
        if (r0.CVQ() == true) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x054e, code lost:
    
        if (r0.CVQ() == true) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0572, code lost:
    
        if (r0.CVQ() == true) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x020d, code lost:
    
        if (r0.CVQ() == true) goto L88;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x002f. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r2v70, types: [X.82I, X.0Zx] */
    @Override // X.C7VV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CNH(X.C7P3 r13, X.C83403nh r14) {
        /*
            Method dump skipped, instructions count: 1812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7VU.CNH(X.7P3, X.3nh):void");
    }

    @Override // X.C7VV
    public final boolean Ejc(C7P3 c7p3, String str) {
        if (c7p3 != C7P3.A09 && c7p3 != C7P3.A03 && c7p3 != C7P3.A0O && c7p3 != C7P3.A0c && c7p3 != C7P3.A0e && c7p3 != C7P3.A0W && c7p3 != C7P3.A0I && c7p3 != C7P3.A0T) {
            if (this.A00 || c7p3 == C7P3.A0S) {
                return false;
            }
            this.A00 = true;
        }
        return true;
    }

    @Override // X.C7VV
    public final C4NJ Bji() {
        return this.A03.A02;
    }

    public C7VU(UserSession userSession, C7VS c7vs, C2EF c2ef, int i) {
        this.A02 = userSession;
        this.A03 = c7vs;
        this.A04 = c2ef;
        this.A01 = i;
    }

    @Override // X.C7VV
    public final C7P3 Aje(C83403nh c83403nh) {
        Integer valueOf;
        if (c83403nh.A0h() != null && (valueOf = Integer.valueOf(Arrays.hashCode(new Object[]{c83403nh.A0h(), c83403nh.A10}))) != null) {
            return (C7P3) this.A05.get(valueOf);
        }
        return null;
    }
}
