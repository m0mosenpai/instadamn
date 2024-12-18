package X;

import android.os.Bundle;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.session.UserSession;

/* renamed from: X.G1t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36341G1t implements InterfaceC37154GYr {
    public final Bundle A00;
    public final FanClubInfoDict A01;
    public final UserSession A02;

    public C36341G1t(Bundle bundle, UserSession userSession) {
        C14360o3.A0B(bundle, 2);
        this.A02 = userSession;
        this.A00 = bundle;
        this.A01 = AbstractC31172DnG.A0M(AbstractC166997dE.A0Y(userSession));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r1 != 1) goto L10;
     */
    @Override // X.InterfaceC37154GYr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cgf(androidx.fragment.app.FragmentActivity r4) {
        /*
            r3 = this;
            r2 = 0
            X.C14360o3.A0B(r4, r2)
            android.os.Bundle r1 = r3.A00
            java.lang.String r0 = "InterestBasedChannelType"
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L20
            X.EoP r0 = X.AbstractC34104F3g.A00(r1)
            if (r0 == 0) goto L20
            int r1 = r0.ordinal()
            if (r1 == r2) goto L37
            r0 = 1
            r2 = 2131974806(0x7f135a96, float:1.9586686E38)
            if (r1 == r0) goto L23
        L20:
            r2 = 2131974293(0x7f135895, float:1.9585646E38)
        L23:
            X.8hC r1 = X.AbstractC31171DnF.A0H(r4)
            r1.A07()
            r0 = 2131974817(0x7f135aa1, float:1.9586709E38)
            r1.A0A(r0)
            r1.A09(r2)
            X.AbstractC166987dD.A1W(r1)
            return
        L37:
            r2 = 2131974816(0x7f135aa0, float:1.9586707E38)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36341G1t.Cgf(androidx.fragment.app.FragmentActivity):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC37154GYr
    public final boolean CY3() {
        EnumC33330EoP A00;
        boolean A01;
        boolean A012;
        boolean z;
        Integer C3U;
        Bundle bundle = this.A00;
        if (bundle.containsKey("InterestBasedChannelType") && (A00 = AbstractC34104F3g.A00(bundle)) != null) {
            int ordinal = A00.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    UserSession userSession = this.A02;
                    A01 = C7HD.A00(userSession);
                    A012 = AbstractC2051396d.A01(userSession);
                    FanClubInfoDict fanClubInfoDict = this.A01;
                    if (fanClubInfoDict != null && (C3U = fanClubInfoDict.C3U()) != null) {
                        z = C3U.intValue();
                    }
                    z = false;
                } else {
                    return false;
                }
            } else {
                UserSession userSession2 = this.A02;
                A01 = AbstractC2051496e.A01(userSession2);
                A012 = AbstractC2051396d.A01(userSession2);
                FanClubInfoDict fanClubInfoDict2 = this.A01;
                if (fanClubInfoDict2 != null) {
                    z = AbstractC166997dE.A1Z(fanClubInfoDict2.BBZ(), true);
                }
                z = false;
            }
            if (A012 && !A01 && !z) {
                return true;
            }
            return false;
        }
        return false;
    }
}
