package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.WoX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71136WoX implements InterfaceC72018XFg {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C68251VJn A02;
    public final /* synthetic */ C1V4 A03;

    public C71136WoX(FragmentActivity fragmentActivity, UserSession userSession, C68251VJn c68251VJn, C1V4 c1v4) {
        this.A03 = c1v4;
        this.A02 = c68251VJn;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    @Override // X.InterfaceC72018XFg
    public final /* bridge */ /* synthetic */ Object DV9(C69427VnC c69427VnC, Object obj, int i) {
        C68251VJn c68251VJn = this.A02;
        C67887V0u c67887V0u = c68251VJn.A03;
        C1ON A07 = AbstractC152476ta.A07(this.A01, c68251VJn.A01, C16030qx.A00(this.A00), true);
        A07.A00 = new C67954V3t(13, this, c69427VnC);
        c67887V0u.schedule(A07);
        return null;
    }
}
