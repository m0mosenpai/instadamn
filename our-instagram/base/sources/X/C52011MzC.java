package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.rsys.devxagent.gen.DevXAgentAppProxy;
import com.facebook.rsys.devxagent.gen.DevXAgentCallStartParams;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallAudience;
import com.instagram.model.rtc.RtcCallSource;
import com.instagram.model.rtc.RtcCreateCallArgs;
import com.instagram.model.rtc.RtcThreadKey;
import com.instagram.user.model.User;

/* renamed from: X.MzC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52011MzC extends DevXAgentAppProxy {
    public final Context A00;
    public final UserSession A01;
    public final O4Q A02;
    public final C2DS A03;

    @Override // com.facebook.rsys.devxagent.gen.DevXAgentAppProxy
    public final void appCommand(String str) {
    }

    @Override // com.facebook.rsys.devxagent.gen.DevXAgentAppProxy
    public final void startCall(DevXAgentCallStartParams devXAgentCallStartParams) {
        FragmentActivity fragmentActivity;
        C14360o3.A0B(devXAgentCallStartParams, 0);
        Long A0n = AbstractC25233BEq.A0n(devXAgentCallStartParams.userid);
        if (devXAgentCallStartParams.metaAiCall) {
            Object A00 = AbstractC54852fj.A00();
            if ((A00 instanceof FragmentActivity) && (fragmentActivity = (FragmentActivity) A00) != null) {
                if (fragmentActivity.findViewById(R.id.layout_direct_thread) == null) {
                    AbstractC34103F3f.A00().A00(this.A00, null, "all");
                }
                C11T.A03(new PRW(fragmentActivity, this));
                return;
            }
            return;
        }
        if (A0n != null) {
            long longValue = A0n.longValue();
            boolean z = devXAgentCallStartParams.isVideo;
            boolean z2 = devXAgentCallStartParams.creatorAiCall;
            C18A A002 = AnonymousClass189.A00(this.A01);
            String valueOf = String.valueOf(longValue);
            if (A002.A02(valueOf) == null) {
                O4Q o4q = this.A02;
                C14360o3.A0B(valueOf, 0);
                C25621Ms A0M = AbstractC31177DnL.A0M(o4q.A00);
                A0M.A0B("users/user_by_fbid/");
                A0M.A9s("user_fbid", valueOf);
                C1ON A0e = AbstractC25227BEk.A0e(A0M, EC7.class, C34857FXr.class);
                A0e.A00 = new C52218N9h(this, longValue, z, z2);
                C1GJ.A03(A0e);
                return;
            }
            A00(longValue, z, z2);
            return;
        }
        C0K8.A0P("IgDevXAgentAppProxy", "Invalid peer ID provided: %s. Cannot start call from DevXAgent.", devXAgentCallStartParams.userid);
    }

    public final void A00(long j, boolean z, boolean z2) {
        C7T3 c7t3;
        String str;
        UserSession userSession = this.A01;
        User A02 = AnonymousClass189.A00(userSession).A02(String.valueOf(j));
        if (A02 == null) {
            str = "Could not retrieve user for peer ID provided. Cannot start call from DevXAgent.";
        } else {
            C81663kb BZR = this.A03.BZR(null, null, null, AbstractC31177DnL.A0j(A02));
            if (BZR.BKb().A00 == null) {
                str = "Could not retrieve threadId for peer user provided. Cannot start call from DevXAgent.";
            } else {
                Long BTC = A02.BTC();
                if (BTC == null) {
                    str = "Could not retrieve EIMU ID for peer ID provided. Cannot start call from DevXAgent.";
                } else {
                    RtcCallAudience rtcCallAudience = new RtcCallAudience(AbstractC25225BEi.A0t(""), "", "", userSession.userId, C16930sl.A00, AbstractC166987dD.A1J(BTC.toString()), false);
                    EnumC53137Neq enumC53137Neq = EnumC53137Neq.A03;
                    if (z2) {
                        c7t3 = C7T3.A06;
                    } else {
                        c7t3 = C7T3.A08;
                    }
                    RtcCreateCallArgs rtcCreateCallArgs = new RtcCreateCallArgs(null, enumC53137Neq, rtcCallAudience, null, new RtcCallSource(null, c7t3, new RtcThreadKey(BZR.BKb(), null, null, null)), null, null, null, -1, z, false, false);
                    Context context = this.A00;
                    C12260kU.A0C(context, AbstractC54147Nwj.A00(context, userSession, rtcCreateCallArgs));
                    return;
                }
            }
        }
        C0K8.A0D("IgDevXAgentAppProxy", str);
    }

    public C52011MzC(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = AbstractC28761aE.A00(userSession);
        this.A02 = new O4Q(userSession);
    }
}
