package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.4F3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4F3 extends C4F4 {
    public int A00 = 1;
    public long A01;
    public C59062n7 A02;
    public final int A03;
    public final User A04;
    public final String A05;
    public final List A06;
    public final boolean A07;
    public final boolean A08;
    public final InterfaceC50424MOe A09;
    public final List A0A;
    public final List A0B;

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f0, code lost:
    
        if ((!r7.A0B.isEmpty()) != false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4F3(com.instagram.user.model.User r8, java.lang.String r9, java.util.List r10, java.util.List r11, int r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4F3.<init>(com.instagram.user.model.User, java.lang.String, java.util.List, java.util.List, int, boolean):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4F3) {
                C4F3 c4f3 = (C4F3) obj;
                if (!C14360o3.A0K(this.A04, c4f3.A04) || this.A07 != c4f3.A07 || this.A03 != c4f3.A03 || !C14360o3.A0K(this.A0A, c4f3.A0A) || !C14360o3.A0K(this.A0B, c4f3.A0B) || !C14360o3.A0K(this.A05, c4f3.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.A04.hashCode() * 31;
        int i = 1237;
        if (this.A07) {
            i = 1231;
        }
        int hashCode3 = (((((((hashCode2 + i) * 31) + this.A03) * 31) + this.A0A.hashCode()) * 31) + this.A0B.hashCode()) * 31;
        String str = this.A05;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode3 + hashCode;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
