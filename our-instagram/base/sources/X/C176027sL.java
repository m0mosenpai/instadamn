package X;

import java.util.Map;

/* renamed from: X.7sL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176027sL implements InterfaceC176037sM {
    public final InterfaceC178407wE A00;

    @Override // X.InterfaceC176037sM
    public final void EmV(String str, Throwable th, boolean z) {
        InterfaceC178407wE interfaceC178407wE = this.A00;
        if (interfaceC178407wE != null) {
            interfaceC178407wE.EmV(str, th, false);
        }
    }

    @Override // X.InterfaceC176037sM
    public final void ABc(int i, String str, String str2) {
        InterfaceC178407wE interfaceC178407wE = this.A00;
        if (interfaceC178407wE != null) {
            interfaceC178407wE.Cwo(19, "isEffectOnDuringRecording", str2);
        }
    }

    @Override // X.InterfaceC176037sM
    public final InterfaceC178407wE B4Z() {
        InterfaceC178407wE interfaceC178407wE = this.A00;
        if (interfaceC178407wE == null) {
            return new C201438vY();
        }
        return interfaceC178407wE;
    }

    @Override // X.InterfaceC176037sM
    public final void Ckz(int i, String str) {
        InterfaceC178407wE interfaceC178407wE = this.A00;
        if (interfaceC178407wE != null) {
            interfaceC178407wE.DEZ(19, str);
        }
    }

    @Override // X.InterfaceC176037sM
    public final void Cl9(AbstractC223559ty abstractC223559ty, String str, String str2, String str3, String str4, Map map, long j) {
        InterfaceC178407wE interfaceC178407wE = this.A00;
        if (interfaceC178407wE != null) {
            interfaceC178407wE.Cl9(abstractC223559ty, str, str2, str3, str4, map, j);
        }
    }

    @Override // X.InterfaceC176037sM
    public final void ClA(AbstractC223559ty abstractC223559ty, String str, String str2, String str3, String str4, String str5, long j) {
        InterfaceC178407wE interfaceC178407wE = this.A00;
        if (interfaceC178407wE != null) {
            interfaceC178407wE.ClA(abstractC223559ty, str, str2, str3, str4, str5, j);
        }
    }

    @Override // X.InterfaceC176037sM
    public final void EcD(String str) {
        InterfaceC178407wE interfaceC178407wE = this.A00;
        if (interfaceC178407wE != null) {
            interfaceC178407wE.AkA().Egz(str);
        }
    }

    public C176027sL(InterfaceC178407wE interfaceC178407wE) {
        this.A00 = interfaceC178407wE;
    }
}
