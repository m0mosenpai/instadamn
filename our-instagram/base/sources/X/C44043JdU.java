package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.JdU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44043JdU {
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC50463MPr A02;
    public final C43929Jbe A03;
    public final C4FF A04;
    public final C43950Jbz A05;
    public final C41951wl A06;
    public final C41891wf A07;

    public C44043JdU(Context context, UserSession userSession, InterfaceC50463MPr interfaceC50463MPr, C43929Jbe c43929Jbe, C43950Jbz c43950Jbz, C41951wl c41951wl) {
        this.A00 = context;
        this.A01 = userSession;
        this.A06 = c41951wl;
        this.A03 = c43929Jbe;
        this.A02 = interfaceC50463MPr;
        this.A05 = c43950Jbz;
        C41891wf A01 = C41891wf.A01(userSession);
        C14360o3.A07(A01);
        this.A07 = A01;
        this.A04 = new C4FF(userSession);
    }
}
