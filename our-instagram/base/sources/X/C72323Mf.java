package X;

import com.instagram.model.fbusertag.FBUserTag;

/* renamed from: X.3Mf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72323Mf extends C0T6 implements InterfaceC41141vN {
    public final C38321qM A00;
    public final FBUserTag A01;
    public final C1P1 A02;
    public final String A03;
    public final String A04;

    public C72323Mf(C1P1 c1p1, C38321qM c38321qM, FBUserTag fBUserTag, String str, String str2) {
        C14360o3.A0B(fBUserTag, 4);
        this.A00 = c38321qM;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = fBUserTag;
        this.A02 = c1p1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C72323Mf) {
                C72323Mf c72323Mf = (C72323Mf) obj;
                if (!C14360o3.A0K(this.A00, c72323Mf.A00) || !C14360o3.A0K(this.A03, c72323Mf.A03) || !C14360o3.A0K(this.A04, c72323Mf.A04) || !C14360o3.A0K(this.A01, c72323Mf.A01) || !C14360o3.A0K(this.A02, c72323Mf.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((this.A00.hashCode() * 31) + this.A03.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode();
    }
}
