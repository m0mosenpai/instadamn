package com.instagram.barcelona.permalink.ui.component;

import X.AbstractC001800i;
import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC43592JPx;
import X.C0eB;
import X.C137036Ig;
import X.C14360o3;
import X.C6IF;
import X.InterfaceC137046Ii;
import X.InterfaceC16610sE;
import X.InterfaceC23621Ds;
import androidx.compose.foundation.lazy.LazyListState;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.barcelona.permalink.ui.component.OverEndScrollKt$rememberOverEndScrollState$1$1$3", f = "OverEndScroll.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class OverEndScrollKt$rememberOverEndScrollState$1$1$3 extends AbstractC23611Dp implements InterfaceC16610sE {
    public /* synthetic */ Object A00;
    public /* synthetic */ boolean A01;
    public final /* synthetic */ LazyListState A02;
    public final /* synthetic */ String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverEndScrollKt$rememberOverEndScrollState$1$1$3(LazyListState lazyListState, String str, InterfaceC23621Ds interfaceC23621Ds) {
        super(3, interfaceC23621Ds);
        this.A02 = lazyListState;
        this.A03 = str;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean A1a = AbstractC166987dD.A1a(obj);
        OverEndScrollKt$rememberOverEndScrollState$1$1$3 overEndScrollKt$rememberOverEndScrollState$1$1$3 = new OverEndScrollKt$rememberOverEndScrollState$1$1$3(this.A02, this.A03, (InterfaceC23621Ds) obj3);
        overEndScrollKt$rememberOverEndScrollState$1$1$3.A01 = A1a;
        overEndScrollKt$rememberOverEndScrollState$1$1$3.A00 = obj2;
        return overEndScrollKt$rememberOverEndScrollState$1$1$3.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i;
        AbstractC09560e7.A00(obj);
        boolean z = this.A01;
        Object obj2 = this.A00;
        LazyListState lazyListState = this.A02;
        InterfaceC137046Ii interfaceC137046Ii = (InterfaceC137046Ii) AbstractC001800i.A0L(((C6IF) lazyListState.A02()).A0D);
        boolean A0K = C14360o3.A0K(obj2, this.A03);
        if (!z && interfaceC137046Ii != null) {
            if (!A0K) {
                i = 0;
            } else {
                i = ((C6IF) lazyListState.A02()).A07 - ((C137036Ig) interfaceC137046Ii).A02;
            }
            return AbstractC43592JPx.A0r(i);
        }
        return null;
    }
}
