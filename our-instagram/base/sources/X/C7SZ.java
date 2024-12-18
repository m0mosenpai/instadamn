package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.List;

/* renamed from: X.7SZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7SZ extends AbstractC129515tG implements InterfaceC129555tK {
    public final int A00;
    public final C158747Ak A01;
    public final DirectMessageIdentifier A02;
    public final String A03;
    public final List A04;
    public final InterfaceC09390do A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final int A09;
    public final C7QX A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7SZ) {
                C7SZ c7sz = (C7SZ) obj;
                if (!C14360o3.A0K(this.A02, c7sz.A02) || !C14360o3.A0K(this.A04, c7sz.A04) || !C14360o3.A0K(this.A03, c7sz.A03) || this.A09 != c7sz.A09 || !C14360o3.A0K(this.A01, c7sz.A01) || this.A08 != c7sz.A08 || this.A07 != c7sz.A07 || this.A00 != c7sz.A00 || this.A06 != c7sz.A06 || !C14360o3.A0K(this.A0A, c7sz.A0A) || !C14360o3.A0K(this.A05, c7sz.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C7SZ(X.C158747Ak r2, X.C7QX r3, com.instagram.model.direct.messageid.DirectMessageIdentifier r4, java.lang.String r5, java.util.List r6, X.InterfaceC09390do r7, int r8, int r9, boolean r10, boolean r11, boolean r12) {
        /*
            r1 = this;
            if (r3 == 0) goto L1f
            r0 = r3
        L3:
            X.5tH r0 = (X.InterfaceC129525tH) r0
            r1.<init>(r0)
            r1.A02 = r4
            r1.A04 = r6
            r1.A03 = r5
            r1.A09 = r8
            r1.A01 = r2
            r1.A08 = r10
            r1.A07 = r11
            r1.A00 = r9
            r1.A06 = r12
            r1.A0A = r3
            r1.A05 = r7
            return
        L1f:
            r0 = 0
            java.lang.Object r0 = r6.get(r0)
            goto L3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7SZ.<init>(X.7Ak, X.7QX, com.instagram.model.direct.messageid.DirectMessageIdentifier, java.lang.String, java.util.List, X.0do, int, int, boolean, boolean, boolean):void");
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((this.A02.hashCode() * 31) + this.A04.hashCode()) * 31;
        String str = this.A03;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (((hashCode3 + hashCode) * 31) + this.A09) * 31;
        C158747Ak c158747Ak = this.A01;
        if (c158747Ak == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c158747Ak.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        int i4 = 1237;
        if (this.A08) {
            i4 = 1231;
        }
        int A00 = (((i3 + i4) * 31) + AbstractC53644Nnp.A00()) * 31;
        int i5 = 1237;
        if (this.A07) {
            i5 = 1231;
        }
        int i6 = (((A00 + i5) * 31) + this.A00) * 31;
        int i7 = 1237;
        if (this.A06) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        C7QX c7qx = this.A0A;
        if (c7qx != null) {
            i = c7qx.hashCode();
        }
        return ((i8 + i) * 31) + this.A05.hashCode();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
