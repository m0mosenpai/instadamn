package X;

import android.content.Context;
import com.facebook.R;

/* loaded from: classes10.dex */
public final class QKE extends AbstractC60733ROs {
    public InterfaceC02550Ad A00;
    public C0f6 A01;
    public final C37838Gks A02;
    public final AbstractC61599RqO A04 = new QKF(6);
    public final InterfaceC65489TlA A05 = new C64097SzE(this);
    public final SBB A03 = new SBB(this);
    public final InterfaceC16660sJ A06 = new C65075Td4(this, 34);

    public QKE() {
        int i;
        QIw qIw = new QIw(R.layout.barcelona_install_host_layout, R.style.AppBottomSheetDialogTheme, R.id.fragment_container, 0);
        UQ7 uq7 = new UQ7(R.layout.barcelona_install_screen_layout, R.id.mobile_data_check_box, R.id.install_button, R.id.details_text_button, 3);
        QId qId = new QId();
        UQ7 uq72 = new UQ7(R.layout.barcelona_install_details_screen_layout, R.id.version_value, R.id.apk_size_value, R.id.back_image_button, 2);
        C38628GyV c38628GyV = new C38628GyV(R.layout.barcelona_install_dialog_layout, R.style.Theme_InstallDialog, R.id.title, R.id.description, R.id.primary_button, R.id.secondary_button, 0);
        Context context = getContext();
        if (context != null) {
            i = context.getColor(R.color.igds_error_or_destructive);
        } else {
            i = 0;
        }
        this.A02 = new C37838Gks(0, c38628GyV, qIw, new UQ7(2131954761, 2131954760, 2131954759, 2131954758, 1), uq72, new UPD(2131953008, 2131953005, 2131953006, 2131953007, i, 0), uq7, qId);
    }
}
