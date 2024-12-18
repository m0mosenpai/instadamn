package com.instagram.comments.mvvm.data;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.InterfaceC38371qR;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.comments.mvvm.data.MediaCommentListRepository$likeCommentAction$1", f = "MediaCommentListRepository.kt", i = {0, 0, 0, 1, 1}, l = {966, 973, 980}, m = "invokeSuspend", n = {"mediaSourceMetadata", "commentRow", "commentLikeActionUUID", "commentRow", "commentLikeActionUUID"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
/* loaded from: classes5.dex */
public final class MediaCommentListRepository$likeCommentAction$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final /* synthetic */ MediaCommentListRepository A04;
    public final /* synthetic */ InterfaceC38371qR A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCommentListRepository$likeCommentAction$1(MediaCommentListRepository mediaCommentListRepository, InterfaceC38371qR interfaceC38371qR, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A05 = interfaceC38371qR;
        this.A04 = mediaCommentListRepository;
        this.A07 = str;
        this.A06 = str2;
        this.A08 = z;
        this.A09 = z2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new MediaCommentListRepository$likeCommentAction$1(this.A04, this.A05, this.A07, this.A06, interfaceC23621Ds, this.A08, this.A09);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f0 A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.MediaCommentListRepository$likeCommentAction$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MediaCommentListRepository$likeCommentAction$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
