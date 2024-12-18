package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.model.effect.AttributedAREffect;

/* renamed from: X.Fo7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35616Fo7 implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C41181vS A02;
    public final /* synthetic */ InterfaceC144586fe A03;
    public final /* synthetic */ C6e7 A04;

    public ViewOnClickListenerC35616Fo7(Context context, UserSession userSession, C41181vS c41181vS, InterfaceC144586fe interfaceC144586fe, C6e7 c6e7) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = c41181vS;
        this.A04 = c6e7;
        this.A03 = interfaceC144586fe;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(2129751162);
        Context context = this.A00;
        C14360o3.A0A(context);
        C35115FeH.A00(context, this.A01, 3);
        AttributedAREffect attributedAREffect = this.A02.A05;
        if (attributedAREffect != null) {
            C6e7 c6e7 = this.A04;
            InterfaceC144586fe interfaceC144586fe = this.A03;
            IgSimpleImageView igSimpleImageView = (IgSimpleImageView) c6e7.A1g.getView();
            boolean z = !attributedAREffect.CcN();
            C141466aP.A05(igSimpleImageView, attributedAREffect, z);
            interfaceC144586fe.DD4(new C32545EUv(8, attributedAREffect, igSimpleImageView, z), z);
        }
        C0f9.A0C(-1505883459, A05);
    }
}
