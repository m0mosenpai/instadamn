package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7bm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166187bm implements InterfaceC13050lr {
    public final C166197bn A00;
    public final UserSession A01;
    public final C40121td A02;
    public final C19L A03;
    public final Context A04;
    public final C19L A05;

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r5.A0K().size() != r4.size()) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C47Z A00(X.C26063Bfr r16, X.C51617MrA r17, java.lang.Integer r18, long r19, boolean r21) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C166187bm.A00(X.Bfr, X.MrA, java.lang.Integer, long, boolean):X.47Z");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List, java.lang.Object] */
    public static final C47Z A01(C26063Bfr c26063Bfr, C166187bm c166187bm, Integer num, String str, String str2, String str3, List list, boolean z) {
        long nanoTime;
        ?? arrayList;
        String str4;
        String str5;
        C47Z c47z = c166187bm.A00.A01;
        if (c47z != null && (str5 = c47z.A35) != null) {
            nanoTime = Long.parseLong(str5);
        } else {
            nanoTime = System.nanoTime();
        }
        if (c47z == null) {
            c47z = new C47Z(String.valueOf(nanoTime));
            c47z.A0T(EnumC40111tc.A0R);
        }
        Integer num2 = C05F.A0C;
        if (num == num2) {
            arrayList = Collections.singletonList(c166187bm.A00(c26063Bfr, (C51617MrA) AbstractC001800i.A0I(list), num, nanoTime + 1, true));
            C14360o3.A07(arrayList);
        } else {
            arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                C51617MrA c51617MrA = (C51617MrA) obj;
                long j = nanoTime + 1 + (i * 100);
                boolean z2 = false;
                if (i == 0) {
                    z2 = true;
                }
                arrayList.add(c166187bm.A00(c26063Bfr, c51617MrA, num, j, z2));
                i = i2;
            }
        }
        for (C47Z c47z2 : arrayList) {
            c47z2.A3Q = c47z.A35;
            c166187bm.A02(c26063Bfr, c47z2);
            for (C47Z c47z3 : c47z2.A0K()) {
                c47z3.A3Q = c47z.A35;
                if (C18U.A06(C06090Tz.A05, c166187bm.A01, 36328671635717848L)) {
                    c47z3.A3X = str;
                }
            }
            c47z2.A3X = str;
            c47z2.A13.A03 = str3;
            c47z2.A2R = str2;
            C38321qM A02 = C1DW.A00(c166187bm.A01).A02(str);
            if (A02 != null) {
                str4 = A02.A0C.getLoggingInfoToken();
            } else {
                str4 = null;
            }
            c47z2.A3i = str4;
            c47z2.A5y = z;
        }
        c47z.A3X = str;
        String A022 = C6WI.A02();
        C14360o3.A0B(A022, 0);
        c47z.A3x = A022;
        c47z.A4m = arrayList;
        c166187bm.A02(c26063Bfr, c47z);
        c47z.A0c(ShareType.A0H);
        c47z.A13.A03 = str3;
        boolean z3 = false;
        if (num == num2) {
            z3 = true;
        }
        c47z.A5g = z3;
        return c47z;
    }

    private final void A02(C26063Bfr c26063Bfr, C47Z c47z) {
        Integer num;
        c47z.A0J = ((EnumC46199Kcb) c26063Bfr.A02).A00;
        if (c26063Bfr.A01 == C05F.A01) {
            EnumC76383bi enumC76383bi = EnumC76383bi.A0E;
            C14360o3.A0B(enumC76383bi, 0);
            c47z.A1F = enumC76383bi;
        }
        c47z.A5c = c26063Bfr.A06;
        if (c26063Bfr.A05) {
            num = Integer.valueOf((int) C18U.A01(C06090Tz.A05, this.A01, 36610026353268741L));
        } else {
            num = null;
        }
        c47z.A27 = num;
        c47z.A1s = Boolean.valueOf(c26063Bfr.A04);
        c47z.A2S = c26063Bfr.A03;
    }

    public C166187bm(Context context, UserSession userSession) {
        this.A04 = context;
        this.A01 = userSession;
        C12L c12l = C12L.A00;
        this.A05 = AnonymousClass194.A02(c12l.CPG(319, 3).A00(1));
        this.A03 = AnonymousClass194.A02(c12l.CPG(319, 3));
        C40131tg c40131tg = C40121td.A0G;
        Context applicationContext = context.getApplicationContext();
        C14360o3.A07(applicationContext);
        C40121td A01 = c40131tg.A01(applicationContext, userSession);
        this.A02 = A01;
        C14360o3.A0B(A01, 1);
        this.A00 = (C166197bn) userSession.A01(C166197bn.class, new C50154MDh(A01, 14));
    }
}
