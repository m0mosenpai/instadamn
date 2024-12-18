package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.BlP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26380BlP extends AbstractC51572Yf {
    public final C120985dq A00;
    public final InterfaceC31137Dmc A01;
    public final C37644Ghd A02;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        boolean A1Z = AbstractC25225BEi.A1Z(c76223bS);
        long A0D = AbstractC77623dm.A0D(c76223bS, R.dimen.ai_sticker_creation_suggested_prompt_pill_height);
        Integer num = C05F.A00;
        C51722Yv A00 = C9CU.A00(null, num, A1Z ? 1 : 0, A0D);
        long A0D2 = AbstractC77623dm.A0D(c76223bS, R.dimen.ai_sticker_creation_suggested_prompt_pill_height);
        Integer num2 = C05F.A01;
        C51722Yv A0d = AbstractC25230BEn.A0d(C9CU.A00(A00, num2, A1Z ? 1 : 0, A0D2), num2, 0.0f, 1);
        Integer num3 = C05F.A0C;
        C51722Yv A0d2 = AbstractC25230BEn.A0d(A0d, num3, 0.0f, 1);
        Drawable A0N = AbstractC25228BEl.A0N(c76223bS, R.drawable.instagram_circle_check_pano_outline_24);
        C2XE c2xe = c76223bS.A05;
        Context context = c2xe.A0C;
        AbstractC25233BEq.A10(A0N, c76223bS, AbstractC53242c7.A0H(context, R.attr.igds_color_success));
        C80393iU A0O = AbstractC25234BEr.A0O(A0N, c2xe, A0d2);
        long A0D3 = AbstractC77623dm.A0D(c76223bS, R.dimen.abc_dialog_padding_top_material);
        Integer num4 = C05F.A08;
        C51722Yv A002 = C9CU.A00(null, num4, A1Z ? 1 : 0, A0D3);
        int i = 2131975667;
        String A0F = AbstractC77623dm.A0F(c76223bS, 2131975667);
        int A02 = AbstractC25232BEp.A02(context, c76223bS);
        long A0D4 = AbstractC77623dm.A0D(c76223bS, R.dimen.account_group_management_row_text_size);
        Typeface typeface = Typeface.DEFAULT;
        long A0D5 = AbstractC25229BEm.A0D();
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, A0F, A1Z ? 1 : 0);
        AbstractC25233BEq.A19(c76223bS, A0a, A02, A0D4);
        A0a.A0S(1);
        AbstractC25234BEr.A0n(typeface, c76223bS, A0a, A0D5);
        A0a.A0X(num3);
        AbstractC25234BEr.A1J(A0a, num, A1Z, true);
        C51682Yq A0X = AbstractC25227BEk.A0X(A002, A0a);
        C51722Yv A003 = C9CU.A00(null, num4, A1Z ? 1 : 0, AbstractC77623dm.A0A(c76223bS));
        C37644Ghd c37644Ghd = this.A02;
        C14360o3.A0B(c37644Ghd, A1Z ? 1 : 0);
        int ordinal = c37644Ghd.A0D.ordinal();
        if (ordinal != 17) {
            if (ordinal == 18) {
                i = 2131975664;
            }
        } else {
            i = 2131975665;
        }
        String A0F2 = AbstractC77623dm.A0F(c76223bS, i);
        int A09 = AbstractC25228BEl.A09(c76223bS, AbstractC53242c7.A09(context));
        long A0D6 = AbstractC77623dm.A0D(c76223bS, R.dimen.account_group_management_row_text_size);
        C77723dw A0a2 = AbstractC25231BEo.A0a(c2xe, null, A0F2, A1Z ? 1 : 0);
        AbstractC25233BEq.A19(c76223bS, A0a2, A09, A0D6);
        A0a2.A0S(A1Z ? 1 : 0);
        AbstractC25234BEr.A0n(typeface, c76223bS, A0a2, A0D5);
        A0a2.A0X(num3);
        AbstractC25234BEr.A1J(A0a2, num, A1Z, true);
        C51682Yq A0X2 = AbstractC25227BEk.A0X(A003, A0a2);
        C51722Yv A0d3 = AbstractC25230BEn.A0d(AbstractC25233BEq.A0Y(AbstractC25233BEq.A0Y(null, c76223bS, num4, R.dimen.abc_dialog_padding_top_material, A1Z ? 1 : 0), c76223bS, num2, R.dimen.ads_disclosure_footer_top_divider_height, A1Z ? 1 : 0), num, 100.0f, A1Z ? 1 : 0);
        int A03 = AbstractC25232BEp.A03(context, c76223bS, R.attr.igds_color_elevated_separator);
        C26280Bjn A032 = C26658Bpt.A03(c2xe);
        A032.A0B(A03);
        AbstractC77743dy.A00(A032, A0d3);
        C26658Bpt A0A = A032.A0A();
        C51722Yv A004 = C9CU.A00(C9CU.A00(null, num4, A1Z ? 1 : 0, AbstractC77623dm.A0A(c76223bS)), C05F.A06, A1Z ? 1 : 0, AbstractC77623dm.A0A(c76223bS));
        DRX A005 = DRX.A00(this, 15);
        Integer num5 = C05F.A1F;
        C51722Yv A16 = AbstractC25232BEp.A16(A004, num5, A005);
        String A0F3 = AbstractC77623dm.A0F(c76223bS, 2131975670);
        int A092 = AbstractC25228BEl.A09(c76223bS, AbstractC53242c7.A0C(context));
        long A0D7 = AbstractC77623dm.A0D(c76223bS, R.dimen.account_group_management_row_text_size);
        C77723dw A0a3 = AbstractC25231BEo.A0a(c2xe, null, A0F3, A1Z ? 1 : 0);
        AbstractC25233BEq.A19(c76223bS, A0a3, A092, A0D7);
        A0a3.A0S(A1Z ? 1 : 0);
        AbstractC25234BEr.A0n(typeface, c76223bS, A0a3, A0D5);
        A0a3.A0X(num);
        AbstractC25234BEr.A1J(A0a3, num, A1Z, true);
        C51682Yq A0X3 = AbstractC25227BEk.A0X(A16, A0a3);
        C51722Yv A0T = AbstractC25233BEq.A0T(C9CU.A00(null, C05F.A0u, A1Z ? 1 : 0, AbstractC77623dm.A0D(c76223bS, R.dimen.album_preview_add_item_margin)), AbstractC25225BEi.A0n(num5, A1Z ? 1 : 0, AbstractC77623dm.A0D(c76223bS, R.dimen.album_preview_add_item_margin)), num, 100.0f, A1Z ? 1 : 0);
        C2Z0 A0I = AbstractC25233BEq.A0I(A0O, A0X, c2xe);
        A0I.A00(A0X2);
        A0I.A00(A0A);
        A0I.A00(A0X3);
        return AbstractC76963ci.A01(A0I, c76223bS, A0T);
    }

    public C26380BlP(C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC31137Dmc interfaceC31137Dmc) {
        AbstractC167017dG.A1Q(c120985dq, interfaceC31137Dmc);
        this.A00 = c120985dq;
        this.A02 = c37644Ghd;
        this.A01 = interfaceC31137Dmc;
    }
}
