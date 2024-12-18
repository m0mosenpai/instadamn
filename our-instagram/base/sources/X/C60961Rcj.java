package X;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC192918gX;
import X.C0f9;
import X.C126545np;
import X.C1338462s;
import X.C60961Rcj;
import X.C62862tP;
import X.C6T7;
import X.C6T8;
import X.InterfaceC16820sZ;
import X.ViewTreeObserverOnPreDrawListenerC55504Okx;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.browser.lite.ipc.IABBloksGraphQLCallback;
import com.instagram.common.session.UserSession;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Rcj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60961Rcj extends AbstractC61526Rp1 implements InterfaceC65552TmV, BDU, InterfaceC65292ThP {
    public FrameLayout A00;
    public C62862tP A01;
    public C6T7 A02;
    public String A03;
    public final Map A08 = AbstractC166987dD.A1G();
    public final C63B A07 = C63B.A01;
    public AtomicReference A06 = new AtomicReference(null);
    public AtomicReference A05 = new AtomicReference(null);
    public AtomicReference A04 = new AtomicReference(null);

    @Override // X.BDU
    public final void ATZ(Context context, Bundle bundle, Bundle bundle2, UserSession userSession, String str) {
        C66246U5q c66246U5q;
        C62862tP c62862tP = this.A01;
        if (c62862tP != null && (c66246U5q = (C66246U5q) this.A04.get()) != null) {
            AbstractC33787EwD.A00(c62862tP, c66246U5q);
        }
    }

    @Override // X.InterfaceC65552TmV
    public final View B7m() {
        return this.A00;
    }

    @Override // X.InterfaceC65552TmV
    public final void Dx8(String str, Object obj) {
        Map map = this.A08;
        map.put("current_url", obj);
        C6T7 c6t7 = this.A02;
        if (c6t7 != null) {
            c6t7.A08(map);
        }
    }

    @Override // X.BDU
    public final void E61() {
        C66246U5q c66246U5q;
        C62862tP c62862tP = this.A01;
        if (c62862tP != null && (c66246U5q = (C66246U5q) this.A05.get()) != null) {
            AbstractC33787EwD.A00(c62862tP, c66246U5q);
        }
    }

    @Override // X.InterfaceC65552TmV
    public final void EGk(View view, final FragmentActivity fragmentActivity, C38678GzJ c38678GzJ, final InterfaceC11380iw interfaceC11380iw, final UserSession userSession, C38321qM c38321qM, final InterfaceC16820sZ interfaceC16820sZ) {
        ViewStub viewStub;
        String str = c38678GzJ.A03;
        String str2 = c38678GzJ.A05;
        String str3 = c38678GzJ.A04;
        String str4 = c38678GzJ.A08;
        Bundle bundle = (Bundle) c38678GzJ.A00;
        if (C18U.A06(C06090Tz.A05, userSession, 36324698790965662L) && (viewStub = (ViewStub) view.findViewById(R.id.ig_expandable_footer_stub)) != null) {
            this.A00 = (FrameLayout) AbstractC31173DnH.A0E(viewStub, R.layout.ig_expandable_footer).requireViewById(R.id.ig_expandable_footer);
            this.A08.put("current_url", str);
            C63305ShB A00 = C63305ShB.A00();
            C63305ShB.A02(new C58864QDj(bundle, A00, new IABBloksGraphQLCallback.Stub() { // from class: com.instagram.inappbrowser.extensions.bloks.IgBloksIABExtension$fetchBloksFooterTemplate$1
                {
                    C0f9.A0A(-242512065, C0f9.A03(-765568085));
                }

                @Override // com.facebook.browser.lite.ipc.IABBloksGraphQLCallback
                public final void D1B(String str5) {
                    int A0N = AbstractC167017dG.A0N(str5, 1230418616);
                    C60961Rcj c60961Rcj = this;
                    C1338462s A002 = AbstractC192918gX.A00(c60961Rcj.A07, str5, null);
                    UserSession userSession2 = userSession;
                    FragmentActivity fragmentActivity2 = fragmentActivity;
                    C62862tP A04 = C62862tP.A04(fragmentActivity2, interfaceC11380iw, userSession2);
                    FrameLayout frameLayout = c60961Rcj.A00;
                    if (frameLayout != null) {
                        InterfaceC16820sZ interfaceC16820sZ2 = interfaceC16820sZ;
                        C126545np c126545np = new C126545np(AbstractC166997dE.A0L(frameLayout));
                        frameLayout.addView(c126545np);
                        if (A002 != null) {
                            C6T8 A003 = C6T7.A00(fragmentActivity2, A002, A04);
                            A003.A01 = c60961Rcj.A08;
                            C6T7 A004 = A003.A00();
                            c60961Rcj.A02 = A004;
                            A004.A07(c126545np);
                            frameLayout.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC55504Okx(2, interfaceC16820sZ2, frameLayout));
                        }
                    }
                    C0f9.A0A(-1211549265, A0N);
                }
            }, str2, str3, str4), A00, false);
        }
    }

    @Override // X.BDU
    public final boolean EiD() {
        C66246U5q c66246U5q;
        Object A02;
        C62862tP c62862tP = this.A01;
        if (c62862tP == null || (c66246U5q = (C66246U5q) this.A06.get()) == null || (A02 = C6FP.A02(c62862tP.A03, c66246U5q, c62862tP, C6FW.A01, AbstractC06930Yk.A0E())) == null) {
            return false;
        }
        if (A02 instanceof Boolean) {
            return AbstractC166987dD.A1a(A02);
        }
        return C14360o3.A0K(A02.toString(), "true");
    }
}
