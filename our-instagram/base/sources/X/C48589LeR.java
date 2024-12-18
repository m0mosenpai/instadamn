package X;

import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* renamed from: X.LeR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48589LeR implements MSD {
    public static final String __redex_internal_original_name = "VideoStickerCreationController";
    public Medium A00;
    public C55U A01;
    public LIj A02;
    public boolean A03;
    public int A04;
    public View A05;
    public final View A06;
    public final ViewStub A07;
    public final InterfaceC186198Nn A08;
    public final java.util.Set A09;
    public final Fragment A0A;
    public final UserSession A0B;

    @Override // X.MSD
    public final boolean CJQ() {
        return false;
    }

    @Override // X.MSD
    public final /* synthetic */ void CxN() {
    }

    @Override // X.MSD
    public final void close() {
        this.A00 = null;
        AbstractC167007dF.A0x(this.A05);
        LIj lIj = this.A02;
        if (lIj != null) {
            lIj.A08.removeCallbacks(lIj.A0D);
            C95334Qt c95334Qt = lIj.A03;
            if (c95334Qt != null) {
                c95334Qt.EE5(false);
            }
            lIj.A03 = null;
            lIj.A09.setVisibility(8);
        }
    }

    @Override // X.MSD
    public final java.util.Set Acr() {
        return this.A09;
    }

    @Override // X.MSD
    public final void DhN() {
    }

    @Override // X.MSD
    public final void E2K() {
        Medium medium = this.A00;
        if (medium != null) {
            View view = this.A05;
            if (view == null) {
                ViewStub viewStub = this.A07;
                if (viewStub.getParent() != null) {
                    view = viewStub.inflate();
                } else {
                    viewStub.setVisibility(0);
                    view = this.A06;
                }
                java.util.Set set = this.A09;
                set.clear();
                C14360o3.A0A(view);
                set.add(view);
                AbstractC166987dD.A1P(view.getContext(), AbstractC166997dE.A0T(view, R.id.cutout_video_sticker_creation_title_label), 2131963144);
                ViewOnClickListenerC48063LPo.A00(view.requireViewById(R.id.back_button), 4, this);
                IgdsMediaButton igdsMediaButton = (IgdsMediaButton) view.requireViewById(R.id.cutout_sticker_next_button);
                igdsMediaButton.setLabel(igdsMediaButton.getContext().getString(2131957407));
                C0fQ.A00(new KLF(this, 2, 42), igdsMediaButton);
                this.A05 = view;
            }
            view.setVisibility(0);
            View view2 = this.A05;
            if (view2 != null) {
                LIj lIj = this.A02;
                if (lIj == null) {
                    lIj = new LIj(view2, this.A0A, this.A0B, KND.A00, this.A04);
                    this.A02 = lIj;
                }
                lIj.A02(medium, this.A01, this.A03);
            }
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "video_sticker_creation";
    }

    @Override // X.MSD
    public final /* synthetic */ boolean isScrolledToBottom() {
        return false;
    }

    @Override // X.MSD
    public final /* synthetic */ boolean isScrolledToTop() {
        return false;
    }

    public C48589LeR(View view, ViewStub viewStub, Fragment fragment, UserSession userSession, C55U c55u, InterfaceC186198Nn interfaceC186198Nn) {
        boolean A1a = AbstractC31175DnJ.A1a(viewStub);
        this.A0B = userSession;
        this.A0A = fragment;
        this.A07 = viewStub;
        this.A06 = view;
        this.A08 = interfaceC186198Nn;
        this.A01 = c55u;
        this.A03 = A1a;
        this.A09 = AbstractC31171DnF.A0l();
        this.A04 = 6;
        this.A04 = AbstractC25225BEi.A07(C06090Tz.A06, userSession, 36605031306368197L);
    }
}
