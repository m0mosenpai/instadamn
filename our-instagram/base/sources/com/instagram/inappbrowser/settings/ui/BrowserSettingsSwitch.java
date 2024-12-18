package com.instagram.inappbrowser.settings.ui;

import X.AbstractC166997dE;
import X.C14360o3;
import X.InterfaceC190658cN;
import X.JQ0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class BrowserSettingsSwitch extends FrameLayout {
    public final TextView A00;
    public final TextView A01;
    public final IgdsSwitch A02;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrowserSettingsSwitch(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        C14360o3.A0B(context, 1);
    }

    public final void setDescriptionText(String str) {
        C14360o3.A0B(str, 0);
        this.A00.setText(str);
    }

    public final void setTitle(String str) {
        C14360o3.A0B(str, 0);
        this.A01.setText(str);
    }

    public final void setToggleListener(InterfaceC190658cN interfaceC190658cN) {
        C14360o3.A0B(interfaceC190658cN, 0);
        this.A02.A07 = interfaceC190658cN;
    }

    public final TextView getDescription() {
        return this.A00;
    }

    @Override // android.view.View
    public final boolean isEnabled() {
        return this.A02.isEnabled();
    }

    public final void setChecked(boolean z) {
        this.A02.setChecked(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        this.A02.setEnabled(z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrowserSettingsSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        C14360o3.A0B(context, 1);
    }

    public final void setDescriptionText(int i) {
        this.A00.setText(i);
    }

    public final void setTitle(int i) {
        this.A01.setText(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowserSettingsSwitch(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C14360o3.A0B(context, 1);
        View.inflate(context, R.layout.layout_browser_settings_switch_item, this);
        this.A01 = AbstractC166997dE.A0T(this, R.id.switch_title);
        this.A02 = (IgdsSwitch) requireViewById(R.id.switch_button);
        this.A00 = AbstractC166997dE.A0T(this, R.id.switch_description);
    }

    public /* synthetic */ BrowserSettingsSwitch(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i3), JQ0.A03(i3, i), (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrowserSettingsSwitch(Context context) {
        this(context, null, 0, 0);
        C14360o3.A0B(context, 1);
    }
}
