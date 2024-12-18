package X;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public final class UGP extends LinearLayoutManager {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UEx A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGP(Context context, UEx uEx, int i, int i2) {
        super(context, i, false);
        this.A01 = uEx;
        this.A00 = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void A1s(C3F5 c3f5, int[] iArr) {
        int height;
        int i = this.A00;
        UEx uEx = this.A01;
        if (i == 0) {
            iArr[0] = uEx.A02.getWidth();
            height = uEx.A02.getWidth();
        } else {
            iArr[0] = uEx.A02.getHeight();
            height = uEx.A02.getHeight();
        }
        iArr[1] = height;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    public final void A1T(C3F5 c3f5, RecyclerView recyclerView, int i) {
        C65883Tvn c65883Tvn = new C65883Tvn(recyclerView.getContext(), this, 1);
        ((AbstractC110824yu) c65883Tvn).A00 = i;
        A10(c65883Tvn);
    }
}
