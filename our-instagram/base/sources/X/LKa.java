package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class LKa {
    public static final LKa A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        if (r1 != 2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
    
        if (r2 == r13) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
    
        if (r8 == r11) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
    
        if (r7 == r12) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(com.instagram.common.session.UserSession r8, X.EnumC46172KcA r9, java.lang.Integer r10, java.lang.Integer r11, java.lang.Integer r12, java.lang.Integer r13) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LKa.A01(com.instagram.common.session.UserSession, X.KcA, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer):void");
    }

    public static final void A02(UserSession userSession, Integer num, boolean z) {
        C14360o3.A0B(userSession, 0);
        if (C6CB.A02(C6CE.A00(userSession).A00, 36326549922199513L)) {
            if (z) {
                AbstractC31174DnI.A0S().A02(AbstractC47843LBl.A00(userSession, "").A0K(new C48358LaY(2, num, userSession)), C49750LyJ.A00);
            } else {
                C48519LdH A002 = AbstractC46742Klz.A00(userSession, C05F.A06);
                A002.A07(new C30752Dfp(7, userSession, num, A002));
            }
        }
    }

    public static final Integer A00(EnumC46206Kci enumC46206Kci, List list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C47805L9n) it.next()).A00 == enumC46206Kci) {
                    return C05F.A00;
                }
            }
        }
        return C05F.A01;
    }
}
