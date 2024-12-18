package X;

import com.facebook.rsys.turnallocation.gen.TurnAllocationCallback;

/* renamed from: X.W4q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70118W4q {
    public void A03(Exception exc) {
    }

    public void A04(Object obj) {
        ((TurnAllocationCallback) ((C67967V4g) this).A01).success(AbstractC167027dH.A0Q(obj));
    }

    public static void A01(AbstractC70118W4q abstractC70118W4q, Exception exc) {
        if (abstractC70118W4q != null) {
            C11T.A02(new RunnableC71484Wuk(abstractC70118W4q, exc));
        }
    }

    public static void A02(AbstractC70118W4q abstractC70118W4q, Object obj) {
        if (abstractC70118W4q != null) {
            C11T.A02(new RunnableC71483Wuj(abstractC70118W4q, obj));
        }
    }
}
