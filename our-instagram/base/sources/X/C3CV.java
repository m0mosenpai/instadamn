package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3CV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3CV implements InterfaceC60602pj {
    public boolean A00;
    public final C2US A01;
    public final C65192xH A02;
    public final AbstractC60672pq A05;
    public final List A04 = new ArrayList();
    public final List A03 = new ArrayList();

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

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0116, code lost:
    
        if (r12 == r0) goto L25;
     */
    @Override // X.InterfaceC60602pj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r34, android.os.Bundle r35) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3CV.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final void ADK(View view) {
        if (view != null) {
            this.A00 = true;
            RecyclerView recyclerView = this.A05.getRecyclerView();
            List list = this.A04;
            list.clear();
            View childAt = recyclerView.getChildAt(0);
            if (childAt != null) {
                View childAt2 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                int A02 = RecyclerView.A02(childAt);
                int A022 = RecyclerView.A02(childAt2);
                if ((A02 == -1 || A022 == -1) && C0K8.A01.isLoggable(6)) {
                    C0K8.A0C("RVChildPrefetcher", AnonymousClass001.A02(A02, A022, "invisible view position: ", "-"));
                }
                C2US c2us = this.A01;
                int min = Math.min(c2us.getItemCount() - 1, A022 + 5);
                for (int max = Math.max(0, A02 - 5); max <= min; max++) {
                    list.add(Integer.valueOf(c2us.getItemViewType(max)));
                }
                C0I3 c0i3 = C0K8.A01;
            }
            List list2 = this.A03;
            list2.clear();
            C70783Fq recycledViewPool = recyclerView.getRecycledViewPool();
            for (int i = 0; i < this.A01.getViewTypeCount(); i++) {
                int size = C70783Fq.A00(recycledViewPool, i).A03.size();
                for (int i2 = 0; i2 < size; i2++) {
                    list2.add(Integer.valueOf(i));
                }
            }
            C0I3 c0i32 = C0K8.A01;
        }
    }

    public C3CV(AbstractC60672pq abstractC60672pq, C2US c2us, C65192xH c65192xH) {
        this.A01 = c2us;
        this.A05 = abstractC60672pq;
        this.A02 = c65192xH;
    }
}
