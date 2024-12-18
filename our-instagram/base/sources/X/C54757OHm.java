package X;

import com.facebook.rsys.audio.gen.AudioOutputRoute;

/* renamed from: X.OHm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54757OHm {
    public EnumC53278NhG A00;
    public final C51996Myi A01;

    public final void A00(EnumC53278NhG enumC53278NhG) {
        AudioOutputRoute audioOutputRoute;
        if (enumC53278NhG != this.A00) {
            this.A00 = enumC53278NhG;
            C51996Myi c51996Myi = this.A01;
            if (enumC53278NhG == null) {
                audioOutputRoute = AudioOutputRoute.UNKNOWN;
            } else {
                int ordinal = enumC53278NhG.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 3) {
                        if (ordinal != 2) {
                            if (ordinal == 1) {
                                audioOutputRoute = AudioOutputRoute.SPEAKER;
                            } else {
                                throw AbstractC167007dF.A0c("Unhandled audioOutput: ", enumC53278NhG.name());
                            }
                        } else {
                            audioOutputRoute = AudioOutputRoute.BLUETOOTH;
                        }
                    } else {
                        audioOutputRoute = AudioOutputRoute.HEADSET;
                    }
                } else {
                    audioOutputRoute = AudioOutputRoute.EARPIECE;
                }
            }
            C14360o3.A0A(audioOutputRoute);
            c51996Myi.A00(audioOutputRoute);
        }
    }

    public C54757OHm(C51996Myi c51996Myi) {
        this.A01 = c51996Myi;
    }
}
