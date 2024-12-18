package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

/* renamed from: X.4Zx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97624Zx {
    public View A01;
    public LinearLayout A02;
    public TextView A03;
    public InterfaceC41201vU A04;
    public InterfaceC97614Zw A05;
    public Wm1 A07;
    public final InterfaceC56392iX A09;
    public ArrayList A08 = new ArrayList();
    public int A00 = -1;
    public C97634Zy A06 = new C97634Zy(this);

    public final void A00() {
        String format;
        Wm1 wm1 = this.A07;
        if (wm1 == null) {
            format = "Cannot show correct answer because of null sticker model.";
        } else {
            int A00 = wm1.A00();
            ArrayList arrayList = this.A08;
            if (A00 >= arrayList.size()) {
                format = String.format("Cannot show correct answer because correct answer is set as %d with answer array size %d", Integer.valueOf(A00), Integer.valueOf(arrayList.size()));
            } else {
                C41624IbE c41624IbE = (C41624IbE) arrayList.get(A00);
                Drawable drawable = c41624IbE.A03;
                int i = c41624IbE.A02;
                C41624IbE.A00(drawable, i);
                View view = c41624IbE.A05;
                TransitionDrawable transitionDrawable = c41624IbE.A04;
                view.setBackground(transitionDrawable);
                c41624IbE.A06.setBackground(drawable);
                c41624IbE.A07.setTextColor(i);
                transitionDrawable.startTransition(150);
                return;
            }
        }
        C0w9.A03("ReelQuizStickerViewBinder", format);
    }

    public final void A01(int i) {
        this.A00 = i;
        if (i != -1) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.A08;
                if (i2 < arrayList.size()) {
                    C41624IbE c41624IbE = (C41624IbE) arrayList.get(i2);
                    boolean z = true;
                    boolean z2 = false;
                    if (i2 == this.A00) {
                        z2 = true;
                    }
                    Wm1 wm1 = this.A07;
                    wm1.getClass();
                    if (i2 != wm1.A00()) {
                        z = false;
                    }
                    c41624IbE.A01(z2, z);
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public C97624Zx(InterfaceC56392iX interfaceC56392iX) {
        this.A09 = interfaceC56392iX;
    }
}
