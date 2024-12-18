package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes8.dex */
public final class JoM extends C1I4 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ViewOnClickListenerC44797JsK A01;

    public JoM(ViewOnClickListenerC44797JsK viewOnClickListenerC44797JsK, int i) {
        this.A01 = viewOnClickListenerC44797JsK;
        this.A00 = i;
    }

    @Override // X.C1I4
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ViewOnClickListenerC44797JsK viewOnClickListenerC44797JsK;
        C3OO A0V;
        int A03 = C0f9.A03(-1654565165);
        C14360o3.A0B(recyclerView, 0);
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0 && (A0V = (viewOnClickListenerC44797JsK = this.A01).A0V(this.A00)) != null) {
            InterfaceC58110PpZ interfaceC58110PpZ = viewOnClickListenerC44797JsK.A02;
            if (interfaceC58110PpZ != null) {
                View view = A0V.itemView;
                C14360o3.A0C(view, "null cannot be cast to non-null type com.instagram.creation.base.ui.feedcolorfilterpicker.TileFrame");
                interfaceC58110PpZ.DtE((C44428Jkf) view, false);
            }
            viewOnClickListenerC44797JsK.A15(this);
        }
        C0f9.A0A(960170707, A03);
    }
}
