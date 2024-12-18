package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LOv implements View.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ KZ0 A01;

    public LOv(UserSession userSession, KZ0 kz0) {
        this.A01 = kz0;
        this.A00 = userSession;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC148186lo interfaceC148186lo;
        EnumC46193KcV enumC46193KcV;
        int A05 = C0f9.A05(2047293608);
        KZ0 kz0 = this.A01;
        Boolean bool = kz0.A01;
        if (bool != null) {
            UserSession userSession = this.A00;
            boolean booleanValue = bool.booleanValue();
            kz0.A02();
            InterfaceC148186lo interfaceC148186lo2 = kz0.A00;
            if (interfaceC148186lo2 != null) {
                if (kz0.A02 == EnumC184458Gk.A02) {
                    enumC46193KcV = EnumC46193KcV.A05;
                } else {
                    enumC46193KcV = EnumC46193KcV.A04;
                }
                interfaceC148186lo2.Dvx(enumC46193KcV);
            }
            if (!booleanValue && (interfaceC148186lo = kz0.A00) != null) {
                interfaceC148186lo.EkN();
            }
            if (kz0.A02 == EnumC184458Gk.A03) {
                LJH.A00(userSession, "ig_stories_consumption_avatar_qr");
            }
        }
        C0f9.A0C(-193642564, A05);
    }
}
