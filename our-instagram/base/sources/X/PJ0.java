package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.view.comments.adapter.IgLiveCommentsLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class PJ0 implements InterfaceC58172Pqc {
    public AnonymousClass195 A00;
    public final Context A01;
    public final View A02;
    public final RecyclerView A03;
    public final AbstractC59962oe A04;
    public final UserSession A05;
    public final C3I9 A06;
    public final C51169MjD A07;
    public final IgLiveCommentsLinearLayoutManager A08;
    public final AbstractC51025MgY A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final ValueAnimator A0C;
    public final ValueAnimator A0D;
    public final View A0E;
    public final InterfaceC11380iw A0F;

    public static final void A02(PJ0 pj0, boolean z) {
        RecyclerView recyclerView = pj0.A03;
        if (z) {
            recyclerView.A0o(0);
        } else {
            recyclerView.A0n(0);
        }
        pj0.A09.A03(A00(pj0), pj0.A08.A1a(), true, false, false);
    }

    public static boolean A03(AbstractC51025MgY abstractC51025MgY) {
        C05A c05a = abstractC51025MgY.A0D;
        c05a.Egh(new C51608Mr0(((C51608Mr0) c05a.getValue()).A01, 1, ((C51608Mr0) c05a.getValue()).A04, false, ((C51608Mr0) c05a.getValue()).A03));
        return true;
    }

    @Override // X.InterfaceC58172Pqc
    public /* synthetic */ void CvU() {
    }

    @Override // X.InterfaceC58172Pqc
    public /* synthetic */ void DHv(C56802PIt c56802PIt) {
    }

    @Override // X.InterfaceC58172Pqc
    public /* synthetic */ void DWD(C56802PIt c56802PIt) {
    }

    @Override // X.InterfaceC58172Pqc
    public /* synthetic */ void DYi(C56803PIu c56803PIu) {
    }

    @Override // X.InterfaceC58172Pqc
    public /* synthetic */ void E0R(C56802PIt c56802PIt) {
    }

    public static final void A01(C51688MsJ c51688MsJ, PJ0 pj0) {
        ValueAnimator valueAnimator;
        int i;
        RecyclerView recyclerView = pj0.A03;
        if (recyclerView.getScrollState() != 1) {
            if (c51688MsJ.A00) {
                valueAnimator = pj0.A0C;
                valueAnimator.removeAllUpdateListeners();
                valueAnimator.cancel();
                valueAnimator.setIntValues(recyclerView.getHeight(), pj0.A01.getResources().getDimensionPixelSize(R.dimen.avatar_sticker_max_height));
                i = 14;
            } else {
                valueAnimator = pj0.A0D;
                valueAnimator.removeAllUpdateListeners();
                valueAnimator.cancel();
                valueAnimator.setIntValues(recyclerView.getHeight(), pj0.A01.getResources().getDimensionPixelSize(R.dimen.iglive_expanded_comments_view_height));
                i = 15;
            }
            C55241OfD.A01(valueAnimator, pj0, i);
            valueAnimator.setDuration(200L);
            valueAnimator.start();
        }
    }

    public final boolean A04() {
        AbstractC51025MgY abstractC51025MgY = this.A09;
        boolean A03 = A03(abstractC51025MgY);
        PZE.A02(abstractC51025MgY, AbstractC141776au.A00(abstractC51025MgY), 39);
        return A03;
    }

    public final boolean A05() {
        AbstractC51025MgY abstractC51025MgY = this.A09;
        boolean A03 = A03(abstractC51025MgY);
        PZE.A02(abstractC51025MgY, AbstractC141776au.A00(abstractC51025MgY), 40);
        return A03;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.3Fe, androidx.recyclerview.widget.LinearLayoutManager, com.instagram.video.live.mvvm.view.comments.adapter.IgLiveCommentsLinearLayoutManager] */
    public PJ0(View view, AbstractC59962oe abstractC59962oe, UserSession userSession, EnumC142806cg enumC142806cg, AbstractC51025MgY abstractC51025MgY) {
        this.A04 = abstractC59962oe;
        this.A05 = userSession;
        this.A0E = view;
        this.A09 = abstractC51025MgY;
        Context requireContext = abstractC59962oe.requireContext();
        this.A01 = requireContext;
        this.A0F = abstractC59962oe;
        this.A02 = AbstractC166997dE.A0S(view, R.id.iglive_reactions_comments);
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(view, R.id.iglive_comment_list);
        this.A03 = recyclerView;
        this.A0B = C57547PgL.A00(this, 2);
        this.A0A = C57547PgL.A00(this, 1);
        C51169MjD c51169MjD = new C51169MjD(requireContext, abstractC59962oe, userSession, enumC142806cg, this, new O64(userSession), AbstractC25235BEs.A0S(abstractC59962oe));
        this.A07 = c51169MjD;
        ?? linearLayoutManager = new LinearLayoutManager(view.getContext(), 1, true);
        this.A08 = linearLayoutManager;
        this.A0D = ValueAnimator.ofInt(requireContext.getResources().getDimensionPixelSize(R.dimen.avatar_sticker_max_height), requireContext.getResources().getDimensionPixelSize(R.dimen.iglive_expanded_comments_view_height));
        this.A0C = ValueAnimator.ofInt(AbstractC166997dE.A04(requireContext, R.dimen.iglive_expanded_comments_view_height), AbstractC166997dE.A04(requireContext, R.dimen.avatar_sticker_max_height));
        C3I8 A01 = C3I7.A01(this, false, false);
        this.A06 = A01;
        c51169MjD.registerAdapterDataObserver(new UH2(this, 6));
        recyclerView.setAdapter(c51169MjD);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setOverScrollMode(2);
        recyclerView.setItemAnimator(null);
        recyclerView.setVisibility(0);
        recyclerView.A14(new C51199Mjj(this));
        recyclerView.setVerticalFadingEdgeEnabled(true);
        recyclerView.setFadingEdgeLength(AbstractC25228BEl.A0M(recyclerView).getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height));
        A01.A9e(new C56177Owk(this, 12));
    }

    public static final ArrayList A00(PJ0 pj0) {
        String pk;
        ArrayList A1E = AbstractC166987dD.A1E();
        IgLiveCommentsLinearLayoutManager igLiveCommentsLinearLayoutManager = pj0.A08;
        int A1a = igLiveCommentsLinearLayoutManager.A1a();
        int A1b = igLiveCommentsLinearLayoutManager.A1b();
        if (A1a <= A1b) {
            while (true) {
                C51169MjD c51169MjD = pj0.A07;
                if (A1a > -1) {
                    List list = c51169MjD.A07;
                    if (A1a < list.size()) {
                        InterfaceC58171Pqb interfaceC58171Pqb = (InterfaceC58171Pqb) list.get(C51169MjD.A00(c51169MjD, A1a));
                        if ((interfaceC58171Pqb instanceof C56803PIu) && interfaceC58171Pqb != null && (pk = interfaceC58171Pqb.getPk()) != null) {
                            A1E.add(pk);
                        }
                    }
                }
                if (A1a == A1b) {
                    break;
                }
                A1a++;
            }
        }
        return A1E;
    }
}
