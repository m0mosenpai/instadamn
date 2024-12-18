package X;

import com.instagram.api.schemas.Challenge;

/* renamed from: X.KNw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45769KNw extends AbstractC46412KgY {
    public final Challenge A00;
    public final CQS A01;

    public C45769KNw(Challenge challenge, CQS cqs) {
        C14360o3.A0B(challenge, 1);
        this.A00 = challenge;
        this.A01 = cqs;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45769KNw) {
                C45769KNw c45769KNw = (C45769KNw) obj;
                if (!C14360o3.A0K(this.A00, c45769KNw.A00) || !C14360o3.A0K(this.A01, c45769KNw.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }
}
