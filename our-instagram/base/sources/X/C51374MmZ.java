package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.MmZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51374MmZ extends C3OO implements C3PE, InterfaceC58290Psi {
    public C3PE A00;
    public final float A01;
    public final IgSimpleImageView A02;
    public final IgSimpleImageView A03;
    public final IgSimpleImageView A04;
    public final IgTextView A05;
    public final IgImageView A06;
    public final C50741Mav A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final int A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51374MmZ(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        Context A0L = AbstractC166997dE.A0L(view);
        float A00 = AbstractC13880nE.A00(A0L, 16.0f);
        this.A01 = A00;
        this.A02 = AbstractC31176DnK.A0T(view, R.id.card);
        this.A06 = AbstractC167007dF.A0T(view, R.id.unseen_badge);
        this.A05 = AbstractC25231BEo.A0d(view, R.id.label);
        this.A04 = AbstractC31176DnK.A0T(view, R.id.overlay_icon);
        this.A03 = AbstractC31176DnK.A0T(view, R.id.loading_spinner);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A08 = AbstractC09440dt.A00(enumC09460dv, new C57536PgA(9, view, this));
        this.A09 = AbstractC09440dt.A00(enumC09460dv, new C57536PgA(10, view, this));
        this.A07 = new C50741Mav(A0L, A00, false, false);
        this.A0A = A0L.getResources().getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material) / 2;
        C3P9 A0s = AbstractC166987dD.A0s(view);
        A0s.A06 = true;
        A0s.A04 = this;
        A0s.A02 = 0.95f;
        A0s.A00();
    }

    public final void A00(boolean z, boolean z2) {
        int i;
        if (z) {
            i = this.A0A;
        } else {
            i = 0;
        }
        int i2 = z2 ? this.A0A : 0;
        AbstractC13880nE.A0e(AbstractC31171DnF.A06(this), i);
        AbstractC13880nE.A0V(AbstractC31171DnF.A06(this), i2);
    }

    @Override // X.C3PE
    public final void DQY(View view) {
        C14360o3.A0B(view, 0);
        C3PE c3pe = this.A00;
        if (c3pe != null) {
            c3pe.DQY(view);
        }
    }

    @Override // X.C3PE
    public final boolean DsE(View view) {
        C14360o3.A0B(view, 0);
        C3PE c3pe = this.A00;
        if (c3pe != null && c3pe.DsE(view)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC58290Psi
    public final void El5(boolean z) {
        IgSimpleImageView igSimpleImageView = this.A03;
        if (z) {
            igSimpleImageView.setVisibility(0);
            ((C170797jW) this.A09.getValue()).start();
            C44376JjF c44376JjF = (C44376JjF) this.A08.getValue();
            c44376JjF.A04 = true;
            c44376JjF.invalidateSelf();
            this.A02.setSelected(true);
            return;
        }
        igSimpleImageView.setVisibility(4);
        ((C170797jW) this.A09.getValue()).stop();
        IgSimpleImageView igSimpleImageView2 = this.A02;
        igSimpleImageView2.setSelected(false);
        C44376JjF c44376JjF2 = (C44376JjF) this.A08.getValue();
        c44376JjF2.A04 = false;
        c44376JjF2.invalidateSelf();
        igSimpleImageView2.setSelected(false);
    }

    @Override // X.InterfaceC58290Psi
    public final void CMt() {
        this.itemView.setVisibility(4);
    }

    @Override // X.InterfaceC58290Psi
    public final void ElQ() {
        this.itemView.setVisibility(0);
    }

    @Override // X.InterfaceC72963Ox
    /* renamed from: Bfj */
    public final RectF Ahl() {
        RectF A0A = AbstractC31174DnI.A0A(AbstractC31171DnF.A06(this));
        A0A.left = A0A.centerX();
        A0A.top = A0A.centerY();
        A0A.right = A0A.centerX();
        A0A.bottom = A0A.centerY();
        return A0A;
    }
}
