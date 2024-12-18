package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class JoO extends C1I4 {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C1575275m A01;

    public JoO(View view, C1575275m c1575275m) {
        this.A01 = c1575275m;
        this.A00 = view;
    }

    @Override // X.C1I4
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03 = C0f9.A03(414156977);
        if (i == 0) {
            C1575275m c1575275m = this.A01;
            ArrayList arrayList = c1575275m.A02;
            InterfaceC09390do interfaceC09390do = c1575275m.A03;
            arrayList.add(LC2.A01(this.A00, (RecyclerView) interfaceC09390do.getValue(), true));
            ((RecyclerView) interfaceC09390do.getValue()).A15(this);
        }
        C0f9.A0A(-1466567577, A03);
    }
}
