package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EQX extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public EQX(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1744968079);
        AbstractC167017dG.A1P(view, obj);
        C33583Esv c33583Esv = (C33583Esv) view.getTag();
        if (c33583Esv != null) {
            C35246Fgf c35246Fgf = (C35246Fgf) obj;
            C14360o3.A0B(c35246Fgf, 1);
            TextView textView = c33583Esv.A00;
            c35246Fgf.A03(textView);
            View.OnClickListener onClickListener = c35246Fgf.A04;
            if (onClickListener != null) {
                C0fQ.A00(onClickListener, textView);
            }
            C0f9.A0A(190438618, A03);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0A(259644180, A03);
        throw A0g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.Esv] */
    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-1615382445);
        C14360o3.A0B(viewGroup, 1);
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.secondary_text_view);
        TextView A0N = AbstractC167007dF.A0N(A0A, R.id.secondary_text);
        C14360o3.A0B(A0N, 1);
        ?? obj = new Object();
        obj.A00 = A0N;
        A0A.setTag(obj);
        C0f9.A0A(292842302, A03);
        return A0A;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
