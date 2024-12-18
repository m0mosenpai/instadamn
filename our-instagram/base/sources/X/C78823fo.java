package X;

/* renamed from: X.3fo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C78823fo implements InterfaceC78813fn {
    public static final C78823fo A00 = new Object();

    @Override // X.InterfaceC78813fn
    public final int AHF(CharSequence charSequence, int i, int i2) {
        boolean z = false;
        for (int i3 = 0; i3 < i2; i3++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i3));
            if (directionality != 0) {
                if (directionality == 1 || directionality == 2) {
                    return 0;
                }
            } else {
                z = true;
            }
        }
        if (!z) {
            return 2;
        }
        return 1;
    }
}
