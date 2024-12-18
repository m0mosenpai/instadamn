package X;

import com.instagram.common.session.UserSession;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes5.dex */
public final class DIH extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ C2Z0 A00;
    public final /* synthetic */ C51762Yz A01;
    public final /* synthetic */ C51762Yz A02;
    public final /* synthetic */ C41095IHm A03;
    public final /* synthetic */ IKS A04;
    public final /* synthetic */ C26578Bob A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ C15370ps A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DIH(C2Z0 c2z0, C51762Yz c51762Yz, C51762Yz c51762Yz2, C41095IHm c41095IHm, IKS iks, C26578Bob c26578Bob, String str, String str2, C15370ps c15370ps) {
        super(1);
        this.A05 = c26578Bob;
        this.A01 = c51762Yz;
        this.A03 = c41095IHm;
        this.A08 = c15370ps;
        this.A02 = c51762Yz2;
        this.A07 = str;
        this.A06 = str2;
        this.A04 = iks;
        this.A00 = c2z0;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C41120IIl c41120IIl;
        List<C41095IHm> list;
        C26578Bob c26578Bob = this.A05;
        C51762Yz c51762Yz = this.A01;
        C41095IHm c41095IHm = this.A03;
        HashSet hashSet = (HashSet) this.A08.A00;
        C51762Yz c51762Yz2 = this.A02;
        String str = this.A07;
        String str2 = this.A06;
        InterfaceC60442pS interfaceC60442pS = c26578Bob.A01;
        IKS iks = this.A04;
        C2XE c2xe = this.A00.A00;
        if (!AbstractC001800i.A0u(C26578Bob.A04, str2)) {
            AbstractCollection abstractCollection = (AbstractCollection) c51762Yz.A03;
            if (abstractCollection != null && abstractCollection.contains(c41095IHm.A03)) {
                abstractCollection.remove(c41095IHm.A03);
            } else if (hashSet != null) {
                hashSet.add(c41095IHm.A03);
            }
            c51762Yz.A01(hashSet);
            c51762Yz2.A03(DR1.A00);
            if (!"multiple".equals(str)) {
                UserSession userSession = c26578Bob.A00;
                C14360o3.A0C(hashSet, AbstractC111324zv.A00(2805));
                C26578Bob.A03(c2xe, c51762Yz2, iks, userSession, interfaceC60442pS, str2, hashSet);
            } else {
                List list2 = iks.A09;
                if (list2 != null && (c41120IIl = (C41120IIl) AbstractC001800i.A0O(list2, 0)) != null) {
                    HashMap hashMap = C26578Bob.A03;
                    C14360o3.A0B(hashMap, 2);
                    AbstractCollection abstractCollection2 = (AbstractCollection) hashMap.get(c41120IIl.A01);
                    if (c41095IHm != null) {
                        Boolean bool = c41095IHm.A00;
                        if (bool != null && bool.booleanValue()) {
                            String str3 = c41095IHm.A03;
                            if (abstractCollection2 != null && abstractCollection2.contains(str3) && (list = c41120IIl.A04) != null) {
                                for (C41095IHm c41095IHm2 : list) {
                                    if (!C14360o3.A0K(c41095IHm.A03, c41095IHm2.A03)) {
                                        abstractCollection2.remove(c41095IHm2.A03);
                                    }
                                }
                            }
                        } else {
                            List<C41095IHm> list3 = c41120IIl.A04;
                            if (list3 != null) {
                                for (C41095IHm c41095IHm3 : list3) {
                                    if (!C14360o3.A0K(c41095IHm.A03, c41095IHm3.A03) && abstractCollection2 != null && abstractCollection2.contains(c41095IHm3.A03) && AbstractC166997dE.A1Z(c41095IHm3.A00, true)) {
                                        abstractCollection2.remove(c41095IHm3.A03);
                                    }
                                }
                            }
                        }
                    }
                    hashMap.put(c41120IIl.A01, abstractCollection2);
                }
            }
        }
        return C0eB.A00;
    }
}
