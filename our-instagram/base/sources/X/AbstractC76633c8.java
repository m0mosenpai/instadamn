package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3c8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC76633c8 {
    public static final SpannableStringBuilder A00(Context context, UserSession userSession, C38321qM c38321qM, User user, Integer num, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF, int i, boolean z) {
        C14360o3.A0B(userSession, 0);
        int i2 = 0;
        if (num != null && num.intValue() > 0 && user != null) {
            List A0a = AbstractC001800i.A0a(AbstractC16830sb.A07(c38321qM.A0C.CDj(), user));
            return A01(context, userSession, str, A0a, interfaceC16820sZ, interfaceC16620sF, A0a.size(), i, 2, z, false);
        }
        List A3u = c38321qM.A3u(userSession);
        Integer Aob = c38321qM.A0C.Aob();
        if (Aob != null) {
            i2 = Aob.intValue() + 1;
        }
        if (i2 <= A3u.size()) {
            i2 = A3u.size();
        }
        return A01(context, userSession, str, A3u, interfaceC16820sZ, interfaceC16620sF, i2, i, 1, z, false);
    }

    public static final SpannableStringBuilder A01(Context context, UserSession userSession, String str, List list, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF, int i, int i2, int i3, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(interfaceC16620sF, 9);
        C43753JWp c43753JWp = new C43753JWp(list, interfaceC16820sZ, interfaceC16620sF);
        ArrayList arrayList = new ArrayList(list);
        boolean z3 = false;
        if (new ArrayList(list).size() > i3) {
            z3 = true;
        }
        SpannableStringBuilder A00 = AbstractC100574fM.A00(context, userSession, c43753JWp, str, arrayList, i, i2, z3, z2, z).A00();
        C14360o3.A07(A00);
        return A00;
    }

    public static final void A02(Context context, SpannableStringBuilder spannableStringBuilder, C77143d0 c77143d0, Integer num, boolean z) {
        boolean z2;
        C14360o3.A0B(c77143d0, 4);
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
            case 2:
                if (!z || spannableStringBuilder == null) {
                    return;
                }
                if (1 - intValue != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                C85963sQ.A08(context, spannableStringBuilder, z2);
                return;
            default:
                return;
        }
    }

    public static final void A03(InterfaceC56392iX interfaceC56392iX) {
        View view;
        C14360o3.A0B(interfaceC56392iX, 0);
        if (interfaceC56392iX.CWW() && (view = interfaceC56392iX.getView()) != null) {
            AbstractC56932jR.A04(view, 4);
        }
    }

    public static final boolean A04(Context context, UserSession userSession, C38321qM c38321qM) {
        OriginalSoundDataIntf BZw;
        OriginalSoundDataIntf BZw2;
        OriginalSoundDataIntf BZw3;
        C3x9 clipsMetadata = c38321qM.A0C.getClipsMetadata();
        if (clipsMetadata != null && !AbstractC76643c9.A0H(userSession, c38321qM) && (clipsMetadata.BVc() != null || clipsMetadata.BZw() != null)) {
            C3x9 clipsMetadata2 = c38321qM.A0C.getClipsMetadata();
            String str = null;
            if (clipsMetadata2 != null && (BZw2 = clipsMetadata2.BZw()) != null && BZw2.getOriginalAudioTitle() != null) {
                C3x9 clipsMetadata3 = c38321qM.A0C.getClipsMetadata();
                if (clipsMetadata3 != null && (BZw3 = clipsMetadata3.BZw()) != null) {
                    str = BZw3.getOriginalAudioTitle();
                }
                if (!C14360o3.A0K(str, context.getString(2131955765))) {
                    return true;
                }
            }
            C3x9 clipsMetadata4 = c38321qM.A0C.getClipsMetadata();
            User user = null;
            if (clipsMetadata4 != null && clipsMetadata4.BZw() != null) {
                C3x9 clipsMetadata5 = c38321qM.A0C.getClipsMetadata();
                if (clipsMetadata5 != null && (BZw = clipsMetadata5.BZw()) != null) {
                    user = BZw.BFU();
                }
                if (!C14360o3.A0K(user, c38321qM.A2E(userSession))) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r1 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A06(X.C38321qM r1) {
        /*
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            X.1rF r0 = r1.A0C
            com.instagram.model.venue.LocationDictIntf r0 = r0.BOL()
            if (r0 == 0) goto L19
            java.lang.String r0 = r0.getName()
            if (r0 == 0) goto L19
            boolean r1 = X.AbstractC001900j.A0T(r0)
            r0 = 0
            if (r1 == 0) goto L1a
        L19:
            r0 = 1
        L1a:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC76633c8.A06(X.1qM):boolean");
    }

    public static final boolean A05(UserSession userSession, C38321qM c38321qM) {
        if (C18U.A06(C06090Tz.A06, userSession, 36325630799197409L) && c38321qM.A6Y(userSession)) {
            return true;
        }
        return false;
    }
}
