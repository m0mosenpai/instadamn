package X;

import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.debug.devoptions.signalsplayground.view.CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder;
import com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment;
import com.instagram.shopping.widget.pdp.herocarousel.HeroCarouselScrollbarView;

/* renamed from: X.GuM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38385GuM extends C1I4 {
    public final int A00;
    public final Object A01;

    public static void A00(IgdsInlineSearchBox igdsInlineSearchBox, int i) {
        if (i == 1) {
            igdsInlineSearchBox.A03();
        }
    }

    public C38385GuM(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1I4
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A0N;
        int i2;
        String str;
        switch (this.A00) {
            case 1:
                A0N = AbstractC167017dG.A0N(recyclerView, 1258856045);
                super.onScrollStateChanged(recyclerView, i);
                A00((IgdsInlineSearchBox) this.A01, i);
                i2 = 2081268505;
                C0f9.A0A(i2, A0N);
                return;
            case 2:
                A0N = AbstractC167017dG.A0N(recyclerView, 1759615354);
                super.onScrollStateChanged(recyclerView, i);
                IgdsInlineSearchBox igdsInlineSearchBox = ((HCO) this.A01).A02;
                if (igdsInlineSearchBox != null) {
                    A00(igdsInlineSearchBox, i);
                    i2 = 1580924582;
                    C0f9.A0A(i2, A0N);
                    return;
                }
                str = "inlineSearchBox";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 3:
                A0N = AbstractC167017dG.A0N(recyclerView, -1193620479);
                super.onScrollStateChanged(recyclerView, i);
                IgdsInlineSearchBox igdsInlineSearchBox2 = ((HCL) this.A01).A04;
                if (igdsInlineSearchBox2 != null) {
                    A00(igdsInlineSearchBox2, i);
                }
                i2 = 1280144026;
                C0f9.A0A(i2, A0N);
                return;
            case 4:
                A0N = AbstractC167017dG.A0N(recyclerView, -637203292);
                super.onScrollStateChanged(recyclerView, i);
                IgdsInlineSearchBox igdsInlineSearchBox3 = ((HCN) this.A01).A00;
                if (igdsInlineSearchBox3 != null) {
                    A00(igdsInlineSearchBox3, i);
                    i2 = -926818285;
                    C0f9.A0A(i2, A0N);
                    return;
                }
                str = "inlineSearchBox";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 5:
            case 9:
            default:
                super.onScrollStateChanged(recyclerView, i);
                return;
            case 6:
                A0N = AbstractC167017dG.A0N(recyclerView, 1238095805);
                super.onScrollStateChanged(recyclerView, i);
                IgdsInlineSearchBox igdsInlineSearchBox4 = ((HCE) this.A01).A07;
                if (igdsInlineSearchBox4 != null) {
                    A00(igdsInlineSearchBox4, i);
                    i2 = -1696283794;
                    C0f9.A0A(i2, A0N);
                    return;
                }
                str = "inlineSearchBox";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 7:
                A0N = C0f9.A03(-330768736);
                C14360o3.A0B(recyclerView, 0);
                super.onScrollStateChanged(recyclerView, i);
                A00((IgdsInlineSearchBox) ((HCF) this.A01).A01.A02(), i);
                i2 = 1719663642;
                C0f9.A0A(i2, A0N);
                return;
            case 8:
                A0N = AbstractC167017dG.A0N(recyclerView, 960914781);
                super.onScrollStateChanged(recyclerView, i);
                IgdsInlineSearchBox igdsInlineSearchBox5 = ((HCK) this.A01).A02;
                if (igdsInlineSearchBox5 == null) {
                    str = "searchBox";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                A00(igdsInlineSearchBox5, i);
                i2 = -1549845249;
                C0f9.A0A(i2, A0N);
                return;
            case 10:
                A0N = AbstractC167017dG.A0N(recyclerView, 1037765560);
                HeroCarouselScrollbarView heroCarouselScrollbarView = (HeroCarouselScrollbarView) this.A01;
                HeroCarouselScrollbarView.A01(heroCarouselScrollbarView);
                HeroCarouselScrollbarView.A00(recyclerView, heroCarouselScrollbarView);
                i2 = 1373106450;
                C0f9.A0A(i2, A0N);
                return;
        }
    }

    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A03;
        int i3;
        String str;
        Parcelable A1M;
        CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder;
        HYM hym;
        HC4 hc4;
        Integer num;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(602707155);
                super.onScrolled(recyclerView, i, i2);
                if (!recyclerView.canScrollVertically(1)) {
                    ProductCollectionFragment productCollectionFragment = (ProductCollectionFragment) this.A01;
                    if (!productCollectionFragment.A0C.A01.A05() && (str = productCollectionFragment.A0I) != null) {
                        C41755IeW c41755IeW = productCollectionFragment.A07;
                        C5GU c5gu = productCollectionFragment.A02;
                        String str2 = productCollectionFragment.A0F;
                        C14360o3.A0B(c5gu, 1);
                        if (!c41755IeW.A00) {
                            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c41755IeW.A02, "instagram_shopping_product_collection_page_feed_end_impression");
                            if (A0f.isSampled()) {
                                AbstractC37300Gc1.A0f(A0f, C41755IeW.A02(c41755IeW, null));
                                C41755IeW.A04(C41755IeW.A03(A0f, c5gu, c41755IeW, str, str2), A0f, c41755IeW);
                            }
                        }
                        c41755IeW.A00 = true;
                    }
                }
                i3 = 1571247037;
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
            default:
                super.onScrolled(recyclerView, i, i2);
                return;
            case 5:
                A03 = AbstractC167017dG.A0N(recyclerView, 1632313392);
                super.onScrolled(recyclerView, i, i2);
                ((C38933HCg) this.A01).A00 += i2;
                i3 = -944916265;
                break;
            case 9:
                A03 = AbstractC167017dG.A0N(recyclerView, 1200446846);
                AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
                if (abstractC70663Fe != null && (A1M = abstractC70663Fe.A1M()) != null) {
                    ((C41047IFq) this.A01).A00 = A1M;
                }
                i3 = -2043089620;
                break;
            case 10:
                A03 = AbstractC167017dG.A0N(recyclerView, 779621291);
                HeroCarouselScrollbarView heroCarouselScrollbarView = (HeroCarouselScrollbarView) this.A01;
                HeroCarouselScrollbarView.A01(heroCarouselScrollbarView);
                HeroCarouselScrollbarView.A00(recyclerView, heroCarouselScrollbarView);
                i3 = 1768803877;
                break;
            case 11:
                int A0N = AbstractC167017dG.A0N(recyclerView, -546253341);
                AbstractC70663Fe abstractC70663Fe2 = recyclerView.A0D;
                if (abstractC70663Fe2 != null) {
                    Parcelable A1M2 = abstractC70663Fe2.A1M();
                    if (A1M2 != null) {
                        ((IJ0) this.A01).A00 = A1M2;
                    }
                    C0f9.A0A(-262107120, A0N);
                    return;
                }
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A0A(-1023899348, A0N);
                throw A0g;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                int A032 = C0f9.A03(-1743479813);
                C14360o3.A0B(recyclerView, 0);
                super.onScrolled(recyclerView, i, i2);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.A0D;
                String str3 = null;
                if (linearLayoutManager != null) {
                    int A1c = linearLayoutManager.A1c();
                    if (Integer.valueOf(A1c) != null && A1c != -1) {
                        C3OO A0V = recyclerView.A0V(A1c);
                        if (A0V instanceof C38514GwZ) {
                            C38514GwZ c38514GwZ = (C38514GwZ) A0V;
                            C38321qM c38321qM = c38514GwZ.A00;
                            if (c38321qM != null) {
                                str3 = c38321qM.A2u();
                            }
                            hc4 = (HC4) this.A01;
                            ((Gt6) hc4.A08.getValue()).A0H(c38514GwZ);
                        } else {
                            if ((A0V instanceof CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder) && (hym = (creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder = (CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder) A0V).audioTrackItem) != null) {
                                hc4 = (HC4) this.A01;
                                String str4 = hym.A07;
                                InterfaceC678133v interfaceC678133v = hc4.A04;
                                if (interfaceC678133v != null) {
                                    num = interfaceC678133v.CAJ(hym.A02);
                                } else {
                                    num = null;
                                }
                                InterfaceC678133v interfaceC678133v2 = hc4.A04;
                                if (interfaceC678133v2 != null) {
                                    interfaceC678133v2.EJa(false);
                                }
                                if (num != C05F.A0C) {
                                    InterfaceC678133v interfaceC678133v3 = hc4.A04;
                                    if (interfaceC678133v3 != null) {
                                        MusicDataSource musicDataSource = hym.A02;
                                        InterfaceC150336ph interfaceC150336ph = creatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.trackListener;
                                        if (interfaceC150336ph != null) {
                                            interfaceC678133v3.ESz(musicDataSource, interfaceC150336ph, null, 0, -1, -1, false, false);
                                        } else {
                                            IllegalStateException A0g2 = AbstractC166997dE.A0g();
                                            C0f9.A0A(-888128193, A032);
                                            throw A0g2;
                                        }
                                    }
                                } else {
                                    InterfaceC678133v interfaceC678133v4 = hc4.A04;
                                    if (interfaceC678133v4 != null) {
                                        interfaceC678133v4.E4S();
                                    }
                                }
                                str3 = str4;
                            }
                            ((HC4) this.A01).A00 = A1c;
                        }
                        if (str3 != null) {
                            InterfaceC09390do interfaceC09390do = hc4.A0D;
                            ((CreatorInspirationSignalsPlaygroundRecommendationsViewModel) interfaceC09390do.getValue()).currentRecommendationId = str3;
                            ((CreatorInspirationSignalsPlaygroundRecommendationsViewModel) interfaceC09390do.getValue()).updateCurrentFeedback();
                        }
                        ((HC4) this.A01).A00 = A1c;
                    }
                }
                C0f9.A0A(-249684929, A032);
                return;
        }
        C0f9.A0A(i3, A03);
    }
}
