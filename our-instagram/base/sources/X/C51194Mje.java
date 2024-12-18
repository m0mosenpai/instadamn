package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Mje, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51194Mje extends C1I4 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ViewOnClickListenerC44797JsK A01;
    public final /* synthetic */ InterfaceC16820sZ A02;

    public C51194Mje(ViewOnClickListenerC44797JsK viewOnClickListenerC44797JsK, InterfaceC16820sZ interfaceC16820sZ, int i) {
        this.A01 = viewOnClickListenerC44797JsK;
        this.A00 = i;
        this.A02 = interfaceC16820sZ;
    }

    @Override // X.C1I4
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ViewOnClickListenerC44797JsK viewOnClickListenerC44797JsK;
        C3OO A0V;
        int A03 = C0f9.A03(-1505685451);
        if (i == 0 && (A0V = (viewOnClickListenerC44797JsK = this.A01).A0V(this.A00)) != null) {
            InterfaceC58110PpZ interfaceC58110PpZ = viewOnClickListenerC44797JsK.A02;
            if (interfaceC58110PpZ != null) {
                View view = A0V.itemView;
                C14360o3.A0C(view, AbstractC43591JPw.A00(182));
                interfaceC58110PpZ.DtE((C44428Jkf) view, false);
            }
            this.A02.invoke();
            viewOnClickListenerC44797JsK.A15(this);
        }
        C0f9.A0A(127244473, A03);
    }
}
