package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckBox;
import android.widget.TextView;
import com.instagram.igds.components.imagebutton.IgImageButton;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.P8y, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56552P8y implements InterfaceC58290Psi {
    public InterfaceC57915PmL A00;
    public final int A01;
    public final View A02;
    public final View A03;
    public final CheckBox A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final C44376JjF A09;
    public final C3PF A0A;
    public final C57012jc A0B;
    public final C57012jc A0C;
    public final IgImageButton A0D;
    public final MediaFrameLayout A0E;

    @Override // X.InterfaceC58290Psi
    public final /* synthetic */ void El5(boolean z) {
    }

    @Override // X.InterfaceC72963Ox
    public final /* synthetic */ RectF Ahl() {
        return AbstractC13880nE.A0G(this.A0E);
    }

    @Override // X.InterfaceC58290Psi
    /* renamed from: Bfj */
    public final RectF Ahl() {
        return AbstractC13880nE.A0G(this.A0E);
    }

    @Override // X.InterfaceC58290Psi
    public final void CMt() {
        this.A0E.setVisibility(4);
    }

    @Override // X.InterfaceC58290Psi
    public final void ElQ() {
        this.A0E.setVisibility(0);
    }

    public C56552P8y(View view, View view2, ViewStub viewStub, ViewStub viewStub2, CheckBox checkBox, TextView textView, TextView textView2, TextView textView3, TextView textView4, C44376JjF c44376JjF, IgImageButton igImageButton, MediaFrameLayout mediaFrameLayout) {
        Context context = mediaFrameLayout.getContext();
        this.A01 = context.getColor(AbstractC53242c7.A04(context));
        this.A0E = mediaFrameLayout;
        this.A0D = igImageButton;
        this.A09 = c44376JjF;
        this.A02 = view;
        this.A05 = textView2;
        AbstractC14710oj.A07(context, AbstractC167017dG.A0R(context), textView2, C05F.A01);
        this.A07 = textView;
        this.A03 = view2;
        this.A04 = checkBox;
        this.A0B = new C57012jc(viewStub);
        this.A0C = new C57012jc(viewStub2);
        this.A06 = textView3;
        this.A08 = textView4;
        C3P9 A0s = AbstractC166987dD.A0s(mediaFrameLayout);
        A0s.A07 = true;
        A0s.A02 = 0.98f;
        A0s.A04 = new C52374NFq(this, 1);
        this.A0A = A0s.A00();
    }
}
