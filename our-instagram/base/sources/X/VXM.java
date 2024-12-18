package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class VXM {
    public static final C51652Mrj A00(UserSession userSession, C67842UzF c67842UzF) {
        boolean z;
        C14360o3.A0B(c67842UzF, 0);
        java.util.Set<String> set = c67842UzF.A09;
        if (set == null) {
            set = C16910sj.A00;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : set) {
            User A02 = AnonymousClass189.A00(userSession).A02(str);
            if (A02 == null) {
                C4LM.A02.A02(userSession, null, str);
            } else {
                arrayList.add(A02);
            }
        }
        java.util.Set A0k = AbstractC001800i.A0k(arrayList);
        int i = c67842UzF.A02;
        List list = c67842UzF.A08;
        int i2 = c67842UzF.A01;
        boolean z2 = c67842UzF.A0D;
        String str2 = c67842UzF.A07;
        boolean z3 = c67842UzF.A0A;
        boolean z4 = c67842UzF.A0F;
        boolean z5 = c67842UzF.A0H;
        boolean z6 = c67842UzF.A0G;
        EnumC109104va enumC109104va = c67842UzF.A03;
        java.util.Set set2 = c67842UzF.A09;
        if (set2 == null) {
            set2 = C16910sj.A00;
        }
        int i3 = c67842UzF.A00;
        boolean z7 = c67842UzF.A0C;
        boolean z8 = c67842UzF.A0B;
        O90 o90 = c67842UzF.A06;
        OB7 ob7 = c67842UzF.A05;
        C69167Viw c69167Viw = c67842UzF.A04;
        if (enumC109104va != null) {
            z = enumC109104va.A00();
        } else {
            z = false;
        }
        return new C51652Mrj(enumC109104va, c69167Viw, ob7, o90, str2, list, set2, A0k, i, i2, i3, z2, z3, z4, z5, z6, z7, z8, z, c67842UzF.A0E);
    }
}
