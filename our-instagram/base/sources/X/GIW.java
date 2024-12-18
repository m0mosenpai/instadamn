package X;

import androidx.fragment.app.FragmentActivity;

/* loaded from: classes6.dex */
public final class GIW implements GZV {
    public final /* synthetic */ C34963Fan A00;

    public GIW(C34963Fan c34963Fan) {
        this.A00 = c34963Fan;
    }

    @Override // X.GZV
    public final void Dxy(String str) {
        C34963Fan c34963Fan = this.A00;
        if (c34963Fan.A01.isAdded()) {
            FragmentActivity fragmentActivity = c34963Fan.A02;
            C9GR.A03(fragmentActivity, fragmentActivity.getString(2131968098), MSV.A00(233), 0);
        }
    }

    @Override // X.GZV
    public final void Dy0(boolean z, boolean z2) {
        C34963Fan c34963Fan = this.A00;
        if (c34963Fan.A01.isAdded()) {
            AbstractC34859FXt.A01(c34963Fan.A02, C05F.A0C, z, z2);
        }
    }
}
