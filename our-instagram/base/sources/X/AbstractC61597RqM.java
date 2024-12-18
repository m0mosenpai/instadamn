package X;

import android.content.res.ColorStateList;
import java.util.ArrayList;

/* renamed from: X.RqM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61597RqM {
    public final boolean A01() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (this instanceof Q9n) {
            Q9n q9n = (Q9n) this;
            int i = 0;
            while (true) {
                ArrayList arrayList = q9n.A0C;
                if (i >= arrayList.size()) {
                    return false;
                }
                if (((AbstractC61597RqM) arrayList.get(i)).A01()) {
                    break;
                }
                i++;
            }
        } else if (this instanceof Q9l) {
            Q9l q9l = (Q9l) this;
            SFF sff = q9l.A09;
            if (sff.A02 != null || (colorStateList2 = sff.A01) == null || !colorStateList2.isStateful()) {
                SFF sff2 = q9l.A0A;
                if (sff2.A02 != null || (colorStateList = sff2.A01) == null || !colorStateList.isStateful()) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    public final boolean A02(int[] iArr) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        int colorForState;
        ColorStateList colorStateList2;
        int colorForState2;
        if (this instanceof Q9n) {
            Q9n q9n = (Q9n) this;
            int i = 0;
            boolean z3 = false;
            while (true) {
                ArrayList arrayList = q9n.A0C;
                if (i < arrayList.size()) {
                    z3 |= ((AbstractC61597RqM) arrayList.get(i)).A02(iArr);
                    i++;
                } else {
                    return z3;
                }
            }
        } else {
            if (this instanceof Q9l) {
                Q9l q9l = (Q9l) this;
                SFF sff = q9l.A09;
                if (sff.A02 == null && (colorStateList2 = sff.A01) != null && colorStateList2.isStateful() && (colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor())) != sff.A00) {
                    z = true;
                    sff.A00 = colorForState2;
                } else {
                    z = false;
                }
                SFF sff2 = q9l.A0A;
                if (sff2.A02 == null && (colorStateList = sff2.A01) != null && colorStateList.isStateful() && (colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor())) != sff2.A00) {
                    z2 = true;
                    sff2.A00 = colorForState;
                } else {
                    z2 = false;
                }
                return z2 | z;
            }
            return false;
        }
    }
}
