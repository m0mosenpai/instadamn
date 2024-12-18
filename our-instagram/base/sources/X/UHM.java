package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.List;

/* loaded from: classes11.dex */
public final class UHM extends C1I4 {
    public final /* synthetic */ C47K A00;
    public final /* synthetic */ C65802yI A01;

    public UHM(C47K c47k, C65802yI c65802yI) {
        this.A00 = c47k;
        this.A01 = c65802yI;
    }

    @Override // X.C1I4
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        List A04;
        int A03 = C0f9.A03(213693050);
        AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
        abstractC70663Fe.getClass();
        int A1c = ((LinearLayoutManager) abstractC70663Fe).A1c();
        if (A1c != -1 && (A04 = this.A00.A04()) != null) {
            C65802yI c65802yI = this.A01;
            if (A1c >= 0) {
                int i2 = A1c + 1;
                int min = Math.min(i2 + 2, A04.size());
                while (i2 < min) {
                    FOC foc = (FOC) A04.get(i2);
                    if (c65802yI.A02.add(foc.A04)) {
                        for (C38321qM c38321qM : foc.A07) {
                            C25821No A00 = C25821No.A00();
                            ExtendedImageUrl A1q = c38321qM.A1q(c65802yI.A00);
                            C18C.A07(A1q, "Will crash when calling `queue()`");
                            C1OG A0J = A00.A0J(A1q, c65802yI.A01.getModuleName());
                            A0J.A0I = true;
                            A0J.A09 = c38321qM.BU6();
                            A0J.A01();
                        }
                    }
                    i2++;
                }
            }
        }
        C0f9.A0A(-1579179315, A03);
    }
}
