package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.6jW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146946jW {
    public final Activity A00;
    public final Context A01;
    public final UserSession A02;
    public final InterfaceC1118853a A03;

    public C146946jW(Activity activity, Context context, UserSession userSession, InterfaceC1118853a interfaceC1118853a) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = context;
        this.A00 = activity;
        this.A03 = interfaceC1118853a;
    }

    public static final void A00(C41181vS c41181vS, C146946jW c146946jW, boolean z) {
        c146946jW.A03.EJE("share");
        C19K A02 = AbstractC24771Iv.A02(108, 3);
        AbstractC23641Du.A05(AnonymousClass191.A00, new C50533MSm(c41181vS, c146946jW, (InterfaceC23621Ds) null, 26, z), A02);
    }
}
