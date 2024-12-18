package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.Ji4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44313Ji4 implements InterfaceC187288Rv {
    public final C44315Ji6 A00;
    public final C187318Ry A01;

    public C44313Ji4(Context context, View view, View view2, UserSession userSession, C44315Ji6 c44315Ji6) {
        C14360o3.A0B(userSession, 2);
        this.A00 = c44315Ji6;
        C159407Da c159407Da = new C159407Da(userSession);
        c159407Da.A96(new C44314Ji5(this));
        this.A01 = new C187318Ry(context, view2, AbstractC31171DnF.A0D("feed_gallery"), userSession, (TouchInterceptorFrameLayout) AbstractC166997dE.A0S(view, R.id.gallery_media_thumbnail_tray), null, c159407Da, this, null, null, MXW.A00, C187308Rx.A00, 0.5625f, 2131968535, C18U.A06(C06090Tz.A05, userSession, 36328736060292861L) ? 5 : 1, context.getResources().getDimensionPixelSize(R.dimen.action_bar_plus_shadow_height), context.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material) / 2, AbstractC53242c7.A0H(context, R.attr.igds_color_media_thumbnail_tray_background), R.dimen.abc_button_inset_vertical_material, true, false, false, false, false, true);
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ void D54(Integer num) {
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ void DCd(int i) {
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ void DkG() {
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ void Dve(C26086BgF c26086BgF) {
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ void Dvh() {
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ boolean Ceo() {
        return false;
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
