package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.facebook.R;

/* renamed from: X.Bm1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26418Bm1 extends AbstractC51572Yf {
    public final C37577GgY A00;
    public final Integer A01;
    public final String A02;
    public final C120985dq A03;

    public C26418Bm1(C120985dq c120985dq, C37577GgY c37577GgY, Integer num, String str) {
        C14360o3.A0B(c37577GgY, 2);
        this.A03 = c120985dq;
        this.A00 = c37577GgY;
        this.A01 = num;
        this.A02 = str;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C2XE c2xe = c76223bS.A05;
        int A02 = AbstractC25232BEp.A02(c2xe.A0C, c76223bS);
        int A09 = AbstractC25228BEl.A09(c76223bS, R.color.track_background_color);
        C4NJ A08 = this.A03.A08();
        int A092 = AbstractC25228BEl.A09(c76223bS, R.color.primary_text_disabled_material_dark);
        C208169Ja c208169Ja = new C208169Ja(GradientDrawable.Orientation.TOP_BOTTOM);
        c208169Ja.setCornerRadius(16.0f);
        c208169Ja.setColor(A092);
        C2XI A00 = AbstractC80383iT.A00(c76223bS, c208169Ja);
        C77123cy A002 = AbstractC77063cs.A00(c76223bS, DG1.A00);
        Drawable A0E = AbstractC77623dm.A0E(c76223bS, R.drawable.sponsored_viewer_full_width_overlay_cta_foreground);
        A0E.setTint(AbstractC25228BEl.A09(c76223bS, R.color.fds_transparent));
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A003 = C9CU.A00(null, C05F.A0B, 0, AbstractC77623dm.A0D(c76223bS, R.dimen.action_bar_item_spacing_left));
        String str = this.A02;
        long A05 = AbstractC77623dm.A05(c76223bS);
        Integer num = C05F.A0C;
        Typeface typeface = Typeface.DEFAULT;
        long A0D = AbstractC25229BEm.A0D();
        Integer num2 = C05F.A00;
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, str, 0);
        AbstractC25233BEq.A19(c76223bS, A0a, A02, A05);
        A0a.A0S(1);
        AbstractC25234BEr.A0n(typeface, c76223bS, A0a, A0D);
        A0a.A0X(num);
        AbstractC25234BEr.A1B(A0a, num2);
        A0a.A0E();
        AbstractC25233BEq.A1D(A003, A0a, false);
        C51682Yq A0A = A0a.A0A();
        long A0D2 = AbstractC77623dm.A0D(c76223bS, R.dimen.account_group_management_clickable_width);
        Integer num3 = C05F.A01;
        C51722Yv A0d = AbstractC25230BEn.A0d(C9CU.A00(null, num3, 0, A0D2), num2, 91.0f, 0);
        Integer num4 = C05F.A15;
        C51722Yv A0e = AbstractC25230BEn.A0e(AbstractC25231BEo.A0W(c2xe, AbstractC25231BEo.A0X(A00, C9CV.A00(A0d, num4, A0E, 4), num), EnumC76913cd.LOCAL, "cta"), num2, new C30177DRh(45, this, A00, A002, c76223bS), null);
        if (str != null) {
            A0e = C9CV.A00(A0e, C05F.A0N, str, 0);
        }
        return AbstractC76963ci.A0G(AbstractC25232BEp.A11(A0A, c2xe), c76223bS, AbstractC25234BEr.A0H(C9CV.A00(C9CV.A00(AbstractC25233BEq.A0U(A0e, AbstractC25225BEi.A0o(num3, true, 4), num3, 0), num4, DRX.A00(this, 17), 0), C05F.A0u, true, 4), AbstractC25225BEi.A0o(C05F.A04, new C29937DHz(A0E, c76223bS, this, A08, A09, 8), 4), num2));
    }
}
