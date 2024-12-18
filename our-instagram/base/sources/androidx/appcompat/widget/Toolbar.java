package androidx.appcompat.widget;

import X.AbstractC010103p;
import X.AbstractC53402cO;
import X.AbstractC63123SdR;
import X.AbstractC65702TsY;
import X.AbstractC65703TsZ;
import X.AbstractC66342UAh;
import X.AbstractC70156WDm;
import X.AnonymousClass036;
import X.AnonymousClass038;
import X.C03F;
import X.C0f9;
import X.C128955sF;
import X.C3WF;
import X.C53122bu;
import X.C65884Tvo;
import X.C69636Vsd;
import X.C71x;
import X.InterfaceC52052a5;
import X.InterfaceC71833X6q;
import X.InterfaceC71933XBi;
import X.InterfaceC71936XBl;
import X.RunnableC71217Wq8;
import X.UA6;
import X.UC9;
import X.UD6;
import X.WNN;
import X.WPN;
import X.WPT;
import X.WPV;
import X.WPY;
import X.WPa;
import X.WQH;
import X.X6o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.Toolbar;
import androidx.customview.view.AbsSavedState;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public class Toolbar extends ViewGroup implements AnonymousClass036 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public View A08;
    public ImageButton A09;
    public ImageView A0A;
    public TextView A0B;
    public TextView A0C;
    public InterfaceC52052a5 A0D;
    public ActionMenuView A0E;
    public C69636Vsd A0F;
    public WPT A0G;
    public InterfaceC71833X6q A0H;
    public CharSequence A0I;
    public CharSequence A0J;
    public ArrayList A0K;
    public boolean A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public Context A0Q;
    public ColorStateList A0R;
    public ColorStateList A0S;
    public Drawable A0T;
    public ImageButton A0U;
    public OnBackInvokedCallback A0V;
    public OnBackInvokedDispatcher A0W;
    public InterfaceC71933XBi A0X;
    public WPV A0Y;
    public WPa A0Z;
    public CharSequence A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public final AnonymousClass038 A0e;
    public final Runnable A0f;
    public final ArrayList A0g;
    public final X6o A0h;
    public final ArrayList A0i;
    public final int[] A0j;

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A01 = 8388627;
        this.A0i = new ArrayList();
        this.A0g = new ArrayList();
        this.A0j = new int[2];
        this.A0e = new AnonymousClass038(new Runnable() { // from class: X.Wq6
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.A0F();
            }
        });
        this.A0K = new ArrayList();
        this.A0h = new WPY(this);
        this.A0f = new RunnableC71217Wq8(this);
        Context context2 = getContext();
        int[] iArr = AbstractC53402cO.A0O;
        C53122bu A00 = C53122bu.A00(context2, attributeSet, iArr, i, 0);
        TypedArray typedArray = A00.A02;
        AbstractC010103p.A06(context, typedArray, attributeSet, this, iArr, i, 0);
        this.A07 = typedArray.getResourceId(28, 0);
        this.A02 = typedArray.getResourceId(19, 0);
        this.A01 = typedArray.getInteger(0, this.A01);
        this.A00 = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.A03 = dimensionPixelOffset;
        this.A06 = dimensionPixelOffset;
        this.A04 = dimensionPixelOffset;
        this.A05 = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.A05 = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.A04 = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.A06 = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.A03 = dimensionPixelOffset5;
        }
        this.A0O = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        C69636Vsd c69636Vsd = this.A0F;
        if (c69636Vsd == null) {
            c69636Vsd = new C69636Vsd();
            this.A0F = c69636Vsd;
        }
        c69636Vsd.A06 = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c69636Vsd.A01 = dimensionPixelSize;
            c69636Vsd.A03 = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c69636Vsd.A02 = dimensionPixelSize2;
            c69636Vsd.A04 = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c69636Vsd.A00(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.A0N = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.A0M = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.A0T = A00.A02(4);
        this.A0a = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.A0Q = context2;
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable A02 = A00.A02(16);
        if (A02 != null) {
            setNavigationIcon(A02);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable A022 = A00.A02(11);
        if (A022 != null) {
            setLogo(A022);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(A00.A01(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(A00.A01(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        typedArray.recycle();
    }

    /* loaded from: classes11.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C65884Tvo(1);
        public int A00;
        public boolean A01;

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00);
            parcel.writeInt(this.A01 ? 1 : 0);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.ViewGroup$MarginLayoutParams, X.UAh] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewGroup$MarginLayoutParams, X.UAh, X.UD6] */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.ViewGroup$MarginLayoutParams, X.UAh] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.ViewGroup$MarginLayoutParams, X.UAh, X.UD6] */
    public static final UD6 A05(ViewGroup.LayoutParams layoutParams) {
        int i;
        UD6 ud6;
        if (layoutParams instanceof UD6) {
            UD6 ud62 = (UD6) layoutParams;
            ?? marginLayoutParams = new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) ud62);
            marginLayoutParams.A00 = 0;
            marginLayoutParams.A00 = ((AbstractC66342UAh) ud62).A00;
            marginLayoutParams.A00 = 0;
            i = ud62.A00;
            ud6 = marginLayoutParams;
        } else if (layoutParams instanceof AbstractC66342UAh) {
            AbstractC66342UAh abstractC66342UAh = (AbstractC66342UAh) layoutParams;
            ?? marginLayoutParams2 = new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) abstractC66342UAh);
            marginLayoutParams2.A00 = 0;
            marginLayoutParams2.A00 = abstractC66342UAh.A00;
            i = 0;
            ud6 = marginLayoutParams2;
        } else {
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams;
                ?? marginLayoutParams4 = new ViewGroup.MarginLayoutParams((ViewGroup.LayoutParams) marginLayoutParams3);
                marginLayoutParams4.A00 = 0;
                marginLayoutParams4.A00 = 0;
                ((ViewGroup.MarginLayoutParams) marginLayoutParams4).leftMargin = marginLayoutParams3.leftMargin;
                ((ViewGroup.MarginLayoutParams) marginLayoutParams4).topMargin = marginLayoutParams3.topMargin;
                ((ViewGroup.MarginLayoutParams) marginLayoutParams4).rightMargin = marginLayoutParams3.rightMargin;
                ((ViewGroup.MarginLayoutParams) marginLayoutParams4).bottomMargin = marginLayoutParams3.bottomMargin;
                return marginLayoutParams4;
            }
            ?? marginLayoutParams5 = new ViewGroup.MarginLayoutParams(layoutParams);
            i = 0;
            marginLayoutParams5.A00 = 0;
            ud6 = marginLayoutParams5;
        }
        ud6.A00 = i;
        return ud6;
    }

    private void A07() {
        if (this.A0E == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.A0E = actionMenuView;
            actionMenuView.setPopupTheme(this.A0P);
            ActionMenuView actionMenuView2 = this.A0E;
            actionMenuView2.A05 = this.A0h;
            actionMenuView2.setMenuCallbacks(this.A0X, new WPN(this));
            UD6 ud6 = new UD6();
            ((AbstractC66342UAh) ud6).A00 = 8388613 | (this.A00 & 112);
            this.A0E.setLayoutParams(ud6);
            A0A(this.A0E, false);
        }
    }

    private void A08() {
        if (this.A0U == null) {
            this.A0U = new UC9(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            UD6 ud6 = new UD6();
            ((AbstractC66342UAh) ud6).A00 = 8388611 | (this.A00 & 112);
            this.A0U.setLayoutParams(ud6);
        }
    }

    private boolean A0D(View view) {
        if (view != null && view.getParent() == this && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    private ArrayList getCurrentMenuItems() {
        ArrayList arrayList = new ArrayList();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    public final void A0E() {
        if (this.A09 == null) {
            UC9 uc9 = new UC9(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.A09 = uc9;
            uc9.setImageDrawable(this.A0T);
            this.A09.setContentDescription(this.A0a);
            UD6 ud6 = new UD6();
            ((AbstractC66342UAh) ud6).A00 = 8388611 | (this.A00 & 112);
            ud6.A00 = 2;
            this.A09.setLayoutParams(ud6);
            this.A09.setOnClickListener(new WNN(this, 1));
        }
    }

    public final void A0F() {
        Iterator it = this.A0K.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        Menu menu = getMenu();
        ArrayList currentMenuItems = getCurrentMenuItems();
        this.A0e.A01(menu, getMenuInflater());
        ArrayList currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.A0K = currentMenuItems2;
    }

    public final void A0G() {
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher A00 = AbstractC70156WDm.A00(this);
            WPT wpt = this.A0G;
            if (wpt != null && wpt.A01 != null && A00 != null && isAttachedToWindow() && this.A0b) {
                if (this.A0W == null) {
                    OnBackInvokedCallback onBackInvokedCallback = this.A0V;
                    if (onBackInvokedCallback == null) {
                        onBackInvokedCallback = AbstractC70156WDm.A01(new Runnable() { // from class: X.Wq7
                            @Override // java.lang.Runnable
                            public final void run() {
                                WQJ wqj;
                                WPT wpt2 = Toolbar.this.A0G;
                                if (wpt2 != null && (wqj = wpt2.A01) != null) {
                                    wqj.collapseActionView();
                                }
                            }
                        });
                        this.A0V = onBackInvokedCallback;
                    }
                    AbstractC70156WDm.A02(A00, onBackInvokedCallback);
                } else {
                    return;
                }
            } else {
                OnBackInvokedDispatcher onBackInvokedDispatcher = this.A0W;
                if (onBackInvokedDispatcher == null) {
                    return;
                }
                AbstractC70156WDm.A03(onBackInvokedDispatcher, this.A0V);
                A00 = null;
            }
            this.A0W = A00;
        }
    }

    @Override // X.AnonymousClass036
    public final void addMenuProvider(C03F c03f) {
        AnonymousClass038 anonymousClass038 = this.A0e;
        anonymousClass038.A02.add(c03f);
        anonymousClass038.A00.run();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new UD6();
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.A09;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.A09;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C69636Vsd c69636Vsd = this.A0F;
        if (c69636Vsd != null) {
            if (c69636Vsd.A07) {
                return c69636Vsd.A03;
            }
            return c69636Vsd.A04;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.A0M;
        if (i == Integer.MIN_VALUE) {
            return getContentInsetEnd();
        }
        return i;
    }

    public int getContentInsetLeft() {
        C69636Vsd c69636Vsd = this.A0F;
        if (c69636Vsd != null) {
            return c69636Vsd.A03;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C69636Vsd c69636Vsd = this.A0F;
        if (c69636Vsd != null) {
            return c69636Vsd.A04;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C69636Vsd c69636Vsd = this.A0F;
        if (c69636Vsd != null) {
            if (c69636Vsd.A07) {
                return c69636Vsd.A04;
            }
            return c69636Vsd.A03;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.A0N;
        if (i == Integer.MIN_VALUE) {
            return getContentInsetStart();
        }
        return i;
    }

    public int getCurrentContentInsetEnd() {
        WQH wqh;
        ActionMenuView actionMenuView = this.A0E;
        if (actionMenuView != null && (wqh = actionMenuView.A03) != null && wqh.hasVisibleItems()) {
            return Math.max(getContentInsetEnd(), Math.max(this.A0M, 0));
        }
        return getContentInsetEnd();
    }

    public Drawable getLogo() {
        ImageView imageView = this.A0A;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.A0A;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public View getNavButtonView() {
        return this.A0U;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.A0U;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.A0U;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public WPV getOuterActionMenuPresenter() {
        return this.A0Y;
    }

    public Context getPopupContext() {
        return this.A0Q;
    }

    public int getPopupTheme() {
        return this.A0P;
    }

    public CharSequence getSubtitle() {
        return this.A0I;
    }

    public final TextView getSubtitleTextView() {
        return this.A0B;
    }

    public CharSequence getTitle() {
        return this.A0J;
    }

    public int getTitleMarginBottom() {
        return this.A03;
    }

    public int getTitleMarginEnd() {
        return this.A04;
    }

    public int getTitleMarginStart() {
        return this.A05;
    }

    public int getTitleMarginTop() {
        return this.A06;
    }

    public final TextView getTitleTextView() {
        return this.A0C;
    }

    public InterfaceC71936XBl getWrapper() {
        WPa wPa = this.A0Z;
        if (wPa == null) {
            WPa wPa2 = new WPa(this, true);
            this.A0Z = wPa2;
            return wPa2;
        }
        return wPa;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a0 A[LOOP:0: B:76:0x019e->B:77:0x01a0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0288 A[LOOP:1: B:80:0x0286->B:81:0x0288, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a5 A[LOOP:2: B:84:0x02a3->B:85:0x02a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02ef A[LOOP:3: B:93:0x02ed->B:94:0x02ef, LOOP_END] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr = this.A0j;
        boolean A1a = AbstractC65703TsZ.A1a(this);
        int i9 = 0;
        int i10 = !A1a ? 1 : 0;
        if (A0D(this.A0U)) {
            A09(this.A0U, i, 0, i2, this.A0O);
            int measuredWidth = this.A0U.getMeasuredWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A0U.getLayoutParams();
            i3 = measuredWidth + marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
            i4 = Math.max(0, this.A0U.getMeasuredHeight() + A00(this.A0U));
            i5 = View.combineMeasuredStates(0, this.A0U.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (A0D(this.A09)) {
            A09(this.A09, i, 0, i2, this.A0O);
            int measuredWidth2 = this.A09.getMeasuredWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.A09.getLayoutParams();
            i3 = measuredWidth2 + marginLayoutParams2.getMarginStart() + marginLayoutParams2.getMarginEnd();
            i4 = Math.max(i4, this.A09.getMeasuredHeight() + A00(this.A09));
            i5 = View.combineMeasuredStates(i5, this.A09.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        iArr[A1a ? 1 : 0] = Math.max(0, currentContentInsetStart - i3);
        if (A0D(this.A0E)) {
            A09(this.A0E, i, max, i2, this.A0O);
            int measuredWidth3 = this.A0E.getMeasuredWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.A0E.getLayoutParams();
            i6 = measuredWidth3 + marginLayoutParams3.getMarginStart() + marginLayoutParams3.getMarginEnd();
            i4 = Math.max(i4, this.A0E.getMeasuredHeight() + A00(this.A0E));
            i5 = View.combineMeasuredStates(i5, this.A0E.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[i10] = Math.max(0, currentContentInsetEnd - i6);
        if (A0D(this.A08)) {
            max2 += A04(this.A08, iArr, i, max2, i2, 0);
            i4 = Math.max(i4, this.A08.getMeasuredHeight() + A00(this.A08));
            i5 = View.combineMeasuredStates(i5, this.A08.getMeasuredState());
        }
        if (A0D(this.A0A)) {
            max2 += A04(this.A0A, iArr, i, max2, i2, 0);
            i4 = Math.max(i4, this.A0A.getMeasuredHeight() + A00(this.A0A));
            i5 = View.combineMeasuredStates(i5, this.A0A.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((UD6) childAt.getLayoutParams()).A00 == 0 && A0D(childAt)) {
                max2 += A04(childAt, iArr, i, max2, i2, 0);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + A00(childAt));
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i12 = this.A06 + this.A03;
        int i13 = this.A05 + this.A04;
        if (A0D(this.A0C)) {
            A04(this.A0C, iArr, i, max2 + i13, i2, i12);
            int measuredWidth4 = this.A0C.getMeasuredWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.A0C.getLayoutParams();
            i7 = measuredWidth4 + marginLayoutParams4.getMarginStart() + marginLayoutParams4.getMarginEnd();
            i8 = this.A0C.getMeasuredHeight() + A00(this.A0C);
            i5 = View.combineMeasuredStates(i5, this.A0C.getMeasuredState());
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (A0D(this.A0B)) {
            i7 = Math.max(i7, A04(this.A0B, iArr, i, max2 + i13, i2, i8 + i12));
            i8 += this.A0B.getMeasuredHeight() + A00(this.A0B);
            i5 = View.combineMeasuredStates(i5, this.A0B.getMeasuredState());
        }
        int max3 = Math.max(i4, i8);
        int A06 = max2 + i7 + AbstractC65702TsY.A06(this);
        int A09 = max3 + AbstractC65702TsY.A09(this);
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(A06, getSuggestedMinimumWidth()), i, (-16777216) & i5);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(A09, getSuggestedMinimumHeight()), i2, i5 << 16);
        if (this.A0L) {
            int childCount2 = getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                View childAt2 = getChildAt(i14);
                if (!A0D(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i9);
        }
        i9 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i9);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        WQH wqh;
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(((AbsSavedState) savedState).A00);
        ActionMenuView actionMenuView = this.A0E;
        if (actionMenuView != null) {
            wqh = actionMenuView.A03;
        } else {
            wqh = null;
        }
        int i = savedState.A00;
        if (i != 0 && this.A0G != null && wqh != null && (findItem = wqh.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (!savedState.A01) {
            return;
        }
        Runnable runnable = this.A0f;
        removeCallbacks(runnable);
        post(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r1 == false) goto L13;
     */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcelable, androidx.customview.view.AbsSavedState, androidx.appcompat.widget.Toolbar$SavedState] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Parcelable onSaveInstanceState() {
        /*
            r3 = this;
            android.os.Parcelable$Creator r0 = androidx.appcompat.widget.Toolbar.SavedState.CREATOR
            android.os.Parcelable r0 = super.onSaveInstanceState()
            androidx.appcompat.widget.Toolbar$SavedState r2 = new androidx.appcompat.widget.Toolbar$SavedState
            r2.<init>(r0)
            X.WPT r0 = r3.A0G
            if (r0 == 0) goto L19
            X.WQJ r0 = r0.A01
            if (r0 == 0) goto L19
            int r0 = r0.getItemId()
            r2.A00 = r0
        L19:
            androidx.appcompat.widget.ActionMenuView r0 = r3.A0E
            if (r0 == 0) goto L28
            X.WPV r0 = r0.A04
            if (r0 == 0) goto L28
            boolean r1 = r0.A03()
            r0 = 1
            if (r1 != 0) goto L29
        L28:
            r0 = 0
        L29:
            r2.A01 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onSaveInstanceState():android.os.Parcelable");
    }

    @Override // X.AnonymousClass036
    public final void removeMenuProvider(C03F c03f) {
        this.A0e.A02(c03f);
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.A0b != z) {
            this.A0b = z;
            A0G();
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            A0E();
            this.A09.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.A09;
            if (imageButton == null) {
                return;
            }
            imageButton.setImageDrawable(this.A0T);
        }
    }

    public void setCollapsible(boolean z) {
        this.A0L = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.A0M) {
            this.A0M = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.A0N) {
            this.A0N = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            ImageView imageView = this.A0A;
            if (imageView == null) {
                imageView = new C128955sF(getContext(), null, 0);
                this.A0A = imageView;
            }
            if (!A0C(imageView)) {
                A0A(this.A0A, true);
            }
        } else {
            View view = this.A0A;
            if (view != null && A0C(view)) {
                removeView(this.A0A);
                this.A0g.remove(this.A0A);
            }
        }
        ImageView imageView2 = this.A0A;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setMenu(WQH wqh, WPV wpv) {
        if (wqh == null && this.A0E == null) {
            return;
        }
        A07();
        WQH wqh2 = this.A0E.A03;
        if (wqh2 == wqh) {
            return;
        }
        if (wqh2 != null) {
            wqh2.A0B(this.A0Y);
            wqh2.A0B(this.A0G);
        }
        if (this.A0G == null) {
            this.A0G = new WPT(this);
        }
        wpv.A0E = true;
        Context context = this.A0Q;
        if (wqh != null) {
            wqh.A07(context, wpv);
            wqh.A07(this.A0Q, this.A0G);
        } else {
            wpv.CNw(context, null);
            this.A0G.CNw(this.A0Q, null);
            wpv.FBO(true);
            this.A0G.FBO(true);
        }
        this.A0E.setPopupTheme(this.A0P);
        this.A0E.setPresenter(wpv);
        this.A0Y = wpv;
        A0G();
    }

    public void setMenuCallbacks(InterfaceC71933XBi interfaceC71933XBi, InterfaceC52052a5 interfaceC52052a5) {
        this.A0X = interfaceC71933XBi;
        this.A0D = interfaceC52052a5;
        ActionMenuView actionMenuView = this.A0E;
        if (actionMenuView != null) {
            actionMenuView.setMenuCallbacks(interfaceC71933XBi, interfaceC52052a5);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            A08();
            if (!A0C(this.A0U)) {
                A0A(this.A0U, true);
            }
        } else {
            ImageButton imageButton = this.A0U;
            if (imageButton != null && A0C(imageButton)) {
                removeView(this.A0U);
                this.A0g.remove(this.A0U);
            }
        }
        ImageButton imageButton2 = this.A0U;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setPopupTheme(int i) {
        Context contextThemeWrapper;
        if (this.A0P != i) {
            this.A0P = i;
            if (i == 0) {
                contextThemeWrapper = getContext();
            } else {
                contextThemeWrapper = new ContextThemeWrapper(getContext(), i);
            }
            this.A0Q = contextThemeWrapper;
        }
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A0R = colorStateList;
        TextView textView = this.A0B;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitleMarginBottom(int i) {
        this.A03 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.A04 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.A05 = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.A06 = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.A0S = colorStateList;
        TextView textView = this.A0C;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static int A00(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r1 != 80) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A01(android.view.View r9, int r10) {
        /*
            r8 = this;
            android.view.ViewGroup$LayoutParams r6 = r9.getLayoutParams()
            X.UAh r6 = (X.AbstractC66342UAh) r6
            int r7 = r9.getMeasuredHeight()
            r5 = 0
            if (r10 <= 0) goto L53
            int r0 = r7 - r10
            int r3 = r0 / 2
        L11:
            int r0 = r6.A00
            r1 = r0 & 112(0x70, float:1.57E-43)
            r0 = 16
            if (r1 == r0) goto L2b
            r0 = 48
            if (r1 == r0) goto L55
            r2 = 80
            if (r1 == r2) goto L5a
            int r0 = r8.A01
            r1 = r0 & 112(0x70, float:1.57E-43)
            r0 = 48
            if (r1 == r0) goto L55
            if (r1 == r2) goto L5a
        L2b:
            int r1 = r8.getPaddingTop()
            int r4 = r8.getPaddingBottom()
            int r3 = r8.getHeight()
            int r0 = r3 - r1
            int r0 = r0 - r4
            int r0 = r0 - r7
            int r2 = r0 / 2
            int r0 = r6.topMargin
            if (r2 >= r0) goto L44
            r2 = r0
        L42:
            int r1 = r1 + r2
            return r1
        L44:
            int r3 = r3 - r4
            int r3 = r3 - r7
            int r3 = r3 - r2
            int r3 = r3 - r1
            int r0 = r6.bottomMargin
            if (r3 >= r0) goto L42
            int r0 = r0 - r3
            int r2 = r2 - r0
            int r2 = java.lang.Math.max(r5, r2)
            goto L42
        L53:
            r3 = 0
            goto L11
        L55:
            int r1 = r8.getPaddingTop()
            goto L62
        L5a:
            int r1 = X.AbstractC65702TsY.A07(r8)
            int r1 = r1 - r7
            int r0 = r6.bottomMargin
            int r1 = r1 - r0
        L62:
            int r1 = r1 - r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.A01(android.view.View, int):int");
    }

    private int A02(View view, int[] iArr, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = marginLayoutParams.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int A01 = A01(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, A01, max + measuredWidth, view.getMeasuredHeight() + A01);
        return max + measuredWidth + marginLayoutParams.rightMargin;
    }

    private int A03(View view, int[] iArr, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = marginLayoutParams.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int A01 = A01(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, A01, max, view.getMeasuredHeight() + A01);
        return max - (measuredWidth + marginLayoutParams.leftMargin);
    }

    private int A04(View view, int[] iArr, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, AbstractC65702TsY.A06(this) + max + i2, ((ViewGroup.LayoutParams) marginLayoutParams).width), ViewGroup.getChildMeasureSpec(i3, AbstractC65702TsY.A09(this) + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, ((ViewGroup.LayoutParams) marginLayoutParams).height));
        return view.getMeasuredWidth() + max;
    }

    private void A06() {
        A07();
        ActionMenuView actionMenuView = this.A0E;
        if (actionMenuView.A03 == null) {
            WQH wqh = (WQH) actionMenuView.getMenu();
            WPT wpt = this.A0G;
            if (wpt == null) {
                wpt = new WPT(this);
                this.A0G = wpt;
            }
            this.A0E.setExpandedActionViewsExclusive(true);
            wqh.A07(this.A0Q, wpt);
            A0G();
        }
    }

    private void A09(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, AbstractC65702TsY.A06(this) + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, ((ViewGroup.LayoutParams) marginLayoutParams).width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, AbstractC65702TsY.A09(this) + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, ((ViewGroup.LayoutParams) marginLayoutParams).height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void A0A(View view, boolean z) {
        UD6 ud6;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            ud6 = new UD6();
        } else if (!checkLayoutParams(layoutParams)) {
            ud6 = A05(layoutParams);
        } else {
            ud6 = (UD6) layoutParams;
        }
        ud6.A00 = 1;
        if (z && this.A08 != null) {
            view.setLayoutParams(ud6);
            this.A0g.add(view);
        } else {
            addView(view, ud6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0B(java.util.List r10, int r11) {
        /*
            r9 = this;
            int r0 = r9.getLayoutDirection()
            r7 = 0
            r6 = 1
            boolean r1 = X.AbstractC167007dF.A1P(r0, r6)
            int r5 = r9.getChildCount()
            int r0 = r9.getLayoutDirection()
            int r8 = android.view.Gravity.getAbsoluteGravity(r11, r0)
            r10.clear()
            if (r1 == 0) goto L53
            int r5 = r5 - r6
        L1c:
            if (r5 < 0) goto L8a
            android.view.View r4 = r9.getChildAt(r5)
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            X.UD6 r1 = (X.UD6) r1
            int r0 = r1.A00
            if (r0 != 0) goto L4e
            boolean r0 = r9.A0D(r4)
            if (r0 == 0) goto L4e
            int r0 = r1.A00
            int r3 = r9.getLayoutDirection()
            int r0 = android.view.Gravity.getAbsoluteGravity(r0, r3)
            r2 = r0 & 7
            if (r2 == r6) goto L51
            r1 = 3
            if (r2 == r1) goto L51
            r0 = 5
            if (r2 == r0) goto L51
            if (r3 != r6) goto L49
            r1 = 5
        L49:
            if (r1 != r8) goto L4e
            r10.add(r4)
        L4e:
            int r5 = r5 + (-1)
            goto L1c
        L51:
            r1 = r2
            goto L49
        L53:
            if (r7 >= r5) goto L8a
            android.view.View r4 = r9.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            X.UD6 r1 = (X.UD6) r1
            int r0 = r1.A00
            if (r0 != 0) goto L85
            boolean r0 = r9.A0D(r4)
            if (r0 == 0) goto L85
            int r0 = r1.A00
            int r3 = r9.getLayoutDirection()
            int r0 = android.view.Gravity.getAbsoluteGravity(r0, r3)
            r2 = r0 & 7
            if (r2 == r6) goto L88
            r1 = 3
            if (r2 == r1) goto L88
            r0 = 5
            if (r2 == r0) goto L88
            if (r3 != r6) goto L80
            r1 = 5
        L80:
            if (r1 != r8) goto L85
            r10.add(r4)
        L85:
            int r7 = r7 + 1
            goto L53
        L88:
            r1 = r2
            goto L80
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.A0B(java.util.List, int):void");
    }

    private boolean A0C(View view) {
        if (view.getParent() != this && !this.A0g.contains(view)) {
            return false;
        }
        return true;
    }

    private MenuInflater getMenuInflater() {
        return new UA6(getContext());
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof UD6)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, X.UAh, X.UD6] */
    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.A00 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC53402cO.A01);
        marginLayoutParams.A00 = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        marginLayoutParams.A00 = 0;
        return marginLayoutParams;
    }

    public int getCurrentContentInsetLeft() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        Drawable navigationIcon = getNavigationIcon();
        int contentInsetStart = getContentInsetStart();
        if (navigationIcon != null) {
            return Math.max(contentInsetStart, Math.max(this.A0N, 0));
        }
        return contentInsetStart;
    }

    public Menu getMenu() {
        A06();
        return this.A0E.getMenu();
    }

    public Drawable getOverflowIcon() {
        A06();
        return this.A0E.getOverflowIcon();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = C0f9.A06(2028022362);
        super.onAttachedToWindow();
        A0G();
        C0f9.A0D(651836385, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-1211236323);
        super.onDetachedFromWindow();
        removeCallbacks(this.A0f);
        A0G();
        C0f9.A0D(-1912923680, A06);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.A0c = false;
        }
        if (!this.A0c) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.A0c = true;
                }
                return true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.A0c = false;
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
    
        if (r0 != Integer.MIN_VALUE) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onRtlPropertiesChanged(int r5) {
        /*
            r4 = this;
            super.onRtlPropertiesChanged(r5)
            X.Vsd r3 = r4.A0F
            if (r3 != 0) goto Le
            X.Vsd r3 = new X.Vsd
            r3.<init>()
            r4.A0F = r3
        Le:
            r2 = 1
            if (r5 == r2) goto L12
            r2 = 0
        L12:
            boolean r0 = r3.A07
            if (r2 == r0) goto L2e
            r3.A07 = r2
            boolean r0 = r3.A06
            if (r0 == 0) goto L3a
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L2f
            int r0 = r3.A00
            if (r0 != r1) goto L26
            int r0 = r3.A01
        L26:
            r3.A03 = r0
            int r0 = r3.A05
        L2a:
            if (r0 == r1) goto L3e
        L2c:
            r3.A04 = r0
        L2e:
            return
        L2f:
            int r0 = r3.A05
            if (r0 != r1) goto L35
            int r0 = r3.A01
        L35:
            r3.A03 = r0
            int r0 = r3.A00
            goto L2a
        L3a:
            int r0 = r3.A01
            r3.A03 = r0
        L3e:
            int r0 = r3.A02
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C0f9.A05(-1722082724);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A0d = false;
        }
        if (!this.A0d) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.A0d = true;
                }
                C0f9.A0C(-2074026522, A05);
                return true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.A0d = false;
        }
        C0f9.A0C(-2074026522, A05);
        return true;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            A0E();
        }
        ImageButton imageButton = this.A09;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.A0A == null) {
            this.A0A = new C128955sF(getContext(), null, 0);
        }
        ImageView imageView = this.A0A;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            A08();
        }
        ImageButton imageButton = this.A0U;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            this.A0U.setTooltipText(charSequence);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        A08();
        this.A0U.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC71833X6q interfaceC71833X6q) {
        this.A0H = interfaceC71833X6q;
    }

    public void setOverflowIcon(Drawable drawable) {
        A06();
        this.A0E.setOverflowIcon(drawable);
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.A0B;
        if (!isEmpty) {
            if (textView == null) {
                Context context = getContext();
                C3WF c3wf = new C3WF(context, null);
                this.A0B = c3wf;
                c3wf.setSingleLine();
                this.A0B.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.A02;
                if (i != 0) {
                    this.A0B.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A0R;
                if (colorStateList != null) {
                    this.A0B.setTextColor(colorStateList);
                }
            }
            if (!A0C(this.A0B)) {
                A0A(this.A0B, true);
            }
        } else if (textView != null && A0C(textView)) {
            removeView(this.A0B);
            this.A0g.remove(this.A0B);
        }
        TextView textView2 = this.A0B;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.A0I = charSequence;
    }

    public void setTitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.A0C;
        if (!isEmpty) {
            if (textView == null) {
                Context context = getContext();
                C3WF c3wf = new C3WF(context, null);
                this.A0C = c3wf;
                c3wf.setSingleLine();
                this.A0C.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.A07;
                if (i != 0) {
                    this.A0C.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A0S;
                if (colorStateList != null) {
                    this.A0C.setTextColor(colorStateList);
                }
            }
            if (!A0C(this.A0C)) {
                A0A(this.A0C, true);
            }
        } else if (textView != null && A0C(textView)) {
            removeView(this.A0C);
            this.A0g.remove(this.A0C);
        }
        TextView textView2 = this.A0C;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.A0J = charSequence;
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return A05(layoutParams);
    }

    public void setCollapseContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getContext().getText(i);
        } else {
            charSequence = null;
        }
        setCollapseContentDescription(charSequence);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C71x.A00(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(C71x.A00(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getContext().getText(i);
        } else {
            charSequence = null;
        }
        setNavigationContentDescription(charSequence);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C71x.A00(getContext(), i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public Toolbar(Context context) {
        this(context, null);
    }
}
