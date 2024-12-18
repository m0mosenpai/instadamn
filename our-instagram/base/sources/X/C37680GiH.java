package X;

import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.api.schemas.MidCardLayoutType;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GiH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37680GiH {
    public final C09530e4 A01(C120985dq c120985dq) {
        int i;
        boolean z;
        int valueOf;
        boolean z2;
        MidCardLayoutType midCardLayoutType;
        boolean z3;
        int i2;
        C26133BhK c26133BhK;
        List list;
        MidCardLayoutType midCardLayoutType2;
        C26136BhN c26136BhN = c120985dq.A01().A06;
        C38663Gz4 A01 = c120985dq.A01();
        if (c26136BhN != null) {
            InstagramMidcardType instagramMidcardType = A01.A05;
            InstagramMidcardType instagramMidcardType2 = InstagramMidcardType.A0C;
            MidCardLayoutType midCardLayoutType3 = null;
            C26136BhN c26136BhN2 = c120985dq.A01().A06;
            if (instagramMidcardType == instagramMidcardType2) {
                if (c26136BhN2 != null) {
                    midCardLayoutType2 = c26136BhN2.A07;
                } else {
                    midCardLayoutType2 = null;
                }
                z3 = true;
                if (midCardLayoutType2 != MidCardLayoutType.A05) {
                    C26136BhN c26136BhN3 = c120985dq.A01().A06;
                    if (c26136BhN3 != null) {
                        midCardLayoutType3 = c26136BhN3.A07;
                    }
                    if (midCardLayoutType3 != MidCardLayoutType.A04) {
                        valueOf = 1;
                        z2 = Boolean.valueOf(z3);
                    }
                }
                list = c120985dq.A01().A0F;
                if (list == null) {
                    i2 = 4;
                    valueOf = Integer.valueOf(i2);
                    z2 = Boolean.valueOf(z3);
                }
                i2 = list.size();
                valueOf = Integer.valueOf(i2);
                z2 = Boolean.valueOf(z3);
            } else {
                if (c26136BhN2 != null) {
                    midCardLayoutType = c26136BhN2.A07;
                } else {
                    midCardLayoutType = null;
                }
                z3 = false;
                if (midCardLayoutType != MidCardLayoutType.A05) {
                    C26136BhN c26136BhN4 = c120985dq.A01().A06;
                    if (c26136BhN4 != null) {
                        midCardLayoutType3 = c26136BhN4.A07;
                    }
                    if (midCardLayoutType3 != MidCardLayoutType.A04) {
                        list = c120985dq.A01().A0H;
                        i2 = list.size();
                        valueOf = Integer.valueOf(i2);
                        z2 = Boolean.valueOf(z3);
                    }
                }
                C26136BhN c26136BhN5 = c120985dq.A01().A06;
                if (c26136BhN5 == null || (c26133BhK = c26136BhN5.A06) == null || (list = c26133BhK.A08) == null) {
                    i2 = 3;
                    valueOf = Integer.valueOf(i2);
                    z2 = Boolean.valueOf(z3);
                }
                i2 = list.size();
                valueOf = Integer.valueOf(i2);
                z2 = Boolean.valueOf(z3);
            }
        } else {
            int ordinal = A01.A05.ordinal();
            if (ordinal != 33 && ordinal != 12) {
                if (ordinal != 6 && ordinal != 28 && ordinal != 37) {
                    i = 3;
                    z = false;
                } else {
                    valueOf = Integer.valueOf(c120985dq.A01().A0H.size());
                    z2 = false;
                }
            } else {
                i = 1;
                z = true;
            }
            return AbstractC166987dD.A1L(i, z);
        }
        return AbstractC166987dD.A1L(valueOf, z2);
    }

    public static final boolean A00(ClipsViewerSource clipsViewerSource, UserSession userSession, String str, boolean z) {
        AbstractC167017dG.A1O(str, userSession);
        List list = AbstractC37744GjJ.A03;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(AnonymousClass001.A0R("clips_viewer_", ((ClipsViewerSource) it.next()).A00));
        }
        if (!A0q.contains(str) || !z) {
            if (clipsViewerSource != null && clipsViewerSource == ClipsViewerSource.A26 && C18U.A06(C06090Tz.A05, userSession, 36319510470467043L)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
