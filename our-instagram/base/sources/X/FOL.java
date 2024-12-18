package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public final class FOL {
    public C189478aR A00;
    public final int A01;
    public final Activity A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final FPD A05;
    public final C7IR A06;
    public final InterfaceC83713oG A07;
    public final List A08;
    public final Context A09;

    public FOL(Activity activity, Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7IR c7ir, InterfaceC83713oG interfaceC83713oG, List list, int i) {
        AbstractC167017dG.A1S(interfaceC11380iw, c7ir);
        this.A09 = context;
        this.A02 = activity;
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A06 = c7ir;
        this.A07 = interfaceC83713oG;
        this.A08 = list;
        this.A01 = i;
        this.A05 = new FPD(userSession);
    }
}
