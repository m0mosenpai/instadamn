package X;

import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.instagram.ui.text.TextColorScheme;
import com.instagram.ui.text.fittingtextview.FittingTextView;
import com.instagram.ui.widget.drawing.EyedropperColorPickerTool;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.Afg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23769Afg implements InterfaceC185958Mp, C8BD {
    public TextColorScheme A00;
    public boolean A01;
    public TextColorScheme A02;
    public final ViewOnTouchListenerC1829889t A03;
    public final InterfaceC143326dX A04;
    public final TextColorScheme A05;
    public final TextColorScheme A06;
    public final EyedropperColorPickerTool A07;
    public final C01U A08;
    public final AB2 A09;
    public final C1816783z A0A;
    public final C8D9 A0B;
    public final FittingTextView A0C;
    public final FittingTextView A0D;
    public final int[] A0E;

    public C23769Afg(AB2 ab2, C1816783z c1816783z, C8D9 c8d9, ViewOnTouchListenerC1829889t viewOnTouchListenerC1829889t, InterfaceC143326dX interfaceC143326dX, FittingTextView fittingTextView, FittingTextView fittingTextView2, EyedropperColorPickerTool eyedropperColorPickerTool) {
        AbstractC167007dF.A1F(c1816783z, 2, c8d9);
        this.A09 = ab2;
        this.A0A = c1816783z;
        this.A04 = interfaceC143326dX;
        this.A0B = c8d9;
        this.A07 = eyedropperColorPickerTool;
        this.A03 = viewOnTouchListenerC1829889t;
        this.A0D = fittingTextView;
        this.A0C = fittingTextView2;
        int[] iArr = {0, 0};
        this.A0E = iArr;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        C8LG c8lg = new C8LG();
        c8lg.A02(Arrays.copyOf(iArr, 2));
        C14360o3.A0B(orientation, 0);
        c8lg.A03 = orientation;
        TextColorScheme textColorScheme = new TextColorScheme(c8lg);
        this.A05 = textColorScheme;
        C8LG c8lg2 = new C8LG();
        c8lg2.A02(Arrays.copyOf(C8QG.A08, 7));
        c8lg2.A03 = orientation;
        this.A06 = new TextColorScheme(c8lg2);
        this.A02 = textColorScheme;
        this.A01 = true;
        this.A00 = textColorScheme;
        this.A08 = new C01U();
    }

    public static final void A03(C23769Afg c23769Afg, boolean z) {
        C8D9 c8d9 = c23769Afg.A0B;
        if (z) {
            c8d9.A03(true, false);
            EyedropperColorPickerTool eyedropperColorPickerTool = c23769Afg.A07;
            if (eyedropperColorPickerTool != null) {
                AbstractC167007dF.A0y(eyedropperColorPickerTool, true);
            }
            A00(c23769Afg);
            FittingTextView fittingTextView = c23769Afg.A0C;
            if (fittingTextView != null) {
                AbstractC167007dF.A0y(fittingTextView, true);
            }
        } else {
            c8d9.A02(false);
            EyedropperColorPickerTool eyedropperColorPickerTool2 = c23769Afg.A07;
            if (eyedropperColorPickerTool2 != null) {
                AbstractC166997dE.A1L(eyedropperColorPickerTool2, false);
            }
            FittingTextView fittingTextView2 = c23769Afg.A0D;
            if (fittingTextView2 != null) {
                AbstractC166997dE.A1L(fittingTextView2, false);
            }
            FittingTextView fittingTextView3 = c23769Afg.A0C;
            if (fittingTextView3 != null) {
                AbstractC166997dE.A1L(fittingTextView3, false);
            }
        }
        ((C8Q5) c23769Afg.A09.A00.A1g.get()).EQA(z);
    }

    public final void A05(int[] iArr, boolean z, boolean z2) {
        int i = iArr[0];
        C8LG c8lg = new C8LG();
        c8lg.A02(Arrays.copyOf(new int[]{i, i}, 2));
        A01(this, new TextColorScheme(c8lg), z, z2);
    }

    @Override // X.InterfaceC185958Mp
    public final /* synthetic */ void DFI() {
    }

    @Override // X.InterfaceC185958Mp
    public final void DFK(int i) {
        A05(new int[]{i}, true, true);
        A03(this, true);
    }

    @Override // X.InterfaceC185958Mp
    public final /* synthetic */ void DFL() {
    }

    @Override // X.InterfaceC185958Mp
    public final void DFM() {
        A03(this, false);
    }

    @Override // X.InterfaceC185958Mp
    public final /* synthetic */ void DFN(int i) {
    }

    public static final void A00(C23769Afg c23769Afg) {
        FittingTextView fittingTextView = c23769Afg.A0D;
        if (fittingTextView != null) {
            View[] viewArr = {fittingTextView};
            if (!c23769Afg.A08.isEmpty()) {
                AbstractC125325le.A04(null, viewArr, true);
            } else {
                AbstractC125325le.A05(viewArr, false);
            }
        }
    }

    public static final void A01(C23769Afg c23769Afg, TextColorScheme textColorScheme, boolean z, boolean z2) {
        Number number;
        EyedropperColorPickerTool eyedropperColorPickerTool;
        if (z) {
            AbstractC166997dE.A1R(c23769Afg.A00, Boolean.valueOf(c23769Afg.A01), c23769Afg.A08);
            A00(c23769Afg);
        }
        C1815483h c1815483h = c23769Afg.A0A.A01;
        C183978Ee A03 = c1815483h.A03();
        if (A03 != null) {
            A03.A1A = true;
        }
        C195868lW A04 = c1815483h.A04();
        if (A04 != null) {
            A04.A1K = true;
        }
        if (z || z2) {
            c23769Afg.A01 = false;
            c23769Afg.A00 = textColorScheme;
        }
        List list = textColorScheme.A07;
        if (list != null && (number = (Number) AbstractC001800i.A0O(list, 0)) != null && (eyedropperColorPickerTool = c23769Afg.A07) != null) {
            eyedropperColorPickerTool.setColor(number.intValue());
        }
        c23769Afg.A09.A00(textColorScheme, textColorScheme, 0);
    }

    public static final void A02(C23769Afg c23769Afg, boolean z) {
        if (z) {
            c23769Afg.A08.clear();
            A00(c23769Afg);
        }
        C1815483h c1815483h = c23769Afg.A0A.A01;
        C183978Ee A03 = c1815483h.A03();
        if (A03 != null) {
            A03.A1A = false;
        }
        C195868lW A04 = c1815483h.A04();
        if (A04 != null) {
            A04.A1K = false;
        }
        c23769Afg.A01 = true;
        c23769Afg.A00 = c23769Afg.A02;
        EyedropperColorPickerTool eyedropperColorPickerTool = c23769Afg.A07;
        if (eyedropperColorPickerTool != null) {
            eyedropperColorPickerTool.setColor(-1);
        }
        c23769Afg.A09.A00(c23769Afg.A06, c23769Afg.A00, 2);
    }

    public final void A04() {
        ViewOnTouchListenerC1829889t viewOnTouchListenerC1829889t = this.A03;
        viewOnTouchListenerC1829889t.A09.remove(this);
        viewOnTouchListenerC1829889t.A04();
        Bitmap bitmap = viewOnTouchListenerC1829889t.A02;
        if (bitmap != null) {
            bitmap.recycle();
            viewOnTouchListenerC1829889t.A02 = null;
        }
        this.A08.clear();
        A03(this, false);
        this.A04.D5W(this);
    }

    @Override // X.C8BD
    public final boolean onBackPressed() {
        A04();
        return true;
    }
}
