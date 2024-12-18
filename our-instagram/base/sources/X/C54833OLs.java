package X;

import java.lang.ref.WeakReference;

/* renamed from: X.OLs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54833OLs {
    public final android.net.Uri A00;
    public final AbstractC53609NnG A01;
    public final EnumC58332PtQ A02;
    public final String A03;
    public final WeakReference A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54833OLs) {
                C54833OLs c54833OLs = (C54833OLs) obj;
                if (!C14360o3.A0K(this.A04, c54833OLs.A04) || !C14360o3.A0K(this.A01, c54833OLs.A01) || !C14360o3.A0K(this.A00, c54833OLs.A00) || this.A02 != c54833OLs.A02 || !C14360o3.A0K(this.A03, c54833OLs.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A04))) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC25227BEk.A07(this.A03)) * 31) + 1231;
    }

    public C54833OLs(android.net.Uri uri, AbstractC53609NnG abstractC53609NnG, EnumC58332PtQ enumC58332PtQ, String str, WeakReference weakReference) {
        this.A04 = weakReference;
        this.A01 = abstractC53609NnG;
        this.A00 = uri;
        this.A02 = enumC58332PtQ;
        this.A03 = str;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FileReceivingParams(context=");
        A1C.append(this.A04);
        A1C.append(", scope=");
        A1C.append(this.A01);
        A1C.append(", uri=");
        A1C.append(this.A00);
        A1C.append(", forcedDestination=");
        A1C.append(this.A02);
        A1C.append(", inboundPrefix=");
        A1C.append(this.A03);
        A1C.append(", preferCacheIfInternal=");
        return AbstractC25236BEt.A0a(A1C, true);
    }
}
