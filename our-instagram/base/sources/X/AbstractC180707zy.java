package X;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7zy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC180707zy {
    public static final void A01(Drawable drawable, C180677zv c180677zv, float f) {
        IgSimpleImageView igSimpleImageView = c180677zv.A07;
        ViewGroup.LayoutParams layoutParams = igSimpleImageView.getLayoutParams();
        C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams.width = (int) (drawable.getIntrinsicWidth() * f);
        igSimpleImageView.setLayoutParams(layoutParams);
    }

    public static final void A00(Animator.AnimatorListener animatorListener, final Drawable drawable, final C180677zv c180677zv, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, final InterfaceC16820sZ interfaceC16820sZ5, final float f, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        IgTextView igTextView;
        TextView textView;
        List list;
        ViewGroup viewGroup;
        View view = c180677zv.A04;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            if (z4) {
                viewGroup.setTranslationZ(1.0f);
            }
        }
        boolean booleanValue = ((Boolean) interfaceC16820sZ3.invoke()).booleanValue();
        AbstractC180687zw.A00(c180677zv, interfaceC16820sZ4, booleanValue);
        if (((Boolean) interfaceC16820sZ.invoke()).booleanValue()) {
            c180677zv.A07.setImageResource(i);
        } else if (((Boolean) interfaceC16820sZ2.invoke()).booleanValue()) {
            if (!z5) {
                A01(drawable, c180677zv, f);
            }
            IgSimpleImageView igSimpleImageView = c180677zv.A07;
            igSimpleImageView.setImageResource(i);
            if (z) {
                igTextView = c180677zv.A08;
            } else {
                igTextView = null;
            }
            if (booleanValue && z2) {
                textView = (TextView) c180677zv.A09.getView();
            } else {
                textView = null;
            }
            if (z5) {
                list = Collections.singletonList(new AbstractC87373uv() { // from class: X.9qN
                    @Override // X.AbstractC87373uv, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        AbstractC180707zy.A01(drawable, c180677zv, f);
                    }
                });
                C14360o3.A07(list);
            } else {
                list = null;
            }
            AnonymousClass808 anonymousClass808 = new AnonymousClass808(drawable, igSimpleImageView, igTextView, textView, list, AbstractC16960so.A1Q(animatorListener, z5 ? new AbstractC87373uv() { // from class: X.9qL
                @Override // X.AbstractC87373uv, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    C180677zv c180677zv2 = C180677zv.this;
                    IgSimpleImageView igSimpleImageView2 = c180677zv2.A07;
                    igSimpleImageView2.setScaleType(c180677zv2.A05);
                    igSimpleImageView2.getLayoutParams().width = c180677zv2.A02;
                }
            } : null), interfaceC16820sZ5, f, i, -1, 500L, z3, false, true);
            ((Animator) anonymousClass808.A0C.getValue()).start();
            c180677zv.A00 = anonymousClass808;
        } else {
            A01(drawable, c180677zv, f);
            IgSimpleImageView igSimpleImageView2 = c180677zv.A07;
            if (!igSimpleImageView2.isLaidOut() || igSimpleImageView2.isLayoutRequested()) {
                igSimpleImageView2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.9N9
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                        view2.removeOnLayoutChangeListener(this);
                        C9MO.A00(drawable, c180677zv.A07, 1.0f, f, false);
                        interfaceC16820sZ5.invoke();
                    }
                });
            } else {
                C9MO.A00(drawable, igSimpleImageView2, 1.0f, f, false);
                interfaceC16820sZ5.invoke();
            }
        }
        IgTextView igTextView2 = c180677zv.A08;
        igTextView2.setEllipsize(TextUtils.TruncateAt.END);
        igTextView2.setText(i2);
        igTextView2.setVisibility(0);
    }
}
