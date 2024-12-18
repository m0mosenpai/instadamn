package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewFlipper;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.feedcolorfilterpicker.FeedColorFilterPicker;
import java.util.List;

/* renamed from: X.Oyi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56273Oyi implements InterfaceC58282Psa {
    public ViewFlipper A00;
    public FeedColorFilterPicker A01;
    public final P03 A02;
    public final UserSession A03;

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC58282Psa
    public final void AQM(float f) {
    }

    @Override // X.InterfaceC58282Psa
    public final void COD(ViewGroup viewGroup) {
        String str;
        ViewFlipper viewFlipper = (ViewFlipper) AbstractC31177DnL.A0E(viewGroup, 0).inflate(R.layout.photo_edit_tool_view_flipper, viewGroup).requireViewById(R.id.edit_tool_view_flipper);
        this.A00 = viewFlipper;
        if (viewFlipper == null) {
            str = "viewContainer";
        } else {
            FeedColorFilterPicker feedColorFilterPicker = (FeedColorFilterPicker) viewFlipper.requireViewById(R.id.tool_picker);
            this.A01 = feedColorFilterPicker;
            str = "toolPicker";
            if (feedColorFilterPicker != null) {
                feedColorFilterPicker.A05 = new C56239Oxm(this);
                feedColorFilterPicker.setEffects(this.A02.A00, false, this.A03);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
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
        this.A02.AJN();
    }

    @Override // X.InterfaceC58282Psa
    public final List Ben() {
        return AbstractC166987dD.A1J(EnumC53228NgQ.A03);
    }

    @Override // X.InterfaceC58282Psa
    public final void cancel() {
        this.A02.cancel();
    }

    public C56273Oyi(UserSession userSession, P03 p03) {
        this.A03 = userSession;
        this.A02 = p03;
    }
}
