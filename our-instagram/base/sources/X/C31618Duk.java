package X;

import android.graphics.RectF;
import android.view.View;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.request.graphql.IGDirectDismissMessageSuggestionMutationResponseImpl;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Duk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31618Duk implements InterfaceC132405yL {
    public final /* synthetic */ JR2 A00;

    @Override // X.InterfaceC132405yL
    public final /* synthetic */ void CkK(DirectSearchResult directSearchResult, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // X.InterfaceC132405yL
    public final /* synthetic */ void CkL(View view, DirectSearchResult directSearchResult, int i, int i2, int i3, int i4) {
    }

    @Override // X.InterfaceC132405yL
    public final void D9q(DirectShareTarget directShareTarget) {
    }

    @Override // X.InterfaceC132405yL
    public final void DAs(DirectShareTarget directShareTarget) {
        C14360o3.A0B(directShareTarget, 0);
        JR2 jr2 = this.A00;
        C18A A00 = AnonymousClass189.A00(jr2.A0p());
        User user = (User) A00.A02.get(directShareTarget.A0A());
        if (user != null) {
            UserSession A0p = jr2.A0p();
            String id = user.getId();
            C14360o3.A0B(A0p, 0);
            C40701ud A01 = AbstractC40691uc.A01(A0p);
            C2JM A0b = AbstractC25225BEi.A0b();
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25233BEq.A0H(AbstractC25227BEk.A0T(GraphQlCallInput.A02, id, "target_id"), A0b, "data"), "IGDirectDismissMessageSuggestionMutation", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), IGDirectDismissMessageSuggestionMutationResponseImpl.class, true, null, 0, null, "xdt_async_message_suggestion_dismiss", AbstractC166987dD.A1E());
            A01.ATV(C35821Frx.A00, C35849FsP.A00, pandoGraphQLRequest);
            C43626JRj A0q = jr2.A0q();
            C43970JcJ c43970JcJ = A0q.A0E;
            ArrayList A0U = AbstractC001800i.A0U(c43970JcJ.A0N);
            A0U.removeIf(new C31424DrU(5, new C50359MLl(user, 39)));
            c43970JcJ.A0N = A0U;
            C43626JRj.A03(A0q);
        }
    }

    @Override // X.InterfaceC132405yL
    public final void Dld(C31446Drq c31446Drq, DirectSearchResult directSearchResult, String str, int i, int i2, int i3, int i4, int i5) {
        AbstractC167017dG.A1S(directSearchResult, str);
        if (directSearchResult instanceof DirectShareTarget) {
            DirectShareTarget directShareTarget = (DirectShareTarget) directSearchResult;
            DirectThreadKey A00 = directShareTarget.A00();
            JR2 jr2 = this.A00;
            if (!((C31594DuM) jr2.A2U.getValue()).A00(jr2.A1L, new G76(c31446Drq, jr2, directShareTarget, A00, str), A00, str)) {
                JR2.A0G(c31446Drq, jr2, directShareTarget, A00, str);
            }
        }
    }

    @Override // X.InterfaceC132405yL
    public final void Dqm(View view) {
    }

    public C31618Duk(JR2 jr2) {
        this.A00 = jr2;
    }

    @Override // X.InterfaceC132405yL
    public final void Dle(RectF rectF, View view, C31446Drq c31446Drq, DirectShareTarget directShareTarget, String str, List list, boolean z, boolean z2) {
        AbstractC167027dH.A12(directShareTarget, str, list);
        AbstractC167017dG.A1S(rectF, c31446Drq);
        C14360o3.A0B(view, 7);
        C3o9 A02 = directShareTarget.A02();
        if (A02 != null) {
            JR2 jr2 = this.A00;
            C31659DvP.A00(rectF, view, c31446Drq, (C31659DvP) jr2.A28.getValue(), null, jr2.A0u(), null, directShareTarget, A02, str, null, list, z, z2);
        }
    }

    @Override // X.InterfaceC132405yL
    public final void DpP(C31446Drq c31446Drq, DirectSearchResult directSearchResult, Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView, int i, int i2, int i3, int i4, int i5) {
        C0w9.A01.EmN(AbstractC43591JPw.A00(589), "Story ring should not be accessible here.");
    }

    @Override // X.InterfaceC132405yL
    public final void Dqk(View view, C31446Drq c31446Drq, DirectSearchResult directSearchResult, String str, int i, int i2, int i3, int i4, boolean z) {
        AbstractC167017dG.A1N(directSearchResult, str);
        C14360o3.A0B(view, 6);
        if (directSearchResult instanceof DirectShareTarget) {
            DirectShareTarget directShareTarget = (DirectShareTarget) directSearchResult;
            String str2 = null;
            if (str.equals("inbox_suggestion")) {
                JR2 jr2 = this.A00;
                if (jr2.A1a.add(directShareTarget)) {
                    if (!C14360o3.A0K(jr2.A0t(), C47062Du.A00) && directShareTarget.A01 != 29) {
                        UserSession A0p = jr2.A0p();
                        AbstractC59962oe abstractC59962oe = jr2.A1L;
                        C14360o3.A0B(A0p, 0);
                        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(AbstractC12220kQ.A01(abstractC59962oe, A0p), "direct_suggested_recipient_impression"), 150);
                        A0A.A0R(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "DIRECT");
                        ((AbstractC02600Aj) A0A).A00.A9T("e_counter_channel", "");
                        Long A0V = AbstractC31171DnF.A0V(i2);
                        A0A.A0Q("relative_position", A0V);
                        A0A.A0Q("position", A0V);
                        List A0f = AbstractC31175DnJ.A0f(directShareTarget);
                        ArrayList A0q = AbstractC167017dG.A0q(A0f);
                        Iterator it = A0f.iterator();
                        while (it.hasNext()) {
                            A0q.add(C4SX.A00(AbstractC31176DnK.A0s(it)).A00);
                        }
                        A0A.A0S("recipient_ids", A0q);
                        A0A.A0R("section_type", "suggested");
                        A0A.A0O("is_recent_thread", false);
                        A0A.A0R("inventory_source", null);
                        if (AbstractC31176DnK.A00(directShareTarget) == 1) {
                            A0A.A0Q("a_pk", C4SX.A00(AbstractC31178DnM.A0R(directShareTarget, 0).getId()).A00);
                        }
                        InterfaceC83713oG A0O = AbstractC31171DnF.A0O(directShareTarget);
                        if (A0O instanceof C83693oE) {
                            A0A.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, ((C83693oE) A0O).A00);
                        }
                        A0A.Cht();
                    } else {
                        C5e4 c5e4 = jr2.A0K;
                        if (c5e4 != null) {
                            str2 = c5e4.A03(AbstractC111324zv.A00(108));
                        }
                        F3T.A00(jr2.A0p()).A0B(directShareTarget, str2, str, i3);
                    }
                    JR2.A0E(view, this.A00);
                }
            }
            if (str.equals("inbox_channel_invitation")) {
                JR2 jr22 = this.A00;
                if (jr22.A1a.add(directShareTarget)) {
                    F3T.A00(jr22.A0p()).A0B(directShareTarget, null, str, i4);
                }
            }
            JR2.A0E(view, this.A00);
        }
    }

    @Override // X.InterfaceC132405yL
    public final void Dql(RectF rectF, C22P c22p, DirectShareTarget directShareTarget) {
        AbstractC167027dH.A12(directShareTarget, rectF, c22p);
        C3o9 A02 = directShareTarget.A02();
        if (A02 != null) {
            JR2.A0A(rectF, c22p, this.A00, directShareTarget, A02);
        }
    }
}
