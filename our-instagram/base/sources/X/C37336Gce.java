package X;

import androidx.fragment.app.Fragment;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.Gce, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37336Gce implements InterfaceC42271xH {
    public final /* synthetic */ C141956bE A00;

    public C37336Gce(C141956bE c141956bE) {
        this.A00 = c141956bE;
    }

    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        Fragment fragment = (Fragment) this.A00.A08.get();
        if (fragment != null && fragment.isResumed()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        C38321qM c38321qM;
        String A2u;
        String str;
        int A03 = C0f9.A03(906785081);
        C142676cT c142676cT = (C142676cT) obj;
        int A032 = C0f9.A03(1091135165);
        C14360o3.A0B(c142676cT, 0);
        InterfaceC144586fe interfaceC144586fe = this.A00.A07;
        InterfaceC38401qU interfaceC38401qU = c142676cT.A00;
        C145176gc c145176gc = (C145176gc) interfaceC144586fe;
        C14360o3.A0B(interfaceC38401qU, 0);
        InterfaceC1118853a interfaceC1118853a = c145176gc.A18;
        C41181vS AuU = interfaceC1118853a.AuU();
        if (AuU != null && (c38321qM = AuU.A0b) != null && (A2u = c38321qM.A2u()) != null && A2u.equals(interfaceC38401qU.Biw()) && c145176gc.A0a != null && c145176gc.A0c != null && c145176gc.A0b != null) {
            ((ReelViewerFragment) interfaceC1118853a).A1C.C00(AuU).A0x = true;
            C147316kH c147316kH = c145176gc.A0a;
            if (c147316kH == null) {
                str = "reelPhotoTimerController";
            } else {
                c147316kH.A02();
                C147356kL c147356kL = c145176gc.A0c;
                if (c147356kL == null) {
                    str = "showreelNativeTimerController";
                } else {
                    c147356kL.A01();
                    C147376kN c147376kN = c145176gc.A0b;
                    if (c147376kN == null) {
                        str = "showreelCompositionTimerController";
                    } else {
                        c147376kN.A01();
                        interfaceC1118853a.ADf(false);
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        C0f9.A0A(-798148384, A032);
        C0f9.A0A(-1787811617, A03);
    }
}
