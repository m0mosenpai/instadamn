package X;

import android.widget.Toast;
import com.instagram.direct.fragment.icebreaker.DirectIceBreakerSettingFragment;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class G1R implements InterfaceC37166GZd {
    public final /* synthetic */ DirectIceBreakerSettingFragment A00;

    public G1R(DirectIceBreakerSettingFragment directIceBreakerSettingFragment) {
        this.A00 = directIceBreakerSettingFragment;
    }

    @Override // X.InterfaceC37166GZd
    public final void Cue() {
        DirectIceBreakerSettingFragment directIceBreakerSettingFragment = this.A00;
        Toast toast = directIceBreakerSettingFragment.A02;
        if (toast != null) {
            toast.cancel();
            directIceBreakerSettingFragment.A02 = null;
        }
        C35009Fbg.A00(directIceBreakerSettingFragment);
        AbstractC34057F1k.A00(directIceBreakerSettingFragment.A00, directIceBreakerSettingFragment.A04, 2131974293);
        C34923Fa9 c34923Fa9 = directIceBreakerSettingFragment.A07;
        HashMap A1G = AbstractC166987dD.A1G();
        AbstractC31171DnF.A1U("TOGGLE_SHOW_QUESTIONS_FOR_RESTART_CHAT_STATUS_REQUEST_FAILURE", A1G);
        C34923Fa9.A00(c34923Fa9, "icebreaker_settings_error_screen_impression", "There was a HTTP request failure to toggle icebreaker show questions for restart chat switch button", A1G);
    }

    @Override // X.InterfaceC37166GZd
    public final void Cun() {
        DirectIceBreakerSettingFragment directIceBreakerSettingFragment = this.A00;
        directIceBreakerSettingFragment.A02 = C9GR.A01(directIceBreakerSettingFragment.A00, null, 2131959507, 1);
        C56352iT.A0t.A03(directIceBreakerSettingFragment.A03).ETp(false);
        directIceBreakerSettingFragment.setItems(directIceBreakerSettingFragment.A06.A01());
    }

    @Override // X.InterfaceC37166GZd
    public final void Cuo() {
        DirectIceBreakerSettingFragment directIceBreakerSettingFragment = this.A00;
        Toast toast = directIceBreakerSettingFragment.A02;
        if (toast != null) {
            toast.cancel();
            directIceBreakerSettingFragment.A02 = null;
        }
        C35009Fbg.A00(directIceBreakerSettingFragment);
    }
}
