package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* loaded from: classes8.dex */
public final class JU7 implements InterfaceC50487MQp {
    public final /* synthetic */ JU6 A00;

    public JU7(JU6 ju6) {
        this.A00 = ju6;
    }

    @Override // X.InterfaceC50487MQp
    public final void DAq() {
        JU6 ju6 = this.A00;
        InterfaceC50429MOj interfaceC50429MOj = ((AbstractC46524KiP) ju6).A00;
        if (interfaceC50429MOj != null) {
            interfaceC50429MOj.onDismiss();
        }
        AbstractC167007dF.A0x(ju6.A00);
    }

    @Override // X.InterfaceC50487MQp
    public final void Dar() {
        JU6 ju6 = this.A00;
        InterfaceC50429MOj interfaceC50429MOj = ((AbstractC46524KiP) ju6).A00;
        if (interfaceC50429MOj != null) {
            interfaceC50429MOj.onDismiss();
        }
        AbstractC167007dF.A0x(ju6.A00);
        if (ju6.A03) {
            LLD.A02(EnumC46297KeT.BANNER, ju6.A05, ju6.A01);
        }
    }

    @Override // X.InterfaceC50487MQp
    public final void Dja() {
        JU6 ju6 = this.A00;
        InterfaceC50429MOj interfaceC50429MOj = ((AbstractC46524KiP) ju6).A00;
        if (interfaceC50429MOj != null) {
            interfaceC50429MOj.onDismiss();
        }
        AbstractC167007dF.A0x(ju6.A00);
        Bundle A0b = AbstractC166987dD.A0b();
        UserSession userSession = ju6.A05;
        AbstractC31173DnH.A1C(A0b, userSession);
        A0b.putString("ODNC_USER_ROLE_KEY", "SENDER");
        A0b.putString("ODNC_ENTRY_POINT_KEY", "BANNER");
        A0b.putBoolean("IS_ELIGIBLE_FOR_LOGGING_KEY", ju6.A03);
        A0b.putParcelable("DIRECT_THREAD_ANALYTICS_PARAMS_KEY", C0B1.A00(ju6.A01));
        FragmentActivity fragmentActivity = ju6.A04;
        C6XJ A03 = C6XJ.A03(fragmentActivity, A0b, userSession, ModalActivity.class, "ON_DEVICE_NUDITY_CONTROL_RECEIVER_EDUCATION");
        A03.A08();
        A03.A0C(fragmentActivity);
        if (ju6.A03) {
            LLD.A01(EnumC46297KeT.BANNER, EnumC46278KeA.SENDER, userSession, ju6.A01);
        }
    }
}
