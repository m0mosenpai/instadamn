package com.instagram.igds.components.banner;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC55922hc;
import X.AbstractC56922jQ;
import X.AbstractC56952jT;
import X.C14360o3;
import X.GZA;
import X.ViewOnClickListenerC35677FpC;
import X.ViewOnClickListenerC35685FpK;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class IgdsBanner extends LinearLayout {
    public GZA A00;
    public final View A01;
    public final View A02;
    public final ImageView A03;
    public final TextView A04;
    public final TextView A05;
    public final View A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgdsBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        View.inflate(context, R.layout.layout_igds_banner, this).setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(1);
        this.A02 = findViewById(R.id.banner_top_divider);
        this.A03 = AbstractC31171DnF.A08(this, R.id.banner_icon);
        this.A05 = AbstractC166987dD.A0e(this, R.id.banner_body);
        TextView A0e = AbstractC166987dD.A0e(this, R.id.banner_action);
        this.A04 = A0e;
        View findViewById = findViewById(R.id.banner_close);
        this.A06 = findViewById;
        this.A01 = findViewById(R.id.banner_bottom_divider);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC55922hc.A1N, i, 0);
            try {
                int resourceId = obtainStyledAttributes.getResourceId(3, 0);
                String A00 = AbstractC56922jQ.A00(context, obtainStyledAttributes, 1);
                String A002 = AbstractC56922jQ.A00(context, obtainStyledAttributes, 0);
                boolean z = obtainStyledAttributes.getBoolean(4, false);
                int i2 = obtainStyledAttributes.getInt(2, 1);
                obtainStyledAttributes.recycle();
                setIcon(resourceId);
                AbstractC31172DnG.A1U(this, A00, false);
                setAction(A002);
                setDismissible(z);
                setDividerVisibility(i2);
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        AbstractC56952jT.A01(A0e);
        A0e.setOnClickListener(ViewOnClickListenerC35685FpK.A00(this, 70));
        AbstractC166997dE.A18(context, findViewById, 2131956237);
        findViewById.setOnClickListener(new ViewOnClickListenerC35677FpC(this, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
    
        r2.setVisibility(r0);
        r0 = r5.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (r4 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r1 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        r0.setVisibility(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x000d, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0009, code lost:
    
        if (r6 != 1) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
    
        if (r6 == 3) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
    
        r2 = r5.A02;
        r1 = 0;
        r0 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r3 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        r0 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setDividerVisibility(int r6) {
        /*
            r5 = this;
            r4 = 0
            r2 = 3
            r1 = 1
            r0 = 2
            if (r6 == r0) goto L23
            if (r6 == r2) goto L23
            r3 = 0
            if (r6 == r1) goto Ld
        Lb:
            if (r6 != r2) goto Le
        Ld:
            r4 = 1
        Le:
            android.view.View r2 = r5.A02
            r1 = 0
            r0 = 8
            if (r3 == 0) goto L16
            r0 = 0
        L16:
            r2.setVisibility(r0)
            android.view.View r0 = r5.A01
            if (r4 != 0) goto L1f
            r1 = 8
        L1f:
            r0.setVisibility(r1)
            return
        L23:
            r3 = 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.banner.IgdsBanner.setDividerVisibility(int):void");
    }

    public static /* synthetic */ void setBody$default(IgdsBanner igdsBanner, CharSequence charSequence, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = AbstractC166997dE.A0a();
        }
        igdsBanner.setBody(charSequence, bool);
    }

    private final void setIconInternal(Drawable drawable) {
        ImageView imageView = this.A03;
        int visibility = imageView.getVisibility();
        int i = 0;
        if (drawable == null) {
            i = 8;
        }
        imageView.setImageDrawable(drawable);
        imageView.setVisibility(i);
        if (visibility != i) {
            int i2 = 1;
            if (imageView.getVisibility() == 0) {
                i2 = 8388611;
            }
            this.A05.setGravity(i2);
            this.A04.setGravity(i2);
        }
    }

    public static /* synthetic */ void setTextInternal$default(IgdsBanner igdsBanner, TextView textView, CharSequence charSequence, Boolean bool, int i, Object obj) {
        if ((i & 4) != 0) {
            bool = AbstractC166997dE.A0a();
        }
        igdsBanner.setTextInternal(textView, charSequence, bool);
    }

    public final void setAction(int i) {
        String str;
        TextView textView = this.A04;
        if (i != 0) {
            str = getContext().getString(i);
        } else {
            str = null;
        }
        setTextInternal(textView, str, AbstractC166997dE.A0a());
    }

    public final void setBody(int i) {
        String str;
        TextView textView = this.A05;
        if (i != 0) {
            str = getContext().getString(i);
        } else {
            str = null;
        }
        setTextInternal(textView, str, AbstractC166997dE.A0a());
    }

    public final void setBodyColor(int i) {
        this.A05.setTextColor(i);
    }

    public final void setDismissible(boolean z) {
        this.A06.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
    }

    public final void setIcon(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = getContext().getDrawable(i);
        } else {
            drawable = null;
        }
        setIconInternal(drawable);
    }

    public final void setIconBackground(Drawable drawable) {
        this.A03.setBackground(drawable);
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
            textView.setHighlightColor(textView.getContext().getColor(R.color.fds_transparent));
            AbstractC25227BEk.A11(textView);
        }
    }

    public final GZA getCallback() {
        return this.A00;
    }

    public final void setDividerColor(int i) {
        int color = getContext().getColor(i);
        this.A02.setBackgroundColor(color);
        this.A01.setBackgroundColor(color);
    }

    public final void setCallback(GZA gza) {
        this.A00 = gza;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public final void setAction(CharSequence charSequence) {
        setTextInternal(this.A04, charSequence, AbstractC166997dE.A0a());
    }

    public final void setBody(CharSequence charSequence, Boolean bool) {
        setTextInternal(this.A05, charSequence, bool);
    }

    public final void setIcon(Drawable drawable) {
        setIconInternal(drawable);
    }

    public /* synthetic */ IgdsBanner(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsBanner(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
