package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UGh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66413UGh extends C2UU {
    public List A00 = new ArrayList();
    public final Context A01;

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
        AbstractC68845Vd1 abstractC68845Vd1 = (AbstractC68845Vd1) this.A00.get(i);
        int itemViewType = getItemViewType(i);
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                C66457UIh c66457UIh = (C66457UIh) c3oo;
                C14360o3.A0C(abstractC68845Vd1, "null cannot be cast to non-null type com.instagram.shopping.model.pdp.debug.DebugInfoItem");
                VAO vao = (VAO) abstractC68845Vd1;
                c66457UIh.A01.setText(vao.A01);
                c66457UIh.A00.setText(vao.A00);
                c66457UIh.itemView.setOnLongClickListener(new ViewOnLongClickListenerC70244WNo(3, vao, this));
                return;
            }
            UI9 ui9 = (UI9) c3oo;
            C14360o3.A0C(abstractC68845Vd1, "null cannot be cast to non-null type com.instagram.shopping.model.pdp.debug.DebugActionItem");
            VAN van = (VAN) abstractC68845Vd1;
            ui9.A00.setText(van.A00);
            WNS.A00(ui9.itemView, 4, van);
            return;
        }
        C14360o3.A0C(abstractC68845Vd1, "null cannot be cast to non-null type com.instagram.shopping.model.pdp.debug.DebugHeaderItem");
        ((UIA) c3oo).A00.setText(((VAM) abstractC68845Vd1).A00);
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater A0E = AbstractC31177DnL.A0E(viewGroup, 0);
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                    return new C66457UIh(AbstractC25226BEj.A0R(A0E, viewGroup, R.layout.debug_info_item, false));
                }
                throw new IllegalStateException(MSV.A00(18));
            }
            int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
            return new UI9(AbstractC25226BEj.A0R(A0E, viewGroup, R.layout.debug_action_item, false));
        }
        int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new UIA(AbstractC25226BEj.A0R(A0E, viewGroup, R.layout.debug_header_item, false));
    }

    public C66413UGh(Context context) {
        this.A01 = context;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-61288167);
        int size = this.A00.size();
        C0f9.A0A(-1622931709, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int i2;
        int A03 = C0f9.A03(-621281218);
        int intValue = ((AbstractC68845Vd1) this.A00.get(i)).A00.intValue();
        int i3 = 0;
        if (intValue != 0) {
            i3 = 2;
            if (intValue != 1) {
                i2 = -1735685853;
            } else {
                C0f9.A0A(778922659, A03);
                return 1;
            }
        } else {
            i2 = 695388995;
        }
        C0f9.A0A(i2, A03);
        return i3;
    }
}
