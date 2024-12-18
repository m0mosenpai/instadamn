package X;

import com.facebook.litho.LithoView;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.9Et, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207149Et extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;
    public final Object A0B;
    public final Object A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207149Et(LithoView lithoView, UserSession userSession, InterfaceC904941j interfaceC904941j, C86493tM c86493tM, C39G c39g, InterfaceC80043ht interfaceC80043ht, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, InterfaceC60682pr interfaceC60682pr, WeakReference weakReference, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        super(1);
        this.A00 = i2;
        this.A09 = c75113Zb;
        this.A0C = c86493tM;
        this.A04 = userSession;
        this.A07 = interfaceC60442pS;
        this.A01 = i;
        this.A05 = interfaceC904941j;
        this.A08 = lithoView;
        this.A06 = c39g;
        this.A0B = interfaceC80043ht;
        this.A02 = weakReference;
        this.A0A = interfaceC60682pr;
        this.A03 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C75113Zb c75113Zb;
        if (this.A00 != 0) {
            int intValue = ((Number) obj).intValue();
            c75113Zb = (C75113Zb) this.A09;
            c75113Zb.A0A = intValue;
        } else {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            c75113Zb = (C75113Zb) this.A09;
            c75113Zb.A2Y = booleanValue;
        }
        C86493tM c86493tM = (C86493tM) this.A0C;
        UserSession userSession = (UserSession) this.A04;
        InterfaceC60442pS interfaceC60442pS = (InterfaceC60442pS) this.A07;
        int i = this.A01;
        InterfaceC904941j interfaceC904941j = (InterfaceC904941j) this.A05;
        LithoView lithoView = (LithoView) this.A08;
        C39G c39g = (C39G) this.A06;
        InterfaceC80043ht interfaceC80043ht = (InterfaceC80043ht) this.A0B;
        WeakReference weakReference = (WeakReference) this.A02;
        InterfaceC60682pr interfaceC60682pr = (InterfaceC60682pr) this.A0A;
        InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A03;
        boolean A03 = C85363rR.A03(userSession);
        C14360o3.A0B(userSession, 0);
        C3u4.A00(lithoView, userSession, interfaceC904941j, c86493tM, c39g, interfaceC80043ht, interfaceC60442pS, c75113Zb, interfaceC60682pr, weakReference, interfaceC16820sZ, i, A03, C18U.A06(C06090Tz.A05, userSession, 36320618572358365L));
        return C0eB.A00;
    }
}
