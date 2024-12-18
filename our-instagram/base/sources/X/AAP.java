package X;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class AAP {
    public int A00;
    public int A01;
    public C200688uB A02;
    public C81H A03;
    public boolean A04;
    public final int A05;
    public final int A06;
    public final C180337zN A07;
    public final C179877yd A08;
    public final boolean A09;

    public AAP(C179877yd c179877yd, int i, int i2, boolean z) {
        this.A08 = c179877yd;
        this.A06 = i;
        this.A05 = i2;
        this.A09 = z;
        this.A03 = c179877yd.A02(i, i2, this.A04);
        HashMap A1G = AbstractC166987dD.A1G();
        ArrayList A1E = AbstractC166987dD.A1E();
        A1G.put("aPosition", new C180327zM(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}));
        A1E.add("aPosition");
        A1G.put("aTextureCoord", new C180327zM(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}));
        A1E.add("aTextureCoord");
        this.A07 = new C180337zN(A1E, A1G);
    }
}
