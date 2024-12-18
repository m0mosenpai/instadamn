package X;

import com.instagram.api.schemas.Achievement;
import com.instagram.api.schemas.GuidanceTipResponseImpl;

/* renamed from: X.Bh3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26119Bh3 extends C0T6 implements InterfaceC31084DlS {
    public final Achievement A00;
    public final GuidanceTipResponseImpl A01;

    public C26119Bh3(Achievement achievement, GuidanceTipResponseImpl guidanceTipResponseImpl) {
        C14360o3.A0B(achievement, 1);
        this.A00 = achievement;
        this.A01 = guidanceTipResponseImpl;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26119Bh3) {
                C26119Bh3 c26119Bh3 = (C26119Bh3) obj;
                if (!C14360o3.A0K(this.A00, c26119Bh3.A00) || !C14360o3.A0K(this.A01, c26119Bh3.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0M(this.A01);
    }
}
