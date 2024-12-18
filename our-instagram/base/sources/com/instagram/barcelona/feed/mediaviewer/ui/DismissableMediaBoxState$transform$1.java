package com.instagram.barcelona.feed.mediaviewer.ui;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC25225BEi;
import X.C0eB;
import X.C119365at;
import X.C1JX;
import X.C28357CfH;
import X.C5Y1;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.barcelona.feed.mediaviewer.ui.DismissableMediaBoxState$transform$1", f = "DismissableMediaBoxState.kt", i = {}, l = {115, 116}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class DismissableMediaBoxState$transform$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ C28357CfH A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DismissableMediaBoxState$transform$1(C28357CfH c28357CfH, InterfaceC23621Ds interfaceC23621Ds, float f, long j, long j2) {
        super(2, interfaceC23621Ds);
        this.A04 = c28357CfH;
        this.A03 = j;
        this.A02 = j2;
        this.A01 = f;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new DismissableMediaBoxState$transform$1(this.A04, interfaceC23621Ds, this.A01, this.A03, this.A02);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        int i = this.A00;
        if (i != 0) {
            if (i != 1) {
                AbstractC09560e7.A00(obj);
                return C0eB.A00;
            }
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            C5Y1 c5y1 = this.A04.A00;
            C119365at A0R = AbstractC25225BEi.A0R(C119365at.A07(this.A03, this.A02));
            this.A00 = 1;
            if (c5y1.A05(A0R, this) == c1jx) {
                return c1jx;
            }
        }
        C5Y1 c5y12 = this.A04.A01;
        Float A10 = AbstractC25225BEi.A10(this.A01);
        this.A00 = 2;
        if (c5y12.A05(A10, this) == c1jx) {
            return c1jx;
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DismissableMediaBoxState$transform$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
