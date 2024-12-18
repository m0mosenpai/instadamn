package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.LdE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48516LdE implements InterfaceC13000lm {
    public final UserSession A00;
    public final C47547KzH A01;
    public final HashSet A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;

    public C48516LdE(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = new C47547KzH(userSession);
        this.A02 = AbstractC166987dD.A1H();
        this.A05 = AbstractC09440dt.A01(MHS.A00(this, 24));
        this.A06 = AbstractC09440dt.A01(MHS.A00(this, 25));
        this.A03 = AbstractC09440dt.A01(MHS.A00(this, 22));
        this.A04 = AbstractC09440dt.A00(EnumC09460dv.A02, MHS.A00(this, 23));
    }

    public static final boolean A01(C83403nh c83403nh) {
        String str;
        if (c83403nh != null) {
            str = c83403nh.A0m();
        } else {
            str = null;
        }
        if (!C14360o3.A0K(str, "REPLY")) {
            if (!C14360o3.A0K(c83403nh != null ? c83403nh.A0m() : null, "REACT")) {
                return false;
            }
        }
        if (C14360o3.A0K(c83403nh.A0o(), "NOTE") || C14360o3.A0K(c83403nh.A0o(), "MEDIA_NOTE") || C14360o3.A0K(c83403nh.A0o(), "STORY") || C14360o3.A0K(c83403nh.A0o(), "STORY_HIGHLIGHT")) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00f5, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r10.A0C) > (r4 * 1000)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (X.C18U.A06(r3, r4, r0) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01e8, code lost:
    
        if (r0.booleanValue() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r21.A2P != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0087, code lost:
    
        if (X.AbstractC43594JPz.A0f(r21).AFT(r3, r21) != false) goto L31;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x011a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A03(X.C83403nh r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48516LdE.A03(X.3nh, java.lang.String):boolean");
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A02.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, X.1vN] */
    public static final void A00(C48516LdE c48516LdE, String str, List list, List list2, Map map) {
        C81613kW c81613kW;
        if (!list2.isEmpty()) {
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (true) {
                c81613kW = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (C14360o3.A0K(((C83403nh) next2).A0h(), next)) {
                            if (next2 != null) {
                                A1E.add(next2);
                            }
                        }
                    }
                }
            }
            ArrayList A1E2 = AbstractC166987dD.A1E();
            UserSession userSession = c48516LdE.A00;
            long A01 = C18U.A01(C06090Tz.A06, userSession, 36600276778487644L);
            ArrayList A1E3 = AbstractC166987dD.A1E();
            ArrayList A1E4 = AbstractC166987dD.A1E();
            AbstractC207749He.A00();
            C48516LdE c48516LdE2 = (C48516LdE) userSession.A01(C48516LdE.class, MHS.A00(userSession, 21));
            Iterator it3 = A1E.iterator();
            while (it3.hasNext()) {
                C83403nh A0e = AbstractC43592JPx.A0e(it3);
                String str2 = A0e.A1o;
                if (str2 != null && str2.length() != 0 && A0e.A1S() && c48516LdE2.A03(A0e, str)) {
                    AbstractC161587Lt.A05(A0e, A1E4, A1E3, A1E2, (int) A01);
                }
            }
            if (AbstractC25226BEj.A1b(A1E3)) {
                AbstractC166997dE.A1R(AbstractC161587Lt.A00(A1E3), A1E4, A1E2);
            }
            if (AbstractC25226BEj.A1b(A1E2)) {
                C81663kb A0h = AbstractC31172DnG.A0h((C2DS) c48516LdE.A05.getValue(), str);
                if (A0h != null) {
                    c81613kW = A0h.Aic();
                }
                if (!C161867Mw.A01(userSession, c81613kW)) {
                    AbstractC43592JPx.A0O(c48516LdE.A03).E4s(new Object());
                }
            }
            c48516LdE.A02(str, A1E2, map, 0);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:7|(3:8|9|10)|(4:29|23|24|21)|12|13|14|(2:16|(4:22|23|24|21)(1:18))(1:25)|19|20|21|5) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        X.C0K8.A0G("ArmadilloExpressReceiverFetchRepository", X.AbstractC111324zv.A00(1693), r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0227  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(java.lang.String r52, java.util.List r53, java.util.Map r54, final int r55) {
        /*
            Method dump skipped, instructions count: 869
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48516LdE.A02(java.lang.String, java.util.List, java.util.Map, int):void");
    }
}
