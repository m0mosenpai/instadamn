package X;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: X.WOc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70257WOc implements AdapterView.OnItemClickListener {
    public final /* synthetic */ C69487VoA A00;
    public final /* synthetic */ AlertController$RecycleListView A01;
    public final /* synthetic */ W9C A02;

    public C70257WOc(C69487VoA c69487VoA, AlertController$RecycleListView alertController$RecycleListView, W9C w9c) {
        this.A00 = c69487VoA;
        this.A01 = alertController$RecycleListView;
        this.A02 = w9c;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C69487VoA c69487VoA = this.A00;
        boolean[] zArr = c69487VoA.A0K;
        if (zArr != null) {
            zArr[i] = this.A01.isItemChecked(i);
        }
        c69487VoA.A07.onClick(this.A02.A0V, i, this.A01.isItemChecked(i));
    }
}
