package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.JkD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44418JkD extends BaseAdapter {
    public List A00;
    public List A01;
    public boolean A02;
    public final Context A03;
    public final List A04;

    public C44418JkD(Context context, List list) {
        C14360o3.A0B(list, 1);
        this.A04 = list;
        this.A03 = context;
        this.A01 = AbstractC001800i.A0i(list, C17s.A0C(3, AbstractC31172DnG.A03(list, 1)));
        ArrayList A1E = AbstractC166987dD.A1E();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            if (i < 3 || i == AbstractC31172DnG.A03(this.A04, 1)) {
                A1E.add(obj);
            }
            i = i2;
        }
        this.A00 = AbstractC001800i.A0U(A1E);
    }

    public final void A00() {
        this.A02 = false;
        List list = this.A00;
        if (list != null) {
            Collection<?> collection = this.A01;
            if (collection == null) {
                collection = C16930sl.A00;
            }
            list.removeAll(collection);
            ((L2O) list.get(AbstractC25226BEj.A05(list))).A00 = 0.0f;
        }
        C0fA.A00(this, -1354925694);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context;
        L2O l2o;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(context), viewGroup, R.layout.avatar_immersive_home_entrypoint_item);
        if (A0A == null) {
            return null;
        }
        List list = this.A00;
        if (list != null && (l2o = (L2O) list.get(i)) != null) {
            ImageView A08 = AbstractC31171DnF.A08(A0A, R.id.entrypoint_icon);
            if (A08 != null) {
                A08.setRotation(l2o.A00);
                A08.setImageResource(l2o.A01);
                AbstractC31173DnH.A11(A08.getContext(), A08, R.color.audio_bar_action_color_enabled);
            }
            TextView A0e = AbstractC166987dD.A0e(A0A, R.id.entrypoint_label);
            if (A0e != null) {
                A0e.setVisibility(AbstractC167007dF.A05(this.A02 ? 1 : 0));
                A0e.setText(l2o.A02);
                Context A0L = AbstractC166997dE.A0L(A0e);
                AbstractC166987dD.A1O(A0L, A0e, AbstractC53242c7.A0A(A0L));
            }
            C0fQ.A00(l2o.A03, A0A);
            return A0A;
        }
        throw AbstractC25227BEk.A0n();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        List list = this.A00;
        if (list != null) {
            int size = list.size();
            if (Integer.valueOf(size) != null) {
                return size;
            }
        }
        throw AbstractC25227BEk.A0n();
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        Object obj;
        List list = this.A00;
        if (list != null && (obj = list.get(i)) != null) {
            return obj;
        }
        throw AbstractC25227BEk.A0n();
    }
}
