package X;

import android.content.Context;
import android.view.View;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.TextView;

/* renamed from: X.Dxf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31778Dxf extends FrameLayout implements Checkable {
    public View A00;
    public TextView A01;
    public TextView A02;

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        int A01;
        Context context = getContext();
        if (z) {
            A01 = AbstractC31173DnH.A01(context);
            this.A00.setVisibility(0);
        } else {
            A01 = AbstractC31174DnI.A01(context);
            this.A00.setVisibility(8);
        }
        AbstractC166997dE.A1F(this.A02.getCompoundDrawablesRelative()[0].mutate(), A01);
        this.A02.setTextColor(A01);
        this.A01.setTextColor(A01);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return AbstractC167007dF.A1N(this.A00.getVisibility());
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }
}
