package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class H6L extends C0T6 implements InterfaceC43493JJf {
    public final String A00;

    @Override // X.InterfaceC43493JJf
    public final H6L F2T() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof H6L) && C14360o3.A0K(this.A00, ((H6L) obj).A00));
    }

    public final int hashCode() {
        return AbstractC167017dG.A0O(this.A00);
    }

    public H6L(String str) {
        this.A00 = str;
    }

    @Override // X.InterfaceC43493JJf
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        String str = this.A00;
        if (str != null) {
            A0X.put("whatsapp_deeplink_url", str);
        }
        return AbstractC37300Gc1.A05("XDTStoryWhatsAppStickerTappableData", AbstractC06930Yk.A0B(A0X));
    }
}
