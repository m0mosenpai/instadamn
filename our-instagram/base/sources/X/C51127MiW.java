package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import java.util.ArrayList;

/* renamed from: X.MiW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51127MiW extends C2UU {
    public final C8SB A00;
    public final ArrayList A01;

    public C51127MiW(C8SB c8sb) {
        C14360o3.A0B(c8sb, 1);
        this.A00 = c8sb;
        this.A01 = AbstractC166987dD.A1E();
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C51304MlR(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.media_kit_reorder_item, false), this.A00);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C51304MlR c51304MlR = (C51304MlR) c3oo;
        C14360o3.A0B(c51304MlR, 0);
        TextView textView = c51304MlR.A00;
        String str = ((C51850Mvs) this.A01.get(i)).A04;
        if (str.length() <= 0) {
            str = AnonymousClass001.A0O("New section ", i);
        }
        textView.setText(str);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1411357661);
        int size = this.A01.size();
        C0f9.A0A(1690282837, A03);
        return size;
    }
}
