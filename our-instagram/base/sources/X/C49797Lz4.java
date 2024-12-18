package X;

import android.content.Context;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.AbstractMap;
import java.util.List;

/* renamed from: X.Lz4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49797Lz4 implements InterfaceC42241xE {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C36287Fzh A01;
    public final /* synthetic */ C7TM A02;
    public final /* synthetic */ DirectShareTarget A03;
    public final /* synthetic */ C2EY A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public C49797Lz4(Context context, C36287Fzh c36287Fzh, C7TM c7tm, DirectShareTarget directShareTarget, C2EY c2ey, String str, String str2, boolean z) {
        this.A04 = c2ey;
        this.A01 = c36287Fzh;
        this.A02 = c7tm;
        this.A00 = context;
        this.A03 = directShareTarget;
        this.A07 = z;
        this.A05 = str;
        this.A06 = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C7TL A00;
        int A0D;
        int A0D2;
        Context context;
        String str;
        boolean z;
        C47684L3r c47684L3r = (C47684L3r) obj;
        boolean z2 = false;
        C14360o3.A0B(c47684L3r, 0);
        C2EY c2ey = this.A04;
        AbstractC46745Km2 abstractC46745Km2 = AbstractC46745Km2.$redex_init_class;
        switch (c2ey.ordinal()) {
            case 2:
                final String str2 = c47684L3r.A04;
                if (str2 != null) {
                    C7TM c7tm = this.A02;
                    DirectShareTarget directShareTarget = this.A03;
                    String str3 = this.A05;
                    final String str4 = this.A06;
                    final boolean z3 = this.A07;
                    final C7TL A002 = C36287Fzh.A00(c7tm);
                    final boolean A1a = AbstractC31177DnL.A1a(c47684L3r.A00);
                    C7TL.A02(new InterfaceC37118GXd() { // from class: X.Lqj
                        @Override // X.InterfaceC37118GXd
                        public final AbstractC29011ae AXZ(L1W l1w, DirectThreadKey directThreadKey, Boolean bool, Long l) {
                            C7TL c7tl = C7TL.this;
                            boolean z4 = z3;
                            String str5 = str4;
                            String str6 = str2;
                            boolean z5 = A1a;
                            return new C29271b4(null, null, null, null, AbstractC31277Doz.A04(c7tl.A00, l1w, C29481bP.class, str5, null, z4), null, null, directThreadKey, null, null, null, null, Boolean.valueOf(z5), null, null, null, l, Long.valueOf(AbstractC31177DnL.A05()), null, str6, NetInfoModule.CONNECTION_TYPE_NONE, null, null, null, null, null, false);
                        }
                    }, A002, new C32068E6u(z3, str4), directShareTarget, str3);
                    return;
                }
                return;
            case 3:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 81:
                C36287Fzh c36287Fzh = this.A01;
                C7TM c7tm2 = this.A02;
                Context context2 = this.A00;
                DirectShareTarget directShareTarget2 = this.A03;
                boolean z4 = this.A07;
                String str5 = this.A05;
                String str6 = this.A06;
                List list = c47684L3r.A05;
                if (list != null) {
                    boolean z5 = true;
                    if (!list.isEmpty()) {
                        boolean z6 = false;
                        Object obj2 = list.get(0);
                        C14360o3.A0C(obj2, "null cannot be cast to non-null type java.util.HashMap<*, *>");
                        AbstractMap abstractMap = (AbstractMap) obj2;
                        long currentTimeMillis = System.currentTimeMillis();
                        AbstractC1345065z abstractC1345065z = K3a.A00;
                        Object A003 = A00(abstractC1345065z, abstractMap, 10);
                        if (C14360o3.A0K(A003, 3)) {
                            A00 = C36287Fzh.A00(c7tm2);
                            Object A004 = A00(abstractC1345065z, abstractMap, 2);
                            C14360o3.A0C(A004, "null cannot be cast to non-null type kotlin.String");
                            A0D = AbstractC25230BEn.A0D(A00(abstractC1345065z, abstractMap, 11), "null cannot be cast to non-null type kotlin.Int");
                            A0D2 = AbstractC25230BEn.A0D(A00(abstractC1345065z, abstractMap, 4), "null cannot be cast to non-null type kotlin.Int");
                            context = context2;
                            str = (String) A004;
                            z = z4;
                            z5 = false;
                        } else if (C14360o3.A0K(A003, 1)) {
                            A00 = C36287Fzh.A00(c7tm2);
                            Object A005 = A00(abstractC1345065z, abstractMap, 2);
                            C14360o3.A0C(A005, "null cannot be cast to non-null type kotlin.String");
                            A0D = AbstractC25230BEn.A0D(A00(abstractC1345065z, abstractMap, 11), "null cannot be cast to non-null type kotlin.Int");
                            A0D2 = AbstractC25230BEn.A0D(A00(abstractC1345065z, abstractMap, 4), "null cannot be cast to non-null type kotlin.Int");
                            context = context2;
                            str = (String) A005;
                            z = z4;
                        } else {
                            if (C14360o3.A0K(A003, 2)) {
                                int A0D3 = AbstractC25230BEn.A0D(A00(abstractC1345065z, abstractMap, 11), "null cannot be cast to non-null type kotlin.Int");
                                int A0D4 = AbstractC25230BEn.A0D(A00(abstractC1345065z, abstractMap, 4), "null cannot be cast to non-null type kotlin.Int");
                                Object A006 = A00(abstractC1345065z, abstractMap, 2);
                                C14360o3.A0C(A006, "null cannot be cast to non-null type kotlin.String");
                                C183978Ee c183978Ee = new C183978Ee(AbstractC166987dD.A11((String) A006), A0D3, A0D4, currentTimeMillis, currentTimeMillis, false);
                                C7TL A007 = C36287Fzh.A00(c7tm2);
                                AnonymousClass442 anonymousClass442 = null;
                                EnumC46200Kcc enumC46200Kcc = EnumC46200Kcc.A06;
                                Boolean bool = c47684L3r.A00;
                                if (bool != null) {
                                    z6 = bool.booleanValue();
                                }
                                C7TL.A01(new C47625L1k(new C49293Lqn(context2, anonymousClass442, A007, enumC46200Kcc, directShareTarget2, null == true ? 1 : 0, c183978Ee, str6, null == true ? 1 : 0, z4, z6), A007, "unknown"), A007, new C32068E6u(z4, str6), enumC46200Kcc, directShareTarget2, null, str5, null, false);
                                return;
                            }
                            if (C14360o3.A0K(A003, 4)) {
                                boolean A1a2 = AbstractC31177DnL.A1a(c47684L3r.A00);
                                Object A008 = A00(abstractC1345065z, abstractMap, 7);
                                C14360o3.A0C(A008, AbstractC111324zv.A00(10));
                                long A0N = AbstractC166987dD.A0N(A008);
                                Object A009 = A00(abstractC1345065z, abstractMap, 2);
                                C14360o3.A0C(A009, "null cannot be cast to non-null type kotlin.String");
                                ClipInfo A03 = MY3.A03(c36287Fzh.A01, (String) A009, A0N, A0N);
                                A03.A00 = A03.A09 / A03.A06;
                                C7TL A0010 = C36287Fzh.A00(c7tm2);
                                Object A0011 = A00(abstractC1345065z, abstractMap, 8);
                                C14360o3.A0C(A0011, "null cannot be cast to non-null type kotlin.String");
                                EnumC46200Kcc enumC46200Kcc2 = EnumC46200Kcc.A06;
                                C7TL.A01(new C47625L1k(new C49294Lqo(context2, null, null == true ? 1 : 0, A0010, enumC46200Kcc2, A03, null == true ? 1 : 0, null == true ? 1 : 0, (String) A0011, str6, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, z4, z2, A1a2, z2), A0010, "unknown"), A0010, new C32068E6u(z4, str6), enumC46200Kcc2, directShareTarget2, null, str5, null, false);
                                return;
                            }
                            throw AbstractC166987dD.A14("Unsupported media type");
                        }
                        A00.A06(context, directShareTarget2, str, A0D, A0D2, z, z5);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                String str7 = c47684L3r.A04;
                if (str7 != null) {
                    C36287Fzh.A00(this.A02).ENc(this.A03, str7, this.A05, this.A06, this.A07);
                    return;
                }
                return;
            default:
                throw AbstractC166987dD.A14("Unsupported armadillo message type");
        }
    }

    public static Object A00(AbstractC1345065z abstractC1345065z, AbstractMap abstractMap, int i) {
        return abstractMap.get(abstractC1345065z.A00(i));
    }
}
