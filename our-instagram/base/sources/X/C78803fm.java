package X;

import com.facebook.forker.Process;

/* renamed from: X.3fm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C78803fm implements InterfaceC78813fn {
    public static final C78803fm A00 = new Object();

    @Override // X.InterfaceC78813fn
    public final int AHF(CharSequence charSequence, int i, int i2) {
        int i3 = 2;
        for (int i4 = 0; i4 < i2 && i3 == 2; i4++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i4));
            i3 = 1;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case Process.SIGTERM /* 15 */:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            i3 = 2;
                            break;
                    }
                }
                i3 = 0;
            }
        }
        return i3;
    }
}
