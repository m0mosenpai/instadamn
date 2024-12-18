package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.base.activity.parcel.OpaqueParcelable;
import com.instagram.common.session.UserSession;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final class JU3 implements InterfaceC50487MQp {
    public final /* synthetic */ JU4 A00;

    public JU3(JU4 ju4) {
        this.A00 = ju4;
    }

    @Override // X.InterfaceC50487MQp
    public final void DAq() {
        JU4 ju4 = this.A00;
        InterfaceC50429MOj interfaceC50429MOj = ((AbstractC46524KiP) ju4).A00;
        if (interfaceC50429MOj != null) {
            interfaceC50429MOj.onDismiss();
        }
        AbstractC167007dF.A0x(ju4.A00);
    }

    @Override // X.InterfaceC50487MQp
    public final void Dar() {
        JU4 ju4 = this.A00;
        InterfaceC50429MOj interfaceC50429MOj = ((AbstractC46524KiP) ju4).A00;
        if (interfaceC50429MOj != null) {
            interfaceC50429MOj.onDismiss();
        }
        AbstractC167007dF.A0x(ju4.A00);
        Bundle A0b = AbstractC166987dD.A0b();
        UserSession userSession = ju4.A08;
        AbstractC31173DnH.A1C(A0b, userSession);
        A0b.putString("ODNC_USER_ROLE_KEY", "RECEIVER");
        A0b.putString("ODNC_ENTRY_POINT_KEY", "BANNER");
        A0b.putBoolean("IS_ELIGIBLE_FOR_LOGGING_KEY", ju4.A06);
        DirectThreadAnalyticsParams directThreadAnalyticsParams = ju4.A02;
        if (directThreadAnalyticsParams != null) {
            A0b.putParcelable("DIRECT_THREAD_ANALYTICS_PARAMS_KEY", new OpaqueParcelable(directThreadAnalyticsParams));
            FragmentActivity fragmentActivity = ju4.A07;
            C6XJ A03 = C6XJ.A03(fragmentActivity, A0b, userSession, ModalActivity.class, "ON_DEVICE_NUDITY_CONTROL_RECEIVER_EDUCATION");
            A03.A08();
            A03.A0C(fragmentActivity);
            if (ju4.A06) {
                EnumC46278KeA enumC46278KeA = EnumC46278KeA.RECEIVER;
                EnumC46297KeT enumC46297KeT = EnumC46297KeT.BANNER;
                DirectThreadAnalyticsParams directThreadAnalyticsParams2 = ju4.A02;
                if (directThreadAnalyticsParams2 != null) {
                    LLD.A01(enumC46297KeT, enumC46278KeA, userSession, directThreadAnalyticsParams2);
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F("directThreadAnalyticsParams");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC50487MQp
    public final void Dja() {
        JU4 ju4 = this.A00;
        InterfaceC50429MOj interfaceC50429MOj = ((AbstractC46524KiP) ju4).A00;
        if (interfaceC50429MOj != null) {
            interfaceC50429MOj.onDismiss();
        }
        AbstractC167007dF.A0x(ju4.A00);
        User user = ju4.A04;
        String str = "sender";
        if (user != null) {
            if (!user.CQf()) {
                FragmentActivity fragmentActivity = ju4.A07;
                UserSession userSession = ju4.A08;
                User user2 = ju4.A04;
                if (user2 != null) {
                    C2EC c2ec = ju4.A01;
                    if (c2ec == null) {
                        str = "extendedDirectThread";
                    } else {
                        String str2 = ju4.A05;
                        if (str2 == null) {
                            str = "threadId";
                        } else {
                            MessageIdentifier messageIdentifier = ju4.A03;
                            if (messageIdentifier == null) {
                                str = "messageIdentifier";
                            } else {
                                F75.A00(fragmentActivity, userSession, ju4.A09, c2ec, messageIdentifier, user2, str2, "NudityReceiverEducationQPBanner");
                                return;
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
