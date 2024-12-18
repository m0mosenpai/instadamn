package com.facebook.ui.emoji.model;

import X.C12550kz;
import android.os.Parcelable;
import com.instagram.ui.emoji.EmojiSkinTone$createVariations$baseEmoji$1;

/* loaded from: classes4.dex */
public abstract class Emoji implements Parcelable {
    public static final C12550kz A00 = new C12550kz(2);
    public static final C12550kz A01 = new C12550kz(2);

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A01(int[] r4, int r5, boolean r6) {
        /*
            r3 = 0
            r2 = 0
        L2:
            if (r3 >= r5) goto L22
            r1 = r4[r3]
            if (r6 == 0) goto L15
            r0 = 127995(0x1f3fb, float:1.79359E-40)
            if (r1 < r0) goto L15
            r0 = 127999(0x1f3ff, float:1.79365E-40)
            if (r1 > r0) goto L1b
        L12:
            int r3 = r3 + 1
            goto L2
        L15:
            r0 = 65039(0xfe0f, float:9.1139E-41)
            if (r1 != r0) goto L1b
            goto L12
        L1b:
            if (r2 == r3) goto L1f
            r4[r2] = r1
        L1f:
            int r2 = r2 + 1
            goto L12
        L22:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ui.emoji.model.Emoji.A01(int[], int, boolean):int");
    }

    public String A03() {
        return ((EmojiSkinTone$createVariations$baseEmoji$1) this).A00;
    }

    public static int[] A02() {
        int[] iArr = (int[]) A01.A7H();
        if (iArr == null) {
            return new int[11];
        }
        return iArr;
    }

    public static int A00(String str, int[] iArr) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length && i2 < iArr.length) {
            int codePointAt = Character.codePointAt(str, i);
            iArr[i2] = codePointAt;
            i2++;
            i += Character.charCount(codePointAt);
        }
        return i2;
    }

    public final String toString() {
        String A03 = A03();
        StringBuilder sb = new StringBuilder(11);
        boolean z = true;
        int i = 0;
        while (i < A03.length()) {
            if (z) {
                z = false;
            } else {
                sb.append('_');
            }
            int codePointAt = Character.codePointAt(A03, i);
            sb.append(Integer.toHexString(codePointAt));
            i += Character.charCount(codePointAt);
        }
        return sb.toString();
    }
}
