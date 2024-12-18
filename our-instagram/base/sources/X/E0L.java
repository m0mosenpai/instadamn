package X;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.business.fragment.SuggestBusinessFragment;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* loaded from: classes6.dex */
public final class E0L extends C1I4 {
    public final int A00;
    public final Object A01;

    public E0L(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(RecyclerView recyclerView, Object obj, int i) {
        recyclerView.A14(new E0L(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1I4
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03;
        int i2;
        View view;
        View view2;
        int i3;
        Parcelable parcelable;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1209480050);
                super.onScrollStateChanged(recyclerView, i);
                if (!recyclerView.canScrollVertically(1)) {
                    ((Q83) this.A01).A04.A03();
                }
                i2 = 1038483350;
                C0f9.A0A(i2, A03);
                return;
            case 1:
                A03 = AbstractC167017dG.A0N(recyclerView, -1054199423);
                super.onScrollStateChanged(recyclerView, i);
                FQW fqw = (FQW) this.A01;
                C67919V2j c67919V2j = fqw.A04;
                fqw.A00(recyclerView, c67919V2j.getItemCount());
                DataSetObserver dataSetObserver = fqw.A02;
                if (dataSetObserver != null) {
                    c67919V2j.unregisterDataSetObserver(dataSetObserver);
                    fqw.A02 = null;
                }
                i2 = -278554069;
                C0f9.A0A(i2, A03);
                return;
            case 2:
                A03 = C0f9.A03(1172010061);
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0 && recyclerView.canScrollVertically(-1)) {
                    SuggestBusinessFragment suggestBusinessFragment = (SuggestBusinessFragment) this.A01;
                    if (suggestBusinessFragment.isAdded()) {
                        C34688FPz c34688FPz = suggestBusinessFragment.A03;
                        if (c34688FPz.A03 && !(!c34688FPz.A02)) {
                            if (c34688FPz.A01) {
                                C67919V2j A00 = SuggestBusinessFragment.A00(suggestBusinessFragment);
                                A00.A01.A00 = true;
                                A00.notifyDataSetChanged();
                                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.A0D;
                                if (linearLayoutManager != null) {
                                    int dimensionPixelSize = AbstractC166997dE.A0N(suggestBusinessFragment).getDimensionPixelSize(R.dimen.ad_not_delivering_thumbnail_height);
                                    if (linearLayoutManager.A1d() == SuggestBusinessFragment.A00(suggestBusinessFragment).getItemCount() - 1) {
                                        recyclerView.scrollBy(0, dimensionPixelSize);
                                    }
                                }
                            }
                            suggestBusinessFragment.A03.A00(new C35926Ftk(this), suggestBusinessFragment.A04, suggestBusinessFragment, suggestBusinessFragment.A06);
                        }
                    }
                }
                i2 = 1515072005;
                C0f9.A0A(i2, A03);
                return;
            case 3:
                A03 = C0f9.A03(-3643340);
                if (i == 1) {
                    SearchEditText searchEditText = ((EOO) this.A01).A07;
                    if (searchEditText != null) {
                        searchEditText.A04();
                    }
                    C14360o3.A0F("searchEditText");
                    throw C00O.createAndThrow();
                }
                i2 = 1949498265;
                C0f9.A0A(i2, A03);
                return;
            case 4:
                A03 = AbstractC167017dG.A0N(recyclerView, 192160966);
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    LinearLayoutManager A0J = AbstractC31177DnL.A0J(recyclerView);
                    CirclePageIndicator circlePageIndicator = ((C32703EaU) this.A01).A03;
                    if (circlePageIndicator != null) {
                        circlePageIndicator.A02(A0J.A1a());
                    }
                }
                i2 = 144119454;
                C0f9.A0A(i2, A03);
                return;
            case 5:
                A03 = C0f9.A03(-649784108);
                if (i != 0) {
                    AbstractC13880nE.A0O(((EVU) this.A01).A04);
                }
                i2 = -2095981236;
                C0f9.A0A(i2, A03);
                return;
            case 6:
            case 7:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case Process.SIGTERM /* 15 */:
            case 16:
            default:
                super.onScrollStateChanged(recyclerView, i);
                return;
            case 8:
                A03 = C0f9.A03(-1690316096);
                if (i != 0 && (view = ((DirectShareSheetFragment) this.A01).mMainView) != null) {
                    AbstractC13880nE.A0O(view);
                }
                i2 = -1699315074;
                C0f9.A0A(i2, A03);
                return;
            case 9:
                A03 = C0f9.A03(-1910215022);
                DirectShareSheetFragment directShareSheetFragment = (DirectShareSheetFragment) this.A01;
                if (directShareSheetFragment.isScrolledToTop() && !directShareSheetFragment.A1S) {
                    view2 = directShareSheetFragment.A0M.A01;
                    if (view2 != null) {
                        i3 = 0;
                        view2.setVisibility(i3);
                    }
                    i2 = -1027286790;
                } else {
                    if (i != 0) {
                        if (!AbstractC31178DnM.A1X(C06090Tz.A05, directShareSheetFragment.A0H, 36318209095637020L) && (view2 = directShareSheetFragment.A0M.A01) != null) {
                            i3 = 8;
                            view2.setVisibility(i3);
                        }
                    }
                    i2 = -1027286790;
                }
                C0f9.A0A(i2, A03);
                return;
            case 10:
                A03 = AbstractC167017dG.A0N(recyclerView, -1092012320);
                super.onScrollStateChanged(recyclerView, i);
                IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) this.A01;
                if (igdsInlineSearchBox.hasFocus() && i != 0) {
                    igdsInlineSearchBox.A03();
                }
                i2 = -1507752778;
                C0f9.A0A(i2, A03);
                return;
            case 11:
                A03 = AbstractC167017dG.A0N(recyclerView, -1236276503);
                super.onScrollStateChanged(recyclerView, i);
                IgdsInlineSearchBox igdsInlineSearchBox2 = (IgdsInlineSearchBox) this.A01;
                if (igdsInlineSearchBox2.hasFocus() && i != 0) {
                    igdsInlineSearchBox2.A03();
                }
                i2 = 1211908229;
                C0f9.A0A(i2, A03);
                return;
            case 14:
                A03 = C0f9.A03(815354806);
                if (i != 0) {
                    AbstractC13880nE.A0O(((C36010Fv8) this.A01).A00);
                }
                i2 = -218191941;
                C0f9.A0A(i2, A03);
                return;
            case 17:
                A03 = AbstractC167017dG.A0N(recyclerView, -696288076);
                super.onScrollStateChanged(recyclerView, i);
                EOH.A00((EOH) this.A01);
                i2 = 100380456;
                C0f9.A0A(i2, A03);
                return;
            case 18:
                A03 = AbstractC167017dG.A0N(recyclerView, -1720693832);
                if (i == 0) {
                    C73V c73v = (C73V) this.A01;
                    AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
                    if (abstractC70663Fe != null) {
                        parcelable = abstractC70663Fe.A1M();
                    } else {
                        parcelable = null;
                    }
                    c73v.DVa(parcelable);
                }
                i2 = 198978286;
                C0f9.A0A(i2, A03);
                return;
            case Process.SIGSTOP /* 19 */:
                A03 = C0f9.A03(155294442);
                if (i == 1) {
                    SearchEditText searchEditText2 = ((EOI) this.A01).A0B;
                    if (searchEditText2 != null) {
                        searchEditText2.A04();
                    }
                    C14360o3.A0F("searchEditText");
                    throw C00O.createAndThrow();
                }
                i2 = 1680585157;
                C0f9.A0A(i2, A03);
                return;
            case 20:
                A03 = C0f9.A03(-172986541);
                IgdsInlineSearchBox igdsInlineSearchBox3 = ((ELQ) this.A01).A02;
                if (i == 1) {
                    igdsInlineSearchBox3.A03();
                }
                i2 = 2038402023;
                C0f9.A0A(i2, A03);
                return;
            case 21:
                A03 = C0f9.A03(-2089324919);
                if (i == 1) {
                    AbstractC13880nE.A0O(((FML) this.A01).A03);
                }
                i2 = -2038445113;
                C0f9.A0A(i2, A03);
                return;
            case 22:
                A03 = AbstractC167017dG.A0N(recyclerView, -1842660073);
                super.onScrollStateChanged(recyclerView, i);
                IgdsInlineSearchBox igdsInlineSearchBox4 = (IgdsInlineSearchBox) this.A01;
                if (igdsInlineSearchBox4.hasFocus() && i != 0) {
                    igdsInlineSearchBox4.A03();
                }
                i2 = 2000411591;
                C0f9.A0A(i2, A03);
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A03;
        int i3;
        int A0N;
        int i4;
        InterfaceC37194Ga5 interfaceC37194Ga5;
        Integer C04;
        String str;
        switch (this.A00) {
            case 6:
                A0N = AbstractC167017dG.A0N(recyclerView, 23673904);
                if (AbstractC31177DnL.A0J(recyclerView).A1a() < 5) {
                    ((C7O4) this.A01).A01();
                }
                i4 = -1663216975;
                C0f9.A0A(i4, A0N);
                return;
            case 7:
                A0N = C0f9.A03(-22713711);
                super.onScrolled(recyclerView, i, i2);
                C32372ENy c32372ENy = (C32372ENy) this.A01;
                AbstractC70663Fe abstractC70663Fe = c32372ENy.A00.A0D;
                abstractC70663Fe.getClass();
                if (((LinearLayoutManager) abstractC70663Fe).A1b() == c32372ENy.A01.getItemCount() - 1) {
                    if (c32372ENy.A00.getChildAt(r1.getChildCount() - 1).getBottom() <= c32372ENy.A00.getHeight() && (interfaceC37194Ga5 = c32372ENy.A04) != null && (((C04 = interfaceC37194Ga5.C04()) == C05F.A0Y || C04 == C05F.A00) && !c32372ENy.A00.A1D())) {
                        C37384GdQ c37384GdQ = c32372ENy.A06;
                        if (c37384GdQ == null) {
                            c37384GdQ = C37384GdQ.A00(c32372ENy.A0O);
                            c32372ENy.A06 = c37384GdQ;
                        }
                        ViewModelListUpdate viewModelListUpdate = c32372ENy.A02;
                        if (viewModelListUpdate != null) {
                            viewModelListUpdate.A00(c37384GdQ);
                            c32372ENy.A01.A05(c32372ENy.A02);
                        }
                        RecyclerView recyclerView2 = c32372ENy.A00;
                        Runnable runnable = c32372ENy.A0P;
                        recyclerView2.removeCallbacks(runnable);
                        c32372ENy.A00.post(runnable);
                    }
                }
                i4 = -1951994016;
                C0f9.A0A(i4, A0N);
                return;
            case 8:
                A03 = C0f9.A03(-77900049);
                i3 = 997189316;
                C0f9.A0A(i3, A03);
                return;
            case 9:
            case 10:
            case 11:
            case 14:
            default:
                super.onScrolled(recyclerView, i, i2);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A0N = AbstractC167017dG.A0N(recyclerView, 1140063349);
                if (!recyclerView.canScrollVertically(1)) {
                    EMA.A01((EMA) this.A01);
                }
                i4 = 294587461;
                C0f9.A0A(i4, A0N);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A0N = AbstractC167017dG.A0N(recyclerView, 1826272553);
                if (!recyclerView.canScrollVertically(1)) {
                    ELP.A00((ELP) this.A01);
                }
                i4 = -747203389;
                C0f9.A0A(i4, A0N);
                return;
            case Process.SIGTERM /* 15 */:
                A03 = AbstractC167017dG.A0N(recyclerView, -534056445);
                super.onScrolled(recyclerView, i, i2);
                EMC emc = (EMC) this.A01;
                FQR fqr = emc.A01;
                str = "resharedContentProvider";
                if (fqr != null) {
                    Integer num = fqr.A00;
                    if (num != null) {
                        if (num == C05F.A0Y) {
                            fqr.A00(emc.A02);
                        }
                        i3 = 524570386;
                        C0f9.A0A(i3, A03);
                        return;
                    }
                    str = IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE;
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 16:
                A03 = AbstractC167017dG.A0N(recyclerView, 1012069803);
                super.onScrolled(recyclerView, i, i2);
                int A1b = AbstractC31177DnL.A0J(recyclerView).A1b();
                ELR elr = (ELR) this.A01;
                C66362zD c66362zD = elr.A02;
                str = "adapter";
                if (c66362zD != null) {
                    if (A1b == c66362zD.getItemCount() - 1 && recyclerView.getChildAt(recyclerView.getChildCount() - 1).getBottom() <= recyclerView.getHeight()) {
                        FQQ fqq = elr.A06;
                        if (fqq != null) {
                            Integer num2 = fqq.A00;
                            if (num2 != null) {
                                if (num2 == C05F.A0Y) {
                                    ViewModelListUpdate viewModelListUpdate2 = elr.A03;
                                    if (viewModelListUpdate2 != null) {
                                        viewModelListUpdate2.A00(new EY0(elr.requireContext().getString(2131973064), elr.A01, true));
                                        C66362zD c66362zD2 = elr.A02;
                                        if (c66362zD2 != null) {
                                            ViewModelListUpdate viewModelListUpdate3 = elr.A03;
                                            if (viewModelListUpdate3 != null) {
                                                c66362zD2.A05(viewModelListUpdate3);
                                                FQQ fqq2 = elr.A06;
                                                if (fqq2 != null) {
                                                    fqq2.A00(elr.A00);
                                                }
                                            }
                                        }
                                    }
                                    str = "viewModelListUpdater";
                                }
                            }
                            str = IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE;
                        }
                        str = "messageSearchProvider";
                    }
                    i3 = 1951641485;
                    C0f9.A0A(i3, A03);
                    return;
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
        }
    }
}
