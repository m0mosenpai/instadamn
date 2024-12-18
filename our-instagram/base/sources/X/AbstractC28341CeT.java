package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.CeT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28341CeT {
    public static final C2WH A00(AbstractC50812Vc abstractC50812Vc, C2Z1 c2z1, InterfaceC30988Djn interfaceC30988Djn, C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, String str, InterfaceC16820sZ interfaceC16820sZ, float f, int i, boolean z, boolean z2, boolean z3) {
        C3e8 c3e8;
        AbstractC50812Vc c25557BRu;
        C51682Yq c51682Yq;
        AbstractC50812Vc A01;
        AbstractC25229BEm.A1J(c37644Ghd, 4, userSession);
        C75933ay c75933ay = C51722Yv.A02;
        long A0D = AbstractC77623dm.A0D(c2z1, R.dimen.account_group_management_title_text_horizontal_padding);
        Integer num = C05F.A01;
        C51682Yq c51682Yq2 = null;
        C51722Yv A00 = C9CU.A00(null, num, 0, A0D);
        Integer num2 = C05F.A00;
        C51722Yv A0d = AbstractC25230BEn.A0d(A00, num2, 95.0f, 0);
        int i2 = 0;
        int i3 = 0;
        if (z3) {
            i3 = R.dimen.abc_select_dialog_padding_start_material;
        }
        long A0D2 = AbstractC77623dm.A0D(c2z1, i3);
        if (!z3) {
            i2 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
        }
        C51722Yv A002 = C9CV.A00(AbstractC25234BEr.A0E(C9CU.A00(A0d, C05F.A08, 0, AbstractC77623dm.A0B(c2z1)), AbstractC25227BEk.A0Z(0, A0D2), 0, AbstractC77623dm.A0D(c2z1, i2)), num, "android.widget.Button", 0);
        DRT A003 = DRT.A00(interfaceC16820sZ, 12);
        Integer num3 = C05F.A1F;
        C51722Yv A004 = C9CV.A00(A002, num3, A003, 4);
        EnumC77683ds enumC77683ds = EnumC77683ds.CENTER;
        C51722Yv A005 = C9CV.A00(A004, num2, enumC77683ds, 3);
        if (z3) {
            C2XE ArD = c2z1.ArD();
            EnumC76913cd enumC76913cd = EnumC76913cd.GLOBAL;
            A005 = A005.A00(AbstractC25231BEo.A0W(ArD, null, enumC76913cd, "trans_key_clips_cta")).A00(AbstractC25231BEo.A0W(ArD, null, enumC76913cd, "trans_key_dwell_cta"));
            c3e8 = C3e8.FLEX_START;
        } else {
            c3e8 = C3e8.SPACE_BETWEEN;
        }
        EnumC77683ds enumC77683ds2 = EnumC77683ds.FLEX_START;
        C2Z0 A0L = AbstractC25233BEq.A0L(c2z1);
        C51722Yv A0N = AbstractC25234BEr.A0N(null, num, num2, 100.0f, 0);
        EnumC77933eL enumC77933eL = EnumC77933eL.ABSOLUTE;
        Integer num4 = C05F.A0Y;
        A0L.A00(new C26459Bmg(C9CV.A00(A0N, num4, enumC77933eL, 3), AbstractC77623dm.A03(A0L, R.color.grey_2_20_transparent), i, AbstractC77623dm.A0B(A0L), f * 1000.0f));
        if (interfaceC30988Djn == null) {
            c25557BRu = new C75723ad();
        } else {
            c25557BRu = new C25557BRu(C9CV.A00(AbstractC25234BEr.A0N(null, num2, num, 100.0f, 0), num4, enumC77933eL, 3), interfaceC30988Djn, c120985dq, c37644Ghd);
        }
        A0L.A00(c25557BRu);
        C51722Yv A0d2 = AbstractC25230BEn.A0d(AbstractC25234BEr.A0N(null, num, num2, 100.0f, 0), num, 1.0f, 1);
        C2Z0 A13 = AbstractC25232BEp.A13(A0L);
        if (str != null) {
            C51722Yv A006 = C9CV.A00(AbstractC25233BEq.A0V(null, AbstractC25227BEk.A0b(AbstractC77623dm.A0C(A13)), num2, enumC77683ds, 3), C05F.A0N, str, 0);
            C2XE ArD2 = A13.ArD();
            int A0A = AbstractC25230BEn.A0A(ArD2, A13);
            long A05 = AbstractC77623dm.A05(A13);
            Typeface typeface = Typeface.DEFAULT;
            long A0D3 = AbstractC25229BEm.A0D();
            C77723dw A0a = AbstractC25231BEo.A0a(ArD2, null, str, 0);
            AbstractC25233BEq.A1B(A13, A0a, A0A, A05);
            A0a.A0S(1);
            AbstractC25234BEr.A0o(typeface, A13, A0a, A0D3);
            AbstractC25230BEn.A1L(A0a, num2);
            AbstractC25232BEp.A1M(A0a);
            AbstractC25234BEr.A17(A006, A0a, false);
            c51682Yq = A0a.A0A();
        } else {
            c51682Yq = null;
        }
        A13.A00(c51682Yq);
        if (z) {
            if (abstractC50812Vc != null) {
                C51722Yv A0V = AbstractC25233BEq.A0V(null, AbstractC25227BEk.A0b(AbstractC77623dm.A0D(A13, R.dimen.abc_edit_text_inset_bottom_material)), num2, enumC77683ds, 3);
                String A0F = AbstractC77623dm.A0F(A13, 2131961131);
                C2XE ArD3 = A13.ArD();
                int A0A2 = AbstractC25230BEn.A0A(ArD3, A13);
                long A052 = AbstractC77623dm.A05(A13);
                Typeface typeface2 = Typeface.DEFAULT;
                long A0D4 = AbstractC25229BEm.A0D();
                C77723dw A0a2 = AbstractC25231BEo.A0a(ArD3, null, A0F, 0);
                AbstractC25233BEq.A1B(A13, A0a2, A0A2, A052);
                A0a2.A0S(0);
                AbstractC25234BEr.A0o(typeface2, A13, A0a2, A0D4);
                AbstractC25230BEn.A1L(A0a2, num2);
                AbstractC25232BEp.A1M(A0a2);
                AbstractC25234BEr.A17(A0V, A0a2, false);
                c51682Yq2 = A0a2.A0A();
            }
            A13.A00(c51682Yq2);
        }
        AbstractC25231BEo.A1A(abstractC50812Vc, A13, A0L, A0d2);
        if (z2) {
            A01 = new C26624BpL(AbstractC25233BEq.A0V(C9CU.A00(C9CU.A00(null, num2, 0, AbstractC77623dm.A0C(A0L)), num, 0, AbstractC77623dm.A0C(A0L)), AbstractC25225BEi.A0n(C05F.A06, 0, AbstractC25227BEk.A09(A0L)), num2, enumC77683ds, 3), R.drawable.nav_spinner);
        } else {
            A01 = A01(A0L, AbstractC25233BEq.A0V(null, AbstractC25225BEi.A0n(num3, 0, AbstractC77623dm.A0C(A0L)), num2, enumC77683ds, 3));
        }
        A0L.A00(A01);
        return AbstractC76963ci.A0K(A0L, c2z1, A005, enumC77683ds2, c3e8);
    }

    public static final C26629BpQ A02(C2Z1 c2z1, C51722Yv c51722Yv, int i) {
        int A09 = AbstractC25228BEl.A09(c2z1, i);
        float A0A = AbstractC25228BEl.A0A(c2z1, AbstractC77623dm.A0B(c2z1));
        C75933ay c75933ay = C51722Yv.A02;
        return new C26629BpQ(AbstractC25234BEr.A0K(AbstractC25233BEq.A0e(C05F.A01, 100.0f, 0), C05F.A00, 0).A00(c51722Yv), A0A, A09);
    }

    public static final C80393iU A01(C2Z1 c2z1, C51722Yv c51722Yv) {
        Drawable A0N = AbstractC25228BEl.A0N(c2z1, R.drawable.chevron_right);
        Context context = c2z1.ArD().A0C;
        AbstractC25231BEo.A0x(context, A0N, AbstractC53242c7.A05(context));
        return AbstractC25234BEr.A0O(A0N, c2z1.ArD(), c51722Yv);
    }
}
