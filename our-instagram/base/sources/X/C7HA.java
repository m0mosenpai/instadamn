package X;

import android.app.Activity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7HA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7HA extends C7H2 {
    public final Activity A00;
    public final UserSession A01;
    public final String A02;
    public final C2EE A03;

    public C7HA(Activity activity, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        super(userSession, C7GY.A05, C7GX.A0O, null, AbstractC16960so.A1Q(EnumC222416a.A05, EnumC222416a.A06), interfaceC16820sZ, 2131958902, R.drawable.instagram_document_pano_outline_24, 2131958902, 256);
        String C7I;
        this.A01 = userSession;
        this.A00 = activity;
        C2EE c2ee = (C2EE) interfaceC16820sZ.invoke();
        this.A03 = c2ee;
        this.A02 = (c2ee == null || (C7I = c2ee.C7I()) == null) ? "" : C7I;
    }
}
