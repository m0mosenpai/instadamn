package com.instagram.comments.mvvm.data;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C1JX;
import X.C9GE;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.comments.mvvm.data.MediaCommentListRepository$updateCommentActionMenu$1", f = "MediaCommentListRepository.kt", i = {}, l = {1014}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class MediaCommentListRepository$updateCommentActionMenu$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ MediaCommentListRepository A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCommentListRepository$updateCommentActionMenu$1(MediaCommentListRepository mediaCommentListRepository, String str, String str2, List list, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A01 = mediaCommentListRepository;
        this.A03 = str;
        this.A02 = str2;
        this.A05 = z;
        this.A04 = list;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new MediaCommentListRepository$updateCommentActionMenu$1(this.A01, this.A03, this.A02, this.A04, interfaceC23621Ds, this.A05);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            MediaCommentListRepository mediaCommentListRepository = this.A01;
            String str = this.A03;
            String str2 = this.A02;
            boolean z = this.A05;
            List list = this.A04;
            this.A00 = 1;
            if (MediaCommentListRepository.A09(mediaCommentListRepository, this, new C9GE(list, str, str2, 2, z)) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MediaCommentListRepository$updateCommentActionMenu$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
