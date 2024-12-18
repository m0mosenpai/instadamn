package com.google.android.material.textfield;

import X.AbstractC010103p;
import X.AbstractC111324zv;
import X.AbstractC126235nK;
import X.AbstractC1343565e;
import X.AbstractC153306uz;
import X.AbstractC1567371w;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25228BEl;
import X.AbstractC25230BEn;
import X.AbstractC43593JPy;
import X.AbstractC43594JPz;
import X.AbstractC56842jH;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC65702TsY;
import X.AbstractC65703TsZ;
import X.AbstractC69084Vha;
import X.AbstractC78763fi;
import X.AnonymousClass001;
import X.C02G;
import X.C0f9;
import X.C3OO;
import X.C3WF;
import X.C52102aA;
import X.C53122bu;
import X.C65757TtX;
import X.C65759TtZ;
import X.C65884Tvo;
import X.C65K;
import X.C65M;
import X.C65N;
import X.C65O;
import X.C65Q;
import X.C65T;
import X.C65U;
import X.C67770Uxl;
import X.C67773Uxp;
import X.C67774Uxq;
import X.C67775Uxr;
import X.C67776Uxs;
import X.C67777Uxt;
import X.C6H7;
import X.C70176WEy;
import X.C71x;
import X.C72G;
import X.InterfaceC71913X9x;
import X.InterfaceC71914X9y;
import X.InterfaceC78793fl;
import X.JQ0;
import X.MSX;
import X.MSY;
import X.RunnableC71299WrT;
import X.RunnableC71300WrU;
import X.U5Q;
import X.UEH;
import X.WKU;
import X.WNN;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.facebook.R;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes11.dex */
public class TextInputLayout extends LinearLayout {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public ValueAnimator A09;
    public ColorStateList A0A;
    public ColorStateList A0B;
    public ColorStateList A0C;
    public ColorStateList A0D;
    public ColorStateList A0E;
    public EditText A0F;
    public TextView A0G;
    public TextView A0H;
    public C65O A0I;
    public C65O A0J;
    public C65Q A0K;
    public CharSequence A0L;
    public CharSequence A0M;
    public CharSequence A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public int A0V;
    public int A0W;
    public int A0X;
    public int A0Y;
    public int A0Z;
    public int A0a;
    public int A0b;
    public int A0c;
    public int A0d;
    public int A0e;
    public int A0f;
    public int A0g;
    public int A0h;
    public int A0i;
    public int A0j;
    public int A0k;
    public ColorStateList A0l;
    public ColorStateList A0m;
    public ColorStateList A0n;
    public ColorStateList A0o;
    public PorterDuff.Mode A0p;
    public PorterDuff.Mode A0q;
    public Typeface A0r;
    public Drawable A0s;
    public Drawable A0t;
    public Drawable A0u;
    public View.OnLongClickListener A0v;
    public View.OnLongClickListener A0w;
    public View.OnLongClickListener A0x;
    public CharSequence A0y;
    public CharSequence A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public boolean A13;
    public boolean A14;
    public boolean A15;
    public boolean A16;
    public final int A17;
    public final Rect A18;
    public final FrameLayout A19;
    public final LinearLayout A1A;
    public final LinearLayout A1B;
    public final TextView A1C;
    public final CheckableImageButton A1D;
    public final CheckableImageButton A1E;
    public final CheckableImageButton A1F;
    public final C65757TtX A1G;
    public final C70176WEy A1H;
    public final LinkedHashSet A1I;
    public final LinkedHashSet A1J;
    public final Rect A1K;
    public final RectF A1L;
    public final SparseArray A1M;
    public final FrameLayout A1N;
    public final TextView A1O;

