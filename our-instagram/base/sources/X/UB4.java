package X;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* loaded from: classes11.dex */
public final class UB4 extends ArrayAdapter {
    public final /* synthetic */ C69487VoA A00;
    public final /* synthetic */ AlertController$RecycleListView A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UB4(Context context, C69487VoA c69487VoA, AlertController$RecycleListView alertController$RecycleListView, CharSequence[] charSequenceArr, int i) {
        super(context, i, R.id.text1, charSequenceArr);
        this.A00 = c69487VoA;
        this.A01 = alertController$RecycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = this.A00.A0K;
        if (zArr != null && zArr[i]) {
            this.A01.setItemChecked(i, true);
        }
        return view2;
    }
}
