package X;

import android.view.View;
import android.view.ViewParent;
import com.facebook.litho.ComponentHost;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2vo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC64292vo implements InterfaceC43071ya {
    public final Map A00 = new LinkedHashMap();
    public final UserSession A01;

    public static final String A00(View view, C3h4 c3h4, String str, boolean z) {
        String valueOf;
        if (c3h4 != null) {
            valueOf = String.valueOf(c3h4.A01.A06.A0H());
        } else {
            if (view.getId() == -1) {
                view.setId(View.generateViewId());
            }
            ViewParent parent = view.getParent();
            if (parent != null && !(parent instanceof ComponentHost)) {
                StringBuilder sb = new StringBuilder();
                Object parent2 = view.getParent();
                C14360o3.A0C(parent2, "null cannot be cast to non-null type android.view.View");
                sb.append(((View) parent2).getId());
                sb.append(view.getId());
                valueOf = sb.toString();
            } else {
                valueOf = String.valueOf(view.getId());
            }
        }
        Integer A06 = C115775Lq.A00.A06(str);
        if (z && A06 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(valueOf);
            sb2.append(A06);
            return sb2.toString();
        }
        return valueOf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:229:0x024a, code lost:
    
        if (r0.length() > 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x024c, code lost:
    
        r0 = new X.C5M6(r8, r5, r9, r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0264, code lost:
    
        if (r0.length() > 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x026f, code lost:
    
        if (((com.instagram.ui.widget.textview.IgTextLayoutView) r4).A00 != null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x02bc, code lost:
    
        if (((X.IL5) r14.A0B.get(r12)).A00().Cff() != false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0302, code lost:
    
        if (r0.Cff() != false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0307, code lost:
    
        if ((r8 instanceof com.instagram.ui.widget.framelayout.MediaFrameLayout) == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x030c, code lost:
    
        if (r5 != X.EnumC77673dr.A0K) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0311, code lost:
    
        if (r0 != false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x030e, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0324, code lost:
    
        if (r4 == false) goto L190;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x01c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01d2 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.C59062n7 r24, X.InterfaceC57162jr r25, final java.lang.String r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 1306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC64292vo.A02(X.2n7, X.2jr, java.lang.String, boolean):void");
    }

    public AbstractC64292vo(UserSession userSession) {
        this.A01 = userSession;
    }

    public static final void A01(EnumC77673dr enumC77673dr, Object obj, String str, String str2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            String A0b = AnonymousClass001.A0b(str, "\\_", view.getId());
            C115775Lq c115775Lq = C115775Lq.A00;
            if (!C115775Lq.A05(str2, A0b)) {
                c115775Lq.A08(enumC77673dr, new C115805Lu(view, enumC77673dr, obj, str2), str2, A0b);
                C115775Lq.A04(str2, A0b);
            }
        }
    }
}
