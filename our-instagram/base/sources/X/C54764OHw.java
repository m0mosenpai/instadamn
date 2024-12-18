package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.creation.publishscreen.fragment.feed.FollowersShareFragment;

/* renamed from: X.OHw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54764OHw {
    public final /* synthetic */ FollowersShareFragment A00;
    public final /* synthetic */ C52527NLw A01;

    public C54764OHw(FollowersShareFragment followersShareFragment, C52527NLw c52527NLw) {
        this.A00 = followersShareFragment;
        this.A01 = c52527NLw;
    }

    public final void A00(boolean z) {
        FollowersShareFragment followersShareFragment = this.A00;
        CallerContext callerContext = FollowersShareFragment.A0z;
        if (z) {
            C131975xX c131975xX = C131965xW.A05;
            boolean A1a = AbstractC50522MSa.A1a(followersShareFragment);
            EnumC53382NjX enumC53382NjX = EnumC53382NjX.A05;
            C47Z A00 = AbstractC55082Oac.A00(followersShareFragment);
            boolean z2 = true;
            if (A1a) {
                z2 = false;
            }
            enumC53382NjX.A08(A00, z2);
            AbstractC55222Oeo.A00(followersShareFragment, z2);
        }
        C52527NLw c52527NLw = this.A01;
        Context context = followersShareFragment.getContext();
        if (c52527NLw.isLinked() && context != null) {
            String A0f = AbstractC167007dF.A0f(context.getApplicationContext(), AbstractC31173DnH.A0n(c52527NLw.A06, C17060sy.A01), 2131976119);
            if (A0f != null) {
                followersShareFragment.A0L = A0f;
            }
        }
        FollowersShareFragment.A0E(followersShareFragment);
    }
}
