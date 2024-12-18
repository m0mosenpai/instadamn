package X;

import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.MHl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50256MHl extends C0YY implements InterfaceC16660sJ {
    public final int A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50256MHl(int i) {
        super(1);
        this.A00 = i;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Number number;
        if (7 - this.A00 != 0) {
            return C0eB.A00;
        }
        C47494KyN c47494KyN = (C47494KyN) obj;
        Long l = null;
        if (c47494KyN != null && (number = c47494KyN.A01) != null) {
            long longValue = number.longValue();
            Number number2 = c47494KyN.A00;
            if (number2 != null) {
                l = Long.valueOf(number2.longValue());
            }
            return new MsysThreadId(EnumC92794Ds.A04, l, longValue);
        }
        throw AbstractC166987dD.A18("create_secure_thread: Group creation failed");
    }
}
