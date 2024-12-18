package X;

import android.content.Context;
import com.instagram.save.model.SavedCollection;

/* loaded from: classes7.dex */
public final class HG5 extends C1P1 {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public HG5(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
        this.A04 = obj4;
        this.A03 = obj3;
        this.A05 = obj2;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        if (this.A00 != 0) {
            super.onFail(abstractC115105If);
            return;
        }
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 1911625771);
        super.onFail(abstractC115105If);
        AbstractC166987dD.A1Y(this.A04);
        C9GR.A0D((Context) this.A02, "network_error");
        ((C38321qM) this.A03).AEH((AbstractC12990ll) this.A05);
        C0f9.A0A(1429261045, A0N);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = C0f9.A03(-2135690015);
            int A032 = C0f9.A03(277728140);
            AbstractC35273Fh8.A07(((C41645Ibb) this.A02).A02, (C38321qM) this.A05, (SavedCollection) this.A03, (Integer) this.A04, this.A01);
            C0f9.A0A(1632199265, A032);
            i = -1080267992;
        } else {
            A03 = C0f9.A03(1126277854);
            int A0N = AbstractC167017dG.A0N(obj, 258046361);
            super.onSuccess(obj);
            C9GR.A07((Context) this.A02, this.A01);
            C0f9.A0A(1658095431, A0N);
            i = 1803246093;
        }
        C0f9.A0A(i, A03);
    }
}
