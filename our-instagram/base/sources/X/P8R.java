package X;

import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class P8R implements InterfaceC140606Xo {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ RecyclerView A02;
    public final /* synthetic */ Reel A03;
    public final /* synthetic */ InterfaceC72953Ov A04;
    public final /* synthetic */ C63972vI A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ List A09;
    public final /* synthetic */ boolean A0A;

    public P8R(RecyclerView recyclerView, Reel reel, InterfaceC72953Ov interfaceC72953Ov, C63972vI c63972vI, Integer num, String str, String str2, List list, float f, int i, boolean z) {
        this.A05 = c63972vI;
        this.A03 = reel;
        this.A09 = list;
        this.A04 = interfaceC72953Ov;
        this.A02 = recyclerView;
        this.A07 = str;
        this.A06 = num;
        this.A0A = z;
        this.A01 = i;
        this.A00 = f;
        this.A08 = str2;
    }

    @Override // X.InterfaceC140606Xo
    public final void Cge(long j, boolean z) {
        C63972vI c63972vI = this.A05;
        Reel reel = this.A03;
        ArrayList A00 = C63972vI.A00(c63972vI, this.A09);
        InterfaceC72953Ov interfaceC72953Ov = this.A04;
        RecyclerView recyclerView = this.A02;
        String str = this.A07;
        if (str == null) {
            str = "";
        }
        Integer num = this.A06;
        boolean z2 = this.A0A;
        int i = this.A01;
        float f = this.A00;
        String str2 = this.A08;
        C3G2 c3g2 = C3G2.A1F;
        if (!C14360o3.A0K(str2, "highlights_in_feed")) {
            c3g2 = C3G2.A1G;
        }
        interfaceC72953Ov.CMM();
        RectF Ahl = interfaceC72953Ov.Ahl();
        RectF BGZ = ((C73203Pv) interfaceC72953Ov).BGZ();
        AbstractC60672pq abstractC60672pq = c63972vI.A03;
        C3M4 A06 = C1OU.A06(abstractC60672pq.requireActivity(), c63972vI.A04);
        A06.A0W(Ahl, BGZ, abstractC60672pq, reel, c3g2, new C56530P8c(recyclerView, c3g2, A06, interfaceC72953Ov, c63972vI, num, str, str2, A00, f, i, j, z, z2), null, null, Collections.emptySet(), f, i, false);
    }
}
