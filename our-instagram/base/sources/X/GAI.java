package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class GAI implements GZH {
    public final UserSession A00;
    public final java.util.Set A01 = AbstractC16830sb.A07(EnumC33370Ep3.A0D, EnumC33370Ep3.A0F, EnumC33370Ep3.A0E);
    public final InterfaceC16820sZ A02;

    @Override // X.GZH
    public final boolean AFW(EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        C14360o3.A0B(enumC33370Ep3, 1);
        return this.A01.contains(enumC33370Ep3);
    }

    @Override // X.GZH
    public final void AJb(View view, MUD mud, EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        String str;
        List list;
        List unmodifiableList;
        FRG frg;
        String str2;
        List list2;
        List unmodifiableList2;
        C34711FQw c34711FQw;
        String str3;
        List list3;
        List unmodifiableList3;
        C34711FQw c34711FQw2;
        String str4;
        InterfaceC16660sJ interfaceC16660sJ;
        C14360o3.A0B(c5hw, 0);
        C14360o3.A0B(enumC33370Ep3, 1);
        C35023Fbw c35023Fbw = c5hw.A01;
        if (c35023Fbw != null && (str = c35023Fbw.A02) != null && (list = c35023Fbw.A04) != null && (unmodifiableList = Collections.unmodifiableList(list)) != null && (frg = (FRG) AbstractC001800i.A0J(unmodifiableList)) != null && (str2 = frg.A01) != null && frg.A03 != null && (list2 = frg.A05) != null && (unmodifiableList2 = Collections.unmodifiableList(list2)) != null && (c34711FQw = (C34711FQw) AbstractC001800i.A0O(unmodifiableList2, 0)) != null && (str3 = c34711FQw.A00) != null && c34711FQw.A01 != null && (list3 = frg.A05) != null && (unmodifiableList3 = Collections.unmodifiableList(list3)) != null && (c34711FQw2 = (C34711FQw) AbstractC001800i.A0O(unmodifiableList3, 1)) != null && (str4 = c34711FQw2.A00) != null && c34711FQw2.A01 != null) {
            String str5 = c35023Fbw.A00;
            String str6 = "";
            if (str5 == null) {
                str5 = "";
            }
            String str7 = c35023Fbw.A03;
            if (str7 != null) {
                str6 = str7;
            }
            int ordinal = enumC33370Ep3.ordinal();
            if (ordinal != 11 && ordinal != 12) {
                if (ordinal == 13) {
                    interfaceC16660sJ = C30095DOd.A00;
                }
                this.A02.invoke();
            }
            if (enumC33370Ep3 == EnumC33370Ep3.A0E) {
                str4 = str3;
            }
            C34662FOv c34662FOv = FE7.A00;
            UserSession userSession = this.A00;
            String valueOf = String.valueOf(c5hw.A00);
            String str8 = c5hw.A09;
            C14360o3.A07(str8);
            c34662FOv.A00(userSession, str, str2, "activity_feed", valueOf, str8, str5, str6, AbstractC167007dF.A0n(str2, AbstractC166987dD.A1J(str4)));
            interfaceC16660sJ = C30094DOc.A00;
            BJJ.A00(c5hw, interfaceC16660sJ);
            this.A02.invoke();
        }
    }

    public GAI(UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = userSession;
        this.A02 = interfaceC16820sZ;
    }
}
