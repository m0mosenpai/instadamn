package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.Dnr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31208Dnr extends C0T6 implements InterfaceC115285Iz {
    public final String A00;

    @Override // X.InterfaceC115285Iz
    public final C31208Dnr Eul() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C31208Dnr) && C14360o3.A0K(this.A00, ((C31208Dnr) obj).A00));
    }

    @Override // X.InterfaceC115285Iz
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        String str = this.A00;
        if (str != null) {
            A1I.put("headline", str);
        }
        return new TreeUpdaterJNI("XDTIGLeadGenIncentiveInfoDict", AbstractC06930Yk.A0B(A1I));
    }

    public final int hashCode() {
        return AbstractC167017dG.A0O(this.A00);
    }

    public C31208Dnr(String str) {
        this.A00 = str;
    }

    @Override // X.InterfaceC115285Iz
    public final String BDM() {
        return this.A00;
    }
}
