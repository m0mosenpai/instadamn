package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import java.util.List;

/* renamed from: X.Isb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42557Isb implements InterfaceC38411qV {
    public final InterfaceC38251qF A00;
    public final EnumC40111tc A01;

    @Override // X.InterfaceC38411qV
    public final List BSa() {
        return null;
    }

    @Override // X.InterfaceC38411qV
    public final List Bh4() {
        return null;
    }

    public final ExtendedImageUrl A00() {
        ImageInfo BGx = this.A00.BGx();
        C14360o3.A0B(BGx, 0);
        ExtendedImageUrl A02 = AbstractC40161tk.A02(BGx);
        if (A02 != null) {
            return A02;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC38411qV
    public final EnumC40111tc BRp() {
        EnumC40111tc enumC40111tc = this.A01;
        if (enumC40111tc == null) {
            return EnumC40111tc.A0Z;
        }
        return enumC40111tc;
    }

    @Override // X.InterfaceC38411qV
    public final String getId() {
        return this.A00.getId();
    }

    public C42557Isb(InterfaceC38251qF interfaceC38251qF) {
        this.A00 = interfaceC38251qF;
        this.A01 = AbstractC40091ta.A01(interfaceC38251qF.getMediaType());
    }
}
