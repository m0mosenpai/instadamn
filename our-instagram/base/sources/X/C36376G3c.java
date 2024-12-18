package X;

import android.widget.CompoundButton;

/* renamed from: X.G3c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36376G3c implements JH0 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C36376G3c(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.JH0
    public final void DCh(int i) {
        switch (this.A00) {
            case 0:
                G39 g39 = (G39) this.A02;
                g39.A03.C78().CqA(g39.A01, g39.A05, i);
                return;
            case 1:
                G3B g3b = (G3B) this.A02;
                g3b.A04.C78().CqJ(g3b.A01, g3b.A05.A0L, i);
                return;
            case 2:
                C31659DvP c31659DvP = (C31659DvP) this.A02;
                C34655FOo c34655FOo = C31659DvP.A08;
                c31659DvP.A03.CqE((C3o9) this.A01, i);
                return;
            default:
                C31659DvP c31659DvP2 = (C31659DvP) this.A02;
                C34655FOo c34655FOo2 = C31659DvP.A08;
                c31659DvP2.A03.CqM((C3o9) this.A01, i);
                return;
        }
    }

    @Override // X.JH0
    public final void onCancel() {
        switch (this.A00) {
            case 0:
                ((CompoundButton) this.A01).setChecked(false);
                return;
            case 1:
                ((CompoundButton) this.A01).setChecked(false);
                ((G3B) this.A02).A06.onToggle(false);
                return;
            default:
                return;
        }
    }
}
