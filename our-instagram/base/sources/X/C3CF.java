package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.3CF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3CF implements InterfaceC60602pj {
    public final AbstractC60672pq A00;
    public final C3A9 A01;
    public final C1I2 A02 = new C1I7() { // from class: X.3CG
        @Override // X.C1I7, X.C1I2
        public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
            int A03 = C0f9.A03(-220866796);
            C3CF c3cf = C3CF.this;
            if (c3cf.A00.isResumed()) {
                c3cf.A01.A01();
            }
            C0f9.A0A(1116794527, A03);
        }
    };

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.3CK, java.lang.Object] */
    public C3CF(AbstractC60672pq abstractC60672pq, C36Y c36y, C65192xH c65192xH, C3BT c3bt) {
        this.A00 = abstractC60672pq;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c3bt);
        arrayList.add(new C3CH(c36y, c65192xH));
        ?? obj = new Object();
        obj.A00 = RecyclerView.class;
        arrayList.add(obj);
        C36Z[] c36zArr = (C36Z[]) arrayList.toArray(new C36Z[0]);
        this.A01 = new C3A9(c65192xH, abstractC60672pq, (C36Z[]) Arrays.copyOf(c36zArr, c36zArr.length));
    }
}
