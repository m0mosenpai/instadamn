package X;

import java.security.MessageDigest;
import java.util.Map;

/* renamed from: X.Ssi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63728Ssi implements InterfaceC65617To8 {
    public int A00;
    public final int A01;
    public final int A02;
    public final InterfaceC65617To8 A03;
    public final C63729Ssj A04;
    public final Class A05;
    public final Class A06;
    public final Object A07;
    public final Map A08;

    @Override // X.InterfaceC65617To8
    public final boolean equals(Object obj) {
        if (!(obj instanceof C63728Ssi)) {
            return false;
        }
        C63728Ssi c63728Ssi = (C63728Ssi) obj;
        if (!this.A07.equals(c63728Ssi.A07) || !this.A03.equals(c63728Ssi.A03) || this.A01 != c63728Ssi.A01 || this.A02 != c63728Ssi.A02 || !this.A08.equals(c63728Ssi.A08) || !this.A05.equals(c63728Ssi.A05) || !this.A06.equals(c63728Ssi.A06)) {
            return false;
        }
        return AbstractC58320PtC.A1X(this.A04, c63728Ssi.A04);
    }

    @Override // X.InterfaceC65617To8
    public final int hashCode() {
        int i = this.A00;
        if (i == 0) {
            int hashCode = this.A07.hashCode();
            this.A00 = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.A03.hashCode()) * 31) + this.A02) * 31) + this.A01;
            this.A00 = hashCode2;
            int hashCode3 = (hashCode2 * 31) + this.A08.hashCode();
            this.A00 = hashCode3;
            int A0I = AbstractC166987dD.A0I(this.A05, hashCode3 * 31);
            this.A00 = A0I;
            int A0I2 = AbstractC166987dD.A0I(this.A06, A0I * 31);
            this.A00 = A0I2;
            int A0I3 = AbstractC166987dD.A0I(this.A04, A0I2 * 31);
            this.A00 = A0I3;
            return A0I3;
        }
        return i;
    }

    public C63728Ssi(InterfaceC65617To8 interfaceC65617To8, C63729Ssj c63729Ssj, Class cls, Class cls2, Object obj, Map map, int i, int i2) {
        Rs8.A00(obj);
        this.A07 = obj;
        if (interfaceC65617To8 != null) {
            this.A03 = interfaceC65617To8;
            this.A02 = i;
            this.A01 = i2;
            Rs8.A00(map);
            this.A08 = map;
            if (cls != null) {
                this.A05 = cls;
                if (cls2 != null) {
                    this.A06 = cls2;
                    Rs8.A00(c63729Ssj);
                    this.A04 = c63729Ssj;
                    return;
                }
                throw AbstractC166987dD.A15("Transcode class must not be null");
            }
            throw AbstractC166987dD.A15("Resource class must not be null");
        }
        throw AbstractC166987dD.A15("Signature must not be null");
    }

    @Override // X.InterfaceC65617To8
    public final void FAj(MessageDigest messageDigest) {
        throw AbstractC43592JPx.A11();
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("EngineKey{model=");
        A1C.append(this.A07);
        A1C.append(", width=");
        A1C.append(this.A02);
        A1C.append(", height=");
        A1C.append(this.A01);
        A1C.append(", resourceClass=");
        A1C.append(this.A05);
        A1C.append(", transcodeClass=");
        A1C.append(this.A06);
        A1C.append(", signature=");
        A1C.append(this.A03);
        A1C.append(", hashCode=");
        A1C.append(this.A00);
        A1C.append(", transformations=");
        A1C.append(this.A08);
        A1C.append(", options=");
        return AbstractC58320PtC.A11(this.A04, A1C);
    }
}
