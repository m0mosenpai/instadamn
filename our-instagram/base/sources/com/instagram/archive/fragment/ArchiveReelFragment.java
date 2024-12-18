package com.instagram.archive.fragment;

import X.AbstractC111324zv;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25229BEm;
import X.AbstractC25230BEn;
import X.AbstractC31172DnG;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC31282Dp4;
import X.AbstractC37300Gc1;
import X.AbstractC43594JPz;
import X.AbstractC47119KsE;
import X.AbstractC50102Ry;
import X.AbstractC50522MSa;
import X.AbstractC53791Nqh;
import X.AbstractC54912fq;
import X.AbstractC56402iY;
import X.AbstractC60622pl;
import X.C006802i;
import X.C05F;
import X.C0f9;
import X.C14360o3;
import X.C153126ug;
import X.C187198Rm;
import X.C187218Ro;
import X.C187318Ry;
import X.C1I2;
import X.C1OU;
import X.C1VN;
import X.C24135AnK;
import X.C26078Bg7;
import X.C26086BgF;
import X.C27961Xa;
import X.C38321qM;
import X.C38C;
import X.C38E;
import X.C38H;
import X.C38K;
import X.C3G2;
import X.C3G5;
import X.C3G6;
import X.C41181vS;
import X.C44110Jea;
import X.C4VX;
import X.C4VZ;
import X.C51039Mgp;
import X.C52100N3a;
import X.C52196N8l;
import X.C52771NXb;
import X.C52942bb;
import X.C54587O9o;
import X.C54922fr;
import X.C55197Oe4;
import X.C55897Orl;
import X.C56552P8y;
import X.C57012jc;
import X.C61372qz;
import X.C62882tR;
import X.C64842wi;
import X.C69720VuF;
import X.C6WQ;
import X.C6X4;
import X.C75363a3;
import X.C9GR;
import X.EnumC153216up;
import X.EnumC40111tc;
import X.EnumC53243Ngg;
import X.GHN;
import X.InterfaceC147106jm;
import X.InterfaceC1571373s;
import X.InterfaceC187288Rv;
import X.InterfaceC56362iU;
import X.InterfaceC57916PmM;
import X.InterfaceC57920PmQ;
import X.InterfaceC57921PmR;
import X.InterfaceC58021Po7;
import X.InterfaceC58108PpX;
import X.InterfaceC60072op;
import X.InterfaceC60092or;
import X.InterfaceC60122ou;
import X.InterfaceC60132ov;
import X.InterfaceC63982vJ;
import X.JPR;
import X.MSW;
import X.MSX;
import X.MSY;
import X.MUU;
import X.N3U;
import X.N3Y;
import X.N3Z;
import X.NDR;
import X.NSC;
import X.O73;
import X.OF4;
import X.OIL;
import X.OJ8;
import X.OMj;
import X.Ow3;
import X.P72;
import X.P8M;
import X.ViewOnClickListenerC55467OkM;
import X.ViewOnTouchListenerC195698lA;
import X.ViewOnTouchListenerC60632pm;
import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.ReelAutoArchiveSettingStr;
import com.instagram.archive.fragment.ArchiveReelFragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.model.reels.ReelViewerContextButtonType;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes9.dex */
public class ArchiveReelFragment extends C38K implements InterfaceC60072op, InterfaceC187288Rv, InterfaceC147106jm, InterfaceC60092or, AbsListView.OnScrollListener, InterfaceC60122ou, JPR, InterfaceC60132ov, InterfaceC58108PpX, InterfaceC63982vJ, InterfaceC58021Po7, InterfaceC57916PmM {
    public C52196N8l A00;
    public Ow3 A01;
    public EnumC53243Ngg A02;
    public C51039Mgp A03;
    public UserSession A04;
    public C187198Rm A05;
    public C187218Ro A06;
    public C38E A07;
    public C6WQ A08;
    public Runnable A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public int A0J;
    public OMj A0K;
    public OIL A0L;
    public ViewOnTouchListenerC60632pm A0M;
    public C187318Ry A0N;
    public C64842wi A0O;
    public ViewOnTouchListenerC195698lA A0P;
    public ArrayList A0Q;
    public boolean A0R;
    public View mContextualNavigationAnimationTargetView;
    public C62882tR mDropFrameWatcher;
    public EmptyStateView mEmptyStateView;
    public C57012jc mFastScrollStubHolder;
    public C69720VuF mViewPortObserver;
    public final C61372qz A0U = new C61372qz();
    public final Set A0S = AbstractC166987dD.A1H();
    public final Set A0T = AbstractC166987dD.A1H();

