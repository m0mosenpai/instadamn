package com.instagram.comments.mvvm.view.fragment;

import X.AbstractC13100lw;
import X.AbstractC23611Dp;
import X.AbstractC59962oe;
import X.C0eB;
import X.C14510oO;
import X.C149766oT;
import X.C166627cY;
import X.C1M1;
import X.C25814BbV;
import X.C26025BfE;
import X.InterfaceC16620sF;
import X.InterfaceC168087f3;
import X.InterfaceC16820sZ;
import X.InterfaceC23621Ds;
import X.InterfaceC60442pS;
import android.content.Context;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.comments.mvvm.view.fragment.CommentComposerBinder$createAndBindViewHolder$1$5$2", f = "CommentComposerBinder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class CommentComposerBinder$createAndBindViewHolder$1$5$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public /* synthetic */ Object A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AbstractC59962oe A02;
    public final /* synthetic */ InterfaceC168087f3 A03;
    public final /* synthetic */ C26025BfE A04;
    public final /* synthetic */ C166627cY A05;
    public final /* synthetic */ C25814BbV A06;
    public final /* synthetic */ UserSession A07;
    public final /* synthetic */ AbstractC13100lw A08;
    public final /* synthetic */ InterfaceC60442pS A09;
    public final /* synthetic */ C149766oT A0A;
    public final /* synthetic */ C1M1 A0B;
    public final /* synthetic */ InterfaceC16820sZ A0C;
    public final /* synthetic */ C14510oO A0D;
    public final /* synthetic */ C14510oO A0E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentComposerBinder$createAndBindViewHolder$1$5$2(Context context, AbstractC59962oe abstractC59962oe, InterfaceC168087f3 interfaceC168087f3, C26025BfE c26025BfE, C166627cY c166627cY, C25814BbV c25814BbV, UserSession userSession, AbstractC13100lw abstractC13100lw, InterfaceC60442pS interfaceC60442pS, C149766oT c149766oT, C1M1 c1m1, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ, C14510oO c14510oO, C14510oO c14510oO2) {
        super(2, interfaceC23621Ds);
        this.A05 = c166627cY;
        this.A02 = abstractC59962oe;
        this.A01 = context;
        this.A0A = c149766oT;
        this.A06 = c25814BbV;
        this.A07 = userSession;
        this.A09 = interfaceC60442pS;
        this.A08 = abstractC13100lw;
        this.A03 = interfaceC168087f3;
        this.A0E = c14510oO;
        this.A0B = c1m1;
        this.A0C = interfaceC16820sZ;
        this.A04 = c26025BfE;
        this.A0D = c14510oO2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C166627cY c166627cY = this.A05;
        AbstractC59962oe abstractC59962oe = this.A02;
        Context context = this.A01;
        C149766oT c149766oT = this.A0A;
        C25814BbV c25814BbV = this.A06;
        UserSession userSession = this.A07;
        InterfaceC60442pS interfaceC60442pS = this.A09;
        AbstractC13100lw abstractC13100lw = this.A08;
        InterfaceC168087f3 interfaceC168087f3 = this.A03;
        C14510oO c14510oO = this.A0E;
        CommentComposerBinder$createAndBindViewHolder$1$5$2 commentComposerBinder$createAndBindViewHolder$1$5$2 = new CommentComposerBinder$createAndBindViewHolder$1$5$2(context, abstractC59962oe, interfaceC168087f3, this.A04, c166627cY, c25814BbV, userSession, abstractC13100lw, interfaceC60442pS, c149766oT, this.A0B, interfaceC23621Ds, this.A0C, c14510oO, this.A0D);
        commentComposerBinder$createAndBindViewHolder$1$5$2.A00 = obj;
        return commentComposerBinder$createAndBindViewHolder$1$5$2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommentComposerBinder$createAndBindViewHolder$1$5$2) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0165, code lost:
    
        if (X.C18U.A06(r28, r4, 36320322219680108L) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01b3, code lost:
    
        if (X.C18U.A06(r28, r0.A00, 36320279271055616L) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01c7, code lost:
    
        if (r9 == false) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ce  */
    /* JADX WARN: Type inference failed for: r10v20, types: [X.7g0, java.lang.Object] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r50) {
        /*
            Method dump skipped, instructions count: 1816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.view.fragment.CommentComposerBinder$createAndBindViewHolder$1$5$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
