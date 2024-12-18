package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgSimpleImageView;

/* loaded from: classes7.dex */
public final class HMY extends AbstractC38513GwY implements JGL {
    public final JPh A00;
    public final Resources A01;
    public final View A02;
    public final TextView A03;
    public final IgSimpleImageView A04;
    public final C38064Gos A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMY(View view, JPh jPh) {
        super(view);
        C14360o3.A0B(jPh, 2);
        this.A02 = view;
        this.A00 = jPh;
        this.A04 = AbstractC31176DnK.A0T(view, R.id.album_art);
        this.A03 = AbstractC167007dF.A0N(view, R.id.filter_pill);
        this.A01 = AbstractC37302Gc3.A05(this);
        this.A05 = new C38064Gos(AbstractC167007dF.A0N(view, R.id.track_row_title), AbstractC167007dF.A09(AbstractC37301Gc2.A03(this), R.attr.textColorSecondary));
    }

    public final void A03(C38635Gyc c38635Gyc) {
        ImageUrl AsT;
        C14360o3.A0B(c38635Gyc, 0);
        JIN jin = c38635Gyc.A03;
        if (jin != null) {
            C0fQ.A00(new ViewOnClickListenerC35674Fp9(jin, this, c38635Gyc.A06, c38635Gyc.A07, 5), this.A02);
            C38064Gos c38064Gos = this.A05;
            String displayArtist = jin.getDisplayArtist();
            String title = jin.getTitle();
            SpannableStringBuilder A01 = AbstractC37300Gc1.A01();
            AbstractC37304Gc5.A0s(A01, displayArtist);
            A01.append((CharSequence) title);
            AbstractC38060Gon.A00(null, c38064Gos, AbstractC166987dD.A19(A01), jin.isExplicit(), false);
            c38064Gos.A00(false);
            IgSimpleImageView igSimpleImageView = this.A04;
            Context A03 = AbstractC37301Gc2.A03(this);
            Resources resources = this.A01;
            int A05 = AbstractC166997dE.A05(resources);
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_control_corner_material);
            int i = -1;
            if (AbstractC53242c7.A0L(AbstractC37301Gc2.A03(this), R.attr.musicCreationShadowEnabled, false)) {
                i = 1;
            }
            igSimpleImageView.setImageDrawable(new BOM(A03, null, A05, dimensionPixelSize, 0, 0, 0, i, false));
            if (jin.CSb()) {
                AsT = null;
            } else {
                AsT = jin.AsT();
            }
            AbstractC38055Goi.A00(igSimpleImageView, AsT, null);
            EnumC185288Jt Adn = jin.Adn();
            if (Adn != null && Adn.A04 != AudioFilterType.A0A) {
                TextView textView = this.A03;
                textView.setText(Adn.A03);
                textView.setVisibility(0);
                return;
            }
            this.A03.setVisibility(8);
        }
    }

    @Override // X.JGL
    public final void FCh(JIN jin, float f) {
    }
}
