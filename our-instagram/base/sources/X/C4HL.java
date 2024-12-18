package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4HL, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4HL extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C75113Zb A01;
    public final /* synthetic */ InterfaceC76053bA A02;
    public final /* synthetic */ C86633tb A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ InterfaceC16660sJ A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4HL(UserSession userSession, C75113Zb c75113Zb, InterfaceC76053bA interfaceC76053bA, C86633tb c86633tb, String str, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        super(2);
        this.A05 = interfaceC16660sJ;
        this.A06 = z;
        this.A03 = c86633tb;
        this.A00 = userSession;
        this.A04 = str;
        this.A02 = interfaceC76053bA;
        this.A01 = c75113Zb;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.0ps, java.lang.Object] */
    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C14360o3.A0B(obj2, 1);
        C79743hP c79743hP = (C79743hP) this.A05.invoke(obj2);
        ?? obj3 = new Object();
        boolean z = this.A06;
        if (z) {
            C86003sX c86003sX = c79743hP.A07;
            if (c86003sX != null) {
                C86633tb c86633tb = this.A03;
                AbstractC86643tc.A00(this.A00, this.A02, c86633tb, c86003sX, this.A04);
                AjE ajE = new AjE(c79743hP);
                obj3.A00 = ajE;
                this.A01.A0L(ajE, null, false);
            } else {
                throw new IllegalStateException(AbstractC111324zv.A00(470));
            }
        }
        return new C79773hS(new C9FW(24, c79743hP, obj3, this.A01, z));
    }
}
