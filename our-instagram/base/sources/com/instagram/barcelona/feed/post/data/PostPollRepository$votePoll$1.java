package com.instagram.barcelona.feed.post.data;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC23611Dp;
import X.AbstractC25226BEj;
import X.AbstractC25229BEm;
import X.AbstractC31172DnG;
import X.C0eB;
import X.C1JX;
import X.C25621Ms;
import X.C34753FSs;
import X.C38321qM;
import X.EAS;
import X.InterfaceC11380iw;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.KZ3;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.barcelona.feed.post.data.PostPollRepository$votePoll$1", f = "PostPollRepository.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class PostPollRepository$votePoll$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ KZ3 A02;
    public final /* synthetic */ InterfaceC11380iw A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostPollRepository$votePoll$1(KZ3 kz3, InterfaceC11380iw interfaceC11380iw, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A02 = kz3;
        this.A05 = str;
        this.A04 = str2;
        this.A01 = i;
        this.A03 = interfaceC11380iw;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new PostPollRepository$votePoll$1(this.A02, this.A03, this.A05, this.A04, interfaceC23621Ds, this.A01);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            UserSession userSession = this.A02.A00;
            String str = this.A05;
            String str2 = this.A04;
            int i = this.A01;
            String moduleName = this.A03.getModuleName();
            this.A00 = 1;
            String str3 = null;
            C25621Ms A0c = AbstractC167017dG.A0c(userSession);
            A0c.A0L("media/%s/%s/story_poll_vote/", str, str2);
            A0c.A9s("vote", String.valueOf(i));
            A0c.A9s("container_module", moduleName);
            C38321qM A0h = AbstractC25229BEm.A0h(userSession, str);
            if (A0h != null) {
                str3 = AbstractC25226BEj.A1G(A0h);
            }
            A0c.A0H("ranking_info_token", str3);
            A0c.A0P(null, EAS.class, C34753FSs.class, false);
            Object A00 = AbstractC31172DnG.A0U(A0c, true).A00(1187744550, this);
            if (A00 != c1jx) {
                A00 = C0eB.A00;
            }
            if (A00 == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PostPollRepository$votePoll$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
