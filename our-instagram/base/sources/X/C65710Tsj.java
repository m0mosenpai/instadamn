package X;

import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.View;
import com.facebook.R;

/* renamed from: X.Tsj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65710Tsj implements InterfaceC65626Tpm, C07W {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C65710Tsj(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onPause(C07X c07x) {
        C69293Vl1 c69293Vl1;
        if (this.A00 != 0 && (c69293Vl1 = (C69293Vl1) this.A02) != null) {
            View view = c69293Vl1.A01;
            if (view != null && view.getVisibility() == 0) {
                AbstractC167007dF.A0x(c69293Vl1.A01);
            }
            c69293Vl1.A00 = null;
            c69293Vl1.A01 = null;
            c69293Vl1.A02 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.Runnable] */
    @Override // X.InterfaceC65626Tpm
    public final void onResume(C07X c07x) {
        if (this.A00 != 0) {
            C69293Vl1 c69293Vl1 = (C69293Vl1) this.A02;
            if (c69293Vl1 != null) {
                EK5 ek5 = (EK5) this.A01;
                C14360o3.A0B(ek5, 0);
                c69293Vl1.A02 = ek5;
                if (c69293Vl1.A01 == null) {
                    c69293Vl1.A01 = c69293Vl1.A04.requireViewById(R.id.scrim_screen_overlay);
                    c69293Vl1.A00 = new GestureDetector(c69293Vl1.A03, new UA2(c69293Vl1));
                    View view = c69293Vl1.A01;
                    if (view != null) {
                        WO5.A00(view, 10, c69293Vl1);
                    }
                }
                View view2 = c69293Vl1.A01;
                if (view2 != null) {
                    view2.setVisibility(0);
                    return;
                }
                return;
            }
            return;
        }
        Handler.createAsync(Looper.getMainLooper()).postDelayed(new Object(), 500L);
        ((C07T) this.A02).A0A(this);
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onCreate(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onDestroy(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStart(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStop(C07X c07x) {
    }
}
