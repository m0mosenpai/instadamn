package X;

/* renamed from: X.0MD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0MD {
    public final String A00;
    public final boolean A01;

    public final String toString() {
        String str;
        if (this.A01) {
            str = "Succeeded";
        } else {
            str = "Failed";
        }
        String str2 = this.A00;
        if (str2 == null) {
            str2 = "<none>";
        }
        return AnonymousClass001.A11("[Success State: ", str, " Err Msg If Present: ", str2, "]");
    }

    public C0MD(boolean z, String str) {
        this.A01 = z;
        this.A00 = str;
    }
}
