package com.instagram.url;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C008302x;
import X.C0eB;
import X.C15370ps;
import X.C1JX;
import X.C71695Wz2;
import X.FVK;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.url.DeepLinkUtil$handlePromoteFlowDeepLinkWithClientSpecOverride$1", f = "DeepLinkUtil.kt", i = {}, l = {699}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class DeepLinkUtil$handlePromoteFlowDeepLinkWithClientSpecOverride$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ FragmentActivity A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ C15370ps A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeepLinkUtil$handlePromoteFlowDeepLinkWithClientSpecOverride$1(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, C15370ps c15370ps, int i, int i2) {
        super(2, interfaceC23621Ds);
        this.A04 = userSession;
        this.A06 = str;
        this.A07 = c15370ps;
        this.A03 = fragmentActivity;
        this.A05 = str2;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new DeepLinkUtil$handlePromoteFlowDeepLinkWithClientSpecOverride$1(this.A03, this.A04, this.A06, this.A05, interfaceC23621Ds, this.A07, this.A01, this.A02);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            UserSession userSession = this.A04;
            C008302x A00 = FVK.A00(userSession, this.A06);
            C71695Wz2 c71695Wz2 = new C71695Wz2(this.A03, userSession, this.A05, this.A07, this.A01, this.A02);
            this.A00 = 1;
            if (A00.collect(c71695Wz2, this) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DeepLinkUtil$handlePromoteFlowDeepLinkWithClientSpecOverride$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
