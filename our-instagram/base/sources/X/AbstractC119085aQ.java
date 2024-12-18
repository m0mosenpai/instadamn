package X;

import java.util.List;

/* renamed from: X.5aQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC119085aQ {
    public static final void A00(List list, int i) {
        int size = list.size();
        if (i >= 0 && i < size) {
        } else {
            throw new IndexOutOfBoundsException(AnonymousClass001.A0n("Index ", " is out of bounds. The list has ", " elements.", i, size));
        }
    }

    public static final void A01(List list, int i, int i2) {
        int size = list.size();
        if (i <= i2) {
            if (i >= 0) {
                if (i2 <= size) {
                    return;
                } else {
                    throw new IndexOutOfBoundsException(AnonymousClass001.A0X("toIndex (", ") is more than than the list size (", ')', i2, size));
                }
            }
            throw new IndexOutOfBoundsException(AnonymousClass001.A0c("fromIndex (", ") is less than 0.", i));
        }
        throw new IllegalArgumentException(AnonymousClass001.A0n("Indices are out of order. fromIndex (", ") is greater than toIndex (", ").", i, i2));
    }
}
