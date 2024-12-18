package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.EZo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32664EZo extends AbstractRunnableC14200nk {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C36265FzI A01;
    public final /* synthetic */ String A02;

    @Override // java.lang.Runnable
    public final void run() {
        C1ON A05;
        C36265FzI c36265FzI = this.A01;
        Context context = this.A00;
        String str = this.A02;
        if (str == null) {
            HashSet A0k = AbstractC31171DnF.A0k(Arrays.asList(EnumC200798uM.FACEBOOK));
            UserSession userSession = c36265FzI.A00;
            List A03 = AMd.A03(context, userSession, "fx_ig4a_app_startup_native_auth_token_verification", "FxNativeAuthTokenVerifier", userSession.userId, A0k);
            if (A03.size() != 0) {
                A03.get(0);
                str = ((C203148yW) A03.get(0)).A01.A00;
            } else {
                str = null;
            }
        }
        if (str != null) {
            EV0 A00 = EV0.A00(c36265FzI, 23);
            C2JM A0b = AbstractC25225BEi.A0b();
            A0b.A04("access_token", str);
            A0b.A04("account_type", "FACEBOOK");
            C907442n c907442n = new C907442n(A0b, E5R.class, "IGFxNativeAuthTokenVerificationQuery", false);
            UserSession userSession2 = c36265FzI.A00;
            C14360o3.A0B(userSession2, 0);
            C907542o c907542o = new C907542o(userSession2);
            c907542o.A08(c907442n);
            if (C18U.A06(C06090Tz.A05, userSession2, 36312110242005928L)) {
                A05 = c907542o.A06();
            } else {
                A05 = c907542o.A05();
            }
            A05.A00 = A00;
            C1GJ.A03(A05);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32664EZo(Context context, C36265FzI c36265FzI, String str) {
        super(1250893273);
        this.A01 = c36265FzI;
        this.A00 = context;
        this.A02 = str;
    }
}
