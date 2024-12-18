package X;

import android.media.AudioManager;
import android.media.audiofx.AcousticEchoCanceler;

/* loaded from: classes9.dex */
public final class OHM {
    public final /* synthetic */ C52689NTa A00;

    public final void A00(boolean z) {
        C51906Mwo c51906Mwo;
        int i;
        C51906Mwo c51906Mwo2;
        boolean z2 = !z;
        if (z2) {
            C52689NTa c52689NTa = this.A00;
            if (!AcousticEchoCanceler.isAvailable()) {
                if (c52689NTa.A0R.A00.isSpeakerphoneOn() && !c52689NTa.A07) {
                    C54470O4y c54470O4y = c52689NTa.A0T;
                    C57520Pfu c57520Pfu = new C57520Pfu(this, 8);
                    C193328hC A0I = AbstractC31171DnF.A0I(c54470O4y.A00);
                    A0I.A0s(true);
                    A0I.A0t(true);
                    A0I.A0A(2131956923);
                    A0I.A09(2131956922);
                    A0I.A0F(DialogInterfaceOnClickListenerC55320Ogi.A00(c57520Pfu, 33));
                    A0I.A06();
                    c52689NTa.A0Q.A05(new PDV(A0I.A02(), C05F.A00));
                    c52689NTa.A07 = true;
                    return;
                }
            }
        }
        C52689NTa c52689NTa2 = this.A00;
        C51906Mwo c51906Mwo3 = (C51906Mwo) ((AbstractC55206OeJ) c52689NTa2).A01;
        if (c51906Mwo3 != null) {
            if (!c51906Mwo3.A0Z || c51906Mwo3.A0a) {
                c51906Mwo = C51906Mwo.A00(null, null, c51906Mwo3, null, null, null, null, 0.0f, 0, -1025, 2047, false, z2, false, false, false, false, false, false);
            } else {
                boolean z3 = false;
                if (!c51906Mwo3.A0c) {
                    z3 = true;
                }
                C51906Mwo c51906Mwo4 = null;
                if (z3) {
                    if (z2 && OT1.A00() > 0) {
                        c52689NTa2.A0U.F7q();
                        C51906Mwo c51906Mwo5 = (C51906Mwo) ((AbstractC55206OeJ) c52689NTa2).A01;
                        if (c51906Mwo5 != null) {
                            c51906Mwo2 = C51906Mwo.A00(null, null, c51906Mwo5, null, null, null, null, 0.0f, 0, -1025, 2047, false, true, false, false, false, false, false, false);
                        } else {
                            c51906Mwo2 = null;
                        }
                        c52689NTa2.A0J(c51906Mwo2);
                    }
                    C51906Mwo c51906Mwo6 = (C51906Mwo) ((AbstractC55206OeJ) c52689NTa2).A01;
                    if (c51906Mwo6 != null) {
                        c51906Mwo4 = C51906Mwo.A00(null, null, c51906Mwo6, null, Integer.valueOf(OT1.A00()), null, null, 0.0f, 0, -6145, 2047, false, false, true, false, false, false, false, false);
                    }
                } else {
                    AudioManager audioManager = c52689NTa2.A0R.A00;
                    if (z2) {
                        i = 100;
                    } else {
                        i = -100;
                    }
                    audioManager.adjustStreamVolume(3, i, 0);
                    c52689NTa2.A0U.F7q();
                    C55095Ob6 c55095Ob6 = c52689NTa2.A0W;
                    boolean z4 = c52689NTa2.A08;
                    c55095Ob6.A04.A00(new C56561P9h(z2));
                    if (!z4) {
                        c55095Ob6.A03.A03(EnumC53379NjU.A09, null, null);
                    }
                    C51906Mwo c51906Mwo7 = (C51906Mwo) ((AbstractC55206OeJ) c52689NTa2).A01;
                    if (c51906Mwo7 != null) {
                        c51906Mwo4 = C51906Mwo.A00(null, null, c51906Mwo7, null, Integer.valueOf(OT1.A00()), null, null, 0.0f, 0, -5121, 2047, false, z2, false, false, false, false, false, false);
                    }
                }
                c52689NTa2.A0J(c51906Mwo4);
                return;
            }
        } else {
            c51906Mwo = null;
        }
        c52689NTa2.A0J(c51906Mwo);
        c52689NTa2.A0U.F7q();
        C55095Ob6 c55095Ob62 = c52689NTa2.A0W;
        boolean z5 = c52689NTa2.A08;
        c55095Ob62.A04.A00(new C56561P9h(z2));
        if (!z5) {
            c55095Ob62.A03.A03(EnumC53379NjU.A09, null, null);
        }
    }

    public OHM(C52689NTa c52689NTa) {
        this.A00 = c52689NTa;
    }
}
