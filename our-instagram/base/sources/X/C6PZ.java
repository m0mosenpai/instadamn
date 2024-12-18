package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.AdsAPIInstagramPosition;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.common.session.UserSession;
import instagram.features.feed.fragment.ContextualFeedFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6PZ, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6PZ {
    public static final ArrayList A00(XIGIGBoostDestination xIGIGBoostDestination, UserSession userSession, List list) {
        C06090Tz c06090Tz;
        long j;
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(xIGIGBoostDestination, 2);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AdsAPIInstagramPosition adsAPIInstagramPosition = (AdsAPIInstagramPosition) it.next();
            if (adsAPIInstagramPosition.ordinal() == 3) {
                int ordinal = xIGIGBoostDestination.ordinal();
                if (ordinal != 8 && ordinal != 1) {
                    if (ordinal == 10) {
                        c06090Tz = C06090Tz.A05;
                        j = 36318544102693174L;
                    }
                } else {
                    c06090Tz = C06090Tz.A05;
                    j = 36318544102824247L;
                }
                if (C18U.A06(c06090Tz, userSession, j)) {
                }
            }
            arrayList.add(adsAPIInstagramPosition);
        }
        return arrayList;
    }

    public static final void A01(final FragmentActivity fragmentActivity, final AdsAPIInstagramPosition adsAPIInstagramPosition, final XIGIGBoostCallToAction xIGIGBoostCallToAction, final UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(fragmentActivity, 1);
        C14360o3.A0B(str, 2);
        C1ON A04 = AbstractC2044893h.A04(userSession, str);
        A04.A00 = new C1P1() { // from class: X.6QQ
            @Override // X.C1P1
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                String string;
                int A03 = C0f9.A03(-484470963);
                C74293Vk c74293Vk = (C74293Vk) obj;
                int A032 = C0f9.A03(-353826049);
                C14360o3.A0B(c74293Vk, 0);
                List list = c74293Vk.A06;
                C14360o3.A07(list);
                C38321qM c38321qM = (C38321qM) AbstractC001800i.A0J(list);
                if (c38321qM != null) {
                    FragmentActivity fragmentActivity2 = FragmentActivity.this;
                    UserSession userSession2 = userSession;
                    AdsAPIInstagramPosition adsAPIInstagramPosition2 = adsAPIInstagramPosition;
                    XIGIGBoostCallToAction xIGIGBoostCallToAction2 = xIGIGBoostCallToAction;
                    C140966Yy c140966Yy = new C140966Yy(fragmentActivity2, userSession2);
                    int i = 2131970858;
                    if (adsAPIInstagramPosition2.ordinal() == 2) {
                        i = 2131970857;
                    }
                    String string2 = fragmentActivity2.getString(i);
                    String id = c38321qM.getId();
                    String id2 = c38321qM.getId();
                    if (id2 == null) {
                        id2 = "";
                    }
                    ArrayList A1M = AbstractC16960so.A1M(id2);
                    if (xIGIGBoostCallToAction2 == XIGIGBoostCallToAction.A0N) {
                        string = null;
                    } else {
                        string = fragmentActivity2.getString(W6g.A00(xIGIGBoostCallToAction2));
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString(C38668Gz9.A03, adsAPIInstagramPosition2.A00);
                    bundle.putString(C38668Gz9.A02, string);
                    ContextualFeedFragment contextualFeedFragment = new ContextualFeedFragment();
                    contextualFeedFragment.setArguments(C31569Dtv.A06(bundle, "FEED_AD_PREVIEW", string2, id, "feed_ad_preview", null, A1M));
                    c140966Yy.A0B(null, contextualFeedFragment);
                    c140966Yy.A0F = true;
                    c140966Yy.A04();
                }
                C0f9.A0A(-82232601, A032);
                C0f9.A0A(525485154, A03);
            }
        };
        C1GJ.A06(A04, 256520218, 3, false, false);
    }

    public static final void A02(FragmentActivity fragmentActivity, XIGIGBoostDestination xIGIGBoostDestination, MOA moa, UserSession userSession, String str, String str2, boolean z) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(fragmentActivity, 1);
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
        AbstractC155756z4.A00().A00();
        C6QR c6qr = new C6QR();
        c6qr.setArguments(AbstractC61636Rr0.A00(new C09530e4("IgSessionManager.SESSION_TOKEN_KEY", userSession.token), new C09530e4("media_id", str), new C09530e4("audience_id", str2), new C09530e4("destination", String.valueOf(xIGIGBoostDestination)), new C09530e4("is_business_account_tier_2_or_higher", Boolean.valueOf(z))));
        c6qr.A0P = moa;
        c140966Yy.A0D(c6qr);
        c140966Yy.A04();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:3:0x0015 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A03(com.instagram.api.schemas.AdsAPIInstagramPosition r7, com.instagram.api.schemas.XIGIGBoostDestination r8, com.instagram.common.session.UserSession r9) {
        /*
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            int r0 = r7.ordinal()
            r7 = 5
            r6 = 12
            r5 = 10
            r4 = 1
            r1 = 1
            r3 = 8
            r2 = -1
            switch(r0) {
                case 2: goto L49;
                case 3: goto L53;
                case 4: goto L15;
                case 5: goto L15;
                case 6: goto L15;
                case 7: goto L17;
                case 8: goto L15;
                case 9: goto L36;
                case 10: goto L15;
                case 11: goto L15;
                case 12: goto L49;
                case 13: goto L49;
                default: goto L15;
            }
        L15:
            r1 = 0
        L16:
            return r1
        L17:
            if (r8 == 0) goto L15
            int r0 = r8.ordinal()
            if (r0 == r3) goto L28
            if (r0 == r4) goto L28
            if (r0 == r5) goto L28
            if (r0 == r6) goto L28
            if (r0 == r7) goto L28
            goto L15
        L28:
            if (r9 == 0) goto L15
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36321073838498952(0x8109d300012488, double:3.032931576467429E-306)
            boolean r1 = X.C18U.A06(r2, r9, r0)
            return r1
        L36:
            if (r8 == 0) goto L16
            int r0 = r8.ordinal()
            if (r0 == r2) goto L16
            if (r0 == r3) goto L16
            if (r0 == r4) goto L16
            if (r0 == r5) goto L16
            if (r0 == r6) goto L16
            if (r0 == r7) goto L16
            goto L15
        L49:
            if (r8 == 0) goto L16
            int r0 = r8.ordinal()
            switch(r0) {
                case -1: goto L16;
                case 0: goto L52;
                case 1: goto L16;
                case 2: goto L52;
                case 3: goto L52;
                case 4: goto L16;
                case 5: goto L16;
                case 6: goto L52;
                case 7: goto L16;
                case 8: goto L16;
                case 9: goto L52;
                case 10: goto L16;
                case 11: goto L52;
                case 12: goto L16;
                default: goto L52;
            }
        L52:
            goto L15
        L53:
            if (r8 == 0) goto L16
            int r0 = r8.ordinal()
            if (r0 == r2) goto L16
            if (r0 == r3) goto L16
            if (r0 == r4) goto L16
            if (r0 == r5) goto L16
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6PZ.A03(com.instagram.api.schemas.AdsAPIInstagramPosition, com.instagram.api.schemas.XIGIGBoostDestination, com.instagram.common.session.UserSession):boolean");
    }

    public static final boolean A04(UserSession userSession, C38321qM c38321qM, boolean z) {
        if (c38321qM == null || !c38321qM.CdW()) {
            return false;
        }
        List A3k = c38321qM.A3k();
        return ((A3k != null && A3k.contains(userSession.userId)) || z) && C18U.A06(C06090Tz.A05, userSession, 36321881292351356L);
    }
}
