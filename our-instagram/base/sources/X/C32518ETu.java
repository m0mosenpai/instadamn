package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.ETu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32518ETu extends C1P1 {
    public final /* synthetic */ InterfaceC37261GbE A00;
    public final /* synthetic */ C33551iH A01;
    public final /* synthetic */ C33531iF A02;
    public final /* synthetic */ DirectThreadKey A03;

    public C32518ETu(InterfaceC37261GbE interfaceC37261GbE, C33551iH c33551iH, C33531iF c33531iF, DirectThreadKey directThreadKey) {
        this.A03 = directThreadKey;
        this.A01 = c33551iH;
        this.A02 = c33531iF;
        this.A00 = interfaceC37261GbE;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        C0f9.A0A(-691434570, C0f9.A03(385528658));
    }

    @Override // X.C1P1
    public final void onStart() {
        C0f9.A0A(-1151645557, C0f9.A03(1938284657));
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1876386077);
        C126455ng c126455ng = (C126455ng) obj;
        int A0N = AbstractC167017dG.A0N(c126455ng, -1333946970);
        C1GJ.A03(C33551iH.A00(this.A01, this.A02, new DirectThreadKey(c126455ng.A1E, this.A03.A02)));
        C0f9.A0A(88769579, A0N);
        C0f9.A0A(269692512, A03);
    }
}
