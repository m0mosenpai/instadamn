package X;

import android.graphics.Shader;
import java.util.List;

/* renamed from: X.Ba0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25761Ba0 extends C62Y {
    public final /* synthetic */ InterfaceC74963Ym A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ boolean A03;

    public C25761Ba0(InterfaceC74963Ym interfaceC74963Ym, List list, List list2, boolean z) {
        this.A03 = z;
        this.A01 = list;
        this.A02 = list2;
        this.A00 = interfaceC74963Ym;
    }

    @Override // X.C62Y
    public final Shader A01(long j) {
        float A02 = C5YC.A02(j) * AbstractC25231BEo.A05(this.A00);
        C09530e4 A1L = AbstractC166987dD.A1L(Float.valueOf(A02), Float.valueOf(A02 + C5YC.A02(j)));
        if (this.A03) {
            A1L = AbstractC166987dD.A1L(A1L.A01, A1L.A00);
        }
        return AbstractC25292BHl.A00(this.A01, this.A02, 3, AbstractC119395aw.A00(AbstractC166987dD.A09(A1L.A00), 0.0f), AbstractC119395aw.A00(AbstractC166987dD.A09(A1L.A01), 0.0f));
    }
}
