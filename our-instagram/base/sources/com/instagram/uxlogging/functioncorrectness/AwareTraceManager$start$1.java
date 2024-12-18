package com.instagram.uxlogging.functioncorrectness;

import X.AbstractC09560e7;
import X.AbstractC23611Dp;
import X.C00O;
import X.C0eB;
import X.C14360o3;
import X.C1JX;
import X.C1KT;
import X.C51652Yn;
import X.C51702Yt;
import X.C52022a2;
import X.InterfaceC15070pN;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.uxlogging.functioncorrectness.AwareTraceManager$start$1", f = "AwareTraceManager.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class AwareTraceManager$start$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwareTraceManager$start$1(Context context, InterfaceC23621Ds interfaceC23621Ds, int i, int i2, boolean z) {
        super(2, interfaceC23621Ds);
        this.A03 = context;
        this.A02 = i;
        this.A01 = i2;
        this.A04 = z;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new AwareTraceManager$start$1(this.A03, interfaceC23621Ds, this.A02, this.A01, this.A04);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AwareTraceManager$start$1) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            C51702Yt c51702Yt = C51652Yn.A03;
            if (c51702Yt == null) {
                c51702Yt = new C51702Yt(this.A03);
                C51652Yn.A03 = c51702Yt;
            }
            if (c51702Yt == null) {
                C14360o3.A0F("storage");
                throw C00O.createAndThrow();
            }
            c51702Yt.A02 = this.A02;
            c51702Yt.A01 = this.A01;
            c51702Yt.A04 = this.A04;
            InterfaceC15070pN interfaceC15070pN = (InterfaceC15070pN) C1KT.A06.getValue();
            C52022a2 c52022a2 = C52022a2.A00;
            this.A00 = 1;
            if (interfaceC15070pN.collect(c52022a2, this) == c1jx) {
                return c1jx;
            }
        }
        throw new RuntimeException();
    }
}
