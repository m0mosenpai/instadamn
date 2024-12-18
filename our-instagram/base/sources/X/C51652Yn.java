package X;

import android.content.Context;
import android.os.Build;
import android.view.ViewConfiguration;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.uxlogging.functioncorrectness.AwareTraceManager$start$1;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2Yn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51652Yn {
    public static long A00;
    public static C51672Yp A02;
    public static C51702Yt A03;
    public static final C51652Yn A05 = new Object();
    public static String A04 = "";
    public static final C19L A06 = AnonymousClass194.A02(C12L.A00.CPG(1562465960, 3).A00(1));
    public static C9BC A01 = new C9BC(7, 2, false, false, false);

    public static final void A00(Context context, int i, int i2, int i3, boolean z, boolean z2) {
        C14360o3.A0B(context, 0);
        AbstractC51662Yo.A00 = i3;
        if (z2) {
            AbstractC51662Yo.A01.A0G.E38(688602968, 1);
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int scaledTouchSlop = viewConfiguration.getScaledTouchSlop() * viewConfiguration.getScaledTouchSlop();
        C51672Yp.A0C = scaledTouchSlop;
        if (Build.VERSION.SDK_INT > 30) {
            C51672Yp.A0D = scaledTouchSlop * viewConfiguration.getScaledAmbiguousGestureMultiplier() * viewConfiguration.getScaledAmbiguousGestureMultiplier();
        }
        C19L c19l = A06;
        AwareTraceManager$start$1 awareTraceManager$start$1 = new AwareTraceManager$start$1(context, null, i, i2, z);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        Integer num = C05F.A00;
        AbstractC23641Du.A03(num, anonymousClass191, awareTraceManager$start$1, c19l);
        AbstractC23641Du.A03(num, anonymousClass191, new C206589Cp(0, null), c19l);
        AbstractC23641Du.A03(num, anonymousClass191, new C206589Cp(1, null), c19l);
    }

    public final ArrayList A04(Context context, int i) {
        ArrayList arrayList = new ArrayList();
        C51702Yt c51702Yt = A03;
        if (c51702Yt == null) {
            c51702Yt = new C51702Yt(context);
            A03 = c51702Yt;
        }
        List list = c51702Yt.A07;
        Object A0L = AbstractC001800i.A0L(list);
        if (A0L != null) {
            arrayList.add(A0L);
        }
        for (int size = list.size() - 2; size >= 0 && arrayList.size() <= i; size--) {
            C2ZV c2zv = (C2ZV) list.get(size);
            if (((C2ZV) list.get(size + 1)).A03.A00 - c2zv.A03.A00 > StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS) {
                break;
            }
            arrayList.add(0, c2zv);
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.Rd8] */
    public final void A05() {
        ?? obj = new Object();
        obj.A00 = 1;
        obj.A01 = 0L;
        A02(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.Rd8] */
    public final void A06() {
        ?? obj = new Object();
        obj.A00 = 0;
        obj.A01 = 0L;
        A02(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01d9, code lost:
    
        if (r3.getBooleanQueryParameter("app_shortcut", false) != true) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0104, code lost:
    
        if ((!r15.isEmpty()) != false) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5, types: [X.2a1, X.2ZT] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.2ZZ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C51672Yp r22) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51652Yn.A01(X.2Yp):void");
    }

    public static final void A02(C60980Rd8 c60980Rd8) {
        C19L c19l = A06;
        C206629Ct c206629Ct = new C206629Ct(c60980Rd8, null, 43);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        C2ST.A00(anonymousClass191, new C206649Cv(AbstractC23641Du.A03(C05F.A00, anonymousClass191, c206629Ct, c19l), null, 45));
    }

    public static final void A03(boolean z) {
        C9BC c9bc = A01;
        if (c9bc.A01 != z) {
            c9bc = new C9BC(z, c9bc.A02, c9bc.A03, 2);
        }
        A01 = c9bc;
    }
}
