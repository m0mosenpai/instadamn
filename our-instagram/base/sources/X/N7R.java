package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class N7R extends AbstractC59962oe implements InterfaceC184998Io {
    public static final String __redex_internal_original_name = "IGTVUploadCanvasTrimFragment";
    public FilmstripTimelineView A00;
    public float A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04 = C57538PgC.A00(this, C57538PgC.A01(this, 27), new C57251PbZ(22, null, this), AbstractC25225BEi.A1D(IGTVUploadViewModel.class), 28);

    @Override // X.InterfaceC184998Io
    public final /* synthetic */ void DOn(float f, float f2) {
    }

    @Override // X.InterfaceC184998Io
    public final void E2A(float f) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "igtv_upload_canvas_trim_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        FilmstripTimelineView filmstripTimelineView = (FilmstripTimelineView) view.requireViewById(R.id.trim_filmstrip_view);
        filmstripTimelineView.A00 = this;
        filmstripTimelineView.setAllowSeekbarTouch(true);
        filmstripTimelineView.setShowTrimmer(true);
        filmstripTimelineView.setTrimmerMaximumRange(1.0f);
        filmstripTimelineView.setScrollXMargin(AbstractC166997dE.A05(filmstripTimelineView.getResources()));
        InterfaceC09390do interfaceC09390do = this.A04;
        filmstripTimelineView.A01(NNE.A01(interfaceC09390do).A1N.A07 / ((float) MSY.A0P(interfaceC09390do).A02()), NNE.A01(interfaceC09390do).A1N.A05 / ((float) MSY.A0P(interfaceC09390do).A02()));
        this.A00 = filmstripTimelineView;
        AbstractC13880nE.A0n(filmstripTimelineView, view);
        FilmstripTimelineView filmstripTimelineView2 = this.A00;
        if (filmstripTimelineView2 == null) {
            C14360o3.A0F("filmstripView");
            throw C00O.createAndThrow();
        }
        AbstractC13880nE.A0q(filmstripTimelineView2, new Runnable() { // from class: X.PMw
            @Override // java.lang.Runnable
            public final void run() {
                N7R n7r = N7R.this;
                Context requireContext = n7r.requireContext();
                int dimensionPixelSize = AbstractC166997dE.A0N(n7r).getDimensionPixelSize(R.dimen.abc_star_medium);
                int A03 = AbstractC167017dG.A03(n7r.requireContext());
                int dimensionPixelSize2 = AbstractC166997dE.A0N(n7r).getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height);
                try {
                    FilmstripTimelineView filmstripTimelineView3 = n7r.A00;
                    if (filmstripTimelineView3 != null) {
                        filmstripTimelineView3.setFilmstripTimelineWidth(filmstripTimelineView3.getMaxSelectedFilmstripWidth());
                        int i = ((AbstractC166997dE.A0N(n7r).getDisplayMetrics().widthPixels - (A03 * 2)) / dimensionPixelSize) + 1;
                        UserSession A0r = AbstractC166987dD.A0r(n7r.A03);
                        InterfaceC09390do interfaceC09390do2 = n7r.A04;
                        OEB A01 = AbstractC54906OQd.A01(MSY.A0P(interfaceC09390do2).A00.A0X, null, (int) MSY.A0P(interfaceC09390do2).A02());
                        FilmstripTimelineView filmstripTimelineView4 = n7r.A00;
                        if (filmstripTimelineView4 != null) {
                            OYA.A00(requireContext, n7r, A0r, filmstripTimelineView4, A01, "trim", i, dimensionPixelSize, dimensionPixelSize2);
                            return;
                        }
                    }
                    C14360o3.A0F("filmstripView");
                    throw C00O.createAndThrow();
                } catch (IOException e) {
                    AbstractC31173DnH.A1Z(e.getMessage(), ": Unable to load thumbnails", "igtv_upload_canvas_trim_fragment");
                }
            }
        });
        AbstractC31174DnI.A1E(getViewLifecycleOwner(), AbstractC50522MSa.A0X(this.A02).A05, new C57561PgZ(this, 23), 30);
    }

    @Override // X.InterfaceC184998Io
    public final void DOp(float f) {
        InterfaceC09390do interfaceC09390do = this.A04;
        int A02 = (int) (f * ((float) MSY.A0P(interfaceC09390do).A02()));
        MSX.A1S(AbstractC50522MSa.A0X(this.A02).A07, A02);
        NNE.A01(interfaceC09390do).A1N.A07 = A02;
    }

    @Override // X.InterfaceC184998Io
    public final void DhR(float f) {
        InterfaceC09390do interfaceC09390do = this.A04;
        int A02 = (int) (f * ((float) MSY.A0P(interfaceC09390do).A02()));
        MSX.A1S(AbstractC50522MSa.A0X(this.A02).A07, A02);
        NNE.A01(interfaceC09390do).A1N.A05 = A02;
    }

    @Override // X.InterfaceC184998Io
    public final void Djx(float f) {
        FilmstripTimelineView filmstripTimelineView = this.A00;
        if (filmstripTimelineView != null) {
            float A02 = C17s.A02(f, filmstripTimelineView.A0A.getLeftTrimmerValue(), filmstripTimelineView.getRightTrimmerPosition());
            FilmstripTimelineView filmstripTimelineView2 = this.A00;
            if (filmstripTimelineView2 != null) {
                filmstripTimelineView2.setSeekPosition(A02);
                C50948MfH A0X = AbstractC50522MSa.A0X(this.A02);
                MSX.A1S(A0X.A07, (int) (A02 * ((float) MSY.A0P(this.A04).A02())));
                return;
            }
        }
        C14360o3.A0F("filmstripView");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC184998Io
    public final void DuJ(boolean z) {
        if (z) {
            float f = this.A01;
            FilmstripTimelineView filmstripTimelineView = this.A00;
            if (filmstripTimelineView != null) {
                float A02 = C17s.A02(f, filmstripTimelineView.A0A.getLeftTrimmerValue(), filmstripTimelineView.getRightTrimmerPosition());
                C50948MfH A0X = AbstractC50522MSa.A0X(this.A02);
                MSX.A1S(A0X.A07, (int) (((float) MSY.A0P(this.A04).A02()) * A02));
                FilmstripTimelineView filmstripTimelineView2 = this.A00;
                if (filmstripTimelineView2 != null) {
                    filmstripTimelineView2.setSeekPosition(A02);
                    FilmstripTimelineView filmstripTimelineView3 = this.A00;
                    if (filmstripTimelineView3 != null) {
                        C8RN c8rn = filmstripTimelineView3.A09;
                        c8rn.setAlpha(0.0f);
                        c8rn.setVisibility(0);
                        C14360o3.A0A(MSX.A0A(c8rn, 1.0f).setDuration(100L).setListener(null));
                        this.A01 = -1.0f;
                    }
                }
            }
            C14360o3.A0F("filmstripView");
            throw C00O.createAndThrow();
        }
        AbstractC50522MSa.A0X(this.A02).A04 = false;
    }

    @Override // X.InterfaceC184998Io
    public final void DuL(boolean z) {
        AbstractC50522MSa.A0X(this.A02).A04 = true;
        if (z) {
            FilmstripTimelineView filmstripTimelineView = this.A00;
            if (filmstripTimelineView == null) {
                C14360o3.A0F("filmstripView");
                throw C00O.createAndThrow();
            }
            C8RN c8rn = filmstripTimelineView.A09;
            this.A01 = c8rn.A02;
            c8rn.setAlpha(1.0f);
            c8rn.setVisibility(0);
            C14360o3.A0A(MSX.A0A(c8rn, 0.0f).setDuration(100L).setListener(new C50730MaX(filmstripTimelineView, 5)));
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    public N7R() {
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, C57538PgC.A01(C57538PgC.A01(this, 26), 29));
        C0YZ A1D = AbstractC25225BEi.A1D(C50948MfH.class);
        this.A02 = AbstractC25225BEi.A0a(C57538PgC.A01(A00, 30), new C57251PbZ(24, A00, this), new C57251PbZ(23, null, A00), A1D);
        this.A01 = -1.0f;
        this.A03 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1206160009);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.igtv_upload_canvas_trim_fragment, false);
        C0f9.A09(-134192366, A02);
        return A0R;
    }
}
