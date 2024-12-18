package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.Co7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28837Co7 implements InterfaceC119205ac, InterfaceC30774DgB {
    public float A00;
    public boolean A01;
    public int[] A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final long A09;
    public final C6M3 A0A;
    public final C27853CPq A0B;
    public final CTX A0C;
    public final List A0D;
    public final boolean A0E;
    public final int[] A0F;
    public final InterfaceC119205ac A0G;
    public final InterfaceC1128957x A0H;
    public final C19L A0I;

    @Override // X.InterfaceC119205ac
    public final Map Aaw() {
        return this.A0G.Aaw();
    }

    @Override // X.InterfaceC119205ac
    public final InterfaceC16660sJ Bpq() {
        return this.A0G.Bpq();
    }

    @Override // X.InterfaceC119205ac
    public final void E4Q() {
        this.A0G.E4Q();
    }

    @Override // X.InterfaceC119205ac
    public final int getHeight() {
        return this.A0G.getHeight();
    }

    @Override // X.InterfaceC119205ac
    public final int getWidth() {
        return this.A0G.getWidth();
    }

    public C28837Co7(C27853CPq c27853CPq, CTX ctx, InterfaceC119205ac interfaceC119205ac, InterfaceC1128957x interfaceC1128957x, List list, C19L c19l, int[] iArr, int[] iArr2, float f, int i, int i2, int i3, int i4, int i5, int i6, long j, boolean z, boolean z2, boolean z3) {
        C6M3 c6m3;
        this.A0F = iArr;
        this.A02 = iArr2;
        this.A00 = f;
        this.A0G = interfaceC119205ac;
        this.A01 = z;
        this.A0E = z3;
        this.A0B = c27853CPq;
        this.A0C = ctx;
        this.A0H = interfaceC1128957x;
        this.A06 = i;
        this.A0D = list;
        this.A09 = j;
        this.A08 = i2;
        this.A07 = i3;
        this.A04 = i4;
        this.A03 = i5;
        this.A05 = i6;
        this.A0I = c19l;
        if (z2) {
            c6m3 = C6M3.Vertical;
        } else {
            c6m3 = C6M3.Horizontal;
        }
        this.A0A = c6m3;
    }
}
