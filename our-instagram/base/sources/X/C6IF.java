package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.6IF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6IF implements InterfaceC119205ac, C6IG {
    public float A00;
    public int A01;
    public boolean A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final long A09;
    public final C6M3 A0A;
    public final C137036Ig A0B;
    public final InterfaceC1128957x A0C;
    public final List A0D;
    public final C19L A0E;
    public final boolean A0F;
    public final /* synthetic */ InterfaceC119205ac A0G;

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

    public final boolean A00(int i, boolean z) {
        C137036Ig c137036Ig;
        if (this.A0F) {
            return false;
        }
        List list = this.A0D;
        if (list.isEmpty() || (c137036Ig = this.A0B) == null) {
            return false;
        }
        int i2 = c137036Ig.A08;
        int i3 = this.A01 - i;
        if (i3 < 0 || i3 >= i2) {
            return false;
        }
        C137036Ig c137036Ig2 = (C137036Ig) AbstractC001800i.A0I(list);
        C137036Ig c137036Ig3 = (C137036Ig) AbstractC001800i.A0K(list);
        if (c137036Ig2.A03 || c137036Ig3.A03) {
            return false;
        }
        if (i < 0) {
            if (Math.min((c137036Ig2.A02 + c137036Ig2.A08) - this.A08, (c137036Ig3.A02 + c137036Ig3.A08) - this.A07) <= (-i)) {
                return false;
            }
        } else if (Math.min(this.A08 - c137036Ig2.A02, this.A07 - c137036Ig3.A02) <= i) {
            return false;
        }
        this.A01 -= i;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            C137036Ig c137036Ig4 = (C137036Ig) list.get(i4);
            if (!c137036Ig4.A03) {
                c137036Ig4.A02 += i;
                int[] iArr = c137036Ig4.A0E;
                int length = iArr.length;
                for (int i5 = 0; i5 < length; i5++) {
                    if (c137036Ig4.A0D) {
                        if (i5 % 2 != 1) {
                        }
                        iArr[i5] = iArr[i5] + i;
                    } else {
                        if (i5 % 2 != 0) {
                        }
                        iArr[i5] = iArr[i5] + i;
                    }
                }
                if (z) {
                    int size2 = c137036Ig4.A0C.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        C28373Cfb A05 = c137036Ig4.A0A.A05(c137036Ig4.A0B, i6);
                        if (A05 != null) {
                            long j = A05.A02;
                            boolean z2 = c137036Ig4.A0D;
                            int i7 = (int) (j >> 32);
                            if (!z2) {
                                i7 += i;
                            }
                            int i8 = (int) (j & 4294967295L);
                            if (z2) {
                                i8 += i;
                            }
                            A05.A02 = AbstractC113765Bo.A00(i7, i8);
                        }
                    }
                }
            }
        }
        this.A00 = i;
        if (!this.A02 && i > 0) {
            this.A02 = true;
        }
        return true;
    }

    public C6IF(C6M3 c6m3, C137036Ig c137036Ig, InterfaceC119205ac interfaceC119205ac, InterfaceC1128957x interfaceC1128957x, List list, C19L c19l, float f, float f2, int i, int i2, int i3, int i4, int i5, int i6, long j, boolean z, boolean z2) {
        this.A0B = c137036Ig;
        this.A01 = i;
        this.A02 = z;
        this.A00 = f;
        this.A03 = f2;
        this.A0F = z2;
        this.A0E = c19l;
        this.A0C = interfaceC1128957x;
        this.A09 = j;
        this.A0D = list;
        this.A08 = i2;
        this.A07 = i3;
        this.A06 = i4;
        this.A0A = c6m3;
        this.A04 = i5;
        this.A05 = i6;
        this.A0G = interfaceC119205ac;
    }
}
