package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.PhotoSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.PLg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56861PLg implements Runnable {
    public final /* synthetic */ C189588ad A00;

    public RunnableC56861PLg(C189588ad c189588ad) {
        this.A00 = c189588ad;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C189588ad c189588ad = this.A00;
        if (((MX5) C189588ad.A00(c189588ad)).A01.A0C != null) {
            MX1.A01(c189588ad.getSession()).A05(c189588ad.A01);
            List A05 = c189588ad.Asi().A05();
            C14360o3.A07(A05);
            if (AbstractC166987dD.A1b(A05)) {
                List<PhotoSession> A052 = c189588ad.Asi().A05();
                C14360o3.A07(A052);
                c189588ad.A0E = MSW.A1C(A052.size());
                for (PhotoSession photoSession : A052) {
                    String str = photoSession.A0B;
                    MXA mxa = c189588ad.A07;
                    String str2 = "mediaCaptureRenderController";
                    if (mxa != null) {
                        mxa.A02(null, str);
                        FragmentActivity activity = c189588ad.getActivity();
                        if (activity != null) {
                            UserSession session = c189588ad.getSession();
                            AnonymousClass841 A00 = C189588ad.A00(c189588ad);
                            MXB mxb = c189588ad.A03;
                            if (mxb == null) {
                                str2 = "dialogHelper";
                            } else {
                                P07 p07 = new P07(activity, session, new C56209OxI(c189588ad, 0), photoSession, mxb, A00, c189588ad, ((MX5) C189588ad.A00(c189588ad)).A01.A09, c189588ad, null, photoSession.A02);
                                MXA mxa2 = c189588ad.A07;
                                if (mxa2 != null) {
                                    C14360o3.A0B(str, 0);
                                    Map map = mxa2.A0A;
                                    if (!map.containsKey(str)) {
                                        mxa2.A02(null, str);
                                    }
                                    Object obj = map.get(str);
                                    if (obj != null) {
                                        ((InterfaceC197218ns) obj).Co2(p07, photoSession.A07, new EnumC53116NeT[]{EnumC53116NeT.A03}, true);
                                    } else {
                                        throw AbstractC166997dE.A0g();
                                    }
                                }
                            }
                        } else {
                            return;
                        }
                    }
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                return;
            }
            C189588ad.A01(c189588ad);
        }
    }
}
