package X;

import android.content.Context;
import android.view.View;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Dxg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31779Dxg extends FrameLayout implements Checkable {
    public View A00;
    public TextView A01;
    public TextView A02;

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        int A01;
        Context context = getContext();
        if (z) {
            A01 = context.getColor(R.color.igds_whatsapp_green);
            View view = this.A00;
            if (view != null) {
                view.setVisibility(0);
            }
        } else {
            A01 = AbstractC31174DnI.A01(context);
            AbstractC167007dF.A0x(this.A00);
        }
        TextView textView = this.A02;
        if (textView != null) {
            AbstractC166997dE.A1F(textView.getCompoundDrawablesRelative()[0].mutate(), A01);
            this.A02.setTextColor(A01);
        }
        TextView textView2 = this.A01;
        if (textView2 != null) {
            textView2.setTextColor(A01);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        View view = this.A00;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }
}
