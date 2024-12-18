package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EX1 extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        c3oo.itemView.getTag().getClass();
        throw AbstractC166987dD.A15("privacyText");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.Et6] */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.privacy_footer);
        ?? obj = new Object();
        obj.A00 = (TextView) A0A;
        A0A.setTag(obj);
        return new C3OO(A0A);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return AbstractC32612EXm.class;
    }
}
