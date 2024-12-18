package com.instagram.compose.ui.pulltorefresh;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C14360o3;
import X.C14510oO;
import X.C1KM;
import X.C1KP;
import X.C6LI;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.compose.ui.pulltorefresh.PullRefreshStateKt$rememberPullRefreshState$3$1$2", f = "PullRefreshState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class PullRefreshStateKt$rememberPullRefreshState$3$1$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public /* synthetic */ float A00;
    public final /* synthetic */ C6LI A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ C14510oO A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshStateKt$rememberPullRefreshState$3$1$2(C6LI c6li, String str, InterfaceC23621Ds interfaceC23621Ds, C14510oO c14510oO) {
        super(2, interfaceC23621Ds);
        this.A03 = c14510oO;
        this.A01 = c6li;
        this.A02 = str;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        PullRefreshStateKt$rememberPullRefreshState$3$1$2 pullRefreshStateKt$rememberPullRefreshState$3$1$2 = new PullRefreshStateKt$rememberPullRefreshState$3$1$2(this.A01, this.A02, interfaceC23621Ds, this.A03);
        pullRefreshStateKt$rememberPullRefreshState$3$1$2.A00 = AbstractC166987dD.A09(obj);
        return pullRefreshStateKt$rememberPullRefreshState$3$1$2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PullRefreshStateKt$rememberPullRefreshState$3$1$2) create(Float.valueOf(AbstractC166987dD.A09(obj)), (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        float f = this.A00;
        C14510oO c14510oO = this.A03;
        boolean z = true;
        if (!c14510oO.A00) {
            if (f >= 1.0f) {
                String str = this.A02;
                C14360o3.A0B(str, 0);
                C1KM.A09.A0K(str, ((C1KP) C1KM.A00()).A01);
                c14510oO.A00 = z;
            }
        } else {
            z = false;
            if (f == 0.0f) {
                String str2 = this.A02;
                C14360o3.A0B(str2, 0);
                C1KM.A08(str2);
                c14510oO.A00 = z;
            }
        }
        return C0eB.A00;
    }
}
