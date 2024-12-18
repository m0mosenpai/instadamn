package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.HJa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39102HJa extends AbstractRunnableC14200nk {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C38321qM A01;
    public final /* synthetic */ C42393Ipu A02;
    public final /* synthetic */ C39148HLb A03;
    public final /* synthetic */ String A04;

    public final String toString() {
        return "Feed link click survey signal query";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39102HJa(C38321qM c38321qM, C42393Ipu c42393Ipu, C39148HLb c39148HLb, String str, long j) {
        super(1181988343, 3, false, false);
        this.A02 = c42393Ipu;
        this.A04 = str;
        this.A01 = c38321qM;
        this.A00 = j;
        this.A03 = c39148HLb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String username;
        int i;
        String str2;
        C82573mL c82573mL;
        C42393Ipu c42393Ipu = this.A02;
        String str3 = this.A04;
        C39148HLb c39148HLb = c42393Ipu.A02;
        if (!AbstractC166987dD.A1b(C42393Ipu.A00(c42393Ipu, str3, c39148HLb.A0A, null, 1, false))) {
            java.util.Set set = c39148HLb.A09;
            boolean A1b = AbstractC166987dD.A1b(C42393Ipu.A00(c42393Ipu, str3, set, null, 1, false));
            UserSession userSession = c39148HLb.A06;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (A1b) {
                if (C18U.A06(c06090Tz, userSession, 2342172604267643303L)) {
                    str = "1053606132793669";
                } else {
                    return;
                }
            } else if (C18U.A06(c06090Tz, userSession, 2342172604267577766L)) {
                str = "3842242159428254";
            } else {
                return;
            }
            C38321qM c38321qM = this.A01;
            long j = this.A00;
            String A07 = AbstractC41071vF.A07(userSession, c38321qM);
            if (A07 == null) {
                A07 = "";
            }
            C14360o3.A0B(userSession, 0);
            User A2E = c38321qM.A2E(userSession);
            if (A2E != null) {
                if (A2E.A2N()) {
                    username = AbstractC41071vF.A0G(userSession, c38321qM);
                } else if (!AbstractC41071vF.A0V(userSession, c38321qM) || (username = AbstractC41071vF.A08(userSession, c38321qM)) == null) {
                    username = A2E.getUsername();
                }
                C9BW c9bw = (C9BW) AbstractC001800i.A0J(C42393Ipu.A00(c42393Ipu, str3, null, null, 1, true));
                AbstractC82583mM abstractC82583mM = null;
                if (c9bw != null) {
                    abstractC82583mM = (AbstractC82583mM) c9bw.A00;
                }
                if ((abstractC82583mM instanceof C82573mL) && (c82573mL = (C82573mL) abstractC82583mM) != null) {
                    i = c82573mL.A02;
                } else {
                    i = -1;
                }
                List A00 = C42393Ipu.A00(c42393Ipu, str3, null, set, Integer.MAX_VALUE, false);
                LinkedHashSet A0l = AbstractC31171DnF.A0l();
                Iterator it = A00.iterator();
                while (it.hasNext()) {
                    A0l.add(((C9C7) ((C9BW) it.next()).A01).A04);
                }
                String A0P = AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", A0l, C43325JCs.A00);
                if (!str.equals("1053606132793669")) {
                    str2 = "dwell_time";
                } else {
                    str2 = "interaction";
                }
                AbstractC167007dF.A0J().post(new J5M(c39148HLb, str, AbstractC06930Yk.A07(AbstractC166987dD.A1L(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, userSession.userId), AbstractC166987dD.A1L("ad_id", A07), AbstractC166987dD.A1L("dwell_time", String.valueOf(j)), AbstractC166987dD.A1L("brand_name", username), AbstractC166987dD.A1L(AbstractC111324zv.A00(4711), A0P), AbstractC166987dD.A1L("position", String.valueOf(i)), AbstractC166987dD.A1L("trigger_type", str2), AbstractC166987dD.A1L("feed_session_id", c39148HLb.A07.A00))));
                this.A03.A00++;
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
