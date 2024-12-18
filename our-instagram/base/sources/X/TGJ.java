package X;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC192918gX;
import X.C0f9;
import X.C126545np;
import X.C1338462s;
import X.C62862tP;
import X.C63B;
import X.C6T7;
import X.C6T8;
import X.TGJ;
import X.ViewTreeObserverOnPreDrawListenerC55504Okx;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.browser.lite.ipc.IABBloksGraphQLCallback;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes10.dex */
public final class TGJ implements InterfaceC65575Tn9 {
    public FrameLayout A00;
    public C6T7 A01;
    public final Bundle A02;
    public final FragmentActivity A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final SCY A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final Map A0B;

    @Override // X.InterfaceC65575Tn9
    public final void DKZ() {
    }

    @Override // X.InterfaceC65575Tn9
    public final void EGj(View view) {
        ViewStub viewStub;
        if (C18U.A06(C06090Tz.A05, this.A05, 36324698790965662L) && (viewStub = (ViewStub) view.findViewById(R.id.ig_expandable_footer_stub)) != null) {
            this.A00 = (FrameLayout) AbstractC31173DnH.A0E(viewStub, R.layout.ig_expandable_footer).requireViewById(R.id.ig_expandable_footer);
            this.A0B.put("current_url", this.A07);
            C63305ShB A00 = C63305ShB.A00();
            C63305ShB.A02(new C58864QDj(this.A02, A00, new IABBloksGraphQLCallback.Stub() { // from class: com.instagram.inappbrowser.igbloks.IGBloksFooterController$fetchFromGraphQL$1
                {
                    C0f9.A0A(-1357821988, C0f9.A03(548460781));
                }

                @Override // com.facebook.browser.lite.ipc.IABBloksGraphQLCallback
                public final void D1B(String str) {
                    int A0N = AbstractC167017dG.A0N(str, -1189836801);
                    C1338462s A002 = AbstractC192918gX.A00(C63B.A01, str, null);
                    TGJ tgj = TGJ.this;
                    UserSession userSession = tgj.A05;
                    FragmentActivity fragmentActivity = tgj.A03;
                    C62862tP A04 = C62862tP.A04(fragmentActivity, tgj.A04, userSession);
                    FrameLayout frameLayout = tgj.A00;
                    if (frameLayout != null) {
                        C126545np c126545np = new C126545np(AbstractC166997dE.A0L(frameLayout));
                        frameLayout.addView(c126545np);
                        if (A002 != null) {
                            C6T8 A003 = C6T7.A00(fragmentActivity, A002, A04);
                            A003.A01 = tgj.A0B;
                            C6T7 A004 = A003.A00();
                            tgj.A01 = A004;
                            A004.A07(c126545np);
                            frameLayout.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC55504Okx(3, frameLayout, tgj));
                        }
                    }
                    C0f9.A0A(-279241935, A0N);
                }
            }, this.A09, this.A08, this.A0A), A00, false);
        }
    }

    @Override // X.InterfaceC65575Tn9
    public final void onDestroyView() {
    }

    @Override // X.InterfaceC65575Tn9
    public final View B7m() {
        return this.A00;
    }

    @Override // X.InterfaceC65575Tn9
    public final void Dx8(String str, Object obj) {
        Map map = this.A0B;
        map.put("current_url", obj);
        C6T7 c6t7 = this.A01;
        if (c6t7 != null) {
            c6t7.A08(map);
        }
    }

    public TGJ(Bundle bundle, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, SCY scy, String str, String str2, String str3, String str4) {
        JQ0.A1O(userSession, str, str2, fragmentActivity, interfaceC11380iw);
        C14360o3.A0B(str4, 7);
        C14360o3.A0B(scy, 9);
        this.A05 = userSession;
        this.A09 = str;
        this.A07 = str2;
        this.A03 = fragmentActivity;
        this.A04 = interfaceC11380iw;
        this.A0A = str3;
        this.A08 = str4;
        this.A02 = bundle;
        this.A06 = scy;
        this.A0B = AbstractC166987dD.A1G();
    }
}
