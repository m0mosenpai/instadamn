package X;

import android.content.Context;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.Collections;

/* loaded from: classes8.dex */
public abstract class LLY {
    public static final C7Q4 A01(Context context, UserSession userSession, EnumC159397Cz enumC159397Cz, DirectThreadKey directThreadKey, ClipInfo clipInfo, C47Z c47z, ShareType shareType, C40121td c40121td, Integer num, String str, String str2, String str3) {
        C14360o3.A0B(context, 0);
        JQ0.A1O(userSession, directThreadKey, enumC159397Cz, clipInfo, str);
        C14360o3.A0B(c40121td, 7);
        boolean A01 = enumC159397Cz.A01();
        C47Z A07 = A07(userSession, clipInfo, c47z, shareType, num, str, null, str2, A01);
        if (A0A(str3) && C18U.A06(C06090Tz.A05, userSession, 36330724629955577L)) {
            A07.A0i = C22P.A5E;
        }
        c40121td.A0D(A07);
        if (A01) {
            c40121td.A09(A07);
        } else {
            C25A.A00(userSession).A0B(AbstractC166987dD.A0O(context));
            LCW.A00(userSession, directThreadKey, A07, c40121td);
        }
        return AbstractC47064KrL.A00(A07);
    }

    public static final C7Q4 A02(Context context, UserSession userSession, EnumC159397Cz enumC159397Cz, DirectThreadKey directThreadKey, C47Z c47z, ShareType shareType, C40121td c40121td, C183978Ee c183978Ee, Integer num, String str, String str2) {
        C47Z c47z2;
        C14360o3.A0B(context, 0);
        AbstractC167027dH.A0a(1, userSession, directThreadKey, enumC159397Cz, c183978Ee);
        C14360o3.A0B(c40121td, 6);
        C47Z A0h = AbstractC43593JPy.A0h(userSession, C7FC.A00(userSession).BcF(AbstractC46923Kp4.A00(c183978Ee)));
        if (A0h == null) {
            c47z2 = A08(c47z, shareType, c183978Ee, num, null, str, enumC159397Cz.A01());
        } else {
            c47z2 = A0h;
        }
        c47z2.A5h = false;
        if (A0A(str2) && C18U.A06(C06090Tz.A05, userSession, 36330724629955577L)) {
            c47z2.A0i = C22P.A5E;
        }
        if (A0h != null) {
            PendingMediaStore A00 = C25A.A00(userSession);
            String str3 = A0h.A35;
            if (str3 != null) {
                A00.A07.remove(str3);
            }
        }
        A09(userSession, directThreadKey, c47z2, c183978Ee);
        c40121td.A0C(c47z2);
        if (enumC159397Cz.A01()) {
            c40121td.A09(c47z2);
        } else {
            LCW.A00(userSession, directThreadKey, c47z2, c40121td);
        }
        return AbstractC47064KrL.A00(c47z2);
    }

    public static final C7Q4 A03(UserSession userSession, DirectThreadKey directThreadKey, C47Z c47z, C40121td c40121td) {
        AbstractC167007dF.A1E(userSession, 1, c40121td);
        c47z.A0c(ShareType.A0E);
        c47z.A6C = true;
        c47z.A53 = true;
        c40121td.A0C(c47z);
        LCW.A00(userSession, directThreadKey, c47z, c40121td);
        return AbstractC47064KrL.A00(c47z);
    }

    public static final C47Z A05(Context context, UserSession userSession, DirectThreadKey directThreadKey, String str, int i, int i2, boolean z) {
        AbstractC167007dF.A1E(userSession, 1, str);
        C47Z A0i = AbstractC43594JPz.A0i();
        JQ1.A0m(EnumC40111tc.A06, A0i, str, i, i2);
        if (i2 != 0) {
            A0i.A02 = (i * 1.0f) / i2;
        }
        A0i.A6C = true;
        JQ1.A0j(userSession, A0i);
        A0i.A57 = z;
        A0i.A2G = null;
        C40121td A01 = C40121td.A0G.A01(context, userSession);
        A01.A0A(A0i);
        LCW.A00(userSession, directThreadKey, A0i, A01);
        return A0i;
    }

