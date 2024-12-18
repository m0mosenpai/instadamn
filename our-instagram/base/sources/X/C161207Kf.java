package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Kf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161207Kf implements InterfaceC161217Kg {
    public final C161297Kq A00;
    public final C161317Ks A01;
    public final C161257Kk A02;
    public final C161307Kr A03;

    /* JADX WARN: Type inference failed for: r2v2, types: [X.7Kq, X.7Kl] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.7Kr, X.7Kl] */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.7Ks, X.7Kl] */
    public /* synthetic */ C161207Kf(Context context, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        C161227Kh c161227Kh = (C161227Kh) userSession.A01(C161227Kh.class, new C9EW(context, 14));
        C161237Ki c161237Ki = new C161237Ki(C18U.A06(C06090Tz.A05, userSession, 36320030161706929L));
        C161247Kj c161247Kj = new C161247Kj(userSession, interfaceC16820sZ);
        C14360o3.A0B(c161227Kh, 4);
        this.A02 = new C161257Kk(c161227Kh, c161237Ki, c161247Kj);
        this.A00 = new AbstractC161267Kl(c161227Kh, new C161287Kn(), new C7Ko(null, null, 1), c161237Ki, c161247Kj);
        this.A03 = new AbstractC161267Kl(c161227Kh, new C161287Kn(), new C7Ko(null, null, 1), c161237Ki, c161247Kj);
        this.A01 = new AbstractC161267Kl(c161227Kh, new C161287Kn(), new C7Ko(null, null, 1), c161237Ki, c161247Kj);
    }

    @Override // X.InterfaceC161217Kg
    public final InterfaceC161277Km ALg(AnonymousClass541 anonymousClass541) {
        AbstractC46716KlZ abstractC46716KlZ = AbstractC46716KlZ.$redex_init_class;
        int ordinal = anonymousClass541.ordinal();
        if (ordinal != 6) {
            if (ordinal != 7) {
                if (ordinal != 8) {
                    if (ordinal != 9) {
                        return null;
                    }
                    return this.A01;
                }
                return this.A03;
            }
            return this.A00;
        }
        return this.A02;
    }
}
