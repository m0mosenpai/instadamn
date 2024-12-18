package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.listview.CustomFadingEdgeListView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.KCa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45486KCa extends AbstractC59962oe implements InterfaceC60072op, C51D, MOQ, InterfaceC189498aU {
    public static final String __redex_internal_original_name = "EmojiPickerSheetFragment";
    public C47536Kz3 A00;
    public MOV A01;
    public AbstractC148206lq A02;
    public LQ6 A03;
    public LRC A04;
    public View A06;
    public ViewGroup A07;
    public ListView A08;
    public final C48582LeK A0A = new C48582LeK(this);
    public int A05 = 6;
    public final Integer A0B = C05F.A0N;
    public final InterfaceC09390do A09 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC189498aU
    public final void DON(int i) {
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "emoji_picker_sheet";
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<C23726Aez> A02;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC148206lq abstractC148206lq = this.A02;
        if (abstractC148206lq != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            if (abstractC148206lq instanceof C148196lp) {
                if (abstractC148206lq.A02().size() <= 7) {
                    A02 = Collections.emptyList();
                    C14360o3.A0A(A02);
                } else {
                    A02 = abstractC148206lq.A02().subList(7, abstractC148206lq.A02().size());
                }
            } else {
                A02 = abstractC148206lq.A02();
            }
            for (C23726Aez c23726Aez : A02) {
                C148336m3 c148336m3 = c23726Aez.A04;
                if (c148336m3 != null && c23726Aez.A02 == EnumC148326m2.A04) {
                    A1E.add(c148336m3);
                }
            }
            if (AbstractC25226BEj.A1b(A1E)) {
                C47536Kz3 c47536Kz3 = this.A00;
                if (c47536Kz3 == null) {
                    C14360o3.A0F("emojiSheetHolder");
                    throw C00O.createAndThrow();
                }
                KEE kee = c47536Kz3.A01;
                List A0X = AbstractC001800i.A0X(A1E);
                List list = kee.A01;
                list.clear();
                list.addAll(A0X);
                KEE.A00(kee);
            }
        }
    }

    @Override // X.MOQ
    public final Integer Acu() {
        return this.A0B;
    }

    @Override // X.InterfaceC189498aU
    public final void DOM() {
        LQ6 lq6 = this.A03;
        if (lq6 == null) {
            C14360o3.A0F("emojiSearchBarController");
            throw C00O.createAndThrow();
        }
        if (lq6.A00 && lq6.A01.getSearchString().length() == 0) {
            lq6.A00();
        }
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A09);
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        LQ6 lq6 = this.A03;
        if (lq6 == null) {
            C14360o3.A0F("emojiSearchBarController");
            throw C00O.createAndThrow();
        }
        if (lq6.A00) {
            lq6.A00();
            return true;
        }
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // X.C51D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isScrolledToTop() {
        /*
            r4 = this;
            boolean r0 = r4.isAdded()
            if (r0 != 0) goto L8
            r2 = 1
        L7:
            return r2
        L8:
            X.Kz3 r0 = r4.A00
            java.lang.String r1 = "emojiSheetHolder"
            if (r0 == 0) goto L41
            com.instagram.ui.listview.CustomFadingEdgeListView r0 = r0.A00
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L3b
            X.Kz3 r0 = r4.A00
            if (r0 == 0) goto L41
            com.instagram.ui.listview.CustomFadingEdgeListView r3 = r0.A00
        L1c:
            java.lang.reflect.Field r0 = X.LJW.A00
            r1 = 0
            int r0 = r3.getChildCount()
            r2 = 1
            if (r0 == 0) goto L7
            int r0 = r3.getFirstVisiblePosition()
            if (r0 != 0) goto L49
            android.view.View r0 = r3.getChildAt(r1)
            int r1 = r0.getTop()
            int r0 = r3.getPaddingTop()
            if (r1 < r0) goto L49
            return r2
        L3b:
            android.widget.ListView r3 = r4.A08
            if (r3 != 0) goto L1c
            java.lang.String r1 = "searchResultsListView"
        L41:
            X.C14360o3.A0F(r1)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L49:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45486KCa.isScrolledToTop():boolean");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(639039348);
        super.onCreate(bundle);
        if (this.mArguments != null) {
            C0f9.A09(1713771041, A02);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A09(-102463956, A02);
            throw A0g;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-423699357);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_emoji_picker, viewGroup, false);
        this.A06 = inflate;
        if (inflate != null) {
            this.A07 = AbstractC31173DnH.A0F(inflate, R.id.asset_items_container);
            View view = this.A06;
            if (view != null) {
                this.A08 = (ListView) view.requireViewById(R.id.assets_search_results_list);
                View view2 = this.A06;
                if (view2 != null) {
                    this.A03 = new LQ6(view2, this);
                    InterfaceC09390do interfaceC09390do = this.A09;
                    UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                    View view3 = this.A06;
                    if (view3 != null) {
                        C48582LeK c48582LeK = this.A0A;
                        this.A04 = new LRC(view3, this, A0r, this, c48582LeK, this);
                        View view4 = this.A06;
                        if (view4 != null) {
                            Context A0L = AbstractC166997dE.A0L(view4);
                            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                            ViewGroup viewGroup2 = this.A07;
                            String str = "assetItemsContainer";
                            if (viewGroup2 != null) {
                                int i = this.A05;
                                AbstractC167007dF.A1F(A0r2, 1, c48582LeK);
                                View inflate2 = LayoutInflater.from(A0L).inflate(R.layout.layout_fading_edge_listview, viewGroup2, false);
                                C14360o3.A0C(inflate2, "null cannot be cast to non-null type com.instagram.ui.listview.CustomFadingEdgeListView");
                                inflate2.setTag(new C47536Kz3(A0L, viewGroup2, this, A0r2, (CustomFadingEdgeListView) inflate2, c48582LeK, i, AbstractC43594JPz.A03(A0L)));
                                Object tag = inflate2.getTag();
                                C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.EmojiSheetWithRecentViewBinder.Holder");
                                C47536Kz3 c47536Kz3 = (C47536Kz3) tag;
                                this.A00 = c47536Kz3;
                                ViewGroup viewGroup3 = this.A07;
                                if (viewGroup3 != null) {
                                    if (c47536Kz3 == null) {
                                        str = "emojiSheetHolder";
                                    } else {
                                        viewGroup3.addView(c47536Kz3.A00);
                                        View view5 = this.A06;
                                        if (view5 != null) {
                                            C0f9.A09(-892841606, A02);
                                            return view5;
                                        }
                                    }
                                }
                            }
                            C14360o3.A0F(str);
                            throw C00O.createAndThrow();
                        }
                    }
                }
            }
        }
        C14360o3.A0F("container");
        throw C00O.createAndThrow();
    }
}
