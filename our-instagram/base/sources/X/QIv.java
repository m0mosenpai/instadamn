package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class QIv extends C0T6 {
    public long A00;
    public boolean A01;
    public final int A02;

    public QIv(long j, int i, boolean z) {
        this.A02 = i;
        this.A01 = z;
        this.A00 = j;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A02) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
        }
        if (obj instanceof QIv) {
            QIv qIv = (QIv) obj;
            if (qIv.A02 != i || this.A01 != qIv.A01 || this.A00 != qIv.A00) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return (i * 31) + AbstractC25228BEl.A03(this.A00);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QIv(DefaultConstructorMarker defaultConstructorMarker, int i, int i2, long j, boolean z) {
        this(0L, 0, false);
        this.A02 = 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QIv() {
        this(0L, 0, false);
        this.A02 = 0;
        this.A02 = 0;
    }
}
