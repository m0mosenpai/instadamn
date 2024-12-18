package X;

import android.content.res.Resources;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ead, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32712Ead extends Dz7 {
    @Override // X.Dz7
    public final C32055E6h A03(C37838Gks c37838Gks, EnumC33345Eoe enumC33345Eoe, User user, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2, String str3, String str4, ArrayList arrayList, List list, int i, boolean z) {
        String str5;
        String str6 = str2;
        C32055E6h A03 = super.A03(c37838Gks, enumC33345Eoe, user, bool, bool2, bool3, bool4, str, str6, str3, str4, arrayList, list, i, z);
        Resources resources = this.A01;
        if (user != null) {
            str5 = user.getUsername();
        } else {
            str5 = "";
        }
        String A0r = AbstractC166997dE.A0r(resources, str5, 2131971094);
        if (str != null) {
            if (str2 == null) {
                str6 = AnonymousClass001.A0B(A0r);
                C14360o3.A07(str6);
            }
            C45209Jzp c45209Jzp = new C45209Jzp(null, null, str, str6);
            List list2 = A03.A0E;
            List list3 = A03.A0C;
            List list4 = A03.A0F;
            List list5 = A03.A0D;
            String str7 = A03.A0A;
            String str8 = A03.A09;
            User user2 = A03.A04;
            Boolean bool5 = A03.A06;
            Boolean bool6 = A03.A07;
            C37838Gks c37838Gks2 = A03.A01;
            EnumC33345Eoe enumC33345Eoe2 = A03.A03;
            int i2 = A03.A00;
            boolean z2 = A03.A0G;
            boolean z3 = A03.A0H;
            Boolean bool7 = A03.A08;
            ArrayList arrayList2 = A03.A0B;
            Boolean bool8 = A03.A05;
            C14360o3.A0B(list2, 0);
            AbstractC167007dF.A1D(list3, 1, list4);
            return new C32055E6h(c37838Gks2, c45209Jzp, enumC33345Eoe2, user2, bool5, bool6, bool7, bool8, str7, str8, arrayList2, list2, list3, list4, list5, i2, z2, z3);
        }
        return A03;
    }
}
