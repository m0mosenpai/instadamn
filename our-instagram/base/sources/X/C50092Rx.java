package X;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.2Rx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50092Rx extends C0T6 {
    public int A00;
    public AbstractC46972Dl A01;
    public String A02;
    public final AbstractC80713j1 A03;
    public final AbstractC80713j1 A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public C50092Rx(String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 3);
        this.A05 = str;
        this.A02 = str2;
        this.A06 = str3;
        this.A00 = i;
        this.A08 = z;
        this.A09 = z2;
        this.A07 = z3;
        this.A0A = z4;
        this.A03 = new C32835Ecd(this);
        this.A04 = new C32836Ece(this);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C50092Rx) {
                C50092Rx c50092Rx = (C50092Rx) obj;
                if (!C14360o3.A0K(this.A05, c50092Rx.A05) || !C14360o3.A0K(this.A02, c50092Rx.A02) || !C14360o3.A0K(this.A06, c50092Rx.A06) || this.A00 != c50092Rx.A00 || this.A08 != c50092Rx.A08 || this.A09 != c50092Rx.A09 || this.A07 != c50092Rx.A07 || this.A0A != c50092Rx.A0A) {
                }
            }
            return false;
        }
        return true;
    }

    public final AbstractC46972Dl A00() {
        AbstractC46972Dl abstractC46972Dl = this.A01;
        if (abstractC46972Dl != null) {
            return abstractC46972Dl;
        }
        C14360o3.A0F("inboxModeValue");
        throw C00O.createAndThrow();
    }

    public final int hashCode() {
        int hashCode = ((((((this.A05.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A06.hashCode()) * 31) + this.A00) * 31;
        int i = 1237;
        if (this.A08) {
            i = 1231;
        }
        int i2 = (hashCode + i) * 31;
        int i3 = 1237;
        if (this.A09) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A07) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A0A) {
            i7 = 1231;
        }
        return i6 + i7;
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            FUS.A00(A0A, this);
            A0A.close();
            return stringWriter.toString();
        } catch (IOException unused) {
            return super.toString();
        }
    }
}
