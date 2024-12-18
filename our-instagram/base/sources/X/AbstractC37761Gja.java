package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Gja, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37761Gja {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        if (r18 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        if (X.C14360o3.A0K(r13, "feed_timeline") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0136, code lost:
    
        if (r0 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0100, code lost:
    
        if (r12.equals(r0) != false) goto L37;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:53:0x009f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A03(com.instagram.common.session.UserSession r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC37761Gja.A03(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean):boolean");
    }

    public static final void A02(UserSession userSession, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        if (C18U.A06(C06090Tz.A05, userSession, 36318479679887543L) && !str.equals("clips_viewer_clips_tab")) {
            C0f5 AEp = C18950wb.A01.AEp(AnonymousClass001.A0u("Headload sync flow is not enabled for module ", str, ", subReason: ", str4), 817895520);
            AEp.ABX("isHeadLoad", z);
            AEp.ABW("maxId", str2);
            AEp.ABW("currentModule", str);
            AEp.ABX("isCheckForRequest", z2);
            AEp.ABW("responseContainerModule", str3);
            AEp.ABX("isPrefetch", z3);
            AEp.report();
        }
    }

    public static final List A00(UserSession userSession, String str, List list) {
        AbstractC167027dH.A12(userSession, list, str);
        if ((C18U.A06(C06090Tz.A05, userSession, 36318479681067206L) && AbstractC116865Qp.A02(str).A02()) || (!C1LE.A09(userSession) && !AbstractC116865Qp.A02(str).A00())) {
            return list;
        }
        return A01(userSession, str, list, AbstractC166987dD.A1J(EnumC129395t1.A0G));
    }

    public static final List A01(UserSession userSession, String str, List list, List list2) {
        EnumC129395t1 enumC129395t1;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            C120985dq c120985dq = (C120985dq) obj;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36318479680936132L) && (enumC129395t1 = c120985dq.A01) != EnumC129395t1.A0G && !AbstractC37647Ghg.A01(enumC129395t1)) {
                C18950wb c18950wb = C18950wb.A01;
                StringBuilder sb = new StringBuilder();
                sb.append("None organic or ad type is delivered and got filtered out, currentContainerModule ");
                sb.append(str);
                sb.append(", ClipsItemType ");
                sb.append(enumC129395t1);
                c18950wb.AEp(sb.toString(), 817895520).report();
            }
            if (C18U.A06(c06090Tz, userSession, 36318479681001669L)) {
                EnumC129395t1 enumC129395t12 = c120985dq.A01;
                if (!list2.contains(enumC129395t12) && enumC129395t12 != EnumC129395t1.A0H) {
                }
                A1E.add(obj);
            } else if (list2.contains(c120985dq.A01)) {
                A1E.add(obj);
            }
        }
        return A1E;
    }
}
