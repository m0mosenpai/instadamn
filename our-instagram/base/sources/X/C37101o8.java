package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.sup.voltron.SUPMediaStreamControllerDownloader;

/* renamed from: X.1o8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37101o8 {
    public static C37101o8 A06;
    public InterfaceC58078Pp3 A00;
    public InterfaceC58127Ppq A01;
    public InterfaceC58079Pp4 A02;
    public InterfaceC58187Pqt A03;
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(C37111o9.A00);
    public final InterfaceC09390do A05 = AbstractC09440dt.A01(new C206839Do(this, 27));

    public final void A01(Context context, UserSession userSession, InterfaceC57996Png interfaceC57996Png, String str) {
        C14360o3.A0B(userSession, 1);
        if (AbstractC195898lZ.A00(context.getApplicationContext(), userSession)) {
            ((SUPMediaStreamControllerDownloader) this.A04.getValue()).A02(context, userSession, interfaceC57996Png, str);
        }
    }

    public static final OIB A00(C37101o8 c37101o8) {
        return (OIB) c37101o8.A05.getValue();
    }
}
