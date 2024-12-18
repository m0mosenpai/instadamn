package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.api.schemas.IGMusicArtistPinningErrorType;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.common.session.UserSession;

/* renamed from: X.Giz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37724Giz {
    public static final void A02(Context context, UserSession userSession, C38321qM c38321qM) {
        boolean A1b = AbstractC25233BEq.A1b(context, userSession, c38321qM);
        A01(2131953226, context);
        c38321qM.A0C.EPr(false);
        C1DW.A00(userSession).A01(c38321qM, A1b, false);
        AbstractC25651Mw.A00(userSession).E4s(new C42252Inc(c38321qM));
    }

    public static final boolean A03(UserSession userSession, C38321qM c38321qM) {
        OriginalSoundDataIntf originalSoundDataIntf;
        MusicInfo BVc;
        InterfaceC88553xD c88543xC;
        OriginalSoundDataIntf BZw;
        C3x9 A0u = AbstractC25226BEj.A0u(c38321qM);
        if (A0u != null) {
            originalSoundDataIntf = A0u.BZw();
        } else {
            originalSoundDataIntf = null;
        }
        boolean A1W = AbstractC167007dF.A1W(originalSoundDataIntf);
        String str = null;
        C3x9 A0u2 = AbstractC25226BEj.A0u(c38321qM);
        if (A1W) {
            if (A0u2 != null && (BZw = A0u2.BZw()) != null) {
                c88543xC = new C117235Si(BZw);
            }
            c88543xC = null;
        } else {
            if (A0u2 != null && (BVc = A0u2.BVc()) != null) {
                c88543xC = new C88543xC(BVc);
            }
            c88543xC = null;
        }
        boolean A1Z = AbstractC166997dE.A1Z(c38321qM.A0C.CQ3(), true);
        String str2 = userSession.userId;
        if (c88543xC != null) {
            str = c88543xC.getArtistId();
        }
        boolean A0K = C14360o3.A0K(str2, str);
        boolean A0K2 = C14360o3.A0K(userSession.userId, AbstractC37302Gc3.A0a(userSession, c38321qM));
        boolean A1W2 = AbstractC167007dF.A1W(c38321qM.A0C.BRN());
        if (A1Z || !A0K || A0K2 || A1W2) {
            return false;
        }
        if (!A1W) {
            return true;
        }
        return C18U.A06(C06090Tz.A05, userSession, 36316005777411953L);
    }

    public static final boolean A04(UserSession userSession, C38321qM c38321qM) {
        OriginalSoundDataIntf originalSoundDataIntf;
        boolean z;
        InterfaceC88553xD interfaceC88553xD;
        MusicInfo BVc;
        OriginalSoundDataIntf BZw;
        C3x9 A0u = AbstractC25226BEj.A0u(c38321qM);
        String str = null;
        if (A0u != null) {
            originalSoundDataIntf = A0u.BZw();
        } else {
            originalSoundDataIntf = null;
        }
        if (originalSoundDataIntf != null) {
            z = true;
            C3x9 A0u2 = AbstractC25226BEj.A0u(c38321qM);
            if (A0u2 != null && (BZw = A0u2.BZw()) != null) {
                interfaceC88553xD = new C117235Si(BZw);
            } else {
                interfaceC88553xD = null;
            }
        } else {
            z = false;
            C3x9 A0u3 = AbstractC25226BEj.A0u(c38321qM);
            if (A0u3 != null && (BVc = A0u3.BVc()) != null) {
                interfaceC88553xD = new C88543xC(BVc);
            } else {
                interfaceC88553xD = null;
            }
        }
        boolean A1Z = AbstractC166997dE.A1Z(c38321qM.A0C.CQ3(), true);
        String str2 = userSession.userId;
        if (interfaceC88553xD != null) {
            str = interfaceC88553xD.getArtistId();
        }
        boolean A0K = C14360o3.A0K(str2, str);
        boolean A0K2 = C14360o3.A0K(userSession.userId, AbstractC37302Gc3.A0a(userSession, c38321qM));
        if (!A1Z) {
            return false;
        }
        if (z) {
            if (A0K && C18U.A06(C06090Tz.A05, userSession, 36316005777411953L)) {
                return true;
            }
        } else if (A0K) {
            return true;
        }
        if (A0K2) {
            return true;
        }
        return false;
    }

    public static final boolean A05(UserSession userSession, C38321qM c38321qM) {
        OriginalSoundDataIntf originalSoundDataIntf;
        C14360o3.A0B(userSession, 1);
        C3x9 clipsMetadata = c38321qM.A0C.getClipsMetadata();
        String str = null;
        if (clipsMetadata != null) {
            originalSoundDataIntf = clipsMetadata.BZw();
        } else {
            originalSoundDataIntf = null;
        }
        boolean z = false;
        if (originalSoundDataIntf != null) {
            z = true;
        }
        String str2 = userSession.userId;
        C88543xC A1Q = c38321qM.A1Q();
        if (A1Q != null) {
            str = A1Q.getArtistId();
        }
        boolean A0K = C14360o3.A0K(str2, str);
        if (!C14360o3.A0K(c38321qM.A0C.CQ3(), true)) {
            return false;
        }
        if (!z || C18U.A06(C06090Tz.A05, userSession, 36316005777346416L) || (C18U.A06(C06090Tz.A06, userSession, 36316005777411953L) && A0K)) {
            return true;
        }
        return false;
    }

    public static final int A00(String str) {
        if (str.equals(IGMusicArtistPinningErrorType.A06.A00)) {
            return 2131953216;
        }
        if (str.equals(IGMusicArtistPinningErrorType.A07.A00)) {
            return 2131953218;
        }
        if (str.equals(IGMusicArtistPinningErrorType.A05.A00)) {
            return 2131953217;
        }
        if (str.equals(IGMusicArtistPinningErrorType.A09.A00)) {
            return 2131953219;
        }
        if (str.equals(IGMusicArtistPinningErrorType.A0E.A00)) {
            return 2131953223;
        }
        if (!str.equals(IGMusicArtistPinningErrorType.A0F.A00)) {
            return 2131953227;
        }
        return 2131953220;
    }

    public static final void A01(int i, Context context) {
        C146106i8 A0K = AbstractC31171DnF.A0K();
        A0K.A0C(EnumC141996bI.A06);
        AbstractC25226BEj.A1N(context, A0K, i);
        A0K.A02 = context.getResources().getDimensionPixelOffset(R.dimen.abc_alert_dialog_button_dimen);
        AbstractC25233BEq.A1F(A0K);
    }
}
