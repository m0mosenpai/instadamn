package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.44A, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C44A extends C0T6 implements C44B {
    public final String A00;

    public C44A(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    @Override // X.C44B
    public final C44A ExS() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C44A) && C14360o3.A0K(this.A00, ((C44A) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.C44B
    public final String BKO() {
        return this.A00;
    }

    @Override // X.C44B
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.A00;
        if (str != null) {
            linkedHashMap.put("json_response", str);
        }
        return new TreeUpdaterJNI("XDTNotificationSettingResponse", AbstractC06930Yk.A0B(linkedHashMap));
    }
}
