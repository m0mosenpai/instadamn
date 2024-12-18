package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* loaded from: classes4.dex */
public final class B2M implements InterfaceC08830cm {
    public final /* synthetic */ AbstractC018607g A00;
    public final /* synthetic */ C8D9 A01;
    public final /* synthetic */ C8C0 A02;
    public final /* synthetic */ C23851Ah3 A03;

    public B2M(AbstractC018607g abstractC018607g, C8D9 c8d9, C8C0 c8c0, C23851Ah3 c23851Ah3) {
        this.A03 = c23851Ah3;
        this.A02 = c8c0;
        this.A01 = c8d9;
        this.A00 = abstractC018607g;
    }

    @Override // X.InterfaceC08830cm
    public final /* bridge */ /* synthetic */ Object get() {
        C23851Ah3 c23851Ah3 = this.A03;
        Context context = c23851Ah3.A06;
        AnonymousClass840 anonymousClass840 = c23851Ah3.A0H;
        InterfaceC1810081c interfaceC1810081c = c23851Ah3.A0M;
        AbstractC59962oe abstractC59962oe = c23851Ah3.A0A;
        UserSession userSession = c23851Ah3.A0C;
        View view = c23851Ah3.A08;
        C3I9 c3i9 = c23851Ah3.A0D;
        InteractiveDrawableContainer interactiveDrawableContainer = c23851Ah3.A0R;
        C8C0 c8c0 = this.A02;
        TargetViewSizeProvider targetViewSizeProvider = c23851Ah3.A0G;
        C190388bw c190388bw = (C190388bw) userSession.A01(C190388bw.class, new B8P(userSession, 40));
        return new C190398bx(context, view, C22P.A2y, abstractC59962oe, userSession, c3i9, c23851Ah3.A0F, targetViewSizeProvider, anonymousClass840, this.A01, c8c0, c23851Ah3.A0K, interfaceC1810081c, c23851Ah3, c190388bw, null, interactiveDrawableContainer, 0, "IgLiveStickerOverlayController", null, false, C18U.A06(C06090Tz.A06, userSession, 36323964351426279L), false);
    }
}
