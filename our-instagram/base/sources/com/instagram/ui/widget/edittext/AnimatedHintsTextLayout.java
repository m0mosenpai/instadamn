package com.instagram.ui.widget.edittext;

import X.AbstractC14710oj;
import X.C00O;
import X.C05F;
import X.C0f9;
import X.C128935sB;
import X.C14360o3;
import X.X8T;
import X.XBM;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.edittext.AnimatedHintsTextLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class AnimatedHintsTextLayout extends FrameLayout {
    public static int A0H;
    public float A00;
    public float A01;
    public int A02;
    public long A03;
    public ValueAnimator A04;
    public ValueAnimator A05;
    public ValueAnimator A06;
    public EditText A07;
    public TextView A08;
    public TextView A09;
    public XBM A0A;
    public X8T A0B;
    public boolean A0C;
    public TextView A0D;
    public final AnimatorListenerAdapter A0E;
    public final Handler A0F;
    public final List A0G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedHintsTextLayout(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A03 = 3000L;
        this.A0G = new ArrayList();
        this.A0C = true;
        this.A0F = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: X.5s7
            /* JADX WARN: Code restructure failed: missing block: B:65:0x00a5, code lost:
            
                if (r1 == 0) goto L38;
             */
            /* JADX WARN: Removed duplicated region for block: B:52:0x0064  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x008a  */
            @Override // android.os.Handler.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean handleMessage(android.os.Message r9) {
                /*
                    Method dump skipped, instructions count: 312
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C128895s7.handleMessage(android.os.Message):boolean");
            }
        });
        this.A0E = new AnimatorListenerAdapter() { // from class: X.5s8
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                AnimatedHintsTextLayout animatedHintsTextLayout = AnimatedHintsTextLayout.this;
                ValueAnimator valueAnimator = animatedHintsTextLayout.A04;
                String str = "fadeInAnimator";
                if (valueAnimator != null) {
                    if (valueAnimator.isRunning()) {
                        ValueAnimator valueAnimator2 = animatedHintsTextLayout.A04;
                        if (valueAnimator2 != null) {
                            valueAnimator2.end();
                        }
                    }
                    ValueAnimator valueAnimator3 = animatedHintsTextLayout.A05;
                    str = "fadeOutAnimator";
                    if (valueAnimator3 != null) {
                        if (valueAnimator3.isRunning()) {
                            ValueAnimator valueAnimator4 = animatedHintsTextLayout.A05;
                            if (valueAnimator4 != null) {
                                valueAnimator4.end();
                            }
                        }
                        int i = animatedHintsTextLayout.A02 + 1;
                        List list = animatedHintsTextLayout.A0G;
                        int size = i % list.size();
                        animatedHintsTextLayout.A02 = size;
                        CharSequence charSequence = (CharSequence) list.get(size);
                        TextView textView = animatedHintsTextLayout.A08;
                        if (textView == null) {
                            str = "currentHintTextView";
                        } else {
                            textView.setAlpha(1.0f);
                            textView.setHint(charSequence);
                            TextView textView2 = animatedHintsTextLayout.A09;
                            if (textView2 == null) {
                                str = "nextHintTextView";
                            } else {
                                textView2.setHint((CharSequence) list.get((animatedHintsTextLayout.A02 + 1) % list.size()));
                                textView2.setAlpha(0.0f);
                                animatedHintsTextLayout.A00 = 0.0f;
                                animatedHintsTextLayout.A01 = 1.0f;
                                AnimatedHintsTextLayout.A02(animatedHintsTextLayout);
                                animatedHintsTextLayout.A0F.sendEmptyMessageDelayed(2, animatedHintsTextLayout.A03);
                                XBM xbm = animatedHintsTextLayout.A0A;
                                if (xbm != null) {
                                    xbm.DKw(charSequence);
                                }
                                X8T x8t = animatedHintsTextLayout.A0B;
                                if (x8t != null) {
                                    ((U01) x8t).A00.A00 = animatedHintsTextLayout.A02;
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        };
        A00(context);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        String str;
        C14360o3.A0B(view, 0);
        C14360o3.A0B(layoutParams, 2);
        if (view instanceof EditText) {
            EditText editText = (EditText) view;
            if (this.A07 == null) {
                setEditText(editText);
                editText.addTextChangedListener(new TextWatcher() { // from class: X.5op
                    @Override // android.text.TextWatcher
                    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                    }

                    @Override // android.text.TextWatcher
                    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                    }

                    @Override // android.text.TextWatcher
                    public final void afterTextChanged(Editable editable) {
                        Handler handler = AnimatedHintsTextLayout.this.A0F;
                        handler.sendEmptyMessage(1);
                        handler.sendEmptyMessage(0);
                    }
                });
                editText.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.5oq
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                        String str2;
                        AnimatedHintsTextLayout animatedHintsTextLayout = AnimatedHintsTextLayout.this;
                        TextView textView = animatedHintsTextLayout.A08;
                        if (textView == null) {
                            str2 = "currentHintTextView";
                        } else {
                            AnimatedHintsTextLayout.A01(textView, animatedHintsTextLayout);
                            TextView textView2 = animatedHintsTextLayout.A09;
                            if (textView2 == null) {
                                str2 = "nextHintTextView";
                            } else {
                                AnimatedHintsTextLayout.A01(textView2, animatedHintsTextLayout);
                                AnimatedHintsTextLayout.A02(animatedHintsTextLayout);
                                animatedHintsTextLayout.invalidate();
                                animatedHintsTextLayout.requestLayout();
                                return;
                            }
                        }
                        C14360o3.A0F(str2);
                        throw C00O.createAndThrow();
                    }
                });
                if (this.A0G.isEmpty()) {
                    CharSequence hint = editText.getHint();
                    if (hint != null) {
                        List singletonList = Collections.singletonList(hint);
                        C14360o3.A07(singletonList);
                        setHints(singletonList);
                    }
                    editText.setHint((CharSequence) null);
                }
                super.addView(view, 0, layoutParams);
                TextView textView = this.A08;
                if (textView == null) {
                    str = "currentHintTextView";
                } else {
                    super.addView(textView, -1, layoutParams);
                    TextView textView2 = this.A09;
                    if (textView2 == null) {
                        str = "nextHintTextView";
                    } else {
                        super.addView(textView2, -1, layoutParams);
                        TextView textView3 = this.A0D;
                        if (textView3 == null) {
                            str = "emojiHintTextView";
                        } else {
                            super.addView(textView3, -1, new FrameLayout.LayoutParams(-2, -2, 8388629));
                            return;
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        throw new IllegalArgumentException("Only accepting EditTexts");
    }

    public final void setEditText(EditText editText) {
        C14360o3.A0B(editText, 0);
        this.A07 = editText;
    }

    public final void setHints(List list) {
        C14360o3.A0B(list, 0);
        List list2 = this.A0G;
        list2.clear();
        list2.addAll(list);
        A03();
    }

    private final void A00(Context context) {
        String str;
        this.A08 = new TextView(context);
        this.A09 = new TextView(context);
        TextView textView = this.A08;
        if (textView == null) {
            str = "currentHintTextView";
        } else {
            textView.setVisibility(8);
            TextView textView2 = this.A09;
            if (textView2 == null) {
                str = "nextHintTextView";
            } else {
                textView2.setVisibility(8);
                TextView textView3 = new TextView(context);
                this.A0D = textView3;
                textView3.setVisibility(8);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.5s9
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C14360o3.A0B(valueAnimator, 0);
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        C14360o3.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue = ((Number) animatedValue).floatValue();
                        AnimatedHintsTextLayout animatedHintsTextLayout = AnimatedHintsTextLayout.this;
                        animatedHintsTextLayout.A00 = -floatValue;
                        animatedHintsTextLayout.A01 = 1.0f - floatValue;
                        AnimatedHintsTextLayout.A02(animatedHintsTextLayout);
                    }
                });
                ofFloat.addListener(this.A0E);
                ofFloat.setDuration(300L);
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                this.A06 = ofFloat;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.5sA
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C14360o3.A0B(valueAnimator, 0);
                        TextView textView4 = AnimatedHintsTextLayout.this.A09;
                        if (textView4 == null) {
                            C14360o3.A0F("nextHintTextView");
                            throw C00O.createAndThrow();
                        }
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        C14360o3.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                        textView4.setAlpha(((Number) animatedValue).floatValue());
                    }
                });
                ofFloat2.setDuration(300L);
                ofFloat2.setInterpolator(new C128935sB());
                this.A04 = ofFloat2;
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.5sC
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C14360o3.A0B(valueAnimator, 0);
                        TextView textView4 = AnimatedHintsTextLayout.this.A08;
                        if (textView4 == null) {
                            C14360o3.A0F("currentHintTextView");
                            throw C00O.createAndThrow();
                        }
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        C14360o3.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                        textView4.setAlpha(((Number) animatedValue).floatValue());
                    }
                });
                ofFloat3.setDuration(300L);
                ofFloat3.setInterpolator(new AccelerateInterpolator());
                this.A05 = ofFloat3;
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void A03() {
        this.A02 = A0H;
        Handler handler = this.A0F;
        handler.sendEmptyMessage(1);
        handler.sendEmptyMessage(0);
    }

    public final void A04() {
        this.A0F.removeMessages(2);
        ValueAnimator valueAnimator = this.A06;
        String str = "translationAnimator";
        if (valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = this.A06;
                if (valueAnimator2 != null) {
                    valueAnimator2.end();
                }
            }
            ValueAnimator valueAnimator3 = this.A04;
            str = "fadeInAnimator";
            if (valueAnimator3 != null) {
                if (valueAnimator3.isRunning()) {
                    ValueAnimator valueAnimator4 = this.A04;
                    if (valueAnimator4 != null) {
                        valueAnimator4.end();
                    }
                }
                ValueAnimator valueAnimator5 = this.A05;
                str = "fadeOutAnimator";
                if (valueAnimator5 != null) {
                    if (valueAnimator5.isRunning()) {
                        ValueAnimator valueAnimator6 = this.A05;
                        if (valueAnimator6 != null) {
                            valueAnimator6.end();
                        }
                    }
                    A0H = this.A02;
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final long getAnimationDelayMillis() {
        return this.A03;
    }

    public final EditText getEditText() {
        EditText editText = this.A07;
        if (editText != null) {
            return editText;
        }
        C14360o3.A0F("editText");
        throw C00O.createAndThrow();
    }

    public final TextView getEmojiTextView() {
        TextView textView = this.A0D;
        if (textView == null) {
            C14360o3.A0F("emojiHintTextView");
            throw C00O.createAndThrow();
        }
        return textView;
    }

    public final TextView getHintTextView() {
        TextView textView = this.A08;
        if (textView == null) {
            C14360o3.A0F("currentHintTextView");
            throw C00O.createAndThrow();
        }
        return textView;
    }

    public final XBM getListener() {
        return this.A0A;
    }

    public final X8T getRotationHintIndexListener() {
        return this.A0B;
    }

    public static final void A01(TextView textView, AnimatedHintsTextLayout animatedHintsTextLayout) {
        textView.setBackgroundResource(R.color.fds_transparent);
        AbstractC14710oj.A07(textView.getContext(), null, textView, C05F.A00);
        textView.setHintTextColor(animatedHintsTextLayout.getEditText().getHintTextColors());
        textView.setTextSize(0, animatedHintsTextLayout.getEditText().getTextSize());
        textView.setCompoundDrawablesRelative(null, null, null, null);
        textView.setPaddingRelative(animatedHintsTextLayout.getEditText().getCompoundPaddingLeft(), animatedHintsTextLayout.getEditText().getCompoundPaddingTop(), animatedHintsTextLayout.getEditText().getCompoundPaddingRight(), animatedHintsTextLayout.getEditText().getCompoundPaddingBottom());
        textView.setCompoundDrawablePadding(animatedHintsTextLayout.getEditText().getCompoundDrawablePadding());
        textView.setSingleLine();
        textView.setGravity(animatedHintsTextLayout.getEditText().getGravity());
        textView.setLineSpacing(animatedHintsTextLayout.getEditText().getLineSpacingExtra(), animatedHintsTextLayout.getEditText().getLineSpacingMultiplier());
        textView.setGravity(animatedHintsTextLayout.getEditText().getGravity());
        textView.setIncludeFontPadding(animatedHintsTextLayout.getEditText().getIncludeFontPadding());
    }

    public static final void A02(AnimatedHintsTextLayout animatedHintsTextLayout) {
        String str;
        int height = animatedHintsTextLayout.getEditText().getHeight() / 2;
        TextView textView = animatedHintsTextLayout.A08;
        if (textView == null) {
            str = "currentHintTextView";
        } else {
            float f = height;
            textView.setTranslationY(animatedHintsTextLayout.A00 * f);
            TextView textView2 = animatedHintsTextLayout.A09;
            if (textView2 == null) {
                str = "nextHintTextView";
            } else {
                textView2.setTranslationY(animatedHintsTextLayout.A01 * f);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(1598630265);
        super.onDetachedFromWindow();
        A04();
        this.A0F.removeCallbacksAndMessages(null);
        C0f9.A0D(1627322045, A06);
    }

    public final void setAnimationDelayMillis(long j) {
        this.A03 = j;
    }

    public final void setHintIndex(int i) {
        this.A02 = i;
    }

    public final void setListener(XBM xbm) {
        this.A0A = xbm;
    }

    public final void setRotationHintIndexListener(X8T x8t) {
        this.A0B = x8t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedHintsTextLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A03 = 3000L;
        this.A0G = new ArrayList();
        this.A0C = true;
        this.A0F = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: X.5s7
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                    	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    */
                /*
                    Method dump skipped, instructions count: 312
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C128895s7.handleMessage(android.os.Message):boolean");
            }
        });
        this.A0E = new AnimatorListenerAdapter() { // from class: X.5s8
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                AnimatedHintsTextLayout animatedHintsTextLayout = AnimatedHintsTextLayout.this;
                ValueAnimator valueAnimator = animatedHintsTextLayout.A04;
                String str = "fadeInAnimator";
                if (valueAnimator != null) {
                    if (valueAnimator.isRunning()) {
                        ValueAnimator valueAnimator2 = animatedHintsTextLayout.A04;
                        if (valueAnimator2 != null) {
                            valueAnimator2.end();
                        }
                    }
                    ValueAnimator valueAnimator3 = animatedHintsTextLayout.A05;
                    str = "fadeOutAnimator";
                    if (valueAnimator3 != null) {
                        if (valueAnimator3.isRunning()) {
                            ValueAnimator valueAnimator4 = animatedHintsTextLayout.A05;
                            if (valueAnimator4 != null) {
                                valueAnimator4.end();
                            }
                        }
                        int i2 = animatedHintsTextLayout.A02 + 1;
                        List list = animatedHintsTextLayout.A0G;
                        int size = i2 % list.size();
                        animatedHintsTextLayout.A02 = size;
                        CharSequence charSequence = (CharSequence) list.get(size);
                        TextView textView = animatedHintsTextLayout.A08;
                        if (textView == null) {
                            str = "currentHintTextView";
                        } else {
                            textView.setAlpha(1.0f);
                            textView.setHint(charSequence);
                            TextView textView2 = animatedHintsTextLayout.A09;
                            if (textView2 == null) {
                                str = "nextHintTextView";
                            } else {
                                textView2.setHint((CharSequence) list.get((animatedHintsTextLayout.A02 + 1) % list.size()));
                                textView2.setAlpha(0.0f);
                                animatedHintsTextLayout.A00 = 0.0f;
                                animatedHintsTextLayout.A01 = 1.0f;
                                AnimatedHintsTextLayout.A02(animatedHintsTextLayout);
                                animatedHintsTextLayout.A0F.sendEmptyMessageDelayed(2, animatedHintsTextLayout.A03);
                                XBM xbm = animatedHintsTextLayout.A0A;
                                if (xbm != null) {
                                    xbm.DKw(charSequence);
                                }
                                X8T x8t = animatedHintsTextLayout.A0B;
                                if (x8t != null) {
                                    ((U01) x8t).A00.A00 = animatedHintsTextLayout.A02;
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        };
        A00(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedHintsTextLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A03 = 3000L;
        this.A0G = new ArrayList();
        this.A0C = true;
        this.A0F = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: X.5s7
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                */
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(android.os.Message r9) {
                /*
                    Method dump skipped, instructions count: 312
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C128895s7.handleMessage(android.os.Message):boolean");
            }
        });
        this.A0E = new AnimatorListenerAdapter() { // from class: X.5s8
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                AnimatedHintsTextLayout animatedHintsTextLayout = AnimatedHintsTextLayout.this;
                ValueAnimator valueAnimator = animatedHintsTextLayout.A04;
                String str = "fadeInAnimator";
                if (valueAnimator != null) {
                    if (valueAnimator.isRunning()) {
                        ValueAnimator valueAnimator2 = animatedHintsTextLayout.A04;
                        if (valueAnimator2 != null) {
                            valueAnimator2.end();
                        }
                    }
                    ValueAnimator valueAnimator3 = animatedHintsTextLayout.A05;
                    str = "fadeOutAnimator";
                    if (valueAnimator3 != null) {
                        if (valueAnimator3.isRunning()) {
                            ValueAnimator valueAnimator4 = animatedHintsTextLayout.A05;
                            if (valueAnimator4 != null) {
                                valueAnimator4.end();
                            }
                        }
                        int i2 = animatedHintsTextLayout.A02 + 1;
                        List list = animatedHintsTextLayout.A0G;
                        int size = i2 % list.size();
                        animatedHintsTextLayout.A02 = size;
                        CharSequence charSequence = (CharSequence) list.get(size);
                        TextView textView = animatedHintsTextLayout.A08;
                        if (textView == null) {
                            str = "currentHintTextView";
                        } else {
                            textView.setAlpha(1.0f);
                            textView.setHint(charSequence);
                            TextView textView2 = animatedHintsTextLayout.A09;
                            if (textView2 == null) {
                                str = "nextHintTextView";
                            } else {
                                textView2.setHint((CharSequence) list.get((animatedHintsTextLayout.A02 + 1) % list.size()));
                                textView2.setAlpha(0.0f);
                                animatedHintsTextLayout.A00 = 0.0f;
                                animatedHintsTextLayout.A01 = 1.0f;
                                AnimatedHintsTextLayout.A02(animatedHintsTextLayout);
                                animatedHintsTextLayout.A0F.sendEmptyMessageDelayed(2, animatedHintsTextLayout.A03);
                                XBM xbm = animatedHintsTextLayout.A0A;
                                if (xbm != null) {
                                    xbm.DKw(charSequence);
                                }
                                X8T x8t = animatedHintsTextLayout.A0B;
                                if (x8t != null) {
                                    ((U01) x8t).A00.A00 = animatedHintsTextLayout.A02;
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        };
        A00(context);
    }
}
