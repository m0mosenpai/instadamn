package X;

import android.app.Activity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ecx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32855Ecx extends AbstractC35044FcH {
    public final Activity A00;
    public final UserSession A01;
    public final FFW A02;
    public final InterfaceC60442pS A03;
    public final C2EY A04;
    public final String A05;
    public final boolean A06;

    public C32855Ecx(Activity activity, UserSession userSession, FFW ffw, InterfaceC60442pS interfaceC60442pS, C2EY c2ey, Object obj, String str, boolean z) {
        super(c2ey, obj, "direct_sharesheet", R.drawable.instagram_direct_pano_outline_24, z ? 2131960448 : 2131960447);
        this.A04 = c2ey;
        this.A00 = activity;
        this.A01 = userSession;
        this.A03 = interfaceC60442pS;
        this.A06 = z;
        this.A02 = ffw;
        this.A05 = str;
    }
}
