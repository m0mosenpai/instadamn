package com.instagram.barcelonaig.fragment;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C1JX;
import X.C25797BbE;
import X.C2Fb;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import android.content.Context;
import com.instagram.barcelona.weblink.WebLinkUseCase;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.barcelonaig.fragment.BarcelonaIgViewModel$handleWebLinkClick$1", f = "BarcelonaIgViewModel.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class BarcelonaIgViewModel$handleWebLinkClick$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C25797BbE A02;
    public final /* synthetic */ C2Fb A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarcelonaIgViewModel$handleWebLinkClick$1(C25797BbE c25797BbE, C2Fb c2Fb, String str, String str2, String str3, InterfaceC23621Ds interfaceC23621Ds, long j) {
        super(2, interfaceC23621Ds);
        this.A02 = c25797BbE;
        this.A06 = str;
        this.A05 = str2;
        this.A03 = c2Fb;
        this.A01 = j;
        this.A04 = str3;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C25797BbE c25797BbE = this.A02;
        String str = this.A06;
        String str2 = this.A05;
        return new BarcelonaIgViewModel$handleWebLinkClick$1(c25797BbE, this.A03, str, str2, this.A04, interfaceC23621Ds, this.A01);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            C25797BbE c25797BbE = this.A02;
            WebLinkUseCase webLinkUseCase = c25797BbE.A00;
            Context A0O = AbstractC166987dD.A0O(c25797BbE.A0D());
            String str = this.A06;
            String str2 = this.A05;
            C2Fb c2Fb = this.A03;
            long j = this.A01;
            String str3 = this.A04;
            this.A00 = 1;
            if (webLinkUseCase.A00(A0O, c2Fb, str, str2, str3, this, j) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BarcelonaIgViewModel$handleWebLinkClick$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
