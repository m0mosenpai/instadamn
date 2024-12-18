package com.instagram.direct.wellbeing.unknowncontact.messagerequests.pendingthreads.rows.header;

import X.AbstractC166987dD;
import X.C00O;
import X.C14360o3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;

/* loaded from: classes8.dex */
public final class PendingThreadsMessageSettingsView extends IgLinearLayout {
    public TextView A00;
    public View A01;
    public TextView A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingThreadsMessageSettingsView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        A00(context);
    }

    public final void setLinkToSettingsClickListener(View.OnClickListener onClickListener) {
        C14360o3.A0B(onClickListener, 0);
        TextView textView = this.A02;
        if (textView == null) {
            C14360o3.A0F("linkToSettingsView");
            throw C00O.createAndThrow();
        }
        textView.setOnClickListener(onClickListener);
    }

    public final void setLinkToSettingsText(String str) {
        C14360o3.A0B(str, 0);
        TextView textView = this.A02;
        if (textView == null) {
            C14360o3.A0F("linkToSettingsView");
            throw C00O.createAndThrow();
        }
        textView.setText(str);
    }

    public final void setTitleText(String str) {
        C14360o3.A0B(str, 0);
        TextView textView = this.A00;
        if (textView == null) {
            C14360o3.A0F("titleTextView");
            throw C00O.createAndThrow();
        }
        textView.setText(str);
    }

    public final void setDividerVisibility(int i) {
        View view = this.A01;
        if (view == null) {
            C14360o3.A0F("divider");
            throw C00O.createAndThrow();
        }
        view.setVisibility(i);
    }

    public final void setLinkToSettingsVisibility(int i) {
        TextView textView = this.A02;
        if (textView == null) {
            C14360o3.A0F("linkToSettingsView");
            throw C00O.createAndThrow();
        }
        textView.setVisibility(i);
    }

    public final void A00(Context context) {
        LayoutInflater.from(context).inflate(R.layout.pending_threads_header_view, (ViewGroup) this, true);
        this.A00 = AbstractC166987dD.A0e(this, R.id.header_title);
        this.A02 = AbstractC166987dD.A0e(this, R.id.link_to_message_settings);
        this.A01 = findViewById(R.id.divider);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingThreadsMessageSettingsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        A00(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingThreadsMessageSettingsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C14360o3.A0B(context, 1);
        A00(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingThreadsMessageSettingsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        A00(context);
    }
}
