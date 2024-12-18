package X;

import com.google.common.util.concurrent.ListenableFuture;
import kotlinx.serialization.json.JsonElementSerializer;

/* renamed from: X.WyX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71679WyX implements InterfaceC09250da, InterfaceC16660sJ {
    public final int A00;

    public C71679WyX(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                C3AY c3ay = (C3AY) obj;
                c3ay.getClass();
                Object obj2 = c3ay.A00;
                obj2.getClass();
                ListenableFuture A02 = C2OD.A02(SSG.A00(obj2));
                C62731SNv c62731SNv = (C62731SNv) c3ay.A01;
                C64198T3h c64198T3h = new C64198T3h(C64198T3h.A03, A02);
                if (c62731SNv == null) {
                    return c64198T3h;
                }
                c62731SNv.A01(new WQK(c64198T3h));
                return c64198T3h;
            case 1:
                return obj;
            case 2:
                if (obj == null) {
                    return new NullPointerException();
                }
                return null;
            case 3:
            case 6:
            default:
                return C0eB.A00;
            case 4:
                C0f5 AEp = C18950wb.A01.AEp("IAB BrowserLiteCallbackService fetch link history error.", 817903741);
                AEp.ERI((Throwable) obj);
                AEp.report();
                return C0eB.A00;
            case 5:
                return new C25282BGy((String) obj).A02;
            case 7:
                C69634Vsb c69634Vsb = (C69634Vsb) obj;
                JsonElementSerializer jsonElementSerializer = JsonElementSerializer.A00;
                C14360o3.A0B(c69634Vsb, 0);
                C71704WzV c71704WzV = new C71704WzV(new C65881Tvk(6));
                C16930sl c16930sl = C16930sl.A00;
                c69634Vsb.A00("JsonPrimitive", c16930sl, c71704WzV);
                c69634Vsb.A00("JsonNull", c16930sl, new C71704WzV(new C65881Tvk(7)));
                c69634Vsb.A00("JsonLiteral", c16930sl, new C71704WzV(new C65881Tvk(8)));
                c69634Vsb.A00(AbstractC111324zv.A00(1677), c16930sl, new C71704WzV(new C65881Tvk(9)));
                c69634Vsb.A00(AbstractC111324zv.A00(1676), c16930sl, new C71704WzV(new C65881Tvk(10)));
                return C0eB.A00;
        }
    }
}
