package X;

import java.util.List;

/* renamed from: X.N0h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52033N0h extends AbstractC55776Opl {
    public final /* synthetic */ C43888Jav A00;
    public final /* synthetic */ C15370ps A01;
    public final /* synthetic */ C15370ps A02;

    @Override // X.XES
    public final void D6f(List list) {
        C14360o3.A0B(list, 0);
        if (list.size() == 1) {
            this.A02.A00 = ((C55176Odf) list.get(0)).A0N;
            return;
        }
        throw AbstractC166987dD.A14("we should have exactly one result");
    }

    public C52033N0h(C43888Jav c43888Jav, C15370ps c15370ps, C15370ps c15370ps2) {
        this.A02 = c15370ps;
        this.A01 = c15370ps2;
        this.A00 = c43888Jav;
    }

    @Override // X.XES
    public final /* bridge */ /* synthetic */ void DEg(C70129W5q c70129W5q, Object obj) {
        android.util.Log.e("MediaTranscodeUtil", AbstractC167017dG.A0n(obj, "onException - ", AbstractC43594JPz.A0x(obj)));
        this.A01.A00 = obj;
    }
}
