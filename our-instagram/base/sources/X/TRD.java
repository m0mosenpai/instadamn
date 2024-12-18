package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* loaded from: classes10.dex */
public final class TRD implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ ReadableMap A02;
    public final /* synthetic */ InterfaceC65532Tm2 A03;
    public final /* synthetic */ IgReactNavigatorModule A04;

    public TRD(FragmentActivity fragmentActivity, ReadableMap readableMap, InterfaceC65532Tm2 interfaceC65532Tm2, IgReactNavigatorModule igReactNavigatorModule, double d) {
        this.A04 = igReactNavigatorModule;
        this.A01 = fragmentActivity;
        this.A02 = readableMap;
        this.A00 = d;
        this.A03 = interfaceC65532Tm2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        FragmentActivity fragmentActivity = this.A01;
        C3DN A00 = C3DN.A00.A00(fragmentActivity);
        if (A00 != null && ((C3DP) A00).A0h) {
            C189478aR c189478aR = ((BottomSheetFragment) A00.A09()).A02;
            C189448aO c189448aO = new C189448aO(this.A04.mSession);
            ReadableMap readableMap = this.A02;
            if (readableMap != null && readableMap.hasKey(DialogModule.KEY_TITLE)) {
                str = readableMap.getString(DialogModule.KEY_TITLE);
            } else {
                str = null;
            }
            c189448aO.A0d = str;
            c189448aO.A03 = 0.66f;
            c189448aO.A0a = AbstractC166997dE.A0b();
            c189448aO.A0f = Integer.toString((int) this.A00);
            AbstractC27401Ut.getInstance().getFragmentFactory();
            Bundle AEf = this.A03.AEf();
            Rb1 rb1 = new Rb1();
            rb1.setArguments(AEf);
            c189478aR.A0E(rb1, c189448aO);
            return;
        }
        C140966Yy EqV = this.A03.EqV(fragmentActivity);
        EqV.A0A = Integer.toString((int) this.A00);
        EqV.A04();
    }
}
