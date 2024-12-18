package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;

/* renamed from: X.AgG, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23805AgG implements C8BD {
    public int A00;
    public int A01;
    public SurfaceTexture A02;
    public TextureView A03;
    public FrameLayout A04;
    public FilmstripTimelineView A05;
    public final Context A06;
    public final View A07;
    public final ViewStub A08;
    public final W37 A09;
    public final C8J0 A0A;
    public final TargetViewSizeProvider A0B;
    public final C23737AfA A0C;
    public final C24144AnT A0D;
    public final InterfaceC143326dX A0E;
    public final InterfaceC1810081c A0F;
    public final InterfaceC1810781j A0G;
    public final InterfaceC1810781j A0H;
    public final C8J6 A0I;
    public final InterfaceC09390do A0J;
    public volatile EnumC185018Iq A0K;
    public volatile EnumC185018Iq A0L;

    public C23805AgG(Context context, View view, W37 w37, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C8C0 c8c0, InterfaceC143326dX interfaceC143326dX, InterfaceC1810081c interfaceC1810081c) {
        AbstractC167027dH.A0a(1, context, userSession, interfaceC1810081c, w37);
        C14360o3.A0B(c8c0, 5);
        AbstractC167007dF.A1I(view, 6, targetViewSizeProvider);
        this.A06 = context;
        this.A0F = interfaceC1810081c;
        this.A09 = w37;
        this.A07 = view;
        this.A0E = interfaceC143326dX;
        this.A0B = targetViewSizeProvider;
        this.A0C = new C23737AfA(this);
        this.A0D = new C24144AnT(this);
        EnumC185018Iq enumC185018Iq = EnumC185018Iq.A08;
        this.A0L = enumC185018Iq;
        this.A08 = (ViewStub) view.findViewById(R.id.boomerang_trimmer_stub);
        this.A0I = new C24146AnV(this);
        this.A0K = enumC185018Iq;
        this.A0A = AbstractC185088Iz.A00(userSession, null);
        this.A0G = new C9PZ(this, 0);
        this.A0H = new C9PZ(this, 1);
        this.A0J = AbstractC09440dt.A01(new ME5(14, c8c0, this, userSession));
    }

    public static final void A00(C23805AgG c23805AgG) {
        ((C8J9) c23805AgG.A0J.getValue()).CMH(true);
        FilmstripTimelineView filmstripTimelineView = c23805AgG.A05;
        if (filmstripTimelineView == null) {
            C14360o3.A0F("trimmerTimelineView");
            throw C00O.createAndThrow();
        }
        AbstractC166997dE.A1L(filmstripTimelineView, false);
        c23805AgG.A0E.D5W(c23805AgG);
    }

    @Override // X.C8BD
    public final /* synthetic */ boolean onBackPressed() {
        return false;
    }
}
