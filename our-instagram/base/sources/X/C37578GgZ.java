package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.GgZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37578GgZ extends AbstractC37623GhI {
    public InterfaceC31137Dmc A00;
    public C37638GhX A01;
    public final Context A02;
    public final FragmentActivity A03;
    public final AbstractC59962oe A04;
    public final ClipsViewerConfig A05;
    public final UserSession A06;
    public final InterfaceC60442pS A07;
    public final C37579Gga A08;
    public final InterfaceC1119253e A09;
    public final ILF A0A;
    public final C37546Gg2 A0B;
    public final InterfaceC09390do A0C;

    public C37578GgZ(Context context, FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, ClipsViewerConfig clipsViewerConfig, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC1119253e interfaceC1119253e, ILF ilf, C37546Gg2 c37546Gg2) {
        C14360o3.A0B(userSession, 2);
        AbstractC25233BEq.A0y(5, interfaceC60442pS, clipsViewerConfig, ilf);
        this.A04 = abstractC59962oe;
        this.A06 = userSession;
        this.A03 = fragmentActivity;
        this.A02 = context;
        this.A07 = interfaceC60442pS;
        this.A0B = c37546Gg2;
        this.A09 = interfaceC1119253e;
        this.A05 = clipsViewerConfig;
        this.A0A = ilf;
        this.A08 = new C37579Gga(context, this);
        this.A0C = BQP.A00(this, 31);
    }

    @Override // X.AbstractC37623GhI, X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A01 = null;
        super.onDestroyView();
    }
}
