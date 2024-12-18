package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public final class C2U extends AbstractC65902yS {
    public final Context A00;
    public final WeakReference A01;
    public final InterfaceC09390do A02;
    public final UserSession A03;
    public final C22849A5s A04;
    public final InterfaceC76813cT A05;
    public final InterfaceC60442pS A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2U(Context context, C07X c07x, UserSession userSession, C22849A5s c22849A5s, InterfaceC76813cT interfaceC76813cT, InterfaceC60442pS interfaceC60442pS) {
        super(context, c07x, userSession, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 248);
        AbstractC167017dG.A1P(context, userSession);
        this.A00 = context;
        this.A03 = userSession;
        this.A06 = interfaceC60442pS;
        this.A04 = c22849A5s;
        this.A05 = interfaceC76813cT;
        this.A02 = AbstractC09440dt.A00(EnumC09460dv.A02, new DGY(this, 16));
        this.A01 = AbstractC25225BEi.A16(c07x);
    }

    @Override // X.AbstractC65902yS
    public final AbstractC50812Vc A02(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        C14360o3.A0B(interfaceC16820sZ, 0);
        return new C26447BmU(this.A03, this.A04, this.A05, new CP5(this), this.A06, interfaceC16820sZ);
    }

    @Override // X.AbstractC65902yS
    public final int A01() {
        return AbstractC25227BEk.A02(AbstractC167027dH.A01(this.A02));
    }

    @Override // X.AbstractC65902yS
    public final String A04() {
        return "AD_CTA";
    }
}
