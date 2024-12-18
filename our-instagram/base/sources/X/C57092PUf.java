package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.PUf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57092PUf implements InterfaceC09250da, InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C57092PUf(Context context, UserSession userSession, C54796OJo c54796OJo, String str, int i) {
        this.A00 = i;
        this.A01 = userSession;
        this.A02 = context;
        this.A04 = str;
        this.A03 = c54796OJo;
    }

    @Override // X.InterfaceC16660sJ
    public final Object invoke(Object obj) {
        int i;
        int i2 = this.A00;
        UserSession userSession = (UserSession) this.A01;
        if (i2 != 0) {
            Context context = (Context) this.A02;
            String str = this.A04;
            C54796OJo c54796OJo = (C54796OJo) this.A03;
            Boolean bool = (Boolean) obj;
            OPL.A00(userSession).A05(bool);
            OPK.A00(userSession, context, str);
            if (bool.booleanValue()) {
                OPK.A01(userSession, context, str);
            } else {
                OPL.A01(userSession);
                SZ2.A00(c54796OJo.A03, "settings_clear_confirm_clicked", null);
            }
            c54796OJo.A06.invoke();
            return null;
        }
        Context context2 = (Context) this.A02;
        String str2 = this.A04;
        C54796OJo c54796OJo2 = (C54796OJo) this.A03;
        if (AbstractC166987dD.A1a(obj)) {
            OPK.A00(userSession, context2, str2);
            OPL.A01(userSession);
            c54796OJo2.A06.invoke();
            SZ2.A00(c54796OJo2.A03, "settings_clear_confirm_clicked", null);
            i = 2131954330;
        } else {
            SZ2.A00(c54796OJo2.A03, "settings_clear_error", "EMPTY ERROR MESSAGE");
            i = 2131954329;
        }
        C9GR.A07(context2, i);
        return C0eB.A00;
    }
}
