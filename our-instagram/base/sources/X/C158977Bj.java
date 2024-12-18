package X;

import android.view.View;
import android.widget.TextView;

/* renamed from: X.7Bj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158977Bj implements C7QB {
    public final int A00;
    public final C162897Ra A01;
    public final C7Q6 A02;
    public final C7Q8 A03;
    public final C7QA A04;
    public final InterfaceC165077Zw A05;
    public final AnonymousClass988 A06;

    /* JADX WARN: Type inference failed for: r9v0, types: [X.7Zw, X.7ad] */
    @Override // X.C7QB
    public final /* bridge */ /* synthetic */ void D8a(Object obj) {
        View requireViewById;
        C7QD c7qd = (C7QD) obj;
        View BKF = c7qd.BKF();
        if (BKF instanceof TextView) {
            requireViewById = BKF;
        } else {
            requireViewById = BKF.requireViewById(this.A00);
        }
        TextView textView = (TextView) requireViewById;
        C7Q6 c7q6 = this.A02;
        C7Q8 c7q8 = this.A03;
        C7QA c7qa = this.A04;
        C162897Ra c162897Ra = this.A01;
        ?? r9 = this.A05;
        AnonymousClass988 anonymousClass988 = this.A06;
        boolean z = anonymousClass988.A1U;
        C7QF c7qf = new C7QF(BKF, c162897Ra, c7q6, c7q8, c7qa, r9, c7qd, z, true, ((Boolean) anonymousClass988.A0d.getValue()).booleanValue());
        C7BK c7bk = new C7BK(c7qf, BKF, textView, z);
        ((C7QE) c7qd).EZu(c7qf);
        ((C7BG) c7qd).EZ4(c7q8);
        textView.setOnTouchListener(c7bk);
    }

    @Override // X.C7QB
    public final /* bridge */ /* synthetic */ void CzN(Object obj, Object obj2) {
        C7QH BYl = ((C7QE) ((C7QD) obj)).BYl();
        if (BYl != null) {
            ((C7QG) BYl).A00 = obj2;
        }
    }

    @Override // X.C7QB
    public final /* bridge */ /* synthetic */ void Dw5(Object obj) {
        C7QH BYl = ((C7QE) ((C7QD) obj)).BYl();
        if (BYl != null) {
            ((C7QG) BYl).A00 = null;
        }
    }

    public C158977Bj(C162897Ra c162897Ra, C7Q6 c7q6, C7Q8 c7q8, C7QA c7qa, InterfaceC165077Zw interfaceC165077Zw, AnonymousClass988 anonymousClass988, int i) {
        this.A05 = interfaceC165077Zw;
        this.A06 = anonymousClass988;
        this.A02 = c7q6;
        this.A03 = c7q8;
        this.A04 = c7qa;
        this.A01 = c162897Ra;
        this.A00 = i;
    }
}
