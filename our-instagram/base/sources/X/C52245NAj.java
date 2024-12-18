package X;

import com.facebook.video.common.livestreaming.LiveStreamingError;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.streaming.common.BroadcastFailureType;
import java.util.List;

/* renamed from: X.NAj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52245NAj extends AbstractC70118W4q {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C52245NAj(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.AbstractC70118W4q
    public final void A03(Exception exc) {
        switch (this.A00) {
            case 0:
                C51037Mgm c51037Mgm = (C51037Mgm) this.A02;
                C51037Mgm.A01(c51037Mgm, (java.util.Set) this.A01);
                c51037Mgm.A0D.clear();
                return;
            case 1:
                C51037Mgm.A01((C51037Mgm) this.A02, (java.util.Set) this.A01);
                return;
            case 2:
                C14360o3.A0B(exc, 0);
                C53021Nct c53021Nct = (C53021Nct) this.A02;
                AbstractC55102ObF.A0C(c53021Nct, exc);
                String A0m = AbstractC50522MSa.A0m(exc);
                C14360o3.A07(A0m);
                LiveStreamingError liveStreamingError = new LiveStreamingError("endBroadcastSession", A0m, exc, S1U.A00(exc), false);
                C56805PIw c56805PIw = c53021Nct.A0a;
                int i = liveStreamingError.errorCode;
                String str = liveStreamingError.domain;
                if (str == null) {
                    str = "";
                }
                c56805PIw.A0D(i, str, liveStreamingError.reason, liveStreamingError.description, liveStreamingError.fullDescription);
                return;
            case 3:
                C14360o3.A0B(exc, 0);
                C53021Nct c53021Nct2 = (C53021Nct) this.A02;
                AbstractC55102ObF.A0C(c53021Nct2, exc);
                if (exc instanceof C53404Njt) {
                    C53404Njt c53404Njt = (C53404Njt) exc;
                    AbstractC55102ObF.A0B(c53404Njt.A00, c53021Nct2, c53404Njt.A01, exc.getMessage(), exc);
                    return;
                } else {
                    BroadcastFailureType broadcastFailureType = BroadcastFailureType.A03;
                    C14360o3.A0B("ApiStartBroadcast", 1);
                    AbstractC55102ObF.A0B(broadcastFailureType, c53021Nct2, "ApiStartBroadcast", null, exc);
                    return;
                }
            case 4:
                C14360o3.A0B(exc, 0);
                C53021Nct c53021Nct3 = (C53021Nct) this.A02;
                AbstractC55102ObF.A0C(c53021Nct3, exc);
                c53021Nct3.A0a.A0I("start encoding error", exc);
                ((AbstractC70118W4q) this.A01).A03(exc);
                return;
            default:
                C14360o3.A0B(exc, 0);
                ((C53020Ncs) this.A02).A0K.A0C("start encoding error", exc);
                ((AbstractC70118W4q) this.A01).A03(exc);
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.AbstractC70118W4q
    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        List list;
        switch (this.A00) {
            case 0:
                C51037Mgm c51037Mgm = (C51037Mgm) this.A02;
                java.util.Set set = c51037Mgm.A0D;
                C51037Mgm.A00(c51037Mgm, set);
                set.clear();
                return;
            case 1:
                return;
            case 2:
                C14360o3.A0B(obj, 0);
                C53021Nct c53021Nct = (C53021Nct) this.A02;
                C11T.A02(new RunnableC56950POr(c53021Nct));
                if (!((InterfaceC58192Pqy) this.A01).CTr()) {
                    return;
                }
                UserSession userSession = ((AbstractC55102ObF) c53021Nct).A07;
                String str = c53021Nct.A0D.A0C;
                C25621Ms A0c = AbstractC167017dG.A0c(userSession);
                A0c.A0L("live/%s/end_broadcast/", str);
                A0c.A9s("end_after_copyright_warning", "false");
                C1ON A0U = MSZ.A0U(A0c);
                A0U.A00 = new C67936V3b(10);
                C1GJ.A00(((AbstractC55102ObF) c53021Nct).A05, c53021Nct.A0V, A0U);
                return;
            case 3:
                C53021Nct c53021Nct2 = (C53021Nct) this.A02;
                C56805PIw c56805PIw = c53021Nct2.A0a;
                Integer num = (Integer) this.A01;
                C14360o3.A0B(num, 0);
                C25531Mh A03 = C56805PIw.A03(c56805PIw, C05F.A15);
                AbstractC50523MSb.A15(A03, OQV.A00(num), null);
                A03.Cht();
                c56805PIw.A0C();
                c53021Nct2.A0M(null);
                return;
            case 4:
                list = (List) obj;
                C14360o3.A0B(list, 0);
                C53021Nct c53021Nct3 = (C53021Nct) this.A02;
                c53021Nct3.A0a.A0F("start encoding");
                HandlerC72131XPd handlerC72131XPd = ((AbstractC55102ObF) c53021Nct3).A09.A09;
                handlerC72131XPd.sendMessageAtFrontOfQueue(handlerC72131XPd.obtainMessage(3, list));
                c53021Nct3.A0L = list;
                c53021Nct3.A0f.invoke(AbstractC001800i.A0J(list));
                if (c53021Nct3.A0T || c53021Nct3.A0U) {
                    c53021Nct3.A0N(true, true);
                    c53021Nct3.A0U = false;
                }
                ((AbstractC70118W4q) this.A01).A04(list);
                return;
            default:
                list = AbstractC25228BEl.A1C(obj);
                C53020Ncs c53020Ncs = (C53020Ncs) this.A02;
                c53020Ncs.A0A = list;
                c53020Ncs.A0K.A0A("start encoding", "");
                boolean z = c53020Ncs.A0I;
                if (z) {
                    c53020Ncs.A0K(z, true);
                }
                HandlerC72131XPd handlerC72131XPd2 = ((AbstractC55102ObF) c53020Ncs).A09.A09;
                handlerC72131XPd2.sendMessageAtFrontOfQueue(handlerC72131XPd2.obtainMessage(3, list));
                boolean z2 = c53020Ncs.A0I;
                if (z2) {
                    c53020Ncs.A0K(z2, true);
                }
                ((AbstractC70118W4q) this.A01).A04(list);
                return;
        }
    }
}
