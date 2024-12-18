package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGLeadGenSubheaderTrustSignalDataDict;

/* renamed from: X.4tm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108034tm extends C0T6 implements InterfaceC104914o3 {
    public final InterfaceC115285Iz A00;
    public final C5L5 A01;
    public final InterfaceC108024tl A02;
    public final IGLeadGenSubheaderTrustSignalDataDict A03;

    @Override // X.InterfaceC104914o3
    public final C108034tm Eum() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C108034tm) {
                C108034tm c108034tm = (C108034tm) obj;
                if (!C14360o3.A0K(this.A02, c108034tm.A02) || !C14360o3.A0K(this.A00, c108034tm.A00) || !C14360o3.A0K(this.A01, c108034tm.A01) || !C14360o3.A0K(this.A03, c108034tm.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        InterfaceC108024tl interfaceC108024tl = this.A02;
        int hashCode = (interfaceC108024tl == null ? 0 : interfaceC108024tl.hashCode()) * 31;
        InterfaceC115285Iz interfaceC115285Iz = this.A00;
        int hashCode2 = (hashCode + (interfaceC115285Iz == null ? 0 : interfaceC115285Iz.hashCode())) * 31;
        C5L5 c5l5 = this.A01;
        int hashCode3 = (hashCode2 + (c5l5 == null ? 0 : c5l5.hashCode())) * 31;
        IGLeadGenSubheaderTrustSignalDataDict iGLeadGenSubheaderTrustSignalDataDict = this.A03;
        return hashCode3 + (iGLeadGenSubheaderTrustSignalDataDict != null ? iGLeadGenSubheaderTrustSignalDataDict.hashCode() : 0);
    }

    @Override // X.InterfaceC104914o3
    public final InterfaceC108024tl B6f() {
        return this.A02;
    }

    @Override // X.InterfaceC104914o3
    public final InterfaceC115285Iz BMn() {
        return this.A00;
    }

    @Override // X.InterfaceC104914o3
    public final C5L5 BeF() {
        return this.A01;
    }

    @Override // X.InterfaceC104914o3
    public final IGLeadGenSubheaderTrustSignalDataDict CB8() {
        return this.A03;
    }

    @Override // X.InterfaceC104914o3
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGLeadGenPreClickDataDict", HoM.A00(this));
    }

    public C108034tm(InterfaceC115285Iz interfaceC115285Iz, C5L5 c5l5, InterfaceC108024tl interfaceC108024tl, IGLeadGenSubheaderTrustSignalDataDict iGLeadGenSubheaderTrustSignalDataDict) {
        this.A02 = interfaceC108024tl;
        this.A00 = interfaceC115285Iz;
        this.A01 = c5l5;
        this.A03 = iGLeadGenSubheaderTrustSignalDataDict;
    }
}
