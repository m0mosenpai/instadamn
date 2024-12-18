package X;

import java.util.List;

/* renamed from: X.Tx9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C65957Tx9 {
    public int A00;
    public int A01;
    public final C65959TxB A02 = new C65959TxB();
    public final boolean A03;

    public final void A03(Integer num, Object obj) {
        C65959TxB c65959TxB = this.A02;
        List list = c65959TxB.A00;
        if (!list.contains(obj)) {
            list.add(obj);
            c65959TxB.A01.add(null);
        }
        this.A00++;
        if (num.intValue() == 0) {
            this.A01++;
        }
    }

    public final C65956Tx8 A00() {
        C65959TxB c65959TxB = this.A02;
        List list = c65959TxB.A00;
        int size = list.size();
        List list2 = c65959TxB.A01;
        if (size == list2.size()) {
            return new C65956Tx8(list, list2);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void A01(C65954Twz c65954Twz, Object obj) {
        C65959TxB c65959TxB = this.A02;
        c65954Twz.A00 = this.A00;
        c65954Twz.A01 = this.A01;
        c65954Twz.A0J = this.A03;
        Tx0 tx0 = new Tx0(c65954Twz);
        List list = c65959TxB.A00;
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Any");
        list.add(obj);
        c65959TxB.A01.add(tx0);
        this.A00++;
        this.A01++;
    }

    public final void A02(C65954Twz c65954Twz, Object obj) {
        C65959TxB c65959TxB = this.A02;
        c65954Twz.A00 = this.A00;
        c65954Twz.A01 = this.A01;
        c65954Twz.A0J = this.A03;
        Tx0 tx0 = new Tx0(c65954Twz);
        List list = c65959TxB.A00;
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Any");
        if (!list.contains(obj)) {
            C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Any");
            list.add(obj);
            c65959TxB.A01.add(tx0);
        }
        this.A00++;
        this.A01++;
    }

    public final void A04(Integer num, Object obj, Object obj2) {
        int i;
        C65959TxB c65959TxB = this.A02;
        List list = c65959TxB.A00;
        if (!list.contains(obj)) {
            list.add(obj);
            c65959TxB.A01.add(obj2);
        }
        this.A00++;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                i = 0;
            } else {
                return;
            }
        } else {
            i = this.A01 + 1;
        }
        this.A01 = i;
    }

    public C65957Tx9(boolean z) {
        this.A03 = z;
    }
}
