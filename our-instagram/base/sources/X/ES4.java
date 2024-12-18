package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class ES4 extends AbstractC65632xz {
    public final Context A00;

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        return obj.hashCode();
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        return ((C34481FHt) obj).A00;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ES4(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-547222947);
        AbstractC167017dG.A1P(view, obj);
        Object tag = view.getTag();
        if (tag != null) {
            C34480FHs c34480FHs = (C34480FHs) tag;
            int i2 = ((C34481FHt) obj).A00;
            C14360o3.A0B(c34480FHs, 0);
            TextView textView = c34480FHs.A00;
            Context context = textView.getContext();
            int i3 = R.attr.igds_color_primary_text;
            if (i2 == 0) {
                i3 = R.attr.igds_color_secondary_icon;
            }
            AbstractC31177DnL.A0q(context, textView, i3);
            textView.setText(AbstractC74053Tw.A03(AbstractC166997dE.A0M(context), Integer.valueOf(i2), 2131968662));
            C0f9.A0A(1120885074, A03);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0A(-265153022, A03);
        throw A0g;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -738995748);
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.video_view_count_header_row);
        C14360o3.A0A(A0A);
        A0A.setTag(new C34480FHs(A0A));
        C0f9.A0A(-1685697751, A0G);
        return A0A;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
