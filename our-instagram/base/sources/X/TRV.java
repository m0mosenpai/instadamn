package X;

import android.view.View;
import android.view.Window;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.UIManagerModule;

/* loaded from: classes10.dex */
public abstract class TRV implements Runnable {
    public final InterfaceC65352Tig A00;

    public TRV(Q21 q21) {
        InterfaceC65352Tig interfaceC65352Tig = q21.A00;
        if (interfaceC65352Tig == null) {
            interfaceC65352Tig = new T06(q21);
            q21.A00 = interfaceC65352Tig;
        }
        this.A00 = interfaceC65352Tig;
    }

    public void A00() {
        ViewOnApplyWindowInsetsListenerC63495SoA viewOnApplyWindowInsetsListenerC63495SoA;
        R3N reactContext;
        if (this instanceof R37) {
            R37 r37 = (R37) this;
            Q4U q4u = r37.A01;
            UIManagerModule uIManagerModule = (UIManagerModule) q4u.A01.A01.A04(UIManagerModule.class);
            if (uIManagerModule != null) {
                int id = q4u.getId();
                C02I c02i = r37.A00;
                uIManagerModule.updateInsetsPadding(id, c02i.A03, c02i.A01, c02i.A00, c02i.A02);
                return;
            }
            return;
        }
        if (this instanceof R35) {
            R6X r6x = ((R35) this).A00;
            reactContext = r6x.getReactContext();
            UIManagerModule uIManagerModule2 = (UIManagerModule) reactContext.A01.A04(UIManagerModule.class);
            if (uIManagerModule2 == null) {
                return;
            }
            uIManagerModule2.updateNodeSize(r6x.getId(), r6x.A01, r6x.A00);
            return;
        }
        if (this instanceof R34) {
            SZN.A00(((R34) this).A00);
            return;
        }
        if (this instanceof R39) {
            R39 r39 = (R39) this;
            UIManagerModule uIManagerModule3 = r39.A03;
            C63339Sht c63339Sht = uIManagerModule3.mUIImplementation;
            int i = r39.A01;
            int i2 = r39.A02;
            int i3 = r39.A00;
            ReactShadowNode A00 = c63339Sht.A04.A00(i);
            if (A00 == null) {
                AbstractC58322PtE.A1P("Tried to update non-existent root tag: ", i);
            } else {
                ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) A00;
                reactShadowNodeImpl.A0D = Integer.valueOf(i2);
                reactShadowNodeImpl.A0C = Integer.valueOf(i3);
            }
            uIManagerModule3.mUIImplementation.A04(-1);
            return;
        }
        if (this instanceof R38) {
            R38 r38 = (R38) this;
            C63339Sht c63339Sht2 = r38.A01.mUIImplementation;
            int i4 = r38.A00;
            Object obj = r38.A02;
            ReactShadowNode A002 = c63339Sht2.A04.A00(i4);
            if (A002 == null) {
                AbstractC58322PtE.A1P("Attempt to set local data for view with unknown tag: ", i4);
                return;
            } else {
                A002.EYU(obj);
                C63339Sht.A03(c63339Sht2);
                return;
            }
        }
        R36 r36 = (R36) this;
        Window window = r36.A00.getWindow();
        if (window == null) {
            return;
        }
        boolean z = r36.A01;
        View decorView = window.getDecorView();
        if (z) {
            viewOnApplyWindowInsetsListenerC63495SoA = ViewOnApplyWindowInsetsListenerC63495SoA.A00;
        } else {
            viewOnApplyWindowInsetsListenerC63495SoA = null;
        }
        decorView.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC63495SoA);
        window.getDecorView().requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            A00();
        } catch (RuntimeException e) {
            this.A00.handleException(e);
        }
    }
}
