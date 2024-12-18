package X;

import X.AbstractC187378Sf;
import X.AbstractC51134Mid;
import X.C14360o3;
import X.C3F5;
import X.C52408NHe;
import X.C56050OuP;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.LruCache;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.CustomScrollingLinearLayoutManager;
import com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OuP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56050OuP implements InterfaceC60602pj, InterfaceC184998Io, C8R6 {
    public int A00;
    public int A01;
    public int A02;
    public AnimatorSet A03;
    public View A04;
    public RecyclerView A05;
    public CustomScrollingLinearLayoutManager A06;
    public C51200Mjk A07;
    public C55590OmT A08;
    public AbstractC187378Sf A09;
    public C0YS A0A;
    public final int A0B;
    public final int A0C;
    public final AbstractC59962oe A0D;
    public final AbstractC59962oe A0E;
    public final UserSession A0F;
    public final UserSession A0G;
    public final C56046OuK A0H;
    public final C56046OuK A0I;
    public final C52408NHe A0J;
    public final InterfaceC58114Ppd A0K;
    public final C51096Mhw A0L;
    public final AbstractC51134Mid A0M;
    public final ClipsCreationViewModel A0N;
    public final C89P A0O;
    public final C187418Sj A0P;
    public final C187358Sd A0Q;
    public final C183298Bb A0R;
    public final C183298Bb A0S;
    public final InterfaceC58281PsZ A0T;
    public final C56038OuA A0U;
    public final ClipsTimelineEditorConfig A0V;
    public final C5JK A0W;

    public C56050OuP(AbstractC59962oe abstractC59962oe, UserSession userSession, C56046OuK c56046OuK, InterfaceC58281PsZ interfaceC58281PsZ, C56038OuA c56038OuA, C52408NHe c52408NHe, ClipsTimelineEditorConfig clipsTimelineEditorConfig, C187418Sj c187418Sj, C187358Sd c187358Sd, C5JK c5jk, C183298Bb c183298Bb, int i) {
        C14360o3.A0B(userSession, 2);
        AbstractC25229BEm.A1J(c5jk, 8, clipsTimelineEditorConfig);
        this.A0D = abstractC59962oe;
        this.A0F = userSession;
        this.A0M = c52408NHe;
        this.A0Q = c187358Sd;
        this.A0P = c187418Sj;
        this.A0B = i;
        this.A0H = c56046OuK;
        FragmentActivity requireActivity = abstractC59962oe.requireActivity();
        ClipsCreationViewModel clipsCreationViewModel = (ClipsCreationViewModel) new C52942bb(requireActivity).A00(ClipsCreationViewModel.class);
        this.A0N = clipsCreationViewModel;
        this.A0O = MSZ.A0X(new C89O(requireActivity, userSession), requireActivity);
        AbstractC31180DnO.A1F(abstractC59962oe, clipsCreationViewModel.A0G, C57747Pja.A00(this, 29), 60);
        C56282Oyt c56282Oyt = new C56282Oyt(this);
        this.A0K = c56282Oyt;
        this.A0L = new C51096Mhw(userSession, c56282Oyt, clipsCreationViewModel, c187358Sd);
        this.A0E = abstractC59962oe;
        this.A0G = userSession;
        this.A0R = c183298Bb;
        this.A0T = interfaceC58281PsZ;
        this.A0J = c52408NHe;
        this.A0W = c5jk;
        this.A0C = i;
        this.A0V = clipsTimelineEditorConfig;
        this.A0U = c56038OuA;
        this.A0I = c56046OuK;
        C183298Bb A01 = ((C87G) AbstractC31175DnJ.A0A(abstractC59962oe).A00(C87G.class)).A01("post_capture");
        this.A0S = A01;
        this.A02 = -1;
        this.A01 = -1;
        AbstractC31180DnO.A1F(abstractC59962oe, A01.A07, new BAO(43, c187358Sd, this), 61);
        C52408NHe c52408NHe2 = (C52408NHe) this.A0M;
        if (c52408NHe2 != null) {
            c52408NHe2.A04 = this;
            c52408NHe2.A02 = new O26(this);
            c52408NHe2.A06 = C57747Pja.A00(this, 30);
        }
        c52408NHe.A07 = C57747Pja.A00(this, 31);
        c56046OuK.A03 = new BAO(44, c187358Sd, this);
        this.A0A = MSW.A1E(this, 16);
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC184998Io
    public final /* synthetic */ void E2A(float f) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        this.A04 = view.findViewById(R.id.active_thumbnail_indicator);
        this.A05 = AbstractC31172DnG.A0G(view, R.id.clips_editor_video_track_recyclerview);
        final Context context = view.getContext();
        this.A06 = new CustomScrollingLinearLayoutManager(context) { // from class: com.instagram.creation.capture.quickcapture.sundial.edit.ThumbnailTrayController$onViewCreated$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
            public final void A1S(C3F5 c3f5) {
                C14360o3.A0B(c3f5, 0);
                super.A1S(c3f5);
                C56050OuP c56050OuP = this;
                AbstractC51134Mid abstractC51134Mid = c56050OuP.A0M;
                AbstractC187378Sf A0E = c56050OuP.A0Q.A0E();
                if (A0E != null) {
                    ((C52408NHe) abstractC51134Mid).A07.invoke(A0E);
                }
            }
        };
        RecyclerView recyclerView = this.A05;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(A02());
            recyclerView.setAdapter(this.A0M);
            recyclerView.setItemAnimator(null);
            C55590OmT c55590OmT = new C55590OmT(recyclerView, new C56297OzI(recyclerView, this), false, false);
            this.A08 = c55590OmT;
            recyclerView.A12(c55590OmT);
            View view2 = this.A04;
            if (view2 != null) {
                C51200Mjk c51200Mjk = new C51200Mjk(view2);
                recyclerView.A14(c51200Mjk);
                this.A07 = c51200Mjk;
            }
            if (this.A0B == 2) {
                new C8SB(this.A0L).A0A(recyclerView);
            }
        }
        AbstractC59962oe abstractC59962oe = this.A0D;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57160PZe(viewLifecycleOwner, c07s, this, (InterfaceC23621Ds) null, 25), C07Y.A00(viewLifecycleOwner));
        InterfaceC58281PsZ interfaceC58281PsZ = this.A0T;
        interfaceC58281PsZ.Ecd(new ViewOnClickListenerC55460OkF(this, 16));
        interfaceC58281PsZ.ESO(new ViewOnClickListenerC55460OkF(this, 17));
        if (this.A0W == C5JK.A06) {
            this.A0Q.A0G(new C52410NHg(0, false));
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final void A00(C56050OuP c56050OuP, AbstractC187378Sf abstractC187378Sf) {
        int i;
        RecyclerView recyclerView = c56050OuP.A05;
        if (recyclerView != null) {
            Context A0L = AbstractC166997dE.A0L(recyclerView);
            int A0B = AbstractC167017dG.A0B(A0L);
            int A08 = AbstractC167017dG.A08(A0L);
            if ((abstractC187378Sf instanceof C187368Se) && !((C187368Se) abstractC187378Sf).A00) {
                int size = ((AbstractC51134Mid) c56050OuP.A0J).A03.size();
                Resources resources = recyclerView.getResources();
                if ((A0B * 2) + A08 + (size * (resources.getDimensionPixelSize(R.dimen.action_button_settings_height) + (AbstractC166997dE.A07(resources) * 2))) < AbstractC167007dF.A0K(A0L).widthPixels) {
                    A0B = A08;
                    i = 0;
                    recyclerView.setPadding(A0B, 0, i, 0);
                }
            } else {
                A0B = recyclerView.getPaddingStart();
            }
            i = A0B;
            recyclerView.setPadding(A0B, 0, i, 0);
        }
    }

    public static final void A01(C56050OuP c56050OuP, C84B c84b) {
        List list;
        ArrayList A1E;
        AbstractC53445NkY c52427NHx;
        AbstractC53445NkY c52429NHz;
        int i;
        AbstractC51134Mid abstractC51134Mid = c56050OuP.A0M;
        List list2 = abstractC51134Mid.A03;
        list2.clear();
        ArrayList A05 = c84b.A05();
        C89P c89p = c56050OuP.A0O;
        InterfaceC110214xq interfaceC110214xq = c89p.A04;
        if (interfaceC110214xq != null) {
            list = interfaceC110214xq.BsT();
        } else {
            list = null;
        }
        boolean z = c89p.A0F;
        if (list == null) {
            A1E = AbstractC167017dG.A0q(A05);
            Iterator it = A05.iterator();
            while (it.hasNext()) {
                A1E.add(new C52429NHz((C115475Kh) it.next()));
            }
        } else {
            A1E = AbstractC166987dD.A1E();
            int i2 = 0;
            Iterator it2 = A05.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                C115475Kh c115475Kh = (C115475Kh) next;
                int A06 = AbstractC25227BEk.A06(c115475Kh.A0H, i2);
                for (int size = A1E.size(); size < A06; size++) {
                    if (size < list.size()) {
                        c52429NHz = new C52427NHx(new C51593Mql(size, ((InterfaceC110074xc) list.get(size)).getDurationInMs(), 1));
                    } else {
                        AbstractC12120kG.A07("TimelineTraySegmentUtil", "More selected segments than allowed in Templates", null);
                        c52429NHz = new C52429NHz(c115475Kh);
                    }
                    A1E.add(c52429NHz);
                }
                A1E.add(new C52429NHz(c115475Kh));
                i2 = i3;
            }
            int size2 = list.size();
            for (int size3 = A1E.size(); size3 < size2; size3++) {
                C51593Mql c51593Mql = new C51593Mql(size3, ((InterfaceC110074xc) list.get(size3)).getDurationInMs(), 1);
                if (AbstractC189168Zk.A03((InterfaceC110074xc) list.get(size3)) && !z) {
                    c52427NHx = new C52428NHy(c51593Mql);
                } else {
                    c52427NHx = new C52427NHx(c51593Mql);
                }
                A1E.add(c52427NHx);
            }
        }
        list2.addAll(A1E);
        LruCache lruCache = (LruCache) c56050OuP.A0S.A07.A02();
        if (lruCache != null) {
            c56050OuP.A0J.A07(lruCache);
        }
        AbstractC187378Sf A0E = c56050OuP.A0Q.A0E();
        if (A0E instanceof AbstractC187488Sq) {
            i = ((AbstractC187488Sq) A0E).getSegmentIndex();
        } else {
            if (!(A0E instanceof C187538Sv)) {
                i = -2;
            }
            abstractC51134Mid.notifyDataSetChanged();
        }
        abstractC51134Mid.A03(i);
        abstractC51134Mid.notifyDataSetChanged();
    }

    public final CustomScrollingLinearLayoutManager A02() {
        CustomScrollingLinearLayoutManager customScrollingLinearLayoutManager = this.A06;
        if (customScrollingLinearLayoutManager != null) {
            return customScrollingLinearLayoutManager;
        }
        C14360o3.A0F("scrollingLinearLayoutManager");
        throw C00O.createAndThrow();
    }

    public final C84B A03() {
        C84B A0N;
        ClipsCreationViewModel clipsCreationViewModel = this.A0N;
        if (clipsCreationViewModel.A0s() || (A0N = MSY.A0N(clipsCreationViewModel)) == null) {
            return new C84B(C16930sl.A00, false);
        }
        return A0N;
    }

    public final FilmstripTimelineView A04() {
        C3OO A0V;
        C51369MmU c51369MmU;
        RecyclerView recyclerView = this.A05;
        if (recyclerView == null || (A0V = recyclerView.A0V(this.A00)) == null || !(A0V instanceof C51369MmU) || (c51369MmU = (C51369MmU) A0V) == null) {
            return null;
        }
        return c51369MmU.A09;
    }

    public final void A05() {
        C84B c84b;
        int A02;
        C115475Kh c115475Kh;
        C87J A0P = MSX.A0P(this.A0H.A07);
        if (A0P != null) {
            int CFM = A0P.CFM();
            if (Integer.valueOf(CFM) != null) {
                ClipsCreationViewModel clipsCreationViewModel = this.A0N;
                if (clipsCreationViewModel.A0s() || (c84b = MSW.A0W(clipsCreationViewModel.A0F)) == null) {
                    c84b = new C84B(C16930sl.A00, false);
                }
                if (CFM >= c84b.A00) {
                    A02 = AbstractC25226BEj.A05(c84b.A01);
                } else if (CFM == 0 && AbstractC189168Zk.A04(c84b)) {
                    A02 = -1;
                } else {
                    A02 = c84b.A02(CFM);
                    Object A0O = AbstractC001800i.A0O(c84b.A05(), A02);
                    if ((A0O instanceof C115475Kh) && (c115475Kh = (C115475Kh) A0O) != null) {
                        A02 = AbstractC25227BEk.A06(c115475Kh.A0H, A02);
                    }
                }
                if (this.A00 != A02 && A02 != -1) {
                    if (this.A0Q.A0E() instanceof C187368Se) {
                        C51200Mjk c51200Mjk = this.A07;
                        if (c51200Mjk != null) {
                            float f = ((A02 * r1) + (c51200Mjk.A02 / 2.0f)) - c51200Mjk.A01;
                            float translationX = c51200Mjk.A04.getTranslationX() + c51200Mjk.A00;
                            ValueAnimator valueAnimator = c51200Mjk.A03;
                            valueAnimator.setFloatValues(translationX, f);
                            valueAnimator.start();
                        }
                        RecyclerView recyclerView = this.A05;
                        if (recyclerView != null) {
                            recyclerView.A0o((A02 * 2) + 1);
                        }
                    }
                    this.A00 = A02;
                    C52408NHe c52408NHe = (C52408NHe) this.A0M;
                    int i = c52408NHe.A00;
                    c52408NHe.A00 = A02;
                    c52408NHe.notifyItemChanged((i * 2) + 1);
                    c52408NHe.notifyItemChanged((A02 * 2) + 1);
                }
            }
        }
    }

    @Override // X.C8R6
    public final void Djw(float f) {
        int i;
        C87H c87h = this.A0I.A07;
        C87J A0P = MSX.A0P(c87h);
        if (A0P != null) {
            i = A0P.Bdt();
        } else {
            i = 0;
        }
        c87h.A06((int) (f * i));
    }

    @Override // X.InterfaceC184998Io
    public final void Djx(float f) {
        float A01;
        C187358Sd c187358Sd = this.A0Q;
        AbstractC187378Sf A0E = c187358Sd.A0E();
        if (A0E instanceof AbstractC187488Sq) {
            if (MSW.A0V(A03(), ((AbstractC187488Sq) A0E).getSegmentIndex()) == null) {
                c187358Sd.A0G(new C187368Se(false));
                return;
            }
            C56046OuK c56046OuK = this.A0I;
            C87H c87h = c56046OuK.A07;
            if (c56046OuK.A06.A0I()) {
                A01 = r4.A0G.A03 + (f * AbstractC54865OOa.A00(r4));
            } else if (!C56046OuK.A03(c56046OuK)) {
                return;
            } else {
                A01 = (C56046OuK.A00(c56046OuK).A01(c56046OuK.A00) + (f * AbstractC54865OOa.A00(r4))) - r4.A09;
            }
            c87h.A06((int) A01);
        }
    }

    @Override // X.C8R6
    public final void DuI() {
        C56046OuK c56046OuK = this.A0I;
        if (c56046OuK.A04) {
            c56046OuK.A07.A03();
        }
    }

    @Override // X.InterfaceC184998Io
    public final void DuJ(boolean z) {
        FilmstripTimelineView A04;
        C3OO A0V;
        EnumC114925Hg enumC114925Hg;
        if (z) {
            RecyclerView recyclerView = this.A05;
            if (recyclerView != null && (A0V = recyclerView.A0V(this.A00)) != null && (A0V instanceof C51369MmU)) {
                AbstractC187378Sf A0E = this.A0Q.A0E();
                if (A0E instanceof AbstractC187488Sq) {
                    C115475Kh A0V2 = MSW.A0V(A03(), ((AbstractC187488Sq) A0E).getSegmentIndex());
                    if (A0V2 != null) {
                        FilmstripTimelineView filmstripTimelineView = ((C51369MmU) A0V).A09;
                        int A01 = AbstractC54865OOa.A01(A0V2, filmstripTimelineView.A0A.getLeftTrimmerValue());
                        int A012 = AbstractC54865OOa.A01(A0V2, filmstripTimelineView.getRightTrimmerPosition());
                        int i = this.A00 / 2;
                        ClipsCreationViewModel clipsCreationViewModel = this.A0N;
                        ClipsCreationViewModel.A03(EnumC191648eM.A0g, clipsCreationViewModel, true);
                        if (ClipsCreationViewModel.A05(clipsCreationViewModel, i, A01, A012)) {
                            C22C A013 = AnonymousClass229.A01(this.A0G);
                            if (this.A0W == C5JK.A06) {
                                enumC114925Hg = EnumC114925Hg.FEED;
                            } else {
                                enumC114925Hg = null;
                            }
                            A013.A0x(enumC114925Hg, A01, A012, A0V2.A0G.A0F.hashCode());
                            C84B A0N = MSY.A0N(clipsCreationViewModel);
                            if (A0N != null && A0N.A00 > 90000) {
                                clipsCreationViewModel.A0K.A05();
                                C9GR.A01(this.A0E.requireContext(), "clips_music_unavailable_for_long_video", 2131955574, 0);
                            }
                        }
                        this.A0I.A07.A08(A01, A012);
                    } else {
                        return;
                    }
                }
            }
            if (this.A0O.A04 == null && (A04 = A04()) != null) {
                A04.setShowSeekbar(true);
            }
            ArgbEvaluator argbEvaluator = AbstractC125325le.A0b;
            C187358Sd c187358Sd = this.A0Q;
            MSX.A1A(c187358Sd.A07, new Object());
            c187358Sd.A04 = false;
            AbstractC187378Sf A0E2 = c187358Sd.A0E();
            if (A0E2 instanceof C52410NHg) {
                c187358Sd.A0G(new C52410NHg(((C52410NHg) A0E2).A00, c187358Sd.A04));
            }
            C187358Sd.A00(c187358Sd);
        }
        C56046OuK c56046OuK = this.A0I;
        if (c56046OuK.A04) {
            c56046OuK.A07.A03();
        }
    }

    @Override // X.C8R6
    public final void DuK() {
        this.A0I.A04();
    }

    @Override // X.InterfaceC184998Io
    public final void DuL(boolean z) {
        this.A0I.A04();
        if (z) {
            FilmstripTimelineView A04 = A04();
            if (A04 != null) {
                A04.setShowSeekbar(false);
            }
            C187358Sd c187358Sd = this.A0Q;
            MSX.A1A(c187358Sd.A07, new Object());
            c187358Sd.A04 = true;
            AbstractC187378Sf A0E = c187358Sd.A0E();
            if (A0E instanceof C52410NHg) {
                c187358Sd.A0G(new C52410NHg(((C52410NHg) A0E).A00, c187358Sd.A04));
            }
            C187358Sd.A00(c187358Sd);
        }
    }

    @Override // X.InterfaceC184998Io
    public final void DOn(float f, float f2) {
        Djx(f);
        C115475Kh A0V = MSW.A0V(A03(), this.A00 / 2);
        if (A0V != null) {
            C187358Sd c187358Sd = this.A0Q;
            c187358Sd.A0F(AbstractC54865OOa.A01(A0V, f), C05F.A00);
            c187358Sd.A0F(AbstractC54865OOa.A01(A0V, f2), C05F.A01);
        }
    }

    @Override // X.InterfaceC184998Io
    public final void DOp(float f) {
        Djx(f);
        C115475Kh A0V = MSW.A0V(A03(), this.A00 / 2);
        if (A0V != null) {
            this.A0Q.A0F(AbstractC54865OOa.A01(A0V, f), C05F.A00);
        }
    }

    @Override // X.InterfaceC184998Io
    public final void DhR(float f) {
        Djx(f);
        C115475Kh A0V = MSW.A0V(A03(), this.A00 / 2);
        if (A0V != null) {
            this.A0Q.A0F(AbstractC54865OOa.A01(A0V, f), C05F.A01);
        }
    }
}
