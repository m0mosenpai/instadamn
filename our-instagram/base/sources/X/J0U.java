package X;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.shopping.model.variantselector.VariantSelectorModel;
import com.instagram.user.model.Product;

/* loaded from: classes7.dex */
public final class J0U implements C51D {
    public C62862tP A00;
    public C66246U5q A01;
    public C189478aR A02;
    public AbstractC38938HCn A03;
    public Product A04;
    public Boolean A05 = AbstractC166997dE.A0a();
    public Fragment A06;
    public final Context A07;
    public final UserSession A08;

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.JGT r5, com.instagram.shopping.model.variantselector.VariantSelectorModel r6, X.InterfaceC1119153d r7, boolean r8) {
        /*
            r4 = this;
            r3 = 1
            com.instagram.model.shopping.ProductVariantDimension r0 = r6.A08
            com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle r2 = r0.A00
            int r1 = r2.ordinal()
            if (r1 == r3) goto L7c
            r0 = 2
            if (r1 != r0) goto L8a
            X.HZ8 r0 = new X.HZ8
            r0.<init>()
        L13:
            r4.A03 = r0
            android.os.Bundle r2 = X.AbstractC166987dD.A0b()
            java.lang.String r0 = "variant_selector_model"
            r2.putParcelable(r0, r6)
            java.lang.String r0 = "arg_disable_sold_out"
            r2.putBoolean(r0, r3)
            com.instagram.user.model.Product r1 = r4.A04
            java.lang.String r0 = "product"
            r2.putParcelable(r0, r1)
            X.HCn r0 = r4.A03
            r0.setArguments(r2)
            r0.A01(r5)
            r0 = 0
            X.8aO r2 = r4.A00(r6, r0)
            androidx.fragment.app.Fragment r0 = r4.A06
            if (r0 == 0) goto L6b
            androidx.fragment.app.Fragment r1 = r0.mParentFragment
            boolean r0 = r1 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r0 == 0) goto L6b
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r1
            X.8aR r1 = r1.A02
            r1.getClass()
            r0 = 1059648963(0x3f28f5c3, float:0.66)
            r2.A03 = r0
            r2.A1G = r3
            r2.A0U = r7
            X.HCn r0 = r4.A03
            r1.A0E(r0, r2)
        L56:
            X.HCn r2 = r4.A03
            boolean r0 = r2.isAdded()
            if (r0 == 0) goto L6a
            com.instagram.common.session.UserSession r1 = r4.A08
            X.2jm r0 = X.AbstractC37301Gc2.A0E()
            X.2tP r0 = X.C62862tP.A02(r2, r2, r1, r0)
            r4.A00 = r0
        L6a:
            return
        L6b:
            r2.A0U = r7
            X.8aR r2 = r2.A00()
            android.content.Context r1 = r4.A07
            X.HCn r0 = r4.A03
            X.8aR r0 = r2.A03(r1, r0)
            r4.A02 = r0
            goto L56
        L7c:
            if (r8 == 0) goto L84
            X.HZA r0 = new X.HZA
            r0.<init>()
            goto L13
        L84:
            X.HZ9 r0 = new X.HZ9
            r0.<init>()
            goto L13
        L8a:
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "Unsupported visual style: "
            java.lang.String r0 = X.AbstractC167017dG.A0n(r2, r0, r1)
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J0U.A01(X.JGT, com.instagram.shopping.model.variantselector.VariantSelectorModel, X.53d, boolean):void");
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51D
    public final void onBottomSheetClosed() {
        this.A02 = null;
        this.A03 = null;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    private C189448aO A00(VariantSelectorModel variantSelectorModel, int[] iArr) {
        C189448aO A0y = AbstractC25225BEi.A0y(this.A08);
        Context context = this.A07;
        Resources resources = context.getResources();
        ProductVariantDimension productVariantDimension = variantSelectorModel.A08;
        A0y.A0d = AbstractC166997dE.A0r(resources, productVariantDimension.A03, 2131976586);
        A0y.A0T = this;
        if (iArr != null) {
            A0y.A04(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
        if (productVariantDimension.A01 != null) {
            SpannableStringBuilder A05 = AbstractC31175DnJ.A05(context, 2131974115);
            AbstractC190858ch.A01(context, A05, Selection.getSelectionStart(A05), Selection.getSelectionEnd(A05), AbstractC53242c7.A0F(context, R.attr.textColorLink));
            C189458aP c189458aP = new C189458aP();
            c189458aP.A06 = A05;
            c189458aP.A05 = ViewOnClickListenerC38053Gog.A02(this, variantSelectorModel, 9);
            c189458aP.A0A = true;
            A0y.A07(c189458aP.A00());
        }
        return A0y;
    }

    public final void A03(JGZ jgz) {
        C189478aR c189478aR = this.A02;
        if (c189478aR != null) {
            c189478aR.A0L(null);
            this.A02 = null;
        }
        Fragment fragment = this.A06;
        if (fragment != null) {
            Fragment fragment2 = fragment.mParentFragment;
            if (fragment2 instanceof BottomSheetFragment) {
                C189478aR c189478aR2 = ((BottomSheetFragment) fragment2).A02;
                c189478aR2.getClass();
                c189478aR2.A0T();
                if (jgz != null) {
                    jgz.DYc();
                }
            }
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

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        AbstractC38938HCn abstractC38938HCn = this.A03;
        if (abstractC38938HCn != null && abstractC38938HCn.isScrolledToTop()) {
            return true;
        }
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public J0U(Context context, Fragment fragment, UserSession userSession, Product product) {
        this.A07 = context;
        this.A08 = userSession;
        this.A06 = fragment;
        this.A04 = product;
    }

    public final void A02(JGT jgt, VariantSelectorModel variantSelectorModel, int[] iArr) {
        C189448aO A00 = A00(variantSelectorModel, iArr);
        this.A03 = new HZA();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable("variant_selector_model", variantSelectorModel);
        AbstractC38938HCn abstractC38938HCn = this.A03;
        abstractC38938HCn.setArguments(A0b);
        abstractC38938HCn.A01(jgt);
        A00.A0T = abstractC38938HCn;
        C189478aR c189478aR = this.A02;
        c189478aR.getClass();
        c189478aR.A0F(abstractC38938HCn, A00);
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public J0U(Context context, UserSession userSession, Product product) {
        this.A07 = context;
        this.A08 = userSession;
        this.A04 = product;
    }
}
