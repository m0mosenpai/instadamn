package X;

import android.content.Context;
import android.view.View;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Fs2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35826Fs2 implements InterfaceC48212Jk {
    public final int A00;
    public final Object A01;

    public C35826Fs2(int i, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = i;
        if (1 - i != 0) {
            this.A01 = interfaceC16660sJ;
        } else {
            this.A01 = interfaceC16660sJ;
        }
    }

    public static void A00(InterfaceC48192Ji interfaceC48192Ji, C1Dk c1Dk, C40701ud c40701ud, Object obj, int i) {
        c40701ud.ATV(new C35826Fs2(obj, i), interfaceC48192Ji, c1Dk);
    }

    @Override // X.InterfaceC48212Jk
    public final void invoke(Throwable th) {
        switch (this.A00) {
            case 0:
                ((GXJ) this.A01).Dh2(null);
                return;
            case 1:
                AbstractC25225BEi.A1U(this.A01, th);
                return;
            case 2:
                EI4 ei4 = (EI4) this.A01;
                View view = ei4.mView;
                if (view == null) {
                    return;
                }
                view.post(new GL2(ei4));
                return;
            case 3:
            case 5:
            case 6:
            default:
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 4:
                ((InterfaceC16660sJ) this.A01).invoke(null);
                return;
            case 7:
                GZ4 gz4 = (GZ4) this.A01;
                C14360o3.A0A(th);
                gz4.D7S(th);
                return;
            case 8:
                C17060sy.A01.A01((UserSession) this.A01).A03.EfA(false);
                return;
            case 9:
                EMS ems = ((FH4) this.A01).A00;
                EVN evn = ems.A01;
                if (evn != null) {
                    evn.A00();
                }
                EMS.A00(ems, 2131974293);
                return;
            case 10:
                ((GZK) this.A01).DFf();
                return;
            case 11:
                C0K8.A0F("SupervisedUserSettingRequestsApi", "fetchAndHandlePendingSettingChangeRequestIfApplicable: cancel pending requests failed", th);
                C9GR.A0F((Context) this.A01, "supervision_bloks_action_failed", 2131961896);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                ((C006802i) AbstractC166987dD.A17(((C31588DuG) this.A01).A01)).markerEnd(834877734, (short) 3);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C33223ElB c33223ElB = (C33223ElB) this.A01;
                c33223ElB.A07 = true;
                c33223ElB.A08 = false;
                c33223ElB.setItems(AbstractC166987dD.A1J(new Object()));
                C33223ElB.A01(c33223ElB);
                return;
        }
    }

    public C35826Fs2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
