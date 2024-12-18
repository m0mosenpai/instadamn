package X;

import android.text.TextUtils;

/* renamed from: X.43R, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C43R extends C0T6 {
    public final int A00;
    public final TextUtils.TruncateAt A01;
    public final EnumC77673dr A02;
    public final C51722Yv A03;
    public final CharSequence A04;
    public final InterfaceC16820sZ A05;
    public final InterfaceC16820sZ A06;
    public final InterfaceC16660sJ A07;
    public final InterfaceC16620sF A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C43R) {
                C43R c43r = (C43R) obj;
                if (!C14360o3.A0K(this.A04, c43r.A04) || this.A00 != c43r.A00 || this.A01 != c43r.A01 || !C14360o3.A0K(this.A07, c43r.A07) || !C14360o3.A0K(this.A06, c43r.A06) || !C14360o3.A0K(this.A05, c43r.A05) || !C14360o3.A0K(this.A08, c43r.A08) || this.A02 != c43r.A02 || !C14360o3.A0K(this.A03, c43r.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((this.A04.hashCode() * 31) + this.A00) * 31) + this.A01.hashCode()) * 31;
        InterfaceC16660sJ interfaceC16660sJ = this.A07;
        int hashCode2 = (hashCode + (interfaceC16660sJ == null ? 0 : interfaceC16660sJ.hashCode())) * 31;
        InterfaceC16820sZ interfaceC16820sZ = this.A06;
        int hashCode3 = (hashCode2 + (interfaceC16820sZ == null ? 0 : interfaceC16820sZ.hashCode())) * 31;
        InterfaceC16820sZ interfaceC16820sZ2 = this.A05;
        int hashCode4 = (hashCode3 + (interfaceC16820sZ2 == null ? 0 : interfaceC16820sZ2.hashCode())) * 31;
        InterfaceC16620sF interfaceC16620sF = this.A08;
        int hashCode5 = (hashCode4 + (interfaceC16620sF == null ? 0 : interfaceC16620sF.hashCode())) * 31;
        EnumC77673dr enumC77673dr = this.A02;
        return ((hashCode5 + (enumC77673dr != null ? enumC77673dr.hashCode() : 0)) * 31) + this.A03.hashCode();
    }

    public C43R(TextUtils.TruncateAt truncateAt, EnumC77673dr enumC77673dr, C51722Yv c51722Yv, CharSequence charSequence, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF, int i) {
        this.A04 = charSequence;
        this.A00 = i;
        this.A01 = truncateAt;
        this.A07 = interfaceC16660sJ;
        this.A06 = interfaceC16820sZ;
        this.A05 = interfaceC16820sZ2;
        this.A08 = interfaceC16620sF;
        this.A02 = enumC77673dr;
        this.A03 = c51722Yv;
    }
}
