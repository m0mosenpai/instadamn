package com.instagram.comments.mvvm.data;

import X.AFR;
import X.AFS;
import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.B4Z;
import X.C0eB;
import X.C14360o3;
import X.C166137bh;
import X.C166157bj;
import X.C19L;
import X.C1JX;
import X.C26025BfE;
import X.C26086BgF;
import X.C4A7;
import X.C9F3;
import X.C9Z7;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import X.MCK;
import com.instagram.comments.mvvm.data.network.MediaChildCommentNetworkFetcherKt;
import com.instagram.common.session.UserSession;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.comments.mvvm.data.MediaCommentListRepository$fetchOrJoinChildCommentPage$2", f = "MediaCommentListRepository.kt", i = {}, l = {929, 939}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class MediaCommentListRepository$fetchOrJoinChildCommentPage$2 extends AbstractC23611Dp implements InterfaceC16660sJ {
    public int A00;
    public final /* synthetic */ C26086BgF A01;
    public final /* synthetic */ MediaCommentListRepository A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCommentListRepository$fetchOrJoinChildCommentPage$2(C26086BgF c26086BgF, MediaCommentListRepository mediaCommentListRepository, InterfaceC23621Ds interfaceC23621Ds) {
        super(1, interfaceC23621Ds);
        this.A02 = mediaCommentListRepository;
        this.A01 = c26086BgF;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        return new MediaCommentListRepository$fetchOrJoinChildCommentPage$2(this.A01, this.A02, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((MediaCommentListRepository$fetchOrJoinChildCommentPage$2) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Object obj2 = obj;
        C1JX c1jx = C1JX.A02;
        int i = this.A00;
        if (i != 0) {
            if (i != 1) {
                AbstractC09560e7.A00(obj2);
                return C0eB.A00;
            }
            AbstractC09560e7.A00(obj2);
        } else {
            AbstractC09560e7.A00(obj2);
            MediaCommentListRepository mediaCommentListRepository = this.A02;
            C19L c19l = ((C4A7) mediaCommentListRepository).A01;
            C26086BgF c26086BgF = this.A01;
            AbstractC166987dD.A1Z(new MCK(c26086BgF, mediaCommentListRepository, (InterfaceC23621Ds) null, 24), c19l);
            UserSession userSession = mediaCommentListRepository.A0B;
            C26025BfE c26025BfE = mediaCommentListRepository.A04;
            boolean z = c26025BfE.A0f;
            String str = c26025BfE.A0F;
            boolean z2 = ((C166157bj) mediaCommentListRepository.A0M.getValue()).A03;
            Set set = ((C166137bh) mediaCommentListRepository.A0H.getValue()).A03.A02;
            this.A00 = 1;
            obj2 = MediaChildCommentNetworkFetcherKt.A00(c26086BgF, userSession, str, set, this, z, z2);
            if (obj2 == c1jx) {
                return c1jx;
            }
        }
        if (!C14360o3.A0K(obj2, AFS.A00) && !C14360o3.A0K(obj2, AFR.A00)) {
            if (obj2 instanceof C9Z7) {
                MediaCommentListRepository mediaCommentListRepository2 = this.A02;
                C26086BgF c26086BgF2 = this.A01;
                this.A00 = 2;
                if (MediaCommentListRepository.A09(mediaCommentListRepository2, this, new C9F3(35, obj2, c26086BgF2)) == c1jx) {
                    return c1jx;
                }
            } else {
                throw B4Z.A00();
            }
        }
        return C0eB.A00;
    }
}
