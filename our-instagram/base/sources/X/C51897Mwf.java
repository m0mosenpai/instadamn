package X;

/* renamed from: X.Mwf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51897Mwf extends C0T6 implements InterfaceC57856PlM {
    public final int A00;
    public final boolean A01;

    public C51897Mwf(boolean z, int i) {
        this.A00 = i;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this != obj) {
                i = 1;
            } else {
                return true;
            }
        } else if (this != obj) {
            i = 0;
        } else {
            return true;
        }
        if (obj instanceof C51897Mwf) {
            C51897Mwf c51897Mwf = (C51897Mwf) obj;
            if (c51897Mwf.A00 != i || this.A01 != c51897Mwf.A01) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.A01) {
            return 1237;
        }
        return 1231;
    }

    public final String toString() {
        if (1 - this.A00 != 0) {
            return super.toString();
        }
        return AnonymousClass001.A0L("RtcMiniPlayerViewModel(show=", ')', this.A01);
    }
}