    public static final C47Z A06(Context context, UserSession userSession, String str, int i, int i2, boolean z) {
        C14360o3.A0B(context, 0);
        C47Z A0i = AbstractC43594JPz.A0i();
        JQ1.A0m(EnumC40111tc.A06, A0i, str, i, i2);
        if (i2 != 0) {
            A0i.A02 = (i * 1.0f) / i2;
        }
        A0i.A6C = false;
        A0i.A4x = false;
        A0i.A53 = true;
        A0i.A5D = true;
        A0i.A57 = z;
        A0i.A2G = null;
        C40121td A01 = C40121td.A0G.A01(context, userSession);
        A01.A0A(A0i);
        A01.A09(A0i);
        return A0i;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.52W, java.lang.Object] */
    public static final C4G2 A00(Context context, UserSession userSession, EnumC159397Cz enumC159397Cz, DirectThreadKey directThreadKey, L33 l33, Integer num, String str) {
        C40121td A01 = C40121td.A0G.A01(context, userSession);
        boolean A012 = enumC159397Cz.A01();
        C47Z A0i = AbstractC43594JPz.A0i();
        EnumC40111tc enumC40111tc = EnumC40111tc.A07;
        A0i.A0T(enumC40111tc);
        A0i.A0c(ShareType.A0E);
        String str2 = l33.A01;
        int i = l33.A00;
        ?? obj = new Object();
        obj.A01 = str2;
        obj.A00 = i;
        A0i.A1L = obj;
        A0i.A6C = !A012;
        A0i.A5D = A012;
        A0i.A3p = str;
        A0i.A2G = num;
        A0i.A0V = O12.A00;
        if (!A012 && !C18U.A06(C06090Tz.A05, userSession, 36325660863640814L)) {
            A0i.A4x = true;
        } else {
            A0i.A53 = true;
        }
        PendingMediaStore pendingMediaStore = A01.A04;
        java.util.Set singleton = Collections.singleton(A0i.A35);
        C14360o3.A07(singleton);
        pendingMediaStore.A0C(enumC40111tc, singleton);
        pendingMediaStore.A0D(A0i, A0i.A35);
        A01.A05.A04();
        if (A012) {
            A01.A09(A0i);
        } else {
            C25A.A00(userSession).A0B(AbstractC166987dD.A0O(context));
            LCW.A00(userSession, directThreadKey, A0i, A01);
        }
        return new C4G2(A0i, AbstractC001800i.A0a(l33.A03), l33.A00, 10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005d, code lost:
    
        if (r0.A5D != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C7Q4 A04(com.instagram.common.session.UserSession r19, com.instagram.model.direct.DirectThreadKey r20, com.instagram.pendingmedia.model.constants.ShareType r21, X.C40121td r22, java.lang.Integer r23, java.util.List r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LLY.A04(com.instagram.common.session.UserSession, com.instagram.model.direct.DirectThreadKey, com.instagram.pendingmedia.model.constants.ShareType, X.1td, java.lang.Integer, java.util.List, boolean):X.7Q4");
    }

    public static final C47Z A07(UserSession userSession, ClipInfo clipInfo, C47Z c47z, ShareType shareType, Integer num, String str, String str2, String str3, boolean z) {
        C47Z c47z2;
        if (c47z == null) {
            c47z2 = AbstractC209399Nx.A02(AbstractC43593JPy.A0x());
        } else {
            c47z2 = c47z;
        }
        c47z2.A3O = str2;
        c47z2.A33 = str;
        c47z2.A0c(shareType);
        if (c47z == null) {
            c47z2.A02 = clipInfo.A09 / clipInfo.A06;
        }
        int i = clipInfo.A09;
        int i2 = clipInfo.A06;
        c47z2.A0S = i;
        c47z2.A0R = i2;
        c47z2.A6C = !z;
        c47z2.A5D = z;
        c47z2.A3p = str3;
        c47z2.A2G = num;
        MediaUploadMetadata mediaUploadMetadata = clipInfo.A0B;
        C14360o3.A0B(mediaUploadMetadata, 0);
        c47z2.A13 = mediaUploadMetadata;
        MY3.A04(clipInfo, c47z2);
        if (!z && !C18U.A06(C06090Tz.A05, userSession, 36325660863640814L)) {
            c47z2.A4x = true;
        } else {
            c47z2.A53 = true;
        }
        c47z2.A0V = O12.A00;
        c47z2.A5F = clipInfo.A0I;
        return c47z2;
    }

    public static final C47Z A08(C47Z c47z, ShareType shareType, C183978Ee c183978Ee, Integer num, String str, String str2, boolean z) {
        if (c47z == null) {
            c47z = AbstractC209399Nx.A01(AbstractC43593JPy.A0x());
        }
        c47z.A3O = str;
        c47z.A0c(shareType);
        c47z.A33 = c183978Ee.A06();
        c47z.A3L = c183978Ee.A07();
        int i = c183978Ee.A09;
        c47z.A0H = i;
        int i2 = c183978Ee.A06;
        c47z.A0G = i2;
        c47z.A0S = i;
        c47z.A0R = i2;
        if (i2 != 0) {
            c47z.A02 = i / i2;
        }
        c47z.A6C = !z;
        c47z.A5D = z;
        c47z.A3p = str2;
        c47z.A2G = num;
        c47z.A53 = true;
        c47z.A13 = c183978Ee.A01();
        return c47z;
    }

    public static final boolean A0A(String str) {
        String str2;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -530380944:
                str2 = "external_sheet_send_attribution_text";
                break;
            case 375221496:
                str2 = "external_share_send_attribution_image";
                break;
            case 387110936:
                str2 = "external_share_send_attribution_video";
                break;
            case 761551839:
                if (!str.equals("share_extension")) {
                    return false;
                }
                return true;
            default:
                return false;
        }
        if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public static final void A09(UserSession userSession, DirectThreadKey directThreadKey, C47Z c47z, C183978Ee c183978Ee) {
        C81663kb A0c = AbstractC43594JPz.A0c(userSession, directThreadKey);
        if (A0c != null && A0c.C7g() == 29 && C18U.A06(C06090Tz.A05, userSession, 36329350240420132L)) {
            C006802i c006802i = C006802i.A0p;
            c006802i.markerStart(868880300);
            String A07 = c183978Ee.A07();
            if (A07 != null) {
                c47z.A3L = A07;
                c47z.A44 = AbstractC209829Ps.A00(A07);
            }
            AbstractC68554VVh.A00(userSession, c47z);
            c006802i.markerEnd(868880300, (short) 2);
        }
    }
}
