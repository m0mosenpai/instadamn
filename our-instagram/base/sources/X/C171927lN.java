package X;

import com.instagram.api.schemas.AudienceGroup;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7lN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C171927lN {
    public List A00;
    public final UserSession A01;

    public C171927lN(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final List A00() {
        C3PO c3po;
        List<AudienceGroup> list = this.A00;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            for (AudienceGroup audienceGroup : list) {
                switch (audienceGroup.ordinal()) {
                    case 1:
                        c3po = C3PO.A04;
                        break;
                    case 2:
                        c3po = C3PO.A05;
                        break;
                    case 3:
                        c3po = C3PO.A06;
                        break;
                    case 4:
                        c3po = C3PO.A07;
                        break;
                    case 5:
                        c3po = C3PO.A08;
                        break;
                    case 6:
                        c3po = C3PO.A09;
                        break;
                    case 7:
                        c3po = C3PO.A0A;
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unknown audience group ");
                        sb.append(audienceGroup);
                        throw new UnsupportedOperationException(sb.toString());
                }
                arrayList.add(c3po);
            }
            return arrayList;
        }
        List singletonList = Collections.singletonList(C3PO.A08);
        C14360o3.A07(singletonList);
        return singletonList;
    }
}
