package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;

/* renamed from: X.2T6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2T6 extends C1WE {
    public final Context A00;

    public C2T6(Context context) {
        C14360o3.A0B(context, 1);
        this.A00 = context;
    }

    @Override // X.C1WE
    public final String A0C() {
        return "ig_encrypted_backups_one_time_code";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0Jk, java.lang.Object] */
    @Override // X.C1WE
    public final void A0D(C116155Nu c116155Nu, AbstractC12990ll abstractC12990ll, L85 l85, String str) {
        C14360o3.A0B(c116155Nu, 0);
        C14360o3.A0B(abstractC12990ll, 2);
        C14360o3.A0B(l85, 3);
        if (abstractC12990ll instanceof UserSession) {
            UserSession userSession = (UserSession) abstractC12990ll;
            C14360o3.A0B(userSession, 0);
            C006802i c006802i = C006802i.A0p;
            C14360o3.A07(c006802i);
            KPN kpn = new KPN(c006802i, C6CE.A00(userSession), C0BQ.A00(userSession));
            kpn.A03();
            if (C14360o3.A0K(userSession.userId, c116155Nu.A0j)) {
                A00(userSession, kpn, l85);
                return;
            }
            C023409i.A0A.A0A(new Object(), null, new C49589Lvi(kpn, this, l85), c116155Nu.A0j);
            return;
        }
        l85.A00(false);
    }

    @Override // X.C1WE
    public final void A0B(C116155Nu c116155Nu, UserSession userSession, String str, boolean z) {
        if (userSession != null && C6CB.A02(C6CE.A00(userSession).A00, 36315928475995957L) && C14360o3.A0K(userSession.userId, c116155Nu.A0j)) {
            if (!C218914p.A09()) {
                Context context = this.A00;
                if (LH7.A02(context)) {
                    Intent A03 = C14H.A03.A00().A03(context, 536870912);
                    A03.putExtra("LAUNCH_OTC_DISPLAY_SCREEN", true);
                    C12260kU.A0C(context, A03);
                    return;
                }
                return;
            }
            C3LC A00 = C3LB.A00(userSession);
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            InterfaceC19610xo ARD = A00.A00.ARD();
            ARD.E7G("OTC_DISPLAY_CODE_INTRO", currentTimeMillis);
            ARD.apply();
        }
    }

    public static final void A00(UserSession userSession, KPN kpn, L85 l85) {
        String str;
        InterfaceC19630xq interfaceC19630xq = C3LB.A00(userSession).A00;
        EnumC46172KcA enumC46172KcA = EnumC46172KcA.A07;
        String string = interfaceC19630xq.getString("EB_BACKUP_STATUS", enumC46172KcA.toString());
        Enum r3 = null;
        if (string != null) {
            try {
                r3 = Enum.valueOf(EnumC46172KcA.class, string);
            } catch (IllegalArgumentException unused) {
            }
        }
        EnumC46172KcA enumC46172KcA2 = (EnumC46172KcA) r3;
        if (enumC46172KcA2 == null) {
            enumC46172KcA2 = enumC46172KcA;
        }
        boolean z = true;
        if (enumC46172KcA2.ordinal() == 4) {
            kpn.A05("OTC_NOTIFICATION_SHOWN");
            kpn.A02();
        } else {
            kpn.A05("OTC_NOTIFICATION_NOT_SHOWN");
            Integer num = C05F.A0C;
            if (enumC46172KcA2 == EnumC46172KcA.A06) {
                str = "NO_BACKUPS_PRESENT";
            } else if (enumC46172KcA2 == EnumC46172KcA.A02) {
                str = "DEVICE_NOT_ONBOARDED";
            } else {
                if (enumC46172KcA2 == EnumC46172KcA.A04) {
                    kpn.A07("END_REASON", "FETCH_ERROR");
                    num = C05F.A01;
                } else if (enumC46172KcA2 == enumC46172KcA) {
                    str = "UNKNOWN";
                }
                kpn.A04(num);
                z = false;
            }
            kpn.A07("END_REASON", str);
            kpn.A04(num);
            z = false;
        }
        l85.A00(z);
    }
}
