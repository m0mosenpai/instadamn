package X;

import java.io.File;
import java.util.List;

/* renamed from: X.Opm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55777Opm implements XES {
    public final int A00;
    public final Object A01;

    public C55777Opm(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.XES
    public final void D21(C70129W5q c70129W5q) {
        if (this.A00 == 0) {
            Exception exc = new Exception("cancelled");
            C70168WEk c70168WEk = (C70168WEk) this.A01;
            c70168WEk.A04();
            XES xes = c70168WEk.A0B.A07;
            if (xes != null) {
                xes.DEg(c70129W5q, exc);
            }
        }
    }

    @Override // X.XES
    public final void D6f(List list) {
        switch (this.A00) {
            case 0:
                return;
            case 1:
                if (list != null && list.size() == 1) {
                    C51051Mh5 c51051Mh5 = ((OW5) this.A01).A01;
                    if (c51051Mh5 == null) {
                        return;
                    }
                    c51051Mh5.A05.A0A(((C55176Odf) list.get(0)).A0N);
                    return;
                }
                throw AbstractC31172DnG.A0u();
            default:
                if (list != null && list.size() == 1) {
                    String absolutePath = ((C55176Odf) list.get(0)).A0N.getAbsolutePath();
                    OW5 ow5 = (OW5) this.A01;
                    ow5.A02 = AbstractC166987dD.A11(absolutePath);
                    C14360o3.A0A(absolutePath);
                    ow5.A00 = ALf.A00(absolutePath);
                    return;
                }
                throw AbstractC31172DnG.A0u();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.XES
    public final /* bridge */ /* synthetic */ void DEg(C70129W5q c70129W5q, Object obj) {
        StringBuilder A1C;
        String str;
        switch (this.A00) {
            case 0:
                C70168WEk c70168WEk = (C70168WEk) this.A01;
                c70168WEk.A04();
                XES xes = c70168WEk.A0B.A07;
                if (xes == null) {
                    return;
                }
                xes.DEg(c70129W5q, obj);
                return;
            case 1:
                A1C = AbstractC166987dD.A1C();
                str = "concatAudioWithBleep has error: ";
                C0K8.A0C("KaraokeBleepAudioConcatInteractor", AbstractC167017dG.A0n(obj, str, A1C));
                return;
            default:
                A1C = AbstractC166987dD.A1C();
                str = "convertBleepAudio has error: ";
                C0K8.A0C("KaraokeBleepAudioConcatInteractor", AbstractC167017dG.A0n(obj, str, A1C));
                return;
        }
    }

    @Override // X.XES
    public final void onStart() {
    }

    @Override // X.XES
    public final void Dbq(double d) {
    }

    @Override // X.XES
    public final void Dk4(File file, long j) {
    }

    @Override // X.XES
    public final void Dk6(C55176Odf c55176Odf) {
    }
}
