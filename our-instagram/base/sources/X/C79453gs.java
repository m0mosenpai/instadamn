package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3gs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79453gs {
    public final UserSession A00;

    public C79453gs(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final boolean A01(UserSession userSession, C38321qM c38321qM, boolean z) {
        List list;
        C14360o3.A0B(c38321qM, 1);
        C76473br c76473br = AbstractC101714hg.A00;
        ArrayList A3O = c38321qM.A3O();
        if (A3O != null) {
            list = AbstractC001800i.A0a(A3O);
        } else {
            list = null;
        }
        if (list == null || list.isEmpty() || !z || !c38321qM.A6L() || !AbstractC76503bu.A00(userSession, c38321qM)) {
            if (!C76513bv.A02(c38321qM)) {
                return false;
            }
            if ((c38321qM.Cff() && !AbstractC76273bX.A02(c38321qM)) || c38321qM.A4o() || c38321qM.A5r()) {
                return false;
            }
            if (((!AbstractC76503bu.A00(userSession, c38321qM) || !AbstractC76503bu.A01(userSession, c38321qM)) && (AbstractC76503bu.A00(userSession, c38321qM) || !AbstractC76503bu.A01(userSession, c38321qM))) || c76473br.A01(userSession, c38321qM) == -1) {
                return false;
            }
        }
        return true;
    }

    public final boolean A02(InterfaceC11380iw interfaceC11380iw, C38321qM c38321qM, C38321qM c38321qM2) {
        return A00(interfaceC11380iw, c38321qM, AbstractC76193bO.A02(this.A00, c38321qM, c38321qM2));
    }

    public static final boolean A00(InterfaceC11380iw interfaceC11380iw, C38321qM c38321qM, C3YE c3ye) {
        switch (c3ye.ordinal()) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
            case Process.SIGTERM /* 15 */:
            case 16:
                return true;
            case 4:
                return C5L4.A03(c38321qM);
            case 10:
                return AbstractC40652I0k.A00(interfaceC11380iw, c38321qM);
            default:
                return false;
        }
    }
}
