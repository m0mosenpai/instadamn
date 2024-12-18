package com.instagram.friendmap.data;

import X.AbstractC09560e7;
import X.AbstractC106864rn;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC25233BEq;
import X.C05A;
import X.C0CA;
import X.C0eB;
import X.C1JX;
import X.C2JM;
import X.C40701ud;
import X.C59602QiR;
import X.C92964Eq;
import X.C92984Et;
import X.EnumC92974Es;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.location.platform.api.Location;
import com.facebook.pando.PandoGraphQLRequest;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.friendmap.data.FriendMapRepository$updateLastActiveLocation$1", f = "FriendMapRepository.kt", i = {}, l = {395, 398}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class FriendMapRepository$updateLastActiveLocation$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ double A01;
    public final /* synthetic */ double A02;
    public final /* synthetic */ FriendMapRepository A03;
    public final /* synthetic */ Integer A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FriendMapRepository$updateLastActiveLocation$1(FriendMapRepository friendMapRepository, Integer num, InterfaceC23621Ds interfaceC23621Ds, double d, double d2) {
        super(2, interfaceC23621Ds);
        this.A03 = friendMapRepository;
        this.A04 = num;
        this.A01 = d;
        this.A02 = d2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new FriendMapRepository$updateLastActiveLocation$1(this.A03, this.A04, interfaceC23621Ds, this.A01, this.A02);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        EnumC92974Es enumC92974Es;
        Object obj2 = obj;
        C1JX c1jx = C1JX.A02;
        int i = this.A00;
        if (i != 0) {
            if (i != 1) {
                AbstractC09560e7.A00(obj2);
                return C0eB.A00;
            }
            AbstractC09560e7.A00(obj2);
        } else {
            AbstractC09560e7.A00(obj2);
            C92964Eq c92964Eq = this.A03.A09;
            this.A00 = 1;
            obj2 = c92964Eq.A00.A09(this);
            if (obj2 == c1jx) {
                return c1jx;
            }
        }
        C92984Et c92984Et = (C92984Et) obj2;
        FriendMapRepository friendMapRepository = this.A03;
        C05A c05a = friendMapRepository.A0I;
        do {
        } while (!c05a.AIi(c05a.getValue(), c92984Et));
        if (AbstractC106864rn.A00(friendMapRepository.A06, this.A04) && (enumC92974Es = c92984Et.A04) != EnumC92974Es.A0A && enumC92974Es != EnumC92974Es.A09) {
            C92964Eq c92964Eq2 = friendMapRepository.A09;
            double d = this.A01;
            double d2 = this.A02;
            this.A00 = 2;
            C40701ud c40701ud = c92964Eq2.A00.A00;
            C2JM A0b = AbstractC25225BEi.A0b();
            C2JM A0b2 = AbstractC25225BEi.A0b();
            C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, new Double(d), Location.LATITUDE);
            C0CA.A00(A0T, new Double(d2), "longitude");
            if (c40701ud.A04(new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b, "data"), "UpdateLastActiveLocationMutation", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59602QiR.class, true, null, 0, null, "xdt_update_last_active_location", AbstractC166987dD.A1E()), this) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FriendMapRepository$updateLastActiveLocation$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
