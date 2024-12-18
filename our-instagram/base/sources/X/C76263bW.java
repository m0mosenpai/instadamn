package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.ClipsMashupFollowButtonInfo;
import com.instagram.api.schemas.OriginalityInfo;
import com.instagram.api.schemas.OriginalitySourceMediaInfo;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.model.people.PeopleTag;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* renamed from: X.3bW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76263bW {
    public static final C76263bW A00 = new Object();

    public static final boolean A02(UserSession userSession, C38321qM c38321qM) {
        ClipsMashupFollowButtonInfo AoR = c38321qM.A0C.AoR();
        if (AoR != null && C14360o3.A0K(AoR.CZs(), true)) {
            return C14360o3.A0K(AoR.BwL(), true);
        }
        return C18U.A06(C06090Tz.A05, userSession, 36330625845838783L);
    }

    public final SpannableString A03(Context context, C38321qM c38321qM) {
        User CDj;
        OriginalitySourceMediaInfo A002 = A00(c38321qM);
        String str = null;
        if (A002 != null && (CDj = A002.CDj()) != null) {
            str = CDj.getUsername();
        }
        Resources resources = context.getResources();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        spannableStringBuilder.append((CharSequence) resources.getString(2131957260));
        AbstractC31423DrT.A00(spannableStringBuilder, str, "{username}", arrayDeque, new Object[]{new StyleSpan(1)}, 0);
        return new SpannableString(spannableStringBuilder);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (X.C57582kX.A00(r7).A0N(r4) != r2) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A07(com.instagram.common.session.UserSession r7, X.C38321qM r8) {
        /*
            r6 = this;
            r3 = 0
            X.C14360o3.A0B(r7, r3)
            r1 = 1
            X.C14360o3.A0B(r8, r1)
            X.1rF r0 = r8.A0C
            com.instagram.api.schemas.ClipsMashupFollowButtonInfo r2 = r0.AoR()
            r5 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            if (r2 == 0) goto L28
            java.lang.Boolean r0 = r2.CZs()
            boolean r0 = X.C14360o3.A0K(r0, r1)
            if (r0 == 0) goto L28
            java.lang.Boolean r0 = r2.BwL()
            boolean r0 = X.C14360o3.A0K(r0, r1)
            return r0
        L28:
            com.instagram.user.model.User r2 = A01(r8)
            if (r2 == 0) goto L79
            com.instagram.user.model.User r4 = r8.A2E(r7)
            if (r4 == 0) goto L79
            java.lang.String r1 = r7.userId
            java.lang.String r0 = r2.getId()
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L4c
            java.lang.String r1 = r7.userId
            java.lang.String r0 = r4.getId()
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L4d
        L4c:
            r3 = 1
        L4d:
            X.2kX r0 = X.C57582kX.A00(r7)
            com.instagram.user.model.FollowStatus r0 = r0.A0N(r2)
            com.instagram.user.model.FollowStatus r2 = com.instagram.user.model.FollowStatus.A05
            if (r0 != r2) goto L64
            X.2kX r0 = X.C57582kX.A00(r7)
            com.instagram.user.model.FollowStatus r1 = r0.A0N(r4)
            r0 = 1
            if (r1 == r2) goto L65
        L64:
            r0 = 0
        L65:
            if (r3 != 0) goto L77
            if (r0 != 0) goto L77
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36330625845707709(0x811283000043bd, double:3.0389723042890925E-306)
            boolean r0 = X.C18U.A06(r2, r7, r0)
            if (r0 == 0) goto L77
            return r5
        L77:
            r5 = 0
            return r5
        L79:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76263bW.A07(com.instagram.common.session.UserSession, X.1qM):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (X.C57582kX.A00(r7).A0N(r4) != r2) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A08(com.instagram.common.session.UserSession r7, X.C38321qM r8) {
        /*
            r6 = this;
            r3 = 0
            X.C14360o3.A0B(r7, r3)
            r1 = 1
            X.C14360o3.A0B(r8, r1)
            X.1rF r0 = r8.A0C
            X.3x9 r0 = r0.getClipsMetadata()
            if (r0 == 0) goto L7a
            com.instagram.api.schemas.OriginalityInfo r0 = r0.Ba3()
            if (r0 == 0) goto L7a
            com.instagram.api.schemas.OriginalityFollowButtonInfo r2 = r0.B7H()
        L1a:
            r5 = 1
            if (r2 == 0) goto L34
            java.lang.Boolean r0 = r2.CZs()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r0 = X.C14360o3.A0K(r0, r1)
            if (r0 == 0) goto L34
            java.lang.Boolean r0 = r2.BwL()
            boolean r3 = X.C14360o3.A0K(r0, r1)
        L33:
            return r3
        L34:
            com.instagram.api.schemas.OriginalitySourceMediaInfo r0 = A00(r8)
            if (r0 == 0) goto L33
            com.instagram.user.model.User r2 = r0.CDj()
            if (r2 == 0) goto L33
            com.instagram.user.model.User r4 = r8.A2E(r7)
            if (r4 == 0) goto L33
            java.lang.String r1 = r2.getId()
            java.lang.String r0 = r7.userId
            boolean r3 = X.C14360o3.A0K(r1, r0)
            X.2kX r0 = X.C57582kX.A00(r7)
            com.instagram.user.model.FollowStatus r0 = r0.A0N(r2)
            com.instagram.user.model.FollowStatus r2 = com.instagram.user.model.FollowStatus.A05
            if (r0 != r2) goto L67
            X.2kX r0 = X.C57582kX.A00(r7)
            com.instagram.user.model.FollowStatus r1 = r0.A0N(r4)
            r0 = 1
            if (r1 == r2) goto L68
        L67:
            r0 = 0
        L68:
            if (r3 != 0) goto L7c
            if (r0 != 0) goto L7c
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36325630799328483(0x810df8000934e3, double:3.0358134168454326E-306)
            boolean r0 = X.C18U.A06(r2, r7, r0)
            if (r0 == 0) goto L7c
            return r5
        L7a:
            r2 = 0
            goto L1a
        L7c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76263bW.A08(com.instagram.common.session.UserSession, X.1qM):boolean");
    }

    public final boolean A09(UserSession userSession, C38321qM c38321qM, boolean z) {
        User CDj;
        User A2E;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c38321qM, 1);
        if (z) {
            CDj = A01(c38321qM);
        } else {
            OriginalitySourceMediaInfo A002 = A00(c38321qM);
            if (A002 != null) {
                CDj = A002.CDj();
            }
            return false;
        }
        if (CDj != null && (A2E = c38321qM.A2E(userSession)) != null) {
            FollowStatus A0N = C57582kX.A00(userSession).A0N(CDj);
            FollowStatus followStatus = FollowStatus.A05;
            boolean z2 = false;
            if (A0N == followStatus) {
                z2 = true;
            }
            boolean z3 = false;
            if (C57582kX.A00(userSession).A0N(A2E) == followStatus) {
                z3 = true;
            }
            if (!z2 || !z3) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final OriginalitySourceMediaInfo A00(C38321qM c38321qM) {
        OriginalityInfo Ba3;
        C3x9 clipsMetadata = c38321qM.A0C.getClipsMetadata();
        if (clipsMetadata == null || (Ba3 = clipsMetadata.Ba3()) == null) {
            return null;
        }
        return Ba3.BZp();
    }

    public static final User A01(C38321qM c38321qM) {
        InterfaceC84163p3 BPh;
        C4GI BZr;
        C3x9 clipsMetadata = c38321qM.A0C.getClipsMetadata();
        if (clipsMetadata != null && (BPh = clipsMetadata.BPh()) != null && (BZr = BPh.BZr()) != null) {
            return BZr.CDj();
        }
        return null;
    }

    public final ArrayList A04(UserSession userSession, C38321qM c38321qM) {
        User user;
        OriginalitySourceMediaInfo A002 = A00(c38321qM);
        if (A002 != null) {
            user = A002.CDj();
        } else {
            user = null;
        }
        User A2E = c38321qM.A2E(userSession);
        if (user != null && A2E != null) {
            return AbstractC16960so.A1M(new PeopleTag(user), new PeopleTag(A2E));
        }
        return new ArrayList();
    }

    public final ArrayList A05(UserSession userSession, C38321qM c38321qM) {
        User A2E = c38321qM.A2E(userSession);
        User A01 = A01(c38321qM);
        if (A2E != null && A01 != null) {
            return AbstractC16960so.A1M(new PeopleTag(A2E), new PeopleTag(A01));
        }
        return new ArrayList();
    }

    public final void A06(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM) {
        String pk;
        OriginalitySourceMediaInfo A002 = A00(c38321qM);
        if (A002 != null && (pk = A002.getPk()) != null) {
            if (C18U.A06(C06090Tz.A06, userSession, 36325630799262946L)) {
                pk = c38321qM.A2u();
            }
            C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A1v, userSession);
            c116875Qr.A1D = pk;
            AbstractC86593tX.A0X(fragmentActivity, c116875Qr.A00(), userSession);
        }
    }
}
