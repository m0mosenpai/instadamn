package X;

import java.util.Arrays;

/* renamed from: X.4YY, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4YY implements InterfaceC97394Yz {
    public SMI A00;
    public int A01;
    public boolean A03;
    public boolean A04;
    public long[] A05;
    public final C4B6 A06;
    public final C97964ab A07 = new C97964ab();
    public long A02 = -9223372036854775807L;

    @Override // X.InterfaceC97394Yz
    public final boolean CbZ() {
        return true;
    }

    @Override // X.InterfaceC97394Yz
    public final void Coy() {
    }

    public final void A00(long j) {
        int i;
        long[] jArr = this.A05;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = binarySearch ^ (-1);
            this.A01 = i;
            if (this.A03 || i != this.A05.length) {
                j = -9223372036854775807L;
            }
            this.A02 = j;
        }
        do {
            binarySearch++;
            if (binarySearch >= jArr.length) {
                break;
            }
        } while (jArr[binarySearch] == j);
        i = binarySearch - 1;
        this.A01 = i;
        if (this.A03) {
        }
        j = -9223372036854775807L;
        this.A02 = j;
    }

    public final void A01(SMI smi, boolean z) {
        long j;
        int i = this.A01;
        if (i == 0) {
            j = -9223372036854775807L;
        } else {
            j = this.A05[i - 1];
        }
        this.A03 = z;
        this.A00 = smi;
        long[] jArr = smi.A02;
        this.A05 = jArr;
        long j2 = this.A02;
        if (j2 != -9223372036854775807L) {
            A00(j2);
            return;
        }
        if (j == -9223372036854775807L) {
            return;
        }
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            binarySearch ^= -1;
            this.A01 = binarySearch;
        }
        do {
            binarySearch++;
            if (binarySearch >= jArr.length) {
                break;
            }
        } while (jArr[binarySearch] == j);
        this.A01 = binarySearch;
    }

    @Override // X.InterfaceC97394Yz
    public final int E7y(C96084Tr c96084Tr, C96094Ts c96094Ts, int i) {
        int i2 = this.A01;
        boolean z = false;
        if (i2 == this.A05.length) {
            z = true;
        }
        if (z && !this.A03) {
            ((AbstractC96104Tt) c96094Ts).A00 = 4;
            return -4;
        }
        if ((i & 2) == 0 && this.A04) {
            if (z) {
                return -3;
            }
            if ((i & 1) == 0) {
                this.A01 = i2 + 1;
            }
            if ((i & 4) == 0) {
                byte[] A00 = this.A07.A00(this.A00.A03[i2]);
                c96094Ts.A01(A00.length);
                c96094Ts.A02.put(A00);
            }
            c96094Ts.A01 = this.A05[i2];
            ((AbstractC96104Tt) c96094Ts).A00 = 1;
            return -4;
        }
        c96084Tr.A00 = this.A06;
        this.A04 = true;
        return -5;
    }

    @Override // X.InterfaceC97394Yz
    public final int Em7(long j) {
        int i;
        int i2 = this.A01;
        long[] jArr = this.A05;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = binarySearch ^ (-1);
            int max = Math.max(i2, i);
            int i3 = max - this.A01;
            this.A01 = max;
            return i3;
        }
        do {
            binarySearch++;
            if (binarySearch >= jArr.length) {
                break;
            }
        } while (jArr[binarySearch] == j);
        i = binarySearch - 1;
        int max2 = Math.max(i2, i);
        int i32 = max2 - this.A01;
        this.A01 = max2;
        return i32;
    }

    public C4YY(C4B6 c4b6, SMI smi, boolean z) {
        this.A06 = c4b6;
        this.A00 = smi;
        this.A05 = smi.A02;
        A01(smi, z);
    }

    @Override // X.InterfaceC97394Yz
    public final /* synthetic */ long CAC(int i) {
        return -9223372036854775807L;
    }
}
