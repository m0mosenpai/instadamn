package X;

import android.view.ViewStub;

/* renamed from: X.KwQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47375KwQ {
    public final C57012jc A00;

    public C47375KwQ(ViewStub viewStub, C7K c7k, C7X c7x, C7X c7x2, InterfaceC50487MQp interfaceC50487MQp, String str, String str2, String str3, String str4) {
        KXR kxr = new KXR();
        if (str != null) {
            kxr.A07 = str;
        }
        if (str2 != null) {
            kxr.A04 = str2;
        }
        if (str3 != null) {
            kxr.A05 = str3;
        }
        if (c7x != null) {
            AbstractC27660CIf abstractC27660CIf = AbstractC27660CIf.$redex_init_class;
            int ordinal = c7x.ordinal();
            int i = 1;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2 && ordinal != 3 && ordinal != 4) {
                        throw B4Z.A00();
                    }
                } else {
                    i = 0;
                }
            }
            kxr.A01 = i;
        }
        if (str4 != null) {
            kxr.A06 = str4;
        }
        if (c7x2 != null) {
            AbstractC27660CIf abstractC27660CIf2 = AbstractC27660CIf.$redex_init_class;
            int ordinal2 = c7x2.ordinal();
            int i2 = 1;
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    if (ordinal2 != 2 && ordinal2 != 3 && ordinal2 != 4) {
                        throw B4Z.A00();
                    }
                } else {
                    i2 = 0;
                }
            }
            kxr.A02 = i2;
        }
        if (c7k != null) {
            AbstractC27659CIe abstractC27659CIe = AbstractC27659CIe.$redex_init_class;
            int ordinal3 = c7k.ordinal();
            int i3 = 1;
            if (ordinal3 != 0) {
                if (ordinal3 == 1) {
                    i3 = 0;
                } else {
                    throw B4Z.A00();
                }
            }
            kxr.A00 = i3;
        }
        this.A00 = new C57012jc(viewStub);
        AbstractC47890LDk.A00(viewStub, interfaceC50487MQp, kxr);
    }
}
