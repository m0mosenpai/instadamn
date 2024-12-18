package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.BwW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27052BwW extends AbstractC61132qb {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AbstractC018607g A01;
    public final /* synthetic */ C26912BuF A02;
    public final /* synthetic */ InterfaceC11380iw A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public C27052BwW(Context context, AbstractC018607g abstractC018607g, C26912BuF c26912BuF, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2) {
        this.A04 = userSession;
        this.A05 = str;
        this.A06 = str2;
        this.A00 = context;
        this.A03 = interfaceC11380iw;
        this.A01 = abstractC018607g;
        this.A02 = c26912BuF;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A04;
        C62832tM A00 = AbstractC62822tL.A00(userSession);
        C14360o3.A07(A00);
        String str = this.A05;
        AtomicBoolean atomicBoolean = C38321qM.A0i;
        String A06 = C38801rC.A06(this.A06);
        return new C25837Bbs(A00, new CTD(this.A00, this.A01, this.A02, this.A03, userSession, A06), str);
    }
}
