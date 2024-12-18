package X;

import android.view.View;

/* renamed from: X.Vx9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69882Vx9 {
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ba, code lost:
    
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C69411Vmv r17, X.C66346UAn r18, X.C6FG r19, X.C102884kP r20, com.instagram.user.model.User r21) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC69882Vx9.A01(X.Vmv, X.UAn, X.6FG, X.4kP, com.instagram.user.model.User):void");
    }

    public static final C6BN A00(C2WC c2wc, String str, int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 0 && View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            int[] iArr = new int[2];
            if (C6AO.A00(str, "image_preview_card")) {
                iArr[0] = size;
            } else {
                size2 = Math.min(size, size2);
                iArr[0] = size2;
            }
            iArr[1] = size2;
            return new C6BN(c2wc, null, iArr[0], size2);
        }
        AbstractC25241Le.A02("UserAvatarBinderUtils", "Measure specs  are UNSPECIFIED for UserAvatar");
        return new C6BN(c2wc, null, 0, 0);
    }
}
