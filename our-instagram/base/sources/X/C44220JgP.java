package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.dextricks.JITProfilePQR;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.creation.capture.quickcapture.thirdpartymedia.GiphyClipsBrowserFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.List;

/* renamed from: X.JgP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44220JgP extends C1I4 {
    public final int A00;
    public final Object A01;

    public C44220JgP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(RecyclerView recyclerView, Object obj, int i) {
        recyclerView.A14(new C44220JgP(obj, i));
    }

    @Override // X.C1I4
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03;
        int i2;
        switch (this.A00) {
            case 4:
                A03 = C0f9.A03(629786647);
                GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = ((C43830JZt) this.A01).A0F.A00;
                if (!gestureDetectorOnGestureListenerC43829JZs.A1M) {
                    GestureDetectorOnGestureListenerC43829JZs.A0E(gestureDetectorOnGestureListenerC43829JZs);
                }
                i2 = -673025579;
                break;
            case 5:
                A03 = AbstractC167017dG.A0N(recyclerView, 191434271);
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    KCE kce = (KCE) this.A01;
                    if (kce.requireView().getVisibility() == 0) {
                        KCE.A03(kce);
                    }
                }
                i2 = -1066674740;
                break;
            case 6:
                A03 = AbstractC167017dG.A0N(recyclerView, -2008026268);
                super.onScrollStateChanged(recyclerView, i);
                SearchEditText searchEditText = ((L2V) this.A01).A00;
                if (searchEditText == null) {
                    AbstractC12120kG.A07("EffectSearchNullStateController", "onScrollStateChanged() should not have null mSearchEditText.", null);
                    i2 = -1211968740;
                    break;
                } else {
                    if (i == 1) {
                        searchEditText.A04();
                        searchEditText.clearFocus();
                    }
                    i2 = -553783546;
                    break;
                }
            case 7:
                A03 = C0f9.A03(1143707718);
                if (i == 1) {
                    GiphyClipsBrowserFragment giphyClipsBrowserFragment = (GiphyClipsBrowserFragment) this.A01;
                    SearchEditText searchEditText2 = giphyClipsBrowserFragment.searchEditText;
                    if (searchEditText2 != null) {
                        searchEditText2.clearFocus();
                    }
                    AbstractC13880nE.A0O(giphyClipsBrowserFragment.searchEditText);
                }
                i2 = 1956067414;
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            default:
                super.onScrollStateChanged(recyclerView, i);
                return;
            case 14:
                A03 = C0f9.A03(1620446797);
                if (i == 1) {
                    C45511KDa c45511KDa = (C45511KDa) this.A01;
                    SearchEditText searchEditText3 = c45511KDa.A09;
                    if (searchEditText3 != null) {
                        searchEditText3.clearFocus();
                    }
                    SearchEditText searchEditText4 = c45511KDa.A09;
                    if (searchEditText4 != null) {
                        searchEditText4.A04();
                    }
                }
                i2 = -1056228206;
                break;
        }
        C0f9.A0A(i2, A03);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A03;
        int i3;
        String str;
        LinearLayoutManager linearLayoutManager;
        LinearLayoutManager linearLayoutManager2;
        int A032;
        int i4;
        LinearLayoutManager linearLayoutManager3;
        FlexboxLayoutManager flexboxLayoutManager;
        int A0C;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(186974652);
                C14360o3.A0B(recyclerView, 0);
                super.onScrolled(recyclerView, i, i2);
                C45485KBz c45485KBz = (C45485KBz) this.A01;
                C45485KBz.A02(c45485KBz);
                C45485KBz.A00(c45485KBz);
                i3 = -401023074;
                C0f9.A0A(i3, A03);
                return;
            case 1:
                A03 = C0f9.A03(-1676887805);
                C14360o3.A0B(recyclerView, 0);
                super.onScrolled(recyclerView, i, i2);
                LinearLayoutManager linearLayoutManager4 = (LinearLayoutManager) recyclerView.A0D;
                KCI kci = (KCI) this.A01;
                if (!kci.A09 && linearLayoutManager4 != null) {
                    int A1d = linearLayoutManager4.A1d();
                    PromoteData promoteData = kci.A03;
                    if (promoteData == null) {
                        str = "promoteData";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    if (A1d == promoteData.A1u.size() - 1) {
                        if (C14360o3.A0K(kci.A05, true)) {
                            C44487Jlt c44487Jlt = (C44487Jlt) kci.A0C.getValue();
                            AbstractC58232lf.A00(AnonymousClass191.A00, new MZP(c44487Jlt.A02.A00(LeadGenEntryPoint.A06, c44487Jlt.A03, c44487Jlt.A00), 2)).A06(kci.getViewLifecycleOwner(), new C65991Txk(12, new C50368MLv(kci, 1)));
                        }
                        kci.A09 = true;
                    }
                }
                i3 = 890879135;
                C0f9.A0A(i3, A03);
                return;
            case 2:
                A03 = C0f9.A03(-1542390094);
                C14360o3.A0B(recyclerView, 0);
                super.onScrolled(recyclerView, i, i2);
                AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
                if ((abstractC70663Fe instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) abstractC70663Fe) != null) {
                    C26863BtP c26863BtP = (C26863BtP) this.A01;
                    C49512LuR c49512LuR = c26863BtP.A01;
                    if (c49512LuR != null) {
                        int itemCount = c49512LuR.A00.getItemCount();
                        if (itemCount > 0 && itemCount - linearLayoutManager.A1d() <= 3) {
                            ((C44528JmY) c26863BtP.A05.getValue()).A00();
                        }
                        i3 = 1762226460;
                    } else {
                        i3 = -894462523;
                    }
                } else {
                    i3 = 237286057;
                }
                C0f9.A0A(i3, A03);
                return;
            case 3:
                A03 = C0f9.A03(1342397107);
                C14360o3.A0B(recyclerView, 0);
                super.onScrolled(recyclerView, i, i2);
                C44321JiD.A00((C44321JiD) this.A01);
                i3 = 1874666866;
                C0f9.A0A(i3, A03);
                return;
            case 4:
                A03 = C0f9.A03(855415428);
                C43830JZt c43830JZt = (C43830JZt) this.A01;
                GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = c43830JZt.A0F.A00;
                if (!gestureDetectorOnGestureListenerC43829JZs.A1M) {
                    GestureDetectorOnGestureListenerC43829JZs.A0E(gestureDetectorOnGestureListenerC43829JZs);
                }
                int A1a = c43830JZt.A09.A1a();
                if (A1a >= 0) {
                    ViewOnTouchListenerC195698lA viewOnTouchListenerC195698lA = c43830JZt.A0L;
                    viewOnTouchListenerC195698lA.A07(((C43834JZx) c43830JZt.A0E).AK4(A1a));
                    viewOnTouchListenerC195698lA.A06();
                }
                i3 = 70461308;
                C0f9.A0A(i3, A03);
                return;
            case 5:
            case 6:
            case 7:
            default:
                super.onScrolled(recyclerView, i, i2);
                return;
            case 8:
                A03 = C0f9.A03(-763804218);
                C14360o3.A0B(recyclerView, 0);
                super.onScrolled(recyclerView, i, i2);
                AbstractC70663Fe abstractC70663Fe2 = recyclerView.A0D;
                if ((abstractC70663Fe2 instanceof LinearLayoutManager) && (linearLayoutManager2 = (LinearLayoutManager) abstractC70663Fe2) != null) {
                    KBk kBk = (KBk) this.A01;
                    C49512LuR c49512LuR2 = kBk.A01;
                    if (c49512LuR2 == null) {
                        str = "reactionAdapter";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    int itemCount2 = c49512LuR2.A00.getItemCount();
                    if (itemCount2 > 0 && itemCount2 - linearLayoutManager2.A1d() <= 3) {
                        ((C44528JmY) kBk.A04.getValue()).A00();
                    }
                    i3 = -1307268834;
                } else {
                    i3 = -739708048;
                }
                C0f9.A0A(i3, A03);
                return;
            case 9:
                A03 = C0f9.A03(1972831227);
                C14360o3.A0B(recyclerView, 0);
                super.onScrolled(recyclerView, i, i2);
                C49675Lx6 c49675Lx6 = (C49675Lx6) this.A01;
                if (c49675Lx6.A04) {
                    C49675Lx6.A03(c49675Lx6);
                }
                i3 = -78303637;
                C0f9.A0A(i3, A03);
                return;
            case 10:
                A032 = C0f9.A03(-1295048260);
                C14360o3.A0B(recyclerView, 0);
                super.onScrolled(recyclerView, i, i2);
                JXJ jxj = (JXJ) this.A01;
                AbstractC42425IqS abstractC42425IqS = jxj.A02;
                if (abstractC42425IqS != null) {
                    AbstractC70663Fe abstractC70663Fe3 = recyclerView.A0D;
                    if ((abstractC70663Fe3 instanceof LinearLayoutManager) && (linearLayoutManager3 = (LinearLayoutManager) abstractC70663Fe3) != null) {
                        int A1a2 = linearLayoutManager3.A1a();
                        int A1b = linearLayoutManager3.A1b();
                        if (A1a2 != -1 && A1b != -1 && A1a2 <= A1b) {
                            while (true) {
                                C3OO A0V = recyclerView.A0V(A1a2);
                                if (A0V != null) {
                                    C38196Gr1 c38196Gr1 = jxj.A03;
                                    if (c38196Gr1 != null) {
                                        List list = c38196Gr1.mDiffer.A02;
                                        C14360o3.A07(list);
                                        C31691Dvw c31691Dvw = (C31691Dvw) AbstractC001800i.A0O(list, A1a2);
                                        if ((A0V instanceof C38197Gr2) && c31691Dvw != null) {
                                            ((C38197Gr2) A0V).A00(abstractC42425IqS, c31691Dvw, A1a2, false);
                                        }
                                        if (A1a2 != A1b) {
                                            A1a2++;
                                        }
                                    }
                                }
                            }
                            str = "adapter";
                            C14360o3.A0F(str);
                            throw C00O.createAndThrow();
                        }
                    }
                    i4 = -342947713;
                    C0f9.A0A(i4, A032);
                    return;
                }
                str = "delegate";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 11:
                A032 = C0f9.A03(303993578);
                C14360o3.A0B(recyclerView, 0);
                RecyclerView recyclerView2 = ((JXJ) this.A01).A01;
                if (recyclerView2 != null) {
                    recyclerView2.setTranslationY(-recyclerView.computeVerticalScrollOffset());
                }
                i4 = -1080192851;
                C0f9.A0A(i4, A032);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A03 = C0f9.A03(1617370792);
                C14360o3.A0B(recyclerView, 0);
                super.onScrolled(recyclerView, i, i2);
                C49524Lud c49524Lud = (C49524Lud) this.A01;
                AbstractC42425IqS abstractC42425IqS2 = c49524Lud.A03;
                if (abstractC42425IqS2 != null) {
                    AbstractC70663Fe abstractC70663Fe4 = recyclerView.A0D;
                    if ((abstractC70663Fe4 instanceof FlexboxLayoutManager) && (flexboxLayoutManager = (FlexboxLayoutManager) abstractC70663Fe4) != null) {
                        View A0M = FlexboxLayoutManager.A0M(flexboxLayoutManager, 0, flexboxLayoutManager.A0T());
                        if (A0M == null) {
                            A0C = -1;
                        } else {
                            A0C = AbstractC70663Fe.A0C(A0M);
                        }
                        int i5 = -1;
                        View A0M2 = FlexboxLayoutManager.A0M(flexboxLayoutManager, flexboxLayoutManager.A0T() - 1, -1);
                        if (A0M2 != null) {
                            i5 = AbstractC70663Fe.A0C(A0M2);
                        }
                        if (A0C != -1 && i5 != -1 && A0C <= i5) {
                            while (true) {
                                C3OO A0V2 = recyclerView.A0V(A0C);
                                if (A0V2 != null) {
                                    C38196Gr1 c38196Gr12 = c49524Lud.A05;
                                    if (c38196Gr12 != null) {
                                        List list2 = c38196Gr12.mDiffer.A02;
                                        C14360o3.A07(list2);
                                        C31691Dvw c31691Dvw2 = (C31691Dvw) AbstractC001800i.A0O(list2, A0C);
                                        if ((A0V2 instanceof C38197Gr2) && c31691Dvw2 != null) {
                                            ((C38197Gr2) A0V2).A00(abstractC42425IqS2, c31691Dvw2, A0C, true);
                                        }
                                        if (A0C != i5) {
                                            A0C++;
                                        }
                                    }
                                }
                            }
                            str = "adapter";
                            C14360o3.A0F(str);
                            throw C00O.createAndThrow();
                        }
                    }
                    i3 = 1164871729;
                    C0f9.A0A(i3, A03);
                    return;
                }
                str = "delegate";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A03 = C0f9.A03(-1753977556);
                C14360o3.A0B(recyclerView, 0);
                View view = ((C49524Lud) this.A01).A00;
                if (view != null) {
                    view.setTranslationY(-recyclerView.computeVerticalScrollOffset());
                }
                i3 = -1986276583;
                C0f9.A0A(i3, A03);
                return;
        }
    }
}
