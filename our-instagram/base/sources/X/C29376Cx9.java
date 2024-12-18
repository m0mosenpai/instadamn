package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.Cx9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29376Cx9 implements InterfaceC143526dr {
    public final /* synthetic */ View A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ InterfaceC56392iX A03;
    public final /* synthetic */ Reel A04;
    public final /* synthetic */ InterfaceC64002vL A05;

    public C29376Cx9(View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC56392iX interfaceC56392iX, Reel reel, InterfaceC64002vL interfaceC64002vL) {
        this.A00 = view;
        this.A04 = reel;
        this.A02 = userSession;
        this.A05 = interfaceC64002vL;
        this.A01 = interfaceC11380iw;
        this.A03 = interfaceC56392iX;
    }

    @Override // X.InterfaceC143526dr
    public final void DgX() {
        View view = this.A00;
        Reel reel = this.A04;
        AbstractC27699CJs.A00(view, this.A01, this.A02, reel, this.A05, false);
        this.A03.setVisibility(0);
    }
}
