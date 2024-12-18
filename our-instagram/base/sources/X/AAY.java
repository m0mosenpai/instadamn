package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class AAY {
    public C197738ok A00;
    public C197768on A01;
    public C23333AWc A02;
    public boolean A03;
    public final InterfaceC197758om A04;
    public final C200558ty A05;
    public final UserSession A06;
    public final AjM A07 = new AjM();
    public final Object A08 = new Object();
    public final AtomicBoolean A09;
    public final boolean A0A;

    public AAY(InterfaceC197758om interfaceC197758om, C200558ty c200558ty, UserSession userSession, boolean z) {
        this.A06 = userSession;
        this.A04 = interfaceC197758om;
        this.A05 = c200558ty;
        this.A0A = z;
        c200558ty.A04 = this;
        this.A09 = new AtomicBoolean(true);
    }
}
