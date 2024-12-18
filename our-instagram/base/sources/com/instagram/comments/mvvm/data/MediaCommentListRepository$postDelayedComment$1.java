package com.instagram.comments.mvvm.data;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C115925Mi;
import X.C115935Mj;
import X.C51618MrB;
import X.InterfaceC16620sF;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;
import X.InterfaceC23621Ds;
import X.InterfaceC30934Dio;
import X.InterfaceC38371qR;
import X.MOF;
import com.instagram.api.schemas.CommentGiphyMediaInfo;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.comments.mvvm.data.MediaCommentListRepository$postDelayedComment$1", f = "MediaCommentListRepository.kt", i = {0, 1, 1, 2}, l = {799, 808, 821}, m = "invokeSuspend", n = {"postDelayedCommentJob", "postDelayedCommentJob", "offensiveScore", "postDelayedCommentJob"}, s = {"L$0", "L$0", "L$5", "L$0"})
/* loaded from: classes8.dex */
public final class MediaCommentListRepository$postDelayedComment$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public /* synthetic */ Object A07;
    public final /* synthetic */ long A08;
    public final /* synthetic */ CommentGiphyMediaInfo A09;
    public final /* synthetic */ MOF A0A;
    public final /* synthetic */ InterfaceC30934Dio A0B;
    public final /* synthetic */ MediaCommentListRepository A0C;
    public final /* synthetic */ C51618MrB A0D;
    public final /* synthetic */ C115925Mi A0E;
    public final /* synthetic */ C115935Mj A0F;
    public final /* synthetic */ InterfaceC38371qR A0G;
    public final /* synthetic */ String A0H;
    public final /* synthetic */ String A0I;
    public final /* synthetic */ InterfaceC16820sZ A0J;
    public final /* synthetic */ InterfaceC16660sJ A0K;
    public final /* synthetic */ boolean A0L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCommentListRepository$postDelayedComment$1(CommentGiphyMediaInfo commentGiphyMediaInfo, MOF mof, InterfaceC30934Dio interfaceC30934Dio, MediaCommentListRepository mediaCommentListRepository, C51618MrB c51618MrB, C115925Mi c115925Mi, C115935Mj c115935Mj, InterfaceC38371qR interfaceC38371qR, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, long j, boolean z) {
        super(2, interfaceC23621Ds);
        this.A0L = z;
        this.A0C = mediaCommentListRepository;
        this.A0D = c51618MrB;
        this.A0H = str;
        this.A0G = interfaceC38371qR;
        this.A08 = j;
        this.A0I = str2;
        this.A09 = commentGiphyMediaInfo;
        this.A0E = c115925Mi;
        this.A0F = c115935Mj;
        this.A0J = interfaceC16820sZ;
        this.A0B = interfaceC30934Dio;
        this.A0A = mof;
        this.A0K = interfaceC16660sJ;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        boolean z = this.A0L;
        MediaCommentListRepository mediaCommentListRepository = this.A0C;
        C51618MrB c51618MrB = this.A0D;
        String str = this.A0H;
        InterfaceC38371qR interfaceC38371qR = this.A0G;
        long j = this.A08;
        String str2 = this.A0I;
        CommentGiphyMediaInfo commentGiphyMediaInfo = this.A09;
        C115925Mi c115925Mi = this.A0E;
        C115935Mj c115935Mj = this.A0F;
        InterfaceC16820sZ interfaceC16820sZ = this.A0J;
        MediaCommentListRepository$postDelayedComment$1 mediaCommentListRepository$postDelayedComment$1 = new MediaCommentListRepository$postDelayedComment$1(commentGiphyMediaInfo, this.A0A, this.A0B, mediaCommentListRepository, c51618MrB, c115925Mi, c115935Mj, interfaceC38371qR, str, str2, interfaceC23621Ds, interfaceC16820sZ, this.A0K, j, z);
        mediaCommentListRepository$postDelayedComment$1.A07 = obj;
        return mediaCommentListRepository$postDelayedComment$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x016c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r9v7, types: [X.4A7] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.MediaCommentListRepository$postDelayedComment$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MediaCommentListRepository$postDelayedComment$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
