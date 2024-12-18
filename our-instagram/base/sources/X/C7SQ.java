package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;

/* renamed from: X.7SQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7SQ implements InterfaceC161707Mf {
    public final View A00;
    public final InterfaceC161707Mf A01;
    public final C162957Rg A02;

    @Override // X.InterfaceC161707Mf
    public final void APo(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        InterfaceC161707Mf interfaceC161707Mf = this.A01;
        if (interfaceC161707Mf != null) {
            interfaceC161707Mf.APo(motionEvent);
        }
    }

    @Override // X.InterfaceC161707Mf
    public final boolean Eiq(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        InterfaceC161707Mf interfaceC161707Mf = this.A01;
        if (interfaceC161707Mf != null) {
            return interfaceC161707Mf.Eiq(motionEvent);
        }
        return false;
    }

    @Override // X.InterfaceC161707Mf
    public final void DBy(float f, float f2) {
        C55982hj c55982hj;
        InterfaceC161707Mf interfaceC161707Mf = this.A01;
        if (interfaceC161707Mf != null) {
            interfaceC161707Mf.DBy(f, f2);
        }
        View view = this.A00;
        C14360o3.A0C(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setTranslationX(f);
        }
        C162957Rg c162957Rg = this.A02;
        float min = Math.min(f / f2, 1.0f);
        C162987Rj c162987Rj = c162957Rg.A0A;
        boolean z = false;
        if (c162957Rg.A04.A00() == 0) {
            z = true;
        }
        c162987Rj.A00 = f;
        c162987Rj.A02 = min;
        if (z && ((c55982hj = c162987Rj.A03) == null || c55982hj.A0C())) {
            C162987Rj.A00(c162987Rj, f, min);
        }
        ViewStub viewStub = c162957Rg.A09;
        if (viewStub != null && viewStub.getParent() != null) {
            c162957Rg.A03 = c162957Rg.A05.getView();
        }
        View view2 = c162957Rg.A03;
        if (view2 != null) {
            view2.setTranslationX(f + c162957Rg.A02);
        }
    }

    @Override // X.InterfaceC161707Mf
    public final boolean Ej5() {
        InterfaceC161707Mf interfaceC161707Mf = this.A01;
        if (interfaceC161707Mf != null) {
            return interfaceC161707Mf.Ej5();
        }
        return false;
    }

    public C7SQ(View view, InterfaceC161707Mf interfaceC161707Mf, C162957Rg c162957Rg) {
        this.A00 = view;
        this.A02 = c162957Rg;
        this.A01 = interfaceC161707Mf;
    }
}
