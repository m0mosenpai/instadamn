package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(message = "")
/* renamed from: X.6zN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C155936zN extends AbstractC60592pi {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final List A03;

    public C155936zN(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 3);
        this.A01 = interfaceC11380iw;
        this.A02 = userSession;
        Context applicationContext = context.getApplicationContext();
        C14360o3.A07(applicationContext);
        this.A00 = applicationContext;
        this.A03 = new ArrayList();
    }
}
