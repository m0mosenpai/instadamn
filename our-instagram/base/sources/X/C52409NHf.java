package X;

/* renamed from: X.NHf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52409NHf extends C8T9 {
    public final int A00;
    public final int A01;
    public final Integer A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52409NHf) {
                C52409NHf c52409NHf = (C52409NHf) obj;
                if (this.A02 != c52409NHf.A02 || this.A00 != c52409NHf.A00 || this.A01 != c52409NHf.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 1:
                str = "MUSIC_AUDIO";
                break;
            case 2:
                str = "VOICEOVER";
                break;
            case 3:
                str = "SOUND_EFFECT";
                break;
            default:
                str = "CAMERA_AUDIO";
                break;
        }
        return ((AbstractC25228BEl.A0F(str, intValue) + this.A00) * 31) + this.A01;
    }

    public C52409NHf(Integer num, int i, int i2) {
        this.A02 = num;
        this.A00 = i;
        this.A01 = i2;
    }
}
