package X;

import android.app.Activity;
import android.graphics.Rect;
import android.view.LayoutInflater;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;

/* renamed from: X.Jrw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44775Jrw extends C3OO implements InterfaceC50434MOo {
    public C35041FcE A00;
    public final Activity A01;
    public final LayoutInflater A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44775Jrw(Activity activity, LayoutInflater layoutInflater, InterfaceC11380iw interfaceC11380iw, UserSession userSession, IgFrameLayout igFrameLayout, boolean z, boolean z2) {
        super(igFrameLayout);
        AbstractC25234BEr.A1P(igFrameLayout, activity, userSession);
        C14360o3.A0B(interfaceC11380iw, 5);
        this.A01 = activity;
        this.A02 = layoutInflater;
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A06 = z;
        this.A05 = z2;
    }

    @Override // X.InterfaceC50434MOo
    public final boolean AQ6(float f, float f2) {
        Rect A0U = AbstractC166987dD.A0U();
        this.itemView.getHitRect(A0U);
        return A0U.contains((int) f, (int) f2);
    }
}
