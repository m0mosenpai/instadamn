package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.1sW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39511sW extends C0T6 implements InterfaceC39521sX {
    public final C39491sU A00;

    @Override // X.InterfaceC39521sX
    public final C39511sW F6c() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C39511sW) && C14360o3.A0K(this.A00, ((C39511sW) obj).A00));
    }

    public final int hashCode() {
        C39491sU c39491sU = this.A00;
        if (c39491sU == null) {
            return 0;
        }
        return c39491sU.hashCode();
    }

    @Override // X.InterfaceC39521sX
    public final /* bridge */ /* synthetic */ InterfaceC39501sV BIe() {
        return this.A00;
    }

    @Override // X.InterfaceC39521sX
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (BIe() != null) {
            InterfaceC39501sV BIe = BIe();
            if (BIe != null) {
                treeUpdaterJNI = BIe.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("instruction", treeUpdaterJNI);
        }
        return new TreeUpdaterJNI("XDTClientInvalidationInstruction", AbstractC06930Yk.A0B(linkedHashMap));
    }

    public C39511sW(C39491sU c39491sU) {
        this.A00 = c39491sU;
    }
}
