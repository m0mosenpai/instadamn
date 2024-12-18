package X;

import android.content.Context;

/* renamed from: X.Cym, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29472Cym implements InterfaceC31155Dmz {
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;

    @Override // X.InterfaceC30959DjG
    public final /* bridge */ /* synthetic */ Object EKN(Context context, InterfaceC30923Dia interfaceC30923Dia) {
        float f;
        float f2;
        float f3;
        Integer num = C05F.A00;
        int intValue = this.A01.intValue();
        if (intValue != 1) {
            if (intValue == 0) {
                f = 0.75f;
            } else {
                throw B4Z.A00();
            }
        } else {
            f = 0.8f;
        }
        Integer num2 = this.A00;
        C27986CVj c27986CVj = new C27986CVj(num, f, AbstractC27721CKo.A00(num2));
        Integer num3 = C05F.A01;
        Integer num4 = this.A02;
        int intValue2 = num4.intValue();
        if (intValue2 != 0) {
            if (intValue2 != 1) {
                if (intValue2 == 2) {
                    f2 = 1.0f;
                } else {
                    throw B4Z.A00();
                }
            } else {
                f2 = 0.98f;
            }
        } else {
            f2 = 0.97f;
        }
        C27986CVj c27986CVj2 = new C27986CVj(num3, f2, AbstractC27721CKo.A00(num2));
        Integer num5 = C05F.A0C;
        int intValue3 = num4.intValue();
        if (intValue3 != 0) {
            if (intValue3 != 1) {
                if (intValue3 == 2) {
                    f3 = 1.0f;
                } else {
                    throw B4Z.A00();
                }
            } else {
                f3 = 0.98f;
            }
        } else {
            f3 = 0.97f;
        }
        return new CV8(AbstractC16960so.A1Q(c27986CVj, c27986CVj2, new C27986CVj(num5, f3, AbstractC27721CKo.A00(num2))));
    }

    public C29472Cym(Integer num, Integer num2, Integer num3) {
        AbstractC167027dH.A13(num, num2, num3);
        this.A01 = num;
        this.A02 = num2;
        this.A00 = num3;
    }
}
