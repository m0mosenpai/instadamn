package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.model.thread.DiscoverableThreadInfo;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.G3a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36374G3a implements InterfaceC37196Ga7 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C36303Fzy A01;
    public final /* synthetic */ C7NH A02;
    public final /* synthetic */ FPJ A03;
    public final /* synthetic */ C189448aO A04;
    public final /* synthetic */ DirectShareTarget A05;

    @Override // X.InterfaceC37196Ga7
    public final void DGI(String str) {
        C14360o3.A0B(str, 0);
        C189478aR c189478aR = this.A03.A00;
        if (c189478aR != null) {
            C1YY A01 = FVI.A01();
            UserSession userSession = this.A00;
            java.util.Set set = FE3.A00;
            A01.A07(userSession, c189478aR, this.A04, str, "inbox_search");
        }
    }

    public C36374G3a(UserSession userSession, C36303Fzy c36303Fzy, C7NH c7nh, FPJ fpj, C189448aO c189448aO, DirectShareTarget directShareTarget) {
        this.A05 = directShareTarget;
        this.A01 = c36303Fzy;
        this.A02 = c7nh;
        this.A03 = fpj;
        this.A00 = userSession;
        this.A04 = c189448aO;
    }

    @Override // X.InterfaceC37196Ga7
    public final void Czz(boolean z) {
        C7NH c7nh;
        if (z && (c7nh = this.A02) != null) {
            c7nh.A02(this.A05);
        }
    }

    @Override // X.InterfaceC37196Ga7
    public final void DJl() {
        DirectShareTarget directShareTarget = this.A05;
        DiscoverableThreadInfo discoverableThreadInfo = directShareTarget.A06;
        if (discoverableThreadInfo != null) {
            discoverableThreadInfo.A03 = true;
            C36303Fzy c36303Fzy = this.A01;
            if (c36303Fzy != null) {
                c36303Fzy.A07(EnumC33509Eri.JOIN_SOCIAL_CHANNEL);
            }
        }
        C7NH c7nh = this.A02;
        if (c7nh != null) {
            c7nh.A02(directShareTarget);
        }
    }

    @Override // X.InterfaceC37196Ga7
    public final void DV6() {
        C36303Fzy c36303Fzy = this.A01;
        if (c36303Fzy != null) {
            c36303Fzy.A09(this.A05);
        }
    }
}
