package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.6gK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC144996gK {
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00de, code lost:
    
        if (r17.isEmpty() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011a, code lost:
    
        if (r0.A4t() == true) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00c9, code lost:
    
        if (r0.A6i(r36) == false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C145006gL A01(com.instagram.common.session.UserSession r36, X.C41181vS r37, X.C148426mC r38, X.C149766oT r39, com.instagram.user.model.User r40, java.util.List r41, java.util.List r42) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC144996gK.A01(com.instagram.common.session.UserSession, X.1vS, X.6mC, X.6oT, com.instagram.user.model.User, java.util.List, java.util.List):X.6gL");
    }

    public static final LinkedHashMap A02(C38321qM c38321qM) {
        List C1L;
        List<InterfaceC38901rP> A00;
        if (c38321qM != null && (C1L = c38321qM.A0C.C1L()) != null && (A00 = AbstractC50567MTy.A00(C1L)) != null) {
            int A0L = AbstractC16850sd.A0L(AbstractC06950Ym.A1E(A00, 10));
            if (A0L < 16) {
                A0L = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
            for (InterfaceC38901rP interfaceC38901rP : A00) {
                linkedHashMap.put(interfaceC38901rP.getPk(), interfaceC38901rP);
            }
            return linkedHashMap;
        }
        return null;
    }

    public static final List A03(C38321qM c38321qM) {
        List C1L;
        List<InterfaceC38901rP> A00;
        if (c38321qM != null && (C1L = c38321qM.A0C.C1L()) != null && (A00 = AbstractC50567MTy.A00(C1L)) != null) {
            ArrayList<C84923qg> arrayList = new ArrayList(AbstractC06950Ym.A1E(A00, 10));
            for (InterfaceC38901rP interfaceC38901rP : A00) {
                C84923qg c84923qg = null;
                if ((interfaceC38901rP instanceof C38891rO) && interfaceC38901rP != null) {
                    c84923qg = new C84923qg(interfaceC38901rP);
                }
                arrayList.add(c84923qg);
            }
            for (C84923qg c84923qg2 : arrayList) {
                if (c84923qg2 != null) {
                    c84923qg2.A01(c38321qM);
                }
            }
            return arrayList;
        }
        return null;
    }

    public static final List A04(C38321qM c38321qM) {
        List C1L;
        List A00;
        if (c38321qM != null && (C1L = c38321qM.A0C.C1L()) != null && (A00 = AbstractC50567MTy.A00(C1L)) != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A00, 10));
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                arrayList.add(A00((InterfaceC38901rP) it.next()));
            }
            return arrayList;
        }
        return null;
    }

    public static final boolean A05(C41181vS c41181vS, C149766oT c149766oT) {
        EnumC76383bi enumC76383bi;
        UserSession userSession = c149766oT.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36318221980145700L)) {
            if (C18U.A06(c06090Tz, userSession, 36320279270072564L)) {
                if (c41181vS != null) {
                    enumC76383bi = c41181vS.A0B();
                } else {
                    enumC76383bi = null;
                }
                if (enumC76383bi == EnumC76383bi.A0A) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static final C9CN A00(InterfaceC38901rP interfaceC38901rP) {
        String str;
        ImageUrl imageUrl;
        String pk = interfaceC38901rP.getPk();
        User CDj = interfaceC38901rP.CDj();
        String str2 = null;
        if (CDj != null) {
            str = CDj.getId();
        } else {
            str = null;
        }
        User CDj2 = interfaceC38901rP.CDj();
        if (CDj2 != null) {
            imageUrl = CDj2.Bhu();
        } else {
            imageUrl = null;
        }
        User CDj3 = interfaceC38901rP.CDj();
        if (CDj3 != null) {
            str2 = CDj3.getUsername();
        }
        return new C9CN(imageUrl, pk, str, str2, interfaceC38901rP.getText());
    }
}
