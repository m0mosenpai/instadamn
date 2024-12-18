package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Kms, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46797Kms {
    /* JADX WARN: Multi-variable type inference failed */
    public static final KTH A00(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, Map map) {
        C38321qM c38321qM;
        AbstractC46452KhC kv4;
        boolean z;
        C09530e4 A00;
        int A0A;
        C14360o3.A0B(map, 5);
        C17050sx A01 = AbstractC09440dt.A01(C7SV.A00);
        C83403nh c83403nh = c160787Im.A0e;
        C7QL A04 = C7QK.A04(userSession, anonymousClass988, c160787Im, c7im, c83403nh.A10, A01);
        C1582378i c1582378i = new C1582378i(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 3);
        Object obj = c83403nh.A1T;
        C47376KwR c47376KwR = null;
        if (C206409Bx.A00(obj, 8)) {
            c38321qM = (C38321qM) ((C206409Bx) obj).A00;
            kv4 = KV5.A00;
            String id = c38321qM.getId();
            if (id != null) {
                map.put(id, c38321qM);
                A00 = AbstractC166987dD.A1L("H,0.640625:1", null);
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else if (obj instanceof C1575375n) {
            C1575375n c1575375n = (C1575375n) obj;
            c38321qM = c1575375n.A01;
            kv4 = new KV4(c38321qM.A0C.getClipsMetadata(), c1575375n.A02);
            String str = c1575375n.A03;
            if (str != null) {
                c47376KwR = new C47376KwR(C148336m3.A04.A04(str));
                z = true;
            } else {
                z = false;
            }
            A00 = C76A.A00(context, anonymousClass988, z);
        } else {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Content Invalid - type:");
            A1C.append(c83403nh.A10);
            throw AbstractC43594JPz.A0o(obj, " content:", A1C);
        }
        String str2 = (String) A00.A00;
        Number number = (Number) A00.A01;
        C7QY A012 = c1582378i.A01(context, userSession, A04, anonymousClass988, c160787Im);
        C51761Mtk c51761Mtk = new C51761Mtk(c38321qM, c83403nh.A0V());
        String id2 = c38321qM.getId();
        if (id2 != null) {
            if (number != null) {
                A0A = number.intValue();
            } else {
                A0A = (int) (AbstractC13880nE.A0A(context) / 2.5f);
            }
            return new KTH(c51761Mtk, A012, c47376KwR, kv4, id2, str2, A0A);
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
