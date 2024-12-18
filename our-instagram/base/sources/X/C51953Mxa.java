package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Mxa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51953Mxa extends C0T6 implements InterfaceC57890Plu {
    public final int A00;
    public final int A01;
    public final ImageUrl A02;
    public final Integer A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51953Mxa) {
                C51953Mxa c51953Mxa = (C51953Mxa) obj;
                if (this.A01 != c51953Mxa.A01 || this.A00 != c51953Mxa.A00 || this.A03 != c51953Mxa.A03 || !C14360o3.A0K(this.A02, c51953Mxa.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int i = ((this.A01 * 31) + this.A00) * 31;
        int intValue = this.A03.intValue();
        if (1 != intValue) {
            str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        } else {
            str = "SAVED_AUDIO";
        }
        return AbstractC25231BEo.A0H(str, intValue, i) + AbstractC167017dG.A0M(this.A02);
    }

    public C51953Mxa(ImageUrl imageUrl, Integer num, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = num;
        this.A02 = imageUrl;
    }
}
