package X;

import android.view.KeyEvent;

/* loaded from: classes11.dex */
public final class WQG implements InterfaceC71871X8e {
    public final /* synthetic */ InterfaceC71871X8e A00;

    public WQG(InterfaceC71871X8e interfaceC71871X8e) {
        this.A00 = interfaceC71871X8e;
    }

    @Override // X.InterfaceC71871X8e
    public final Integer Cmq(KeyEvent keyEvent) {
        if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
            long keyCode = keyEvent.getKeyCode() << 32;
            if (keyCode == AbstractC68646VZe.A08) {
                return C05F.A0S;
            }
            if (keyCode == AbstractC68646VZe.A09) {
                return C05F.A0T;
            }
            if (keyCode == AbstractC68646VZe.A0A) {
                return C05F.A0V;
            }
            if (keyCode == AbstractC68646VZe.A07) {
                return C05F.A0U;
            }
        } else if (keyEvent.isCtrlPressed()) {
            long keyCode2 = keyEvent.getKeyCode() << 32;
            if (keyCode2 == AbstractC68646VZe.A08) {
                return C05F.A0N;
            }
            if (keyCode2 == AbstractC68646VZe.A09) {
                return C05F.A0C;
            }
            if (keyCode2 == AbstractC68646VZe.A0A) {
                return C05F.A0j;
            }
            if (keyCode2 == AbstractC68646VZe.A07) {
                return C05F.A0Y;
            }
            if (keyCode2 == AbstractC68646VZe.A0C) {
                return C05F.A0B;
            }
            if (keyCode2 == AbstractC68646VZe.A06) {
                return C05F.A0F;
            }
            if (keyCode2 == AbstractC68646VZe.A02) {
                return C05F.A0E;
            }
            if (keyCode2 == AbstractC68646VZe.A01) {
                return C05F.A0b;
            }
        } else if (keyEvent.isShiftPressed()) {
            long keyCode3 = keyEvent.getKeyCode() << 32;
            if (keyCode3 == AbstractC68646VZe.A0F) {
                return C05F.A0Z;
            }
            if (keyCode3 == AbstractC68646VZe.A0E) {
                return C05F.A0a;
            }
        } else if (keyEvent.isAltPressed()) {
            long keyCode4 = keyEvent.getKeyCode() << 32;
            if (keyCode4 == AbstractC68646VZe.A02) {
                return C05F.A0G;
            }
            if (keyCode4 == AbstractC68646VZe.A06) {
                return C05F.A0H;
            }
        }
        return this.A00.Cmq(keyEvent);
    }
}
