package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes5.dex */
public final class C2K extends AbstractC127345pD {
    public int A00;
    public C131565ws A01;
    public IgImageView A02;
    public C29375Cx8 A03;

    @Override // X.AbstractC127345pD
    public final void A03(View view, Integer num, String str, int i, int i2, int i3, int i4) {
        C29375Cx8 c29375Cx8 = this.A03;
        if (c29375Cx8 != null) {
            String A00 = AbstractC68329VMp.A00(num);
            C138746Qe c138746Qe = c29375Cx8.A00;
            if (c138746Qe != null) {
                c138746Qe.A0G(A00, i, i2);
            }
        }
        super.A03(view, num, str, i, i2, i3, i4);
    }

    @Override // X.InterfaceC115845Ly
    public final void E0c() {
        C29375Cx8 c29375Cx8;
        C131565ws c131565ws = this.A01;
        if (c131565ws != null && (c29375Cx8 = this.A03) != null) {
            C138746Qe c138746Qe = c29375Cx8.A00;
            if (c138746Qe != null) {
                c138746Qe.A08();
            }
            String str = c29375Cx8.A04;
            if (str != null) {
                C138746Qe c138746Qe2 = c29375Cx8.A00;
                if (c138746Qe2 != null) {
                    c138746Qe2.A0H("fully_enter_viewport", str);
                }
                c29375Cx8.A08.Chv(C6P9.A01(C05F.A01, str));
            }
            UserSession userSession = c29375Cx8.A09;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36312720127755490L)) {
                int A07 = AbstractC25225BEi.A07(c06090Tz, userSession, 36594195104532115L);
                C138756Qf c138756Qf = c29375Cx8.A01;
                if (c138756Qf != null) {
                    WG4.A01(c29375Cx8.A07, c131565ws, c138756Qf, c29375Cx8.A0A, 0.0f, A07);
                }
            }
        }
    }

    @Override // X.InterfaceC115845Ly
    public final void E0l() {
        C29375Cx8 c29375Cx8 = this.A03;
        if (c29375Cx8 != null) {
            C138746Qe c138746Qe = c29375Cx8.A00;
            if (c138746Qe != null) {
                c138746Qe.A09();
            }
            c29375Cx8.A08.Chv(C6P9.A00(C05F.A01));
        }
    }

    @Override // X.InterfaceC115845Ly
    public final void E0o() {
        C29375Cx8 c29375Cx8 = this.A03;
        if (c29375Cx8 != null) {
            C138746Qe c138746Qe = c29375Cx8.A00;
            if (c138746Qe != null) {
                c138746Qe.A08();
            }
            String str = c29375Cx8.A04;
            if (str != null) {
                C138746Qe c138746Qe2 = c29375Cx8.A00;
                if (c138746Qe2 != null) {
                    c138746Qe2.A0H("partially_enter_viewport", str);
                }
                c29375Cx8.A08.Chv(C6P9.A02(C05F.A01, str));
            }
        }
    }

    @Override // X.InterfaceC115845Ly
    public final void EKd() {
        C29375Cx8 c29375Cx8 = this.A03;
        if (c29375Cx8 != null) {
            c29375Cx8.EKf();
        }
    }

    @Override // X.InterfaceC115845Ly
    public final boolean isPlaying() {
        C29375Cx8 c29375Cx8 = this.A03;
        if (c29375Cx8 != null) {
            return c29375Cx8.isPlaying();
        }
        return false;
    }

    @Override // X.InterfaceC115845Ly
    public final void pause() {
        C29375Cx8 c29375Cx8 = this.A03;
        if (c29375Cx8 != null) {
            c29375Cx8.pause();
        }
    }

    public final void setCompositionController(C29375Cx8 c29375Cx8) {
        this.A03 = c29375Cx8;
        if (c29375Cx8 != null) {
            c29375Cx8.A05 = C29902DGq.A01(this, 14);
        }
    }

    @Override // X.InterfaceC115845Ly
    public final void stop() {
        C29375Cx8 c29375Cx8 = this.A03;
        if (c29375Cx8 != null) {
            c29375Cx8.stop();
        }
    }

    @Override // X.InterfaceC115845Ly
    public final boolean CXh() {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC115845Ly
    public final void E4S() {
        throw C00O.createAndThrow();
    }

    public final IgImageView getAudioIconView$fbandroid_java_instagram_features_clips_viewer_adapter_ads_litho_v2_v2() {
        return this.A02;
    }

    @Override // X.InterfaceC115845Ly
    public final void reset() {
        removeAllViews();
        C131565ws c131565ws = this.A01;
        if (c131565ws != null) {
            c131565ws.setRenderTree(null);
        }
        this.A01 = null;
        C29375Cx8 c29375Cx8 = this.A03;
        if (c29375Cx8 != null) {
            c29375Cx8.A01();
        }
        this.A03 = null;
        this.A02 = null;
        this.A00 = 0;
    }

    public final void setAudioIconView$fbandroid_java_instagram_features_clips_viewer_adapter_ads_litho_v2_v2(IgImageView igImageView) {
        this.A02 = igImageView;
    }
}
