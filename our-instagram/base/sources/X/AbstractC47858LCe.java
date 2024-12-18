package X;

import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;

/* renamed from: X.LCe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47858LCe {
    public static final PrivacyMediaOverlayViewModel A00(C83403nh c83403nh) {
        String str;
        InterfaceC109094vY BRN;
        InterfaceC109094vY BRN2;
        C38321qM c38321qM = c83403nh.A0s;
        InterfaceC109884xG interfaceC109884xG = null;
        if (c38321qM != null && (BRN2 = c38321qM.BRN()) != null) {
            str = BRN2.getTitle();
        } else {
            str = null;
        }
        C38321qM c38321qM2 = c83403nh.A0s;
        if (c38321qM2 != null && (BRN = c38321qM2.BRN()) != null) {
            interfaceC109884xG = BRN.BEg();
        }
        return new PrivacyMediaOverlayViewModel(Integer.valueOf(AbstractC46598Kjb.A00(interfaceC109884xG)), C05F.A00, null, null, str, null, 0, false);
    }

    public static final boolean A01(C83403nh c83403nh) {
        InterfaceC109094vY BRN;
        C38321qM c38321qM;
        InterfaceC109094vY BRN2;
        C38321qM c38321qM2 = c83403nh.A0s;
        if (c38321qM2 != null && (BRN = c38321qM2.BRN()) != null && BRN.getTitle() != null && (c38321qM = c83403nh.A0s) != null && (BRN2 = c38321qM.BRN()) != null && BRN2.BEg() != null) {
            return true;
        }
        return false;
    }
}
