package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.MsM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51691MsM extends C0T6 {
    public final List A00;
    public final boolean A01;
    public final ArrayList A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51691MsM) {
                C51691MsM c51691MsM = (C51691MsM) obj;
                if (!C14360o3.A0K(this.A00, c51691MsM.A00) || this.A01 != c51691MsM.A01 || !C14360o3.A0K(this.A02, c51691MsM.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A01, AbstractC167017dG.A0M(this.A00) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public C51691MsM(ArrayList arrayList, List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
        this.A02 = arrayList;
    }

    public C51691MsM() {
        this(null, null, false);
    }
}
