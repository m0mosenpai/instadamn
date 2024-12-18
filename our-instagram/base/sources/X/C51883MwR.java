package X;

import com.instagram.rtc.rsys.models.IgCallModel;
import java.util.List;

/* renamed from: X.MwR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51883MwR extends C0T6 implements InterfaceC57855PlL {
    public final IgCallModel A00;
    public final String A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51883MwR) {
                C51883MwR c51883MwR = (C51883MwR) obj;
                if (!C14360o3.A0K(this.A01, c51883MwR.A01) || !C14360o3.A0K(this.A02, c51883MwR.A02) || !C14360o3.A0K(this.A00, c51883MwR.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C51883MwR(IgCallModel igCallModel, String str, List list) {
        this.A01 = str;
        this.A02 = list;
        this.A00 = igCallModel;
    }

    public C51883MwR() {
        this(null, "unknown", null);
    }
}
