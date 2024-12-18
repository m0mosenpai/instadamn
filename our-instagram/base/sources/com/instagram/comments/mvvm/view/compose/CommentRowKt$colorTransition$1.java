package com.instagram.comments.mvvm.view.compose;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC25225BEi;
import X.AbstractC25228BEl;
import X.C0eB;
import X.C1132359l;
import X.C1JX;
import X.C25245BFe;
import X.C5Y1;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.comments.mvvm.view.compose.CommentRowKt$colorTransition$1", f = "CommentRow.kt", i = {}, l = {246}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class CommentRowKt$colorTransition$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ C5Y1 A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentRowKt$colorTransition$1(C5Y1 c5y1, InterfaceC23621Ds interfaceC23621Ds, int i, int i2, long j) {
        super(2, interfaceC23621Ds);
        this.A04 = c5y1;
        this.A03 = j;
        this.A02 = i;
        this.A01 = i2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new CommentRowKt$colorTransition$1(this.A04, interfaceC23621Ds, this.A02, this.A01, this.A03);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            C5Y1 c5y1 = this.A04;
            C1132359l A0S = AbstractC25225BEi.A0S(this.A03);
            C25245BFe A00 = C25245BFe.A00(this.A02, this.A01);
            this.A00 = 1;
            if (AbstractC25228BEl.A14(c5y1, A00, A0S, this) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommentRowKt$colorTransition$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
