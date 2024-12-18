package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.FmB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35520FmB implements View.OnClickListener {
    public final /* synthetic */ C34963Fan A00;

    public ViewOnClickListenerC35520FmB(C34963Fan c34963Fan) {
        this.A00 = c34963Fan;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C25621Ms A0M;
        String id;
        String str;
        String id2;
        int A05 = C0f9.A05(-159256336);
        C34963Fan c34963Fan = this.A00;
        Reel reel = c34963Fan.A07;
        boolean z = !reel.A1Y;
        Context context = c34963Fan.A00;
        C08790ch A00 = AbstractC018607g.A00(c34963Fan.A01);
        UserSession userSession = c34963Fan.A04;
        C34452FGq c34452FGq = c34963Fan.A06;
        if (C75653aW.A07(reel)) {
            C35108FeA.A00(userSession, reel, z);
            String A0H = reel.A0H(userSession);
            if (z) {
                id = "main_feed";
                A0M = AbstractC31173DnH.A0M(userSession);
                A0M.A0B("friendships/mute_friend_reel/");
                if (reel.A0o()) {
                    id2 = "election:rollcall_v2";
                } else {
                    id2 = reel.getId();
                }
                A0M.A9s("reel_id", id2);
                str = CacheBehaviorLogger.SOURCE;
            } else {
                A0M = AbstractC31173DnH.A0M(userSession);
                A0M.A0B("friendships/unmute_friend_reel/");
                if (reel.A0o()) {
                    id = "election:rollcall_v2";
                } else {
                    id = reel.getId();
                }
                str = "reel_id";
            }
            A0M.A9s(str, id);
            A0M.A9s("reel_type", A0H);
            C1ON A0I = AbstractC31178DnM.A0I(A0M, C151516rx.class, C151526ry.class);
            A0I.A00 = new EU0(2, reel, context, c34452FGq, userSession, z);
            C1GJ.A00(context, A00, A0I);
        }
        C0f9.A0C(-94195352, A05);
    }
}
