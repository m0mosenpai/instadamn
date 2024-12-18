package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.facebook.R;

/* renamed from: X.McH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50800McH extends BaseAdapter {
    public final C54378O1k A00;

    @Override // android.widget.Adapter
    public final int getCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            View inflate = AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.cover_image_camera_roll_icon, viewGroup, false);
            C3P9 A0s = AbstractC166987dD.A0s(inflate);
            A0s.A07 = true;
            C52374NFq.A00(A0s, this, 0);
            return inflate;
        }
        return view;
    }

    public C50800McH(C54378O1k c54378O1k) {
        this.A00 = c54378O1k;
    }
}
