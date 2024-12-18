package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Lrh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49349Lrh implements InterfaceC37198Ga9 {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C47021Kqe A02;
    public final /* synthetic */ C55174Odd A03;

    @Override // X.InterfaceC37198Ga9
    public final void DP8() {
    }

    public C49349Lrh(Fragment fragment, UserSession userSession, C47021Kqe c47021Kqe, C55174Odd c55174Odd) {
        this.A03 = c55174Odd;
        this.A02 = c47021Kqe;
        this.A01 = userSession;
        this.A00 = fragment;
    }

    @Override // X.InterfaceC37198Ga9
    public final void Dar() {
        this.A03.A05(1, 0);
        UserSession userSession = this.A01;
        Fragment fragment = this.A00;
        Bundle requireArguments = fragment.requireArguments();
        requireArguments.putSerializable("reachability_settings_upsell", EnumC33470Er5.UPSELL);
        AbstractC31172DnG.A1M(fragment, AbstractC31174DnI.A0a(fragment.requireActivity(), requireArguments, userSession, ModalActivity.class, "direct_message_options"));
    }

    @Override // X.InterfaceC37198Ga9
    public final void Dja() {
        this.A03.A05(1, 1);
    }

    @Override // X.InterfaceC37198Ga9
    public final void onCancel() {
        this.A03.A05(1, 1);
    }
}
