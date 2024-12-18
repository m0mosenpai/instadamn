package X;

import android.app.Activity;
import com.instagram.discovery.mediamap.intf.MediaMapQuery;
import com.instagram.igds.components.button.IgdsButton;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public final class Tx4 extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public Tx4(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj3;
        this.A03 = obj2;
        this.A02 = obj;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N;
        int i;
        Throwable illegalStateException;
        switch (this.A00) {
            case 0:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -1433876963);
                ((Map) this.A02).remove(((C70088W2k) this.A03).A03);
                ((C1P1) this.A01).onFail(abstractC115105If);
                i = -878602826;
                break;
            case 1:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 845151070);
                Throwable A01 = abstractC115105If.A01();
                if (A01 != null) {
                    C65933Twe c65933Twe = (C65933Twe) this.A03;
                    C97X c97x = (C97X) this.A01;
                    c65933Twe.A00.A01(C97J.A00, A01.getMessage());
                    c97x.onError(A01);
                }
                i = -602468353;
                break;
            case 2:
                A0N = C0f9.A03(-1705649824);
                C14360o3.A0B(abstractC115105If, 0);
                Throwable A012 = abstractC115105If.A01();
                if (A012 != null) {
                    C69589Vrs c69589Vrs = (C69589Vrs) this.A03;
                    C50679MYx c50679MYx = (C50679MYx) this.A02;
                    InterfaceC09390do interfaceC09390do = c69589Vrs.A03;
                    C70075W1s c70075W1s = (C70075W1s) interfaceC09390do.getValue();
                    String message = A012.getMessage();
                    C14360o3.A0B(c50679MYx, 0);
                    C70075W1s.A00(c70075W1s, "client_fetch_cached_info_failure", "client_fetch_cached_info", c50679MYx.A00, c50679MYx.A01, message);
                    C70075W1s.A00((C70075W1s) interfaceC09390do.getValue(), "client_clear_local_cache", "client_local_cache", c50679MYx.A00, c50679MYx.A01, null);
                    C68718Vau c68718Vau = c69589Vrs.A00;
                    AbstractC19590xm.A09(c68718Vau.A00, new C50259MHo(c68718Vau, 44));
                }
                i = -1582313666;
                break;
            case 3:
                A0N = C0f9.A03(-271276892);
                ((XDI) this.A02).DFk(null, "failed to update budget and duration");
                i = 2030672610;
                break;
            case 4:
                A0N = C0f9.A03(1607005201);
                C14360o3.A0B(abstractC115105If, 0);
                super.onFail(abstractC115105If);
                C55071OaR c55071OaR = (C55071OaR) this.A03;
                if (c55071OaR.A02) {
                    c55071OaR.A04.A02.setVisibility(8);
                    c55071OaR.A02 = false;
                }
                c55071OaR.A08.invoke();
                i = -1278216820;
                break;
            case 5:
                A0N = C0f9.A03(-2042636409);
                W69.A00((W69) this.A01, (MediaMapQuery) this.A03);
                i = 636947344;
                break;
            case 6:
            default:
                super.onFail(abstractC115105If);
                return;
            case 7:
                A0N = C0f9.A03(-444306651);
                C58444PvN c58444PvN = (C58444PvN) this.A03;
                Throwable A013 = abstractC115105If.A01();
                if (A013 != null) {
                    illegalStateException = (Throwable) S84.A00.apply(A013);
                } else {
                    illegalStateException = new IllegalStateException();
                }
                c58444PvN.A03(SSG.A01(illegalStateException));
                i = 749886130;
                break;
            case 8:
                A0N = C0f9.A03(199940589);
                C9GR.A0B(((C69661Vt2) this.A01).A06.getRootActivity(), "something_went_wrong");
                i = -606483138;
                break;
            case 9:
                A0N = C0f9.A03(547848454);
                InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) this.A02;
                C131845xK.A00((C6FQ) this.A01, C6FW.A01, interfaceC103384lE);
                i = -1364552521;
                break;
        }
        C0f9.A0A(i, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        switch (this.A00) {
            case 3:
                A03 = C0f9.A03(-147498758);
                i = 1162091320;
                break;
            case 8:
                A03 = C0f9.A03(645449418);
                AbstractC35261Fgv.A02((Activity) this.A02);
                IgdsButton igdsButton = ((C69661Vt2) this.A01).A06.A08;
                if (igdsButton != null) {
                    igdsButton.setLoading(false);
                }
                i = 1623676204;
                break;
            default:
                super.onFinish();
                return;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        switch (this.A00) {
            case 3:
                A03 = C0f9.A03(-714329527);
                super.onStart();
                ((XDI) this.A02).onStart();
                i = 75398315;
                break;
            case 4:
                A03 = C0f9.A03(-645166339);
                super.onStart();
                ((C55071OaR) this.A03).A02();
                i = -2053681156;
                break;
            case 5:
                A03 = C0f9.A03(1613856840);
                W69 w69 = (W69) this.A01;
                java.util.Set set = w69.A05;
                MediaMapQuery mediaMapQuery = (MediaMapQuery) this.A03;
                set.add(mediaMapQuery);
                Iterator it = w69.A06.iterator();
                while (it.hasNext()) {
                    ((XDN) it.next()).Do7(w69, mediaMapQuery);
                }
                i = -1193694778;
                break;
            default:
                super.onStart();
                return;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x05d6, code lost:
    
        if (r1 != r8) goto L141;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0626  */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, X.1vN] */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 1790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Tx4.onSuccess(java.lang.Object):void");
    }
}
