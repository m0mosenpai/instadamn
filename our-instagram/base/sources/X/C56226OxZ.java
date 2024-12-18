package X;

import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: X.OxZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56226OxZ implements InterfaceC58143Pq8 {
    public View A00;
    public LinearLayout A01;
    public TextView A02;
    public boolean A03;

    @Override // X.InterfaceC58143Pq8
    public final void setSelected(boolean z) {
    }

    @Override // X.InterfaceC58143Pq8
    public final void hide() {
        this.A01.setVisibility(8);
    }

    @Override // X.InterfaceC58143Pq8
    public final void show() {
        this.A01.setVisibility(0);
    }

    @Override // X.InterfaceC58143Pq8
    public final void setDegree(float f) {
        String valueOf = String.valueOf(f);
        if (this.A03) {
            valueOf = AnonymousClass001.A0C(valueOf, (char) 176);
        }
        this.A02.setText(valueOf);
        this.A00.setVisibility(MSY.A01((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1))));
        this.A01.post(new Runnable() { // from class: X.PLe
            @Override // java.lang.Runnable
            public final void run() {
                ViewParent parent = C56226OxZ.this.A01.getParent();
                parent.getClass();
                parent.requestLayout();
            }
        });
    }
}
