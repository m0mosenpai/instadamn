package X;

import android.media.AudioManager;
import android.view.KeyEvent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.IeQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41751IeQ {
    public static final void A00(FragmentActivity fragmentActivity, C116875Qr c116875Qr, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, Long l, String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC167027dH.A13(userSession, interfaceC60442pS, c38321qM);
        AbstractC167017dG.A1U(str, str2);
        String id = c38321qM.getId();
        if (!z3) {
            AbstractC37670Gi3.A0Y(interfaceC60442pS, userSession, c38321qM, null, id, i);
        }
        c116875Qr.A1D = id;
        c116875Qr.A1C = str;
        c116875Qr.A1G = str2;
        c116875Qr.A1h = z2;
        c116875Qr.A1d = false;
        c116875Qr.A0a = l;
        c116875Qr.A0k = str3;
        c116875Qr.A1u = z4;
        if (C14360o3.A0K(userSession.userId, AbstractC25233BEq.A0o(c38321qM))) {
            c116875Qr.A0o = fragmentActivity.getString(2131973250);
        }
        if (!z && !c38321qM.A5R()) {
            C77453dV.A07(fragmentActivity, c116875Qr.A00(), userSession, false, false);
        } else {
            A01(fragmentActivity, c116875Qr, userSession, z);
        }
    }

    public static final void A01(FragmentActivity fragmentActivity, C116875Qr c116875Qr, UserSession userSession, boolean z) {
        boolean A1R = AbstractC167007dF.A1R(0, fragmentActivity, userSession);
        ClipsViewerConfig A00 = c116875Qr.A00();
        if (z) {
            C77453dV.A07(fragmentActivity, A00, userSession, A1R, false);
        } else {
            C77453dV.A07(fragmentActivity, A00, userSession, false, false);
        }
    }

    public static final void A02(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, Long l, String str, String str2, String str3, String str4, int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        ClipsViewerSource clipsViewerSource;
        AbstractC167007dF.A1F(userSession, 1, str);
        C06090Tz A0j = AbstractC25225BEi.A0j(str3, 8);
        if (!C18U.A06(A0j, userSession, 36326867749320874L) || ((C18U.A06(A0j, userSession, 36326867749386411L) && C1BU.A00().A03()) || (C18U.A06(A0j, userSession, 36326867749451948L) && C1BU.A00().A02()))) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c38321qM.A59() && z4) {
            C4VX c4vx = new C4VX(fragmentActivity, userSession, c38321qM.CFR(), str);
            c4vx.A02 = true;
            C4VZ.A00(c4vx.A00());
        }
        if (c38321qM.A4r()) {
            clipsViewerSource = ClipsViewerSource.A1a;
        } else if (z) {
            clipsViewerSource = ClipsViewerSource.A2E;
        } else {
            clipsViewerSource = ClipsViewerSource.A20;
        }
        A00(fragmentActivity, new C116875Qr(clipsViewerSource, userSession), userSession, c38321qM, interfaceC60442pS, l, str2, str3, str4, i, z2, false, false, z3);
    }

    public static final void A03(AbstractC59962oe abstractC59962oe, UserSession userSession, String str, ArrayList arrayList) {
        AbstractC167017dG.A1Q(userSession, str);
        C62832tM A00 = AbstractC62822tL.A00(userSession);
        ArrayList A10 = AbstractC31174DnI.A10(A00);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A10.add(C128085qc.A02(AbstractC31172DnG.A0i(it)));
        }
        A00.A03(AbstractC37302Gc3.A0D(InterfaceC111084zP.A00, true), EnumC125615m7.A03, str, A10, true, true);
        abstractC59962oe.registerLifecycleListener(new HH7(abstractC59962oe, A00, str));
    }

    public static final void A04(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, int i) {
        float f;
        if (i != -3) {
            if (i != -2) {
                if (i != -1) {
                    if (i != 1 && i != 2 && i != 3 && i != 4) {
                        return;
                    } else {
                        f = 1.0f;
                    }
                } else {
                    interfaceC16820sZ.invoke();
                    return;
                }
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.5f;
        }
        interfaceC16660sJ.invoke(Float.valueOf(f));
    }

    public static final boolean A05(AudioManager audioManager, KeyEvent keyEvent, InterfaceC16820sZ interfaceC16820sZ, int i) {
        int i2;
        C14360o3.A0B(audioManager, 2);
        if (keyEvent != null && keyEvent.getAction() == 0) {
            if (i != 25) {
                if (i == 24) {
                    i2 = 1;
                }
            } else {
                i2 = -1;
            }
            audioManager.adjustStreamVolume(3, i2, 1);
            if (audioManager.getStreamVolume(3) == 0) {
                interfaceC16820sZ.invoke();
            }
            return true;
        }
        return false;
    }
}
