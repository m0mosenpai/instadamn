package X;

import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.PEj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56691PEj implements InterfaceC58126Ppp {
    public final /* synthetic */ NTX A00;

    public C56691PEj(NTX ntx) {
        this.A00 = ntx;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.PlK, java.lang.Object] */
    @Override // X.InterfaceC58126Ppp
    public final void DiV() {
        NTX ntx = this.A00;
        ntx.A0F.A00.A00(new P9Y());
        ntx.A0D.A03(new Object());
    }

    @Override // X.InterfaceC58126Ppp
    public final void DiW() {
        NTX ntx = this.A00;
        ntx.A0G.A02(0L);
        ntx.A0F.A00.A00(new C56575P9x(C05F.A01));
    }

    @Override // X.InterfaceC58126Ppp
    public final void DiX() {
        Integer num;
        OHO oho;
        String str;
        NTX ntx = this.A00;
        String str2 = ntx.A06;
        if (str2 != null) {
            C51892Mwa c51892Mwa = (C51892Mwa) ((AbstractC55206OeJ) ntx).A01;
            Integer num2 = null;
            if (c51892Mwa != null) {
                num = c51892Mwa.A01;
            } else {
                num = null;
            }
            if (num == C05F.A00) {
                ntx.A0D.A03(new C56614PBk(ntx.A0B, ntx.A09, str2));
                oho = ntx.A0F;
                str = RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING;
            } else {
                if (c51892Mwa != null) {
                    num2 = c51892Mwa.A01;
                }
                if (num2 == C05F.A01) {
                    AbstractC54900OPv.A00(ntx.A09, ntx.A0B, null, str2, true);
                    oho = ntx.A0F;
                    str = "story";
                }
            }
            oho.A00.A00(new C56558P9e(str));
        }
        ntx.A0G.A01();
        ntx.A0F.A00.A00(new C56576P9y(C05F.A01));
        ntx.A07 = AbstractC166987dD.A1E();
        C55177Odh.A01(ntx.A0D, true);
        NTX.A02(ntx);
    }
}
