package X;

import com.instagram.common.session.UserSession;
import kotlin.enums.EnumEntries;

/* renamed from: X.6bS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142096bS extends Enum {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C142096bS[] A01;
    public static final C142096bS A02;

    static {
        C142096bS c142096bS = new C142096bS();
        A02 = c142096bS;
        C142096bS[] c142096bSArr = {c142096bS};
        A01 = c142096bSArr;
        A00 = AbstractC12190kN.A00(c142096bSArr);
    }

    public C142096bS() {
        super("VIEWPOINT", 0);
    }

    public final String A00(UserSession userSession, C59062n7 c59062n7) {
        int i;
        C41181vS c41181vS = (C41181vS) c59062n7.A03;
        String BzL = c41181vS.BzL(userSession);
        if (BzL != null) {
            i = BzL.hashCode();
        } else {
            i = 0;
        }
        return AnonymousClass001.A0R(Integer.toHexString(i), c41181vS.A0j);
    }
}
