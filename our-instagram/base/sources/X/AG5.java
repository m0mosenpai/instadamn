package X;

import android.graphics.Bitmap;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class AG5 {
    public final HashMap A00 = AbstractC166987dD.A1G();
    public final InterfaceC16660sJ A01;

    public static final int A00(Bitmap bitmap, AG5 ag5) {
        HashMap hashMap = ag5.A00;
        if (!hashMap.containsKey(bitmap)) {
            AbstractC166997dE.A1U(bitmap, hashMap, 0);
        }
        Number number = (Number) hashMap.get(bitmap);
        if (number == null) {
            return 0;
        }
        return number.intValue();
    }

    public AG5(InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = interfaceC16660sJ;
    }
}
