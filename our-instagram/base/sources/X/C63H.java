package X;

/* renamed from: X.63H, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C63H extends C63G {
    public final String A00;

    public C63H(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C63H) && C14360o3.A0K(this.A00, ((C63H) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass001.A0S("BloksPrebundledData(payloadFilePath=", this.A00, ')');
    }
}
