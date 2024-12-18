package com.instagram.profile.intf.tabs;

import X.AbstractC13620mo;
import X.AbstractC85953sP;
import X.C14360o3;
import X.C57012jc;
import X.InterfaceC154386wo;
import X.JQ0;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class ProfileTextTabView extends FrameLayout implements InterfaceC154386wo {
    public TextView A00;
    public C57012jc A01;
    public final int A02;
    public final View A03;
    public final int[][] A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.2jc, java.lang.Object] */
    public ProfileTextTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A04 = new int[][]{new int[]{R.attr.state_selected}, new int[0]};
        this.A02 = context.getColor(com.facebook.R.color.grey_5);
        this.A03 = this;
        View.inflate(context, com.facebook.R.layout.profile_text_tab_view, this);
        this.A00 = (TextView) requireViewById(com.facebook.R.id.profile_tab_text_view);
        View findViewById = findViewById(com.facebook.R.id.profile_tab_led_notification_stub);
        ?? obj = new Object();
        obj.A00 = findViewById;
        this.A01 = obj;
    }

    @Override // X.InterfaceC154386wo
    public final void EJ3(boolean z) {
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        C14360o3.A0B(accessibilityNodeInfo, 0);
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClickable(false);
    }

    @Override // X.InterfaceC154386wo
    public void setActiveIcon(Drawable drawable) {
    }

    @Override // X.InterfaceC154386wo
    public void setEndIcon(Drawable drawable) {
    }

    @Override // X.InterfaceC154386wo
    public void setIcon(Drawable drawable) {
    }

    @Override // X.InterfaceC154386wo
    public void setTitle(String str) {
        C14360o3.A0B(str, 0);
        this.A00.setText(str);
    }

    @Override // X.InterfaceC154386wo
    public void setTitleDrawable(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        TextView textView = this.A00;
        if (AbstractC13620mo.A02(textView.getContext())) {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
        AbstractC85953sP.A04(textView);
    }

    @Override // X.InterfaceC154386wo
    public View getView() {
        return this.A03;
    }

    @Override // X.InterfaceC154386wo
    public void setActiveColor(int i) {
        this.A00.setTextColor(new ColorStateList(this.A04, new int[]{i, this.A02}));
    }

    @Override // X.InterfaceC154386wo
    public void setBadgeCount(int i) {
        C57012jc c57012jc = this.A01;
        int i2 = 8;
        if (i > 0) {
            i2 = 0;
        }
        c57012jc.A03(i2);
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        this.A00.setContentDescription(charSequence);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A00.setOnClickListener(onClickListener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProfileTextTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ ProfileTextTabView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProfileTextTabView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
