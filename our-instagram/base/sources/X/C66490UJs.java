package X;

import android.animation.LayoutTransition;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.discovery.mediamap.fragment.LocationListFragment;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.UJs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66490UJs extends C3OO implements C3Ow, InterfaceC71923XAh {
    public C70846WiC A00;
    public C70788Wh1 A01;
    public final TextView A02;
    public final TextView A03;
    public final ShimmerFrameLayout A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final CircularImageView A07;
    public final C69619VsM A08;
    public final C69786VvR A09;
    public final LocationListFragment A0A;
    public final GradientSpinner A0B;
    public final IgImageView[] A0C;
    public final View A0D;
    public final TextView A0E;
    public final C69387VmX A0F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C66490UJs(ViewGroup viewGroup, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C69619VsM c69619VsM, C69387VmX c69387VmX, C69786VvR c69786VvR, LocationListFragment locationListFragment) {
        super(viewGroup);
        C14360o3.A0B(viewGroup, 1);
        this.A0C = r1;
        viewGroup.setLayoutTransition(new LayoutTransition());
        this.A06 = userSession;
        this.A05 = interfaceC11380iw;
        this.A0A = locationListFragment;
        this.A09 = c69786VvR;
        this.A08 = c69619VsM;
        this.A0F = c69387VmX;
        this.A07 = (CircularImageView) viewGroup.requireViewById(R.id.location_list_item_image);
        this.A0B = (GradientSpinner) viewGroup.requireViewById(R.id.gradient_spinner);
        this.A0D = viewGroup.requireViewById(R.id.empty_location_glyph);
        this.A0E = (TextView) viewGroup.requireViewById(R.id.location_list_item_title);
        this.A02 = (TextView) viewGroup.requireViewById(R.id.location_list_item_category);
        this.A03 = (TextView) viewGroup.requireViewById(R.id.location_list_item_info);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) viewGroup.requireViewById(R.id.location_list_media_preview_shimmer);
        this.A04 = shimmerFrameLayout;
        C84773qR c84773qR = new C84773qR();
        c84773qR.A00.A0H = false;
        shimmerFrameLayout.A04(c84773qR.A01());
        IgImageView[] igImageViewArr = {viewGroup.requireViewById(R.id.image_1), viewGroup.requireViewById(R.id.image_2), viewGroup.requireViewById(R.id.image_3)};
        WNP.A00(viewGroup, 42, locationListFragment, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x01c5, code lost:
    
        if (r14 != null) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.C70846WiC r20, X.C70788Wh1 r21) {
        /*
            Method dump skipped, instructions count: 765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66490UJs.A00(X.WiC, X.Wh1):void");
    }

    @Override // X.C3Ow
    public final boolean Ejh() {
        return true;
    }

    @Override // X.C3Ow
    /* renamed from: AeS */
    public final RectF Ahl() {
        return AbstractC13880nE.A0G(this.A07);
    }

    @Override // X.C3Ow
    public final View Aek() {
        return this.A07;
    }

    @Override // X.InterfaceC72963Ox
    public final /* synthetic */ RectF Ahl() {
        return AbstractC13880nE.A0G(this.A07);
    }

    @Override // X.C3Ow
    public final GradientSpinner Blo() {
        return this.A0B;
    }

    @Override // X.C3Ow
    public final void CMM() {
        this.A07.setVisibility(4);
    }

    @Override // X.InterfaceC71923XAh
    public final void DYk(MediaMapPin mediaMapPin) {
        C70846WiC c70846WiC;
        C70788Wh1 c70788Wh1 = this.A01;
        if (c70788Wh1 != null && (c70846WiC = this.A00) != null) {
            C14360o3.A0A(c70846WiC);
            A00(c70846WiC, c70788Wh1);
        }
    }

    @Override // X.C3Ow
    public final void EkR(InterfaceC11380iw interfaceC11380iw) {
        this.A07.setVisibility(0);
    }
}
