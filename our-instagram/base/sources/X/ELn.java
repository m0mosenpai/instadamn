package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public abstract class ELn extends AbstractC59962oe implements InterfaceC60072op, C51D, InterfaceC60122ou, GYQ {
    public static final String __redex_internal_original_name = "AudiencePickerFragment";
    public EQ8 A00;
    public GFg A01;
    public String A02;
    public final C35167FfI A03 = new C35167FfI();
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    public static void A01(ELn eLn, Object obj) {
        C14360o3.A0B(obj, 0);
        eLn.A00 = new EQ8(eLn.requireContext(), eLn, eLn, eLn, eLn, eLn, eLn.A0C(), true, false);
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
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
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
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

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) AbstractC166997dE.A0R(view, R.id.search_box);
        View A0S = AbstractC166997dE.A0S(view, R.id.search_exit_button);
        this.A01 = new GFg(requireContext(), A0S, AbstractC018607g.A00(this), AbstractC166987dD.A0r(this.A04), igdsInlineSearchBox, A0A(), this.A02);
        RecyclerView A0D = AbstractC31178DnM.A0D(view);
        AbstractC31178DnM.A0z(this, A0D);
        A0D.setAdapter(A0A());
        E0L.A00(A0D, igdsInlineSearchBox, 22);
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final EQ8 A0A() {
        EQ8 eq8 = this.A00;
        if (eq8 != null) {
            return eq8;
        }
        C14360o3.A0F("listAdapter");
        throw C00O.createAndThrow();
    }

    public final GFg A0B() {
        GFg gFg = this.A01;
        if (gFg != null) {
            return gFg;
        }
        C14360o3.A0F("searchController");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0067, code lost:
    
        return X.C05F.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        if (r2.equals("collapsed") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r2.equals("collapsed") != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer A0C() {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C33149Ejs
            if (r0 == 0) goto L3c
            r0 = r4
            X.Ejs r0 = (X.C33149Ejs) r0
            X.0do r0 = r0.A06
            X.0ll r3 = X.AbstractC166987dD.A0o(r0)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36885020224389726(0x830abb0002025e, double:3.38957354173458E-306)
            java.lang.String r2 = X.C18U.A04(r2, r3, r0)
            int r1 = r2.hashCode()
            r0 = 497541391(0x1da7e10f, float:4.4437237E-21)
            if (r1 == r0) goto L31
            r0 = 1880183383(0x70115257, float:1.7989948E29)
            if (r1 != r0) goto L2e
            java.lang.String r0 = "collapsed"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L65
        L2e:
            java.lang.Integer r0 = X.C05F.A00
            return r0
        L31:
            java.lang.String r0 = "facepile"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L2e
            java.lang.Integer r0 = X.C05F.A01
            return r0
        L3c:
            boolean r0 = r4 instanceof X.C33151Eju
            if (r0 == 0) goto L2e
            r0 = r4
            X.Eju r0 = (X.C33151Eju) r0
            X.0do r0 = r0.A09
            com.instagram.common.session.UserSession r3 = X.AbstractC166987dD.A0r(r0)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36882821201658319(0x8308bb000a01cf, double:3.3881828709044847E-306)
            java.lang.String r2 = X.C18U.A04(r2, r3, r0)
            int r1 = r2.hashCode()
            r0 = 1880183383(0x70115257, float:1.7989948E29)
            if (r1 != r0) goto L2e
            java.lang.String r0 = "collapsed"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L2e
        L65:
            java.lang.Integer r0 = X.C05F.A0C
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ELn.A0C():java.lang.Integer");
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isScrolledToTop() {
        if (this instanceof C33152Ejv) {
            C33152Ejv c33152Ejv = (C33152Ejv) this;
            RecyclerView recyclerView = c33152Ejv.A00;
            if (recyclerView != null) {
                if (recyclerView.getChildCount() != 0) {
                    RecyclerView recyclerView2 = c33152Ejv.A00;
                    if (recyclerView2 != null) {
                        if (recyclerView2.computeVerticalScrollOffset() != 0) {
                            return false;
                        }
                    }
                }
            }
            C14360o3.A0F("recyclerView");
            throw C00O.createAndThrow();
        }
        return true;
    }

    public static Context A00(SpannableStringBuilder spannableStringBuilder, Fragment fragment, CharSequence charSequence, int i) {
        spannableStringBuilder.append((CharSequence) fragment.getString(i)).append(" ").append(charSequence);
        return fragment.requireContext();
    }

    public static void A02(GFg gFg, User user) {
        gFg.A01(AbstractC13670mt.A06("users/search/", user.getId()), "favorites_list_page");
    }

    public void A0D(IgdsCheckBox igdsCheckBox, C32069E6v c32069E6v) {
        Integer num;
        AbstractC167017dG.A1N(c32069E6v, igdsCheckBox);
        boolean z = !igdsCheckBox.isChecked();
        igdsCheckBox.setChecked(z);
        boolean z2 = A0B().A01;
        C35167FfI c35167FfI = this.A03;
        if (z2) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        c35167FfI.A05(c32069E6v, num, z, z2);
        A0A().A04(AbstractC31173DnH.A0L(c35167FfI.A03), AbstractC31173DnH.A0L(c35167FfI.A00));
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1632508860);
        C14360o3.A0B(layoutInflater, 0);
        this.A00 = new EQ8(requireContext(), this, this, this, this, this, A0C(), false, false);
        View inflate = layoutInflater.inflate(R.layout.layout_audience_picker, viewGroup, false);
        C0f9.A09(1178973527, A02);
        return inflate;
    }
}
