package X;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;

/* renamed from: X.Ily, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42150Ily implements XDF {
    public final int A00;
    public final Object A01;

    public C42150Ily(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.XDF
    public final /* synthetic */ void DOV() {
        switch (this.A00) {
            case 0:
                return;
            case 1:
            case 2:
            case 3:
            default:
                ((DialogInterface.OnDismissListener) this.A01).onDismiss(null);
                return;
            case 4:
                ((Activity) this.A01).finish();
                return;
            case 5:
                C37560GgG c37560GgG = ((C37675GiC) this.A01).A0d;
                c37560GgG.A06 = false;
                c37560GgG.A0W("resume", false);
                return;
        }
    }

    @Override // X.XDF
    public final /* synthetic */ void DOa() {
        if (5 - this.A00 == 0) {
            C37560GgG c37560GgG = ((C37675GiC) this.A01).A0d;
            c37560GgG.A06 = true;
            c37560GgG.A0S(null, "attempt_to_launch_ig_boost", false, true);
        }
    }

    @Override // X.XDF
    public final void Dpa() {
        if (this.A00 == 0) {
            AbstractC25226BEj.A1P((Fragment) this.A01);
        }
    }
}
