package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* renamed from: X.LeS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48590LeS implements MSD {
    public static final String __redex_internal_original_name = "CutoutVideoStickerCreationController";
    public Medium A00;
    public C55U A01;
    public LIj A02;
    public Integer A03;
    public boolean A04;
    public View A05;
    public final View A06;
    public final ViewStub A07;
    public final InterfaceC186068Na A08;
    public final C8EV A09;
    public final java.util.Set A0A;
    public final Fragment A0B;
    public final UserSession A0C;

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
        return this.A0A;
    }

    @Override // X.MSD
    public final boolean CJQ() {
        C8EV.A00(this.A09, C05F.A0Y, null, this.A03, null, "video_trimming_quitted");
        return false;
    }

    @Override // X.MSD
    public final void DhN() {
        if (this.A04) {
            this.A04 = false;
            this.A08.D95();
        }
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
                java.util.Set set = this.A0A;
                set.clear();
                if (this.A03 == C05F.A15) {
                    Context context = view.getContext();
                    AbstractC31172DnG.A1B(context, view, AbstractC53242c7.A0H(context, R.attr.igds_color_media_background));
                }
                C14360o3.A0A(view);
                set.add(view);
                ViewOnClickListenerC48064LPp.A00(view.requireViewById(R.id.back_button), 70, this);
                IgdsMediaButton igdsMediaButton = (IgdsMediaButton) view.requireViewById(R.id.cutout_sticker_next_button);
                igdsMediaButton.setLabel(igdsMediaButton.getContext().getString(2131957407));
                C0fQ.A00(new KLF(this, 1, 42), igdsMediaButton);
                this.A05 = view;
            }
            view.setVisibility(0);
            this.A04 = false;
            View view2 = this.A05;
            if (view2 != null) {
                LIj lIj = this.A02;
                if (lIj == null) {
                    lIj = new LIj(view2, this.A0B, this.A0C, KNC.A00, 6);
                    this.A02 = lIj;
                }
                lIj.A02(medium, this.A01, false);
            }
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "cutout_video_sticker_creation";
    }

    @Override // X.MSD
    public final /* synthetic */ boolean isScrolledToBottom() {
        return false;
    }

    @Override // X.MSD
    public final /* synthetic */ boolean isScrolledToTop() {
        return false;
    }

    public C48590LeS(View view, ViewStub viewStub, Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C55U c55u, InterfaceC186068Na interfaceC186068Na, Integer num) {
        AbstractC167017dG.A1Q(userSession, viewStub);
        this.A0C = userSession;
        this.A0B = fragment;
        this.A07 = viewStub;
        this.A06 = view;
        this.A08 = interfaceC186068Na;
        this.A01 = c55u;
        this.A03 = num;
        this.A0A = AbstractC31171DnF.A0l();
        this.A09 = new C8EV(interfaceC11380iw, userSession);
    }
}
