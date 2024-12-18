package X;

import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.leadgen.core.model.LeadGenConditionalAnswerInfo;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.core.model.LeadGenTrustSignal;
import com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload;
import com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimer;
import com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerBody;
import com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerBodyUrlRanges;
import com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerCheckbox;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Oet, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55226Oet {
    public static final C55226Oet A00 = new Object();

    public static final C51633MrQ A00(OLJ olj) {
        Integer num;
        C41108IHz c41108IHz = olj.A00.A03;
        if (c41108IHz != null) {
            String str = olj.A00().A01;
            ImageUrl imageUrl = olj.A00().A00;
            String str2 = c41108IHz.A03;
            if (str2 == null) {
                str2 = "";
            }
            C5QE A01 = C55205OeH.A01(str2);
            List A0a = AbstractC001800i.A0a(c41108IHz.A00);
            if (c41108IHz.A02 == EnumC53296NhY.LIST_STYLE) {
                num = C05F.A01;
            } else {
                num = C05F.A00;
            }
            return new C51633MrQ(A01, imageUrl, null, num, str, A0a, 0, 0, false);
        }
        return null;
    }

    public static final LeadGenCustomDisclaimer A02(OAQ oaq) {
        if (oaq == null) {
            return null;
        }
        O85 o85 = oaq.A01;
        String str = o85.A01;
        ImmutableList immutableList = o85.A00;
        ArrayList A0q = AbstractC167017dG.A0q(immutableList);
        Iterator<E> it = immutableList.iterator();
        while (it.hasNext()) {
            OAP oap = (OAP) it.next();
            A0q.add(new LeadGenCustomDisclaimerBodyUrlRanges(oap.A01, oap.A00, oap.A02));
        }
        LeadGenCustomDisclaimerBody leadGenCustomDisclaimerBody = new LeadGenCustomDisclaimerBody(str, A0q);
        String str2 = oaq.A02;
        ImmutableList immutableList2 = oaq.A00;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator<E> it2 = immutableList2.iterator();
        while (it2.hasNext()) {
            C54647OBz c54647OBz = (C54647OBz) it2.next();
            String str3 = c54647OBz.A00;
            if (str3 != null) {
                A1E.add(new LeadGenCustomDisclaimerCheckbox(c54647OBz.A01, str3, c54647OBz.A02, c54647OBz.A03));
            }
        }
        return new LeadGenCustomDisclaimer(leadGenCustomDisclaimerBody, str2, A1E);
    }

    public static final String A03(Bundle bundle) {
        EnumC53203Nfz enumC53203Nfz;
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("first_question_sticker_mcq_answer_value");
        if (string != null && string.length() != 0) {
            enumC53203Nfz = EnumC53203Nfz.A03;
        } else {
            String string2 = bundle.getString("first_question_sticker_saq_answer_value");
            if (string2 == null || string2.length() == 0) {
                return null;
            }
            enumC53203Nfz = EnumC53203Nfz.A04;
        }
        return enumC53203Nfz.toString();
    }

    public static final boolean A07(OLJ olj) {
        VEF vef;
        C1LC A0I = AbstractC43592JPx.A0I(olj.A01().A00);
        while (A0I.hasNext()) {
            C69484Vo7 c69484Vo7 = (C69484Vo7) A0I.next();
            VG1 vg1 = c69484Vo7.A0B;
            VEF[] values = VEF.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    vef = values[i];
                    if (vef.A00 == vg1) {
                        break;
                    }
                    i++;
                } else {
                    vef = VEF.A0X;
                    break;
                }
            }
            if (vef == VEF.A06 && c69484Vo7.A0D == EnumC68196VFo.CONDITIONAL_ANSWER) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A0A(LeadGenTrustSignalsPayload leadGenTrustSignalsPayload) {
        int i;
        String str;
        String str2;
        Integer A0i;
        if (leadGenTrustSignalsPayload == null) {
            return false;
        }
        LeadGenTrustSignal leadGenTrustSignal = leadGenTrustSignalsPayload.A02;
        if (leadGenTrustSignal != null && (str2 = leadGenTrustSignal.A02) != null && (A0i = AbstractC003100w.A0i(str2)) != null) {
            i = A0i.intValue();
        } else {
            i = 0;
        }
        LeadGenTrustSignal leadGenTrustSignal2 = leadGenTrustSignalsPayload.A03;
        return !(leadGenTrustSignal2 == null || (str = leadGenTrustSignal2.A02) == null || str.length() == 0) || i >= 50000;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload A0B(X.OFS r18) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55226Oet.A0B(X.OFS):com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload");
    }

    public static final LeadGenTrustSignal A01(EnumC53274NhC enumC53274NhC, Integer num, String str) {
        if (num != null) {
            return new LeadGenTrustSignal(enumC53274NhC, str, num.intValue());
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final Map A05(List list) {
        ?? r2;
        if (list != null && !list.isEmpty()) {
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                O84 o84 = (O84) it.next();
                String str = o84.A01;
                if (str != null) {
                    ImmutableList immutableList = o84.A00;
                    if (immutableList != null) {
                        r2 = AbstractC167017dG.A0q(immutableList);
                        Iterator it2 = immutableList.iterator();
                        while (it2.hasNext()) {
                            String str2 = ((O84) it2.next()).A01;
                            if (str2 == null) {
                                str2 = "";
                            }
                            r2.add(str2);
                        }
                    } else {
                        r2 = C16930sl.A00;
                    }
                    A1I.put(str, new LeadGenConditionalAnswerInfo(r2, A05(immutableList)));
                }
            }
            return A1I;
        }
        return AbstractC06930Yk.A0E();
    }

    public static final boolean A08(OLJ olj) {
        LeadGenFormBaseQuestion leadGenFormBaseQuestion;
        List list;
        if (olj == null || (leadGenFormBaseQuestion = (LeadGenFormBaseQuestion) AbstractC001800i.A0O(A04(null, olj.A01().A00, false, false, false), 0)) == null || (list = leadGenFormBaseQuestion.A0C) == null || list.isEmpty() || olj.A00.A07 == null) {
            return false;
        }
        return true;
    }

    public static final boolean A09(OLJ olj, boolean z) {
        C55226Oet c55226Oet = A00;
        if (!A08(olj) && !olj.A02()) {
            C69475Vny c69475Vny = olj.A00;
            if (c69475Vny.A00 == null && !A07(olj) && !c55226Oet.A06(olj)) {
                Iterator<E> it = olj.A01().A00.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((C69484Vo7) next).A0B == VG1.A06) {
                        if (next != null) {
                            return true;
                        }
                    }
                }
                if (c69475Vny.A0A != null || z) {
                    return true;
                }
                C1LC A0I = AbstractC43592JPx.A0I(olj.A01().A00);
                while (A0I.hasNext()) {
                    C69484Vo7 c69484Vo7 = (C69484Vo7) A0I.next();
                    C14360o3.A0A(c69484Vo7);
                    ImmutableList immutableList = c69484Vo7.A03;
                    if (immutableList != null && !immutableList.isEmpty() && c69484Vo7.A0H != null && c69484Vo7.A08 > 0) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0162, code lost:
    
        if (X.AbstractC25225BEi.A1Y(r8) != true) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0184, code lost:
    
        if (r47 == false) goto L101;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.0sl] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList A04(com.instagram.common.session.UserSession r44, java.util.List r45, boolean r46, boolean r47, boolean r48) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55226Oet.A04(com.instagram.common.session.UserSession, java.util.List, boolean, boolean, boolean):java.util.ArrayList");
    }

    private final boolean A06(OLJ olj) {
        ImmutableList immutableList = olj.A01().A00;
        if (immutableList != null) {
            Iterator<E> it = immutableList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                VG1 vg1 = ((C69484Vo7) next).A0B;
                if (vg1 == VG1.A0S || vg1 == VG1.A0T) {
                    if (next != null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        if (r2 != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0C(com.instagram.common.session.UserSession r7, X.OLJ r8, boolean r9, boolean r10, boolean r11, boolean r12) {
        /*
            r6 = this;
            X.AbstractC167017dG.A1N(r7, r8)
            r5 = 0
            if (r9 != 0) goto L5b
            if (r10 != 0) goto L5b
            if (r11 != 0) goto L5b
            X.Vny r4 = r8.A00
            X.IHz r0 = r4.A03
            if (r0 == 0) goto L5b
            boolean r0 = A08(r8)
            if (r0 != 0) goto L4b
            boolean r0 = A07(r8)
            if (r0 != 0) goto L4b
            java.util.List r0 = r4.A0A
            if (r0 != 0) goto L4b
            boolean r0 = r8.A02()
            if (r0 != 0) goto L4b
            boolean r0 = r6.A06(r8)
            if (r0 != 0) goto L4b
            X.ViQ r0 = r8.A01()
            com.google.common.collect.ImmutableList r0 = r0.A00
            java.util.Iterator r3 = r0.iterator()
        L36:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L5c
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.Vo7 r0 = (X.C69484Vo7) r0
            X.VG1 r1 = r0.A0B
            X.VG1 r0 = X.VG1.A06
            if (r1 != r0) goto L36
            if (r2 == 0) goto L5c
        L4b:
            if (r12 != 0) goto L5a
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36330071794926249(0x811202000042a9, double:3.038621920343914E-306)
            boolean r0 = X.C18U.A06(r2, r7, r0)
            if (r0 == 0) goto L5b
        L5a:
            r5 = 1
        L5b:
            return r5
        L5c:
            boolean r0 = r4.A0E
            if (r0 == 0) goto L5b
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55226Oet.A0C(com.instagram.common.session.UserSession, X.OLJ, boolean, boolean, boolean, boolean):boolean");
    }
}
