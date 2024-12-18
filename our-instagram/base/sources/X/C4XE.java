package X;

import android.util.SparseArray;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor2;
import java.util.List;

/* renamed from: X.4XE, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4XE implements C4XF, C4XG {
    public InterfaceC98454bO A00;
    public C4B6[] A01;
    public long A02;
    public InterfaceC98144at A03;
    public boolean A04;
    public final InterfaceC97954aa A05;
    public final int A06;
    public final SparseArray A07 = new SparseArray();
    public final C4B6 A08;
    public static final C4XI A0A = new C4XI() { // from class: X.4XH
        @Override // X.C4XI
        public final C4XE AMr(C4B6 c4b6, C4WZ c4wz, InterfaceC98054ak interfaceC98054ak, List list, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
            Integer num;
            InterfaceC97954aa c97944aZ;
            String str = c4b6.A0S;
            if (C2IH.A05(str)) {
                return null;
            }
            if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                try {
                    c97944aZ = (InterfaceC97954aa) Class.forName("com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor").getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } else {
                int i3 = 0;
                if (z) {
                    i3 = 4;
                }
                if (i2 == 2) {
                    num = C05F.A01;
                } else {
                    num = C05F.A00;
                }
                if (num == C05F.A01) {
                    c97944aZ = new FragmentedMp4Extractor2(interfaceC98054ak, list, i3);
                } else {
                    c97944aZ = new C97944aZ(interfaceC98054ak, list, i3, z3);
                }
            }
            return new C4XE(c4b6, c97944aZ, i);
        }
    };
    public static final C4XJ A09 = new Object();

    @Override // X.C4XF
    public final void ASd() {
        SparseArray sparseArray = this.A07;
        C4B6[] c4b6Arr = new C4B6[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            C4B6 c4b6 = ((C98404bJ) sparseArray.valueAt(i)).A00;
            C4B8.A01(c4b6);
            c4b6Arr[i] = c4b6;
        }
        this.A01 = c4b6Arr;
    }

    @Override // X.C4XG
    public final void CNn(InterfaceC98144at interfaceC98144at, long j, long j2) {
        this.A03 = interfaceC98144at;
        this.A02 = j2;
        boolean z = this.A04;
        InterfaceC97954aa interfaceC97954aa = this.A05;
        if (!z) {
            interfaceC97954aa.CNm(this);
            if (j != -9223372036854775807L) {
                interfaceC97954aa.EMc(0L, j);
            }
            this.A04 = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        interfaceC97954aa.EMc(0L, j);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.A07;
            if (i >= sparseArray.size()) {
                return;
            }
            ((C98404bJ) sparseArray.valueAt(i)).A00(interfaceC98144at, j2);
            i++;
        }
    }

    @Override // X.C4XF
    public final InterfaceC98054ak F88(int i, int i2) {
        C4B6 c4b6;
        SparseArray sparseArray = this.A07;
        C98404bJ c98404bJ = (C98404bJ) sparseArray.get(i);
        if (c98404bJ == null) {
            boolean z = false;
            if (this.A01 == null) {
                z = true;
            }
            C4B8.A04(z);
            if (i2 == this.A06) {
                c4b6 = this.A08;
            } else {
                c4b6 = null;
            }
            C98404bJ c98404bJ2 = new C98404bJ(c4b6, i, i2);
            c98404bJ2.A00(this.A03, this.A02);
            sparseArray.put(i, c98404bJ2);
            return c98404bJ2;
        }
        return c98404bJ;
    }

    public C4XE(C4B6 c4b6, InterfaceC97954aa interfaceC97954aa, int i) {
        this.A05 = interfaceC97954aa;
        this.A06 = i;
        this.A08 = c4b6;
    }

    @Override // X.C4XF
    public final void EMf(InterfaceC98454bO interfaceC98454bO) {
        this.A00 = interfaceC98454bO;
    }
}
