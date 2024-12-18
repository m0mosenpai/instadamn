package com.google.android.exoplayer2.source.dash;

import X.C2A4;
import X.C4V3;
import X.C4X9;
import X.C4XB;
import X.C4XD;
import X.C4XL;
import X.C4XN;
import X.C4XO;
import X.C4XQ;
import X.C4XR;
import X.InterfaceC92094Ap;
import X.InterfaceC92404Bv;
import X.InterfaceC96424Va;

/* loaded from: classes2.dex */
public final class DashMediaSource$Factory implements C4XL {

    @Deprecated
    public long A00;
    public C4XR A02;
    public InterfaceC92094Ap A05;
    public final C4X9 A06;
    public final InterfaceC92404Bv A07;
    public final C4V3 A08;
    public final C4XB A09;
    public final C4XD A0A;
    public final InterfaceC96424Va A0B;
    public C2A4 A01 = null;
    public C4XO A04 = new C4XN(-1);
    public C4XQ A03 = new Object();

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.4XQ] */
    public DashMediaSource$Factory(C4X9 c4x9, InterfaceC92404Bv interfaceC92404Bv, C4V3 c4v3, C4XB c4xb, C4XR c4xr, C4XD c4xd, InterfaceC96424Va interfaceC96424Va) {
        this.A0A = c4xd;
        this.A0B = interfaceC96424Va;
        this.A08 = c4v3;
        this.A06 = c4x9;
        this.A07 = interfaceC92404Bv;
        this.A09 = c4xb;
        this.A02 = c4xr == null ? C4XR.A00 : c4xr;
        this.A00 = -1L;
    }
}
