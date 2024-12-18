package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.PTz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57086PTz implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ RecyclerView A03;
    public final /* synthetic */ Reel A04;
    public final /* synthetic */ C63972vI A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ List A09;
    public final /* synthetic */ boolean A0A;

    public RunnableC57086PTz(RecyclerView recyclerView, Reel reel, C63972vI c63972vI, Integer num, String str, String str2, List list, float f, int i, int i2, boolean z) {
        this.A03 = recyclerView;
        this.A01 = i;
        this.A05 = c63972vI;
        this.A04 = reel;
        this.A09 = list;
        this.A07 = str;
        this.A06 = num;
        this.A0A = z;
        this.A02 = i2;
        this.A00 = f;
        this.A08 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.A03;
        InterfaceC72953Ov interfaceC72953Ov = (InterfaceC72953Ov) recyclerView.A0V(this.A01);
        if (interfaceC72953Ov != null) {
            C63972vI c63972vI = this.A05;
            Reel reel = this.A04;
            List list = this.A09;
            String str = this.A07;
            Integer num = this.A06;
            boolean z = this.A0A;
            int i = this.A02;
            C63972vI.A02(recyclerView, reel, interfaceC72953Ov, c63972vI, num, str, this.A08, list, this.A00, i, z);
        }
    }
}
