package X;

import android.content.res.Resources;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.MdI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50825MdI extends C02V {
    public final int A00;

    public C50825MdI(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    @Override // X.C02V
    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        String A00;
        Resources resources;
        int i;
        CharSequence A0q;
        int i2;
        Integer num;
        int i3 = this.A00;
        AbstractC167017dG.A1N(view, accessibilityNodeInfoCompat);
        switch (i3) {
            case 0:
            case 1:
                super.A0Y(view, accessibilityNodeInfoCompat);
                A00 = AbstractC111324zv.A00(1916);
                accessibilityNodeInfoCompat.setClassName(A00);
                return;
            case 2:
                super.A0Y(view, accessibilityNodeInfoCompat);
                resources = view.getResources();
                i = 2131973280;
                A0q = resources.getText(i);
                C14360o3.A07(A0q);
                i2 = 16;
                accessibilityNodeInfoCompat.addAction(new C012804r(i2, A0q));
                return;
            case 3:
                super.A0Y(view, accessibilityNodeInfoCompat);
                A0q = AbstractC166997dE.A0q(view.getResources(), 2131966359);
                i2 = 32;
                accessibilityNodeInfoCompat.addAction(new C012804r(i2, A0q));
                return;
            case 4:
                super.A0Y(view, accessibilityNodeInfoCompat);
                A00 = null;
                accessibilityNodeInfoCompat.setClassName(A00);
                return;
            case 5:
            case 6:
            default:
                super.A0Y(view, accessibilityNodeInfoCompat);
                num = C05F.A15;
                AbstractC56952jT.A05(accessibilityNodeInfoCompat, num);
                return;
            case 7:
                super.A0Y(view, accessibilityNodeInfoCompat);
                num = C05F.A0C;
                AbstractC56952jT.A05(accessibilityNodeInfoCompat, num);
                return;
            case 8:
                super.A0Y(view, accessibilityNodeInfoCompat);
                resources = view.getResources();
                i = 2131962625;
                A0q = resources.getText(i);
                C14360o3.A07(A0q);
                i2 = 16;
                accessibilityNodeInfoCompat.addAction(new C012804r(i2, A0q));
                return;
        }
    }
}
