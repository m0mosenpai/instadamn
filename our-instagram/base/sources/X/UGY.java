package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.react.modules.dialog.DialogModule;

/* loaded from: classes11.dex */
public final class UGY extends C2UU {
    public C69755Vuq[] A00;
    public final InterfaceC16660sJ A01;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(null, 0);
        throw new NullPointerException(DialogModule.KEY_TITLE);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        Context context = viewGroup.getContext();
        WFY.A02();
        View A0R = AbstractC25226BEj.A0R(AbstractC58322PtE.A0I(context, R.style.BSCIGTheme), viewGroup, R.layout.msc_pivot_bar_item, false);
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A07(A0R.findViewById(R.id.item_title));
        C14360o3.A07(A0R.findViewById(R.id.selected_indicator));
        C2FP.A02().A07().A00(AbstractC166997dE.A0L(A0R), 18);
        throw C00O.createAndThrow();
    }

    public UGY(InterfaceC16660sJ interfaceC16660sJ, C69755Vuq[] c69755VuqArr) {
        this.A00 = c69755VuqArr;
        this.A01 = interfaceC16660sJ;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-917264102);
        int length = this.A00.length;
        C0f9.A0A(-1475726058, A03);
        return length;
    }
}
