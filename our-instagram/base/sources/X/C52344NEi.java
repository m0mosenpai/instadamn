package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igtv.model.IGTVViewerLoggingToken;

/* renamed from: X.NEi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52344NEi extends AbstractC66412zI {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final JGB A02;
    public final EnumC39626Hek A03;
    public final JPc A04;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        UserSession userSession = this.A00;
        EnumC39626Hek enumC39626Hek = this.A03;
        JGB jgb = this.A02;
        JPc jPc = this.A04;
        InterfaceC60442pS interfaceC60442pS = this.A01;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        Context context = viewGroup.getContext();
        return new C38522Gwi(context, LayoutInflater.from(context).inflate(R.layout.igtv_thumbnail, viewGroup, false), userSession, interfaceC60442pS, jgb, enumC39626Hek, null, jPc, true, false);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C56105OvP c56105OvP = (C56105OvP) interfaceC66482zP;
        C38522Gwi c38522Gwi = (C38522Gwi) c3oo;
        AbstractC167017dG.A1N(c56105OvP, c38522Gwi);
        JPd jPd = c56105OvP.A01;
        IGTVViewerLoggingToken iGTVViewerLoggingToken = c38522Gwi.A0F;
        iGTVViewerLoggingToken.A01 = c38522Gwi.getBindingAdapterPosition();
        iGTVViewerLoggingToken.A00 = 0;
        C38522Gwi.A01(jPd, c38522Gwi);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56105OvP.class;
    }

    public C52344NEi(UserSession userSession, InterfaceC60442pS interfaceC60442pS, JGB jgb, EnumC39626Hek enumC39626Hek, JPc jPc) {
        this.A00 = userSession;
        this.A03 = enumC39626Hek;
        this.A01 = interfaceC60442pS;
        this.A02 = jgb;
        this.A04 = jPc;
    }
}
