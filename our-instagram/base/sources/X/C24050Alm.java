package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Alm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24050Alm implements InterfaceC58073Poy {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ InterfaceC16820sZ A01;
    public final /* synthetic */ InterfaceC16820sZ A02;
    public final /* synthetic */ boolean A03;

    public C24050Alm(UserSession userSession, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, boolean z) {
        this.A02 = interfaceC16820sZ;
        this.A00 = userSession;
        this.A03 = z;
        this.A01 = interfaceC16820sZ2;
    }

    @Override // X.InterfaceC58073Poy
    public final void DFf() {
        this.A01.invoke();
        UserSession userSession = this.A00;
        boolean z = this.A03;
        Integer num = C05F.A00;
        C9LK.A06(userSession, "server_setting_updated_failed", null, C9H5.A01(num), C200108tF.A06(userSession), z);
    }

    @Override // X.InterfaceC58073Poy
    public final void Dq3(C213789dd c213789dd) {
        String str;
        this.A02.invoke();
        UserSession userSession = this.A00;
        boolean z = this.A03;
        boolean A1W = AbstractC167007dF.A1W(c213789dd);
        Integer num = C05F.A00;
        boolean A06 = C200108tF.A06(userSession);
        if (A1W && z) {
            str = "ON";
        } else {
            str = "OFF";
        }
        C9LK.A06(userSession, "server_setting_updated_success", str, C9H5.A01(num), A06, z);
    }
}