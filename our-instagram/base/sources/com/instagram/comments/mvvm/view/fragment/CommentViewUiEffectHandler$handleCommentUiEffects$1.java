package com.instagram.comments.mvvm.view.fragment;

import X.AbstractC23611Dp;
import X.AbstractC59962oe;
import X.C0eB;
import X.C166487cH;
import X.C166587cU;
import X.C166867cy;
import X.C166887d0;
import X.C25814BbV;
import X.C38E;
import X.InterfaceC16620sF;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;
import X.InterfaceC23621Ds;
import X.InterfaceC43399JFo;
import X.InterfaceC60442pS;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.comments.mvvm.view.fragment.CommentViewUiEffectHandler$handleCommentUiEffects$1", f = "CommentViewUiEffectHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class CommentViewUiEffectHandler$handleCommentUiEffects$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public /* synthetic */ Object A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ InterfaceC43399JFo A02;
    public final /* synthetic */ AbstractC59962oe A03;
    public final /* synthetic */ C166887d0 A04;
    public final /* synthetic */ C166487cH A05;
    public final /* synthetic */ C166867cy A06;
    public final /* synthetic */ C166587cU A07;
    public final /* synthetic */ C25814BbV A08;
    public final /* synthetic */ UserSession A09;
    public final /* synthetic */ InterfaceC60442pS A0A;
    public final /* synthetic */ C38E A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ InterfaceC16820sZ A0D;
    public final /* synthetic */ InterfaceC16820sZ A0E;
    public final /* synthetic */ InterfaceC16660sJ A0F;
    public final /* synthetic */ boolean A0G;
    public final /* synthetic */ boolean A0H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentViewUiEffectHandler$handleCommentUiEffects$1(FragmentActivity fragmentActivity, InterfaceC43399JFo interfaceC43399JFo, AbstractC59962oe abstractC59962oe, C166887d0 c166887d0, C166487cH c166487cH, C166867cy c166867cy, C166587cU c166587cU, C25814BbV c25814BbV, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C38E c38e, String str, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A01 = fragmentActivity;
        this.A09 = userSession;
        this.A0C = str;
        this.A08 = c25814BbV;
        this.A0F = interfaceC16660sJ;
        this.A05 = c166487cH;
        this.A0B = c38e;
        this.A0G = z;
        this.A03 = abstractC59962oe;
        this.A04 = c166887d0;
        this.A0E = interfaceC16820sZ;
        this.A0A = interfaceC60442pS;
        this.A02 = interfaceC43399JFo;
        this.A0D = interfaceC16820sZ2;
        this.A0H = z2;
        this.A06 = c166867cy;
        this.A07 = c166587cU;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        FragmentActivity fragmentActivity = this.A01;
        UserSession userSession = this.A09;
        String str = this.A0C;
        C25814BbV c25814BbV = this.A08;
        InterfaceC16660sJ interfaceC16660sJ = this.A0F;
        C166487cH c166487cH = this.A05;
        C38E c38e = this.A0B;
        boolean z = this.A0G;
        AbstractC59962oe abstractC59962oe = this.A03;
        C166887d0 c166887d0 = this.A04;
        InterfaceC16820sZ interfaceC16820sZ = this.A0E;
        InterfaceC60442pS interfaceC60442pS = this.A0A;
        CommentViewUiEffectHandler$handleCommentUiEffects$1 commentViewUiEffectHandler$handleCommentUiEffects$1 = new CommentViewUiEffectHandler$handleCommentUiEffects$1(fragmentActivity, this.A02, abstractC59962oe, c166887d0, c166487cH, this.A06, this.A07, c25814BbV, userSession, interfaceC60442pS, c38e, str, interfaceC23621Ds, interfaceC16820sZ, this.A0D, interfaceC16660sJ, z, this.A0H);
        commentViewUiEffectHandler$handleCommentUiEffects$1.A00 = obj;
        return commentViewUiEffectHandler$handleCommentUiEffects$1;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommentViewUiEffectHandler$handleCommentUiEffects$1) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x0da5, code lost:
    
        if (r4 != null) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x075f, code lost:
    
        if (r7.A01 == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0d1c, code lost:
    
        if (((X.C3DP) r6).A0h != true) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0de3, code lost:
    
        if (((X.C3DP) r0).A0h != true) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0c6b, code lost:
    
        if (r6 != null) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x024c, code lost:
    
        if (((X.C206219Be) r0).A00 != 0) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 4394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.view.fragment.CommentViewUiEffectHandler$handleCommentUiEffects$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
