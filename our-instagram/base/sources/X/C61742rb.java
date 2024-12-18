package X;

import android.app.Application;
import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.2rb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61742rb implements InterfaceC61752rc {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final InterfaceC61732ra A03;

    public static final void A00(C61742rb c61742rb, Object obj, int i) {
        if (obj != null) {
            InterfaceC61732ra interfaceC61732ra = c61742rb.A03;
            Context context = c61742rb.A00;
            UserSession userSession = c61742rb.A02;
            InterfaceC11380iw interfaceC11380iw = c61742rb.A01;
            List AMo = interfaceC61732ra.AMo(context, interfaceC11380iw, userSession, obj, i);
            C42981yQ A00 = AbstractC42951yN.A00(userSession);
            String moduleName = interfaceC11380iw.getModuleName();
            if (i == 0) {
                A00.A06(moduleName, AMo);
            } else {
                A00.A05(moduleName, AMo);
            }
        }
    }

    @Override // X.InterfaceC61752rc
    public final void DNl() {
    }

    @Override // X.InterfaceC61752rc
    public final void DNz() {
        AbstractC42951yN.A00(this.A02).A04(this.A01.getModuleName());
    }

    public C61742rb(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC61732ra interfaceC61732ra) {
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = interfaceC61732ra;
        if (!(context instanceof Application) && C18U.A06(C06090Tz.A05, userSession, 36330720335578095L)) {
            context = context.getApplicationContext();
            C14360o3.A07(context);
        }
        this.A00 = context;
    }

    @Override // X.InterfaceC61752rc
    public final void DNG(Object obj, int i) {
        A00(this, obj, i);
    }
}
