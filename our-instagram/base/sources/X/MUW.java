package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.api.schemas.BillingWizardName;
import com.instagram.api.schemas.TemplatesBrowserSectionSize;
import com.instagram.api.schemas.UndoStyle;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.leadgen.core.api.LeadGenInfoFieldTypes;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class MUW extends C0T6 {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public final int A04;

    public final Reel A03(UserSession userSession) {
        Object obj;
        C14360o3.A0B(userSession, 0);
        Iterator it = A04(userSession).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!((Reel) obj).A16(userSession)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Reel reel = (Reel) obj;
        if (reel == null) {
            return (Reel) A04(userSession).get(0);
        }
        return reel;
    }

    public final ArrayList A04(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        List<C37771pE> list = (List) this.A01;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        for (C37771pE c37771pE : list) {
            C1OU c1ou = C1OU.$redex_init_class;
            ReelStore A03 = ReelStore.A03(userSession);
            C14360o3.A07(A03);
            A0q.add(A03.A0I(c37771pE, false));
        }
        return A0q;
    }

    public static boolean A00(MUW muw, MUW muw2) {
        return C14360o3.A0K(muw.A03, muw2.A03);
    }

    public static boolean A01(MUW muw, MUW muw2) {
        return C14360o3.A0K(muw.A02, muw2.A02);
    }

    public static boolean A02(Object obj, int i) {
        if ((obj instanceof MUW) && ((MUW) obj).A04 == i) {
            return true;
        }
        return false;
    }

    public final Map A05() {
        LinkedHashMap A18;
        Map map = (Map) this.A00;
        if (map == null) {
            String str = this.A03;
            C14360o3.A0B(str, 0);
            if (!AbstractC001900j.A0a(str, "root", false)) {
                Object[] array = AbstractC001900j.A0R(str, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0).toArray(new String[0]);
                A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(array.length));
                for (Object obj : array) {
                    List A0m = AbstractC167007dF.A0m((String) obj, ":", 0);
                    A18.put(AbstractC25228BEl.A1A(AbstractC25226BEj.A1I(A0m, 0)), AbstractC25228BEl.A1A(AbstractC25226BEj.A1I(A0m, 1)));
                }
            } else {
                Object[] array2 = AbstractC001900j.A0R(str, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0).toArray(new String[0]);
                A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(array2.length));
                for (Object obj2 : array2) {
                    String str2 = (String) obj2;
                    int A08 = AbstractC001900j.A08(str2, ":", 0, false);
                    A18.put(AbstractC25228BEl.A1A(AbstractC25227BEk.A0w(str2, 0, A08)), AbstractC25228BEl.A1A(AbstractC25227BEk.A0w(str2, A08 + 1, str2.length())));
                }
            }
            TreeMap treeMap = new TreeMap(A18);
            this.A00 = treeMap;
            return treeMap;
        }
        return map;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MUW.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MUW.hashCode():int");
    }

    public final String toString() {
        StringBuilder A1C;
        String str;
        switch (this.A04) {
            case 5:
                A1C = AbstractC166987dD.A1C();
                A1C.append("UiState(firstFrameImagePath=");
                A1C.append(this.A02);
                A1C.append(", previewImagePath=");
                A1C.append(this.A03);
                A1C.append(", selectedItem=");
                A1C.append(this.A01);
                A1C.append(", items=");
                A1C.append(this.A00);
                break;
            case 17:
                A1C = AbstractC166987dD.A1C();
                A1C.append("RtcCallParticipantState(displayName=");
                A1C.append(this.A02);
                A1C.append(", userId=");
                A1C.append(this.A03);
                A1C.append(", avatarUrl=");
                A1C.append(this.A00);
                A1C.append(", state=");
                Integer num = (Integer) this.A01;
                if (num != null) {
                    str = AbstractC54172Nx8.A00(num);
                } else {
                    str = "null";
                }
                A1C.append(str);
                break;
            default:
                return super.toString();
        }
        return AbstractC167017dG.A0p(A1C);
    }

    public MUW(C50679MYx c50679MYx, Integer num, String str, String str2) {
        this.A04 = 6;
        AbstractC37302Gc3.A1U(c50679MYx, str2);
        this.A02 = str;
        this.A00 = num;
        this.A01 = c50679MYx;
        this.A03 = str2;
    }

    public MUW(InterfaceC58214PrK interfaceC58214PrK, BillingWizardName billingWizardName, String str, String str2) {
        this.A04 = 2;
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A00 = billingWizardName;
        this.A01 = interfaceC58214PrK;
        this.A03 = str2;
    }

    public MUW(ImageUrl imageUrl, Integer num, String str, String str2, int i) {
        this.A04 = i;
        if (8 - i != 0) {
            AbstractC167027dH.A0a(1, str, str2, imageUrl, num);
            this.A02 = str;
            this.A03 = str2;
            this.A00 = imageUrl;
            this.A01 = num;
            return;
        }
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = imageUrl;
        this.A00 = num;
    }

    public MUW(UndoStyle undoStyle, Integer num, String str, String str2) {
        this.A04 = 9;
        this.A02 = str;
        this.A00 = num;
        this.A03 = str2;
        this.A01 = undoStyle;
    }

    public MUW(C211819a8 c211819a8, String str, String str2, C5Hb c5Hb) {
        this.A04 = 5;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = c211819a8;
        this.A00 = c5Hb;
    }

    public MUW(ImageUrl imageUrl, String str, String str2, List list) {
        this.A04 = 13;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = imageUrl;
        this.A00 = list;
    }

    public MUW(Float f, Float f2, String str, String str2) {
        this.A04 = 4;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = f;
        this.A01 = f2;
    }

    public MUW(LeadGenFormBaseQuestion leadGenFormBaseQuestion, String str, String str2, List list) {
        this.A04 = 10;
        AbstractC25233BEq.A0w(1, str, str2, list);
        this.A03 = str;
        this.A01 = leadGenFormBaseQuestion;
        this.A02 = str2;
        this.A00 = list;
    }

    public MUW(String str, String str2, List list, List list2) {
        this.A04 = 16;
        AbstractC167017dG.A1P(str, list);
        this.A02 = str;
        this.A01 = list;
        this.A03 = str2;
        this.A00 = list2;
    }

    public MUW(C2Fb c2Fb, String str, InterfaceC16820sZ interfaceC16820sZ) {
        this.A04 = 15;
        this.A02 = str;
        this.A03 = "https://business.facebook.com/business/help/metrics-labeling";
        this.A01 = c2Fb;
        this.A00 = interfaceC16820sZ;
    }

    public MUW(C26086BgF c26086BgF, String str, String str2, List list) {
        this.A04 = 11;
        C14360o3.A0B(list, 2);
        this.A00 = c26086BgF;
        this.A01 = list;
        this.A02 = str;
        this.A03 = str2;
    }

    public MUW(LeadGenInfoFieldTypes leadGenInfoFieldTypes, String str, List list) {
        this.A04 = 12;
        AbstractC43594JPz.A1P(str, leadGenInfoFieldTypes);
        this.A02 = null;
        this.A03 = str;
        this.A00 = list;
        this.A01 = leadGenInfoFieldTypes;
    }

    public MUW(InterfaceC111084zP interfaceC111084zP, TemplatesBrowserSectionSize templatesBrowserSectionSize, String str, String str2) {
        this.A04 = 3;
        C14360o3.A0B(str, 2);
        AbstractC167007dF.A1F(templatesBrowserSectionSize, 3, str2);
        this.A00 = interfaceC111084zP;
        this.A02 = str;
        this.A01 = templatesBrowserSectionSize;
        this.A03 = str2;
    }

    public MUW(Object obj, Object obj2, String str, String str2, int i) {
        this.A04 = i;
        this.A01 = obj;
        this.A00 = obj2;
        this.A03 = str;
        this.A02 = str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MUW(Boolean bool, Integer num, String str, String str2, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this((Object) null, (Object) null, (String) null, (String) null, 18);
        this.A04 = 18;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MUW() {
        this((C211819a8) null, (String) null, (String) null, C5HZ.A01);
        this.A04 = 5;
    }

    public MUW(C54712OEo c54712OEo, String str, String str2) {
        this.A04 = 0;
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = c54712OEo;
        if (AbstractC001900j.A0T(str2)) {
            throw AbstractC166987dD.A12("invalid config");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MUW(java.lang.Integer r9, java.lang.Integer r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            r8 = this;
            r3 = r10
            r6 = r12
            r7 = 7
            r2 = r8
            r8.A04 = r7
            r0 = r13 & 4
            r1 = 0
            if (r0 == 0) goto Lc
            r6 = r1
        Lc:
            r0 = r13 & 8
            if (r0 == 0) goto L11
            r3 = r1
        L11:
            r4 = r9
            r5 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MUW.<init>(java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, int):void");
    }
}
