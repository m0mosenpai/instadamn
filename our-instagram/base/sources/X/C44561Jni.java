package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.List;

/* renamed from: X.Jni, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44561Jni extends C2UU {
    public List A00;
    public final C52182aJ A01;
    public final InterfaceC16820sZ A02;
    public final InterfaceC16660sJ A03;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        String str;
        View view;
        View.OnClickListener lp0;
        C44596Jov c44596Jov = (C44596Jov) c3oo;
        C14360o3.A0B(c44596Jov, 0);
        if (i < 1) {
            c44596Jov.A00.setImageResource(R.drawable.instagram_delete_pano_filled_24);
            AbstractC166987dD.A1P(AbstractC31172DnG.A05(c44596Jov), c44596Jov.A01, 2131955188);
            view = c44596Jov.itemView;
            lp0 = new ViewOnClickListenerC48064LPp(this, 57);
        } else {
            List list = this.A00;
            if (list == null || (str = (String) AbstractC001800i.A0O(list, i - 1)) == null) {
                return;
            }
            c44596Jov.A01.setText(str);
            view = c44596Jov.itemView;
            lp0 = new LP0(str, this, 3);
        }
        C0fQ.A00(lp0, view);
    }

    public C44561Jni(C52182aJ c52182aJ, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = c52182aJ;
        this.A03 = interfaceC16660sJ;
        this.A02 = interfaceC16820sZ;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1730851196);
        List list = this.A00;
        int i = 0;
        if (list != null && !list.isEmpty()) {
            List list2 = this.A00;
            if (list2 != null) {
                i = list2.size();
            }
            i++;
        }
        C0f9.A0A(-1041025607, A03);
        return i;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.3OO, X.Jov] */
    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View A0R = AbstractC25226BEj.A0R(LayoutInflater.from(this.A01), viewGroup, R.layout.sticker_tray_search_history_pill, AbstractC43592JPx.A1Y(viewGroup));
        ?? c3oo = new C3OO(A0R);
        c3oo.A01 = AbstractC31178DnM.A0C(A0R);
        c3oo.A00 = AbstractC31176DnK.A0D(A0R, R.id.icon);
        return c3oo;
    }
}
