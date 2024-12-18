package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igtv.model.IGTVViewerLoggingToken;

/* renamed from: X.NEl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52347NEl extends AbstractC66412zI {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final JGB A02;
    public final DialogInterfaceOnDismissListenerC41846Ig0 A03;
    public final JPc A04;
    public final InterfaceC16610sE A05;
    public final boolean A06;

    public C52347NEl(UserSession userSession, InterfaceC60442pS interfaceC60442pS, JGB jgb, DialogInterfaceOnDismissListenerC41846Ig0 dialogInterfaceOnDismissListenerC41846Ig0, JPc jPc, InterfaceC16610sE interfaceC16610sE) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = jgb;
        this.A04 = jPc;
        this.A01 = interfaceC60442pS;
        this.A06 = true;
        this.A03 = dialogInterfaceOnDismissListenerC41846Ig0;
        this.A05 = interfaceC16610sE;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        UserSession userSession = this.A00;
        EnumC39626Hek enumC39626Hek = EnumC39626Hek.A0h;
        JGB jgb = this.A02;
        JPc jPc = this.A04;
        InterfaceC60442pS interfaceC60442pS = this.A01;
        boolean z = this.A06;
        DialogInterfaceOnDismissListenerC41846Ig0 dialogInterfaceOnDismissListenerC41846Ig0 = this.A03;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        Context context = viewGroup.getContext();
        return new C38522Gwi(context, LayoutInflater.from(context).inflate(R.layout.igtv_thumbnail, viewGroup, false), userSession, interfaceC60442pS, jgb, enumC39626Hek, dialogInterfaceOnDismissListenerC41846Ig0, jPc, z, true);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C56092OvC c56092OvC = (C56092OvC) interfaceC66482zP;
        C38522Gwi c38522Gwi = (C38522Gwi) c3oo;
        AbstractC167007dF.A1K(c56092OvC, c38522Gwi);
        JPd jPd = c56092OvC.A00;
        IGTVViewerLoggingToken iGTVViewerLoggingToken = c38522Gwi.A0F;
        iGTVViewerLoggingToken.A01 = c38522Gwi.getBindingAdapterPosition();
        iGTVViewerLoggingToken.A00 = 0;
        C38522Gwi.A01(jPd, c38522Gwi);
        InterfaceC16610sE interfaceC16610sE = this.A05;
        if (interfaceC16610sE != null) {
            interfaceC16610sE.invoke(AbstractC31171DnF.A06(c38522Gwi), Integer.valueOf(c38522Gwi.getLayoutPosition()), jPd);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56092OvC.class;
    }
}
