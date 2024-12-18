package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.refresh.RefreshableListView;

/* renamed from: X.Ik8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnLayoutChangeListenerC42039Ik8 implements View.OnLayoutChangeListener {
    public final /* synthetic */ InterfaceC104894o0 A00;
    public final /* synthetic */ C38321qM A01;
    public final /* synthetic */ HD4 A02;
    public final /* synthetic */ String A03;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View childAt;
        boolean z;
        String str;
        Boolean BvO;
        C14360o3.A0B(view, 0);
        HD4 hd4 = this.A02;
        RefreshableListView refreshableListView = hd4.A0D;
        if (refreshableListView != null && refreshableListView.getChildCount() >= 3 && (childAt = refreshableListView.getChildAt(3)) != null) {
            int bottom = childAt.getBottom();
            int A09 = AbstractC13880nE.A09(hd4.getRootActivity());
            refreshableListView.removeOnLayoutChangeListener(this);
            float f = (A09 - bottom) / (A09 * 1.0f);
            InterfaceC104894o0 interfaceC104894o0 = this.A00;
            if (interfaceC104894o0 != null && (BvO = interfaceC104894o0.BvO()) != null) {
                z = BvO.booleanValue();
            } else {
                z = false;
            }
            C38321qM c38321qM = this.A01;
            String str2 = this.A03;
            C39394Hae c39394Hae = new C39394Hae(c38321qM, hd4, str2);
            C43021J0m c43021J0m = new C43021J0m(c38321qM, hd4);
            C64507TGv c64507TGv = new C64507TGv(1, c38321qM, hd4);
            C1M1 c1m1 = hd4.A0E;
            if (c1m1 == null) {
                str = "sessionIdProvider";
            } else {
                String sessionId = c1m1.getSessionId();
                InterfaceC09390do interfaceC09390do = hd4.A0O;
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                InterfaceC60442pS interfaceC60442pS = hd4.A0M;
                String str3 = hd4.A0F;
                str = "adId";
                if (str3 != null) {
                    SPM spm = new SPM(interfaceC60442pS, A0r, str3, sessionId, "pbia_and_browse");
                    spm.A00(f);
                    C63397SjR c63397SjR = new C63397SjR(hd4.requireActivity(), AbstractC166987dD.A0r(interfaceC09390do), C2Fb.A2p, str2, false);
                    String str4 = hd4.A0F;
                    if (str4 != null) {
                        c63397SjR.A0B(str4);
                        c63397SjR.A0C(hd4.A0G);
                        c63397SjR.A0D(AbstractC41071vF.A06(AbstractC166987dD.A0r(interfaceC09390do), c38321qM));
                        c63397SjR.A1L.A00.putString(AbstractC58317Pt9.A00(73), sessionId);
                        c63397SjR.A0z = true;
                        c63397SjR.A03 = f;
                        c63397SjR.A14 = z;
                        c63397SjR.A1B = !z;
                        c63397SjR.A0d = true;
                        c63397SjR.A11 = true;
                        c63397SjR.A18 = true;
                        c63397SjR.A19 = true;
                        c63397SjR.A0J = c39394Hae;
                        c63397SjR.A0H = c43021J0m;
                        c63397SjR.A0I = c64507TGv;
                        c63397SjR.A0K = spm;
                        c63397SjR.A1C = true;
                        UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                        C06090Tz c06090Tz = C06090Tz.A06;
                        c63397SjR.A00 = C18U.A00(c06090Tz, A0r2, 37163243911250192L);
                        c63397SjR.A0G(C18U.A06(c06090Tz, AbstractC166987dD.A0r(interfaceC09390do), 36318818981190152L));
                        c63397SjR.A17 = true;
                        if (C18U.A06(c06090Tz, AbstractC166987dD.A0r(interfaceC09390do), 36318818981255689L)) {
                            c63397SjR.A0c = false;
                            c63397SjR.A0k = true;
                            c63397SjR.A01 = 0.2f;
                            c63397SjR.A0f = true;
                            c63397SjR.A0F = new J0V(1);
                            c63397SjR.A0i = true;
                            c63397SjR.A16 = true;
                            c63397SjR.A15 = true;
                            c63397SjR.A1A = true;
                        }
                        String str5 = hd4.A0H;
                        if (str5 != null) {
                            c63397SjR.A0E(str5);
                        }
                        c63397SjR.A0A();
                        hd4.A0I = true;
                        return;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    public ViewOnLayoutChangeListenerC42039Ik8(InterfaceC104894o0 interfaceC104894o0, C38321qM c38321qM, HD4 hd4, String str) {
        this.A02 = hd4;
        this.A00 = interfaceC104894o0;
        this.A03 = str;
        this.A01 = c38321qM;
    }
}
