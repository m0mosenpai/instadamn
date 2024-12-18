package X;

import java.util.HashSet;

/* renamed from: X.31m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C672131m {
    public boolean A00;
    public final java.util.Set A01 = new HashSet();

    public final boolean A00(String str) {
        if (this.A00 && this.A01.contains(str)) {
            return true;
        }
        return false;
    }

    public C672131m(boolean z) {
        this.A00 = z;
    }
}
