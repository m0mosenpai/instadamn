package com.instagram.direct.msys.mailbox.fts;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC25231BEo;
import X.AbstractC25232BEp;
import X.AbstractC41851wZ;
import X.AbstractC43592JPx;
import X.AbstractC43593JPy;
import X.C0eB;
import X.C14360o3;
import X.C1JX;
import X.C24891Jo;
import X.C35857FsX;
import X.C47394Kwj;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.InterfaceExecutorC135866Co;
import X.K3D;
import X.LVI;
import X.MHJ;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.msys.mailbox.fts.IgMailboxFts$Companion$loadFTSMessageThreads$2", f = "IgMailboxFts.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class IgMailboxFts$Companion$loadFTSMessageThreads$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgMailboxFts$Companion$loadFTSMessageThreads$2(UserSession userSession, String str, InterfaceC23621Ds interfaceC23621Ds, int i, long j) {
        super(2, interfaceC23621Ds);
        this.A05 = userSession;
        this.A06 = str;
        this.A03 = i;
        this.A04 = j;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new IgMailboxFts$Companion$loadFTSMessageThreads$2(this.A05, this.A06, interfaceC23621Ds, this.A03, this.A04);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            UserSession userSession = this.A05;
            String str = this.A06;
            int i = this.A03;
            long j = this.A04;
            this.A01 = userSession;
            this.A02 = str;
            this.A00 = 1;
            C24891Jo A1H = AbstractC25232BEp.A1H(this);
            C14360o3.A0B(userSession, 0);
            K3D k3d = ((C47394Kwj) AbstractC41851wZ.A00(userSession).A01(C47394Kwj.class, MHJ.A00(userSession, 6))).A00;
            C35857FsX c35857FsX = new C35857FsX(1, A1H, userSession);
            InterfaceExecutorC135866Co A0C = AbstractC43592JPx.A0C(k3d, 0);
            MailboxFutureImpl A0I = AbstractC43593JPy.A0I(A0C, c35857FsX);
            AbstractC25231BEo.A1C(A0C, new LVI(k3d, A0I, str, i, j), A0I);
            obj = A1H.A0E();
            if (obj == c1jx) {
                return c1jx;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((IgMailboxFts$Companion$loadFTSMessageThreads$2) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
