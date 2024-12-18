package X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.GOw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36927GOw implements Runnable {
    public final /* synthetic */ android.net.Uri A00;
    public final /* synthetic */ C32264EIz A01;

    public RunnableC36927GOw(android.net.Uri uri, C32264EIz c32264EIz) {
        this.A01 = c32264EIz;
        this.A00 = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C32264EIz c32264EIz = this.A01;
        FragmentActivity requireActivity = c32264EIz.requireActivity();
        Intent A04 = AbstractC31172DnG.A0l().A04(requireActivity, this.A00);
        A04.addFlags(335544320);
        String string = c32264EIz.requireArguments().getString("short_url");
        if (string != null && string.length() != 0) {
            A04.putExtra("short_url", string);
        }
        C12260kU.A0C(requireActivity, A04);
    }
}
