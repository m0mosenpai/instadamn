package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.Dw5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31700Dw5 extends AbstractC66422zJ {
    public final Context A00;
    public final C38M A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C14360o3.A0B(c3oo, 1);
        AbstractC35096Fd7.A01(this.A00, c3oo, new C31576Du4(C05F.A0u), this.A01, 0);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.3OO, X.E0t] */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View A00 = AbstractC35096Fd7.A00(this.A00, 0, viewGroup);
        ?? c3oo = new C3OO(A00);
        c3oo.A00 = AbstractC167007dF.A0N(A00, R.id.see_all_button);
        return c3oo;
    }

    public C31700Dw5(Context context, C38M c38m) {
        this.A00 = context;
        this.A01 = c38m;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return VA7.class;
    }
}
