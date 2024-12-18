package X;

import android.app.Application;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.89T, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C89T extends C193578hc {
    public AtomicBoolean A00;
    public boolean A01;
    public final C2GT A02;
    public final EffectCollectionService A03;
    public final C87H A04;
    public final InterfaceC24731Iq A05;
    public final C05A A06;
    public final C05A A07;
    public final UserSession A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C89T(Application application, EffectCollectionService effectCollectionService, UserSession userSession, C87H c87h) {
        super(application);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(effectCollectionService, 3);
        C14360o3.A0B(c87h, 4);
        this.A08 = userSession;
        this.A03 = effectCollectionService;
        this.A04 = c87h;
        C008002u c008002u = new C008002u(C89W.A03);
        this.A07 = c008002u;
        this.A06 = C10E.A00(null);
        this.A00 = new AtomicBoolean(false);
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A05 = c24721Ip;
        this.A02 = AbstractC58232lf.A00(AnonymousClass191.A00, AbstractC07080Za.A03(c24721Ip));
        AbstractC18560vj.A03(AbstractC141776au.A00(this), new C15340po(new C9D3(this, null, 19), c008002u));
    }
}
