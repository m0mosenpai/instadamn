package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.reels.ui.views.reelavatar.RecyclerReelAvatarView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.Mma, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51375Mma extends C3OO implements InterfaceC73213Pw {
    public C3G4 A00;
    public C50N A01;
    public OFZ A02;
    public boolean A03;
    public final Context A04;
    public final ViewStub A05;
    public final IgFrameLayout A06;
    public final IgTextView A07;
    public final IgTextView A08;
    public final C44376JjF A09;
    public final IgImageView A0A;
    public final C3P1 A0B;
    public final C72983Oz A0C;
    public final RecyclerReelAvatarView A0D;

    @Override // X.C3Ow
    public final boolean Ejh() {
        return true;
    }

    public C51375Mma(View view) {
        super(view);
        this.A03 = false;
        Context context = view.getContext();
        this.A04 = context;
        this.A0D = (RecyclerReelAvatarView) view.requireViewById(R.id.avatar_view);
        C3P0 c3p0 = new C3P0(view);
        this.A0B = c3p0;
        c3p0.A01.setTypeface(AbstractC167017dG.A0R(context));
        this.A0C = new C72983Oz(view);
        IgImageView A0Z = AbstractC31172DnG.A0Z(view, R.id.background_content);
        this.A0A = A0Z;
        IgFrameLayout igFrameLayout = (IgFrameLayout) view.requireViewById(R.id.top_tray_item_container);
        this.A06 = igFrameLayout;
        this.A05 = AbstractC31173DnH.A0G(view, R.id.livewith_avatar_stub);
        Ok3.A00(igFrameLayout, 5, this);
        igFrameLayout.setOnLongClickListener(new LQL(this, 7));
        this.A07 = (IgTextView) AbstractC167017dG.A0U(view, R.id.subtitle);
        this.A08 = AbstractC31172DnG.A0X(view, R.id.username);
        AbstractC13880nE.A04(context, 6);
        C44376JjF c44376JjF = new C44376JjF(context, 0.2f, 0.5f, AbstractC167017dG.A0E(context), 0.2f, 0.4f, 0, 0, 0, 300L, false, true, false, false);
        this.A09 = c44376JjF;
        A0Z.setImageDrawable(c44376JjF);
    }

    public final C50N A00() {
        C50N c50n = this.A01;
        if (c50n == null) {
            C50N c50n2 = new C50N(this.A05.inflate());
            this.A01 = c50n2;
            return c50n2;
        }
        return c50n;
    }

    @Override // X.InterfaceC72963Ox
    /* renamed from: AeS, reason: merged with bridge method [inline-methods] */
    public final RectF Ahl() {
        View Aek;
        C3G4 c3g4 = this.A00;
        if (c3g4 != null && c3g4.A03()) {
            Aek = A00().A02;
        } else {
            Aek = Aek();
        }
        return AbstractC13880nE.A0G(Aek);
    }

    @Override // X.InterfaceC72953Ov
    public final View AeT() {
        return this.A0C.A00();
    }

    @Override // X.C3Ow
    public final View Aek() {
        return this.A0D.getHolder().A00();
    }

    @Override // X.InterfaceC73213Pw
    public final View B8v() {
        return this.A06;
    }

    @Override // X.InterfaceC73213Pw
    public final RectF BGZ() {
        return AbstractC13880nE.A0G(this.A06);
    }

    @Override // X.InterfaceC72953Ov
    public final View BlH() {
        return this.itemView;
    }

    @Override // X.InterfaceC72953Ov
    public final String BlW() {
        return this.A0C.A01;
    }

    @Override // X.C3Ow
    public final GradientSpinner Blo() {
        return ((C3P2) this.A0D.getHolder().A03.getValue()).A0O;
    }

    @Override // X.InterfaceC72953Ov
    public final void CJH(float f) {
        this.A0C.A00().setAlpha(1.0f - f);
        this.A0A.setAlpha(0.0f);
    }

    @Override // X.C3Ow
    public final void CMM() {
        View Aek;
        C3G4 c3g4 = this.A00;
        if (c3g4 != null && c3g4.A03()) {
            Aek = A00().A02;
        } else {
            Aek = Aek();
        }
        Aek.setVisibility(4);
    }

    @Override // X.InterfaceC72953Ov
    public final void EcK(C140626Xq c140626Xq) {
        this.A0C.A00 = c140626Xq;
    }

    @Override // X.C3Ow
    public final void EkR(InterfaceC11380iw interfaceC11380iw) {
        View Aek;
        C3G4 c3g4 = this.A00;
        if (c3g4 != null && c3g4.A03()) {
            Aek = A00().A02;
        } else {
            Aek = Aek();
        }
        Aek.setVisibility(0);
    }
}
