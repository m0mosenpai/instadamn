package X;

import com.instagram.api.schemas.AFI_TYPE;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.GyO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38621GyO extends C0T6 {
    public final AFI_TYPE A00;
    public final InterfaceC106354qp A01;
    public final String A02;
    public final HashMap A03;
    public final List A04;

    public C38621GyO(AFI_TYPE afi_type, InterfaceC106354qp interfaceC106354qp, String str, HashMap hashMap, List list) {
        AbstractC167027dH.A0a(1, str, afi_type, hashMap, list);
        C14360o3.A0B(interfaceC106354qp, 5);
        this.A02 = str;
        this.A00 = afi_type;
        this.A03 = hashMap;
        this.A04 = list;
        this.A01 = interfaceC106354qp;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38621GyO) {
                C38621GyO c38621GyO = (C38621GyO) obj;
                if (!C14360o3.A0K(this.A02, c38621GyO.A02) || this.A00 != c38621GyO.A00 || !C14360o3.A0K(this.A03, c38621GyO.A03) || !C14360o3.A0K(this.A04, c38621GyO.A04) || !C14360o3.A0K(this.A01, c38621GyO.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A02)))));
    }
}
