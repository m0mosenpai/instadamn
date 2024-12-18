package X;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import androidx.cardview.widget.CardView;

/* renamed from: X.5Ik, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C115145Ik implements InterfaceC115155Il {
    @Override // X.InterfaceC115155Il
    public final void EYf(C5In c5In, float f) {
        C115165Im c115165Im = (C115165Im) c5In;
        C115185Ip c115185Ip = (C115185Ip) c115165Im.A00;
        CardView cardView = c115165Im.A01;
        boolean z = cardView.A00;
        boolean z2 = cardView.A01;
        if (f != c115185Ip.A00 || c115185Ip.A03 != z || c115185Ip.A04 != z2) {
            c115185Ip.A00 = f;
            c115185Ip.A03 = z;
            c115185Ip.A04 = z2;
            C115185Ip.A00(null, c115185Ip);
            c115185Ip.invalidateSelf();
        }
        FBe(c5In);
    }

    @Override // X.InterfaceC115155Il
    public final void EQB(ColorStateList colorStateList, C5In c5In) {
        C115185Ip c115185Ip = (C115185Ip) ((C115165Im) c5In).A00;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        c115185Ip.A02 = colorStateList;
        c115185Ip.A08.setColor(colorStateList.getColorForState(c115185Ip.getState(), c115185Ip.A02.getDefaultColor()));
        c115185Ip.invalidateSelf();
    }

    @Override // X.InterfaceC115155Il
    public final void FBe(C5In c5In) {
        int i;
        int i2;
        int i3;
        int i4;
        C115165Im c115165Im = (C115165Im) c5In;
        CardView cardView = c115165Im.A01;
        if (!cardView.A00) {
            cardView.A03.set(0, 0, 0, 0);
            Rect rect = cardView.A02;
            i = rect.left;
            i2 = rect.top;
            i3 = rect.right;
            i4 = rect.bottom;
        } else {
            C115185Ip c115185Ip = (C115185Ip) c115165Im.A00;
            float f = c115185Ip.A00;
            float f2 = c115185Ip.A01;
            boolean z = cardView.A01;
            float f3 = f;
            double d = U8H.A00;
            if (z) {
                f3 = (float) (f + ((1.0d - d) * f2));
            }
            int ceil = (int) Math.ceil(f3);
            float f4 = f * 1.5f;
            if (z) {
                f4 = (float) (f4 + ((1.0d - U8H.A00) * f2));
            }
            int ceil2 = (int) Math.ceil(f4);
            cardView.A03.set(ceil, ceil2, ceil, ceil2);
            Rect rect2 = cardView.A02;
            i = ceil + rect2.left;
            i2 = ceil2 + rect2.top;
            i3 = ceil + rect2.right;
            i4 = ceil2 + rect2.bottom;
        }
        super/*android.view.View*/.setPadding(i, i2, i3, i4);
    }
}
