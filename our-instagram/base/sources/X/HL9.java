package X;

import android.widget.ListView;
import androidx.fragment.app.Fragment;
import com.instagram.ui.widget.refresh.RefreshableListView;

/* loaded from: classes7.dex */
public final class HL9 extends AbstractC154286wd {
    public final int A00;
    public final Object A01;

    public HL9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        String str;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-1076487252);
                HD6 hd6 = (HD6) this.A01;
                C9GR.A0F(hd6.getActivity(), "live_archive_fail_refresh", 2131965319);
                HD6.A02(hd6);
                i = 1304711041;
                C0f9.A0A(i, A03);
                return;
            case 1:
                A03 = C0f9.A03(-108859313);
                EM6 em6 = (EM6) this.A01;
                em6.A03.A00.A01();
                if (em6.isResumed()) {
                    C9GR.A0F(em6.requireActivity(), "could_not_refresh_feed", 2131956848);
                }
                EM6.A08(em6);
                i = 730379685;
                C0f9.A0A(i, A03);
                return;
            case 2:
                A03 = C0f9.A03(-387519770);
                i = -1093224139;
                C0f9.A0A(i, A03);
                return;
            case 3:
                A03 = C0f9.A03(-681644647);
                C9GR.A08(((Fragment) this.A01).getActivity(), 2131956848, 0);
                i = -586670458;
                C0f9.A0A(i, A03);
                return;
            case 4:
                A03 = C0f9.A03(95370720);
                ((C39492HcK) this.A01).A01.Dfp();
                i = 1931948624;
                C0f9.A0A(i, A03);
                return;
            case 5:
                A03 = C0f9.A03(-551958406);
                ((HL1) this.A01).A03.Dfp();
                i = 2130112384;
                C0f9.A0A(i, A03);
                return;
            default:
                A03 = C0f9.A03(-1242091227);
                C14360o3.A0B(abstractC115105If, 0);
                HDI hdi = (HDI) this.A01;
                C69613Av c69613Av = hdi.A00;
                if (c69613Av != null) {
                    Throwable A01 = abstractC115105If.A01();
                    if (A01 != null) {
                        str = A01.getMessage();
                    } else {
                        str = "Feed request failed";
                    }
                    c69613Av.A07(str);
                }
                if (!hdi.isAdded()) {
                    i = 1193814263;
                } else {
                    C9GR.A01(hdi.getActivity(), "could_not_refresh_feed", 2131956848, 0);
                    HY4 hy4 = hdi.A04;
                    if (hy4 == null) {
                        AbstractC31171DnF.A0t();
                        throw C00O.createAndThrow();
                    }
                    hy4.notifyDataSetChanged();
                    i = -1582053310;
                }
                C0f9.A0A(i, A03);
                return;
        }
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-198047874);
                C38K c38k = (C38K) this.A01;
                if (c38k.A0W() != null) {
                    ((RefreshableListView) c38k.A0W()).setIsLoading(false);
                    AbstractC31557Dth.A00(c38k.mView, false);
                }
                i = 722767064;
                break;
            case 1:
                A03 = C0f9.A03(948350511);
                i = 1534387288;
                break;
            case 2:
                A03 = C0f9.A03(-1295732291);
                i = -1964616280;
                break;
            case 3:
                A03 = C0f9.A03(1485128365);
                ((RefreshableListView) AbstractC37300Gc1.A02((AbstractC05560Rg) this.A01)).setIsLoading(false);
                i = -1777152787;
                break;
            case 4:
                A03 = C0f9.A03(151034416);
                ((C39492HcK) this.A01).A01.Dfz();
                i = -933858949;
                break;
            case 5:
                A03 = C0f9.A03(-2136657807);
                ((HL1) this.A01).A03.Dfz();
                i = -884712737;
                break;
            default:
                A03 = C0f9.A03(-658164883);
                C38K c38k2 = (C38K) this.A01;
                if (c38k2.A0W() != null) {
                    ListView A0W = c38k2.A0W();
                    C14360o3.A0C(A0W, MSV.A00(16));
                    ((RefreshableListView) A0W).setIsLoading(false);
                }
                i = -1559923070;
                break;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-1773606511);
                HD6 hd6 = (HD6) this.A01;
                if (hd6.A0W() != null) {
                    ((RefreshableListView) hd6.A0W()).setIsLoading(true);
                }
                HD6.A02(hd6);
                i = -1205371489;
                break;
            case 1:
                A03 = C0f9.A03(2000707662);
                ((EM6) this.A01).A03.A00.A04();
                i = -1270561184;
                break;
            case 2:
                A03 = C0f9.A03(1726824034);
                i = -778053354;
                break;
            case 3:
                A03 = C0f9.A03(1244086763);
                i = 551115030;
                break;
            case 4:
                A03 = C0f9.A03(1027706533);
                ((C39492HcK) this.A01).A01.DgF();
                i = -737918514;
                break;
            case 5:
                A03 = C0f9.A03(2070703852);
                ((HL1) this.A01).A03.DgF();
                i = -1309952749;
                break;
            default:
                A03 = C0f9.A03(-1219045111);
                C38K c38k = (C38K) this.A01;
                if (c38k.A0W() != null) {
                    ListView A0W = c38k.A0W();
                    C14360o3.A0C(A0W, MSV.A00(16));
                    ((RefreshableListView) A0W).setIsLoading(true);
                }
                i = -1956643191;
                break;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r2 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x04d4, code lost:
    
        if (X.AbstractC35085Fcw.A02(r7.A05) == false) goto L200;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0192  */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 1476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HL9.onSuccess(java.lang.Object):void");
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1665412268);
                C0f9.A0A(-2009375148, C0f9.A03(-1786891850));
                i = -510684452;
                break;
            case 1:
                A03 = C0f9.A03(749746100);
                C0f9.A0A(-1281154141, C0f9.A03(2107837666));
                i = 1541587334;
                break;
            case 2:
                A03 = C0f9.A03(-407784764);
                C0f9.A0A(-1290117047, C0f9.A03(-2104351167));
                i = 1873998196;
                break;
            case 3:
                A03 = C0f9.A03(1948228223);
                C0f9.A0A(-1206871333, C0f9.A03(642910786));
                i = -1508664460;
                break;
            case 4:
                A03 = C0f9.A03(1554218392);
                C0f9.A0A(-1995084574, C0f9.A03(-1529983582));
                i = -678069334;
                break;
            case 5:
                A03 = C0f9.A03(871345500);
                C0f9.A0A(46890423, C0f9.A03(-2004202826));
                i = -870330968;
                break;
            default:
                A03 = C0f9.A03(1554796287);
                C0f9.A0A(-2009221406, C0f9.A03(-660327147));
                i = -1688168231;
                break;
        }
        C0f9.A0A(i, A03);
    }
}
