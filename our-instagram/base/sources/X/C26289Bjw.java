package X;

import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.Bjw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26289Bjw extends AbstractC51572Yf {
    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C3e8 c3e8 = C3e8.CENTER;
        EnumC77683ds enumC77683ds = EnumC77683ds.CENTER;
        C2Z0 A0P = AbstractC167007dF.A0P(c76223bS.A05);
        C75933ay c75933ay = C51722Yv.A02;
        long A07 = AbstractC77623dm.A07(A0P);
        Integer num = C05F.A1I;
        AbstractC25234BEr.A0q(AbstractC77623dm.A0E(A0P, R.drawable.instagram_icons_exceptions_illo_blend_refresh_outline_96), ImageView.ScaleType.CENTER_CROP, A0P.A00, A0P, AbstractC25233BEq.A0X(C9CU.A00(C9CU.A00(null, num, 0, A07), C05F.A00, 0, AbstractC77623dm.A0D(A0P, R.dimen.blend_endcard_hero_image_size)), A0P, R.dimen.blend_endcard_hero_image_size));
        String A0F = AbstractC77623dm.A0F(A0P, 2131955350);
        Integer valueOf = Integer.valueOf(A0P.BoZ().A01(R.attr.igds_color_primary_text_on_media));
        C51722Yv A00 = C9CU.A00(null, num, 0, AbstractC77623dm.A07(A0P));
        C29011Cr0 c29011Cr0 = C29011Cr0.A00;
        C77603dk c77603dk = C77603dk.A00;
        A0P.A00(new C78003eS(null, null, A00, null, new C51532Yb(c77603dk, c29011Cr0, 3, true), null, A0F, null, valueOf, null, null, null));
        String A0F2 = AbstractC77623dm.A0F(A0P, 2131955349);
        int A01 = A0P.BoZ().A01(R.attr.igds_color_secondary_text_on_media);
        A0P.A00(new C78003eS(null, null, C9CU.A00(null, C05F.A04, 0, AbstractC77623dm.A0D(A0P, R.dimen.abc_dropdownitem_icon_width)), null, new C51532Yb(c77603dk, C29012Cr1.A00, 3, true), null, A0F2, null, Integer.valueOf(A01), null, null, 17));
        return new C2WF(null, enumC77683ds, c3e8, A0P.A01, false);
    }
}