    @Override // X.InterfaceC60132ov
    public final boolean CcV() {
        return true;
    }

    @Override // X.InterfaceC58021Po7
    public final void CxF(C56552P8y c56552P8y, Reel reel, List list, int i, int i2, int i3, boolean z) {
        String str;
        boolean z2 = this.A0R;
        UserSession userSession = this.A04;
        if (z2) {
            C41181vS A0A = reel.A0A(userSession, i3);
            if (!A0A.A1h() && !z) {
                Context context = getContext();
                int i4 = 2131963599;
                if (A0A.A1o()) {
                    i4 = 2131963600;
                }
                if (A0A.A1o()) {
                    str = "highlights_edit_video_cannot_be_selected";
                } else {
                    str = "highlights_edit_photo_cannot_be_selected";
                }
                C9GR.A0F(context, str, i4);
                return;
            }
            if (this.A0I) {
                this.A05.getClass();
                C38321qM c38321qM = A0A.A0b;
                if (c38321qM == null) {
                    return;
                }
                C187198Rm c187198Rm = this.A05;
                if (z) {
                    String id = c38321qM.getId();
                    id.getClass();
                    c187198Rm.A09(id);
                } else {
                    c187198Rm.A08(this.A0N, c38321qM);
                }
                C55197Oe4.A00(this.A00.A08).A07(c38321qM);
                return;
            }
            C38321qM c38321qM2 = A0A.A0b;
            if (c38321qM2 == null) {
                return;
            }
            this.A0L.A00(c38321qM2, AbstractC167007dF.A1X(c38321qM2.BRp(), EnumC40111tc.A0Q));
            return;
        }
        A07(this, reel.A0A(userSession, i3));
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Reel A0R = MSY.A0R(this.A04, AbstractC166987dD.A1B(it));
            if (A0R != null) {
                A1E.add(A0R);
            }
        }
        C38E c38e = this.A07;
        if (c38e == null) {
            c38e = new C38E(this, this.A04, new C38C(this));
            this.A07 = c38e;
        }
        c38e.A0C = this.A0B;
        c38e.A05 = new NSC(getActivity(), AbstractC37300Gc1.A02(this), this, this.A00, this);
        c38e.A0D = this.A04.userId;
        C38H c38h = new C38H();
        c38h.A00 = ReelViewerContextButtonType.A03;
        c38h.A06 = false;
        c38e.A03 = new ReelViewerConfig(c38h);
        c38e.A07(reel, C3G2.A08, c56552P8y, A1E, A1E, i3);
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ void D54(Integer num) {
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ void DCd(int i) {
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void DHC(Reel reel, C6X4 c6x4) {
    }

    @Override // X.InterfaceC147106jm
    public final void DRJ(String str, String str2) {
    }

    @Override // X.InterfaceC147106jm
    public final void DSI(String str, String str2) {
    }

    @Override // X.InterfaceC147106jm
    public final void DSL(String str, String str2) {
    }

    @Override // X.JPR
    public final void DXQ() {
    }

    @Override // X.JPR
    public final void DXZ() {
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ void DkG() {
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ void Dve(C26086BgF c26086BgF) {
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ void Dvh() {
    }

    public static void A01(ArchiveReelFragment archiveReelFragment) {
        EnumC153216up enumC153216up;
        EmptyStateView emptyStateView;
        InterfaceC1571373s c44110Jea;
        EmptyStateView emptyStateView2 = archiveReelFragment.mEmptyStateView;
        EnumC153216up enumC153216up2 = EnumC153216up.A04;
        emptyStateView2.A0R(enumC153216up2, R.drawable.loadmore_icon_refresh_compound);
        archiveReelFragment.mEmptyStateView.A0N(new ViewOnClickListenerC55467OkM(archiveReelFragment, 9), enumC153216up2);
        ReelAutoArchiveSettingStr BlR = AbstractC31174DnI.A0m(archiveReelFragment.A04).BlR();
        if (BlR == null) {
            BlR = ReelAutoArchiveSettingStr.A07;
        }
        int ordinal = BlR.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    EmptyStateView emptyStateView3 = archiveReelFragment.mEmptyStateView;
                    EnumC153216up enumC153216up3 = EnumC153216up.A02;
                    emptyStateView3.A0T(enumC153216up3, 2131974459);
                    archiveReelFragment.mEmptyStateView.A0S(enumC153216up3, 2131974457);
                    archiveReelFragment.mEmptyStateView.A0U(enumC153216up3, "");
                }
                archiveReelFragment.mEmptyStateView.A0R(EnumC153216up.A02, R.drawable.empty_state_private);
            }
            EmptyStateView emptyStateView4 = archiveReelFragment.mEmptyStateView;
            enumC153216up = EnumC153216up.A02;
            emptyStateView4.A0T(enumC153216up, 2131974459);
            archiveReelFragment.mEmptyStateView.A0S(enumC153216up, 2131974457);
            archiveReelFragment.mEmptyStateView.A0Q(enumC153216up, 2131974455);
            emptyStateView = archiveReelFragment.mEmptyStateView;
            c44110Jea = new GHN(archiveReelFragment, 0);
        } else {
            EmptyStateView emptyStateView5 = archiveReelFragment.mEmptyStateView;
            enumC153216up = EnumC153216up.A02;
            emptyStateView5.A0T(enumC153216up, 2131974460);
            archiveReelFragment.mEmptyStateView.A0S(enumC153216up, 2131974458);
            archiveReelFragment.mEmptyStateView.A0Q(enumC153216up, 2131974456);
            emptyStateView = archiveReelFragment.mEmptyStateView;
            c44110Jea = new C44110Jea(archiveReelFragment, 0);
        }
        emptyStateView.A0O(c44110Jea, enumC153216up);
        archiveReelFragment.mEmptyStateView.A0R(EnumC153216up.A02, R.drawable.empty_state_private);
    }

    public static void A03(ArchiveReelFragment archiveReelFragment) {
        int i;
        archiveReelFragment.mFastScrollStubHolder.getClass();
        ListView A02 = AbstractC37300Gc1.A02(archiveReelFragment);
        A02.setVerticalScrollBarEnabled(false);
        int A00 = AbstractC53791Nqh.A00(archiveReelFragment.requireContext());
        C52196N8l c52196N8l = archiveReelFragment.A00;
        int count = c52196N8l.getCount();
        if (count > 0) {
            i = AbstractC50522MSa.A07(c52196N8l.getView(count - 1, null, AbstractC37300Gc1.A02(archiveReelFragment)), MSX.A03(archiveReelFragment), Integer.MIN_VALUE);
        } else {
            i = 0;
        }
        ViewOnTouchListenerC195698lA viewOnTouchListenerC195698lA = archiveReelFragment.A0P;
        if (viewOnTouchListenerC195698lA != null) {
            archiveReelFragment.A0U.A00.remove(viewOnTouchListenerC195698lA);
        }
        UserSession userSession = archiveReelFragment.A04;
        C52771NXb c52771NXb = new C52771NXb(A02);
        C52196N8l c52196N8l2 = archiveReelFragment.A00;
        View A01 = archiveReelFragment.mFastScrollStubHolder.A01();
        int i2 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        AbstractC43594JPz.A1P(c52196N8l2, A01);
        ViewOnTouchListenerC195698lA viewOnTouchListenerC195698lA2 = new ViewOnTouchListenerC195698lA(A01, userSession, c52196N8l2, new C24135AnK(c52771NXb, c52196N8l2, A00, i), c52771NXb, c52196N8l2);
        archiveReelFragment.A0P = viewOnTouchListenerC195698lA2;
        viewOnTouchListenerC195698lA2.A00 = 0.0f;
        archiveReelFragment.A0U.A01(viewOnTouchListenerC195698lA2);
    }

    public static void A04(ArchiveReelFragment archiveReelFragment) {
        ArrayList arrayList = archiveReelFragment.A0Q;
        if (arrayList != null) {
            C55197Oe4 A00 = C55197Oe4.A00(archiveReelFragment.A00.A08);
            A00.A05.clear();
            A00.A07.clear();
            Iterator it = A00.A06.iterator();
            while (it.hasNext()) {
                ((InterfaceC57916PmM) it.next()).DSF();
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                C52196N8l c52196N8l = archiveReelFragment.A00;
                N3U n3u = c52196N8l.A03;
                C14360o3.A0B(next, 0);
                if (n3u.A04.containsKey(next)) {
                    Number A0Q = AbstractC37300Gc1.A0Q(next, n3u.A03);
                    A0Q.getClass();
                    C38321qM c38321qM = ((OF4) n3u.A01.get(A0Q.intValue())).A02;
                    c38321qM.getClass();
                    C55197Oe4.A00(c52196N8l.A08).A07(c38321qM);
                }
            }
        }
    }

    public static void A05(ArchiveReelFragment archiveReelFragment) {
        int i;
        long j;
        Integer num;
        C51039Mgp c51039Mgp = archiveReelFragment.A03;
        List<OJ8> A00 = C51039Mgp.A00(c51039Mgp.A05, (Map) ((C26078Bg7) c51039Mgp.A08.getValue()).A02, c51039Mgp.A0B);
        ArrayList A0q = AbstractC25230BEn.A0q(A00);
        for (OJ8 oj8 : A00) {
            C41181vS c41181vS = oj8.A03;
            Reel reel = oj8.A02;
            if (oj8 instanceof N3Y) {
                c41181vS.getClass();
                i = oj8.A00;
                j = oj8.A01;
                num = C05F.A0N;
            } else {
                if (oj8 instanceof N3Z) {
                    i = oj8.A00;
                    j = oj8.A01;
                    num = C05F.A01;
                } else if (oj8 instanceof C52100N3a) {
                    i = oj8.A00;
                    j = oj8.A01;
                    num = C05F.A0C;
                }
                c41181vS = null;
            }
            A0q.add(new OF4(reel, c41181vS, num, i, j));
        }
        archiveReelFragment.A00.A0D(A0q);
        A06(archiveReelFragment);
    }

    public static void A06(ArchiveReelFragment archiveReelFragment) {
        if (archiveReelFragment.mEmptyStateView != null) {
            if (((C26078Bg7) archiveReelFragment.A03.A09.getValue()).A03 == C05F.A01) {
                archiveReelFragment.mEmptyStateView.A0L();
            } else if (((C26078Bg7) archiveReelFragment.A03.A09.getValue()).A03 == C05F.A00) {
                archiveReelFragment.mEmptyStateView.A0J();
            } else {
                boolean isEmpty = archiveReelFragment.A00.isEmpty();
                EmptyStateView emptyStateView = archiveReelFragment.mEmptyStateView;
                if (isEmpty) {
                    emptyStateView.A0P(EnumC153216up.A02);
                } else {
                    emptyStateView.A0K();
                }
            }
            archiveReelFragment.mEmptyStateView.A0I();
        }
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return this.A04;
    }

    @Override // X.InterfaceC60132ov
    public final ViewOnTouchListenerC60632pm BDY() {
        return this.A0M;
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ boolean Ceo() {
        return false;
    }

    @Override // X.InterfaceC58108PpX
    public final void CzI(String str, Integer num) {
        View view;
        if (num == C05F.A00 && (view = this.mContextualNavigationAnimationTargetView) != null) {
            view.setVisibility(4);
        }
    }

    @Override // X.InterfaceC58108PpX
    public final void DH6(String str, Integer num) {
        if (num == C05F.A00) {
            AbstractC167007dF.A0w(this.mContextualNavigationAnimationTargetView);
        }
    }

    @Override // X.InterfaceC147106jm
    public final void DOA(String str) {
        this.A0K.A05(str, C05F.A00);
    }

    @Override // X.InterfaceC147106jm
    public final void DOB(String str) {
        this.A0K.A03(str);
    }

    @Override // X.InterfaceC147106jm
    public final void DOC(String str, boolean z) {
        Reel A0R;
        if (((Map) ((C26078Bg7) this.A03.A08.getValue()).A02).containsKey(str) && !z && (A0R = MSY.A0R(this.A04, str)) != null && !A0R.A15(this.A04)) {
            this.A0K.A02(str);
            A05(this);
            this.A0K.A01(str);
        }
    }

    @Override // X.InterfaceC147106jm
    public final void DRW(String str, String str2) {
        this.A0K.A05(str, C05F.A01);
    }

    @Override // X.InterfaceC58108PpX
    public final void DaM(final String str, Integer num) {
        O73 o73;
        String str2;
        Number A0Q;
        int intValue;
        if (num == C05F.A00 && (o73 = (O73) Ow3.A00(this.A04).A03.get(str)) != null && (str2 = o73.A01) != null && (A0Q = AbstractC37300Gc1.A0Q(str2, this.A00.A0F)) != null && (intValue = A0Q.intValue()) >= 0 && intValue < this.A00.getCount()) {
            final ListView A02 = AbstractC37300Gc1.A02(this);
            A02.setSelection(intValue);
            Object item = this.A00.getItem(intValue);
            if (item instanceof C54587O9o) {
                C54587O9o c54587O9o = (C54587O9o) item;
                String str3 = o73.A01;
                if (str3 != null) {
                    int i = 0;
                    while (true) {
                        C153126ug c153126ug = c54587O9o.A00;
                        if (i < c153126ug.A01()) {
                            if (AbstractC50102Ry.A00(((OF4) c153126ug.A02(i)).A07, str3)) {
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            i = -1;
                            break;
                        }
                    }
                    int A0K = i + AbstractC167017dG.A0K(o73.A00);
                    if (A0K != -1) {
                        final int i2 = intValue + (A0K / 3);
                        final int i3 = A0K % 3;
                        if (i2 != intValue) {
                            A02.setSelection(i2);
                        }
                        A02.post(new Runnable() { // from class: X.PTW
                            @Override // java.lang.Runnable
                            public final void run() {
                                ArchiveReelFragment archiveReelFragment = this;
                                ListView listView = A02;
                                int i4 = i2;
                                int i5 = i3;
                                String str4 = str;
                                ArchiveReelFragment.A02(archiveReelFragment);
                                View childAt = listView.getChildAt(i4 - listView.getFirstVisiblePosition());
                                if (childAt != null && childAt.getTag() != null && (childAt.getTag() instanceof C54760OHp)) {
                                    MediaFrameLayout A00 = ((C54760OHp) childAt.getTag()).A00(i5);
                                    archiveReelFragment.mContextualNavigationAnimationTargetView = A00;
                                    RectF A0A = AbstractC31174DnI.A0A(listView);
                                    RectF A0G = AbstractC13880nE.A0G(A00);
                                    A0G.offset(-A0A.left, 0.0f);
                                    archiveReelFragment.A01.A02.put(str4, A0G);
                                }
                            }
                        });
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ boolean Ejf() {
        return false;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        int i;
        int i2;
        if (this.A0I) {
            interfaceC56362iU.Efu(2131974453);
            if (this.A0I) {
                i2 = 10;
            } else {
                i2 = 8;
                if (this.A0H) {
                    i2 = 11;
                }
            }
            interfaceC56362iU.AAF(new ViewOnClickListenerC55467OkM(this, i2), 2131961124);
            View view = this.mView;
            if (view != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.topMargin = interfaceC56362iU.AYS();
                view.setLayoutParams(marginLayoutParams);
            }
        } else if (this.A00.Bsh().isEmpty()) {
            int i3 = 2131956960;
            if (this.A0H) {
                i3 = 2131956944;
            }
            interfaceC56362iU.Efu(i3);
            interfaceC56362iU.AAC(2131968535);
        } else {
            interfaceC56362iU.setTitle(AbstractC43594JPz.A0t(AbstractC166997dE.A0N(this), this.A00.Bsh().size(), 2131963618));
            if (this.A0I) {
                i = 10;
            } else {
                i = 8;
                if (this.A0H) {
                    i = 11;
                }
            }
            interfaceC56362iU.AAF(new ViewOnClickListenerC55467OkM(this, i), 2131968535);
        }
        interfaceC56362iU.EkS(true);
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ boolean getCanHaveEmptySegments() {
        return false;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        if (this.A0R) {
            return "reel_highlights_gallery";
        }
        return "archive_stories_tab";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (this.A0C && C1VN.A00 != null) {
            AbstractC31282Dp4.A00().A02(this.A04, requireActivity(), "317728068821307");
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0075, code lost:
    
        if (r30.A00.isEmpty() != false) goto L6;
     */
    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r31, android.os.Bundle r32) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.archive.fragment.ArchiveReelFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static void A02(ArchiveReelFragment archiveReelFragment) {
        ListView A02 = AbstractC37300Gc1.A02(archiveReelFragment);
        if (A02 != null) {
            int lastVisiblePosition = A02.getLastVisiblePosition();
            ArrayList A1E = AbstractC166987dD.A1E();
            boolean z = false;
            for (int firstVisiblePosition = A02.getFirstVisiblePosition(); firstVisiblePosition <= lastVisiblePosition; firstVisiblePosition++) {
                Object item = archiveReelFragment.A00.getItem(firstVisiblePosition);
                if (item instanceof C54587O9o) {
                    C153126ug c153126ug = ((C54587O9o) item).A00;
                    for (int i = 0; i < c153126ug.A01(); i++) {
                        OF4 of4 = (OF4) c153126ug.A02(i);
                        if (of4.A03 != null && of4.A03.getId().equals("placeholder")) {
                            z = true;
                        }
                        if (of4.A03 != null && !of4.A03.A0z(archiveReelFragment.A04)) {
                            Set set = archiveReelFragment.A0S;
                            if (!set.contains(of4.A03.getId())) {
                                String id = of4.A03.getId();
                                A1E.add(id);
                                set.add(id);
                            }
                        }
                    }
                }
            }
            P8M p8m = new P8M(0, archiveReelFragment, A1E);
            if (z) {
                C51039Mgp.A01(archiveReelFragment.A03, archiveReelFragment.A0A, false);
            }
            archiveReelFragment.A0T.add(p8m);
            if (!A1E.isEmpty()) {
                Iterator it = A1E.iterator();
                while (it.hasNext()) {
                    archiveReelFragment.A0K.A04(AbstractC166987dD.A1B(it));
                }
                UserSession userSession = archiveReelFragment.A04;
                C1OU c1ou = C1OU.$redex_init_class;
                C14360o3.A0B(userSession, 0);
                C3G6.A00(userSession).A05(C3G5.A0I, p8m, archiveReelFragment.getModuleName(), null, A1E);
            }
        }
    }

    public static void A07(ArchiveReelFragment archiveReelFragment, C41181vS c41181vS) {
        C75363a3 A0M;
        if (c41181vS.A1o() && (A0M = c41181vS.A0M(archiveReelFragment.A04)) != null) {
            C4VX c4vx = new C4VX(archiveReelFragment.requireContext(), archiveReelFragment.A04, A0M, archiveReelFragment.getModuleName());
            c4vx.A03 = true;
            c4vx.A02 = true;
            C4VZ.A00(c4vx.A00());
        }
    }

    @Override // X.InterfaceC58021Po7
    public final void CxH(OF4 of4) {
        C9GR.A0F(requireContext(), "archive_media_unavailable", 2131953168);
    }

    @Override // X.InterfaceC57916PmM
    public final void DSF() {
        AbstractC31176DnK.A0J(this).A0T();
    }

    @Override // X.InterfaceC60092or
    public final void EMT() {
        AbstractC47119KsE.A00(AbstractC37300Gc1.A02(this), this);
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        C1VN A00;
        FragmentActivity requireActivity;
        UserSession userSession;
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == 401) {
            if (i2 == -1) {
                if (intent != null) {
                    final ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(AbstractC111324zv.A00(330));
                    final ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra(AbstractC111324zv.A00(678));
                    this.A09 = new Runnable() { // from class: X.PSC
                        @Override // java.lang.Runnable
                        public final void run() {
                            ArchiveReelFragment archiveReelFragment = ArchiveReelFragment.this;
                            C35223FgG.A02(archiveReelFragment.requireActivity(), archiveReelFragment, archiveReelFragment.A04, "return_from_archive", "archive_share", parcelableArrayListExtra, parcelableArrayListExtra2);
                            archiveReelFragment.A09 = null;
                        }
                    };
                    if (C1VN.A00 != null) {
                        A00 = AbstractC31282Dp4.A00();
                        requireActivity = requireActivity();
                        userSession = this.A04;
                        str = "337086033562830";
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                if (C1VN.A00 == null) {
                    return;
                }
                A00 = AbstractC31282Dp4.A00();
                requireActivity = requireActivity();
                userSession = this.A04;
                str = "309151609683923";
            }
            A00.A02(userSession, requireActivity, str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Window A0H;
        int A02 = C0f9.A02(-1131953374);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        boolean z = requireArguments.getBoolean("is_in_archive_home", false);
        this.A0R = requireArguments.getBoolean("archive_multi_select_mode", false);
        boolean z2 = requireArguments.getBoolean("is_standalone_reel_archive", false);
        this.A0F = requireArguments.getBoolean("hide_privacy_footer", false);
        if (requireArguments.getSerializable("highlight_management_source") != null) {
            this.A02 = (EnumC53243Ngg) requireArguments.getSerializable("highlight_management_source");
        }
        this.A0G = requireArguments.getBoolean("is_archive_home_badged", false);
        this.A0H = requireArguments.getBoolean("is_in_clips_creation_flow", false);
        this.A0I = requireArguments.getBoolean("is_remote_media_picker", false);
        this.A0Q = requireArguments.getStringArrayList("initial_selected_media_ids");
        this.A0A = requireArguments().getString("edit_highlights_reel_id");
        this.A04 = AbstractC31176DnK.A0S(this);
        this.A0K = new OMj(AbstractC25229BEm.A0a(this), C006802i.A0p);
        this.A01 = Ow3.A00(this.A04);
        if (bundle == null && z2) {
            C55197Oe4.A04(this.A04);
        }
        this.A0L = new OIL(requireContext(), new InterfaceC57920PmQ() { // from class: X.Oqt
            @Override // X.InterfaceC57920PmQ
            public final int BXj() {
                return C55197Oe4.A00(ArchiveReelFragment.this.A04).A05.size();
            }
        }, new InterfaceC57921PmR() { // from class: X.Oqv
            @Override // X.InterfaceC57921PmR
            public final void D6v(C38321qM c38321qM) {
                ArchiveReelFragment archiveReelFragment = ArchiveReelFragment.this;
                if (c38321qM != null) {
                    C55197Oe4.A00(archiveReelFragment.A00.A08).A07(c38321qM);
                }
            }
        });
        C27961Xa A00 = AbstractC54912fq.A00();
        C55897Orl c55897Orl = new C55897Orl(this);
        UserSession userSession = this.A04;
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A06;
        C54922fr A0S = AbstractC31175DnJ.A0S();
        A0S.A04 = new P72(this, 0);
        A0S.A08 = new MUU(this, 0);
        this.A0O = A00.A03(this, c55897Orl, userSession, A0S.A00(), quickPromotionSlot);
        this.A00 = new C52196N8l(requireActivity(), requireContext(), this, this, this, this, this, this.A04, this.A0O, z2, z, false, this.A0F, false);
        this.A0O.DiZ();
        A0U(this.A00);
        C52196N8l c52196N8l = this.A00;
        c52196N8l.A02 = this.A0R;
        c52196N8l.A0C();
        this.A0B = AbstractC166997dE.A0n();
        this.A03 = (C51039Mgp) new C52942bb(new NDR(AbstractC25229BEm.A0a(this), this.A04, getModuleName(), z, this.A0H), getViewModelStore()).A00(C51039Mgp.class);
        this.A0J = AbstractC43594JPz.A06(requireContext());
        Context requireContext = requireContext();
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        this.A0M = AbstractC60622pl.A00(requireContext, null, false);
        C51039Mgp.A01(this.A03, this.A0A, true);
        if (this.A0I && (A0H = AbstractC31174DnI.A0H(this)) != null) {
            View decorView = A0H.getDecorView();
            if (AbstractC56402iY.A0B(decorView, A0H)) {
                AbstractC56402iY.A07(decorView, A0H, false);
            }
        }
        C0f9.A09(-259044417, A02);
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1345131084);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.layout_feed);
        C0f9.A09(1289206806, A02);
        return A0A;
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1553111013);
        super.onDestroyView();
        UserSession userSession = this.A04;
        MSW.A1X(userSession);
        C3G6.A00(userSession).A08(this);
        unregisterLifecycleListener(this.mDropFrameWatcher);
        C61372qz c61372qz = this.A0U;
        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A0M;
        ArrayList arrayList = c61372qz.A00;
        arrayList.remove(viewOnTouchListenerC60632pm);
        ViewOnTouchListenerC195698lA viewOnTouchListenerC195698lA = this.A0P;
        if (viewOnTouchListenerC195698lA != null) {
            arrayList.remove(viewOnTouchListenerC195698lA);
        }
        this.A01.A04.remove(this);
        ArchiveReelFragmentLifecycleUtil.cleanupReferences(this);
        C0f9.A09(111825219, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-589546467);
        super.onPause();
        C55197Oe4.A00(this.A04).A06.remove(this);
        C55197Oe4 A00 = C55197Oe4.A00(this.A04);
        A00.A06.remove(this.A00);
        this.mViewPortObserver.A01();
        C0f9.A09(-1347532810, A02);
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1709929027);
        super.onResume();
        C55197Oe4.A00(this.A04).A06.add(this);
        C55197Oe4 A00 = C55197Oe4.A00(this.A04);
        A00.A06.add(this.A00);
        Runnable runnable = this.A09;
        if (runnable != null) {
            runnable.run();
        }
        A01(this);
        A05(this);
        this.mViewPortObserver.A00();
        A02(this);
        C0f9.A09(-688615862, A02);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A03 = C0f9.A03(-1571032066);
        this.A0U.onScroll(absListView, i, i2, i3);
        C0f9.A0A(881284529, A03);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A03 = C0f9.A03(-1078772019);
        this.A0U.onScrollStateChanged(absListView, i);
        C0f9.A0A(904329432, A03);
    }

    @Override // X.InterfaceC63982vJ
    public final void Ddi(Reel reel) {
        A05(this);
    }

    @Override // X.InterfaceC63982vJ
    public final void DeI(Reel reel) {
        A05(this);
    }
}
