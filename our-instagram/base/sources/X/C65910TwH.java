package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.facebook.smartcapture.ui.view.ArrowHintView;
import com.instagram.common.ui.text.ExpandableTextView;
import java.util.ArrayList;

/* renamed from: X.TwH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65910TwH extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C65910TwH(View view, ViewPropertyAnimator viewPropertyAnimator, VK0 vk0, C70623Ez c70623Ez, int i) {
        this.A00 = i;
        this.A01 = c70623Ez;
        this.A02 = vk0;
        if (i != 0) {
            this.A04 = viewPropertyAnimator;
            this.A03 = view;
        } else {
            this.A03 = viewPropertyAnimator;
            this.A04 = view;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        CharSequence charSequence;
        int i;
        C70623Ez c70623Ez;
        ArrayList arrayList;
        C3OO c3oo;
        switch (this.A00) {
            case 0:
                ((ViewPropertyAnimator) this.A03).setListener(null);
                View view = (View) this.A04;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                c70623Ez = (C70623Ez) this.A01;
                VK0 vk0 = (VK0) this.A02;
                c70623Ez.A0C(vk0.A05);
                arrayList = c70623Ez.A02;
                c3oo = vk0.A05;
                break;
            case 1:
                ((ViewPropertyAnimator) this.A04).setListener(null);
                View view2 = (View) this.A03;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                c70623Ez = (C70623Ez) this.A01;
                VK0 vk02 = (VK0) this.A02;
                c70623Ez.A0C(vk02.A04);
                arrayList = c70623Ez.A02;
                c3oo = vk02.A04;
                break;
            case 2:
                K5V k5v = (K5V) this.A04;
                EnumC61156RgH enumC61156RgH = (EnumC61156RgH) this.A03;
                K5V.A00(enumC61156RgH, k5v);
                ((ArrowHintView) this.A01).setCaptureState(enumC61156RgH);
                ((Runnable) this.A02).run();
                return;
            case 3:
                ExpandableTextView expandableTextView = (ExpandableTextView) this.A01;
                int i2 = 0;
                expandableTextView.A02 = false;
                if (!((C69680VtQ) this.A02).A00.A0O) {
                    int width = ((C66483UJj) this.A03).A01.getWidth();
                    ViewGroup.LayoutParams layoutParams = expandableTextView.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        i = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
                    } else {
                        i = 0;
                    }
                    ViewGroup.LayoutParams layoutParams2 = expandableTextView.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        i2 = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
                    }
                    charSequence = expandableTextView.A00(((UPQ) this.A04).A03, AbstractC166997dE.A0q(AbstractC25228BEl.A0M(expandableTextView), 2131973023), width - (i + i2));
                } else {
                    charSequence = ((UPQ) this.A04).A03;
                }
                expandableTextView.setText(charSequence);
                return;
            default:
                return;
        }
        arrayList.remove(c3oo);
        if (c70623Ez.A0L()) {
            return;
        }
        c70623Ez.A0A();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.A00) {
            case 0:
            case 1:
                return;
            case 2:
            case 3:
            default:
                super.onAnimationStart(animator);
                return;
            case 4:
                ((View) this.A01).setVisibility(0);
                View view = (View) this.A02;
                View view2 = (View) this.A03;
                C14360o3.A0A(view2);
                view.setVisibility(0);
                AbstractC56932jR.A06(view2, 500L);
                view2.setAccessibilityLiveRegion(2);
                return;
        }
    }

    public C65910TwH(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj;
        this.A04 = obj4;
        this.A02 = obj2;
        this.A03 = obj3;
    }
}
