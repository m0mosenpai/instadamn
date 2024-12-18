package X;

import android.content.Context;
import android.view.MotionEvent;
import com.instagram.model.reels.Reel;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.lang.ref.WeakReference;

/* renamed from: X.6hR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145686hR implements InterfaceC145696hS {
    public C148626mX A00;
    public final InterfaceC1118853a A01;
    public final InterfaceC144586fe A02;
    public final WeakReference A03;

    @Override // X.InterfaceC144616fh
    public final boolean DQr(MotionEvent motionEvent) {
        return false;
    }

    @Override // X.InterfaceC144616fh
    public final boolean Ddl(C84823qW c84823qW, int i, int i2) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC144626fi, X.InterfaceC144636fj
    public final boolean Drb(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C14360o3.A0B(motionEvent, 0);
        C14360o3.A0B(motionEvent2, 1);
        return this.A02.Drb(motionEvent, motionEvent2, f, f2);
    }

    @Override // X.InterfaceC144616fh
    public final void DBc(float f) {
        this.A02.DBc(f);
    }

    @Override // X.InterfaceC145696hS
    public final void DEn() {
        this.A01.CqT();
    }

    @Override // X.InterfaceC144616fh
    public final void DQV(float f, float f2) {
        this.A02.DQV(f, f2);
    }

    @Override // X.InterfaceC145696hS
    public final void DZP(Reel reel) {
        ReelViewerFragment reelViewerFragment = (ReelViewerFragment) this.A01;
        C41551w4 c41551w4 = reelViewerFragment.A0a;
        if (c41551w4 != null) {
            reelViewerFragment.A1C.EG9(reelViewerFragment.A1C.CNP(reel));
            reelViewerFragment.A1C.Epc(reel, c41551w4);
            reelViewerFragment.FAc(-1);
            reelViewerFragment.A1C.notifyDataSetChanged();
        }
    }

    @Override // X.InterfaceC145696hS
    public final void DpO(C41181vS c41181vS, C41551w4 c41551w4, NSJ nsj, boolean z) {
        InterfaceC1118853a interfaceC1118853a = this.A01;
        if (C14360o3.A0K(((ReelViewerFragment) interfaceC1118853a).A0a, c41551w4) || z) {
            interfaceC1118853a.D8u(c41181vS, nsj);
        }
    }

    @Override // X.InterfaceC144626fi, X.InterfaceC144636fj
    public final boolean DrS(float f, float f2) {
        return this.A02.DrS(f, f2);
    }

    @Override // X.InterfaceC144626fi
    public final boolean DrU() {
        return this.A02.DrU();
    }

    @Override // X.InterfaceC144626fi
    public final boolean DrW() {
        return this.A02.DrW();
    }

    @Override // X.InterfaceC144616fh
    public final void DsB(float f, float f2) {
        this.A02.DsB(f, f2);
    }

    @Override // X.InterfaceC144616fh
    public final void Dwo(boolean z) {
        this.A02.Dwo(z);
    }

    public C145686hR(InterfaceC1118853a interfaceC1118853a, InterfaceC144586fe interfaceC144586fe, WeakReference weakReference) {
        this.A03 = weakReference;
        this.A02 = interfaceC144586fe;
        this.A01 = interfaceC1118853a;
    }

    @Override // X.InterfaceC145696hS
    public final void CuZ(Context context, C41181vS c41181vS) {
        int A0A = (int) (AbstractC13880nE.A0A(context) * AbstractC84863qa.A00(context));
        int A0A2 = AbstractC13880nE.A0A(context);
        if (AbstractC13620mo.A02(context)) {
            A0A = A0A2 - A0A;
        }
        this.A02.DsB(A0A + 1, 0.0f);
    }
}
