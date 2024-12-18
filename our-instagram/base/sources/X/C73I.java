package X;

import android.content.Context;
import com.instagram.aistudio.profile.model.AiStudioProfileBannerModel;
import com.instagram.aistudio.profile.model.AiStudioProfileBannerPersonaModel;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.73I, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C73I {
    public static final C73I A00 = new Object();

    public static final List A00(Context context, AiStudioProfileBannerModel aiStudioProfileBannerModel, AnonymousClass736 anonymousClass736) {
        List list = aiStudioProfileBannerModel.A00;
        if (list.isEmpty()) {
            return C16930sl.A00;
        }
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C74B(context, (AiStudioProfileBannerPersonaModel) it.next(), anonymousClass736));
        }
        return arrayList;
    }

    public static final boolean A02(UserSession userSession, User user) {
        boolean z;
        Boolean CYj;
        Boolean CTN = user.A03.CTN();
        if (CTN != null) {
            z = CTN.booleanValue();
        } else {
            z = false;
        }
        if (!z || (CYj = user.A03.CYj()) == null || !CYj.booleanValue() || user.A03() <= 0) {
            return false;
        }
        if ((!C14360o3.A0K(userSession.userId, AbstractC76433bn.A00(user)) || !C18U.A06(C06090Tz.A05, userSession, 36322761762286066L)) && !C18U.A06(C06090Tz.A05, userSession, 36322761762220529L)) {
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession, User user) {
        Boolean B1P;
        C73J.A00();
        if (C18U.A06(C06090Tz.A05, userSession, 36324685906129288L) && (B1P = user.A03.B1P()) != null && B1P.booleanValue() && !A03(userSession, user)) {
            return true;
        }
        return false;
    }

    public static final boolean A03(UserSession userSession, User user) {
        C73J.A00();
        if (C18U.A06(C06090Tz.A05, userSession, 36324685905932677L) && user.A03.Bwq() != null) {
            return true;
        }
        return false;
    }

    public static final boolean A04(UserSession userSession, User user) {
        if (user.A1f() && C151366re.A05(userSession) && user.A03.C6Q() != null && C18U.A06(C06090Tz.A05, userSession, 36327700974353197L)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:276:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x052c A[LOOP:16: B:319:0x0526->B:321:0x052c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x05cb A[LOOP:18: B:339:0x05c5->B:341:0x05cb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x062e A[LOOP:20: B:361:0x0628->B:363:0x062e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x055c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList A05(android.content.Context r36, com.instagram.aistudio.profile.model.AiStudioProfileBannerModel r37, X.InterfaceC11380iw r38, com.instagram.common.session.UserSession r39, X.AnonymousClass736 r40, com.instagram.user.model.User r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 1852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73I.A05(android.content.Context, com.instagram.aistudio.profile.model.AiStudioProfileBannerModel, X.0iw, com.instagram.common.session.UserSession, X.736, com.instagram.user.model.User, boolean):java.util.ArrayList");
    }
}
