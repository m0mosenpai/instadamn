package X;

import android.content.Context;
import android.graphics.Color;

/* renamed from: X.A1q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22746A1q {
    public static final int[] A00(Context context, C217859kI c217859kI) {
        int[] iArr;
        String str = c217859kI.A00.A01;
        if (str != null) {
            try {
                int parseColor = Color.parseColor(str);
                iArr = new int[5];
                for (int i = 0; i < 5; i++) {
                    iArr[i] = parseColor;
                }
            } catch (IllegalArgumentException unused) {
                C0w9.A03("GroupMentionStickerStyleUtil", AnonymousClass001.A0R("Failed to parse customColor ", str));
                iArr = null;
            }
            if (iArr != null) {
                return iArr;
            }
        }
        int[] iArr2 = new int[5];
        C50L.A03(context, null, iArr2, AEI.A00(c217859kI.A01));
        return iArr2;
    }
}
