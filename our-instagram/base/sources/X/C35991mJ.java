package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.1mJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35991mJ implements InterfaceC29421bJ {
    public static final C0KV A01 = new C0KV() { // from class: X.1mK
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(1018000479);
            int A032 = C0f9.A03(-1943328);
            C35991mJ c35991mJ = new C35991mJ(userSession);
            C0f9.A0A(1223261150, A032);
            C0f9.A0A(427804594, A03);
            return c35991mJ;
        }
    };
    public final UserSession A00;

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUr(C1OW c1ow, MNP mnp) {
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUn(C1OW c1ow, MNP mnp) {
        C35951mF c35951mF = (C35951mF) c1ow;
        AbstractC25651Mw.A00(this.A00).E4s(new C36112Fwm(AbstractC34335FCd.A00(((JTV) mnp).A02), c35951mF.A02, c35951mF.A03));
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUs(C1OW c1ow, MNP mnp, MNP mnp2) {
        String str;
        C35951mF c35951mF = (C35951mF) c1ow;
        String str2 = ((JTV) mnp2).A02;
        UserSession userSession = this.A00;
        AbstractC25651Mw.A00(userSession).E4s(new C36112Fwm(AbstractC34335FCd.A00(str2), c35951mF.A02, c35951mF.A03));
        switch (str2.hashCode()) {
            case 1501196714:
                str = "upload_failed_permanent";
                break;
            case 1563991648:
                if (!str2.equals("uploaded")) {
                    return;
                }
                String str3 = c35951mF.A02;
                boolean z = c35951mF.A03;
                User A02 = AnonymousClass189.A00(userSession).A02(str3);
                if (A02 == null) {
                    C0K8.A0O("DirectUserMessagingMutationStateObserver", "user with id: %s does not exist in cache.", str3);
                    return;
                } else {
                    A02.A18(z);
                    AbstractC25651Mw.A00(userSession).E4s(new C42281xI(A02));
                    return;
                }
            case 1885454214:
                str = "upload_failed_transient";
                break;
            default:
                return;
        }
        if (!str2.equals(str)) {
            return;
        }
        Context context = AbstractC12290kX.A00;
        String str4 = c35951mF.A01;
        if (str4 == null) {
            str4 = "";
        }
        boolean z2 = c35951mF.A03;
        int i = AbstractC35116FeI.A00;
        C14360o3.A0B(context, 0);
        int i2 = 2131974277;
        if (z2) {
            i2 = 2131974274;
        }
        String string = context.getString(i2, str4);
        C14360o3.A07(string);
        AbstractC35116FeI.A01(string);
    }

    public C35991mJ(UserSession userSession) {
        this.A00 = userSession;
    }
}
