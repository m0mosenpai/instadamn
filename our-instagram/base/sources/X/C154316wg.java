package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.R;
import com.google.android.material.badge.BadgeDrawable$SavedState;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* renamed from: X.6wg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C154316wg extends LinearLayout {
    public Drawable A00;
    public View A01;
    public ImageView A02;
    public ImageView A03;
    public TextView A04;
    public TextView A05;
    public C66319U8s A06;
    public int A07;
    public View A08;
    public C154306wf A09;
    public final /* synthetic */ TabLayout A0A;

    public int getContentHeight() {
        int i = 0;
        View[] viewArr = {this.A05, this.A03, this.A08};
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        do {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                if (z) {
                    i3 = Math.min(i3, view.getTop());
                    i2 = Math.max(i2, view.getBottom());
                } else {
                    i3 = view.getTop();
                    i2 = view.getBottom();
                }
                z = true;
            }
            i++;
        } while (i < 3);
        return i2 - i3;
    }

    public int getContentWidth() {
        int i = 0;
        View[] viewArr = {this.A05, this.A03, this.A08};
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        do {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                if (z) {
                    i3 = Math.min(i3, view.getLeft());
                    i2 = Math.max(i2, view.getRight());
                } else {
                    i3 = view.getLeft();
                    i2 = view.getRight();
                }
                z = true;
            }
            i++;
        } while (i < 3);
        return i2 - i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C154316wg(Context context, TabLayout tabLayout) {
        super(context);
        this.A0A = tabLayout;
        this.A07 = 2;
        A02(context, this);
        setPaddingRelative(tabLayout.A0A, tabLayout.A0B, tabLayout.A09, tabLayout.A08);
        setGravity(17);
        setOrientation(!tabLayout.A0L ? 1 : 0);
        setClickable(true);
        setPointerIcon(PointerIcon.getSystemIcon(getContext(), 1002));
    }

    private void A00() {
        if (this.A06 != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.A01;
            if (view != null) {
                C66319U8s c66319U8s = this.A06;
                if (c66319U8s != null) {
                    WeakReference weakReference = c66319U8s.A07;
                    if (weakReference != null && weakReference.get() != null) {
                        ((View) weakReference.get()).setForeground(null);
                    } else {
                        view.getOverlay().remove(c66319U8s);
                    }
                }
                this.A01 = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A01() {
        /*
            r4 = this;
            X.U8s r3 = r4.A06
            if (r3 == 0) goto L5e
            android.view.View r0 = r4.A08
            if (r0 != 0) goto L8b
            android.widget.ImageView r2 = r4.A03
            if (r2 == 0) goto L67
            X.6wf r0 = r4.A09
            if (r0 == 0) goto L67
            android.graphics.drawable.Drawable r0 = r0.A02
            if (r0 == 0) goto L67
            android.view.View r0 = r4.A01
            if (r0 == r2) goto L79
            r4.A00()
            android.widget.ImageView r3 = r4.A03
        L1d:
            X.U8s r0 = r4.A06
            if (r0 == 0) goto L5e
            if (r3 == 0) goto L5e
            r1 = 0
            r4.setClipChildren(r1)
            r4.setClipToPadding(r1)
            android.view.ViewParent r0 = r4.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L38
            r0.setClipChildren(r1)
            r0.setClipToPadding(r1)
        L38:
            X.U8s r2 = r4.A06
            r1 = 0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.getDrawingRect(r0)
            r2.setBounds(r0)
            r2.A02(r3, r1)
            java.lang.ref.WeakReference r1 = r2.A07
            if (r1 == 0) goto L5f
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L5f
            java.lang.Object r0 = r1.get()
            android.view.View r0 = (android.view.View) r0
            r0.setForeground(r2)
        L5c:
            r4.A01 = r3
        L5e:
            return
        L5f:
            android.view.ViewOverlay r0 = r3.getOverlay()
            r0.add(r2)
            goto L5c
        L67:
            android.widget.TextView r2 = r4.A05
            if (r2 == 0) goto L8b
            X.6wf r0 = r4.A09
            if (r0 == 0) goto L8b
            android.view.View r0 = r4.A01
            if (r0 == r2) goto L79
            r4.A00()
            android.widget.TextView r3 = r4.A05
            goto L1d
        L79:
            if (r2 != r0) goto L5e
            r1 = 0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.getDrawingRect(r0)
            r3.setBounds(r0)
            r3.A02(r2, r1)
            return
        L8b:
            r4.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C154316wg.A01():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [android.graphics.drawable.RippleDrawable] */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.view.View, X.6wg] */
    public static void A02(Context context, C154316wg c154316wg) {
        int i;
        int i2;
        TabLayout tabLayout = c154316wg.A0A;
        int i3 = tabLayout.A0Y;
        GradientDrawable gradientDrawable = null;
        if (i3 != 0) {
            Drawable A05 = C52112aB.A02().A05(context, i3);
            c154316wg.A00 = A05;
            if (A05 != null && A05.isStateful()) {
                c154316wg.A00.setState(c154316wg.getDrawableState());
            }
        } else {
            c154316wg.A00 = null;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        if (tabLayout.A0F != null) {
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setCornerRadius(1.0E-5f);
            gradientDrawable3.setColor(-1);
            ColorStateList colorStateList = tabLayout.A0F;
            int[] iArr = AbstractC154326wh.A02;
            int[] iArr2 = AbstractC154326wh.A01;
            if (colorStateList != null) {
                i = colorStateList.getColorForState(iArr2, colorStateList.getDefaultColor());
            } else {
                i = 0;
            }
            int A06 = AbstractC56842jH.A06(i, Math.min(Color.alpha(i) * 2, 255));
            int[][] iArr3 = {iArr, StateSet.NOTHING};
            int[] iArr4 = AbstractC154326wh.A00;
            if (colorStateList != null) {
                i2 = colorStateList.getColorForState(iArr4, colorStateList.getDefaultColor());
            } else {
                i2 = 0;
            }
            ColorStateList colorStateList2 = new ColorStateList(iArr3, new int[]{A06, AbstractC56842jH.A06(i2, Math.min(Color.alpha(i2) * 2, 255))});
            if (tabLayout.A0N) {
                gradientDrawable2 = null;
            } else {
                gradientDrawable = gradientDrawable3;
            }
            gradientDrawable2 = new RippleDrawable(colorStateList2, gradientDrawable2, gradientDrawable);
        }
        c154316wg.setBackground(gradientDrawable2);
        tabLayout.invalidate();
    }

    public static void A03(ImageView imageView, TextView textView, C154316wg c154316wg) {
        Drawable drawable;
        CharSequence charSequence;
        int i;
        Drawable drawable2;
        C154306wf c154306wf = c154316wg.A09;
        CharSequence charSequence2 = null;
        if (c154306wf != null && (drawable2 = c154306wf.A02) != null) {
            drawable = drawable2.mutate();
        } else {
            drawable = null;
        }
        C154306wf c154306wf2 = c154316wg.A09;
        if (c154306wf2 != null) {
            charSequence = c154306wf2.A07;
        } else {
            charSequence = null;
        }
        if (imageView != null) {
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                c154316wg.setVisibility(0);
            } else {
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
            }
        }
        boolean z = !TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (z) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                c154316wg.setVisibility(0);
            } else {
                textView.setVisibility(8);
                textView.setText((CharSequence) null);
            }
        }
        if (imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            if (z && imageView.getVisibility() == 0) {
                i = (int) AbstractC126235nK.A00(c154316wg.getContext(), 8);
            } else {
                i = 0;
            }
            if (c154316wg.A0A.A0L) {
                if (i != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(i);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (i != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = i;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        C154306wf c154306wf3 = c154316wg.A09;
        if (c154306wf3 != null) {
            charSequence2 = c154306wf3.A06;
        }
        if (!z) {
            charSequence = charSequence2;
        }
        c154316wg.setTooltipText(charSequence);
    }

    private C66319U8s getBadge() {
        return this.A06;
    }

    private C66319U8s getOrCreateBadge() {
        FrameLayout frameLayout;
        int max;
        if (this.A06 == null) {
            Context context = getContext();
            C66319U8s c66319U8s = new C66319U8s(context);
            TypedArray A00 = C65M.A00(context, null, C65N.A02, new int[0], R.attr.badgeStyle, R.style.Widget_MaterialComponents_Badge);
            int i = A00.getInt(4, 4);
            BadgeDrawable$SavedState badgeDrawable$SavedState = c66319U8s.A0B;
            if (badgeDrawable$SavedState.A09 != i) {
                badgeDrawable$SavedState.A09 = i;
                c66319U8s.A05 = ((int) Math.pow(10.0d, i - 1.0d)) - 1;
                c66319U8s.A0C.A02 = true;
                C66319U8s.A01(c66319U8s);
                c66319U8s.invalidateSelf();
            }
            if (A00.hasValue(5) && badgeDrawable$SavedState.A0A != (max = Math.max(0, A00.getInt(5, 0)))) {
                badgeDrawable$SavedState.A0A = max;
                c66319U8s.A0C.A02 = true;
                C66319U8s.A01(c66319U8s);
                c66319U8s.invalidateSelf();
            }
            int defaultColor = AbstractC1567371w.A01(context, A00, 0).getDefaultColor();
            badgeDrawable$SavedState.A03 = defaultColor;
            ColorStateList valueOf = ColorStateList.valueOf(defaultColor);
            C65O c65o = c66319U8s.A0D;
            if (c65o.A00.A0B != valueOf) {
                c65o.A0F(valueOf);
                c66319U8s.invalidateSelf();
            }
            if (A00.hasValue(2)) {
                int defaultColor2 = AbstractC1567371w.A01(context, A00, 2).getDefaultColor();
                badgeDrawable$SavedState.A05 = defaultColor2;
                TextPaint textPaint = c66319U8s.A0C.A04;
                if (textPaint.getColor() != defaultColor2) {
                    textPaint.setColor(defaultColor2);
                    c66319U8s.invalidateSelf();
                }
            }
            int i2 = A00.getInt(1, 8388661);
            if (badgeDrawable$SavedState.A04 != i2) {
                badgeDrawable$SavedState.A04 = i2;
                WeakReference weakReference = c66319U8s.A06;
                if (weakReference != null && weakReference.get() != null) {
                    View view = (View) weakReference.get();
                    WeakReference weakReference2 = c66319U8s.A07;
                    if (weakReference2 != null) {
                        frameLayout = (FrameLayout) weakReference2.get();
                    } else {
                        frameLayout = null;
                    }
                    c66319U8s.A02(view, frameLayout);
                }
            }
            badgeDrawable$SavedState.A08 = A00.getDimensionPixelOffset(3, 0);
            C66319U8s.A01(c66319U8s);
            badgeDrawable$SavedState.A0B = A00.getDimensionPixelOffset(6, 0);
            C66319U8s.A01(c66319U8s);
            A00.recycle();
            this.A06 = c66319U8s;
        }
        A01();
        C66319U8s c66319U8s2 = this.A06;
        if (c66319U8s2 != null) {
            return c66319U8s2;
        }
        throw new IllegalStateException("Unable to create badge");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f8, code lost:
    
        if (r2 != r3.A01) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04() {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C154316wg.A04():void");
    }

    public C154306wf getTab() {
        return this.A09;
    }

    public void setTab(C154306wf c154306wf) {
        if (c154306wf != this.A09) {
            this.A09 = c154306wf;
            A04();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A00;
        if (drawable != null && drawable.isStateful() && this.A00.setState(drawableState)) {
            invalidate();
            this.A0A.invalidate();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C66319U8s c66319U8s = this.A06;
        if (c66319U8s != null && c66319U8s.isVisible()) {
            CharSequence contentDescription = getContentDescription();
            StringBuilder sb = new StringBuilder();
            sb.append((Object) contentDescription);
            sb.append(", ");
            C66319U8s c66319U8s2 = this.A06;
            Object obj = null;
            if (c66319U8s2.isVisible()) {
                BadgeDrawable$SavedState badgeDrawable$SavedState = c66319U8s2.A0B;
                int i = badgeDrawable$SavedState.A0A;
                if (i != -1) {
                    int i2 = badgeDrawable$SavedState.A07;
                    if (i2 > 0 && (context = (Context) c66319U8s2.A0E.get()) != null) {
                        int i3 = c66319U8s2.A05;
                        if (i <= i3) {
                            Resources resources = context.getResources();
                            int i4 = badgeDrawable$SavedState.A0A;
                            int i5 = 0;
                            if (i4 != -1) {
                                i5 = i4;
                            }
                            obj = resources.getQuantityString(i2, i5, Integer.valueOf(i5));
                        } else {
                            obj = context.getString(badgeDrawable$SavedState.A06, Integer.valueOf(i3));
                        }
                    }
                } else {
                    obj = badgeDrawable$SavedState.A0C;
                }
            }
            sb.append(obj);
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
        accessibilityNodeInfoCompat.mInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, this.A09.A01, 1, false, isSelected()));
        if (isSelected()) {
            accessibilityNodeInfoCompat.setClickable(false);
            accessibilityNodeInfoCompat.removeAction(C012804r.A08);
        }
        accessibilityNodeInfoCompat.setRoleDescription(getResources().getString(2131964685));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Layout layout;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        TabLayout tabLayout = this.A0A;
        int i3 = tabLayout.A07;
        if (i3 > 0 && (mode == 0 || size > i3)) {
            i = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.A05 != null) {
            float f = tabLayout.A01;
            int i4 = this.A07;
            ImageView imageView = this.A03;
            if (imageView != null && imageView.getVisibility() == 0) {
                i4 = 1;
            } else {
                TextView textView = this.A05;
                if (textView != null && textView.getLineCount() > 1) {
                    f = tabLayout.A00;
                }
            }
            float textSize = this.A05.getTextSize();
            int lineCount = this.A05.getLineCount();
            int maxLines = this.A05.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i4 != maxLines)) {
                if (tabLayout.A02 == 1 && f > textSize && lineCount == 1 && ((layout = this.A05.getLayout()) == null || layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                    return;
                }
                this.A05.setTextSize(0, f);
                this.A05.setMaxLines(i4);
                super.onMeasure(i, i2);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.A09 != null) {
            if (!performClick) {
                playSoundEffect(0);
            }
            this.A09.A01();
            return true;
        }
        return performClick;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.A05;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.A03;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.A08;
        if (view != null) {
            view.setSelected(z);
        }
    }
}
