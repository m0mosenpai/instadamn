package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Syl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64069Syl implements InterfaceC65342TiP {
    public final /* synthetic */ Q7d A00;

    public C64069Syl(Q7d q7d) {
        this.A00 = q7d;
    }

    @Override // X.InterfaceC65342TiP
    public final void D6R(Bundle bundle, C62406SAf c62406SAf) {
        FragmentActivity requireActivity = this.A00.requireActivity();
        Intent A00 = SV2.A00(requireActivity.getIntent(), bundle, c62406SAf);
        int i = 0;
        if (c62406SAf == null) {
            i = -1;
        }
        requireActivity.setResult(i, A00);
        requireActivity.finish();
    }
}
