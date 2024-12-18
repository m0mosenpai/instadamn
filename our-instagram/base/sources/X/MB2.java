package X;

import android.app.Activity;
import android.app.Application;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.creation.drafts.model.clips.ClipsDraftPreviewItemRepository;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "instagram.features.clips.launcher.ClipsDraftEditLauncher$launch$1", f = "ClipsDraftEditLauncher.kt", i = {}, l = {185}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class MB2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ Fragment A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ PendingRecipient A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MB2(Activity activity, Fragment fragment, UserSession userSession, PendingRecipient pendingRecipient, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A01 = activity;
        this.A03 = userSession;
        this.A05 = str;
        this.A02 = fragment;
        this.A04 = pendingRecipient;
        this.A08 = z;
        this.A07 = z2;
        this.A06 = str2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Activity activity = this.A01;
        UserSession userSession = this.A03;
        String str = this.A05;
        return new MB2(activity, this.A02, userSession, this.A04, str, this.A06, interfaceC23621Ds, this.A08, this.A07);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Object obj2 = obj;
        C1JX c1jx = C1JX.A02;
        try {
            if (this.A00 == 0) {
                AbstractC09560e7.A00(obj2);
                C2OW c2ow = ClipsDraftPreviewItemRepository.A09;
                Application application = this.A01.getApplication();
                C14360o3.A07(application);
                ClipsDraftPreviewItemRepository A00 = c2ow.A00(application, this.A03);
                String str = this.A05;
                this.A00 = 1;
                obj2 = A00.A02.A09(str, this);
                if (obj2 == c1jx) {
                    return c1jx;
                }
            } else {
                AbstractC09560e7.A00(obj2);
            }
            C9J0 c9j0 = (C9J0) obj2;
            if (c9j0 == null) {
                AbstractC183338Bg.A00(this.A03).A0O("ClipsDraftEditLauncher", "draft does not exist in the storage");
                return C0eB.A00;
            }
            C9JS c9js = c9j0.A03;
            if (c9js != null) {
                UserSession userSession = this.A03;
                Activity activity = this.A01;
                Fragment fragment = this.A02;
                PendingRecipient pendingRecipient = this.A04;
                boolean z = this.A08;
                boolean z2 = this.A07;
                L87 l87 = new L87(activity, fragment, userSession, pendingRecipient, new C6WQ(activity, true), this.A06, z, AbstractC167007dF.A1M(z2 ? 1 : 0));
                C14360o3.A0B(userSession, 0);
                L2A l2a = new L2A(userSession, l87);
                UserSession userSession2 = l2a.A00;
                C1DX A002 = C1DW.A00(userSession2);
                String str2 = c9js.A09;
                if (A002.A02(str2) == null) {
                    C45550KEp c45550KEp = new C45550KEp(c9j0, l2a);
                    C1ON A04 = AbstractC2044893h.A04(userSession2, str2);
                    A04.A00 = c45550KEp;
                    l2a.A01.schedule(A04);
                } else {
                    l2a.A02.A00(c9j0);
                }
            } else {
                UserSession userSession3 = this.A03;
                Activity activity2 = this.A01;
                Fragment fragment2 = this.A02;
                PendingRecipient pendingRecipient2 = this.A04;
                boolean z3 = this.A08;
                boolean z4 = this.A07;
                String str3 = this.A06;
                int ordinal = c9j0.A04.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    C11T.A03(new RunnableC57084PTx(activity2, fragment2, c9j0, userSession3, pendingRecipient2, str3, z4, z3));
                }
            }
            return C0eB.A00;
        } catch (AbstractC46326Kew e) {
            C0w9.A07("ClipsDraftEditLauncher", e);
            AbstractC183338Bg.A00(this.A03);
            throw AbstractC166987dD.A15("getMessage");
        } catch (Exception e2) {
            C0w9.A07("ClipsDraftEditLauncher", e2);
            C183348Bh A003 = AbstractC183338Bg.A00(this.A03);
            String A0q = AbstractC31173DnH.A0q(e2);
            C14360o3.A07(A0q);
            A003.A0O(A0q, e2.getMessage());
            throw e2;
        }
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MB2) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
