package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.39M, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C39M extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InterfaceC686036x A02;
    public final /* synthetic */ AnonymousClass398 A03;
    public final /* synthetic */ C57332k8 A04;
    public final /* synthetic */ C33P A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39M(Context context, UserSession userSession, InterfaceC686036x interfaceC686036x, AnonymousClass398 anonymousClass398, C57332k8 c57332k8, C33P c33p, boolean z, boolean z2) {
        super(0);
        this.A03 = anonymousClass398;
        this.A05 = c33p;
        this.A02 = interfaceC686036x;
        this.A00 = context;
        this.A01 = userSession;
        this.A06 = z;
        this.A04 = c57332k8;
        this.A07 = z2;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass398 anonymousClass398 = this.A03;
        InterfaceC60442pS interfaceC60442pS = anonymousClass398.A04;
        C33P c33p = this.A05;
        C30E c30e = c33p.A0G;
        AnonymousClass399 anonymousClass399 = anonymousClass398.A05;
        InterfaceC686036x interfaceC686036x = this.A02;
        InterfaceC76043b9 BS4 = interfaceC686036x.BS4();
        C39D c39d = anonymousClass398.A06;
        C62862tP c62862tP = anonymousClass398.A01;
        C3VU AmF = interfaceC686036x.AmF();
        InterfaceC75403a7 BS6 = interfaceC686036x.BS6();
        C07X c07x = anonymousClass398.A00;
        InterfaceC60682pr Br6 = interfaceC686036x.Br6();
        return new C25340BJj(this.A00, c07x, c62862tP, this.A01, AmF, BS6, interfaceC60442pS, BS4, anonymousClass399, c39d, this.A04, c33p, c33p, c30e, Br6, this.A06, this.A07);
    }
}
