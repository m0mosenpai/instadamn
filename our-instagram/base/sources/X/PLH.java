package X;

import androidx.fragment.app.FragmentActivity;

/* loaded from: classes9.dex */
public final class PLH implements Runnable {
    public final /* synthetic */ C52252NAr A00;

    public PLH(C52252NAr c52252NAr) {
        this.A00 = c52252NAr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C52252NAr c52252NAr = this.A00;
        FragmentActivity fragmentActivity = c52252NAr.A07;
        AbstractC10360h2 abstractC10360h2 = c52252NAr.A08;
        if (abstractC10360h2 != null && C06P.A01(abstractC10360h2) && fragmentActivity != null) {
            fragmentActivity.onBackPressed();
        }
    }
}
