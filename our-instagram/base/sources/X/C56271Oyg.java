package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.Oyg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56271Oyg implements InterfaceC58282Psa {
    public C49519LuY A00;
    public final InterfaceC58043PoT A01;

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC58282Psa
    public final void AQM(float f) {
    }

    @Override // X.InterfaceC58282Psa
    public final void COD(ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        C49519LuY c49519LuY = this.A00;
        if (c49519LuY != null) {
            MSX.A11(viewGroup);
            viewGroup.addView(c49519LuY.A06);
        } else {
            C14360o3.A0F("musicAdjustmentController");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC58282Psa
    public final boolean CRk() {
        return true;
    }

    @Override // X.InterfaceC58282Psa
    public final boolean CRl() {
        return true;
    }

    @Override // X.InterfaceC58282Psa
    public final /* synthetic */ void D01() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC58282Psa
    public final void DHV(float f, float f2) {
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

    @Override // X.InterfaceC58282Psa
    public final void AJN() {
        this.A01.AJN();
    }

    @Override // X.InterfaceC58282Psa
    public final List Ben() {
        return AbstractC166987dD.A1J(EnumC53228NgQ.A03);
    }

    @Override // X.InterfaceC58282Psa
    public final void cancel() {
        this.A01.cancel();
    }

    public C56271Oyg(InterfaceC58043PoT interfaceC58043PoT) {
        this.A01 = interfaceC58043PoT;
    }
}
