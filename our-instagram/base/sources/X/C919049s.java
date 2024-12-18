package X;

import android.os.SystemClock;

/* renamed from: X.49s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C919049s extends C1KP {
    public final int A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C919049s(String str, int i) {
        super(str, SystemClock.uptimeMillis());
        C14360o3.A0B(str, 1);
        this.A00 = i;
    }

    @Override // X.C1KP
    public final String A00() {
        return "Legacy logging registration";
    }

    public final String toString() {
        return AnonymousClass001.A0R(this.A01, " was registered to be tracked in legacy logging");
    }
}
