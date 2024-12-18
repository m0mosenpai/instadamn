package com.instagram.video.live.mvvm.viewmodel.cobroadcast;

import X.AbstractC001800i;
import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC23611Dp;
import X.AbstractC25226BEj;
import X.AbstractC25228BEl;
import X.C0eB;
import X.C16910sj;
import X.C51037Mgm;
import X.C51751Mta;
import X.C56610PBg;
import X.InterfaceC16600sD;
import X.InterfaceC23621Ds;
import X.MSY;
import com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.video.live.mvvm.viewmodel.cobroadcast.IgLiveHostCobroadcastViewModel$4", f = "IgLiveHostCobroadcastViewModel.kt", i = {}, l = {303}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class IgLiveHostCobroadcastViewModel$4 extends AbstractC23611Dp implements InterfaceC16600sD {
    public int A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ boolean A02;
    public /* synthetic */ boolean A03;
    public final /* synthetic */ C51037Mgm A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgLiveHostCobroadcastViewModel$4(C51037Mgm c51037Mgm, InterfaceC23621Ds interfaceC23621Ds) {
        super(4, interfaceC23621Ds);
        this.A04 = c51037Mgm;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Set set;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            boolean z = this.A02;
            boolean z2 = this.A03;
            Set set2 = (Set) this.A01;
            if (z) {
                C51037Mgm c51037Mgm = this.A04;
                IgLiveCobroadcastRepository igLiveCobroadcastRepository = c51037Mgm.A05;
                if (set2 != null) {
                    ArrayList A1E = AbstractC166987dD.A1E();
                    Iterator it = set2.iterator();
                    while (it.hasNext()) {
                        Object obj3 = ((C51751Mta) it.next()).A01;
                        if (obj3 != null) {
                            A1E.add(obj3);
                        }
                    }
                    ArrayList A1E2 = AbstractC166987dD.A1E();
                    for (Object obj4 : A1E) {
                        AbstractC25228BEl.A1Q(obj4, A1E2, ((Set) c51037Mgm.A09.A0V.getValue()).contains(obj4) ? 1 : 0);
                    }
                    set = AbstractC001800i.A0k(A1E2);
                } else {
                    set = C16910sj.A00;
                }
                this.A00 = 1;
                igLiveCobroadcastRepository.A03.Egh(C16910sj.A00);
                ArrayList A0q = AbstractC167017dG.A0q(set);
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    A0q.add(MSY.A0g(AbstractC25226BEj.A15(it2)));
                }
                if (AbstractC166987dD.A1b(A0q)) {
                    igLiveCobroadcastRepository.A00.A00.A0A.A7P(new C56610PBg(A0q));
                }
            } else if (!z2) {
                IgLiveCobroadcastRepository igLiveCobroadcastRepository2 = this.A04.A05;
                if (set2 != null) {
                    ArrayList A1E3 = AbstractC166987dD.A1E();
                    Iterator it3 = set2.iterator();
                    while (it3.hasNext()) {
                        Object obj5 = ((C51751Mta) it3.next()).A01;
                        if (obj5 != null) {
                            A1E3.add(obj5);
                        }
                    }
                    obj2 = AbstractC001800i.A0k(A1E3);
                } else {
                    obj2 = C16910sj.A00;
                }
                igLiveCobroadcastRepository2.A03.Egh(obj2);
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean A1a = AbstractC166987dD.A1a(obj);
        boolean A1a2 = AbstractC166987dD.A1a(obj2);
        IgLiveHostCobroadcastViewModel$4 igLiveHostCobroadcastViewModel$4 = new IgLiveHostCobroadcastViewModel$4(this.A04, (InterfaceC23621Ds) obj4);
        igLiveHostCobroadcastViewModel$4.A02 = A1a;
        igLiveHostCobroadcastViewModel$4.A03 = A1a2;
        igLiveHostCobroadcastViewModel$4.A01 = obj3;
        return igLiveHostCobroadcastViewModel$4.invokeSuspend(C0eB.A00);
    }
}
