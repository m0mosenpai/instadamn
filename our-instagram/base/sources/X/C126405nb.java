package X;

import java.util.ArrayList;

/* renamed from: X.5nb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126405nb {
    public static int A00;
    public static final ArrayList A01 = new ArrayList();

    public static synchronized void A00(byte[] bArr) {
        synchronized (C126405nb.class) {
            A00--;
            ArrayList arrayList = A01;
            if (arrayList.size() < 4) {
                arrayList.add(bArr);
            }
        }
    }
}
