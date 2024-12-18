package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class C2V extends AbstractC65902yS {
    public final Context A00;
    public final InterfaceC09390do A01;
    public final UserSession A02;
    public final C39G A03;
    public final InterfaceC75403a7 A04;
    public final InterfaceC87303un A05;
    public final InterfaceC60442pS A06;
    public final boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2V(Context context, C07X c07x, UserSession userSession, C39G c39g, InterfaceC75403a7 interfaceC75403a7, InterfaceC87303un interfaceC87303un, InterfaceC60442pS interfaceC60442pS, boolean z) {
        super(context, c07x, userSession, null, null, null, 248);
        AbstractC167017dG.A1P(context, userSession);
        AbstractC167017dG.A1U(interfaceC75403a7, c39g);
        C14360o3.A0B(interfaceC87303un, 8);
        this.A00 = context;
        this.A02 = userSession;
        this.A06 = interfaceC60442pS;
        this.A07 = z;
        this.A04 = interfaceC75403a7;
        this.A03 = c39g;
        this.A05 = interfaceC87303un;
        this.A01 = AbstractC09440dt.A00(EnumC09460dv.A02, new DGY(this, 19));
    }

    @Override // X.AbstractC65902yS
    public final AbstractC50812Vc A02(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        C14360o3.A0B(interfaceC16820sZ, 0);
        InterfaceC60442pS interfaceC60442pS = this.A06;
        return new C26448BmV(this.A02, this.A03, this.A04, this.A05, interfaceC60442pS, interfaceC16820sZ);
    }

    @Override // X.AbstractC65902yS
    public final int A01() {
        return AbstractC25227BEk.A02(AbstractC167027dH.A01(this.A01));
    }

    @Override // X.AbstractC65902yS
    public final String A04() {
        return AbstractC111324zv.A00(3662);
    }
}
