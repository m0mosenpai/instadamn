package com.instagram.actionbar;

import X.AbstractC55922hc;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewAnimator;
import com.facebook.R;
import com.instagram.actionbar.ActionBarTitleViewSwitcher;
import com.instagram.common.ui.base.IgTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class ActionBarTitleViewSwitcher extends ViewAnimator {
    public int A00;
    public int A01;
    public ViewStub A02;
    public ViewStub A03;
    public ImageView A04;
    public ImageView A05;
    public ImageView A06;
    public ImageView A07;
    public LinearLayout A08;
    public IgTextView A09;
    public IgTextView A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public LinearLayout A0E;
    public String A0F;
    public final int A0G;
    public final int A0H;
    public final AttributeSet A0I;
    public final Animation A0J;
    public final Animation A0K;

    public /* synthetic */ ActionBarTitleViewSwitcher(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final void A00() {
        Drawable drawable;
        Drawable drawable2;
        ViewStub viewStub = this.A02;
        if (viewStub == null) {
            C14360o3.A0F("logoChevronViewStub");
            throw C00O.createAndThrow();
        }
        if (viewStub.getParent() != null) {
            View inflate = viewStub.inflate();
            C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView = (ImageView) inflate;
            this.A06 = imageView;
            if (imageView != null && (drawable2 = imageView.getDrawable()) != null) {
                drawable2.getIntrinsicWidth();
            }
            ImageView imageView2 = this.A06;
            if (imageView2 != null && (drawable = imageView2.getDrawable()) != null) {
                drawable.getIntrinsicHeight();
            }
        }
    }

    private final View getInflatedSecondLabel() {
        ViewStub viewStub = this.A03;
        if (viewStub == null) {
            C14360o3.A0F("secondLabelViewStub");
            throw C00O.createAndThrow();
        }
        if (viewStub.getParent() != null) {
            viewStub.inflate();
        }
        View findViewById = findViewById(R.id.text_title_chevron_container);
        C14360o3.A07(findViewById);
        return findViewById;
    }

    public final void A02(String str) {
        String str2;
        if (this.A0B) {
            ViewStub viewStub = this.A03;
            if (viewStub == null) {
                str2 = "secondLabelViewStub";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            }
            if (viewStub.getParent() != null) {
                this.A0F = str;
                this.A0C = true;
            }
        }
        IgTextView igTextView = this.A0A;
        if (igTextView == null) {
            str2 = "secondLabel";
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
        igTextView.setText(str);
        this.A0C = true;
    }

    public final void A03(String str, final String str2, boolean z, boolean z2) {
        ImageView imageView;
        long duration;
        IgTextView igTextView;
        if (str != null && (igTextView = this.A09) != null) {
            igTextView.setText(str);
        }
        if (str2 != null) {
            Runnable runnable = new Runnable() { // from class: X.3Z7
                @Override // java.lang.Runnable
                public final void run() {
                    ActionBarTitleViewSwitcher.this.A02(str2);
                }
            };
            if (z) {
                duration = 0;
            } else {
                duration = getInAnimation().getDuration();
            }
            postDelayed(runnable, duration);
        }
        if (z) {
            setInAnimation(null);
            setOutAnimation(null);
        }
        setDisplayedChild(0);
        if (z) {
            setInAnimation(this.A0J);
            setOutAnimation(this.A0K);
        }
        int i = 0;
        if (this.A0D) {
            if (z2) {
                A00();
            }
            ImageView imageView2 = this.A06;
            if (imageView2 != null) {
                if (!z2) {
                    i = 8;
                }
                imageView2.setVisibility(i);
            }
            imageView = this.A04;
        } else {
            ImageView imageView3 = this.A04;
            if (imageView3 != null) {
                if (!z2) {
                    i = 8;
                }
                imageView3.setVisibility(i);
            }
            imageView = this.A06;
        }
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public final void A04(boolean z, boolean z2, String str) {
        String str2;
        String str3;
        if (this.A0B) {
            A01(getInflatedSecondLabel());
            IgTextView igTextView = this.A0A;
            if (igTextView == null) {
                str2 = "secondLabel";
            } else {
                if (str != null) {
                    str3 = str;
                } else {
                    str3 = this.A0F;
                    if (str3 == null) {
                        str2 = "secondLabelText";
                    }
                }
                igTextView.setText(str3);
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
        if (str != null) {
            A02(str);
        }
        ImageView imageView = this.A07;
        if (imageView == null) {
            str2 = "secondLabelChevron";
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
        int i = 8;
        if (z2) {
            i = 0;
        }
        imageView.setVisibility(i);
        int i2 = this.A0H;
        if (z) {
            setInAnimation(null);
            setOutAnimation(null);
        }
        setDisplayedChild(i2);
        if (z) {
            setInAnimation(this.A0J);
            setOutAnimation(this.A0K);
        }
    }

    public final AttributeSet getAttributeSet() {
        return this.A0I;
    }

    public final boolean getHasSecondaryTitleText() {
        return this.A0C;
    }

    public final ImageView getLogoChevron() {
        return this.A06;
    }

    private final void A01(View view) {
        this.A0A = (IgTextView) view.requireViewById(R.id.title_text);
        this.A07 = (ImageView) view.requireViewById(R.id.title_chevron);
        this.A0E = (LinearLayout) view.requireViewById(R.id.text_title_chevron_container);
    }

    public final void setHasSecondaryTitleText(boolean z) {
        this.A0C = z;
    }

    public final void setUsingIgLogo(boolean z) {
        this.A0D = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionBarTitleViewSwitcher(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate;
        Drawable drawable;
        Drawable drawable2;
        C14360o3.A0B(context, 1);
        this.A0I = attributeSet;
        this.A0H = 1;
        this.A0G = 2;
        this.A0J = AnimationUtils.loadAnimation(context, R.anim.fade_in);
        this.A0K = AnimationUtils.loadAnimation(context, R.anim.fade_out);
        this.A0D = true;
        int A03 = C0f9.A03(1766315036);
        AttributeSet attributeSet2 = this.A0I;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet2, AbstractC55922hc.A00, 0, 0);
            C14360o3.A07(obtainStyledAttributes);
            try {
                this.A0D = obtainStyledAttributes.getBoolean(3, true);
                this.A0B = obtainStyledAttributes.getBoolean(0, false);
                this.A00 = obtainStyledAttributes.getResourceId(1, R.layout.action_bar_title_switcher_first_label);
                this.A01 = obtainStyledAttributes.getResourceId(2, this.A0B ? R.layout.stub_text_title_chevron_container : R.layout.action_bar_title_switcher_second_label);
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                C0f9.A0A(-861202984, A03);
                throw th;
            }
        }
        boolean z = this.A0D;
        Context context2 = getContext();
        LayoutInflater from = LayoutInflater.from(context2);
        if (z) {
            inflate = from.inflate(R.layout.action_bar_title_switcher_logo, (ViewGroup) this, false);
            this.A05 = (ImageView) inflate.requireViewById(R.id.title_logo);
            this.A02 = (ViewStub) inflate.requireViewById(R.id.logo_chevron_view_stub);
            if (!this.A0B) {
                A00();
            }
            this.A08 = (LinearLayout) inflate.requireViewById(R.id.title_logo_chevron_container);
            ImageView imageView = this.A05;
            if (imageView != null && (drawable2 = imageView.getDrawable()) != null) {
                drawable2.getIntrinsicWidth();
            }
            ImageView imageView2 = this.A05;
            if (imageView2 != null && (drawable = imageView2.getDrawable()) != null) {
                drawable.getIntrinsicHeight();
            }
        } else {
            inflate = from.inflate(this.A00, (ViewGroup) this, false);
            this.A09 = (IgTextView) inflate.requireViewById(R.id.title_text);
            this.A04 = (ImageView) inflate.requireViewById(R.id.title_chevron);
        }
        addView(inflate);
        if (this.A0D && this.A0B) {
            View inflate2 = LayoutInflater.from(context2).inflate(R.layout.stub_text_title_chevron_container, (ViewGroup) this, false);
            C14360o3.A0C(inflate2, "null cannot be cast to non-null type android.view.ViewStub");
            ViewStub viewStub = (ViewStub) inflate2;
            this.A03 = viewStub;
            if (viewStub == null) {
                C14360o3.A0F("secondLabelViewStub");
                throw C00O.createAndThrow();
            }
            addView(viewStub);
        } else {
            View inflate3 = LayoutInflater.from(context2).inflate(this.A01, (ViewGroup) this, false);
            C14360o3.A0A(inflate3);
            A01(inflate3);
            addView(inflate3);
            addView(new View(context2), 0, 0);
        }
        C0f9.A0A(1865418155, A03);
        setInAnimation(this.A0J);
        setOutAnimation(this.A0K);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionBarTitleViewSwitcher(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }
}
