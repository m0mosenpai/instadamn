package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.facebook.native_bridge.NativeDataPromise;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class T8J implements C2JL {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public T8J(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        InterfaceC103384lE interfaceC103384lE;
        C6FX A0s;
        Object obj;
        switch (this.A00) {
            case 0:
                ((NativeDataPromise) this.A02).setException(th.toString());
                return;
            case 1:
                ((C62423SAy) this.A01).A00.remove(((TRG) this.A02).A02);
                return;
            case 2:
                interfaceC103384lE = (InterfaceC103384lE) this.A02;
                A0s = AbstractC25225BEi.A0s();
                obj = "";
                break;
            case 3:
                interfaceC103384lE = (InterfaceC103384lE) this.A02;
                A0s = AbstractC25225BEi.A0s();
                obj = AbstractC06930Yk.A0E();
                break;
            default:
                return;
        }
        A0s.A01(obj);
        C131845xK.A00((C6FQ) this.A01, A0s.A00(), interfaceC103384lE);
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        InterfaceC103384lE interfaceC103384lE;
        C6FX A0s;
        Object obj2;
        switch (this.A00) {
            case 0:
                try {
                    ((NativeDataPromise) this.A02).setValue(obj);
                    return;
                } catch (Exception e) {
                    ((NativeDataPromise) this.A02).setException(e.toString());
                    return;
                }
            case 1:
                ((C62423SAy) this.A01).A00.remove(((TRG) this.A02).A02);
                return;
            case 2:
                interfaceC103384lE = (InterfaceC103384lE) this.A02;
                A0s = AbstractC25225BEi.A0s();
                if (obj == null) {
                    obj = "";
                }
                A0s.A01(obj);
                break;
            case 3:
                interfaceC103384lE = (InterfaceC103384lE) this.A02;
                A0s = AbstractC31179DnN.A0I(obj);
                break;
            default:
                List list = (List) obj;
                if (list != null && !list.isEmpty()) {
                    boolean z = false;
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Map AeG = ((BrowserExtensionsAutofillData) it.next()).AeG();
                            Bundle bundle = ((InstantExperiencesJSBridgeCall) this.A02).A01;
                            if (AbstractC58320PtC.A0r(bundle, "selectedAutoCompleteTag") != null) {
                                obj2 = AbstractC58320PtC.A0r(bundle, "selectedAutoCompleteTag");
                                AbstractC25225BEi.A1S(obj2);
                            } else {
                                obj2 = "";
                            }
                            if (AeG.containsKey(obj2)) {
                                z = true;
                            }
                        }
                    }
                    C60892Rb6 c60892Rb6 = ((QDE) this.A01).A01;
                    C64453TEp c64453TEp = new C64453TEp(this);
                    View requireViewById = c60892Rb6.requireView().requireViewById(R.id.instant_experiences_autofill_bar);
                    C64454TEq c64454TEq = c60892Rb6.A00;
                    c64454TEq.A01.post(new RunnableC64709TQq(requireViewById, c64454TEq, c64453TEp, list));
                    if (z && !c60892Rb6.A02) {
                        InterfaceC19630xq A0x = AbstractC166987dD.A0x(c60892Rb6.getSession());
                        if (A0x.getInt("ix_autofill_tooltip", 0) < 3) {
                            int i = A0x.getInt("ix_autofill_tooltip", 0);
                            InterfaceC19610xo ARD = A0x.ARD();
                            ARD.E7D("ix_autofill_tooltip", i + 1);
                            ARD.apply();
                            c60892Rb6.requireView().postDelayed(new RunnableC24295Aq0(c60892Rb6), 1000L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                ((QDE) this.A01).A01.A00.A02.A00(false);
                return;
        }
        C131845xK.A00((C6FQ) this.A01, A0s.A00(), interfaceC103384lE);
    }
}
