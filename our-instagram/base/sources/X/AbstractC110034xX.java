package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.4xX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC110034xX {
    public static C123755ip A00;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A01(Fragment fragment, C56352iT c56352iT, InterfaceC56392iX interfaceC56392iX, List list) {
        C123755ip c123755ip = A00;
        if (c123755ip != null) {
            C123735in c123735in = c123755ip.A00;
            UserSession userSession = c123735in.A06;
            if (C18U.A06(C06090Tz.A06, userSession, 36319188347788320L)) {
                if (!C18U.A06(C06090Tz.A05, userSession, 36324630071357736L)) {
                    interfaceC56392iX.getView().setVisibility(8);
                }
                if ((fragment instanceof InterfaceC60042om) && !((InterfaceC60042om) fragment).getCanShowVoiceMessageBar()) {
                    c123735in.A02(true);
                    return;
                }
                BTX btx = c123735in.A01;
                if (btx != null) {
                    c123735in.A07.add(btx);
                }
                c123735in.A01 = new BTX(c56352iT, interfaceC56392iX, list);
                c123735in.A03 = new WeakReference(fragment);
                if (!C123735in.A01(c123735in)) {
                    return;
                }
                C18920wW c18920wW = ((C7DM) c123735in.A08.getValue()).A00;
                InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "audio_clips_playback_pop_out");
                if (A002.isSampled()) {
                    A002.Cht();
                }
                BTX btx2 = c123735in.A01;
                if (btx2 == null) {
                    return;
                }
                btx2.A02(true);
            }
        }
    }

    public static final void A00(Fragment fragment) {
        C7DK c7dk;
        C123755ip c123755ip = A00;
        if (c123755ip != null) {
            C123735in c123735in = c123755ip.A00;
            WeakReference weakReference = c123735in.A03;
            if ((weakReference.get() == fragment || weakReference.get() == null) && (c7dk = c123735in.A00) != null) {
                c7dk.A0B(false);
            }
        }
    }
}
