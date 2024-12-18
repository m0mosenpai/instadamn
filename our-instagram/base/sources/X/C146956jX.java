package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.6jX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146956jX {
    public final UserSession A00;
    public final InterfaceC1118853a A01;
    public final InterfaceC144586fe A02;

    public C146956jX(UserSession userSession, InterfaceC1118853a interfaceC1118853a, InterfaceC144586fe interfaceC144586fe) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC144586fe, 2);
        this.A00 = userSession;
        this.A02 = interfaceC144586fe;
        this.A01 = interfaceC1118853a;
    }

    public static final C199928sw A00(Context context, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        String string = context.getString(i);
        C14360o3.A07(string);
        return new C199928sw(null, context.getDrawable(i2), null, new C23946Ajg(interfaceC16820sZ), null, string, 0, 0, 0, false, false, false, true, false, false, false);
    }
}
