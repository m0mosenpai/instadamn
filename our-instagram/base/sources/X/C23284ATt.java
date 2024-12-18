package X;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: X.ATt, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23284ATt implements AdapterView.OnItemClickListener {
    public final /* synthetic */ Aiu A00;

    public C23284ATt(Aiu aiu) {
        this.A00 = aiu;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object obj;
        if (adapterView != null) {
            obj = adapterView.getItemAtPosition(i);
        } else {
            obj = null;
        }
        this.A00.D3P(obj);
    }
}
