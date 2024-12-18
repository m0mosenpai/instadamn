package com.instagram.profile.edithighlightsmigration;

import X.AbstractC018607g;
import X.AbstractC09440dt;
import X.AbstractC111324zv;
import X.AbstractC115105If;
import X.AbstractC153346v3;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC25230BEn;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC31180DnO;
import X.AbstractC40771I4z;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.AbstractC65332xV;
import X.AbstractC82003lM;
import X.AnonymousClass500;
import X.C00O;
import X.C05F;
import X.C06090Tz;
import X.C08730cb;
import X.C0f9;
import X.C123645id;
import X.C14360o3;
import X.C153146ui;
import X.C153156uj;
import X.C153376v6;
import X.C154776xS;
import X.C155396yS;
import X.C1571673v;
import X.C17060sy;
import X.C18U;
import X.C1ET;
import X.C1OU;
import X.C217113x;
import X.C38748H4o;
import X.C38U;
import X.C39144HKx;
import X.C3DH;
import X.C3G5;
import X.C3LO;
import X.C42261Inl;
import X.C42508Irn;
import X.C42622Itf;
import X.C42637Itu;
import X.C42746Ivk;
import X.C51758Mth;
import X.C57112jm;
import X.C61372qz;
import X.C61972ry;
import X.C71163Hc;
import X.C82013lN;
import X.EnumC09460dv;
import X.EnumC125765mR;
import X.EnumC125775mS;
import X.EnumC1571773w;
import X.EnumC53243Ngg;
import X.GSw;
import X.HEV;
import X.ICY;
import X.IM8;
import X.InterfaceC09390do;
import X.InterfaceC152866uG;
import X.InterfaceC152886uI;
import X.InterfaceC154766xR;
import X.InterfaceC56362iU;
import X.InterfaceC57142jp;
import X.InterfaceC60072op;
import X.InterfaceC60122ou;
import X.InterfaceC60442pS;
import X.InterfaceC62602sz;
import X.JHJ;
import X.MSV;
import X.P8J;
import X.ViewOnClickListenerC42032Ik1;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.recyclerview.FastScrollingLinearLayoutManager;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.modal.ModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HighlightsMigrationFragment extends AbstractC59962oe implements InterfaceC62602sz, InterfaceC60442pS, InterfaceC60072op, InterfaceC154766xR, InterfaceC60122ou, JHJ {
    public C153156uj A00;
    public C154776xS A01;
    public C42746Ivk A02;
    public HEV A03;
    public C153376v6 A04;
    public User A05;
    public String A06;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public IgTextView highlightsMigrationScreenBodyText;
    public RecyclerView recyclerView;
    public IgdsMediaButton scrollToHighlightsButton;
    public IgdsBottomButtonLayout shareHighlightsButton;
    public final String A0B = "MMMM d, yyyy";
    public final InterfaceC09390do A0C = AbstractC09440dt.A00(EnumC09460dv.A02, new GSw(this, 38));
    public final C57112jm A0F = AbstractC31180DnO.A0N();
    public final C61372qz A0G = new C61372qz();
    public final C42261Inl A0E = new C42261Inl(this, 1);
    public boolean A07 = true;
    public final InterfaceC152866uG A0H = new C42622Itf(this);
    public final InterfaceC152886uI A0I = new C42637Itu(this);
    public final InterfaceC09390do A0D = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC154766xR
    public final void DRX(AbstractC115105If abstractC115105If, EnumC125775mS enumC125775mS) {
    }

    @Override // X.InterfaceC154766xR
    public final void DRa(String str, Long l) {
    }

    @Override // X.InterfaceC154766xR
    public final void DRc(EnumC125775mS enumC125775mS, boolean z, boolean z2, boolean z3) {
    }

    @Override // X.InterfaceC154766xR
    public final void DRd(Context context, C51758Mth c51758Mth, C123645id c123645id, EnumC125775mS enumC125775mS, boolean z, boolean z2) {
        ArrayList arrayList;
        String str;
        List<C38748H4o> list = c123645id.A03;
        boolean z3 = true;
        if (list != null) {
            arrayList = AbstractC167017dG.A0q(list);
            for (C38748H4o c38748H4o : list) {
                UserSession A0r = AbstractC166987dD.A0r(this.A0D);
                User user = this.A05;
                if (user != null) {
                    IM8 A00 = AbstractC40771I4z.A00(c38748H4o, A0r, user);
                    if (A00.A04 && !this.A0A) {
                        this.A0A = true;
                        this.A06 = A00.A00();
                    }
                    arrayList.add(A00);
                } else {
                    str = "currentUser";
                    break;
                }
            }
        } else {
            arrayList = null;
        }
        if (!this.A0A || z || !this.A07) {
            z3 = false;
        }
        if (arrayList != null) {
            C42746Ivk c42746Ivk = this.A02;
            if (c42746Ivk != null) {
                c42746Ivk.A04.A0B(arrayList);
                HighlightsMigrationFragment highlightsMigrationFragment = c42746Ivk.A02.A00;
                highlightsMigrationFragment.A03().A01(highlightsMigrationFragment.A09);
            } else {
                str = "highlightsMigrationDataSource";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        }
        if (this.shareHighlightsButton != null && this.A09) {
            IgdsBottomButtonLayout A02 = A02();
            boolean A1b = AbstractC166987dD.A1b(A03().A00());
            Resources A0N = AbstractC166997dE.A0N(this);
            int i = 2131961622;
            if (A1b) {
                i = 2131961625;
            }
            A02.setPrimaryActionText(A0N.getString(i));
        }
        if (z3) {
            IgdsMediaButton igdsMediaButton = this.scrollToHighlightsButton;
            if (igdsMediaButton != null) {
                igdsMediaButton.setVisibility(0);
                IgdsMediaButton igdsMediaButton2 = this.scrollToHighlightsButton;
                if (igdsMediaButton2 != null) {
                    ViewOnClickListenerC42032Ik1.A01(igdsMediaButton2, 48, this);
                    return;
                }
            }
            str = "scrollToHighlightsButton";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.JHJ
    public final void De9(SpinnerImageView spinnerImageView, String str, int i, int i2, int i3) {
        Object obj;
        String str2;
        HEV A03 = A03();
        HashMap hashMap = A03.A01;
        hashMap.put(str, Boolean.valueOf(AbstractC166997dE.A1Z(hashMap.get(str), false)));
        C42746Ivk c42746Ivk = A03.A00;
        C39144HKx c39144HKx = c42746Ivk.A04;
        c39144HKx.A08(c42746Ivk.A03);
        Iterator it = ((AbstractC65332xV) c39144HKx).A01.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((IM8) obj).A00(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        IM8 im8 = (IM8) obj;
        if (im8 != null) {
            im8.A00 = !im8.A00;
        }
        A03.notifyItemChanged(i3);
        if (AbstractC31177DnL.A1b(A03().A01.get(str))) {
            str2 = "selected";
        } else {
            str2 = "unselected";
        }
        A01(this, "highlights_management_screen_highlight_toggle", str2);
        A02().setPrimaryButtonEnabled(AbstractC166987dD.A1b(A03().A00()));
    }

    @Override // X.JHJ
    public final void DeB(String str, int i) {
        if (this.A08) {
            InterfaceC09390do interfaceC09390do = this.A0D;
            Reel A0M = C1OU.A04(AbstractC166987dD.A0r(interfaceC09390do)).A0M(str);
            if (A0M != null && A0M.A0z(AbstractC166987dD.A0r(interfaceC09390do))) {
                A00(this, str);
                return;
            }
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            C14360o3.A0B(A0r, 0);
            C82013lN A00 = AbstractC82003lM.A00(A0r);
            A00.A02(C3G5.A0I, str, "edit_profile_highlights_management", null);
            A00.A05(new P8J(this, 2), str, null, false);
        }
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        boolean z = this.A09;
        Resources A0N = AbstractC166997dE.A0N(this);
        int i = 2131963608;
        if (z) {
            i = 2131963607;
        }
        String string = A0N.getString(i);
        C14360o3.A0A(string);
        interfaceC56362iU.setTitle(string);
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A01 = R.drawable.instagram_chevron_left_pano_outline_24;
        AbstractC31176DnK.A1C(ViewOnClickListenerC42032Ik1.A00(this, 46), A0B, interfaceC56362iU);
        if (C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(this.A0D, 0), 36328925039902587L)) {
            C3LO A0B2 = AbstractC31171DnF.A0B();
            A0B2.A06 = R.drawable.instagram_more_horizontal_pano_outline_24;
            A0B2.A05 = 2131963615;
            AbstractC31176DnK.A1B(ViewOnClickListenerC42032Ik1.A00(this, 47), A0B2, interfaceC56362iU);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "edit_profile_highlights_management";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String str;
        C14360o3.A0B(view, 0);
        RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.highlights_migration_rv);
        C14360o3.A0B(A0G, 0);
        this.recyclerView = A0G;
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) view.requireViewById(R.id.share_highlights_button);
        C14360o3.A0B(igdsBottomButtonLayout, 0);
        this.shareHighlightsButton = igdsBottomButtonLayout;
        A02().setPrimaryButtonEnabled(false);
        A02().setPrimaryActionOnClickListener(ViewOnClickListenerC42032Ik1.A00(this, 49));
        boolean z = this.A09;
        IgdsBottomButtonLayout A02 = A02();
        Resources A0N = AbstractC166997dE.A0N(this);
        if (z) {
            A02.setPrimaryActionText(A0N.getString(2131961625));
            A02().setSecondaryActionOnClickListener(ViewOnClickListenerC42032Ik1.A00(this, 50));
        } else {
            A02.setPrimaryActionText(A0N.getString(2131961622));
            A02().setSecondaryActionText("");
        }
        IgdsMediaButton igdsMediaButton = (IgdsMediaButton) view.requireViewById(R.id.scroll_to_highlights_button);
        C14360o3.A0B(igdsMediaButton, 0);
        this.scrollToHighlightsButton = igdsMediaButton;
        IgTextView igTextView = (IgTextView) view.requireViewById(R.id.highlights_migration_screen_body_text);
        C14360o3.A0B(igTextView, 0);
        this.highlightsMigrationScreenBodyText = igTextView;
        if (this.A09) {
            String format = new SimpleDateFormat(this.A0B, C217113x.A06).format(Long.valueOf(C18U.A01(C06090Tz.A05, AbstractC25230BEn.A0k(this.A0D, 0), 36610400015882284L) * 1000));
            boolean z2 = this.A08;
            Resources A0N2 = AbstractC166997dE.A0N(this);
            int i = 2131961624;
            if (z2) {
                i = 2131961623;
            }
            string = AbstractC166997dE.A0r(A0N2, format, i);
        } else {
            boolean z3 = this.A08;
            Resources A0N3 = AbstractC166997dE.A0N(this);
            int i2 = 2131961627;
            if (z3) {
                i2 = 2131961626;
            }
            string = A0N3.getString(i2);
        }
        C14360o3.A0A(string);
        igTextView.setText(string);
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(A03());
            FastScrollingLinearLayoutManager fastScrollingLinearLayoutManager = new FastScrollingLinearLayoutManager(requireContext());
            RecyclerView recyclerView2 = this.recyclerView;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(fastScrollingLinearLayoutManager);
                C153156uj c153156uj = new C153156uj(fastScrollingLinearLayoutManager, new C42508Irn(this, 2), C153146ui.A0C, false, false);
                this.A00 = c153156uj;
                C61372qz c61372qz = this.A0G;
                c61372qz.A02(c153156uj);
                RecyclerView recyclerView3 = this.recyclerView;
                if (recyclerView3 != null) {
                    recyclerView3.A14(c61372qz);
                    C42746Ivk c42746Ivk = this.A02;
                    if (c42746Ivk != null) {
                        InterfaceC60442pS interfaceC60442pS = c42746Ivk.A01;
                        InterfaceC09390do interfaceC09390do = this.A0D;
                        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                        User A0g = AbstractC31176DnK.A0g(C17060sy.A01, interfaceC09390do);
                        C57112jm c57112jm = this.A0F;
                        this.A04 = AbstractC153346v3.A00(this, A0r, c57112jm, interfaceC60442pS, EnumC125765mR.A07, C38U.A01, A0g, AbstractC166987dD.A1H(), AbstractC166987dD.A1H());
                        C71163Hc A00 = C71163Hc.A00(this);
                        RecyclerView recyclerView4 = this.recyclerView;
                        if (recyclerView4 != null) {
                            c57112jm.A08(recyclerView4, A00, new InterfaceC57142jp[0]);
                            super.onViewCreated(view, bundle);
                            C154776xS c154776xS = this.A01;
                            if (c154776xS != null) {
                                EnumC125775mS enumC125775mS = EnumC125775mS.A03;
                                AnonymousClass500 anonymousClass500 = new AnonymousClass500(AbstractC31173DnH.A0t(interfaceC09390do));
                                C1ET c1et = new C1ET(C05F.A01);
                                C14360o3.A0B(enumC125775mS, 0);
                                C154776xS.A00(c154776xS, enumC125775mS).A00(c1et, anonymousClass500, true, true, true, false);
                                return;
                            }
                            str = "profileFeedNetworkController";
                        }
                    } else {
                        str = "highlightsMigrationDataSource";
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
            }
        }
        str = "recyclerView";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A01(HighlightsMigrationFragment highlightsMigrationFragment, String str, String str2) {
        String str3;
        C1571673v c1571673v = C1571673v.A00;
        InterfaceC09390do interfaceC09390do = highlightsMigrationFragment.A0D;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        EnumC1571773w enumC1571773w = EnumC1571773w.A05;
        String A0t = AbstractC31173DnH.A0t(interfaceC09390do);
        if (highlightsMigrationFragment.A09) {
            str3 = MSV.A00(448);
        } else {
            str3 = "opt_in";
        }
        c1571673v.A0D(highlightsMigrationFragment, A0r, enumC1571773w, str, A0t, str3, str2);
    }

    public final IgdsBottomButtonLayout A02() {
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.shareHighlightsButton;
        if (igdsBottomButtonLayout != null) {
            return igdsBottomButtonLayout;
        }
        C14360o3.A0F("shareHighlightsButton");
        throw C00O.createAndThrow();
    }

    public final HEV A03() {
        HEV hev = this.A03;
        if (hev != null) {
            return hev;
        }
        C14360o3.A0F("highlightsMigrationGridAdapter");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        C42746Ivk c42746Ivk = this.A02;
        if (c42746Ivk != null) {
            return AbstractC166987dD.A1b(((AbstractC65332xV) c42746Ivk.A04).A01);
        }
        C14360o3.A0F("highlightsMigrationDataSource");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        C154776xS c154776xS = this.A01;
        if (c154776xS != null) {
            EnumC125775mS enumC125775mS = EnumC125775mS.A03;
            C14360o3.A0B(enumC125775mS, 0);
            return C154776xS.A00(c154776xS, enumC125775mS).A03.A05();
        }
        C14360o3.A0F("profileFeedNetworkController");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        C154776xS c154776xS = this.A01;
        if (c154776xS != null) {
            EnumC125775mS enumC125775mS = EnumC125775mS.A03;
            C14360o3.A0B(enumC125775mS, 0);
            return C154776xS.A00(c154776xS, enumC125775mS).A01();
        }
        C14360o3.A0F("profileFeedNetworkController");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        C154776xS c154776xS = this.A01;
        if (c154776xS != null) {
            EnumC125775mS enumC125775mS = EnumC125775mS.A03;
            AnonymousClass500 anonymousClass500 = new AnonymousClass500(AbstractC31173DnH.A0t(this.A0D));
            C1ET c1et = new C1ET(C05F.A01);
            C14360o3.A0B(enumC125775mS, 0);
            C154776xS.A00(c154776xS, enumC125775mS).A00(c1et, anonymousClass500, false, false, true, false);
            return;
        }
        C14360o3.A0F("profileFeedNetworkController");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC154766xR
    public final void DRZ(EnumC125775mS enumC125775mS) {
        if (!this.A0A && !isLoading() && CLJ()) {
            Chd();
        } else {
            if (!this.A0A) {
                return;
            }
            A03().A01(this.A09);
            this.A07 = false;
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0D);
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        C154776xS c154776xS = this.A01;
        if (c154776xS != null) {
            EnumC125775mS enumC125775mS = EnumC125775mS.A03;
            C14360o3.A0B(enumC125775mS, 0);
            return C154776xS.A00(c154776xS, enumC125775mS).A02();
        }
        C14360o3.A0F("profileFeedNetworkController");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.1vN] */
    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (AbstractC167007dF.A1Z(this.A0C)) {
            AbstractC31176DnK.A0Q(this.A0D).E4s(new Object());
            return false;
        }
        return false;
    }

    public static final void A00(HighlightsMigrationFragment highlightsMigrationFragment, String str) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString(MSV.A00(436), str);
        A0b.putBoolean(MSV.A00(176), true);
        A0b.putSerializable(MSV.A00(465), EnumC53243Ngg.A08);
        AbstractC31171DnF.A0L(highlightsMigrationFragment.getActivity(), A0b, AbstractC166987dD.A0o(highlightsMigrationFragment.A0D), ModalActivity.class, AbstractC111324zv.A00(4861)).A0A(highlightsMigrationFragment.getActivity(), 201);
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        if (isLoading()) {
            C42746Ivk c42746Ivk = this.A02;
            if (c42746Ivk != null) {
                if (!AbstractC166987dD.A1b(((AbstractC65332xV) c42746Ivk.A04).A01)) {
                    return false;
                }
            } else {
                C14360o3.A0F("highlightsMigrationDataSource");
                throw C00O.createAndThrow();
            }
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-981845147);
        C14360o3.A0B(layoutInflater, 0);
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A0D;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C155396yS c155396yS = new C155396yS(AbstractC166987dD.A0r(interfaceC09390do));
        C08730cb c08730cb = C17060sy.A01;
        User A0g = AbstractC31176DnK.A0g(c08730cb, interfaceC09390do);
        ICY icy = new ICY(this);
        C38U c38u = C38U.A01;
        this.A02 = new C42746Ivk(requireContext, A0r, this, icy, c155396yS, c38u, A0g);
        Context requireContext2 = requireContext();
        UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
        C42746Ivk c42746Ivk = this.A02;
        if (c42746Ivk != null) {
            this.A03 = new HEV(requireContext2, this, A0r2, this.A0H, this.A0I, c42746Ivk, this, c38u, this);
            this.A01 = new C154776xS(requireContext(), AbstractC166987dD.A0r(interfaceC09390do), new C61972ry(requireContext(), AbstractC018607g.A00(this), null), null, this, null, AbstractC166987dD.A1J(EnumC125775mS.A03));
            AbstractC31176DnK.A0Q(interfaceC09390do).A01(this.A0E, C3DH.class);
            User A0g2 = AbstractC31176DnK.A0g(c08730cb, interfaceC09390do);
            this.A05 = A0g2;
            this.A09 = A0g2.A2M();
            this.A08 = C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36328925039443828L);
            View inflate = layoutInflater.inflate(R.layout.fragment_highlights_migration, viewGroup, false);
            C0f9.A09(242545345, A02);
            return inflate;
        }
        C14360o3.A0F("highlightsMigrationDataSource");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1219577821);
        super.onDestroyView();
        HighlightsMigrationFragmentLifecycleUtil.cleanupReferences(this);
        this.A0G.A00();
        AbstractC31176DnK.A0Q(this.A0D).A02(this.A0E, C3DH.class);
        C0f9.A09(-1036110152, A02);
    }
}
