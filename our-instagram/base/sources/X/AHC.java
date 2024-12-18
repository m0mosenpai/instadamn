package X;

import java.util.List;

/* loaded from: classes4.dex */
public final class AHC {
    public final int A00;
    public final int A01;
    public final int A02;
    public final List A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AHC) {
                AHC ahc = (AHC) obj;
                if (!C14360o3.A0K(this.A03, ahc.A03) || this.A02 != ahc.A02 || this.A00 != ahc.A00 || this.A01 != ahc.A01 || this.A04 != ahc.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC167007dF.A0D(this.A04, (((((((((AbstractC166987dD.A0G(this.A03) + this.A02) * 31) + this.A00) * 31) + this.A01) * 31) + AbstractC53644Nnp.A00()) * 31) + 1231) * 31) * 31) - 1;
    }

    public AHC(List list, int i, int i2, int i3, boolean z) {
        this.A03 = list;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A04 = z;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("VideoHighlightsConfiguration(types=");
        A1C.append(this.A03);
        A1C.append(", numberOfOutput=");
        A1C.append(this.A02);
        A1C.append(", lengthOfEachSegmentsInMs=");
        A1C.append(this.A00);
        A1C.append(", maxSampledFrameCount=");
        A1C.append(this.A01);
        A1C.append(", isSpeedupEnabled=");
        A1C.append(false);
        A1C.append(", useAi4arVhdModel=");
        A1C.append(true);
        A1C.append(", useSceneChangeVhdModel=");
        A1C.append(this.A04);
        A1C.append(", videoStartTimeMs=");
        A1C.append(0);
        A1C.append(", videoDurationMs=");
        A1C.append(-1);
        return AbstractC167017dG.A0p(A1C);
    }

    public AHC() {
        this(AbstractC166987dD.A1J(EnumC222589rz.A03), 3, 2500, 90, true);
    }
}
