package X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.3sl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86143sl implements C33R {
    public ViewGroup A00;
    public TextView A01;
    public TextView A02;
    public Runnable A03;
    public final Handler A04;
    public final InterfaceC56392iX A05;

    @Override // X.C33R
    public final void DSJ(C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c75113Zb, 0);
        if (i == 17 && !c75113Zb.A22) {
            Handler handler = this.A04;
            Runnable runnable = this.A03;
            if (runnable != null) {
                handler.removeCallbacks(runnable);
            } else {
                C14360o3.A0F("runnable");
                throw C00O.createAndThrow();
            }
        }
    }

    public C86143sl(ViewStub viewStub) {
        InterfaceC56392iX A01 = viewStub != null ? AbstractC56372iV.A01(viewStub, false, false) : null;
        this.A05 = A01;
        this.A04 = new Handler(Looper.getMainLooper());
        if (A01 != null) {
            A01.EZv(new InterfaceC69513Al() { // from class: X.3sm
                @Override // X.InterfaceC69513Al
                public final /* bridge */ /* synthetic */ void DLu(View view) {
                    C14360o3.A0B(view, 0);
                    C86143sl c86143sl = C86143sl.this;
                    c86143sl.A02 = (TextView) view.findViewById(R.id.feed_preview_watch_again_text);
                    c86143sl.A00 = (ViewGroup) view.findViewById(R.id.feed_cta_button);
                    c86143sl.A01 = (TextView) view.findViewById(R.id.feed_cta_button_text);
                }
            });
        }
    }
}
