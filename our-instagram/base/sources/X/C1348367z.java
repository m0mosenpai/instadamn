package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.67z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1348367z extends C0T6 implements InterfaceC1348167r {
    public final String A00;

    public C1348367z(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    @Override // X.InterfaceC1348167r
    public final C1348367z Eyl() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1348367z) && C14360o3.A0K(this.A00, ((C1348367z) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC1348167r
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.A00;
        if (str != null) {
            linkedHashMap.put("prompt_text", str);
        }
        return new TreeUpdaterJNI("XDTPromptReplyNoteResponseInfo", AbstractC06930Yk.A0B(linkedHashMap));
    }
}
