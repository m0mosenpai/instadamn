package X;

import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.7d8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166947d8 extends C0T6 implements InterfaceC166427cB {
    public final User A00;
    public final EnumC65855TvH A01;
    public final VG2 A02;
    public final MRA A03;
    public final InterfaceC37213GaO A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final JSONObject A09;
    public final boolean A0A;
    public final boolean A0B;

    public C166947d8(User user, EnumC65855TvH enumC65855TvH, VG2 vg2, MRA mra, InterfaceC37213GaO interfaceC37213GaO, String str, String str2, String str3, String str4, JSONObject jSONObject, boolean z, boolean z2) {
        C14360o3.A0B(str4, 6);
        this.A01 = enumC65855TvH;
        this.A02 = vg2;
        this.A06 = str;
        this.A05 = str2;
        this.A07 = str3;
        this.A08 = str4;
        this.A00 = user;
        this.A03 = mra;
        this.A04 = interfaceC37213GaO;
        this.A0A = z;
        this.A09 = jSONObject;
        this.A0B = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166947d8) {
                C166947d8 c166947d8 = (C166947d8) obj;
                if (this.A01 != c166947d8.A01 || this.A02 != c166947d8.A02 || !C14360o3.A0K(this.A06, c166947d8.A06) || !C14360o3.A0K(this.A05, c166947d8.A05) || !C14360o3.A0K(this.A07, c166947d8.A07) || !C14360o3.A0K(this.A08, c166947d8.A08) || !C14360o3.A0K(this.A00, c166947d8.A00) || !C14360o3.A0K(this.A03, c166947d8.A03) || !C14360o3.A0K(this.A04, c166947d8.A04) || this.A0A != c166947d8.A0A || !C14360o3.A0K(this.A09, c166947d8.A09) || this.A0B != c166947d8.A0B) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A06.hashCode()) * 31) + this.A05.hashCode()) * 31;
        String str = this.A07;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((((((((hashCode2 + hashCode) * 31) + this.A08.hashCode()) * 31) + this.A00.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A04.hashCode()) * 31;
        int i = 1237;
        if (this.A0A) {
            i = 1231;
        }
        int hashCode4 = (((hashCode3 + i) * 31) + this.A09.hashCode()) * 31;
        int i2 = 1237;
        if (this.A0B) {
            i2 = 1231;
        }
        return hashCode4 + i2;
    }
}
