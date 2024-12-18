package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "instagram.features.clips.remix.pivot.viewmodel.RemixPivotPageViewModel$viewState$1", f = "RemixPivotPageViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class D5I extends AbstractC23611Dp implements InterfaceC16590sC {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ boolean A02;
    public /* synthetic */ boolean A03;
    public final /* synthetic */ C25837Bbs A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D5I(C25837Bbs c25837Bbs, InterfaceC23621Ds interfaceC23621Ds) {
        super(5, interfaceC23621Ds);
        this.A04 = c25837Bbs;
    }

    @Override // X.InterfaceC16590sC
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean A1a = AbstractC166987dD.A1a(obj3);
        boolean A1a2 = AbstractC166987dD.A1a(obj4);
        D5I d5i = new D5I(this.A04, (InterfaceC23621Ds) obj5);
        d5i.A00 = obj;
        d5i.A01 = obj2;
        d5i.A02 = A1a;
        d5i.A03 = A1a2;
        return d5i.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C69749Vuj c69749Vuj;
        C38321qM c38321qM;
        AbstractC09560e7.A00(obj);
        C26029BfI c26029BfI = (C26029BfI) this.A00;
        List list = (List) this.A01;
        boolean z = this.A02;
        boolean z2 = this.A03;
        ArrayList A0U = AbstractC001800i.A0U(list);
        if ((!A0U.isEmpty()) && (c38321qM = ((C120985dq) A0U.get(0)).A02) != null && c38321qM.A5c()) {
            A0U.remove(0);
        }
        C25837Bbs c25837Bbs = this.A04;
        c25837Bbs.A02.A08(c25837Bbs.A04, A0U, true, false);
        ArrayList A0q = AbstractC167017dG.A0q(list);
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            C120985dq c120985dq = (C120985dq) obj2;
            if (i == 0) {
                c69749Vuj = c25837Bbs.A01;
            } else {
                c69749Vuj = null;
            }
            A0q.add(new C154026wB(null, c120985dq, c69749Vuj));
            i = i2;
        }
        return new C26085BgE(c26029BfI, A0q, z, z2);
    }
}
