package X;

import com.facebook.systrace.Systrace;

/* renamed from: X.2Ui, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50632Ui implements C1LL {
    @Override // X.C1LL
    public final void ADN(String str, int i) {
        C14360o3.A0B(str, 0);
        if (Systrace.A0E(1L)) {
            AbstractC13090lv.A04(str, i);
        }
    }

    @Override // X.C1LL
    public final void ADO(String str) {
        C14360o3.A0B(str, 0);
        if (Systrace.A0E(1L)) {
            C0fO.A01(str, -481475189);
        }
    }

    @Override // X.C1LL
    public final void ASQ(String str, int i) {
        C14360o3.A0B(str, 0);
        if (Systrace.A0E(1L)) {
            AbstractC13090lv.A04(str, i);
        }
    }

    @Override // X.C1LL
    public final C1LP ADP(String str) {
        if (!Systrace.A0E(1L)) {
            return C1LN.A00;
        }
        return new T0y(str);
    }

    @Override // X.C1LL
    public final void ASb() {
        if (Systrace.A0E(1L)) {
            C0fO.A00(-751225047);
        }
    }

    @Override // X.C1LL
    public final boolean isTracing() {
        return Systrace.A0E(1L);
    }
}
