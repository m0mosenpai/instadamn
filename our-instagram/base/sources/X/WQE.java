package X;

import android.view.KeyEvent;

/* loaded from: classes11.dex */
public final class WQE implements InterfaceC71871X8e {
    @Override // X.InterfaceC71871X8e
    public final Integer Cmq(KeyEvent keyEvent) {
        if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
            long keyCode = keyEvent.getKeyCode() << 32;
            if (keyCode == AbstractC68646VZe.A08) {
                return C05F.A0Z;
            }
            if (keyCode == AbstractC68646VZe.A09) {
                return C05F.A0a;
            }
            if (keyCode == AbstractC68646VZe.A0A) {
                return C05F.A0Q;
            }
            if (keyCode == AbstractC68646VZe.A07) {
                return C05F.A0R;
            }
        } else if (keyEvent.isAltPressed()) {
            long keyCode2 = keyEvent.getKeyCode() << 32;
            if (keyCode2 == AbstractC68646VZe.A08) {
                return C05F.A1F;
            }
            if (keyCode2 == AbstractC68646VZe.A09) {
                return C05F.A1I;
            }
            if (keyCode2 == AbstractC68646VZe.A0A) {
                return C05F.A06;
            }
            if (keyCode2 == AbstractC68646VZe.A07) {
                return C05F.A07;
            }
        }
        return AbstractC68617VXt.A00.Cmq(keyEvent);
    }
}
