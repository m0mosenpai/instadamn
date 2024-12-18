package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGLeadGenSubheaderTrustSignalDataDict;
import com.instagram.api.schemas.IGLeadGenSubheaderTrustSignalDataDictImpl;
import com.instagram.api.schemas.ImmutablePandoIGLeadGenSubheaderTrustSignalDataDict;

/* renamed from: X.HPn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39222HPn extends C17T implements InterfaceC104914o3 {
    @Override // X.InterfaceC104914o3
    public final InterfaceC108024tl B6f() {
        return (InterfaceC108024tl) A05(489495828, HPq.class);
    }

    @Override // X.InterfaceC104914o3
    public final InterfaceC115285Iz BMn() {
        return (InterfaceC115285Iz) A05(-806921072, C33017EhK.class);
    }

    @Override // X.InterfaceC104914o3
    public final C5L5 BeF() {
        return (C5L5) A05(-1592737810, C39223HPo.class);
    }

    @Override // X.InterfaceC104914o3
    public final IGLeadGenSubheaderTrustSignalDataDict CB8() {
        return (IGLeadGenSubheaderTrustSignalDataDict) A05(-1640432774, ImmutablePandoIGLeadGenSubheaderTrustSignalDataDict.class);
    }

    @Override // X.InterfaceC104914o3
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, HoM.A00(this));
    }

    @Override // X.InterfaceC104914o3
    public final C108034tm Eum() {
        C108014tk c108014tk;
        C31208Dnr c31208Dnr;
        C38719H3h c38719H3h;
        InterfaceC108024tl B6f = B6f();
        IGLeadGenSubheaderTrustSignalDataDictImpl iGLeadGenSubheaderTrustSignalDataDictImpl = null;
        if (B6f != null) {
            c108014tk = B6f.Eup();
        } else {
            c108014tk = null;
        }
        InterfaceC115285Iz BMn = BMn();
        if (BMn != null) {
            c31208Dnr = BMn.Eul();
        } else {
            c31208Dnr = null;
        }
        C5L5 BeF = BeF();
        if (BeF != null) {
            c38719H3h = BeF.Eun();
        } else {
            c38719H3h = null;
        }
        IGLeadGenSubheaderTrustSignalDataDict CB8 = CB8();
        if (CB8 != null) {
            iGLeadGenSubheaderTrustSignalDataDictImpl = CB8.Euq();
        }
        return new C108034tm(c31208Dnr, c38719H3h, c108014tk, iGLeadGenSubheaderTrustSignalDataDictImpl);
    }
}
