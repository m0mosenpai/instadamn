package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGConsiderAndBrowseType;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class HNH extends C17T implements InterfaceC43502JJo {
    @Override // X.InterfaceC43502JJo
    public final IGConsiderAndBrowseType CHH() {
        return (IGConsiderAndBrowseType) A0M(-99865430, J99.A00);
    }

    @Override // X.InterfaceC43502JJo
    public final C38245Gro ErR() {
        return new C38245Gro(CHH());
    }

    @Override // X.InterfaceC43502JJo
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (CHH() != null) {
            IGConsiderAndBrowseType CHH = CHH();
            C14360o3.A0B(CHH, 0);
            A0X.put("watch_type", CHH.A00);
        }
        return AbstractC37304Gc5.A07(this, A0X);
    }
}
