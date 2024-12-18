package X;

import com.instagram.direct.msys.subtype.MsysThreadSubtype;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.9ZG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9ZG extends C0T6 {
    public final int A00;
    public final MsysThreadSubtype A01;
    public final MsysThreadId A02;
    public final Long A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9ZG) {
                C9ZG c9zg = (C9ZG) obj;
                if (!C14360o3.A0K(this.A02, c9zg.A02) || this.A05 != c9zg.A05 || !C14360o3.A0K(this.A03, c9zg.A03) || !C14360o3.A0K(this.A01, c9zg.A01) || !C14360o3.A0K(this.A04, c9zg.A04) || this.A00 != c9zg.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0J = AbstractC166997dE.A0J(this.A01, (AbstractC167007dF.A0D(this.A05, AbstractC166987dD.A0G(this.A02)) + AbstractC167017dG.A0M(this.A03)) * 31);
        String str = this.A04;
        if (str != null) {
            i = str.hashCode();
        }
        return ((A0J + i) * 31) + this.A00;
    }

    public C9ZG(MsysThreadSubtype msysThreadSubtype, MsysThreadId msysThreadId, Long l, String str, int i, boolean z) {
        this.A02 = msysThreadId;
        this.A05 = z;
        this.A03 = l;
        this.A01 = msysThreadSubtype;
        this.A04 = str;
        this.A00 = i;
    }
}
