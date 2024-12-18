package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: X.4hV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC101604hV {
    public static C101594hU A00(final UserSession userSession, final C38321qM c38321qM) {
        float f;
        boolean z;
        C75363a3 A03;
        if (c38321qM == null) {
            return null;
        }
        String A0F = AbstractC41071vF.A0F(userSession, c38321qM);
        Long AcZ = c38321qM.A0C.AcZ();
        if (c38321qM.getId() != null) {
            f = c38321qM.A0m();
        } else {
            f = 1.0f;
        }
        Integer A2L = c38321qM.A2L();
        CreativeConfigIntf Asm = c38321qM.A0C.Asm();
        String A00 = AbstractC86623ta.A00(c38321qM.A2P());
        long A18 = c38321qM.A18();
        boolean A4g = c38321qM.A4g();
        boolean A4x = c38321qM.A4x();
        boolean A59 = c38321qM.A59();
        Boolean BCq = c38321qM.A0C.BCq();
        if (BCq != null) {
            z = BCq.booleanValue();
        } else {
            z = false;
        }
        String id = c38321qM.getId();
        if (c38321qM.getId() != null) {
            A03 = c38321qM.CFR();
        } else {
            A03 = A03(c38321qM.A0M);
        }
        ImageInfo A1t = c38321qM.A1t();
        String BHD = c38321qM.A0C.BHD();
        boolean A5M = c38321qM.A5M();
        boolean A5V = c38321qM.A5V();
        boolean A5x = c38321qM.A5x();
        boolean Cff = c38321qM.Cff();
        String str = c38321qM.A0M;
        EnumC40111tc BRp = c38321qM.BRp();
        Long CDR = c38321qM.A0C.CDR();
        MusicOverlayStickerModel A032 = AbstractC101614hW.A03(null, c38321qM, null);
        String organicTrackingToken = c38321qM.A0C.getOrganicTrackingToken();
        Long Bdu = c38321qM.A0C.Bdu();
        ArrayList A3N = c38321qM.A3N();
        SimpleImageUrl A1T = c38321qM.A1T();
        InterfaceC216113n interfaceC216113n = new InterfaceC216113n() { // from class: X.4hX
            @Override // X.InterfaceC216113n
            public final Object get() {
                User A2E = c38321qM.A2E(userSession);
                if (A2E != null) {
                    return A2E.getId();
                }
                return null;
            }
        };
        boolean CW9 = c38321qM.CW9();
        return new C101594hU(interfaceC216113n, A1T, new C101634hY(c38321qM.getId(), c38321qM.A33(), CW9, c38321qM.CdW(), c38321qM.CZq()), Asm, A1t, BRp, A032, A03, A2L, AcZ, CDR, Bdu, A0F, A00, id, BHD, str, organicTrackingToken, A3N, f, A18, A4g, A4x, A59, z, A5M, A5V, A5x, Cff);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        if (r53.A1W() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        if (r0.A0O == false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C45093JxN A01(android.content.Context r51, com.instagram.common.session.UserSession r52, X.C83403nh r53, X.C101584hT r54, com.instagram.user.model.User r55) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC101604hV.A01(android.content.Context, com.instagram.common.session.UserSession, X.3nh, X.4hT, com.instagram.user.model.User):X.JxN");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0123, code lost:
    
        if (new java.io.File(r5).exists() == false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C45093JxN A02(android.content.Context r47, com.instagram.common.session.UserSession r48, X.C83403nh r49, com.instagram.user.model.User r50, java.lang.Long r51) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC101604hV.A02(android.content.Context, com.instagram.common.session.UserSession, X.3nh, com.instagram.user.model.User, java.lang.Long):X.JxN");
    }

    public static C75363a3 A03(String str) {
        C101644hZ c101644hZ = new C101644hZ(C05F.A1F, UUID.randomUUID().toString());
        c101644hZ.A0B = str;
        boolean z = true;
        c101644hZ.A0G = true;
        c101644hZ.A02 = -1L;
        if (str == null || str.isEmpty()) {
            z = false;
        }
        c101644hZ.A0I = z;
        return c101644hZ.A00();
    }

    public static ArrayList A04(Context context, UserSession userSession, C2EC c2ec, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C83403nh c83403nh = (C83403nh) it.next();
            arrayList.add(A02(context, userSession, c83403nh, C4GQ.A04(userSession, c83403nh, c2ec), C4GQ.A06(c2ec)));
        }
        return arrayList;
    }
}
