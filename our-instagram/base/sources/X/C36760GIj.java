package X;

import com.instagram.common.session.UserSession;
import com.instagram.hallpass.model.HallPassMemberViewModel;

/* renamed from: X.GIj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36760GIj implements InterfaceC37219GaU {
    public final int A00;
    public final Object A01;
    public final Object A02;

    @Override // X.InterfaceC37219GaU
    public final void D6t() {
    }

    @Override // X.InterfaceC37219GaU
    public final void DFf() {
    }

    @Override // X.InterfaceC37219GaU
    public final void DqX() {
    }

    @Override // X.InterfaceC37219GaU
    public final void onCancel() {
    }

    @Override // X.InterfaceC37219GaU
    public final void onSuccess() {
    }

    public C36760GIj(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC37219GaU
    public final void Czi() {
        WEz A01;
        int i;
        EOM eom;
        int i2 = this.A00;
        Object obj = this.A02;
        if (i2 != 0) {
            EON eon = (EON) obj;
            UserSession A0r = AbstractC166987dD.A0r(eon.A0A);
            A01 = AbstractC69993VzD.A01(eon.requireActivity(), eon, A0r, EnumC65855TvH.A1A, VG2.A0o, ((HallPassMemberViewModel) this.A01).A00.getId());
            i = 5;
            eom = eon;
        } else {
            EOM eom2 = (EOM) obj;
            UserSession A0r2 = AbstractC166987dD.A0r(eom2.A05);
            A01 = AbstractC69993VzD.A01(eom2.requireActivity(), eom2, A0r2, EnumC65855TvH.A1A, VG2.A0o, ((HallPassMemberViewModel) this.A01).A00.getId());
            i = 4;
            eom = eom2;
        }
        A01.A08(new C33312Eo7(eom, i));
        A01.A09("nua_action", "profile_block");
        WEz.A00(null, A01);
    }
}
