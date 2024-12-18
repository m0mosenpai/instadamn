package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import java.util.List;

/* renamed from: X.Gtl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38349Gtl extends C2UU {
    public int A00;
    public List A01;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C38489GwA(AbstractC25226BEj.A0R(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.clips_viewer_debug_overlay_item, false));
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        String str;
        C38489GwA c38489GwA = (C38489GwA) c3oo;
        C14360o3.A0B(c38489GwA, 0);
        C120985dq c120985dq = (C120985dq) this.A01.get(i);
        int i2 = this.A00;
        C14360o3.A0B(c120985dq, 0);
        c38489GwA.A04.setText(String.valueOf(i));
        c38489GwA.A03.setText(c120985dq.A01.toString());
        c38489GwA.A02.setText(AbstractC37799GkE.A00(c120985dq.A03));
        TextView textView = c38489GwA.A01;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM == null || (str = c38321qM.A2u()) == null) {
            str = "";
        }
        textView.setText(str);
        View view = c38489GwA.A00;
        Context context = view.getContext();
        int i3 = R.color.fds_transparent;
        if (i2 == i) {
            i3 = R.color.green_9;
        }
        AbstractC31172DnG.A1B(context, view, i3);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(453529201);
        int size = this.A01.size();
        C0f9.A0A(-755767441, A03);
        return size;
    }
}
