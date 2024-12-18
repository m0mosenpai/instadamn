package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.83V, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C83V implements C83W {
    public C83X A00;
    public final C25671My A01;

    public C83V(UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A01 = AbstractC25651Mw.A00(userSession);
        this.A00 = C83X.NotDetermined;
    }

    @Override // X.C83W
    public final void EhG(C83X c83x, List list, List list2, List list3) {
        C14360o3.A0B(c83x, 0);
        if (this.A00 != c83x) {
            this.A00 = c83x;
            int ordinal = c83x.ordinal();
            if (ordinal != 1) {
                switch (ordinal) {
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                        El1(A00(c83x, false));
                        return;
                    case 4:
                    default:
                        return;
                    case 7:
                        if (list == null || list2 == null || list3 == null) {
                            return;
                        }
                        boolean z = true;
                        if (list.size() <= 1) {
                            z = false;
                        }
                        this.A01.E4s(new C191228dL(C05F.A0C, A00(c83x, z), null, list, list2, list3, 3000L));
                        return;
                }
            }
            CMb();
        }
    }

    @Override // X.C83W
    public final void El0(String str) {
        C14360o3.A0B(str, 0);
        this.A01.E4s(new C191228dL(C05F.A01, null, str, null, null, null, 3000L));
    }

    @Override // X.C83W
    public final void El1(String str) {
        C14360o3.A0B(str, 0);
        this.A01.E4s(new C191228dL(C05F.A00, str, null, null, null, null, 3000L));
    }

    @Override // X.C83W
    public final void CMb() {
        this.A01.E4s(new C191228dL(C05F.A0N, null, null, null, null, null, -1L));
    }

    public static final String A00(C83X c83x, boolean z) {
        switch (c83x.ordinal()) {
            case 2:
                return "Find a face";
            case 3:
                return "Hold up a hand";
            case 4:
                return "Find a person";
            case 5:
                return "Find a friend";
            case 6:
                return "Stand in view";
            case 7:
                if (z) {
                    return "Find an image";
                }
                return "Find the image";
            case 8:
                return "Switch to back camera";
            default:
                return "";
        }
    }
}
