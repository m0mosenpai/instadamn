package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.ACRType;
import com.instagram.api.schemas.FanClubCategoryType;
import com.instagram.direct.model.mentions.SendMentionData$MentionData;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.BgF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26086BgF extends C0T6 {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public String A04;
    public final int A05;

    public static boolean A00(C26086BgF c26086BgF, C26086BgF c26086BgF2) {
        return C14360o3.A0K(c26086BgF.A03, c26086BgF2.A03);
    }

    public static boolean A01(Object obj, int i) {
        if ((obj instanceof C26086BgF) && ((C26086BgF) obj).A05 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26086BgF.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26086BgF.hashCode():int");
    }

    public final void A02(C5Tl c5Tl, int i) {
        int i2;
        C5Hc c5Hc;
        c5Tl.Enr(1616811409);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, this) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-143659978, "com.instagram.compose.fragment.IgActionBarProvider.WithStringTitle.ActionBar (IgActionBarProvider.kt:38)");
            }
            C25707BXs c25707BXs = (C25707BXs) this.A01;
            String str = this.A04;
            String str2 = this.A03;
            InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A02;
            InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) this.A00;
            c5Tl.Eno(1796418241);
            if (interfaceC16620sF == null) {
                c5Hc = null;
            } else {
                c5Hc = (C5Hc) interfaceC16620sF.invoke(c5Tl, AbstractC25227BEk.A0p());
            }
            boolean A1W = AbstractC25228BEl.A1W(c5Tl);
            AbstractC25708BXt.A01(c5Tl, AbstractC25232BEp.A0y(c5Tl, Modifier.A00), c25707BXs, str, str2, interfaceC16820sZ, c5Hc, A1W ? 1 : 0, A1W ? 1 : 0);
            if (C0fH.A02()) {
                C0fH.A00(1041210494);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30499Dbi.A01(ASZ, this, i, 29);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26086BgF(C38321qM c38321qM, User user, String str, int i) {
        this(c38321qM, (EnumC76383bi) null, user, (i & 8) != 0 ? null : str);
        this.A05 = 12;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26086BgF() {
        this(null, null, null, null, null, 5);
        this.A05 = 5;
        this.A05 = 5;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26086BgF(ACRType aCRType, Long l, Long l2, String str) {
        this(aCRType, l2, l, str, null, 5);
        this.A05 = 5;
    }

    public C26086BgF(C4IB c4ib, X9O x9o, String str, String str2, List list) {
        this.A05 = 0;
        C14360o3.A0B(str, 3);
        this.A00 = c4ib;
        this.A02 = list;
        this.A03 = str;
        this.A01 = x9o;
        this.A04 = str2;
    }

    public C26086BgF(C168557fp c168557fp, Integer num, Integer num2, String str, String str2) {
        this.A05 = 2;
        AbstractC167007dF.A1E(str, 2, str2);
        this.A02 = c168557fp;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = num;
        this.A01 = num2;
    }

    public C26086BgF(FanClubCategoryType fanClubCategoryType, User user, User user2, String str, String str2) {
        this.A05 = 1;
        AbstractC167027dH.A0a(1, user, str, str2, fanClubCategoryType);
        C14360o3.A0B(user2, 5);
        this.A00 = user;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = fanClubCategoryType;
        this.A02 = user2;
    }

    public C26086BgF(SendMentionData$MentionData sendMentionData$MentionData, String str, List list) {
        this.A05 = 7;
        String A00 = AbstractC68470VSb.A00();
        this.A05 = 7;
        AbstractC167007dF.A1G(str, 1, A00);
        this.A04 = str;
        this.A02 = sendMentionData$MentionData;
        this.A00 = list;
        this.A01 = null;
        this.A03 = A00;
    }

    public C26086BgF(EnumC193878i8 enumC193878i8, Integer num, Long l, String str, String str2) {
        this.A05 = 6;
        this.A03 = str;
        this.A01 = enumC193878i8;
        this.A00 = num;
        this.A02 = l;
        this.A04 = str2;
    }

    public C26086BgF(C38687GzS c38687GzS, C38687GzS c38687GzS2, Integer num, String str, String str2) {
        this.A05 = 9;
        this.A00 = num;
        this.A04 = str;
        this.A03 = str2;
        this.A01 = c38687GzS;
        this.A02 = c38687GzS2;
    }

    public C26086BgF(Object obj, Object obj2, Object obj3, String str, String str2, int i) {
        this.A05 = i;
        this.A00 = obj;
        this.A02 = obj2;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = obj3;
    }

    public C26086BgF(C25707BXs c25707BXs, String str) {
        this.A05 = 4;
        this.A05 = 4;
        this.A01 = c25707BXs;
        this.A04 = str;
        this.A03 = null;
        this.A02 = null;
        this.A00 = null;
    }

    public C26086BgF(C38321qM c38321qM, EnumC76383bi enumC76383bi, User user, String str) {
        this.A05 = 12;
        this.A01 = user;
        this.A02 = c38321qM;
        this.A00 = enumC76383bi;
        this.A03 = str;
        String A38 = c38321qM.A38();
        this.A04 = A38 == null ? "" : A38;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26086BgF(C38687GzS c38687GzS, C38687GzS c38687GzS2, Integer num, String str) {
        this(c38687GzS, c38687GzS2, num, str, (String) null);
        this.A05 = 9;
    }
}
