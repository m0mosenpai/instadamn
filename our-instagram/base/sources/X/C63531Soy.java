package X;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: X.Soy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63531Soy implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ Q8C A00;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C63531Soy(Q8C q8c) {
        this.A00 = q8c;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        Object obj;
        C2GS c2gs = this.A00.A05;
        if (adapterView != null) {
            obj = adapterView.getItemAtPosition(i);
        } else {
            obj = null;
        }
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.fbpay.w3c.CardDetails");
        c2gs.A0A(obj);
    }
}
