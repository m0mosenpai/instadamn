package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* renamed from: X.2wi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C64842wi extends AbstractC55352ga implements InterfaceC55362gb {
    public final C62862tP A00;
    public final InterfaceC08830cm A01;
    public final InterfaceC09390do A02;

    public C64842wi(final Fragment fragment, C62862tP c62862tP, final InterfaceC11380iw interfaceC11380iw, final UserSession userSession, InterfaceC55002fz interfaceC55002fz, InterfaceC55322gX interfaceC55322gX, QuickPromotionSlot quickPromotionSlot, InterfaceC55202gL interfaceC55202gL) {
        super(fragment.requireContext(), interfaceC11380iw, userSession, interfaceC55002fz, interfaceC55322gX, quickPromotionSlot, interfaceC55202gL, AbstractC09440dt.A01(new C9EO(fragment, 5)));
        InterfaceC08830cm interfaceC08830cm = null;
        if (c62862tP != null) {
            this.A00 = c62862tP;
        } else {
            interfaceC08830cm = new InterfaceC08830cm() { // from class: X.36s
                @Override // X.InterfaceC08830cm
                public final /* bridge */ /* synthetic */ Object get() {
                    Fragment fragment2 = Fragment.this;
                    UserSession userSession2 = userSession;
                    InterfaceC11380iw interfaceC11380iw2 = interfaceC11380iw;
                    if (!(fragment2 instanceof AbstractC59962oe) && !(fragment2 instanceof C38K)) {
                        throw new IllegalArgumentException("fragment type not supported");
                    }
                    return C62862tP.A02(fragment2, interfaceC11380iw2, userSession2, null);
                }
            };
        }
        this.A01 = interfaceC08830cm;
        this.A02 = AbstractC09440dt.A00(EnumC09460dv.A02, new C9EO(this, 6));
    }
}
