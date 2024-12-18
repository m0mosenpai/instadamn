package com.instagram.igds.components.textcell;

import X.C14360o3;
import X.JQ0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.accessibility.AccessibleTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class IgdsFooterCell extends LinearLayout {
    public View A00;
    public View A01;
    public final AccessibleTextView A02;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsFooterCell(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    public final void A00(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        AccessibleTextView accessibleTextView = this.A02;
        accessibleTextView.setText(charSequence);
        accessibleTextView.setVisibility(charSequence.length() <= 0 ? 8 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgdsFooterCell(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        setOrientation(1);
        View inflate = View.inflate(context, R.layout.igds_footercell_layout, this);
        this.A02 = (AccessibleTextView) inflate.requireViewById(R.id.igds_footer_text);
        this.A00 = inflate.requireViewById(R.id.igds_footercell_separator);
        this.A01 = inflate.requireViewById(R.id.igds_footercell_spacer);
    }

    public /* synthetic */ IgdsFooterCell(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i));
    }
}
