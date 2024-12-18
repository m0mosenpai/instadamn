package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.Map;

/* renamed from: X.46k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C914346k extends C0T6 {
    public C103434lJ A00;
    public String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C914346k) {
                C914346k c914346k = (C914346k) obj;
                if (!C14360o3.A0K(this.A00, c914346k.A00) || !C14360o3.A0K(this.A01, c914346k.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C103434lJ c103434lJ = this.A00;
        int hashCode = (c103434lJ == null ? 0 : c103434lJ.hashCode()) * 31;
        String str = this.A01;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final TreeUpdaterJNI A00() {
        Map A0E;
        String str = this.A01;
        if (str != null) {
            A0E = AbstractC16850sd.A0M(new C09530e4("payload", str));
        } else {
            A0E = AbstractC06930Yk.A0E();
        }
        return new TreeUpdaterJNI("XDTBloksRenderResponse", A0E);
    }
}
