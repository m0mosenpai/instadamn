package X;

import android.content.Context;
import android.graphics.Typeface;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.BmL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26438BmL extends AbstractC51572Yf {
    public final CR2 A00;
    public final C120985dq A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final HashMap A04;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        String str;
        C111034zF c111034zF;
        C38321qM c38321qM;
        ImageUrl A1S;
        C14360o3.A0B(c76223bS, 0);
        C120985dq c120985dq = this.A01;
        C38661Gz2 A02 = c120985dq.A02();
        if (A02 != null) {
            str = A02.A0D;
        } else {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (A02 != null) {
            String str3 = A02.A0A;
            if (str3 == null) {
                str3 = "";
            }
            List list = A02.A0F;
            if (list != null && (c111034zF = (C111034zF) AbstractC001800i.A0O(list, 0)) != null && (c38321qM = c111034zF.A00) != null && (A1S = c38321qM.A1S()) != null) {
                String str4 = A02.A07;
                if (str4 != null) {
                    str2 = str4;
                }
                Object A00 = AbstractC77183d4.A00(c76223bS, DFA.A00, new Object[0]);
                C75933ay c75933ay = C51722Yv.A02;
                long A09 = AbstractC25227BEk.A09(c76223bS);
                Integer num = C05F.A08;
                C51722Yv A002 = C9CU.A00(null, num, 0, A09);
                long A04 = AbstractC77623dm.A04(c76223bS);
                Integer num2 = C05F.A04;
                C51722Yv A003 = C9CU.A00(A002, num2, 0, A04);
                Integer num3 = C05F.A0N;
                C51722Yv A004 = C9CV.A00(A003, num3, str, 0);
                long A0D = AbstractC77623dm.A0D(c76223bS, R.dimen.avatar_search_sticker_tray_text_size);
                C2XE c2xe = c76223bS.A05;
                Context context = c2xe.A0C;
                int A022 = AbstractC25232BEp.A02(context, c76223bS);
                Typeface typeface = Typeface.DEFAULT;
                long A0D2 = AbstractC25229BEm.A0D();
                Integer num4 = C05F.A00;
                C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, str, 0);
                AbstractC25233BEq.A19(c76223bS, A0a, A022, A0D);
                A0a.A0S(1);
                AbstractC25234BEr.A0n(typeface, c76223bS, A0a, A0D2);
                AbstractC25230BEn.A1L(A0a, num4);
                AbstractC25230BEn.A1J(A0a, 1.09f, false);
                A0a.A0M(2);
                AbstractC25234BEr.A17(A004, A0a, false);
                C51682Yq A0A = A0a.A0A();
                C51722Yv A0V = AbstractC25233BEq.A0V(C9CU.A00(null, num, 0, AbstractC77623dm.A04(c76223bS)), AbstractC25230BEn.A0h(c76223bS, num2, R.dimen.abc_dropdownitem_icon_width, 0), num3, str3, 0);
                int A092 = AbstractC25228BEl.A09(c76223bS, AbstractC53242c7.A0E(context));
                long A05 = AbstractC77623dm.A05(c76223bS);
                C77723dw A0a2 = AbstractC25231BEo.A0a(c2xe, null, str3, 0);
                AbstractC25233BEq.A19(c76223bS, A0a2, A092, A05);
                A0a2.A0S(0);
                AbstractC25234BEr.A0n(typeface, c76223bS, A0a2, A0D2);
                A0a2.A0B();
                AbstractC25233BEq.A1E(A0a2, num4, 1.09f, false);
                A0a2.A0M(3);
                AbstractC25234BEr.A17(A0V, A0a2, false);
                C51682Yq A0A2 = A0a2.A0A();
                C51722Yv A0d = AbstractC25230BEn.A0d(null, num4, 100.0f, 0);
                Integer num5 = C05F.A01;
                C51722Yv A0d2 = AbstractC25230BEn.A0d(A0d, num5, 100.0f, 0);
                C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
                InterfaceC11380iw interfaceC11380iw = this.A02;
                A0P.A00(new C26412Blv(A1S, interfaceC11380iw));
                C51722Yv A005 = C9CU.A00(AbstractC25230BEn.A0d(null, num5, 1.0f, 1), C05F.A15, 0, AbstractC77623dm.A0D(A0P, R.dimen.abc_dropdownitem_icon_width));
                C2Z0 A13 = AbstractC25232BEp.A13(A0P);
                A13.A00(new C26579Boc(c120985dq, interfaceC11380iw, this.A03, this.A04));
                A13.A00(A0A);
                A13.A00(A0A2);
                C51722Yv A0Y = AbstractC25233BEq.A0Y(AbstractC25233BEq.A0Y(null, A13, num, R.dimen.abc_dialog_padding_material, 0), A13, num2, R.dimen.abc_dropdownitem_icon_width, 0);
                C2Z0 A0K = AbstractC25233BEq.A0K(A13);
                A0K.A00(new C26411Blu(DH2.A01(c120985dq, A00, this, 37), str2, AbstractC53242c7.A0H(A0K.A00.A0C, R.attr.igds_color_text_on_white)));
                AbstractC25231BEo.A19(AbstractC76963ci.A0F(A0K, A13, A0Y), A13, A0P, A005);
                return AbstractC76963ci.A05(A0P, c76223bS, A0d2);
            }
        }
        throw AbstractC166997dE.A0g();
    }

    public C26438BmL(C120985dq c120985dq, InterfaceC11380iw interfaceC11380iw, UserSession userSession, CR2 cr2, HashMap hashMap) {
        AbstractC25234BEr.A1P(interfaceC11380iw, userSession, hashMap);
        this.A02 = interfaceC11380iw;
        this.A03 = userSession;
        this.A01 = c120985dq;
        this.A04 = hashMap;
        this.A00 = cr2;
    }
}
