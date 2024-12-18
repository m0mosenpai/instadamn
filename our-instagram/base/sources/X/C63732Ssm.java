package X;

import android.text.TextUtils;
import java.security.MessageDigest;

/* renamed from: X.Ssm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63732Ssm implements InterfaceC65617To8 {
    public String A00;
    public java.net.URL A01;
    public int A02;
    public final InterfaceC50509MRm A03;
    public final String A04;
    public final java.net.URL A05;
    public volatile byte[] A06;

    public C63732Ssm(String str) {
        InterfaceC50509MRm interfaceC50509MRm = InterfaceC50509MRm.A00;
        this.A05 = null;
        if (!TextUtils.isEmpty(str)) {
            this.A04 = str;
            Rs8.A00(interfaceC50509MRm);
            this.A03 = interfaceC50509MRm;
            return;
        }
        throw AbstractC166987dD.A12("Must not be null or empty");
    }

    public static String A00(C63732Ssm c63732Ssm) {
        String str = c63732Ssm.A04;
        if (str == null) {
            java.net.URL url = c63732Ssm.A05;
            Rs8.A00(url);
            return url.toString();
        }
        return str;
    }

    @Override // X.InterfaceC65617To8
    public final void FAj(MessageDigest messageDigest) {
        if (this.A06 == null) {
            this.A06 = A00(this).getBytes(InterfaceC65617To8.A00);
        }
        messageDigest.update(this.A06);
    }

    @Override // X.InterfaceC65617To8
    public final boolean equals(Object obj) {
        if (!(obj instanceof C63732Ssm)) {
            return false;
        }
        C63732Ssm c63732Ssm = (C63732Ssm) obj;
        if (!A00(this).equals(A00(c63732Ssm))) {
            return false;
        }
        return AbstractC58320PtC.A1X(this.A03, c63732Ssm.A03);
    }

    @Override // X.InterfaceC65617To8
    public final int hashCode() {
        int i = this.A02;
        if (i == 0) {
            int hashCode = A00(this).hashCode();
            this.A02 = hashCode;
            int A0I = AbstractC166987dD.A0I(this.A03, hashCode * 31);
            this.A02 = A0I;
            return A0I;
        }
        return i;
    }

    public final String toString() {
        return A00(this);
    }

    public C63732Ssm(java.net.URL url) {
        InterfaceC50509MRm interfaceC50509MRm = InterfaceC50509MRm.A00;
        Rs8.A00(url);
        this.A05 = url;
        this.A04 = null;
        Rs8.A00(interfaceC50509MRm);
        this.A03 = interfaceC50509MRm;
    }
}
