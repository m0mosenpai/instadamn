package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;

/* renamed from: X.Cuh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29238Cuh implements InterfaceC58169PqZ {
    public IgLinearLayout A00;
    public CT9 A01;
    public final C81X A02;
    public final AbstractC59962oe A03;
    public final UserSession A04;
    public final C44547Jmr A05;
    public final C52479NJx A06;

    public C29238Cuh(AbstractC59962oe abstractC59962oe, UserSession userSession, C44547Jmr c44547Jmr, C52479NJx c52479NJx) {
        AbstractC167027dH.A0a(1, abstractC59962oe, userSession, c44547Jmr, c52479NJx);
        this.A03 = abstractC59962oe;
        this.A04 = userSession;
        this.A05 = c44547Jmr;
        this.A06 = c52479NJx;
        this.A02 = C81X.A2d;
    }

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return null;
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        AbstractC59962oe abstractC59962oe = this.A03;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57173PZr(viewLifecycleOwner, c07s, this, (InterfaceC23621Ds) null, 18), C07Y.A00(viewLifecycleOwner));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [android.widget.LinearLayout, android.view.View, com.instagram.common.ui.base.IgLinearLayout] */
    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        AbstractC59962oe abstractC59962oe = this.A03;
        ?? linearLayout = new LinearLayout(abstractC59962oe.requireContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.A00 = linearLayout;
        LayoutInflater from = LayoutInflater.from(abstractC59962oe.requireContext());
        IgLinearLayout igLinearLayout = this.A00;
        if (igLinearLayout != null) {
            View inflate = from.inflate(R.layout.add_channels_row, (ViewGroup) igLinearLayout, false);
            C14360o3.A0A(inflate);
            this.A01 = new CT9(inflate);
            IgLinearLayout igLinearLayout2 = this.A00;
            if (igLinearLayout2 != null) {
                igLinearLayout2.addView(inflate);
                this.A05.A03(abstractC59962oe, null, false);
                IgLinearLayout igLinearLayout3 = this.A00;
                if (igLinearLayout3 != null) {
                    return igLinearLayout3;
                }
            }
        }
        C14360o3.A0F("contentView");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A02;
    }
}
