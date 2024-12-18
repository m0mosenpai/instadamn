package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.modal.ModalActivity;

/* renamed from: X.M6s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC50029M6s implements Runnable {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ EnumC46208Kck A02;
    public final /* synthetic */ LGY A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ Integer A05;

    public RunnableC50029M6s(Bundle bundle, Fragment fragment, EnumC46208Kck enumC46208Kck, LGY lgy, Integer num, Integer num2) {
        this.A04 = num;
        this.A02 = enumC46208Kck;
        this.A05 = num2;
        this.A00 = bundle;
        this.A03 = lgy;
        this.A01 = fragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("BUNDLE_ENTRY_POINT", AbstractC46735Kls.A00(this.A04));
        A0b.putString("BUNDLE_SURFACE", EnumC46149Kbn.A04.toString());
        A0b.putString("BUNDLE_SCREEN", this.A02.A00);
        A0b.putString("BUNDLE_ONBOARDING_PERIOD", AbstractC46734Klr.A00(this.A05));
        A0b.putAll(this.A00);
        LGY lgy = this.A03;
        Fragment fragment = this.A01;
        if (fragment.getActivity() != null) {
            C6XJ A03 = C6XJ.A03(fragment.requireActivity(), A0b, lgy.A00, ModalActivity.class, "encrypted_backups_screen");
            A03.A07();
            A03.A07 = true;
            A03.A0D(fragment, 62577805);
        }
    }
}
