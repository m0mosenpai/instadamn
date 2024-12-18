package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.monetization.repository.MonetizationRepository;

/* renamed from: X.Dyi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31824Dyi extends AbstractC52922bZ {
    public final C2GT A00;
    public final C2GS A01;
    public final C41761wQ A02;
    public final MonetizationRepository A03;
    public final InterfaceC24731Iq A04;
    public final InterfaceC19390xP A05;
    public final Context A06;
    public final UserSession A07;

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        this.A02.A01();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.2GT, X.2GS] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.E6T, java.lang.Object] */
    public C31824Dyi(Context context, UserSession userSession, MonetizationRepository monetizationRepository) {
        this.A06 = context;
        this.A03 = monetizationRepository;
        this.A07 = userSession;
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A04 = c24721Ip;
        this.A05 = AbstractC07080Za.A03(c24721Ip);
        this.A02 = AbstractC31173DnH.A0S();
        ?? obj = new Object();
        obj.A00 = "not_eligible";
        obj.A05 = false;
        obj.A01 = "$0.00";
        obj.A04 = false;
        obj.A06 = false;
        obj.A03 = false;
        obj.A02 = false;
        ?? c2gt = new C2GT(obj);
        this.A01 = c2gt;
        this.A00 = c2gt;
    }
}
