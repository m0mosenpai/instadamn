package X;

import java.util.List;

/* renamed from: X.3IZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3IZ {
    public int A00;
    public int A01;
    public String A02;
    public List A03;

    public final C23781El A00() {
        for (C23781El c23781El : this.A03) {
            if (c23781El.A00.equalsIgnoreCase("X-IG-ANDROID-FROM-DISK-CACHE")) {
                return c23781El;
            }
        }
        return null;
    }
}
