package X;

import android.view.View;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.ClL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnLayoutChangeListenerC28673ClL implements View.OnLayoutChangeListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ AbstractC59962oe A01;
    public final /* synthetic */ CRM A02;
    public final /* synthetic */ C166867cy A03;

    public ViewOnLayoutChangeListenerC28673ClL(AbstractC59962oe abstractC59962oe, CRM crm, C166867cy c166867cy, float f) {
        this.A03 = c166867cy;
        this.A02 = crm;
        this.A00 = f;
        this.A01 = abstractC59962oe;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        C65726Tt0 A00;
        view.removeOnLayoutChangeListener(this);
        C166867cy c166867cy = this.A03;
        CRM crm = this.A02;
        float f = this.A00;
        AbstractC59962oe abstractC59962oe = this.A01;
        D8L d8l = new D8L(41, abstractC59962oe, c166867cy);
        RoundedCornerFrameLayout roundedCornerFrameLayout = crm.A02;
        int height = roundedCornerFrameLayout.getHeight();
        float A0C = height + f + AbstractC166987dD.A0C(abstractC59962oe.requireContext(), 12);
        int A002 = AbstractC13890nF.A00(abstractC59962oe.requireContext());
        C8QJ c8qj = c166867cy.A02;
        boolean z = false;
        if (c8qj != null) {
            i9 = AbstractC25229BEm.A0A(c8qj.A00());
        } else {
            i9 = 0;
        }
        boolean A1O = AbstractC167007dF.A1O(((A0C + i9) > (A002 - 150) ? 1 : ((A0C + i9) == (A002 - 150) ? 0 : -1)));
        float A09 = AbstractC166987dD.A09(c166867cy.A03.invoke());
        if (f < A09) {
            z = true;
        }
        roundedCornerFrameLayout.setTranslationY(f);
        if (A1O) {
            A00 = C166867cy.A00(roundedCornerFrameLayout, d8l, A002 - (((height + r5) + i9) + 150));
        } else if (z) {
            A00 = C166867cy.A00(roundedCornerFrameLayout, d8l, A09);
        } else {
            d8l.invoke();
            return;
        }
        A00.A02();
    }
}
