package X;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: X.Ssl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63731Ssl implements InterfaceC65617To8 {
    public static final C62750SPb A08 = new C62750SPb(50);
    public final Class A00;
    public final int A01;
    public final int A02;
    public final InterfaceC65617To8 A03;
    public final InterfaceC65617To8 A04;
    public final C63729Ssj A05;
    public final InterfaceC65632Tpt A06;
    public final C63361SiK A07;

    @Override // X.InterfaceC65617To8
    public final void FAj(MessageDigest messageDigest) {
        Object A01;
        C63361SiK c63361SiK = this.A07;
        synchronized (c63361SiK) {
            A01 = C63361SiK.A01(c63361SiK.A03.A00(byte[].class, 8), c63361SiK, byte[].class);
        }
        byte[] bArr = (byte[]) A01;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putInt(this.A02);
        wrap.putInt(this.A01);
        wrap.array();
        this.A03.FAj(messageDigest);
        this.A04.FAj(messageDigest);
        messageDigest.update(bArr);
        InterfaceC65632Tpt interfaceC65632Tpt = this.A06;
        if (interfaceC65632Tpt != null) {
            interfaceC65632Tpt.FAj(messageDigest);
        }
        this.A05.FAj(messageDigest);
        C62750SPb c62750SPb = A08;
        Class cls = this.A00;
        byte[] bArr2 = (byte[]) c62750SPb.A00(cls);
        if (bArr2 == null) {
            bArr2 = cls.getName().getBytes(InterfaceC65617To8.A00);
            c62750SPb.A03(cls, bArr2);
        }
        messageDigest.update(bArr2);
        c63361SiK.A05(bArr);
    }

    @Override // X.InterfaceC65617To8
    public final boolean equals(Object obj) {
        boolean equals;
        if (!(obj instanceof C63731Ssl)) {
            return false;
        }
        C63731Ssl c63731Ssl = (C63731Ssl) obj;
        if (this.A01 != c63731Ssl.A01 || this.A02 != c63731Ssl.A02) {
            return false;
        }
        InterfaceC65632Tpt interfaceC65632Tpt = this.A06;
        InterfaceC65632Tpt interfaceC65632Tpt2 = c63731Ssl.A06;
        if (interfaceC65632Tpt == null) {
            equals = AbstractC25229BEm.A1Z(interfaceC65632Tpt2);
        } else {
            equals = interfaceC65632Tpt.equals(interfaceC65632Tpt2);
        }
        if (!equals || !this.A00.equals(c63731Ssl.A00) || !this.A04.equals(c63731Ssl.A04) || !this.A03.equals(c63731Ssl.A03)) {
            return false;
        }
        return AbstractC58320PtC.A1X(this.A05, c63731Ssl.A05);
    }

    @Override // X.InterfaceC65617To8
    public final int hashCode() {
        int hashCode = (((((this.A04.hashCode() * 31) + this.A03.hashCode()) * 31) + this.A02) * 31) + this.A01;
        InterfaceC65632Tpt interfaceC65632Tpt = this.A06;
        if (interfaceC65632Tpt != null) {
            hashCode = AbstractC166987dD.A0I(interfaceC65632Tpt, hashCode * 31);
        }
        return AbstractC166987dD.A0I(this.A05, AbstractC166997dE.A0J(this.A00, hashCode * 31));
    }

    public C63731Ssl(InterfaceC65617To8 interfaceC65617To8, InterfaceC65617To8 interfaceC65617To82, C63729Ssj c63729Ssj, InterfaceC65632Tpt interfaceC65632Tpt, C63361SiK c63361SiK, Class cls, int i, int i2) {
        this.A07 = c63361SiK;
        this.A04 = interfaceC65617To8;
        this.A03 = interfaceC65617To82;
        this.A02 = i;
        this.A01 = i2;
        this.A06 = interfaceC65632Tpt;
        this.A00 = cls;
        this.A05 = c63729Ssj;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ResourceCacheKey{sourceKey=");
        A1C.append(this.A04);
        A1C.append(", signature=");
        A1C.append(this.A03);
        A1C.append(", width=");
        A1C.append(this.A02);
        A1C.append(", height=");
        A1C.append(this.A01);
        A1C.append(", decodedResourceClass=");
        A1C.append(this.A00);
        A1C.append(", transformation='");
        A1C.append(this.A06);
        A1C.append('\'');
        A1C.append(", options=");
        return AbstractC58320PtC.A11(this.A05, A1C);
    }
}
