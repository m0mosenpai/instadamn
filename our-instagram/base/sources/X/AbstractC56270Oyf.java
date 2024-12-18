package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.Oyf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC56270Oyf implements InterfaceC58282Psa {
    public RecyclerView A00;
    public InterfaceC185318Jx A01;

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC58282Psa
    public final void AJN() {
        this.A01 = null;
    }

    @Override // X.InterfaceC58282Psa
    public final /* synthetic */ void D01() {
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

    public final RecyclerView A00() {
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            return recyclerView;
        }
        C14360o3.A0F("bottomSheetListView");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58282Psa
    public final List Ben() {
        if (this instanceof NHT) {
            return AbstractC166987dD.A1J(EnumC53228NgQ.A05);
        }
        return AbstractC16960so.A1Q(EnumC53228NgQ.A03, EnumC53228NgQ.A05, EnumC53228NgQ.A04);
    }

    @Override // X.InterfaceC58282Psa
    public final void AQM(float f) {
        A00().scrollBy(0, (int) f);
    }

    @Override // X.InterfaceC58282Psa
    public final boolean CRk() {
        return !A00().canScrollVertically(1);
    }

    @Override // X.InterfaceC58282Psa
    public final boolean CRl() {
        return !AbstractC43592JPx.A1X(A00());
    }

    @Override // X.InterfaceC58282Psa
    public final void DHV(float f, float f2) {
        A00().A1E(0, (int) f2);
    }

    @Override // X.InterfaceC58282Psa
    public final void cancel() {
        AbstractC51119MiO abstractC51119MiO;
        InterfaceC16660sJ interfaceC16660sJ;
        RecyclerView A00 = A00();
        boolean z = this instanceof NHS;
        if (z) {
            abstractC51119MiO = ((NHS) this).A02;
        } else {
            abstractC51119MiO = ((NHT) this).A06;
        }
        A00.suppressLayout(false);
        RecyclerView.A0I(abstractC51119MiO, A00, true);
        A00.A18(true);
        A00.requestLayout();
        InterfaceC185318Jx interfaceC185318Jx = this.A01;
        if (interfaceC185318Jx != null && !interfaceC185318Jx.Cce()) {
            if (z) {
                interfaceC16660sJ = ((NHS) this).A04;
            } else {
                interfaceC16660sJ = ((NHT) this).A08;
            }
            interfaceC16660sJ.invoke(interfaceC185318Jx);
        }
        this.A01 = null;
    }
}
