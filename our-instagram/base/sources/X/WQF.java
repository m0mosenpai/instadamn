package X;

import android.view.KeyEvent;

/* loaded from: classes11.dex */
public final class WQF implements InterfaceC71871X8e {
    public final /* synthetic */ InterfaceC16660sJ A00;

    public WQF(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC71871X8e
    public final Integer Cmq(KeyEvent keyEvent) {
        InterfaceC16660sJ interfaceC16660sJ = this.A00;
        if (((Boolean) interfaceC16660sJ.invoke(new C69732VuS(keyEvent))).booleanValue() && keyEvent.isShiftPressed()) {
            if ((keyEvent.getKeyCode() << 32) != AbstractC68646VZe.A0N) {
                return null;
            }
        } else {
            if (((Boolean) interfaceC16660sJ.invoke(new C69732VuS(keyEvent))).booleanValue()) {
                long keyCode = keyEvent.getKeyCode() << 32;
                if (keyCode != AbstractC68646VZe.A03 && keyCode != AbstractC68646VZe.A0D) {
                    if (keyCode != AbstractC68646VZe.A0K) {
                        if (keyCode != AbstractC68646VZe.A0L) {
                            if (keyCode == AbstractC68646VZe.A00) {
                                return C05F.A0I;
                            }
                            if (keyCode != AbstractC68646VZe.A0M) {
                                if (keyCode != AbstractC68646VZe.A0N) {
                                    return null;
                                }
                                return C05F.A0e;
                            }
                        }
                        return C05F.A0A;
                    }
                    return C05F.A09;
                }
                return C05F.A08;
            }
            if (keyEvent.isCtrlPressed()) {
                return null;
            }
            boolean isShiftPressed = keyEvent.isShiftPressed();
            long keyCode2 = keyEvent.getKeyCode() << 32;
            long j = AbstractC68646VZe.A08;
            if (isShiftPressed) {
                if (keyCode2 == j) {
                    return C05F.A0J;
                }
                if (keyCode2 == AbstractC68646VZe.A09) {
                    return C05F.A0K;
                }
                if (keyCode2 == AbstractC68646VZe.A0A) {
                    return C05F.A0L;
                }
                if (keyCode2 == AbstractC68646VZe.A07) {
                    return C05F.A0M;
                }
                if (keyCode2 == AbstractC68646VZe.A0H) {
                    return C05F.A0O;
                }
                if (keyCode2 == AbstractC68646VZe.A0G) {
                    return C05F.A0P;
                }
                if (keyCode2 == AbstractC68646VZe.A0F) {
                    return C05F.A0W;
                }
                if (keyCode2 == AbstractC68646VZe.A0E) {
                    return C05F.A0X;
                }
                if (keyCode2 != AbstractC68646VZe.A0D) {
                    return null;
                }
            } else {
                if (keyCode2 == j) {
                    return C05F.A00;
                }
                if (keyCode2 == AbstractC68646VZe.A09) {
                    return C05F.A01;
                }
                if (keyCode2 == AbstractC68646VZe.A0A) {
                    return C05F.A02;
                }
                if (keyCode2 == AbstractC68646VZe.A07) {
                    return C05F.A03;
                }
                if (keyCode2 == AbstractC68646VZe.A0H) {
                    return C05F.A04;
                }
                if (keyCode2 == AbstractC68646VZe.A0G) {
                    return C05F.A05;
                }
                if (keyCode2 == AbstractC68646VZe.A0F) {
                    return C05F.A0u;
                }
                if (keyCode2 == AbstractC68646VZe.A0E) {
                    return C05F.A15;
                }
                if (keyCode2 == AbstractC68646VZe.A0B) {
                    return C05F.A0c;
                }
                if (keyCode2 == AbstractC68646VZe.A02) {
                    return C05F.A0B;
                }
                if (keyCode2 == AbstractC68646VZe.A06) {
                    return C05F.A0D;
                }
                if (keyCode2 != AbstractC68646VZe.A0I) {
                    if (keyCode2 != AbstractC68646VZe.A05) {
                        if (keyCode2 != AbstractC68646VZe.A04) {
                            if (keyCode2 != AbstractC68646VZe.A0J) {
                                return null;
                            }
                            return C05F.A0d;
                        }
                        return C05F.A08;
                    }
                    return C05F.A0A;
                }
            }
            return C05F.A09;
        }
        return C05F.A0f;
    }
}
