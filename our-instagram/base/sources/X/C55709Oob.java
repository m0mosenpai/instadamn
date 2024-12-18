package X;

import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.Type;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Oob, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55709Oob implements InterfaceC73623Ro {
    public final UserSession A00;
    public final C73633Rp A01;

    private final FeatureData A00(C3SN c3sn, String str) {
        boolean z = c3sn.A02;
        if (z) {
            Object obj = c3sn.A00;
            if (MSX.A1X(obj)) {
                return C55078OaY.A00.A01(str, (List) obj);
            }
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        if (!z) {
            A1C.append("Fail to read all records for feature ");
            A1C.append(str);
            A1C.append(" from signal store, error: ");
            A1C.append(c3sn.A01);
        } else {
            A1C.append("Empty list for calculating average value of ");
            A1C.append(str);
        }
        C55078OaY.A00(null, A1C.toString());
        return new FeatureData(Type.A06, str, null, null, -1.0d, 16372, 0L);
    }

    private final FeatureData A01(C3SN c3sn, String str) {
        boolean z = c3sn.A02;
        if (z) {
            Object obj = c3sn.A00;
            if (MSX.A1X(obj)) {
                C3R9[] c3r9Arr = FeatureData.A0E;
                List list = (List) obj;
                return AbstractC50522MSa.A0O(Type.A09, str, list, list.size());
            }
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        if (!z) {
            A1C.append("Fail to read most recent record for feature ");
            A1C.append(str);
            A1C.append(" from signal store, error: ");
            A1C.append(c3sn.A01);
        } else {
            A1C.append("Empty list for calculating most recent feature ");
            A1C.append(str);
        }
        C55078OaY.A00(null, A1C.toString());
        return new FeatureData(Type.A09, str, null, null, 0.0d, 16376, -1L);
    }

    @Override // X.InterfaceC73623Ro
    public final String getId() {
        return "StoryPrefetch";
    }

    public C55709Oob(UserSession userSession, C73633Rp c73633Rp) {
        AbstractC167017dG.A1P(c73633Rp, userSession);
        this.A01 = c73633Rp;
        this.A00 = userSession;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00c4  */
    @Override // X.InterfaceC73623Ro
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C3SN ATr(com.facebook.odin.model.OdinContext r18) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55709Oob.ATr(com.facebook.odin.model.OdinContext):X.3SN");
    }
}