    /* loaded from: classes11.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C65884Tvo(11);
        public CharSequence A00;
        public CharSequence A01;
        public CharSequence A02;
        public CharSequence A03;
        public boolean A04;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TextInputLayout.SavedState{");
            AbstractC58318PtA.A1T(sb, System.identityHashCode(this));
            sb.append(" error=");
            sb.append((Object) this.A00);
            sb.append(" hint=");
            sb.append((Object) this.A02);
            sb.append(" helperText=");
            sb.append((Object) this.A01);
            sb.append(" placeholderText=");
            return JQ0.A0l(this.A03, sb);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.A00 = (CharSequence) creator.createFromParcel(parcel);
            this.A04 = AbstractC58320PtC.A1T(parcel);
            this.A02 = (CharSequence) creator.createFromParcel(parcel);
            this.A01 = (CharSequence) creator.createFromParcel(parcel);
            this.A03 = (CharSequence) creator.createFromParcel(parcel);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.A00, parcel, i);
            parcel.writeInt(this.A04 ? 1 : 0);
            TextUtils.writeToParcel(this.A02, parcel, i);
            TextUtils.writeToParcel(this.A01, parcel, i);
            TextUtils.writeToParcel(this.A03, parcel, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.A0U = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.A0U = false;
    }

    private int A00() {
        float A05;
        if (!this.A0Q) {
            return 0;
        }
        int i = this.A01;
        if (i != 0 && i != 1) {
            if (i != 2) {
                return 0;
            }
            A05 = this.A1G.A05() / 2.0f;
        } else {
            A05 = this.A1G.A05();
        }
        return (int) A05;
    }

    private void A01() {
        int i;
        int i2;
        int i3;
        int i4;
        C65O c65o = this.A0I;
        if (c65o != null) {
            c65o.setShapeAppearanceModel(this.A0K);
            if (this.A01 == 2 && (i3 = this.A06) > -1 && (i4 = this.A04) != 0) {
                C65O c65o2 = this.A0I;
                c65o2.A00.A04 = i3;
                c65o2.invalidateSelf();
                c65o2.A0G(ColorStateList.valueOf(i4));
            }
            int i5 = this.A00;
            if (this.A01 == 1) {
                TypedValue A02 = AbstractC1343565e.A02(getContext(), R.attr.colorSurface);
                if (A02 != null) {
                    i2 = A02.data;
                } else {
                    i2 = 0;
                }
                i5 = AbstractC56842jH.A05(this.A00, i2);
            }
            this.A00 = i5;
            this.A0I.A0F(ColorStateList.valueOf(i5));
            if (this.A08 == 3) {
                this.A0F.getBackground().invalidateSelf();
            }
            C65O c65o3 = this.A0J;
            if (c65o3 != null) {
                if (this.A06 > -1 && (i = this.A04) != 0) {
                    c65o3.A0F(ColorStateList.valueOf(i));
                }
                invalidate();
            }
            invalidate();
        }
    }

    private void A02() {
        CheckableImageButton checkableImageButton = this.A1D;
        boolean z = this.A12;
        ColorStateList colorStateList = this.A0A;
        boolean z2 = this.A13;
        PorterDuff.Mode mode = this.A0p;
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = drawable.mutate();
            if (z) {
                drawable.setTintList(colorStateList);
            }
            if (z2) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private void A03() {
        CheckableImageButton checkableImageButton = this.A1F;
        boolean z = this.A14;
        ColorStateList colorStateList = this.A0D;
        boolean z2 = this.A15;
        PorterDuff.Mode mode = this.A0q;
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = drawable.mutate();
            if (z) {
                drawable.setTintList(colorStateList);
            }
            if (z2) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private void A04() {
        EditText editText;
        int paddingStart;
        Resources resources;
        int dimensionPixelSize;
        int paddingEnd;
        int i;
        Resources resources2;
        int i2;
        C65O c65o;
        int i3 = this.A01;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    if (this.A0Q && !(this.A0I instanceof C67770Uxl)) {
                        c65o = new C67770Uxl(this.A0K);
                    } else {
                        c65o = new C65O(this.A0K);
                    }
                    this.A0I = c65o;
                    this.A0J = null;
                } else {
                    throw new IllegalArgumentException(AnonymousClass001.A03(i3, " is illegal; only @BoxBackgroundMode constants are supported."));
                }
            } else {
                this.A0I = new C65O(this.A0K);
                this.A0J = new C65O();
            }
        } else {
            this.A0I = null;
            this.A0J = null;
        }
        EditText editText2 = this.A0F;
        if (editText2 != null && this.A0I != null && editText2.getBackground() == null && this.A01 != 0) {
            this.A0F.setBackground(this.A0I);
        }
        A0I();
        if (this.A01 == 1) {
            Context context = getContext();
            if (AbstractC58319PtB.A08(context).fontScale >= 2.0f) {
                resources2 = getResources();
                i2 = R.dimen.abc_button_padding_horizontal_material;
            } else if (AbstractC1567371w.A04(context)) {
                resources2 = getResources();
                i2 = R.dimen.abc_action_bar_elevation_material;
            }
            this.A02 = resources2.getDimensionPixelSize(i2);
        }
        if (this.A0F != null && this.A01 == 1) {
            Context context2 = getContext();
            if (AbstractC58319PtB.A08(context2).fontScale >= 2.0f) {
                editText = this.A0F;
                paddingStart = editText.getPaddingStart();
                resources = getResources();
                dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
                paddingEnd = this.A0F.getPaddingEnd();
                i = R.dimen.abc_button_padding_horizontal_material;
            } else if (AbstractC1567371w.A04(context2)) {
                editText = this.A0F;
                paddingStart = editText.getPaddingStart();
                resources = getResources();
                dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.asset_picker_cell_margin);
                paddingEnd = this.A0F.getPaddingEnd();
                i = R.dimen.account_discovery_bottom_gap;
            }
            editText.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, resources.getDimensionPixelSize(i));
        }
        if (this.A01 != 0) {
            A07();
        }
    }

    private void A06() {
        int i;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.A0G;
        if (textView != null) {
            if (this.A10) {
                i = this.A0W;
            } else {
                i = this.A0X;
            }
            A0L(textView, i);
            if (!this.A10 && (colorStateList2 = this.A0m) != null) {
                this.A0G.setTextColor(colorStateList2);
            }
            if (this.A10 && (colorStateList = this.A0l) != null) {
                this.A0G.setTextColor(colorStateList);
            }
        }
    }

    private void A07() {
        if (this.A01 != 1) {
            FrameLayout frameLayout = this.A19;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int A00 = A00();
            if (A00 != marginLayoutParams.topMargin) {
                marginLayoutParams.topMargin = A00;
                frameLayout.requestLayout();
            }
        }
    }

    private void A08() {
        int paddingStart;
        if (this.A0F != null) {
            if (this.A1F.getVisibility() == 0) {
                paddingStart = 0;
            } else {
                paddingStart = this.A0F.getPaddingStart();
            }
            this.A1C.setPaddingRelative(paddingStart, this.A0F.getCompoundPaddingTop(), AbstractC167017dG.A07(getContext()), this.A0F.getCompoundPaddingBottom());
        }
    }

    private void A09() {
        int i;
        if (this.A0F != null) {
            if (!A0M() && this.A1E.getVisibility() != 0) {
                i = this.A0F.getPaddingEnd();
            } else {
                i = 0;
            }
            this.A1O.setPaddingRelative(AbstractC167017dG.A07(getContext()), this.A0F.getPaddingTop(), i, this.A0F.getPaddingBottom());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r5.A0R != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0A() {
        /*
            r5 = this;
            android.widget.TextView r4 = r5.A1O
            int r3 = r4.getVisibility()
            java.lang.CharSequence r0 = r5.A0N
            r1 = 0
            if (r0 == 0) goto L10
            boolean r0 = r5.A0R
            r2 = 1
            if (r0 == 0) goto L13
        L10:
            r2 = 0
            r1 = 8
        L13:
            r4.setVisibility(r1)
            int r0 = r4.getVisibility()
            if (r3 == r0) goto L2f
            X.Vha r1 = r5.getEndIconDelegate()
            boolean r0 = r1 instanceof X.C67776Uxs
            if (r0 == 0) goto L2f
            X.Uxs r1 = (X.C67776Uxs) r1
            com.google.android.material.textfield.TextInputLayout r0 = r1.A02
            java.lang.CharSequence r0 = r0.A0N
            if (r0 == 0) goto L2f
            X.C67776Uxs.A00(r1, r2)
        L2f:
            r5.A0G()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A0A():void");
    }

    public static void A0D(TextInputLayout textInputLayout, int i) {
        if (i == 0 && !textInputLayout.A0R) {
            TextView textView = textInputLayout.A0H;
            if (textView != null && textInputLayout.A0T) {
                textView.setText(textInputLayout.A0L);
                textInputLayout.A0H.setVisibility(0);
                textInputLayout.A0H.bringToFront();
                return;
            }
            return;
        }
        TextView textView2 = textInputLayout.A0H;
        if (textView2 == null || !textInputLayout.A0T) {
            return;
        }
        textView2.setText((CharSequence) null);
        textInputLayout.A0H.setVisibility(4);
    }

    private boolean A0F() {
        if (this.A0Q && !TextUtils.isEmpty(this.A0y) && (this.A0I instanceof C67770Uxl)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0019, code lost:
    
        if (r11.A1B.getMeasuredWidth() <= 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0G() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A0G():boolean");
    }

    private AbstractC69084Vha getEndIconDelegate() {
        SparseArray sparseArray = this.A1M;
        AbstractC69084Vha abstractC69084Vha = (AbstractC69084Vha) sparseArray.get(this.A08);
        if (abstractC69084Vha == null) {
            return (AbstractC69084Vha) sparseArray.get(0);
        }
        return abstractC69084Vha;
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        CheckableImageButton checkableImageButton = this.A1E;
        if (checkableImageButton.getVisibility() != 0) {
            if (this.A08 != 0 && A0M()) {
                return this.A1D;
            }
            return null;
        }
        return checkableImageButton;
    }

    private void setEditText(EditText editText) {
        if (this.A0F == null) {
            this.A0F = editText;
            setMinWidth(this.A0i);
            setMaxWidth(this.A0h);
            A04();
            setTextInputAccessibilityDelegate(new UEH(this));
            C65757TtX c65757TtX = this.A1G;
            c65757TtX.A0F(this.A0F.getTypeface());
            float textSize = this.A0F.getTextSize();
            if (c65757TtX.A0K != textSize) {
                c65757TtX.A0K = textSize;
                c65757TtX.A0G(false);
            }
            int gravity = this.A0F.getGravity();
            c65757TtX.A09((gravity & (-113)) | 48);
            if (c65757TtX.A0R != gravity) {
                c65757TtX.A0R = gravity;
                c65757TtX.A0G(false);
            }
            this.A0F.addTextChangedListener(new WKU(this, 2));
            if (this.A0n == null) {
                this.A0n = this.A0F.getHintTextColors();
            }
            if (this.A0Q) {
                if (TextUtils.isEmpty(this.A0y)) {
                    CharSequence hint = this.A0F.getHint();
                    this.A0z = hint;
                    setHint(hint);
                    this.A0F.setHint((CharSequence) null);
                }
                this.A0S = true;
            }
            if (this.A0G != null) {
                A0K(this.A0F.getText().length());
            }
            A0H();
            this.A1H.A03();
            this.A1B.bringToFront();
            this.A1A.bringToFront();
            this.A1N.bringToFront();
            this.A1E.bringToFront();
            Iterator it = this.A1I.iterator();
            while (it.hasNext()) {
                ((InterfaceC71913X9x) it.next()).DCq(this);
            }
            A08();
            A09();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            A0E(this, false, true);
            return;
        }
        throw new IllegalArgumentException(AbstractC111324zv.A00(3817));
    }

    private void setErrorIconVisible(boolean z) {
        int i = 0;
        this.A1E.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        FrameLayout frameLayout = this.A1N;
        if (z) {
            i = 8;
        }
        frameLayout.setVisibility(i);
        A09();
        if (this.A08 == 0) {
            A0G();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.A0y)) {
            this.A0y = charSequence;
            C65757TtX c65757TtX = this.A1G;
            if (charSequence == null || !TextUtils.equals(c65757TtX.A0f, charSequence)) {
                c65757TtX.A0f = charSequence;
                c65757TtX.A0g = null;
                c65757TtX.A0G(false);
            }
            if (!this.A0R) {
                A05();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.A0T != z) {
            if (z) {
                C3WF c3wf = new C3WF(getContext(), null);
                this.A0H = c3wf;
                c3wf.setId(R.id.textinput_placeholder);
                this.A0H.setAccessibilityLiveRegion(1);
                setPlaceholderTextAppearance(this.A0j);
                setPlaceholderTextColor(this.A0o);
                TextView textView = this.A0H;
                if (textView != null) {
                    this.A19.addView(textView);
                    this.A0H.setVisibility(0);
                }
            } else {
                AbstractC167007dF.A0x(this.A0H);
                this.A0H = null;
            }
            this.A0T = z;
        }
    }

    public final void A0H() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.A0F;
        if (editText != null && this.A01 == 0 && (background = editText.getBackground()) != null) {
            Drawable mutate = background.mutate();
            C70176WEy c70176WEy = this.A1H;
            if (c70176WEy.A07()) {
                textView = c70176WEy.A09;
                if (textView == null) {
                    currentTextColor = -1;
                    mutate.setColorFilter(C52102aA.A00(PorterDuff.Mode.SRC_IN, currentTextColor));
                }
            } else if (!this.A10 || (textView = this.A0G) == null) {
                mutate.clearColorFilter();
                this.A0F.refreshDrawableState();
                return;
            }
            currentTextColor = textView.getCurrentTextColor();
            mutate.setColorFilter(C52102aA.A00(PorterDuff.Mode.SRC_IN, currentTextColor));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0106, code lost:
    
        if (r1 != null) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0I() {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A0I():void");
    }

    public final void A0J(float f) {
        C65757TtX c65757TtX = this.A1G;
        if (c65757TtX.A0E != f) {
            if (this.A09 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.A09 = valueAnimator;
                valueAnimator.setInterpolator(AbstractC153306uz.A02);
                this.A09.setDuration(167L);
                C65759TtZ.A00(this.A09, this, 12);
            }
            this.A09.setFloatValues(c65757TtX.A0E, f);
            this.A09.start();
        }
    }

    public final void A0K(int i) {
        String obj;
        boolean z = this.A10;
        int i2 = this.A07;
        if (i2 == -1) {
            MSX.A15(this.A0G, i);
            this.A0G.setContentDescription(null);
            this.A10 = false;
        } else {
            boolean A1S = AbstractC25230BEn.A1S(i, i2);
            this.A10 = A1S;
            Context context = getContext();
            TextView textView = this.A0G;
            int i3 = 2131955110;
            if (A1S) {
                i3 = 2131955111;
            }
            Integer valueOf = Integer.valueOf(i);
            textView.setContentDescription(context.getString(i3, AbstractC25228BEl.A1Z(valueOf, i2)));
            if (z != this.A10) {
                A06();
            }
            C6H7 A02 = C6H7.A02();
            TextView textView2 = this.A0G;
            String string = context.getString(2131955112, AbstractC25228BEl.A1Z(valueOf, this.A07));
            InterfaceC78793fl interfaceC78793fl = A02.A00;
            if (string == null) {
                obj = null;
            } else {
                obj = A02.A03(interfaceC78793fl, string).toString();
            }
            textView2.setText(obj);
        }
        if (this.A0F != null && z != this.A10) {
            A0E(this, false, false);
            A0I();
            A0H();
        }
    }

    public final boolean A0M() {
        if (this.A1N.getVisibility() == 0 && this.A1D.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            FrameLayout frameLayout = this.A19;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            A07();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.A0F;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.A0z != null) {
            boolean z = this.A0S;
            this.A0S = false;
            CharSequence hint = editText.getHint();
            this.A0F.setHint(this.A0z);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.A0F.setHint(hint);
                this.A0S = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.A19;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.A0F) {
                newChild.setHint(getHint());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.A16
            if (r0 != 0) goto L4d
            r3 = 1
            r4.A16 = r3
            super.drawableStateChanged()
            int[] r0 = r4.getDrawableState()
            X.TtX r1 = r4.A1G
            r2 = 0
            if (r1 == 0) goto L50
            r1.A0l = r0
            android.content.res.ColorStateList r0 = r1.A0X
            if (r0 == 0) goto L1f
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L29
        L1f:
            android.content.res.ColorStateList r0 = r1.A0Z
            if (r0 == 0) goto L50
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L50
        L29:
            r1.A0G(r2)
            r1 = 1
        L2d:
            android.widget.EditText r0 = r4.A0F
            if (r0 == 0) goto L40
            boolean r0 = r4.isLaidOut()
            if (r0 == 0) goto L4e
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L4e
        L3d:
            A0E(r4, r3, r2)
        L40:
            r4.A0H()
            r4.A0I()
            if (r1 == 0) goto L4b
            r4.invalidate()
        L4b:
            r4.A16 = r2
        L4d:
            return
        L4e:
            r3 = 0
            goto L3d
        L50:
            r1 = 0
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.A0F;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + A00();
        }
        return super.getBaseline();
    }

    public C65O getBoxBackground() {
        int i = this.A01;
        if (i != 1 && i != 2) {
            throw new IllegalStateException();
        }
        return this.A0I;
    }

    public int getBoxBackgroundColor() {
        return this.A00;
    }

    public int getBoxBackgroundMode() {
        return this.A01;
    }

    public float getBoxCornerRadiusBottomEnd() {
        C65O c65o = this.A0I;
        C65U c65u = c65o.A00.A0K.A00;
        RectF rectF = c65o.A0C;
        AbstractC65702TsY.A0x(rectF, c65o);
        return c65u.Art(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        C65O c65o = this.A0I;
        C65U c65u = c65o.A00.A0K.A01;
        RectF rectF = c65o.A0C;
        AbstractC65702TsY.A0x(rectF, c65o);
        return c65u.Art(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        C65O c65o = this.A0I;
        C65U c65u = c65o.A00.A0K.A03;
        RectF rectF = c65o.A0C;
        AbstractC65702TsY.A0x(rectF, c65o);
        return c65u.Art(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        return this.A0I.A07();
    }

    public int getBoxStrokeColor() {
        return this.A0e;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.A0E;
    }

    public int getBoxStrokeWidth() {
        return this.A0V;
    }

    public int getBoxStrokeWidthFocused() {
        return this.A05;
    }

    public int getCounterMaxLength() {
        return this.A07;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.A0O && this.A10 && (textView = this.A0G) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.A0m;
    }

    public ColorStateList getCounterTextColor() {
        return this.A0m;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.A0n;
    }

    public EditText getEditText() {
        return this.A0F;
    }

    public CharSequence getEndIconContentDescription() {
        return this.A1D.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.A1D.getDrawable();
    }

    public int getEndIconMode() {
        return this.A08;
    }

    public CheckableImageButton getEndIconView() {
        return this.A1D;
    }

    public CharSequence getError() {
        C70176WEy c70176WEy = this.A1H;
        if (c70176WEy.A0E) {
            return c70176WEy.A0B;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.A1H.A0C;
    }

    public int getErrorCurrentTextColors() {
        TextView textView = this.A1H.A09;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.A1E.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        TextView textView = this.A1H.A09;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHelperText() {
        C70176WEy c70176WEy = this.A1H;
        if (c70176WEy.A0F) {
            return c70176WEy.A0D;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        TextView textView = this.A1H.A0A;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.A0Q) {
            return this.A0y;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.A1G.A05();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C65757TtX c65757TtX = this.A1G;
        return C65757TtX.A01(c65757TtX.A0X, c65757TtX);
    }

    public ColorStateList getHintTextColor() {
        return this.A0C;
    }

    public int getMaxWidth() {
        return this.A0h;
    }

    public int getMinWidth() {
        return this.A0i;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.A1D.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.A1D.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.A0T) {
            return this.A0L;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.A0j;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.A0o;
    }

    public CharSequence getPrefixText() {
        return this.A0M;
    }

    public ColorStateList getPrefixTextColor() {
        return this.A1C.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.A1C;
    }

    public CharSequence getStartIconContentDescription() {
        return this.A1F.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.A1F.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.A0N;
    }

    public ColorStateList getSuffixTextColor() {
        return this.A1O.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.A1O;
    }

    public Typeface getTypeface() {
        return this.A0r;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(((AbsSavedState) savedState).A00);
        setError(savedState.A00);
        if (savedState.A04) {
            this.A1D.post(new RunnableC71299WrT(this));
        }
        setHint(savedState.A02);
        setHelperText(savedState.A01);
        setPlaceholderText(savedState.A03);
        requestLayout();
    }

    public void setBoxBackgroundColor(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            this.A0Y = i;
            this.A0d = i;
            this.A0f = i;
            A01();
        }
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.A01) {
            this.A01 = i;
            if (this.A0F != null) {
                A04();
            }
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.A0e != i) {
            this.A0e = i;
            A0I();
        }
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.A0E != colorStateList) {
            this.A0E = colorStateList;
            A0I();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.A0V = i;
        A0I();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.A05 = i;
        A0I();
    }

    public void setCounterEnabled(boolean z) {
        int length;
        if (this.A0O != z) {
            if (z) {
                C3WF c3wf = new C3WF(getContext(), null);
                this.A0G = c3wf;
                c3wf.setId(R.id.textinput_counter);
                Typeface typeface = this.A0r;
                if (typeface != null) {
                    this.A0G.setTypeface(typeface);
                }
                this.A0G.setMaxLines(1);
                this.A1H.A05(this.A0G, 2);
                ((ViewGroup.MarginLayoutParams) this.A0G.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
                A06();
                if (this.A0G != null) {
                    EditText editText = this.A0F;
                    if (editText == null) {
                        length = 0;
                    } else {
                        length = editText.getText().length();
                    }
                    A0K(length);
                }
            } else {
                this.A1H.A06(this.A0G, 2);
                this.A0G = null;
            }
            this.A0O = z;
        }
    }

    public void setCounterMaxLength(int i) {
        int length;
        if (this.A07 != i) {
            if (i <= 0) {
                i = -1;
            }
            this.A07 = i;
            if (this.A0O && this.A0G != null) {
                EditText editText = this.A0F;
                if (editText == null) {
                    length = 0;
                } else {
                    length = editText.getText().length();
                }
                A0K(length);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.A0W != i) {
            this.A0W = i;
            A06();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.A0l != colorStateList) {
            this.A0l = colorStateList;
            A06();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.A0X != i) {
            this.A0X = i;
            A06();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.A0m != colorStateList) {
            this.A0m = colorStateList;
            A06();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.A0n = colorStateList;
        this.A0C = colorStateList;
        if (this.A0F != null) {
            A0E(this, false, false);
        }
    }

    public void setEndIconActivated(boolean z) {
        this.A1D.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.A1D.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setEndIconContentDescription(charSequence);
    }

    public void setEndIconDrawable(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C71x.A00(getContext(), i);
        } else {
            drawable = null;
        }
        setEndIconDrawable(drawable);
    }

    public void setEndIconMode(int i) {
        int i2 = this.A08;
        this.A08 = i;
        Iterator it = this.A1J.iterator();
        while (it.hasNext()) {
            ((InterfaceC71914X9y) it.next()).DDc(this, i2);
        }
        setEndIconVisible(AbstractC167007dF.A1M(i));
        AbstractC69084Vha endIconDelegate = getEndIconDelegate();
        int i3 = this.A01;
        if ((endIconDelegate instanceof C67777Uxt) && !AbstractC167007dF.A1M(i3)) {
            throw new IllegalStateException(AnonymousClass001.A02(i3, i, "The current box background mode ", " is not supported by the end icon mode "));
        }
        AbstractC69084Vha endIconDelegate2 = getEndIconDelegate();
        if (endIconDelegate2 instanceof C67775Uxr) {
            C67775Uxr c67775Uxr = (C67775Uxr) endIconDelegate2;
            TextInputLayout textInputLayout = ((AbstractC69084Vha) c67775Uxr).A02;
            textInputLayout.setEndIconDrawable(C71x.A00(((AbstractC69084Vha) c67775Uxr).A00, R.drawable.design_password_eye));
            textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(2131969377));
            textInputLayout.setEndIconOnClickListener(new WNN(c67775Uxr, 52));
            InterfaceC71913X9x interfaceC71913X9x = c67775Uxr.A01;
            textInputLayout.A1I.add(interfaceC71913X9x);
            if (textInputLayout.A0F != null) {
                interfaceC71913X9x.DCq(textInputLayout);
            }
            textInputLayout.A1J.add(c67775Uxr.A02);
            EditText editText = textInputLayout.A0F;
            if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        } else if (endIconDelegate2 instanceof C67774Uxq) {
            TextInputLayout textInputLayout2 = endIconDelegate2.A02;
            textInputLayout2.setEndIconOnClickListener(null);
            textInputLayout2.setEndIconDrawable((Drawable) null);
            textInputLayout2.setEndIconContentDescription((CharSequence) null);
        } else if (endIconDelegate2 instanceof C67777Uxt) {
            C67777Uxt c67777Uxt = (C67777Uxt) endIconDelegate2;
            Context context = ((AbstractC69084Vha) c67777Uxt).A00;
            float dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material);
            float dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material);
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material);
            C65O A00 = C67777Uxt.A00(c67777Uxt, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
            C65O A002 = C67777Uxt.A00(c67777Uxt, 0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
            c67777Uxt.A05 = A00;
            StateListDrawable stateListDrawable = new StateListDrawable();
            c67777Uxt.A03 = stateListDrawable;
            stateListDrawable.addState(new int[]{android.R.attr.state_above_anchor}, A00);
            c67777Uxt.A03.addState(new int[0], A002);
            TextInputLayout textInputLayout3 = ((AbstractC69084Vha) c67777Uxt).A02;
            textInputLayout3.setEndIconDrawable(C71x.A00(context, R.drawable.mtrl_dropdown_arrow));
            textInputLayout3.setEndIconContentDescription(textInputLayout3.getResources().getText(2131962021));
            textInputLayout3.setEndIconOnClickListener(new WNN(c67777Uxt, 51));
            InterfaceC71913X9x interfaceC71913X9x2 = c67777Uxt.A0B;
            textInputLayout3.A1I.add(interfaceC71913X9x2);
            if (textInputLayout3.A0F != null) {
                interfaceC71913X9x2.DCq(textInputLayout3);
            }
            textInputLayout3.A1J.add(c67777Uxt.A0C);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            TimeInterpolator timeInterpolator = AbstractC153306uz.A03;
            ofFloat.setInterpolator(timeInterpolator);
            ofFloat.setDuration(67L);
            C65759TtZ.A00(ofFloat, c67777Uxt, 11);
            c67777Uxt.A01 = ofFloat;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat2.setInterpolator(timeInterpolator);
            ofFloat2.setDuration(50L);
            C65759TtZ.A00(ofFloat2, c67777Uxt, 11);
            c67777Uxt.A02 = ofFloat2;
            U5Q.A00(ofFloat2, c67777Uxt, 18);
            c67777Uxt.A04 = (AccessibilityManager) context.getSystemService("accessibility");
        } else if (endIconDelegate2 instanceof C67773Uxp) {
            TextInputLayout textInputLayout4 = endIconDelegate2.A02;
            textInputLayout4.setEndIconOnClickListener(null);
            textInputLayout4.setEndIconOnLongClickListener(null);
        } else {
            C67776Uxs c67776Uxs = (C67776Uxs) endIconDelegate2;
            TextInputLayout textInputLayout5 = ((AbstractC69084Vha) c67776Uxs).A02;
            textInputLayout5.setEndIconDrawable(C71x.A00(((AbstractC69084Vha) c67776Uxs).A00, R.drawable.mtrl_ic_cancel));
            textInputLayout5.setEndIconContentDescription(textInputLayout5.getResources().getText(2131955203));
            textInputLayout5.setEndIconOnClickListener(new WNN(c67776Uxs, 50));
            InterfaceC71913X9x interfaceC71913X9x3 = c67776Uxs.A04;
            textInputLayout5.A1I.add(interfaceC71913X9x3);
            if (textInputLayout5.A0F != null) {
                interfaceC71913X9x3.DCq(textInputLayout5);
            }
            textInputLayout5.A1J.add(c67776Uxs.A05);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.8f, 1.0f);
            ofFloat3.setInterpolator(AbstractC153306uz.A04);
            ofFloat3.setDuration(150L);
            C65759TtZ.A00(ofFloat3, c67776Uxs, 10);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
            TimeInterpolator timeInterpolator2 = AbstractC153306uz.A03;
            ofFloat4.setInterpolator(timeInterpolator2);
            ofFloat4.setDuration(100L);
            C65759TtZ.A00(ofFloat4, c67776Uxs, 9);
            AnimatorSet animatorSet = new AnimatorSet();
            c67776Uxs.A00 = animatorSet;
            animatorSet.playTogether(ofFloat3, ofFloat4);
            U5Q.A00(c67776Uxs.A00, c67776Uxs, 16);
            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat5.setInterpolator(timeInterpolator2);
            ofFloat5.setDuration(100L);
            C65759TtZ.A00(ofFloat5, c67776Uxs, 9);
            c67776Uxs.A01 = ofFloat5;
            U5Q.A00(ofFloat5, c67776Uxs, 17);
        }
        A02();
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        setIconOnClickListener(this.A1D, onClickListener, this.A0v);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.A0v = onLongClickListener;
        setIconOnLongClickListener(this.A1D, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.A0A != colorStateList) {
            this.A0A = colorStateList;
            this.A12 = true;
            A02();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.A0p != mode) {
            this.A0p = mode;
            this.A13 = true;
            A02();
        }
    }

    public void setError(CharSequence charSequence) {
        C70176WEy c70176WEy = this.A1H;
        if (!c70176WEy.A0E) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            Animator animator = c70176WEy.A04;
            if (animator != null) {
                animator.cancel();
            }
            c70176WEy.A0B = charSequence;
            c70176WEy.A09.setText(charSequence);
            int i = c70176WEy.A00;
            if (i != 1) {
                c70176WEy.A01 = 1;
            }
            C70176WEy.A01(c70176WEy, i, c70176WEy.A01, C70176WEy.A02(c70176WEy.A09, c70176WEy, charSequence));
            return;
        }
        c70176WEy.A04();
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C70176WEy c70176WEy = this.A1H;
        c70176WEy.A0C = charSequence;
        TextView textView = c70176WEy.A09;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        C70176WEy c70176WEy = this.A1H;
        if (c70176WEy.A0E != z) {
            Animator animator = c70176WEy.A04;
            if (animator != null) {
                animator.cancel();
            }
            if (z) {
                C3WF c3wf = new C3WF(c70176WEy.A0J, null);
                c70176WEy.A09 = c3wf;
                c3wf.setId(R.id.textinput_error);
                c70176WEy.A09.setTextAlignment(5);
                Typeface typeface = c70176WEy.A07;
                if (typeface != null) {
                    c70176WEy.A09.setTypeface(typeface);
                }
                int i = c70176WEy.A02;
                c70176WEy.A02 = i;
                TextView textView = c70176WEy.A09;
                if (textView != null) {
                    c70176WEy.A0K.A0L(textView, i);
                }
                ColorStateList colorStateList = c70176WEy.A05;
                c70176WEy.A05 = colorStateList;
                TextView textView2 = c70176WEy.A09;
                if (textView2 != null && colorStateList != null) {
                    textView2.setTextColor(colorStateList);
                }
                CharSequence charSequence = c70176WEy.A0C;
                c70176WEy.A0C = charSequence;
                TextView textView3 = c70176WEy.A09;
                if (textView3 != null) {
                    textView3.setContentDescription(charSequence);
                }
                c70176WEy.A09.setVisibility(4);
                c70176WEy.A09.setAccessibilityLiveRegion(1);
                c70176WEy.A05(c70176WEy.A09, 0);
            } else {
                c70176WEy.A04();
                c70176WEy.A06(c70176WEy.A09, 0);
                c70176WEy.A09 = null;
                TextInputLayout textInputLayout = c70176WEy.A0K;
                textInputLayout.A0H();
                textInputLayout.A0I();
            }
            c70176WEy.A0E = z;
        }
    }

    public void setErrorIconDrawable(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C71x.A00(getContext(), i);
        } else {
            drawable = null;
        }
        setErrorIconDrawable(drawable);
        A0B(this.A0B, this.A1E, this);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        setIconOnClickListener(this.A1E, onClickListener, this.A0w);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.A0w = onLongClickListener;
        setIconOnLongClickListener(this.A1E, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.A0B = colorStateList;
        CheckableImageButton checkableImageButton = this.A1E;
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintList(colorStateList);
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        CheckableImageButton checkableImageButton = this.A1E;
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintMode(mode);
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        C70176WEy c70176WEy = this.A1H;
        c70176WEy.A02 = i;
        TextView textView = c70176WEy.A09;
        if (textView != null) {
            c70176WEy.A0K.A0L(textView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C70176WEy c70176WEy = this.A1H;
        c70176WEy.A05 = colorStateList;
        TextView textView = c70176WEy.A09;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.A11 != z) {
            this.A11 = z;
            A0E(this, false, false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C70176WEy c70176WEy = this.A1H;
        c70176WEy.A06 = colorStateList;
        TextView textView = c70176WEy.A0A;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        C70176WEy c70176WEy = this.A1H;
        if (c70176WEy.A0F != z) {
            Animator animator = c70176WEy.A04;
            if (animator != null) {
                animator.cancel();
            }
            if (z) {
                C3WF c3wf = new C3WF(c70176WEy.A0J, null);
                c70176WEy.A0A = c3wf;
                c3wf.setId(R.id.textinput_helper_text);
                c70176WEy.A0A.setTextAlignment(5);
                Typeface typeface = c70176WEy.A07;
                if (typeface != null) {
                    c70176WEy.A0A.setTypeface(typeface);
                }
                c70176WEy.A0A.setVisibility(4);
                c70176WEy.A0A.setAccessibilityLiveRegion(1);
                int i = c70176WEy.A03;
                c70176WEy.A03 = i;
                TextView textView = c70176WEy.A0A;
                if (textView != null) {
                    textView.setTextAppearance(i);
                }
                ColorStateList colorStateList = c70176WEy.A06;
                c70176WEy.A06 = colorStateList;
                TextView textView2 = c70176WEy.A0A;
                if (textView2 != null && colorStateList != null) {
                    textView2.setTextColor(colorStateList);
                }
                c70176WEy.A05(c70176WEy.A0A, 1);
            } else {
                Animator animator2 = c70176WEy.A04;
                if (animator2 != null) {
                    animator2.cancel();
                }
                int i2 = c70176WEy.A00;
                if (i2 == 2) {
                    c70176WEy.A01 = 0;
                }
                C70176WEy.A01(c70176WEy, i2, c70176WEy.A01, C70176WEy.A02(c70176WEy.A0A, c70176WEy, null));
                c70176WEy.A06(c70176WEy.A0A, 1);
                c70176WEy.A0A = null;
                TextInputLayout textInputLayout = c70176WEy.A0K;
                textInputLayout.A0H();
                textInputLayout.A0I();
            }
            c70176WEy.A0F = z;
        }
    }

    public void setHelperTextTextAppearance(int i) {
        C70176WEy c70176WEy = this.A1H;
        c70176WEy.A03 = i;
        TextView textView = c70176WEy.A0A;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    public void setHint(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setHint(charSequence);
    }

    public void setHintEnabled(boolean z) {
        if (z != this.A0Q) {
            this.A0Q = z;
            if (!z) {
                this.A0S = false;
                if (!TextUtils.isEmpty(this.A0y) && TextUtils.isEmpty(this.A0F.getHint())) {
                    this.A0F.setHint(this.A0y);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.A0F.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.A0y)) {
                        setHint(hint);
                    }
                    this.A0F.setHint((CharSequence) null);
                }
                this.A0S = true;
            }
            if (this.A0F != null) {
                A07();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        C65757TtX c65757TtX = this.A1G;
        c65757TtX.A08(i);
        this.A0C = c65757TtX.A0X;
        if (this.A0F != null) {
            A0E(this, false, false);
            A07();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.A0C != colorStateList) {
            if (this.A0n == null) {
                this.A1G.A0D(colorStateList);
            }
            this.A0C = colorStateList;
            if (this.A0F != null) {
                A0E(this, false, false);
            }
        }
    }

    public void setMaxWidth(int i) {
        this.A0h = i;
        EditText editText = this.A0F;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    public void setMinWidth(int i) {
        this.A0i = i;
        EditText editText = this.A0F;
        if (editText != null && i != -1) {
            editText.setMinWidth(i);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setPasswordVisibilityToggleContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C71x.A00(getContext(), i);
        } else {
            drawable = null;
        }
        setPasswordVisibilityToggleDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        int i;
        if (z) {
            i = 1;
            if (this.A08 == 1) {
                return;
            }
        } else {
            i = 0;
        }
        setEndIconMode(i);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.A0A = colorStateList;
        this.A12 = true;
        A02();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.A0p = mode;
        this.A13 = true;
        A02();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        int length;
        if (this.A0T && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.A0T) {
                setPlaceholderTextEnabled(true);
            }
            this.A0L = charSequence;
        }
        EditText editText = this.A0F;
        if (editText == null) {
            length = 0;
        } else {
            length = editText.getText().length();
        }
        A0D(this, length);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.A0j = i;
        TextView textView = this.A0H;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.A0o != colorStateList) {
            this.A0o = colorStateList;
            TextView textView = this.A0H;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixTextAppearance(int i) {
        this.A1C.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.A1C.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.A1F.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setStartIconContentDescription(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.A1F;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            A0B(this.A0D, checkableImageButton, this);
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription((CharSequence) null);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        setIconOnClickListener(this.A1F, onClickListener, this.A0x);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.A0x = onLongClickListener;
        setIconOnLongClickListener(this.A1F, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.A0D != colorStateList) {
            this.A0D = colorStateList;
            this.A14 = true;
            A03();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.A0q != mode) {
            this.A0q = mode;
            this.A15 = true;
            A03();
        }
    }

    public void setStartIconVisible(boolean z) {
        CheckableImageButton checkableImageButton = this.A1F;
        if (AbstractC167007dF.A1N(checkableImageButton.getVisibility()) != z) {
            checkableImageButton.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
            A08();
            A0G();
        }
    }

    public void setSuffixTextAppearance(int i) {
        this.A1O.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.A1O.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(UEH ueh) {
        EditText editText = this.A0F;
        if (editText != null) {
            AbstractC010103p.A0B(editText, ueh);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.A0r) {
            this.A0r = typeface;
            this.A1G.A0F(typeface);
            C70176WEy c70176WEy = this.A1H;
            if (typeface != c70176WEy.A07) {
                c70176WEy.A07 = typeface;
                TextView textView = c70176WEy.A09;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = c70176WEy.A0A;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.A0G;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(C65K.A00(context, attributeSet, i, R.style.Widget_Design_TextInputLayout), attributeSet, i);
        int[] iArr;
        this.A0i = -1;
        this.A0h = -1;
        this.A1H = new C70176WEy(this);
        this.A1K = new Rect();
        this.A18 = new Rect();
        this.A1L = new RectF();
        this.A1I = new LinkedHashSet();
        this.A08 = 0;
        SparseArray sparseArray = new SparseArray();
        this.A1M = sparseArray;
        this.A1J = new LinkedHashSet();
        C65757TtX c65757TtX = new C65757TtX(this);
        this.A1G = c65757TtX;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.A19 = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(frameLayout);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.A1B = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        frameLayout.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(context2);
        this.A1A = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout.addView(linearLayout2);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.A1N = frameLayout2;
        MSY.A10(frameLayout2, -2, -1);
        TimeInterpolator timeInterpolator = AbstractC153306uz.A03;
        c65757TtX.A0V = timeInterpolator;
        c65757TtX.A0G(false);
        c65757TtX.A0U = timeInterpolator;
        c65757TtX.A0G(false);
        c65757TtX.A09(8388659);
        int[] iArr2 = C65N.A0d;
        C65M.A01(context2, attributeSet, i, R.style.Widget_Design_TextInputLayout);
        C65M.A02(context2, attributeSet, iArr2, new int[]{20, 18, 33, 38, 42}, i, R.style.Widget_Design_TextInputLayout);
        C53122bu A00 = C53122bu.A00(context2, attributeSet, iArr2, i, R.style.Widget_Design_TextInputLayout);
        TypedArray typedArray = A00.A02;
        this.A0Q = typedArray.getBoolean(41, true);
        setHint(typedArray.getText(4));
        this.A0P = typedArray.getBoolean(40, true);
        this.A11 = typedArray.getBoolean(35, true);
        if (typedArray.hasValue(3)) {
            setMinWidth(typedArray.getDimensionPixelSize(3, -1));
        }
        if (typedArray.hasValue(2)) {
            setMaxWidth(typedArray.getDimensionPixelSize(2, -1));
        }
        this.A0K = new C65Q(C65Q.A01(context2, attributeSet, i, R.style.Widget_Design_TextInputLayout));
        this.A17 = context2.getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material);
        this.A02 = typedArray.getDimensionPixelOffset(7, 0);
        this.A0V = typedArray.getDimensionPixelSize(14, AbstractC43594JPz.A04(context2));
        this.A05 = typedArray.getDimensionPixelSize(15, AbstractC167017dG.A07(context2));
        this.A06 = this.A0V;
        float dimension = typedArray.getDimension(11, -1.0f);
        float dimension2 = typedArray.getDimension(10, -1.0f);
        float dimension3 = typedArray.getDimension(8, -1.0f);
        float dimension4 = typedArray.getDimension(9, -1.0f);
        C72G c72g = new C72G(this.A0K);
        if (dimension >= 0.0f) {
            c72g.A02 = new C65T(dimension);
        }
        if (dimension2 >= 0.0f) {
            c72g.A03 = new C65T(dimension2);
        }
        if (dimension3 >= 0.0f) {
            c72g.A01 = new C65T(dimension3);
        }
        if (dimension4 >= 0.0f) {
            c72g.A00 = new C65T(dimension4);
        }
        this.A0K = new C65Q(c72g);
        ColorStateList A02 = AbstractC1567371w.A02(context2, A00, 5);
        if (A02 != null) {
            int defaultColor = A02.getDefaultColor();
            this.A0Y = defaultColor;
            this.A00 = defaultColor;
            if (A02.isStateful()) {
                this.A0b = A02.getColorForState(new int[]{-16842910}, -1);
                this.A0d = A02.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
                iArr = new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled};
            } else {
                this.A0d = this.A0Y;
                A02 = C02G.A02(context2, R.color.mtrl_filled_background_color);
                this.A0b = A02.getColorForState(new int[]{-16842910}, -1);
                iArr = new int[]{android.R.attr.state_hovered};
            }
            this.A0f = A02.getColorForState(iArr, -1);
        } else {
            this.A00 = 0;
            this.A0Y = 0;
            this.A0b = 0;
            this.A0d = 0;
            this.A0f = 0;
        }
        if (typedArray.hasValue(1)) {
            ColorStateList A01 = A00.A01(1);
            this.A0C = A01;
            this.A0n = A01;
        }
        ColorStateList A022 = AbstractC1567371w.A02(context2, A00, 12);
        this.A0e = typedArray.getColor(12, 0);
        this.A0Z = context2.getColor(R.color.mtrl_textinput_default_box_stroke_color);
        this.A0a = context2.getColor(R.color.black_12_transparent);
        this.A0g = context2.getColor(R.color.mtrl_textinput_hovered_box_stroke_color);
        if (A022 != null) {
            setBoxStrokeColorStateList(A022);
        }
        if (typedArray.hasValue(13)) {
            setBoxStrokeErrorColor(AbstractC1567371w.A02(context2, A00, 13));
        }
        if (typedArray.getResourceId(42, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(42, 0));
        }
        int resourceId = typedArray.getResourceId(33, 0);
        CharSequence text = typedArray.getText(28);
        boolean z = typedArray.getBoolean(29, false);
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(context2).inflate(R.layout.design_text_input_end_icon, (ViewGroup) linearLayout2, false);
        this.A1E = checkableImageButton;
        checkableImageButton.setId(R.id.text_input_error_icon);
        checkableImageButton.setVisibility(8);
        if (AbstractC1567371w.A04(context2)) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        if (typedArray.hasValue(30)) {
            setErrorIconDrawable(A00.A02(30));
        }
        if (typedArray.hasValue(31)) {
            setErrorIconTintList(AbstractC1567371w.A02(context2, A00, 31));
        }
        if (typedArray.hasValue(32)) {
            setErrorIconTintMode(AbstractC126235nK.A01(null, typedArray.getInt(32, -1)));
        }
        checkableImageButton.setContentDescription(getResources().getText(2131961888));
        checkableImageButton.setImportantForAccessibility(2);
        checkableImageButton.setClickable(false);
        checkableImageButton.A01 = false;
        checkableImageButton.setFocusable(false);
        int resourceId2 = typedArray.getResourceId(38, 0);
        boolean z2 = typedArray.getBoolean(37, false);
        CharSequence text2 = typedArray.getText(36);
        int resourceId3 = typedArray.getResourceId(50, 0);
        CharSequence text3 = typedArray.getText(49);
        int resourceId4 = typedArray.getResourceId(53, 0);
        CharSequence text4 = typedArray.getText(52);
        int resourceId5 = typedArray.getResourceId(63, 0);
        CharSequence text5 = typedArray.getText(62);
        boolean z3 = typedArray.getBoolean(16, false);
        setCounterMaxLength(typedArray.getInt(17, -1));
        this.A0X = typedArray.getResourceId(20, 0);
        this.A0W = typedArray.getResourceId(18, 0);
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) LayoutInflater.from(context2).inflate(R.layout.design_text_input_start_icon, (ViewGroup) linearLayout, false);
        this.A1F = checkableImageButton2;
        checkableImageButton2.setVisibility(8);
        if (AbstractC1567371w.A04(context2)) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams()).setMarginEnd(0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (typedArray.hasValue(59)) {
            setStartIconDrawable(A00.A02(59));
            if (typedArray.hasValue(58)) {
                setStartIconContentDescription(typedArray.getText(58));
            }
            setStartIconCheckable(typedArray.getBoolean(57, true));
        }
        if (typedArray.hasValue(60)) {
            setStartIconTintList(AbstractC1567371w.A02(context2, A00, 60));
        }
        if (typedArray.hasValue(61)) {
            setStartIconTintMode(AbstractC126235nK.A01(null, typedArray.getInt(61, -1)));
        }
        setBoxBackgroundMode(typedArray.getInt(6, 0));
        CheckableImageButton checkableImageButton3 = (CheckableImageButton) LayoutInflater.from(context2).inflate(R.layout.design_text_input_end_icon, (ViewGroup) frameLayout2, false);
        this.A1D = checkableImageButton3;
        frameLayout2.addView(checkableImageButton3);
        checkableImageButton3.setVisibility(8);
        if (AbstractC1567371w.A04(context2)) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton3.getLayoutParams()).setMarginStart(0);
        }
        sparseArray.append(-1, new AbstractC69084Vha(this));
        sparseArray.append(0, new AbstractC69084Vha(this));
        sparseArray.append(1, new C67775Uxr(this));
        sparseArray.append(2, new C67776Uxs(this));
        sparseArray.append(3, new C67777Uxt(this));
        if (typedArray.hasValue(25)) {
            setEndIconMode(typedArray.getInt(25, 0));
            if (typedArray.hasValue(24)) {
                setEndIconDrawable(A00.A02(24));
            }
            if (typedArray.hasValue(23)) {
                setEndIconContentDescription(typedArray.getText(23));
            }
            setEndIconCheckable(typedArray.getBoolean(22, true));
        } else if (typedArray.hasValue(46)) {
            setEndIconMode(typedArray.getBoolean(46, false) ? 1 : 0);
            setEndIconDrawable(A00.A02(45));
            setEndIconContentDescription(typedArray.getText(44));
            if (typedArray.hasValue(47)) {
                setEndIconTintList(AbstractC1567371w.A02(context2, A00, 47));
            }
            if (typedArray.hasValue(48)) {
                setEndIconTintMode(AbstractC126235nK.A01(null, typedArray.getInt(48, -1)));
            }
        }
        if (!typedArray.hasValue(46)) {
            if (typedArray.hasValue(26)) {
                setEndIconTintList(AbstractC1567371w.A02(context2, A00, 26));
            }
            if (typedArray.hasValue(27)) {
                setEndIconTintMode(AbstractC126235nK.A01(null, typedArray.getInt(27, -1)));
            }
        }
        C3WF c3wf = new C3WF(context2, null);
        this.A1C = c3wf;
        c3wf.setId(R.id.textinput_prefix_text);
        AbstractC43593JPy.A1B(c3wf, -2);
        c3wf.setAccessibilityLiveRegion(1);
        linearLayout.addView(checkableImageButton2);
        linearLayout.addView(c3wf);
        C3WF c3wf2 = new C3WF(context2, null);
        this.A1O = c3wf2;
        c3wf2.setId(R.id.textinput_suffix_text);
        c3wf2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        c3wf2.setAccessibilityLiveRegion(1);
        linearLayout2.addView(c3wf2);
        linearLayout2.addView(checkableImageButton);
        linearLayout2.addView(frameLayout2);
        setHelperTextEnabled(z2);
        setHelperText(text2);
        setHelperTextTextAppearance(resourceId2);
        setErrorEnabled(z);
        setErrorTextAppearance(resourceId);
        setErrorContentDescription(text);
        setCounterTextAppearance(this.A0X);
        setCounterOverflowTextAppearance(this.A0W);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        setPrefixText(text4);
        setPrefixTextAppearance(resourceId4);
        setSuffixText(text5);
        setSuffixTextAppearance(resourceId5);
        if (typedArray.hasValue(34)) {
            setErrorTextColor(A00.A01(34));
        }
        if (typedArray.hasValue(39)) {
            setHelperTextColor(A00.A01(39));
        }
        if (typedArray.hasValue(43)) {
            setHintTextColor(A00.A01(43));
        }
        if (typedArray.hasValue(21)) {
            setCounterTextColor(A00.A01(21));
        }
        if (typedArray.hasValue(19)) {
            setCounterOverflowTextColor(A00.A01(19));
        }
        if (typedArray.hasValue(51)) {
            setPlaceholderTextColor(A00.A01(51));
        }
        if (typedArray.hasValue(54)) {
            setPrefixTextColor(A00.A01(54));
        }
        if (typedArray.hasValue(64)) {
            setSuffixTextColor(A00.A01(64));
        }
        setCounterEnabled(z3);
        setEnabled(typedArray.getBoolean(0, true));
        typedArray.recycle();
        setImportantForAccessibility(2);
        setImportantForAutofill(1);
    }

    private void A05() {
        float f;
        float A04;
        float f2;
        float A042;
        float f3;
        InterfaceC78793fl interfaceC78793fl;
        if (A0F()) {
            RectF rectF = this.A1L;
            C65757TtX c65757TtX = this.A1G;
            int width = this.A0F.getWidth();
            int gravity = this.A0F.getGravity();
            CharSequence charSequence = c65757TtX.A0f;
            boolean A1a = AbstractC65703TsZ.A1a(c65757TtX.A0v);
            if (c65757TtX.A0k) {
                if (A1a) {
                    interfaceC78793fl = AbstractC78763fi.A02;
                } else {
                    interfaceC78793fl = AbstractC78763fi.A01;
                }
                A1a = interfaceC78793fl.CcD(charSequence, 0, charSequence.length());
            }
            c65757TtX.A0j = A1a;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5 ? !A1a : A1a) {
                    f = c65757TtX.A0q.right;
                    A04 = c65757TtX.A04();
                } else {
                    f2 = c65757TtX.A0q.left;
                    rectF.left = f2;
                    Rect rect = c65757TtX.A0q;
                    rectF.top = rect.top;
                    if (gravity == 17 && (gravity & 7) != 1) {
                        if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5 ? !c65757TtX.A0j : c65757TtX.A0j) {
                            f3 = rect.right;
                            rectF.right = f3;
                            rectF.bottom = rect.top + c65757TtX.A05();
                            float f4 = rectF.left;
                            float f5 = this.A17;
                            rectF.left = f4 - f5;
                            rectF.right += f5;
                            int i = this.A06;
                            this.A03 = i;
                            rectF.top = 0.0f;
                            rectF.bottom = i;
                            rectF.offset(-getPaddingLeft(), 0.0f);
                            ((C67770Uxl) this.A0I).A0J(rectF.left, rectF.top, rectF.right, rectF.bottom);
                        }
                        A042 = c65757TtX.A04();
                    } else {
                        f2 = width / 2.0f;
                        A042 = c65757TtX.A04() / 2.0f;
                    }
                    f3 = f2 + A042;
                    rectF.right = f3;
                    rectF.bottom = rect.top + c65757TtX.A05();
                    float f42 = rectF.left;
                    float f52 = this.A17;
                    rectF.left = f42 - f52;
                    rectF.right += f52;
                    int i2 = this.A06;
                    this.A03 = i2;
                    rectF.top = 0.0f;
                    rectF.bottom = i2;
                    rectF.offset(-getPaddingLeft(), 0.0f);
                    ((C67770Uxl) this.A0I).A0J(rectF.left, rectF.top, rectF.right, rectF.bottom);
                }
            } else {
                f = width / 2.0f;
                A04 = c65757TtX.A04() / 2.0f;
            }
            f2 = f - A04;
            rectF.left = f2;
            Rect rect2 = c65757TtX.A0q;
            rectF.top = rect2.top;
            if (gravity == 17) {
            }
            f2 = width / 2.0f;
            A042 = c65757TtX.A04() / 2.0f;
            f3 = f2 + A042;
            rectF.right = f3;
            rectF.bottom = rect2.top + c65757TtX.A05();
            float f422 = rectF.left;
            float f522 = this.A17;
            rectF.left = f422 - f522;
            rectF.right += f522;
            int i22 = this.A06;
            this.A03 = i22;
            rectF.top = 0.0f;
            rectF.bottom = i22;
            rectF.offset(-getPaddingLeft(), 0.0f);
            ((C67770Uxl) this.A0I).A0J(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    public static void A0B(ColorStateList colorStateList, CheckableImageButton checkableImageButton, TextInputLayout textInputLayout) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = textInputLayout.getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int length2 = drawableState2.length;
            int[] copyOf = Arrays.copyOf(drawableState, length + length2);
            System.arraycopy(drawableState2, 0, copyOf, length, length2);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = drawable.mutate();
            mutate.setTintList(ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public static void A0C(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                A0C((ViewGroup) childAt, z);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.getText()) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00af, code lost:
    
        if (r10.A0R != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r0.hasFocus() == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0E(com.google.android.material.textfield.TextInputLayout r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A0E(com.google.android.material.textfield.TextInputLayout, boolean, boolean):void");
    }

    public static void setIconClickable(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = false;
        int i = 1;
        boolean A1W = AbstractC167007dF.A1W(onLongClickListener);
        if (hasOnClickListeners || A1W) {
            z = true;
        }
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.A01 = hasOnClickListeners;
        checkableImageButton.setLongClickable(A1W);
        if (!z) {
            i = 2;
        }
        checkableImageButton.setImportantForAccessibility(i);
    }

    public static void setIconOnClickListener(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        setIconClickable(checkableImageButton, onLongClickListener);
    }

    public static void setIconOnLongClickListener(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        setIconClickable(checkableImageButton, onLongClickListener);
    }

    public final void A0L(TextView textView, int i) {
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        textView.setTextAppearance(R.style.TextAppearance_AppCompat_Caption);
        AbstractC166987dD.A1O(getContext(), textView, R.color.design_error);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int A03 = C0f9.A03(346138808);
        super.draw(canvas);
        if (this.A0Q) {
            this.A1G.A0E(canvas);
        }
        C65O c65o = this.A0J;
        if (c65o != null) {
            Rect bounds = c65o.getBounds();
            bounds.top = bounds.bottom - this.A06;
            this.A0J.draw(canvas);
        }
        C0f9.A0A(1235617595, A03);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017c  */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        EditText editText;
        int max;
        super.onMeasure(i, i2);
        boolean z = false;
        if (this.A0F != null && this.A0F.getMeasuredHeight() < (max = Math.max(this.A1A.getMeasuredHeight(), this.A1B.getMeasuredHeight()))) {
            this.A0F.setMinimumHeight(max);
            z = true;
        }
        boolean A0G = A0G();
        if (z || A0G) {
            this.A0F.post(new RunnableC71300WrU(this));
        }
        if (this.A0H != null && (editText = this.A0F) != null) {
            this.A0H.setGravity(editText.getGravity());
            this.A0H.setPadding(this.A0F.getCompoundPaddingLeft(), this.A0F.getCompoundPaddingTop(), this.A0F.getCompoundPaddingRight(), this.A0F.getCompoundPaddingBottom());
        }
        A08();
        A09();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r3.A1D.isChecked() == false) goto L9;
     */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.material.textfield.TextInputLayout$SavedState, android.os.Parcelable, androidx.customview.view.AbsSavedState] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Parcelable onSaveInstanceState() {
        /*
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.google.android.material.textfield.TextInputLayout$SavedState r2 = new com.google.android.material.textfield.TextInputLayout$SavedState
            r2.<init>(r0)
            X.WEy r0 = r3.A1H
            boolean r0 = r0.A07()
            if (r0 == 0) goto L17
            java.lang.CharSequence r0 = r3.getError()
            r2.A00 = r0
        L17:
            int r0 = r3.A08
            if (r0 == 0) goto L24
            com.google.android.material.internal.CheckableImageButton r0 = r3.A1D
            boolean r1 = r0.isChecked()
            r0 = 1
            if (r1 != 0) goto L25
        L24:
            r0 = 0
        L25:
            r2.A04 = r0
            java.lang.CharSequence r0 = r3.getHint()
            r2.A02 = r0
            java.lang.CharSequence r0 = r3.getHelperText()
            r2.A01 = r0
            java.lang.CharSequence r0 = r3.getPlaceholderText()
            r2.A03 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onSaveInstanceState():android.os.Parcelable");
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.A0Y = defaultColor;
        this.A00 = defaultColor;
        this.A0b = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.A0d = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        this.A0f = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
        A01();
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (colorStateList.isStateful()) {
            this.A0Z = colorStateList.getDefaultColor();
            this.A0a = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.A0g = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        } else {
            if (this.A0e != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            A0I();
        }
        this.A0e = defaultColor;
        A0I();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        A0C(this, z);
        super.setEnabled(z);
    }

    public void setEndIconVisible(boolean z) {
        if (A0M() != z) {
            this.A1D.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
            A09();
            A0G();
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (this.A1H.A0F) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        C70176WEy c70176WEy = this.A1H;
        if (!c70176WEy.A0F) {
            setHelperTextEnabled(true);
        }
        Animator animator = c70176WEy.A04;
        if (animator != null) {
            animator.cancel();
        }
        c70176WEy.A0D = charSequence;
        c70176WEy.A0A.setText(charSequence);
        int i = c70176WEy.A00;
        if (i != 2) {
            c70176WEy.A01 = 2;
        }
        C70176WEy.A01(c70176WEy, i, c70176WEy.A01, C70176WEy.A02(c70176WEy.A0A, c70176WEy, charSequence));
    }

    public void setHintAnimationEnabled(boolean z) {
        this.A0P = z;
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(AbstractC166997dE.A04(getContext(), i));
    }

    public void setMinWidthResource(int i) {
        setMinWidth(AbstractC166997dE.A04(getContext(), i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r3.A0R != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setPrefixText(java.lang.CharSequence r4) {
        /*
            r3 = this;
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            r0 = r4
            if (r1 == 0) goto L8
            r0 = 0
        L8:
            r3.A0M = r0
            android.widget.TextView r2 = r3.A1C
            r2.setText(r4)
            java.lang.CharSequence r0 = r3.A0M
            if (r0 == 0) goto L18
            boolean r1 = r3.A0R
            r0 = 0
            if (r1 == 0) goto L1a
        L18:
            r0 = 8
        L1a:
            r2.setVisibility(r0)
            r3.A0G()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.setPrefixText(java.lang.CharSequence):void");
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        }
        this.A0N = charSequence2;
        this.A1O.setText(charSequence);
        A0A();
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textInputStyle);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.A1D;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.A1D;
        checkableImageButton.setImageDrawable(drawable);
        A0B(this.A0A, checkableImageButton, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r2.A1H.A0E == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setErrorIconDrawable(android.graphics.drawable.Drawable r3) {
        /*
            r2 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r2.A1E
            r0.setImageDrawable(r3)
            if (r3 == 0) goto Le
            X.WEy r0 = r2.A1H
            boolean r1 = r0.A0E
            r0 = 1
            if (r1 != 0) goto Lf
        Le:
            r0 = 0
        Lf:
            r2.setErrorIconVisible(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.setErrorIconDrawable(android.graphics.drawable.Drawable):void");
    }

    public void setHint(CharSequence charSequence) {
        if (this.A0Q) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(C3OO.FLAG_MOVED);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.A1D.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.A1D.setImageDrawable(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.A1F;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C71x.A00(getContext(), i);
        } else {
            drawable = null;
        }
        setStartIconDrawable(drawable);
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }
}
