package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.JsG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44795JsG extends C3OO implements C3Ow {
    public C45509KCy A00;
    public C46520KiJ A01;
    public Reel A02;
    public final TextView A03;
    public final TextView A04;
    public final C44376JjF A05;
    public final IgImageView A06;
    public final GradientSpinner A07;

    @Override // X.C3Ow
    public final void CMM() {
    }

    @Override // X.C3Ow
    public final boolean Ejh() {
        return false;
    }

    @Override // X.C3Ow
    public final void EkR(InterfaceC11380iw interfaceC11380iw) {
    }

    @Override // X.C3Ow
    /* renamed from: AeS */
    public final RectF Ahl() {
        return AbstractC13880nE.A0G(this.itemView);
    }

    @Override // X.C3Ow
    public final View Aek() {
        return this.itemView;
    }

    @Override // X.InterfaceC72963Ox
    public final /* synthetic */ RectF Ahl() {
        return AbstractC13880nE.A0G(this.itemView);
    }

    @Override // X.C3Ow
    public final GradientSpinner Blo() {
        return this.A07;
    }

    public C44795JsG(View view) {
        super(view);
        Context context = view.getContext();
        this.A04 = AbstractC166997dE.A0T(view, R.id.profile_view_effects_ar_effect_title);
        this.A03 = AbstractC166997dE.A0T(view, R.id.profile_view_effects_ar_effect_creator);
        IgImageView A0Z = AbstractC31172DnG.A0Z(view, R.id.profile_view_effects_ar_effect_icon);
        this.A06 = A0Z;
        C44376JjF c44376JjF = new C44376JjF(context, 0.5f, 0.6f, 0.0f, 0.2f, 0.2f, 0, 0, 0, true, false);
        this.A05 = c44376JjF;
        this.A07 = new GradientSpinner(context);
        view.setBackground(c44376JjF);
        ViewOnTouchListenerC48084LQj.A01(view, 9, this);
        ViewOnClickListenerC48063LPo.A00(view, 23, this);
        A0Z.A0I = new C48547Ldk(this, 1);
    }
}
