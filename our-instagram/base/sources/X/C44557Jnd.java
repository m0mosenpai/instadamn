package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import java.util.List;

/* renamed from: X.Jnd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44557Jnd extends C2UU {
    public final List A00;
    public final List A01 = AbstractC166987dD.A1E();

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = AbstractC31177DnL.A0E(viewGroup, 0).inflate(R.layout.layout_clips_viewer_recommend_clips_item, viewGroup, false);
        return new C44680JqP(inflate, AbstractC25231BEo.A0d(inflate, R.id.clips_viewer_recommend_clips_item_text), (IgdsCheckBox) AbstractC166997dE.A0R(inflate, R.id.clips_viewer_recommend_clips_item_checkbox));
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C44680JqP c44680JqP = (C44680JqP) c3oo;
        C14360o3.A0B(c44680JqP, 0);
        String A1I = AbstractC25226BEj.A1I(this.A00, i);
        c44680JqP.A00.setText(A1I);
        ViewOnClickListenerC48069LPu.A00(c44680JqP.itemView, c44680JqP, this, A1I, 8);
    }

    public C44557Jnd(List list) {
        this.A00 = list;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int i;
        int A03 = C0f9.A03(261918785);
        List list = this.A00;
        if (AbstractC166987dD.A1b(list)) {
            i = list.size();
        } else {
            i = 0;
        }
        C0f9.A0A(-472654363, A03);
        return i;
    }
}
