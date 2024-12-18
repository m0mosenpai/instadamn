package X;

import android.os.Bundle;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.arads.ArAdsUIModel;

/* renamed from: X.WiI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70852WiI implements MOT {
    public final /* synthetic */ C69662Vt3 A00;
    public final /* synthetic */ ArAdsUIModel A01;

    public C70852WiI(C69662Vt3 c69662Vt3, ArAdsUIModel arAdsUIModel) {
        this.A00 = c69662Vt3;
        this.A01 = arAdsUIModel;
    }

    @Override // X.MOT
    public final void DsR(TargetViewSizeProvider targetViewSizeProvider) {
        C69662Vt3 c69662Vt3 = this.A00;
        ArAdsUIModel arAdsUIModel = this.A01;
        Bundle bundle = new Bundle();
        bundle.putSerializable("camera_entry_point", c69662Vt3.A09);
        bundle.putString("effect_id", c69662Vt3.A0C);
        bundle.putString(AbstractC111324zv.A00(3222), c69662Vt3.A0D);
        bundle.putString("encoded_token", c69662Vt3.A0B);
        bundle.putString(MSV.A00(42), c69662Vt3.A01);
        bundle.putParcelable(AbstractC111324zv.A00(721), arAdsUIModel);
        bundle.putString("device_position", c69662Vt3.A02);
        bundle.putString("media_id", c69662Vt3.A03);
        bundle.putString(DatePickerDialogModule.ARG_MODE, c69662Vt3.A04);
        bundle.putParcelable(AbstractC111324zv.A00(1925), targetViewSizeProvider);
        C6XJ A02 = C6XJ.A02(c69662Vt3.A08, bundle, c69662Vt3.A0A, TransparentModalActivity.class, "ar_ads_camera");
        AbstractC31179DnN.A1S(A02);
        C11T.A02(new RunnableC71470WuW(c69662Vt3, A02));
    }
}
