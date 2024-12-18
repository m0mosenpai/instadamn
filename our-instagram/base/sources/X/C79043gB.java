package X;

import android.graphics.Rect;

/* renamed from: X.3gB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79043gB {
    public boolean A00;
    public Rect A01;
    public final int A02;
    public final long A03;
    public final Rect A04;
    public final C79043gB A05;

    public static void A00(C79043gB c79043gB) {
        if (c79043gB.A01 == null) {
            c79043gB.A01 = new Rect(c79043gB.A04);
        }
    }

    public static void A01(C79043gB c79043gB, C79043gB c79043gB2) {
        if (c79043gB2 != null) {
            Rect rect = c79043gB.A04;
            Rect rect2 = c79043gB2.A04;
            boolean z = false;
            if (c79043gB.A00) {
                c79043gB2.A00 = true;
                z = true;
            }
            if (rect.top < rect2.top) {
                A00(c79043gB2);
                rect2.top = rect.top;
                z = true;
            }
            if (rect.bottom > rect2.bottom) {
                A00(c79043gB2);
                rect2.bottom = rect.bottom;
                z = true;
            }
            if (rect.left < rect2.left) {
                A00(c79043gB2);
                rect2.left = rect.left;
                z = true;
            }
            if (rect.right > rect2.right) {
                A00(c79043gB2);
                rect2.right = rect.right;
            } else if (!z) {
                return;
            }
            A01(c79043gB2, c79043gB2.A05);
        }
    }

    public C79043gB(Rect rect, C79043gB c79043gB, int i, long j, boolean z) {
        this.A03 = j;
        this.A02 = i;
        this.A04 = new Rect(rect);
        this.A05 = c79043gB;
        this.A00 = z;
        if (c79043gB != null) {
            A01(this, c79043gB);
        }
    }
}
