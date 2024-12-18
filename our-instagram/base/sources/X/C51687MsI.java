package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.Map;

/* renamed from: X.MsI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51687MsI extends C0T6 {
    public static final C51687MsI A01 = new C51687MsI(AbstractC167007dF.A0n(NetInfoModule.CONNECTION_TYPE_WIFI, AbstractC06930Yk.A0E()));
    public final Map A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C51687MsI) && C14360o3.A0K(this.A00, ((C51687MsI) obj).A00));
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public C51687MsI(Map map) {
        this.A00 = map;
    }
}
