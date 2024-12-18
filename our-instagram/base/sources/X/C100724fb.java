package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.ListIterator;

/* renamed from: X.4fb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100724fb extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Context A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C100724fb(Context context, long j, long j2) {
        super(1);
        this.A02 = context;
        this.A00 = j;
        this.A01 = j2;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        long j;
        C1ZX c1zx = (C1ZX) obj;
        C14360o3.A0B(c1zx, 0);
        Context context = this.A02;
        long j2 = this.A00;
        long j3 = this.A01;
        int i = C25131Kr.A00;
        if (i > 0 && i < Integer.MAX_VALUE && C25131Kr.A01 > 0 && AbstractC50712Us.A01.A06(0, i) == 0) {
            C2ZW c2zw = new C2ZW("cold_start", null, 0, j2, true);
            C16930sl c16930sl = C16930sl.A00;
            C9BC c9bc = C51652Yn.A01;
            ArrayList A0T = AbstractC001800i.A0T(new C2ZV(c9bc, c9bc, c2zw, c16930sl, c16930sl), C51652Yn.A05.A04(context, C25131Kr.A01));
            c1zx.A03("aware_trace_readable", AbstractC100734fc.A01(A0T));
            c1zx.A01("aware_trace_count", A0T.size());
            c1zx.A03("aware_trace", AbstractC100734fc.A02(A0T).toString());
            ListIterator listIterator = A0T.listIterator(A0T.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    obj2 = listIterator.previous();
                    C2ZT c2zt = ((C2ZV) obj2).A03;
                    if (!(c2zt instanceof C100834fv) && !(c2zt instanceof C2ZS)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            C2ZV c2zv = (C2ZV) obj2;
            if (c2zv != null) {
                j = c2zv.A03.A00;
            } else {
                j = 0;
            }
            c1zx.A02("time_from_last_action_to_app_kill", j3 - j);
        }
        return C0eB.A00;
    }
}
