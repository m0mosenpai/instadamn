package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.JrX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44750JrX extends C3OO {
    public MRJ A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final InterfaceC56392iX A03;
    public final C57112jm A04;
    public final C47360Kw9 A05;
    public final C7EA A06;
    public final IgImageButton A07;
    public final InterfaceC16660sJ A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C44750JrX(View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC16660sJ interfaceC16660sJ) {
        super(view);
        C7EA c7ea = new C7EA(userSession, new C7E9(userSession));
        C47360Kw9 c47360Kw9 = new C47360Kw9(userSession);
        this.A08 = interfaceC16660sJ;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A06 = c7ea;
        this.A05 = c47360Kw9;
        IgImageButton igImageButton = (IgImageButton) AbstractC166997dE.A0R(view, R.id.image_button);
        this.A07 = igImageButton;
        this.A03 = AbstractC166997dE.A0X(view, R.id.privacy_overlay_stub);
        this.A04 = AbstractC58982mw.A00(igImageButton);
    }
}
