package X;

import com.instagram.api.schemas.ThreadContainerType;
import com.instagram.api.schemas.ThreadHeaderStyle;
import java.util.List;

/* renamed from: X.Jwg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45051Jwg extends C0T6 {
    public final ThreadContainerType A00;
    public final ThreadHeaderStyle A01;
    public final C38615GyI A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public C45051Jwg(ThreadContainerType threadContainerType, ThreadHeaderStyle threadHeaderStyle, C38615GyI c38615GyI, String str, String str2, List list) {
        AbstractC25233BEq.A0x(1, str, list, threadContainerType);
        this.A04 = str;
        this.A03 = str2;
        this.A01 = threadHeaderStyle;
        this.A05 = list;
        this.A00 = threadContainerType;
        this.A02 = c38615GyI;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45051Jwg) {
                C45051Jwg c45051Jwg = (C45051Jwg) obj;
                if (!C14360o3.A0K(this.A04, c45051Jwg.A04) || !C14360o3.A0K(this.A03, c45051Jwg.A03) || this.A01 != c45051Jwg.A01 || !C14360o3.A0K(this.A05, c45051Jwg.A05) || this.A00 != c45051Jwg.A00 || !C14360o3.A0K(this.A02, c45051Jwg.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A05, (((AbstractC166987dD.A0J(this.A04) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31)) + AbstractC166997dE.A0I(this.A02);
    }
}
