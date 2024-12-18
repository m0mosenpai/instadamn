package com.instagram.url;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C008302x;
import X.C0eB;
import X.C15370ps;
import X.C1JX;
import X.C71696Wz3;
import X.FVK;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.url.DeepLinkUtil$handlePromoteFlowDeepLink$1", f = "DeepLinkUtil.kt", i = {}, l = {751}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class DeepLinkUtil$handlePromoteFlowDeepLink$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ C15370ps A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeepLinkUtil$handlePromoteFlowDeepLink$1(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4, String str5, InterfaceC23621Ds interfaceC23621Ds, C15370ps c15370ps, boolean z, boolean z2, boolean z3) {
        super(2, interfaceC23621Ds);
        this.A02 = userSession;
        this.A05 = str;
        this.A08 = c15370ps;
        this.A01 = fragmentActivity;
        this.A04 = str2;
        this.A06 = str3;
        this.A09 = z;
        this.A0B = z2;
        this.A0A = z3;
        this.A03 = str4;
        this.A07 = str5;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        UserSession userSession = this.A02;
        String str = this.A05;
        C15370ps c15370ps = this.A08;
        return new DeepLinkUtil$handlePromoteFlowDeepLink$1(this.A01, userSession, str, this.A04, this.A06, this.A03, this.A07, interfaceC23621Ds, c15370ps, this.A09, this.A0B, this.A0A);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            UserSession userSession = this.A02;
            C008302x A00 = FVK.A00(userSession, this.A05);
            C15370ps c15370ps = this.A08;
            C71696Wz3 c71696Wz3 = new C71696Wz3(this.A01, userSession, this.A04, this.A06, this.A03, this.A07, c15370ps, this.A09, this.A0B, this.A0A);
            this.A00 = 1;
            if (A00.collect(c71696Wz3, this) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DeepLinkUtil$handlePromoteFlowDeepLink$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
