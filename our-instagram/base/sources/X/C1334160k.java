package X;

/* renamed from: X.60k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1334160k extends AbstractC1334260l {
    public final Exception A00;
    public final String A01;
    public final String A02;

    public C1334160k(Exception exc, String str, String str2) {
        C14360o3.A0B(str2, 2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = exc;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1334160k) {
                C1334160k c1334160k = (C1334160k) obj;
                if (!C14360o3.A0K(this.A01, c1334160k.A01) || !C14360o3.A0K(this.A02, c1334160k.A02) || !C14360o3.A0K(this.A00, c1334160k.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A00.hashCode();
    }
}
