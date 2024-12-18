package X;

import android.content.DialogInterface;
import android.os.Handler;

/* renamed from: X.LMt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class DialogInterfaceOnDismissListenerC48024LMt implements DialogInterface.OnDismissListener {
    public final /* synthetic */ C148376m7 A00;
    public final /* synthetic */ MPD A01;
    public final /* synthetic */ String A02;

    public DialogInterfaceOnDismissListenerC48024LMt(C148376m7 c148376m7, MPD mpd, String str) {
        this.A00 = c148376m7;
        this.A02 = str;
        this.A01 = mpd;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        InterfaceC19610xo A0j;
        int i;
        C148376m7 c148376m7 = this.A00;
        String str = this.A02;
        int A00 = C148376m7.A00(c148376m7, str) + 1;
        if (C14360o3.A0K(str, "story_remix_reply")) {
            A0j = AbstractC43594JPz.A0j(c148376m7.A06);
            i = 4558;
        } else {
            if (C14360o3.A0K(str, "story_selfie_reply")) {
                A0j = AbstractC43594JPz.A0j(c148376m7.A06);
                i = 4559;
            }
            ((Handler) c148376m7.A05.getValue()).postDelayed(new M2J(this.A01), 500L);
        }
        A0j.E7D(AbstractC111324zv.A00(i), A00);
        A0j.apply();
        ((Handler) c148376m7.A05.getValue()).postDelayed(new M2J(this.A01), 500L);
    }
}
