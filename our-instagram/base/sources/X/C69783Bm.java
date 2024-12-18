package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.3Bm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69783Bm {
    public final Fragment A00;
    public final UserSession A01;

    public final void A00(FragmentActivity fragmentActivity, C38321qM c38321qM, ShareType shareType, String str) {
        String fundraiserId;
        C62862tP A01;
        HashMap hashMap;
        HashMap hashMap2;
        Context applicationContext;
        XCT c36024FvM;
        String str2;
        C14360o3.A0B(fragmentActivity, 0);
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(shareType, 2);
        C14360o3.A0B(str, 3);
        boolean z = shareType.A00;
        String A00 = AbstractC43591JPw.A00(0);
        if (z) {
            UserSession userSession = this.A01;
            Fragment fragment = this.A00;
            C14360o3.A0C(fragment, A00);
            AbstractC59962oe abstractC59962oe = (AbstractC59962oe) fragment;
            String A2u = c38321qM.A2u();
            if (A2u != null) {
                C14360o3.A0B(abstractC59962oe, 2);
                A01 = C62862tP.A01(null, fragmentActivity, abstractC59962oe, userSession);
                hashMap = new HashMap();
                hashMap2 = new HashMap();
                BitSet bitSet = new BitSet(3);
                hashMap.put(AbstractC111324zv.A00(1295), Long.valueOf(Long.parseLong(A2u)));
                bitSet.set(2);
                hashMap.put("source_name", "STORY");
                bitSet.set(1);
                hashMap.put(AbstractC50532MSl.A00(), str);
                bitSet.set(0);
                applicationContext = fragmentActivity.getApplicationContext();
                c36024FvM = new C36025FvN();
                if (bitSet.nextClearBit(0) >= 3) {
                    str2 = "com.bloks.www.ig.giving.fundraiser.story.media.creation_outro.entrypoint";
                } else {
                    throw new IllegalStateException("Missing Required Props");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            InterfaceC39031rc B99 = c38321qM.A0C.B99();
            if (B99 == null || (fundraiserId = B99.getFundraiserId()) == null) {
                return;
            }
            UserSession userSession2 = this.A01;
            Fragment fragment2 = this.A00;
            C14360o3.A0C(fragment2, A00);
            AbstractC59962oe abstractC59962oe2 = (AbstractC59962oe) fragment2;
            C14360o3.A0B(abstractC59962oe2, 2);
            A01 = C62862tP.A01(null, fragmentActivity, abstractC59962oe2, userSession2);
            hashMap = new HashMap();
            hashMap2 = new HashMap();
            BitSet bitSet2 = new BitSet(4);
            hashMap.put("fundraiser_id", fundraiserId);
            bitSet2.set(0);
            hashMap.put("share_type", "story");
            bitSet2.set(2);
            hashMap.put("source_name", "FEED_COMPOSER");
            bitSet2.set(3);
            hashMap.put(AbstractC50532MSl.A00(), str);
            bitSet2.set(1);
            applicationContext = fragmentActivity.getApplicationContext();
            c36024FvM = new C36024FvM();
            if (bitSet2.nextClearBit(0) >= 4) {
                str2 = "com.bloks.www.ig.giving.fundraiser.creation_outro.entrypoint";
            } else {
                throw new IllegalStateException("Missing Required Props");
            }
        }
        C69618VsL A012 = FTe.A01(str2);
        A012.A04 = AbstractC191768eY.A01(hashMap);
        A012.A03 = hashMap2;
        A012.A02 = c36024FvM;
        A012.A00(applicationContext, A01);
    }

    public final boolean A01(C47Z c47z, ShareType shareType) {
        C14360o3.A0B(shareType, 0);
        C14360o3.A0B(c47z, 1);
        if (AbstractC16830sb.A05(ShareType.A08, ShareType.A09, ShareType.A0V, ShareType.A0W, ShareType.A0H, ShareType.A0Q).contains(shareType) && A31.A00(c47z)) {
            if (C18U.A06(C06090Tz.A05, this.A01, 36317685109233108L)) {
                return true;
            }
        }
        return false;
    }

    public C69783Bm(Fragment fragment, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = fragment;
    }
}
