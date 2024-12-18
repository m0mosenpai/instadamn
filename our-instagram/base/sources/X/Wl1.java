package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* loaded from: classes11.dex */
public final class Wl1 implements C5ST {
    public final C68869VdP A00;
    public final CharSequence A01;

    @Override // X.C5ST
    public final /* bridge */ /* synthetic */ AbstractC117215Sg ANT(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC167007dF.A1K(layoutInflater, viewGroup);
        return new V8I(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.clips_end_scene_interactivity_tooltip, false));
    }

    @Override // X.C5ST
    public final /* bridge */ /* synthetic */ void ADz(C5SV c5sv, AbstractC117215Sg abstractC117215Sg) {
        V8I v8i = (V8I) abstractC117215Sg;
        C14360o3.A0B(v8i, 0);
        CharSequence charSequence = this.A01;
        if (charSequence.length() > 0) {
            v8i.A00.setText(charSequence);
        }
        IgSimpleImageView igSimpleImageView = v8i.A01;
        if (igSimpleImageView != null) {
            AbstractC31173DnH.A11(igSimpleImageView.getContext(), igSimpleImageView, R.color.design_dark_default_color_on_background);
        }
    }

    public Wl1(CharSequence charSequence) {
        this();
        this.A01 = charSequence;
    }

    public Wl1() {
        this.A00 = new C68869VdP(Integer.valueOf(R.id.clips_tooltip_chevron_icon));
    }
}
