package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.9Fi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207299Fi extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207299Fi(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A04 = obj2;
        this.A05 = obj3;
        this.A02 = obj4;
        this.A06 = z;
        this.A03 = obj5;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                Activity activity = (Activity) this.A03;
                Context context = (Context) this.A01;
                C57332k8 c57332k8 = (C57332k8) this.A04;
                return new C85823sB(activity, context, (UserSession) this.A05, ((InterfaceC686136y) this.A02).B5c(), c57332k8, this.A06);
            case 1:
                Context context2 = (Context) this.A01;
                String moduleName = ((AnonymousClass398) this.A05).A04.getModuleName();
                return new C87023uI(context2, (UserSession) this.A04, ((InterfaceC686136y) this.A02).BQk(), (C57332k8) this.A03, moduleName, this.A06);
            case 2:
                Context context3 = (Context) this.A01;
                UserSession userSession = (UserSession) this.A04;
                AnonymousClass398 anonymousClass398 = (AnonymousClass398) this.A05;
                InterfaceC60442pS interfaceC60442pS = anonymousClass398.A04;
                C07X c07x = anonymousClass398.A00;
                InterfaceC686136y interfaceC686136y = (InterfaceC686136y) this.A02;
                InterfaceC76043b9 BS4 = interfaceC686136y.BS4();
                boolean z = this.A06;
                AnonymousClass399 anonymousClass399 = anonymousClass398.A05;
                C30E c30e = ((C33P) this.A03).A0G;
                C39D c39d = anonymousClass398.A06;
                return new C76083bD(context3, c07x, anonymousClass398.A01, userSession, interfaceC686136y.BS6(), interfaceC60442pS, BS4, anonymousClass399, c39d, c30e, interfaceC686136y.Br6(), z);
            default:
                boolean z2 = ((C65502xm) this.A03).A0N;
                return new C85833sC((Activity) this.A02, (Context) this.A01, (UserSession) this.A04, ((AnonymousClass398) this.A05).A04, this.A06, z2);
        }
    }
}
