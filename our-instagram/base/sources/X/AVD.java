package X;

/* loaded from: classes4.dex */
public final class AVD implements BDY {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AVB A01;

    @Override // X.BDY
    public final void D9B(C73493YFw c73493YFw, int i) {
    }

    @Override // X.BDY
    public final void D9C(byte[] bArr, int i) {
        AVB avb = this.A01;
        C176217se c176217se = avb.A01;
        if (c176217se != null) {
            c176217se.A02(bArr, i, avb.A02.get());
        }
        C177547uo c177547uo = avb.A00;
        if (c177547uo != null) {
            int i2 = this.A00;
            avb.A02.addAndGet(AMJ.A01(c177547uo.A02, Integer.bitCount(c177547uo.A01), i, i2));
            short s = 0;
            byte[] A0X = AbstractC06960Yn.A0X(bArr, 0, i);
            int length = A0X.length / 2;
            short[] sArr = new short[length];
            for (int i3 = 0; i3 < length; i3++) {
                int i4 = i3 * 2;
                sArr[i3] = (short) ((A0X[i4] & 255) + (A0X[i4 + 1] << 8));
            }
            int i5 = 1;
            if (length != 0) {
                short s2 = sArr[0];
                int i6 = length - 1;
                if (1 <= i6) {
                    while (true) {
                        short s3 = sArr[i5];
                        if (s2 < s3) {
                            s2 = s3;
                        }
                        if (i5 == i6) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                Short valueOf = Short.valueOf(s2);
                if (valueOf != null) {
                    s = valueOf.shortValue();
                }
            }
            avb.A07 = C17s.A01((float) Math.abs((Math.log(s) * 0.25d) - 1.5807000398635864d));
        }
    }

    public AVD(AVB avb, int i) {
        this.A01 = avb;
        this.A00 = i;
    }

    @Override // X.BDY
    public final void DE6(C212399b8 c212399b8) {
        C0K8.A0C("IGDAudioPipelineRecorder", AbstractC166997dE.A0y("Error in audio recorder: ", c212399b8));
    }

    @Override // X.BDY
    public final void DHP() {
    }
}
