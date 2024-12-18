package X;

/* renamed from: X.OLa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54821OLa {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54821OLa) {
                C54821OLa c54821OLa = (C54821OLa) obj;
                if (!C14360o3.A0K(this.A00, c54821OLa.A00) || !C14360o3.A0K(this.A01, c54821OLa.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A0v("MEmuExtendedCaptureImage(id=", this.A00, ", uri=", this.A01, ')');
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0J(this.A00));
    }

    public C54821OLa(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
