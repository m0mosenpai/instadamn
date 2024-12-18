package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.WGp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70200WGp {
    public static void A0C(C62862tP c62862tP, C6FG c6fg, C6FQ c6fq, C102884kP c102884kP, List list, Map map, Map map2) {
        String str;
        FragmentActivity A03 = C6BQ.A03(c6fg);
        C102884kP A00 = AbstractC69812Vvy.A00(list);
        U5K A002 = U5L.A00(null, c6fg, c6fq, U5E.A03(c102884kP));
        U60 A01 = A01(c62862tP, A002, c6fg, c6fq, c102884kP, list, map, map2);
        try {
            str = U5E.A08(c102884kP);
        } catch (IllegalArgumentException unused) {
            str = null;
        }
        C189478aR A003 = A07(A03, A01, A002, c6fg, c6fq, A00, str).A00();
        A01.A0C = A003;
        A003.A02(A03, A01);
    }

    public static void A0E(C6FQ c6fq, C102884kP c102884kP, Map map) {
        A0B(C6BQ.A04(c6fq), C6BQ.A06(c6fq), c6fq.A03, c6fq, c102884kP, C6BQ.A0B(c6fq), map);
    }

    public static int A00(String str) {
        int i = 16;
        if (str == null) {
            return 16;
        }
        try {
            i = C6BE.A05(str);
            return i;
        } catch (C41M e) {
            AbstractC25241Le.A03("BloksBottomSheetHelper", e);
            return i;
        }
    }

    public static U60 A01(C62862tP c62862tP, U5K u5k, C6FG c6fg, C6FQ c6fq, C102884kP c102884kP, List list, Map map, Map map2) {
        int i;
        C1338462s A00;
        InterfaceC103384lE A0B;
        String A0G;
        String A01;
        String A07 = U5E.A07(c102884kP);
        HashMap hashMap = new HashMap();
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry entry = (Map.Entry) A15.next();
            Object value = entry.getValue();
            String A012 = AbstractC69812Vvy.A01(entry.getKey());
            if (value == null) {
                A01 = null;
            } else {
                A01 = AbstractC69812Vvy.A01(entry.getValue());
            }
            hashMap.put(A012, A01);
        }
        AbstractC12990ll A0A = C6BQ.A0A(c6fg);
        C66273U6s c66273U6s = new C66273U6s(null, null, null, null, null, A07, null, null, hashMap, new ArrayList(), null, map2, map2, -1, 0, -1L, -1L, false, false);
        boolean A1W = AbstractC167007dF.A1W(U5E.A04(U5E.A09(c102884kP), 15855));
        Context context = c6fg.A00;
        String str = c66273U6s.A09;
        if (str != null && AbstractC03270Dk.A01(A0A) != null) {
            HashMap hashMap2 = c66273U6s.A0C;
            C14360o3.A0B(A0A, 1);
            AbstractC191798eb.A02(context, new C191778eZ(A0A, false, A1W, false), str, null, hashMap2, 0L);
        }
        if (A1W) {
            A00 = U5E.A02(c6fq, c102884kP);
        } else {
            int i2 = c102884kP.A05;
            if (i2 == 13647) {
                i = 43;
            } else if (AbstractC167007dF.A1P(i2, 13784)) {
                i = 38;
            } else {
                throw new IllegalArgumentException("screen should be an instance of BloksScreenData or BloksScreenV2Data");
            }
            C102884kP A08 = c102884kP.A08(i);
            if (A08 == null) {
                A00 = null;
            } else {
                A00 = C1338462s.A00(c6fq, A08);
            }
        }
        C102884kP A002 = AbstractC69812Vvy.A00(list);
        String A06 = U5E.A06(c102884kP);
        if (A002 != null && (A0G = A002.A0G()) != null) {
            A06 = A0G;
        }
        C66277U6x c66277U6x = new C66277U6x(hashMap, map2, A07);
        C34397FEn c34397FEn = new C34397FEn(A0A);
        if (u5k != null) {
            c34397FEn.A00.A06(u5k);
        }
        IgBloksScreenConfig igBloksScreenConfig = c34397FEn.A00;
        igBloksScreenConfig.A0R = A06;
        igBloksScreenConfig.A07 = A00;
        igBloksScreenConfig.A0c = c62862tP.A00;
        igBloksScreenConfig.A0d = A1W;
        String str2 = null;
        if (A002 != null) {
            str2 = A002.A0E();
        }
        igBloksScreenConfig.A00 = A00(str2);
        if (A002 == null) {
            A0B = U5E.A05(c102884kP);
        } else {
            A0B = A002.A0B(42);
        }
        if (A0B != null) {
            igBloksScreenConfig.A0A = A0B;
        }
        return W6d.A01(igBloksScreenConfig, c66277U6x);
    }

    public static U60 A02(C62862tP c62862tP, C6FQ c6fq, C102884kP c102884kP, AbstractC12990ll abstractC12990ll, Map map) {
        Object A04;
        if (C102884kP.A00(c102884kP, 31) != null) {
            A04 = C102884kP.A00(c102884kP, 31);
        } else {
            C102884kP A08 = c102884kP.A08(36);
            C18C.A07(A08, "Content is expected in the bottom sheet payload");
            if (c6fq != null) {
                A04 = C1338462s.A00(c6fq, A08);
            } else {
                A04 = C1338462s.A04(A08);
            }
            c102884kP.A0Q(31, A04);
        }
        String str = "";
        String A0E = c102884kP.A0E();
        if (A0E != null) {
            str = A0E;
        }
        InterfaceC103384lE A0B = c102884kP.A0B(46);
        int A00 = A00(c102884kP.A0L(44));
        A04.getClass();
        U60 u60 = new U60();
        Bundle bundle = new Bundle();
        AbstractC31175DnJ.A0r(bundle, abstractC12990ll);
        bundle.putString("module_name", str);
        bundle.putInt("content_key", U6N.A00(abstractC12990ll).A01(A04));
        if (map != null) {
            bundle.putInt("external_variables_key", U6N.A00(abstractC12990ll).A01(new HashMap(map)));
        }
        bundle.putInt("soft_input_mode", A00);
        if (A0B != null) {
            bundle.putInt("backpress_key", U6N.A00(abstractC12990ll).A01(A0B));
        }
        u60.setArguments(bundle);
        u60.A07 = c62862tP;
        return u60;
    }

    public static C102874kO A03(C6FQ c6fq, C102884kP c102884kP) {
        C102874kO c102874kO = new C102874kO(13374);
        C102884kP A08 = c102884kP.A08(35);
        if (A08 != null) {
            c102874kO.A0Q(31, C1338462s.A00(c6fq, A08));
            A0G(c102884kP, c102874kO);
            c102874kO.A0P();
            return c102874kO;
        }
        throw new IllegalStateException("Null content for BottomSheet");
    }

    public static C189478aR A05(Context context, AbstractC12990ll abstractC12990ll) {
        C3DN A01;
        if (!C18U.A06(C06090Tz.A05, abstractC12990ll, 36311934148019012L) || (A01 = C3DN.A00.A01(context)) == null || !((C3DP) A01).A0h) {
            return null;
        }
        Fragment A09 = A01.A09();
        if (!(A09 instanceof BottomSheetFragment)) {
            return null;
        }
        return ((BottomSheetFragment) A09).A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
    
        if (r27 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        r21 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:
    
        if (r27.A0S(65, false) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
    
        if (r5 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0098, code lost:
    
        r1 = X.C3DN.A00.A01(r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009e, code lost:
    
        if (r1 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a0, code lost:
    
        r1.A0R(new X.C71054Wn9(0, r5, r26));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b6, code lost:
    
        return A09(r22, X.C6BQ.A0A(r25), r12, r13, r23, r15, r28, r17, r18, r19, r20, r21, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0092, code lost:
    
        r21 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00dc, code lost:
    
        if (r27.A0S(66, false) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c5, code lost:
    
        if (r27.A0S(41, false) == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C189448aO A07(android.app.Activity r22, X.U60 r23, X.U5K r24, X.C6FG r25, X.C6FQ r26, X.C102884kP r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC70200WGp.A07(android.app.Activity, X.U60, X.U5K, X.6FG, X.6FQ, X.4kP, java.lang.String):X.8aO");
    }

    public static C189448aO A08(Activity activity, IgBloksScreenConfig igBloksScreenConfig, AbstractC12990ll abstractC12990ll, C51D c51d) {
        return A09(activity, abstractC12990ll, null, null, c51d, igBloksScreenConfig.A0U, null, 50, igBloksScreenConfig.A00, false, igBloksScreenConfig.A0b, igBloksScreenConfig.A0a, igBloksScreenConfig.A0j);
    }

    public static C189448aO A09(Activity activity, AbstractC12990ll abstractC12990ll, C189468aQ c189468aQ, C189468aQ c189468aQ2, C51D c51d, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        C189448aO c189448aO = new C189448aO(abstractC12990ll);
        if (!TextUtils.isEmpty(str)) {
            c189448aO.A0d = str;
        }
        if (c189468aQ != null) {
            c189448aO.A0Q = c189468aQ;
        }
        if (c189468aQ2 != null) {
            c189448aO.A0R = c189468aQ2;
        }
        if (str2 != null) {
            c189448aO.A0f = str2;
        }
        float max = Math.max(Math.min(i / 100.0f, 1.0f), 0.0f);
        if (i2 == 16 && AbstractC13880nE.A0y(activity)) {
            c189448aO.A0Z = true;
        }
        AbstractC25225BEi.A1Q(c189448aO, z);
        c189448aO.A03 = max;
        c189448aO.A0T = c51d;
        c189448aO.A0x = true;
        c189448aO.A0y = !z2;
        c189448aO.A0k = !z3;
        c189448aO.A12 = z4;
        return c189448aO;
    }

    public static void A0B(Activity activity, C62862tP c62862tP, C6FG c6fg, C6FQ c6fq, C102884kP c102884kP, AbstractC12990ll abstractC12990ll, Map map) {
        String str;
        C3DO c3do = C3DN.A00;
        c3do.A00(activity);
        int A00 = A00(c102884kP.A0L(44));
        U60 A02 = A02(c62862tP, c6fq, c102884kP, abstractC12990ll, map);
        C189468aQ A0A = A0A(activity, null, c6fq, c102884kP.A0B(57), c102884kP.A0L(58), c102884kP.A0L(56), c102884kP.A0L(55), true);
        String str2 = "";
        String A0K = c102884kP.A0K();
        if (A0K != null) {
            str2 = A0K;
        }
        int A03 = c102884kP.A03(41, 50);
        boolean A0U = c102884kP.A0U(false);
        try {
            str = U5E.A08(c102884kP);
        } catch (IllegalArgumentException unused) {
            str = null;
        }
        C189478aR A002 = A09(activity, abstractC12990ll, null, A0A, A02, str2, str, A03, A00, A0U, c102884kP.A0S(63, false), c102884kP.A0S(62, false), c102884kP.A0S(65, false)).A00();
        A02.A0C = A002;
        if (c6fg != null && c6fq != null && c102884kP.A0B(40) != null) {
            InterfaceC103384lE A0B = c102884kP.A0B(40);
            C3DN A01 = c3do.A01(activity);
            if (A01 != null) {
                A01.A0R(new C71054Wn9(0, A0B, c6fq));
            }
        }
        A002.A02(activity, A02);
    }

    public static void A0F(C6FQ c6fq, C102884kP c102884kP, Map map, boolean z) {
        String str;
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        C62862tP A06 = C6BQ.A06(c6fq);
        C189478aR A062 = A06(C6BQ.A09(c6fq));
        if (A062 == null) {
            A062 = A05(A04, A0B);
        }
        if (A062 == null) {
            AbstractC25241Le.A02("BloksBottomSheetHelper", "Can't push bottom sheet outside of controller");
            return;
        }
        int A00 = A00(c102884kP.A0L(44));
        U60 A02 = A02(A06, c6fq, c102884kP, A0B, map);
        A02.A0C = A062;
        if (c102884kP.A0B(40) != null) {
            InterfaceC103384lE A0B2 = c102884kP.A0B(40);
            C3DN A01 = C3DN.A00.A01(A04);
            if (A01 != null) {
                A01.A0R(new C71054Wn9(0, A0B2, c6fq));
            }
        }
        C189468aQ A0A = A0A(A04, null, c6fq, c102884kP.A0B(57), c102884kP.A0L(58), c102884kP.A0L(56), c102884kP.A0L(55), true);
        String str2 = "";
        String A0K = c102884kP.A0K();
        if (A0K != null) {
            str2 = A0K;
        }
        int A03 = c102884kP.A03(41, 50);
        boolean A0U = c102884kP.A0U(false);
        try {
            str = U5E.A08(c102884kP);
        } catch (IllegalArgumentException unused) {
            str = null;
        }
        A062.A0G(A02, A09(A04, A0B, null, A0A, A02, str2, str, A03, A00, A0U, c102884kP.A0S(63, false), c102884kP.A0S(62, false), c102884kP.A0S(65, false)), z, true);
    }

    public static void A0G(C102884kP c102884kP, C102874kO c102874kO) {
        c102874kO.A0Q(40, c102884kP.A0B(38));
        c102874kO.A0Q(46, c102884kP.A0B(75));
        String str = "";
        String A0G = c102884kP.A0G();
        if (A0G != null) {
            str = A0G;
        }
        c102874kO.A0Q(43, str);
        c102874kO.A0Q(41, Integer.valueOf(c102884kP.A03(53, 50)));
        c102874kO.A0Q(38, Boolean.valueOf(c102884kP.A0S(52, false)));
        c102874kO.A0Q(58, c102884kP.A0L(48));
        c102874kO.A0Q(55, c102884kP.A0L(44));
        c102874kO.A0Q(57, c102884kP.A0B(45));
        c102874kO.A0Q(56, c102884kP.A0L(57));
        c102874kO.A0Q(44, c102884kP.A0L(55));
        c102874kO.A0Q(63, Boolean.valueOf(c102884kP.A0S(72, false)));
        c102874kO.A0Q(62, Boolean.valueOf(c102884kP.A0S(71, false)));
        c102874kO.A0Q(65, Boolean.valueOf(c102884kP.A0S(76, false)));
    }

    public static C102874kO A04(C1338462s c1338462s) {
        Pair A00 = VSA.A00(c1338462s);
        C102884kP c102884kP = (C102884kP) A00.first;
        C102874kO c102874kO = new C102874kO(13374);
        c102874kO.A0Q(31, A00.second);
        A0G(c102884kP, c102874kO);
        c102874kO.A0P();
        return c102874kO;
    }

    public static C189478aR A06(C6FG c6fg) {
        return (C189478aR) c6fg.A01.get(R.id.bottom_sheet_id);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (android.text.TextUtils.isEmpty(r10) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C189468aQ A0A(android.content.Context r4, android.view.View.OnClickListener r5, X.C6FQ r6, X.InterfaceC103384lE r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto Le
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto Le
            r0 = 0
            return r0
        Le:
            X.8aP r2 = new X.8aP
            r2.<init>()
            r2.A0A = r11
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L48
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L29
            java.lang.String r0 = "none"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L48
        L29:
            r2.A06 = r8
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L34
        L31:
            r2.A01(r10)
        L34:
            if (r5 != 0) goto L41
            if (r6 == 0) goto L43
            if (r7 == 0) goto L43
            r0 = 42
            X.WNV r5 = new X.WNV
            r5.<init>(r0, r6, r7)
        L41:
            r2.A05 = r5
        L43:
            X.8aQ r0 = r2.A00()
            return r0
        L48:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L34
            java.lang.Integer r3 = X.U5L.A03(r9)
            if (r3 == 0) goto L77
            int r0 = X.AbstractC65916TwN.A01(r3)
            r2.A02 = r0
            android.content.res.Resources r1 = r4.getResources()
            int r0 = X.AbstractC65916TwN.A00(r3)
            java.lang.String r0 = r1.getString(r0)
            r2.A01(r0)
        L69:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L31
            java.lang.String r1 = "BloksBottomSheetHelper"
            java.lang.String r0 = "Trailing header icon buttons must have an accessibility label"
            X.AbstractC25241Le.A02(r1, r0)
            goto L34
        L77:
            X.BSU r1 = X.BSU.OUTLINE
            X.BSV r0 = X.BSV.SIZE_24
            android.graphics.drawable.Drawable r0 = X.AbstractC65877Tvg.A01(r4, r0, r1, r9)
            r2.A04 = r0
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC70200WGp.A0A(android.content.Context, android.view.View$OnClickListener, X.6FQ, X.4lE, java.lang.String, java.lang.String, java.lang.String, boolean):X.8aQ");
    }

    public static void A0D(C6FG c6fg, Runnable runnable) {
        C3DN A01;
        C189478aR A06 = A06(c6fg);
        Context context = c6fg.A00;
        C3DO c3do = C3DN.A00;
        C3DN A012 = c3do.A01(context);
        if (A06 == null && A012 == null) {
            AbstractC25241Le.A02("BloksBottomSheetHelper", "Can't dismiss bottom sheet outside of controller");
            return;
        }
        if (runnable != null && (A01 = c3do.A01(context)) != null) {
            A01.A0R(new C56772PHp(runnable, 0));
        }
        if (A06 != null) {
            A06.A07();
        } else {
            if (A012 == null) {
                return;
            }
            A012.A0B();
        }
    }
}
