package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Csg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29115Csg implements InterfaceC30933Din {
    public final /* synthetic */ C26608Bp5 A00;
    public final /* synthetic */ InterfaceC101404gy A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ C14510oO A03;
    public final /* synthetic */ C15370ps A04;

    @Override // X.InterfaceC30933Din
    public final void DWy(CTJ ctj, String str, String str2, int i) {
        C14360o3.A0B(ctj, 0);
        C26608Bp5 c26608Bp5 = this.A00;
        C25814BbV c25814BbV = c26608Bp5.A02;
        InterfaceC101404gy interfaceC101404gy = this.A01;
        C15370ps c15370ps = this.A04;
        c25814BbV.A0U(interfaceC101404gy, (Integer) c15370ps.A00, str, str2, i);
        Ch9 ch9 = Ch9.A00;
        UserSession userSession = c26608Bp5.A03;
        boolean z = c26608Bp5.A01.A0f;
        String moduleName = c26608Bp5.A04.getModuleName();
        List list = this.A02;
        ch9.A04(ctj, userSession, interfaceC101404gy, moduleName, list, new MEB(9, ctj, this.A03, c26608Bp5, interfaceC101404gy, list), new DHO(i, 10, c15370ps), new C50368MLv(c26608Bp5, 41), C30480DbP.A00(c26608Bp5, 45), i, z);
    }

    public C29115Csg(C26608Bp5 c26608Bp5, InterfaceC101404gy interfaceC101404gy, List list, C14510oO c14510oO, C15370ps c15370ps) {
        this.A00 = c26608Bp5;
        this.A01 = interfaceC101404gy;
        this.A04 = c15370ps;
        this.A02 = list;
        this.A03 = c14510oO;
    }
}
