package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import java.util.List;

/* renamed from: X.Lf9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48632Lf9 implements InterfaceC187208Rn, InterfaceC187288Rv {
    public C187318Ry A00;
    public final C159407Da A01;
    public final View A02;
    public final L6A A03;
    public final C7VZ A04;

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ void D54(Integer num) {
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ void DCd(int i) {
    }

    @Override // X.InterfaceC187208Rn
    public final /* synthetic */ void DNF(C9NH c9nh, int i) {
    }

    @Override // X.InterfaceC187208Rn
    public final /* synthetic */ void DNc(int i, int i2) {
    }

    @Override // X.InterfaceC187208Rn
    public final /* synthetic */ void DNm(C9NH c9nh, int i) {
    }

    @Override // X.InterfaceC187208Rn
    public final /* synthetic */ void DNz() {
    }

    @Override // X.InterfaceC187208Rn
    public final /* synthetic */ void DO2(List list) {
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ void DkG() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C48632Lf9(Context context, View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, TouchInterceptorFrameLayout touchInterceptorFrameLayout, L6A l6a, C7VZ c7vz, boolean z, boolean z2, boolean z3) {
        boolean z4;
        C8S1 c8s1;
        AbstractC43594JPz.A1P(userSession, touchInterceptorFrameLayout);
        this.A03 = l6a;
        this.A04 = c7vz;
        this.A02 = view;
        C159407Da c159407Da = new C159407Da(userSession);
        this.A01 = c159407Da;
        c159407Da.A96(this);
        TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = (TouchInterceptorFrameLayout) AbstractC166997dE.A0S(touchInterceptorFrameLayout, R.id.gallery_media_thumbnail_tray);
        int i = z ? 2131968535 : 2131973280;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.action_bar_plus_shadow_height);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material) / 2;
        if (z3 || (!z && z2)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (C18U.A06(C06090Tz.A05, userSession, 2342166569839504760L)) {
            c8s1 = new Object();
        } else {
            c8s1 = null;
        }
        this.A00 = new C187318Ry(context, view, interfaceC11380iw, userSession, touchInterceptorFrameLayout2, null, c159407Da, this, c8s1, c7vz, MXW.A00, C187308Rx.A00, 0.5625f, i, 1, dimensionPixelSize, dimensionPixelSize2, R.color.fds_transparent, R.dimen.abc_button_inset_vertical_material, false, false, false, z4, z3, false);
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ boolean Ceo() {
        return false;
    }

    @Override // X.InterfaceC187208Rn
    public final void DNp(C9NH c9nh, int i) {
        RoundedCornerImageView roundedCornerImageView;
        C9V0 c9v0 = (C9V0) this.A00.A0L.A0W(i, false);
        L6A l6a = this.A03;
        GalleryItem galleryItem = null;
        if (c9v0 != null) {
            roundedCornerImageView = c9v0.A0A;
        } else {
            roundedCornerImageView = null;
        }
        if (c9nh != null) {
            galleryItem = c9nh.A01;
        }
        KCY kcy = l6a.A00;
        LI5.A00(KQ7.A00, AbstractC46750Km7.A00(AbstractC166987dD.A0r(kcy.A0m)));
        if (!kcy.A0V && kcy.A0P) {
            KCY.A01(null, kcy, i, true, false);
            return;
        }
        if (galleryItem == null) {
            return;
        }
        if ((galleryItem.A00 == null && galleryItem.A04 == null) || roundedCornerImageView == null) {
            return;
        }
        KCY.A03(roundedCornerImageView, galleryItem, kcy);
        C48632Lf9 c48632Lf9 = kcy.A0E;
        if (c48632Lf9 == null) {
            return;
        }
        c48632Lf9.A01.A01 = -1;
    }

    @Override // X.InterfaceC187288Rv
    public final void Dve(C26086BgF c26086BgF) {
        this.A01.A03.remove(this);
        this.A03.A00(c26086BgF);
    }

    @Override // X.InterfaceC187288Rv
    public final void Dvh() {
        this.A03.A00(null);
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ boolean Ejf() {
        return false;
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ boolean getCanHaveEmptySegments() {
        return false;
    }
}
