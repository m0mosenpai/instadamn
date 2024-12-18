package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.react.bridge.ReadableMap;
import com.instagram.actionbar.ActionButton;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* loaded from: classes10.dex */
public final class TRL implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ReadableMap A02;
    public final /* synthetic */ IgReactNavigatorModule A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public TRL(ReadableMap readableMap, IgReactNavigatorModule igReactNavigatorModule, String str, String str2, double d, int i) {
        this.A03 = igReactNavigatorModule;
        this.A00 = d;
        this.A05 = str;
        this.A04 = str2;
        this.A02 = readableMap;
        this.A01 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        Activity A01 = AbstractC58321PtD.A0b(this.A03).A01();
        if ((A01 instanceof FragmentActivity) && A01 != null && AbstractC62820SSs.A01(A01, (int) this.A00) && (A01 instanceof C2d4)) {
            C56352iT A03 = C56352iT.A0t.A03(A01);
            ViewOnClickListenerC63507Soa viewOnClickListenerC63507Soa = new ViewOnClickListenerC63507Soa(this, 13);
            A03.Ect(this.A05, viewOnClickListenerC63507Soa);
            String str = this.A04;
            if (str != null) {
                z = true;
                if (str.equals("loading")) {
                    A03.setIsLoading(true);
                    return;
                }
                if (str.equals(NetInfoModule.CONNECTION_TYPE_NONE)) {
                    A03.EkH(null, false);
                    return;
                }
                ReadableMap readableMap = this.A02;
                if (readableMap.hasKey("enabled")) {
                    z = readableMap.getBoolean("enabled");
                }
                int i = this.A01;
                int A08 = AbstractC53242c7.A08(A01);
                int contentDescriptionForIconType = IgReactNavigatorModule.contentDescriptionForIconType(str);
                ActionButton actionButton = (ActionButton) A03.A0T.getView();
                actionButton.setVisibility(0);
                actionButton.setButtonResource(i);
                C0fQ.A00(viewOnClickListenerC63507Soa, actionButton);
                actionButton.setBackgroundResource(AbstractC53242c7.A0H(C56352iT.A00(A03), R.attr.actionBarBackground));
                actionButton.setColorFilter(C3DY.A00(C56352iT.A00(A03).getColor(A08)));
                AbstractC31172DnG.A1E(A03.A0O.getResources(), actionButton, contentDescriptionForIconType);
                A03.setIsLoading(false);
            } else {
                ReadableMap readableMap2 = this.A02;
                if (!readableMap2.hasKey("enabled")) {
                    return;
                } else {
                    z = readableMap2.getBoolean("enabled");
                }
            }
            A03.ARS(z);
        }
    }
}
