package com.instagram.igds.components.banner;

import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC55922hc;
import X.AbstractC56922jQ;
import X.AbstractC56952jT;
import X.C14360o3;
import X.GZA;
import X.JQ0;
import X.MSX;
import X.MSY;
import X.ViewOnClickListenerC35677FpC;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.google.android.material.card.MaterialCardView;
import com.instagram.igds.components.button.IgdsButton;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class IgdsInsetBanner extends FrameLayout {
    public GZA A00;
    public final View A01;
    public final ImageView A02;
    public final ImageView A03;
    public final TextView A04;
    public final TextView A05;
    public final MaterialCardView A06;
    public final IgdsButton A07;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsInsetBanner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        C14360o3.A0B(context, 1);
    }

    private final void setBorderStyle(int i) {
        int i2;
        MaterialCardView materialCardView = this.A06;
        if (i == 1) {
            materialCardView.setCardElevation(0.0f);
            i2 = (int) AbstractC13880nE.A00(AbstractC166997dE.A0L(this), 0.5f);
        } else {
            materialCardView.setCardElevation(AbstractC13880nE.A00(AbstractC166997dE.A0L(this), 1.0f));
            i2 = 0;
        }
        materialCardView.setStrokeWidth(i2);
    }

    public static /* synthetic */ void setBody$default(IgdsInsetBanner igdsInsetBanner, CharSequence charSequence, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = AbstractC166997dE.A0a();
        }
        igdsInsetBanner.setBody(charSequence, bool);
    }

    public static /* synthetic */ void setHeadline$default(IgdsInsetBanner igdsInsetBanner, CharSequence charSequence, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = AbstractC166997dE.A0a();
        }
        igdsInsetBanner.setHeadline(charSequence, bool);
    }

    public static /* synthetic */ void setTextInternal$default(IgdsInsetBanner igdsInsetBanner, TextView textView, CharSequence charSequence, Boolean bool, int i, Object obj) {
        if ((i & 4) != 0) {
            bool = AbstractC166997dE.A0a();
        }
        igdsInsetBanner.setTextInternal(textView, charSequence, bool);
    }

    public final GZA getCallback() {
        return this.A00;
    }

    public final void setAction(String str) {
        if (str != null) {
            this.A07.setText(str);
        }
        IgdsButton igdsButton = this.A07;
        int i = 0;
        if (str == null || str.length() == 0) {
            i = 8;
        }
        igdsButton.setVisibility(i);
    }

    public final void setBody(int i) {
        String str;
        TextView textView = this.A04;
        if (i != 0) {
            str = getContext().getString(i);
        } else {
            str = null;
        }
        setTextInternal(textView, str, AbstractC166997dE.A0a());
    }

    public final void setBodyColor(int i) {
        this.A04.setTextColor(i);
    }

    public final void setDismissible(boolean z) {
        this.A01.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
    }

    public final void setHeadline(int i) {
        String str;
        TextView textView = this.A05;
        if (i != 0) {
            str = getContext().getString(i);
        } else {
            str = null;
        }
        setTextInternal(textView, str, AbstractC166997dE.A0a());
    }

    public final void setIconEnd(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = getContext().getDrawable(i);
        } else {
            drawable = null;
        }
        setIconInternal(this.A02, drawable);
    }

    public final void setIconEndBackground(Drawable drawable) {
        this.A02.setBackground(drawable);
    }

    public final void setIconStart(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = getContext().getDrawable(i);
        } else {
            drawable = null;
        }
        setIconInternal(this.A03, drawable);
    }

    public final void setIconStartBackground(Drawable drawable) {
        this.A03.setBackground(drawable);
    }

    private final void setIconInternal(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        int i = 0;
        if (drawable == null) {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    private final void setTextInternal(TextView textView, CharSequence charSequence, Boolean bool) {
        textView.setText(charSequence);
        CharSequence text = textView.getText();
        int i = 0;
        if (text == null || text.length() == 0) {
            i = 8;
        }
        textView.setVisibility(i);
        if (AbstractC166997dE.A1Z(bool, true)) {
            textView.setHighlightColor(MSX.A02(textView.getContext()));
            AbstractC25227BEk.A11(textView);
        }
    }

    public final void setCallback(GZA gza) {
        this.A00 = gza;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsInsetBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        C14360o3.A0B(context, 1);
    }

    public final void setAction(int i) {
        String str;
        if (i != 0) {
            str = getContext().getString(i);
        } else {
            str = null;
        }
        setAction(str);
    }

    public final void setBody(CharSequence charSequence, Boolean bool) {
        setTextInternal(this.A04, charSequence, bool);
    }

    public final void setHeadline(CharSequence charSequence, Boolean bool) {
        setTextInternal(this.A05, charSequence, bool);
    }

    public final void setIconEnd(Drawable drawable) {
        setIconInternal(this.A02, drawable);
    }

    public final void setIconStart(Drawable drawable) {
        setIconInternal(this.A03, drawable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgdsInsetBanner(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C14360o3.A0B(context, 1);
        MSY.A10(View.inflate(context, R.layout.layout_igds_inset_banner, this), -1, -2);
        this.A06 = (MaterialCardView) findViewById(R.id.igds_inset_banner_card_view);
        this.A03 = AbstractC31171DnF.A08(this, R.id.igds_inset_banner_icon_start);
        this.A05 = AbstractC166987dD.A0e(this, R.id.igds_inset_banner_headline);
        this.A04 = AbstractC166987dD.A0e(this, R.id.igds_inset_banner_body_text);
        IgdsButton igdsButton = (IgdsButton) findViewById(R.id.igds_inset_banner_action);
        this.A07 = igdsButton;
        this.A02 = AbstractC31171DnF.A08(this, R.id.igds_inset_banner_icon_end);
        View findViewById = findViewById(R.id.igds_inset_banner_dismiss_action);
        this.A01 = findViewById;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC55922hc.A1U, i, 0);
            try {
                int resourceId = obtainStyledAttributes.getResourceId(5, 0);
                String A00 = AbstractC56922jQ.A00(context, obtainStyledAttributes, 3);
                String A002 = AbstractC56922jQ.A00(context, obtainStyledAttributes, 1);
                String A003 = AbstractC56922jQ.A00(context, obtainStyledAttributes, 0);
                int resourceId2 = obtainStyledAttributes.getResourceId(4, 0);
                boolean z = obtainStyledAttributes.getBoolean(6, false);
                int i3 = obtainStyledAttributes.getInt(2, 0);
                obtainStyledAttributes.recycle();
                setIconStart(resourceId);
                setHeadline(A00, false);
                setBody(A002, false);
                setAction(A003);
                setIconEnd(resourceId2);
                setDismissible(z);
                setBorderStyle(i3);
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        igdsButton.setOnClickListener(new ViewOnClickListenerC35677FpC(this, 1));
        AbstractC56952jT.A01(findViewById);
        findViewById.setOnClickListener(new ViewOnClickListenerC35677FpC(this, 2));
    }

    public /* synthetic */ IgdsInsetBanner(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i3), JQ0.A03(i3, i), (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsInsetBanner(Context context) {
        this(context, null, 0, 0);
        C14360o3.A0B(context, 1);
    }
}
