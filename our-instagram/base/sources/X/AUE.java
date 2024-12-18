package X;

import androidx.fragment.app.FragmentActivity;

/* loaded from: classes4.dex */
public final class AUE implements InterfaceC58362lv {
    public final /* synthetic */ C191478dz A00;

    public AUE(C191478dz c191478dz) {
        this.A00 = c191478dz;
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C191478dz c191478dz = this.A00;
        c191478dz.A0G();
        FragmentActivity fragmentActivity = c191478dz.A0X;
        C9GR.A0B(fragmentActivity, "fetch_media_failed");
        c191478dz.A0A.A02 = true;
        fragmentActivity.finish();
    }
}
