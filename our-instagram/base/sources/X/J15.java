package X;

import com.facebook.react.modules.core.RCTNativeAppEventEmitter;
import com.instagram.react.modules.product.IgReactShoppingPickerModule;
import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;

/* loaded from: classes7.dex */
public final class J15 implements InterfaceC43425JGp {
    public final int A00;
    public final Object A01;

    public J15(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC43425JGp
    public final void Dyd(int i) {
        switch (this.A00) {
            case 0:
                R3M reactApplicationContextIfActiveOrWarn = ((RunnableC43147J5k) this.A01).A01.getReactApplicationContextIfActiveOrWarn();
                if (reactApplicationContextIfActiveOrWarn == null) {
                    return;
                }
                ((RCTNativeAppEventEmitter) reactApplicationContextIfActiveOrWarn.A03(RCTNativeAppEventEmitter.class)).emit(IgReactShoppingPickerModule.PICKER_VALUE_SELECTED, Integer.valueOf(i));
                return;
            case 1:
                InterfaceC43425JGp interfaceC43425JGp = ((MerchantShoppingCartFragment) this.A01).A0K;
                if (interfaceC43425JGp == null) {
                    return;
                }
                interfaceC43425JGp.Dyd(i);
                return;
            default:
                C38941HCq c38941HCq = (C38941HCq) this.A01;
                if (c38941HCq.A02) {
                    AbstractC25651Mw.A00(c38941HCq.A00).E4s(new C42246InW(i));
                } else {
                    InterfaceC43425JGp interfaceC43425JGp2 = c38941HCq.A01;
                    if (interfaceC43425JGp2 != null) {
                        interfaceC43425JGp2.Dyd(i);
                    }
                }
                AbstractC25226BEj.A1Q(c38941HCq);
                return;
        }
    }
}
