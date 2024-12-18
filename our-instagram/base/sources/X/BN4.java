package X;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import com.facebook.R;

/* loaded from: classes5.dex */
public final class BN4 extends AbstractC51572Yf {
    public final C25403BLu A00;
    public final long A01;
    public final C37644Ghd A02;
    public final C23031Ai A03;
    public final boolean A04;

    public BN4(C37644Ghd c37644Ghd, C23031Ai c23031Ai, C25403BLu c25403BLu, long j, boolean z) {
        C14360o3.A0B(c25403BLu, 1);
        this.A00 = c25403BLu;
        this.A02 = c37644Ghd;
        this.A01 = j;
        this.A04 = z;
        this.A03 = c23031Ai;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C37644Ghd c37644Ghd = this.A02;
        if (c37644Ghd.A0S) {
            return new C26375BlK(this.A03, this.A01, this.A04);
        }
        if (!c37644Ghd.A0R) {
            return null;
        }
        C2UY.A01.A03();
        Drawable A0E = AbstractC77623dm.A0E(c76223bS, R.drawable.instagram_fill_outline_44);
        AbstractC25231BEo.A0x(AbstractC77363dM.A00(c76223bS), A0E, AbstractC53242c7.A0H(AbstractC77363dM.A00(c76223bS), R.attr.igds_color_icon_on_media));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        AbstractC166987dD.A1N(AbstractC77363dM.A00(c76223bS), paint, AbstractC53242c7.A0H(AbstractC77363dM.A00(c76223bS), R.attr.igds_color_secondary_button_on_media));
        AbstractC166987dD.A1R(paint);
        paint.setAntiAlias(true);
        C75933ay c75933ay = C51722Yv.A02;
        Integer num = C05F.A00;
        C51722Yv A0W = AbstractC25233BEq.A0W(C9CV.A00(C9CV.A00(AbstractC25230BEn.A0d(null, num, 100.0f, 0), C05F.A0Y, EnumC77933eL.ABSOLUTE, 3), num, EnumC77683ds.FLEX_END, 3), c76223bS, 2131955532);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        C51722Yv A0Y = AbstractC25233BEq.A0Y(null, A12, num, R.dimen.abc_dropdownitem_icon_width, 0);
        long A0D = AbstractC77623dm.A0D(A12, R.dimen.abc_dropdownitem_icon_width);
        Integer num2 = C05F.A01;
        C51722Yv A0I = AbstractC25234BEr.A0I(A0Y, AbstractC25225BEi.A0n(num2, 0, A0D), num, 3);
        long A0D2 = AbstractC77623dm.A0D(A12, R.dimen.ai_agent_share_profile_sticker_padding);
        AbstractC25234BEr.A0r(A0E, A12.A00, A12, AbstractC25231BEo.A0Y(AbstractC25230BEn.A0e(C9CV.A00(AbstractC25234BEr.A0E(A0I, AbstractC25227BEk.A0Z(0, A0D2), 0, AbstractC77623dm.A0D(A12, R.dimen.ai_agent_share_profile_sticker_padding)), num, shapeDrawable, 4), num2, DRT.A00(this, 27), null), DRT.A00(this, 28)));
        return AbstractC76963ci.A0B(A12, c76223bS, A0W);
    }
}
