package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KEQ extends AbstractC65632xz {
    public final Context A00;
    public final C44561Jni A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public KEQ(Context context, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = context;
        this.A01 = new C44561Jni(new C52182aJ(context, R.style.SearchHistoryPillDark), interfaceC16820sZ, interfaceC16660sJ);
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1447171438);
        C14360o3.A0B(obj, 2);
        C44561Jni c44561Jni = this.A01;
        c44561Jni.A00 = AbstractC25228BEl.A1C(((C51756Mtf) obj).A00);
        c44561Jni.notifyDataSetChanged();
        C0f9.A0A(-2133799027, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        RecyclerView recyclerView;
        int A03 = C0f9.A03(-993869181);
        View inflate = LayoutInflater.from(this.A00).inflate(R.layout.layout_search_asset_keywords_history, viewGroup, false);
        if ((inflate instanceof RecyclerView) && (recyclerView = (RecyclerView) inflate) != null) {
            recyclerView.setAdapter(this.A01);
            AbstractC31174DnI.A17(recyclerView.getContext(), recyclerView, false);
        }
        C14360o3.A07(inflate);
        C0f9.A0A(29152224, A03);
        return inflate;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
