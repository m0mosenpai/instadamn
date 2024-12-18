package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.creation.drafts.model.clips.ClipsDraftPreviewItemRepository;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository;
import com.instagram.share.facebook.upsell.api.CLNoticeApi;

/* loaded from: classes4.dex */
public final class B5c extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final int A02 = 1;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;
    public final boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B5c(Activity activity, C22P c22p, UserSession userSession, C5JK c5jk, PendingRecipient pendingRecipient, String str, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A03 = activity;
        this.A06 = userSession;
        this.A07 = str;
        this.A04 = c5jk;
        this.A01 = pendingRecipient;
        this.A05 = c22p;
        this.A08 = z;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A02 != 0) {
            Activity activity = (Activity) this.A03;
            UserSession userSession = (UserSession) this.A06;
            String str = this.A07;
            return new B5c(activity, (C22P) this.A05, userSession, (C5JK) this.A04, (PendingRecipient) this.A01, str, interfaceC23621Ds, this.A08);
        }
        C15370ps c15370ps = (C15370ps) this.A05;
        C200018t5 c200018t5 = (C200018t5) this.A06;
        return new B5c((Activity) this.A03, (ImmutableList) this.A04, c200018t5, this.A07, interfaceC23621Ds, c15370ps, this.A08);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C15370ps c15370ps;
        C9BE c9be;
        Object obj2 = obj;
        if (this.A02 != 0) {
            C1JX c1jx = C1JX.A02;
            try {
                if (this.A00 == 0) {
                    AbstractC09560e7.A00(obj2);
                    C2OW c2ow = ClipsDraftPreviewItemRepository.A09;
                    Application application = ((Activity) this.A03).getApplication();
                    C14360o3.A07(application);
                    ClipsDraftPreviewItemRepository A00 = c2ow.A00(application, (UserSession) this.A06);
                    String str = this.A07;
                    this.A00 = 1;
                    obj2 = A00.A02.A09(str, this);
                    if (obj2 == c1jx) {
                        return c1jx;
                    }
                } else {
                    AbstractC09560e7.A00(obj2);
                }
                C9J0 c9j0 = (C9J0) obj2;
                if (c9j0 != null) {
                    C5JK c5jk = (C5JK) this.A04;
                    if (c5jk == null) {
                        c5jk = C5JK.A05;
                    }
                    C9JS c9js = c9j0.A03;
                    UserSession userSession = (UserSession) this.A06;
                    if (c9js != null) {
                        String str2 = c9js.A09;
                        C22P c22p = (C22P) this.A05;
                        AbstractC46690Kl9.A00(userSession, new C42399Iq0((Activity) this.A03, c22p, userSession, c5jk, (PendingRecipient) this.A01, this.A07, this.A08), str2);
                    } else {
                        Activity activity = (Activity) this.A03;
                        String str3 = this.A07;
                        C11T.A03(new RunnableC43159J5w(activity, (C22P) this.A05, userSession, c5jk, (PendingRecipient) this.A01, str3, this.A08));
                    }
                } else {
                    AbstractC183338Bg.A00((UserSession) this.A06).A0O(AbstractC43591JPw.A00(565), AbstractC43591JPw.A00(351));
                }
            } catch (Exception e) {
                C183348Bh A002 = AbstractC183338Bg.A00((UserSession) this.A06);
                String simpleName = e.getClass().getSimpleName();
                C14360o3.A07(simpleName);
                A002.A0O(simpleName, e.getMessage());
                throw e;
            }
        } else {
            C1JX c1jx2 = C1JX.A02;
            if (this.A00 != 0) {
                c15370ps = (C15370ps) this.A01;
                AbstractC09560e7.A00(obj2);
            } else {
                AbstractC09560e7.A00(obj2);
                c15370ps = (C15370ps) this.A05;
                CLNoticeApi cLNoticeApi = CLNoticeApi.A00;
                C200018t5 c200018t5 = (C200018t5) this.A06;
                UserSession userSession2 = c200018t5.A00;
                ImmutableList immutableList = (ImmutableList) this.A04;
                C14360o3.A0A(immutableList);
                C2JO A01 = C200088tD.A00.A01(((Context) this.A03).getApplicationContext(), userSession2, this.A07);
                C200028t6 c200028t6 = c200018t5.A02;
                CXPNoticeStateRepository cXPNoticeStateRepository = c200018t5.A01;
                boolean z = this.A08;
                if (z) {
                    c9be = AbstractC200098tE.A00(userSession2);
                } else {
                    c9be = null;
                }
                this.A01 = c15370ps;
                this.A00 = 1;
                obj2 = cLNoticeApi.A01(A01, c9be, immutableList, userSession2, cXPNoticeStateRepository, c200028t6, this, z, false);
                if (obj2 == c1jx2) {
                    return c1jx2;
                }
            }
            c15370ps.A00 = obj2;
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((B5c) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B5c(Activity activity, ImmutableList immutableList, C200018t5 c200018t5, String str, InterfaceC23621Ds interfaceC23621Ds, C15370ps c15370ps, boolean z) {
        super(2, interfaceC23621Ds);
        this.A05 = c15370ps;
        this.A06 = c200018t5;
        this.A04 = immutableList;
        this.A03 = activity;
        this.A07 = str;
        this.A08 = z;
    }
}
