package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.sponsored.analytics.SourceModelInfoParams;

/* renamed from: X.It8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42590It8 implements C53T {
    public Dialog A00;
    public C38321qM A01;
    public C63397SjR A02;
    public C63397SjR A03;
    public II2 A04;
    public final Context A05;
    public final DialogInterface.OnClickListener A06;
    public final C38K A07;
    public final UserSession A08;
    public final InterfaceC60442pS A09;
    public final InterfaceC60442pS A0A;
    public final SourceModelInfoParams A0B;
    public final C1M1 A0C;

    public C42590It8(C38K c38k, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC60442pS interfaceC60442pS2, SourceModelInfoParams sourceModelInfoParams, C1M1 c1m1) {
        AbstractC25233BEq.A0w(1, userSession, interfaceC60442pS, interfaceC60442pS2);
        this.A08 = userSession;
        this.A07 = c38k;
        this.A09 = interfaceC60442pS;
        this.A0A = interfaceC60442pS2;
        this.A0B = sourceModelInfoParams;
        this.A0C = c1m1;
        this.A05 = c38k.requireContext();
        this.A06 = DialogInterfaceOnClickListenerC41836Ifq.A00(this, 19);
    }

    public final C37952Gmu A00(IgImageView igImageView, InterfaceC38371qR interfaceC38371qR, C2Fb c2Fb) {
        C14360o3.A0B(interfaceC38371qR, 0);
        return AbstractC37951Gmt.A00(this.A07, this.A08, igImageView, interfaceC38371qR, this.A0A, this.A0B, c2Fb, this.A0C.getSessionId());
    }

    @Override // X.C53T
    public final void D3g(IgImageView igImageView, InterfaceC38371qR interfaceC38371qR, int i, int i2, boolean z, boolean z2) {
        AbstractC167007dF.A1E(interfaceC38371qR, 0, igImageView);
        C37953Gmv.A02(A00(igImageView, interfaceC38371qR, C2Fb.A2o));
    }
}
