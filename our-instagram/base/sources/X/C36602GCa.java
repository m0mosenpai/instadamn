package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.GCa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36602GCa implements GYB {
    public final FragmentActivity A00;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        C14H A0l = AbstractC31172DnG.A0l();
        FragmentActivity fragmentActivity = this.A00;
        C12260kU.A0C(fragmentActivity, A0l.A04(fragmentActivity, uri));
    }

    public C36602GCa(FragmentActivity fragmentActivity) {
        this.A00 = fragmentActivity;
    }
}
