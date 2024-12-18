package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class N92 extends AbstractC65632xz {
    public final Context A00;
    public final N7U A01;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public N92(Context context, N7U n7u) {
        this.A00 = context;
        this.A01 = n7u;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1741072502);
        view.getTag().getClass();
        Context context = this.A00;
        C53617NnO c53617NnO = (C53617NnO) view.getTag();
        OUX oux = (OUX) obj;
        N7U n7u = this.A01;
        TextView textView = c53617NnO.A02;
        String str = oux.A07;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        TextView textView2 = c53617NnO.A01;
        C14360o3.A0B(context, 0);
        SpannableStringBuilder append = AbstractC25225BEi.A0H(AbstractC54291NzB.A00(context, oux)).append((CharSequence) " • ");
        String str2 = oux.A05;
        if (str2 == null) {
            str2 = "";
        }
        SpannableStringBuilder append2 = append.append((CharSequence) str2);
        C14360o3.A07(append2);
        textView2.setText(append2);
        C0fQ.A00(new ViewOnClickListenerC55468OkN(oux, n7u, 60), c53617NnO.A00);
        C0f9.A0A(-1350003676, A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.NnO, java.lang.Object] */
    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(210649063);
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.login_history_row_item);
        ?? obj = new Object();
        obj.A02 = AbstractC166997dE.A0T(A0A, R.id.login_history_item_title);
        obj.A01 = AbstractC166997dE.A0T(A0A, R.id.login_history_item_content);
        obj.A00 = AbstractC31173DnH.A0I(A0A, R.id.more_icon);
        A0A.setTag(obj);
        C0f9.A0A(507243911, A03);
        return A0A;
    }
}
