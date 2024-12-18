package X;

import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.FxI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36144FxI implements InterfaceC41501vz {
    public final /* synthetic */ EKD A00;

    public C36144FxI(EKD ekd) {
        this.A00 = ekd;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(1341106668);
        C36050Fvm c36050Fvm = (C36050Fvm) obj;
        int A032 = C0f9.A03(2025811645);
        EKD ekd = this.A00;
        RegFlowExtras regFlowExtras = ekd.A01;
        regFlowExtras.A05 = c36050Fvm.A01;
        AbstractC34902FZo.A01(ekd, ekd.A00, c36050Fvm, regFlowExtras, EnumC33523Erw.A07.A00);
        C0f9.A0A(962778348, A032);
        C0f9.A0A(1222275960, A03);
    }
}
