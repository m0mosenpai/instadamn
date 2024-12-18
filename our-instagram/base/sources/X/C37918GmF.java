package X;

import android.media.AudioManager;
import android.view.KeyEvent;
import java.util.Iterator;

/* renamed from: X.GmF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37918GmF implements InterfaceC60022ok {
    public final int A00;
    public final Object A01;

    public C37918GmF(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC60022ok
    public final boolean onVolumeKeyPressed(EnumC37329GcX enumC37329GcX, KeyEvent keyEvent) {
        switch (this.A00) {
            case 0:
                boolean A1R = AbstractC167007dF.A1R(0, enumC37329GcX, keyEvent);
                C136946Hx c136946Hx = (C136946Hx) this.A01;
                if (C136946Hx.A00(c136946Hx).A0E()) {
                    if (c136946Hx.A06()) {
                        if (enumC37329GcX == EnumC37329GcX.A03) {
                            c136946Hx.A02(Integer.valueOf(keyEvent.getKeyCode()), false);
                            return true;
                        }
                        return false;
                    }
                    if (enumC37329GcX == EnumC37329GcX.A02) {
                        AudioManager audioManager = c136946Hx.A03;
                        C14360o3.A0B(audioManager, 0);
                        if (audioManager.getStreamVolume(3) == 0) {
                            c136946Hx.A02(Integer.valueOf(keyEvent.getKeyCode()), A1R);
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                C14360o3.A0B(enumC37329GcX, 0);
                L86 l86 = (L86) this.A01;
                if (l86.A04.A0E() && AbstractC166987dD.A1a(l86.A00.getValue()) && enumC37329GcX == EnumC37329GcX.A03) {
                    l86.A00();
                    return true;
                }
                return false;
            default:
                boolean A1a = AbstractC167017dG.A1a(enumC37329GcX, keyEvent);
                C37560GgG c37560GgG = (C37560GgG) this.A01;
                C120985dq A01 = C37560GgG.A01(c37560GgG);
                if (A01 != null) {
                    int i = 25;
                    if (enumC37329GcX == EnumC37329GcX.A03) {
                        i = 24;
                    }
                    if (keyEvent.getAction() == 0) {
                        int i2 = -1;
                        if (i == 24) {
                            i2 = 1;
                        }
                        c37560GgG.A07 = A1a;
                        if (!AbstractC76643c9.A0H(c37560GgG.A0E, A01.A02)) {
                            C14120nc.A00().ATO(new C37902Glz(A01, c37560GgG, i2, i));
                        }
                        Iterator it = c37560GgG.A0I.iterator();
                        while (it.hasNext()) {
                            ((JIH) it.next()).E1U(A01, c37560GgG.A0B, c37560GgG.A0a());
                        }
                        return true;
                    }
                    return true;
                }
                return true;
        }
    }
}
