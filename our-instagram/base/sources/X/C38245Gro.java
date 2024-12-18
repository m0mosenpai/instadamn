package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGConsiderAndBrowseType;
import java.util.LinkedHashMap;

/* renamed from: X.Gro, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38245Gro extends C0T6 implements InterfaceC43502JJo {
    public final IGConsiderAndBrowseType A00;

    public C38245Gro(IGConsiderAndBrowseType iGConsiderAndBrowseType) {
        C14360o3.A0B(iGConsiderAndBrowseType, 1);
        this.A00 = iGConsiderAndBrowseType;
    }

    @Override // X.InterfaceC43502JJo
    public final C38245Gro ErR() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C38245Gro) && this.A00 == ((C38245Gro) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC43502JJo
    public final IGConsiderAndBrowseType CHH() {
        return this.A00;
    }

    @Override // X.InterfaceC43502JJo
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (CHH() != null) {
            IGConsiderAndBrowseType CHH = CHH();
            C14360o3.A0B(CHH, 0);
            A0X.put("watch_type", CHH.A00);
        }
        return AbstractC37300Gc1.A05("XDTBrowseInfoDict", AbstractC06930Yk.A0B(A0X));
    }
}
