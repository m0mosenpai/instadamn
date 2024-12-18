package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.64n, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C64n {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C64n[] A02;
    public static final C64n A03;
    public final Rect A00 = new Rect();
    public static final C64n A04 = new C64n() { // from class: X.64o
    };
    public static final C64n A07 = new C64n() { // from class: X.64p
    };
    public static final C64n A06 = new C64n() { // from class: X.64q
    };
    public static final C64n A05 = new C64n() { // from class: X.64r
    };

    static {
        C64n c64n = new C64n() { // from class: X.64s
        };
        A03 = c64n;
        C64n[] c64nArr = {A04, A07, A06, A05, c64n};
        A02 = c64nArr;
        A01 = AbstractC12190kN.A00(c64nArr);
    }

    public final void A00(Drawable drawable, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        Rect rect = this.A00;
        if (i == -1) {
            i = drawable.getIntrinsicWidth();
        }
        if (i2 == -1) {
            i2 = drawable.getIntrinsicHeight();
        }
        if (this instanceof C1342564q) {
            C14360o3.A0B(rect, 0);
            rect.set(i3 - i, 0, i3, i2);
        } else if (this instanceof C1342464p) {
            C14360o3.A0B(rect, 0);
            rect.set((i3 - i) - 14, 14, i3 - 14, i2 + 14);
        } else if (this instanceof C1342664r) {
            C14360o3.A0B(rect, 0);
            rect.set(0, 0, i, i2);
        } else {
            if (this instanceof C64o) {
                C14360o3.A0B(rect, 0);
                i5 = (i3 - i) / 2;
                i6 = (i4 - i2) / 2;
                i7 = i + i5;
                i8 = i2 + i6;
            } else {
                C14360o3.A0B(rect, 0);
                i5 = (i3 - i) - 14;
                i6 = (i4 - i2) - 14;
                i7 = i3 - 14;
                i8 = i4 - 14;
            }
            rect.set(i5, i6, i7, i8);
        }
        drawable.setBounds(rect);
    }

    public C64n(String str, int i) {
    }
}
