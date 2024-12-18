package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.7N5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7N5 extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C161397La c161397La = (C161397La) interfaceC66482zP;
        C7N6 c7n6 = (C7N6) c3oo;
        TextView textView = c7n6.A00;
        textView.setText(c161397La.A03);
        textView.setTextColor(c161397La.A04);
        c7n6.itemView.setBackground(c161397La.A05);
        AnonymousClass775.A00(textView, c161397La.A08);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C7N6(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.thread_message_timestamp_separator, viewGroup, false));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C161397La.class;
    }
}
