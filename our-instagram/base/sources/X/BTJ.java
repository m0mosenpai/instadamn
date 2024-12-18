package X;

import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class BTJ extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ BNS A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BTJ(BNS bns, boolean z, boolean z2, boolean z3) {
        super(0);
        this.A00 = bns;
        this.A01 = z;
        this.A02 = z2;
        this.A03 = z3;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        BNS bns = this.A00;
        C120985dq c120985dq = bns.A01;
        HashMap hashMap = bns.A07;
        HashMap hashMap2 = bns.A06;
        InterfaceC11380iw interfaceC11380iw = bns.A03;
        WeakReference A16 = AbstractC25225BEi.A16(bns.A05);
        C37644Ghd c37644Ghd = bns.A02;
        UserSession userSession = bns.A04;
        boolean z = this.A01;
        boolean z2 = bns.A08;
        boolean z3 = this.A02;
        boolean z4 = this.A03;
        return new BNK(C51722Yv.A02, bns.A00, c120985dq, c37644Ghd, interfaceC11380iw, userSession, null, A16, hashMap, hashMap2, z, z2, false, false, z3, z4);
    }
}
