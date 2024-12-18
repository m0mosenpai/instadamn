package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.N9t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC52230N9t extends C1P1 {
    public final C38321qM A00;
    public final DialogInterface.OnDismissListener A01;
    public final Fragment A02;
    public final UserSession A03;
    public final C52770NXa A04;

    public AbstractC52230N9t(DialogInterface.OnDismissListener onDismissListener, Fragment fragment, UserSession userSession, C38321qM c38321qM, String str) {
        this.A02 = fragment;
        this.A03 = userSession;
        this.A00 = c38321qM;
        this.A01 = onDismissListener;
        C52770NXa c52770NXa = new C52770NXa();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean(str, true);
        c52770NXa.setArguments(A0b);
        this.A04 = c52770NXa;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int i;
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -2103558926);
        if (this.A04.isResumed()) {
            Context context = this.A02.getContext();
            if (context == null) {
                i = 1867139657;
                C0f9.A0A(i, A0N);
            }
            AbstractC53862Nrq.A00(context, abstractC115105If, 2131961880);
        }
        i = -78447529;
        C0f9.A0A(i, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int i;
        int A03 = C0f9.A03(-1609152670);
        C52770NXa c52770NXa = this.A04;
        if (!c52770NXa.isResumed()) {
            i = 2142083248;
        } else {
            c52770NXa.A08();
            DialogInterface.OnDismissListener onDismissListener = this.A01;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(null);
            }
            i = 1081747434;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-1764036774);
        Fragment fragment = this.A02;
        if (fragment.getParentFragmentManager().A0Q("ProgressDialog") == null) {
            C52770NXa c52770NXa = this.A04;
            if (!c52770NXa.isAdded()) {
                c52770NXa.A0B(fragment.getParentFragmentManager(), "ProgressDialog");
            }
        }
        C0f9.A0A(-56737798, A03);
    }
}
