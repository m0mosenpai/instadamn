package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.Mjh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51197Mjh extends C1I4 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Reel A01;
    public final /* synthetic */ C69523Am A02;
    public final /* synthetic */ C63972vI A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public C51197Mjh(Reel reel, C69523Am c69523Am, C63972vI c63972vI, Integer num, String str, String str2, int i, boolean z) {
        this.A00 = i;
        this.A03 = c63972vI;
        this.A01 = reel;
        this.A02 = c69523Am;
        this.A05 = str;
        this.A04 = num;
        this.A07 = z;
        this.A06 = str2;
    }

    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A03 = C0f9.A03(1274144252);
        C14360o3.A0B(recyclerView, 0);
        int i3 = this.A00;
        InterfaceC72953Ov interfaceC72953Ov = (InterfaceC72953Ov) recyclerView.A0V(i3);
        if (interfaceC72953Ov != null) {
            recyclerView.getDrawingRect(AbstractC166987dD.A0U());
            float x = interfaceC72953Ov.BlH().getX();
            if (r2.left <= x && r2.right >= x + AbstractC166987dD.A07(interfaceC72953Ov.BlH())) {
                recyclerView.A15(this);
                C63972vI c63972vI = this.A03;
                Reel reel = this.A01;
                List list = ((AbstractC69533An) this.A02).A03;
                C14360o3.A07(list);
                c63972vI.A04(recyclerView, reel, this.A04, this.A05, this.A06, list, 0.0f, i3, 0, this.A07);
            }
        }
        C0f9.A0A(1280927821, A03);
    }
}
