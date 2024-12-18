package com.instagram.feed.adapter.row.ufi.compose;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC25225BEi;
import X.AbstractC25228BEl;
import X.C0eB;
import X.C1JX;
import X.C25245BFe;
import X.C5Y1;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.feed.adapter.row.ufi.compose.ComposeMediaUFIComponentKt$BaseUfiIcon$1$1$4$1", f = "ComposeMediaUFIComponent.kt", i = {}, l = {361, 367}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class ComposeMediaUFIComponentKt$BaseUfiIcon$1$1$4$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ C5Y1 A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeMediaUFIComponentKt$BaseUfiIcon$1$1$4$1(C5Y1 c5y1, InterfaceC23621Ds interfaceC23621Ds, long j, long j2, long j3, long j4) {
        super(2, interfaceC23621Ds);
        this.A05 = c5y1;
        this.A03 = j;
        this.A01 = j2;
        this.A04 = j3;
        this.A02 = j4;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new ComposeMediaUFIComponentKt$BaseUfiIcon$1$1$4$1(this.A05, interfaceC23621Ds, this.A03, this.A01, this.A04, this.A02);
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
            C5Y1 c5y1 = this.A05;
            Float A10 = AbstractC25225BEi.A10(1.0f);
            C25245BFe A00 = C25245BFe.A00((int) this.A03, (int) this.A01);
            this.A00 = 1;
            if (AbstractC25228BEl.A14(c5y1, A00, A10, this) == c1jx) {
                return c1jx;
            }
        }
        C5Y1 c5y12 = this.A05;
        Float A102 = AbstractC25225BEi.A10(0.0f);
        C25245BFe A002 = C25245BFe.A00((int) this.A04, (int) this.A02);
        this.A00 = 2;
        if (AbstractC25228BEl.A14(c5y12, A002, A102, this) == c1jx) {
            return c1jx;
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ComposeMediaUFIComponentKt$BaseUfiIcon$1$1$4$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
