package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Csf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29114Csf implements InterfaceC30933Din {
    public final /* synthetic */ C166047bW A00;
    public final /* synthetic */ C29177Cti A01;
    public final /* synthetic */ InterfaceC101404gy A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ C15370ps A04;

    @Override // X.InterfaceC30933Din
    public final void DWy(CTJ ctj, String str, String str2, int i) {
        C14360o3.A0B(ctj, 0);
        C29177Cti c29177Cti = this.A01;
        InterfaceC16590sC interfaceC16590sC = c29177Cti.A0A;
        InterfaceC101404gy interfaceC101404gy = this.A02;
        C15370ps c15370ps = this.A04;
        interfaceC16590sC.invoke(str, str2, interfaceC101404gy, c15370ps.A00, Integer.valueOf(i));
        Ch9 ch9 = Ch9.A00;
        UserSession userSession = c29177Cti.A03;
        C166047bW c166047bW = this.A00;
        boolean z = c166047bW.A0f;
        String moduleName = c29177Cti.A04.getModuleName();
        List list = this.A03;
        ch9.A04(ctj, userSession, interfaceC101404gy, moduleName, list, new ME7(23, ctj, c29177Cti, list, interfaceC101404gy), new DHO(i, 9, c15370ps), new C50368MLv(c29177Cti, 25), new C30485DbU(9, c166047bW, c29177Cti), i, z);
    }

    public C29114Csf(C166047bW c166047bW, C29177Cti c29177Cti, InterfaceC101404gy interfaceC101404gy, List list, C15370ps c15370ps) {
        this.A01 = c29177Cti;
        this.A02 = interfaceC101404gy;
        this.A04 = c15370ps;
        this.A00 = c166047bW;
        this.A03 = list;
    }
}
