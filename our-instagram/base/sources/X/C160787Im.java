package X;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7Im, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160787Im implements C7VC {
    public int A02;
    public long A07;
    public long A08;
    public C51737MtK A09;
    public ImmutableList A0A;
    public ImmutableMap A0B;
    public C7FK A0D;
    public C162297Or A0F;
    public C7TT A0G;
    public C115955Ml A0H;
    public C17280tP A0I;
    public C4NJ A0J;
    public User A0K;
    public CharSequence A0L;
    public CharSequence A0M;
    public Integer A0N;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public final UserSession A0d;
    public final C83403nh A0e;
    public C7P3 A0C = C7P3.A0S;
    public int A00 = 4;
    public int A06 = 8;
    public int A01 = 8;
    public int A04 = 8;
    public int A03 = 8;
    public boolean A0O = false;
    public int A05 = 0;
    public boolean A0W = false;
    public boolean A0S = false;
    public boolean A0Z = false;
    public C160787Im A0E = null;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01d8, code lost:
    
        if (X.EnumC46252KdU.A00(r0) != X.EnumC46252KdU.MEDIA_NOTE) goto L135;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:109:0x01df. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0367 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A00(com.instagram.common.session.UserSession r14, X.C83403nh r15) {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160787Im.A00(com.instagram.common.session.UserSession, X.3nh):int");
    }

    public final int A01() {
        if (this.A0G.A1G) {
            return this.A05;
        }
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C120985dq A02() {
        C38321qM A0S;
        C83403nh c83403nh = this.A0e;
        if (c83403nh.A1T instanceof C1575375n) {
            C1575375n c1575375n = c83403nh.A0S;
            if (c1575375n == null) {
                return null;
            }
            C40971v4 c40971v4 = c1575375n.A02;
            if (c40971v4 != null) {
                A0S = c40971v4.A0K;
            } else {
                A0S = c1575375n.A01;
            }
        } else {
            C2EY c2ey = c83403nh.A10;
            if (c2ey != C2EY.A1r) {
                if (c2ey != C2EY.A1x || c83403nh.A0H() == null || c83403nh.A0H().isEmpty() || ((C910143t) c83403nh.A0H().get(0)).A0w == null) {
                    return null;
                }
                android.net.Uri A03 = AbstractC08820cl.A03(((C910143t) c83403nh.A0H().get(0)).A0w);
                if (A03.getPath() == null || !A03.getPath().contains("reel")) {
                    return null;
                }
            }
            A0S = c83403nh.A0S();
        }
        if (A0S == null) {
            return null;
        }
        return C128085qc.A02(A0S);
    }

    public final C7P3 A03() {
        if (this.A0G.A1G) {
            return C7P3.A0S;
        }
        return this.A0C;
    }

    public final ArrayList A04() {
        Object obj;
        if (this.A0G.A08 == 29) {
            ArrayList A0r = this.A0e.A0r();
            if (A0r == null || A0r.isEmpty() || (obj = A0r.get(0)) == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj);
            return arrayList;
        }
        User A00 = AbstractC08690cX.A00(this.A0d);
        if (A00 == null) {
            return null;
        }
        return this.A0e.A0s(A00);
    }

    public final boolean A05() {
        C125805mV c125805mV = this.A0e.A0W;
        if (c125805mV != null && c125805mV.A00 > 0 && !this.A0Q) {
            User user = this.A0K;
            if (user == null || !user.Cey()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A06() {
        if (this.A0G.A13 && this.A0e.A0Q != null && this.A0W) {
            if (C18U.A06(C06090Tz.A05, this.A0d, 36326953648666831L)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C7VC
    public final long C8f() {
        return this.A0e.C8i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x0213, code lost:
    
        if (r1 == 0) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r0 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x03ab, code lost:
    
        if (r1 == X.C7O9.AVATAR_REACTION) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x03d1, code lost:
    
        if (r5.A0F == false) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x03d9, code lost:
    
        if (r3 == false) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x03e6, code lost:
    
        if (r5.A0F != false) goto L304;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:49:0x00c3. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0017. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:88:0x012f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0610 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x049f A[PHI: r15
      0x049f: PHI (r15v87 int) = 
      (r15v13 int)
      (r15v13 int)
      (r15v13 int)
      (r15v13 int)
      (r15v13 int)
      (r15v13 int)
      (r15v13 int)
      (r15v13 int)
      (r15v13 int)
      (r15v13 int)
      (r15v13 int)
      (r15v13 int)
      (r15v13 int)
      (r15v16 int)
      (r15v21 int)
      (r15v16 int)
      (r15v23 int)
      (r15v27 int)
      (r15v27 int)
      (r15v27 int)
      (r15v27 int)
      (r15v29 int)
      (r15v31 int)
      (r15v34 int)
      (r15v37 int)
      (r15v39 int)
      (r15v39 int)
      (r15v39 int)
      (r15v43 int)
      (r15v39 int)
      (r15v48 int)
      (r15v53 int)
      (r15v58 int)
      (r15v60 int)
      (r15v60 int)
      (r15v64 int)
      (r15v60 int)
      (r15v66 int)
      (r15v71 int)
      (r15v76 int)
      (r15v82 int)
      (r15v84 int)
      (r15v88 int)
      (r15v88 int)
      (r15v88 int)
      (r15v92 int)
      (r15v88 int)
      (r15v88 int)
      (r15v98 int)
      (r15v98 int)
      (r15v98 int)
      (r15v102 int)
      (r15v98 int)
      (r15v98 int)
     binds: [B:537:0x05cb, B:539:0x05cf, B:541:0x05d8, B:545:0x05e4, B:532:0x0603, B:527:0x060e, B:525:0x060a, B:424:0x04fd, B:426:0x0503, B:430:0x0514, B:506:0x05f6, B:503:0x05ef, B:392:0x0490, B:384:0x0463, B:377:0x0483, B:369:0x046a, B:371:0x0470, B:323:0x03eb, B:339:0x0412, B:341:0x041c, B:343:0x0420, B:332:0x0404, B:329:0x03fb, B:286:0x0365, B:280:0x034c, B:249:0x02e6, B:251:0x02f7, B:269:0x031c, B:271:0x0326, B:261:0x030f, B:263:0x0315, B:240:0x02dd, B:230:0x02cc, B:177:0x0231, B:179:0x0242, B:206:0x027f, B:198:0x0266, B:200:0x026c, B:172:0x021e, B:156:0x0226, B:130:0x01b9, B:127:0x01a5, B:78:0x010c, B:97:0x013f, B:109:0x016d, B:111:0x0173, B:84:0x0125, B:86:0x0129, B:39:0x00a0, B:58:0x00d3, B:70:0x0101, B:72:0x0107, B:45:0x00b9, B:47:0x00bd] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0168 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0141  */
    @Override // X.C7VC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getType() {
        /*
            Method dump skipped, instructions count: 2142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160787Im.getType():int");
    }

    public C160787Im(UserSession userSession, C7TT c7tt, C83403nh c83403nh, User user) {
        long j;
        ImmutableMap immutableMap;
        ImmutableMap immutableMap2;
        ImmutableList of;
        Integer num;
        this.A0d = userSession;
        this.A0G = c7tt;
        this.A0e = c83403nh;
        this.A0K = user;
        long A0D = c83403nh.A0D();
        this.A07 = A0D;
        if (c83403nh.A1P != null) {
            j = c83403nh.C8i();
        } else {
            j = 0;
        }
        this.A08 = j;
        this.A0F = new C162297Or(A0D, j);
        synchronized (c83403nh) {
            LinkedHashMap linkedHashMap = c83403nh.A1y;
            if (linkedHashMap != null) {
                immutableMap = ImmutableMap.copyOf((Map) linkedHashMap);
            } else {
                immutableMap = null;
            }
        }
        if (immutableMap != null && !immutableMap.isEmpty()) {
            java.util.Set entrySet = immutableMap.entrySet();
            C14360o3.A07(entrySet);
            List<Map.Entry> A0g = AbstractC001800i.A0g(entrySet, new Comparator() { // from class: X.75U
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return C2BS.A00(Integer.valueOf(((AnonymousClass444) ((Map.Entry) obj2).getValue()).A00.size()), Integer.valueOf(((AnonymousClass444) ((Map.Entry) obj).getValue()).A00.size()));
                }
            });
            int A0L = AbstractC16850sd.A0L(AbstractC06950Ym.A1E(A0g, 10));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(A0L < 16 ? 16 : A0L);
            for (Map.Entry entry : A0g) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
            immutableMap2 = ImmutableMap.copyOf((Map) linkedHashMap2);
        } else {
            immutableMap2 = RegularImmutableMap.A02;
        }
        C14360o3.A07(immutableMap2);
        this.A0B = immutableMap2;
        ImmutableList A0J = c83403nh.A0J();
        if (A0J != null && !A0J.isEmpty()) {
            of = AbstractC31325Dpn.A01(A0J, A0J.size());
        } else {
            of = ImmutableList.of();
            C14360o3.A07(of);
        }
        this.A0A = of;
        if (c7tt.A1C) {
            if (c83403nh.A0p() == null) {
                num = C05F.A0C;
            } else {
                num = C05F.A01;
            }
        } else {
            num = C05F.A00;
        }
        this.A0N = num;
        this.A0I = C17280tP.A00();
        this.A0D = new C7FK(userSession);
    }
}
