package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.NZo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52831NZo extends OMQ {
    public AnonymousClass195 A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52831NZo(View view, AbstractC59962oe abstractC59962oe, UserSession userSession) {
        super(view, abstractC59962oe, userSession, EnumC142806cg.A05);
        C14360o3.A0B(userSession, 2);
        this.A01 = abstractC59962oe;
        this.A02 = userSession;
        C57558PgW c57558PgW = new C57558PgW(this, 39);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57558PgW(new C57558PgW(abstractC59962oe, 36), 37));
        this.A07 = AbstractC25225BEi.A0a(new C57558PgW(A00, 38), c57558PgW, C57530Pg4.A00(null, A00, 14), AbstractC25225BEi.A1D(C51018MgQ.class));
        this.A04 = C57558PgW.A01(view, 33);
        this.A03 = C57558PgW.A01(this, 32);
        this.A05 = C57558PgW.A01(this, 34);
        this.A06 = C57558PgW.A01(this, 35);
    }

    public static final void A00(View view, float f, float f2, int i) {
        AbstractC125325le A0E = AbstractC43592JPx.A0n(view).A0E(C55942hf.A03(1.0d, 35.0d));
        A0E.A04 = 0;
        A0E.A03 = i;
        A0E.A0M(f, f2);
        A0E.A0H();
    }

    @Override // X.OMQ
    public final void A05(Fragment fragment) {
        IgLiveViewerLikesViewModel igLiveViewerLikesViewModel;
        InterfaceC19390xP interfaceC19390xP;
        super.A05(fragment);
        InterfaceC09390do interfaceC09390do = this.A06;
        C51198Mji.A00((RecyclerView) interfaceC09390do.getValue(), this, 14);
        AbstractC010103p.A0B(AbstractC166987dD.A0d(interfaceC09390do), new C50827MdK(this, 4));
        RecyclerView recyclerView = (RecyclerView) interfaceC09390do.getValue();
        AbstractC59962oe abstractC59962oe = this.A01;
        C66392zG A0R = AbstractC31174DnI.A0R(abstractC59962oe);
        C14360o3.A0C(abstractC59962oe, "null cannot be cast to non-null type com.instagram.common.analytics.intf.AnalyticsModule");
        recyclerView.setAdapter(AbstractC31173DnH.A0R(A0R, new NFM(abstractC59962oe, this.A02)));
        AbstractC31174DnI.A17(abstractC59962oe.getContext(), (RecyclerView) interfaceC09390do.getValue(), false);
        RecyclerView recyclerView2 = (RecyclerView) interfaceC09390do.getValue();
        if (recyclerView2.A12.size() == 0) {
            recyclerView2.A10(new C51191MjZ(AbstractC167017dG.A04(abstractC59962oe.requireContext()), AbstractC166997dE.A0N(abstractC59962oe).getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material), AbstractC31177DnL.A02(abstractC59962oe, R.dimen.abc_edit_text_inset_top_material)));
        }
        if (this.A00 == null) {
            C51018MgQ A02 = A02();
            AnonymousClass195 anonymousClass195 = null;
            if ((A02 instanceof IgLiveViewerLikesViewModel) && (igLiveViewerLikesViewModel = (IgLiveViewerLikesViewModel) A02) != null && (interfaceC19390xP = igLiveViewerLikesViewModel.A09) != null) {
                anonymousClass195 = AbstractC50522MSa.A0s(abstractC59962oe, C57167PZl.A01(this, null, 19), interfaceC19390xP);
            }
            this.A00 = anonymousClass195;
        }
        Ok4.A00(AbstractC166987dD.A0d(this.A03), 47, this);
    }

    public static final void A01(C52831NZo c52831NZo, List list, InterfaceC16660sJ interfaceC16660sJ) {
        C51822MvQ c51822MvQ;
        String str;
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        ArrayList A0q = AbstractC167017dG.A0q(list);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            AbstractC53541Nm8 abstractC53541Nm8 = (AbstractC53541Nm8) obj;
            if (abstractC53541Nm8 instanceof NYT) {
                NYT nyt = (NYT) abstractC53541Nm8;
                String str2 = nyt.A02;
                long j = (i + 1) * 20;
                int i3 = nyt.A00;
                if (i3 != 0) {
                    str = AbstractC25228BEl.A0M(((OMQ) c52831NZo).A01).getString(i3);
                } else {
                    str = "";
                }
                C14360o3.A0A(str);
                c51822MvQ = new C51822MvQ(null, str2, null, null, null, str, interfaceC16660sJ, j);
            } else if (abstractC53541Nm8 instanceof NYU) {
                NYU nyu = (NYU) abstractC53541Nm8;
                c51822MvQ = new C51822MvQ(nyu.A01, null, nyu.A05, nyu.A06, nyu.A03, nyu.A04, interfaceC16660sJ, (i + 1) * 20);
            } else {
                c51822MvQ = new C51822MvQ(null, null, null, null, null, "", interfaceC16660sJ, (i + 1) * 20);
            }
            A0q.add(c51822MvQ);
            i = i2;
        }
        A0E.A01(A0q);
        InterfaceC09390do interfaceC09390do = c52831NZo.A06;
        RecyclerView recyclerView = (RecyclerView) interfaceC09390do.getValue();
        AbstractC59962oe abstractC59962oe = c52831NZo.A01;
        C66392zG A0R = AbstractC31174DnI.A0R(abstractC59962oe);
        C14360o3.A0C(abstractC59962oe, "null cannot be cast to non-null type com.instagram.common.analytics.intf.AnalyticsModule");
        recyclerView.setAdapter(AbstractC31173DnH.A0R(A0R, new NFM(abstractC59962oe, c52831NZo.A02)));
        C66362zD c66362zD = (C66362zD) ((RecyclerView) interfaceC09390do.getValue()).A0A;
        if (c66362zD != null) {
            c66362zD.A05(A0E);
        }
    }

    @Override // X.OMQ
    public final void A04() {
        super.A04();
        AnonymousClass195 anonymousClass195 = this.A00;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        this.A00 = null;
        AbstractC166987dD.A0d(this.A03).setOnClickListener(null);
        InterfaceC09390do interfaceC09390do = this.A06;
        ((RecyclerView) interfaceC09390do.getValue()).A0a();
        ((RecyclerView) interfaceC09390do.getValue()).setAdapter(null);
        ((RecyclerView) interfaceC09390do.getValue()).setLayoutManager(null);
    }
}
