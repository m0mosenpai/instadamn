package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.3t5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC86333t5 {
    public static final ViewOnClickListenerC77633dn A00(UserSession userSession, C38321qM c38321qM, C38321qM c38321qM2, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, InterfaceC86303t2 interfaceC86303t2, final C3YD c3yd, boolean z) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c38321qM2, 1);
        C14360o3.A0B(c75113Zb, 2);
        C14360o3.A0B(interfaceC86303t2, 3);
        C14360o3.A0B(interfaceC60442pS, 5);
        return new ViewOnClickListenerC77633dn(userSession, null, new C9FM(9, interfaceC60442pS, userSession, c38321qM), new C207379Fq(userSession, null, c75113Zb, c38321qM, c38321qM2, interfaceC60442pS, interfaceC86303t2, new AbstractC86353t7() { // from class: X.3t6
            @Override // X.AbstractC86353t7, X.InterfaceC86363t8
            public final void CwQ(float f) {
                C3YD.this.A0C = true;
            }

            @Override // X.AbstractC86353t7, X.InterfaceC86363t8
            public final void DB6() {
                C3YD c3yd2 = C3YD.this;
                c3yd2.A0C = false;
                c3yd2.A0C();
                c3yd2.A0B();
            }

            @Override // X.AbstractC86353t7, X.InterfaceC86363t8
            public final void DId(Integer num) {
                C3YD.this.A0C = true;
            }
        }, c3yd, 1, z), true);
    }

    public static final void A01(UserSession userSession, C38321qM c38321qM, C38321qM c38321qM2, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, InterfaceC86303t2 interfaceC86303t2, C3YE c3ye, C3YD c3yd, InterfaceC86363t8 interfaceC86363t8) {
        String str;
        Product product;
        User user;
        C3YE c3ye2 = c3ye;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c38321qM2, 1);
        C14360o3.A0B(c75113Zb, 2);
        C14360o3.A0B(interfaceC86303t2, 3);
        C14360o3.A0B(interfaceC60442pS, 4);
        C14360o3.A0B(userSession, 5);
        C14360o3.A0B(interfaceC86363t8, 6);
        C14360o3.A0B(c3yd, 7);
        if (c3ye == null) {
            c3ye2 = AbstractC76193bO.A02(userSession, c38321qM, c38321qM2);
        }
        int A16 = c38321qM.A16(userSession);
        int ordinal = c3ye2.ordinal();
        switch (c75113Zb.A07(A16, ordinal).A00.intValue()) {
            case 0:
                str = "HIDDEN";
                break;
            case 1:
                str = "ICON_ONLY";
                break;
            default:
                str = "EXPANDED";
                break;
        }
        String name = c3ye2.name();
        String id = c38321qM.getId();
        if (id != null) {
            EnumC40111tc BRp = c38321qM.BRp();
            C19280xC A00 = C19280xC.A00(interfaceC60442pS, "instagram_media_tag_indicator_tapped");
            A00.A0C("indicator_state", str);
            A00.A0C("indicator_type", name);
            A00.A0C("m_pk", id);
            A00.A08(Integer.valueOf(BRp.A00), "m_t");
            AbstractC11060iN.A00(userSession).EHW(A00);
            switch (ordinal) {
                case 1:
                case 2:
                    interfaceC86303t2.DY7(c38321qM, c75113Zb, interfaceC86363t8);
                    return;
                case 3:
                case 4:
                    ArrayList A3S = c38321qM.A3S(true);
                    if (A3S != null && (product = (Product) AbstractC001800i.A0J(A3S)) != null && (user = product.A0B) != null) {
                        interfaceC86303t2.DbR(c38321qM, c75113Zb, interfaceC86363t8, user, c3yd.A0B);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                case 5:
                    interfaceC86303t2.D56(c3yd.A09(), EnumC120795dP.A0b, interfaceC60442pS, c38321qM, c75113Zb);
                    return;
                case 6:
                    interfaceC86303t2.D5S(c38321qM);
                    return;
                case 7:
                    interfaceC86303t2.Dwr(c38321qM, c75113Zb, interfaceC86363t8, new C43037J1d(userSession, c38321qM, c75113Zb, c3ye2, c3yd));
                    return;
                case 8:
                    interfaceC86303t2.DIj(interfaceC60442pS, c38321qM2);
                    return;
                case 9:
                    interfaceC86303t2.D5b(c38321qM);
                    return;
                case 10:
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                case 14:
                case Process.SIGTERM /* 15 */:
                default:
                    return;
                case 11:
                    interfaceC86303t2.DKm(c3yd.A09(), c38321qM, c75113Zb, c38321qM2.A0C.CDj());
                    return;
                case 16:
                    interfaceC86303t2.DLD(interfaceC60442pS, c38321qM);
                    return;
            }
        }
        throw new IllegalStateException("Required value was null.");
    }
}
