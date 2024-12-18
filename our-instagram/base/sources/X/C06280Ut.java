package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.0Ut, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06280Ut {
    public static int A00;
    public static C06250Uq A01;
    public static final List A04 = Arrays.asList("media", "mms", "mms-sms", "sms");
    public static final List A03 = Arrays.asList("com.android.", "com.google.android.");
    public static C06260Ur[] A02 = new C06260Ur[8];

    public static void A00(String str, int i, Integer num) {
        C06250Uq c06250Uq;
        C06260Ur[] c06260UrArr;
        int i2;
        synchronized (C06280Ut.class) {
            c06250Uq = A01;
            c06260UrArr = A02;
            i2 = A00;
            if (c06260UrArr != null) {
                A00 = i2 + 1;
            }
        }
        if (c06250Uq != null) {
            c06250Uq.A00(str, i, num);
        } else {
            if (c06260UrArr == null || i2 >= c06260UrArr.length) {
                return;
            }
            c06260UrArr[i2] = new C06260Ur(str, i, num);
        }
    }
}
