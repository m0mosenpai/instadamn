package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.NTs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52707NTs extends AbstractC54988OTw {
    public List A00;
    public boolean A01;
    public boolean A02;
    public final UserSession A03;
    public final C23031Ai A04;
    public final NU1 A05;
    public final C56126Ovm A06;
    public final InterfaceC16820sZ A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C52707NTs(UserSession userSession, NU1 nu1, C54446O4a c54446O4a, InterfaceC16820sZ interfaceC16820sZ) {
        super(c54446O4a);
        C56126Ovm c56126Ovm = (C56126Ovm) userSession.A01(C56126Ovm.class, C57419PeH.A00);
        C14360o3.A0B(c56126Ovm, 4);
        this.A03 = userSession;
        this.A05 = nu1;
        this.A06 = c56126Ovm;
        this.A07 = interfaceC16820sZ;
        this.A04 = AbstractC23021Ah.A00(userSession);
        this.A00 = C16930sl.A00;
    }
}
