package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.model.venue.Venue;

/* renamed from: X.NFk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52370NFk extends IgLinearLayout implements InterfaceC58116Ppf {
    public C56037Ou9 A00;
    public InterfaceC58116Ppf A01;
    public OWd A02;
    public Venue A03;
    public View A04;

    @Override // X.InterfaceC58116Ppf
    public final void DQB() {
        InterfaceC58116Ppf interfaceC58116Ppf = this.A01;
        if (interfaceC58116Ppf != null) {
            interfaceC58116Ppf.DQB();
        }
        C56037Ou9 c56037Ou9 = this.A00;
        if (c56037Ou9 != null) {
            c56037Ou9.A05.removeLocationUpdates(c56037Ou9.A03, c56037Ou9);
        }
    }

    @Override // X.InterfaceC58116Ppf
    public final void DQE() {
        InterfaceC58116Ppf interfaceC58116Ppf = this.A01;
        if (interfaceC58116Ppf != null) {
            interfaceC58116Ppf.DQE();
        }
    }

    @Override // X.InterfaceC58116Ppf
    public final void DQF(Venue venue) {
        InterfaceC58116Ppf interfaceC58116Ppf = this.A01;
        if (interfaceC58116Ppf != null) {
            interfaceC58116Ppf.DQF(venue);
        }
        C56037Ou9 c56037Ou9 = this.A00;
        if (c56037Ou9 != null) {
            c56037Ou9.A05.removeLocationUpdates(c56037Ou9.A03, c56037Ou9);
        }
    }

    public final OWd getController() {
        return this.A02;
    }

    public final InterfaceC58116Ppf getDelegate() {
        return this.A01;
    }

    public final C56037Ou9 getLocationSuggestionsRepository() {
        return this.A00;
    }

    public final Venue getVenue() {
        return this.A03;
    }

    public final void setVenue(Venue venue) {
        this.A03 = venue;
        OWd oWd = this.A02;
        if (oWd != null) {
            oWd.A02(venue);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(1774448709);
        super.onAttachedToWindow();
        if (this.A04 == null) {
            View A0A = AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(this), this, R.layout.location_suggestions_two_rows);
            C14360o3.A0A(A0A);
            OWd oWd = new OWd(A0A);
            oWd.A01(this, this.A03);
            this.A02 = oWd;
            addView(A0A);
            this.A04 = A0A;
        }
        C56037Ou9 c56037Ou9 = this.A00;
        if (c56037Ou9 != null) {
            c56037Ou9.A00();
        }
        C0f9.A0D(705986945, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-885332011);
        super.onDetachedFromWindow();
        C56037Ou9 c56037Ou9 = this.A00;
        if (c56037Ou9 != null) {
            c56037Ou9.A01();
        }
        C0f9.A0D(-2073586888, A06);
    }

    public final void setController(OWd oWd) {
        this.A02 = oWd;
    }

    public final void setDelegate(InterfaceC58116Ppf interfaceC58116Ppf) {
        this.A01 = interfaceC58116Ppf;
    }

    public final void setLocationSuggestionsRepository(C56037Ou9 c56037Ou9) {
        this.A00 = c56037Ou9;
    }
}
