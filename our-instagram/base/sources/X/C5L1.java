package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.5L1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5L1 extends C0T6 implements C5L2 {
    public final String A00;

    public C5L1(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    @Override // X.C5L2
    public final C5L1 EwD() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C5L1) && C14360o3.A0K(this.A00, ((C5L1) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.C5L2
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.A00;
        if (str != null) {
            linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        }
        return new TreeUpdaterJNI("XDTMediaAttribution", AbstractC06930Yk.A0B(linkedHashMap));
    }

    @Override // X.C5L2
    public final String getName() {
        return this.A00;
    }
}
