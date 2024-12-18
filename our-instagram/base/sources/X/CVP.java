package X;

/* loaded from: classes5.dex */
public final class CVP {
    public final float A00;
    public final float A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CVP) {
                CVP cvp = (CVP) obj;
                if (Float.compare(this.A00, cvp.A00) != 0 || Float.compare(this.A01, cvp.A01) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A0U("AudioLevel(botAudioLevel=", ", userAudioLevel=", ')', this.A00, this.A01);
    }

    public final int hashCode() {
        return AbstractC25226BEj.A01(AbstractC25235BEs.A02(this.A00), this.A01);
    }

    public CVP(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }
}
