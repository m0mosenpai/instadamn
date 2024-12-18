package X;

import com.instagram.api.schemas.ClipsACRMidCardSubType;
import java.util.List;

/* renamed from: X.H5l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38771H5l extends C0T6 implements InterfaceC43488JJa {
    public final ClipsACRMidCardSubType A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public C38771H5l(ClipsACRMidCardSubType clipsACRMidCardSubType, String str, String str2, List list) {
        C14360o3.A0B(list, 2);
        this.A00 = clipsACRMidCardSubType;
        this.A03 = list;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // X.InterfaceC43488JJa
    public final C38771H5l F0v(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38771H5l) {
                C38771H5l c38771H5l = (C38771H5l) obj;
                if (this.A00 != c38771H5l.A00 || !C14360o3.A0K(this.A03, c38771H5l.A03) || !C14360o3.A0K(this.A01, c38771H5l.A01) || !C14360o3.A0K(this.A02, c38771H5l.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A03, AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC25227BEk.A07(this.A02);
    }

    @Override // X.InterfaceC43488JJa
    public final InterfaceC43488JJa EAN(C1DY c1dy) {
        return this;
    }
}
