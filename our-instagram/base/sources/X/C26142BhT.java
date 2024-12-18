package X;

import com.instagram.api.schemas.MidCardReelsChainCtaType;
import java.util.List;

/* renamed from: X.BhT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26142BhT extends C0T6 implements InterfaceC31124Dm7 {
    public final MidCardReelsChainCtaType A00;
    public final String A01;
    public final String A02;
    public final List A03;

    @Override // X.InterfaceC31124Dm7
    public final C26142BhT Exe() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26142BhT) {
                C26142BhT c26142BhT = (C26142BhT) obj;
                if (!C14360o3.A0K(this.A01, c26142BhT.A01) || !C14360o3.A0K(this.A02, c26142BhT.A02) || !C14360o3.A0K(this.A03, c26142BhT.A03) || this.A00 != c26142BhT.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C26142BhT(MidCardReelsChainCtaType midCardReelsChainCtaType, String str, String str2, List list) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = list;
        this.A00 = midCardReelsChainCtaType;
    }

    @Override // X.InterfaceC31124Dm7
    public final String Amn() {
        return this.A01;
    }

    @Override // X.InterfaceC31124Dm7
    public final String Amo() {
        return this.A02;
    }

    @Override // X.InterfaceC31124Dm7
    public final List BgU() {
        return this.A03;
    }
}
