package X;

import android.graphics.PorterDuff;

/* renamed from: X.6Oc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC138216Oc {
    public static final /* synthetic */ int[] A00;

    static {
        int[] iArr = new int[PorterDuff.Mode.values().length];
        A00 = iArr;
        try {
            iArr[PorterDuff.Mode.DST_IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PorterDuff.Mode.DST_OUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PorterDuff.Mode.CLEAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
