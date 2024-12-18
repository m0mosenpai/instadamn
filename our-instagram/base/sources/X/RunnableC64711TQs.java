package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.TQs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64711TQs implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ IgReactNavigatorModule A02;
    public final /* synthetic */ String A03;

    public RunnableC64711TQs(IgReactNavigatorModule igReactNavigatorModule, String str, double d, int i) {
        this.A02 = igReactNavigatorModule;
        this.A00 = d;
        this.A03 = str;
        this.A01 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity A01 = AbstractC58321PtD.A0b(this.A02).A01();
        if ((A01 instanceof FragmentActivity) && A01 != null && AbstractC62820SSs.A01(A01, (int) this.A00) && (A01 instanceof C2d4)) {
            C56352iT A03 = C56352iT.A0t.A03(A01);
            String str = this.A03;
            if (str.equals(NetInfoModule.CONNECTION_TYPE_NONE)) {
                A03.EkS(false);
                return;
            }
            C3LO c3lo = new C3LO();
            c3lo.A01(this.A01);
            c3lo.A05 = IgReactNavigatorModule.contentDescriptionForIconType(str);
            c3lo.A0G = new ViewOnClickListenerC63507Soa(this, 12);
            A03.Ehd(new C3LY(c3lo));
            A03.A0U(R.attr.glyphColorPrimary);
        }
    }
}
