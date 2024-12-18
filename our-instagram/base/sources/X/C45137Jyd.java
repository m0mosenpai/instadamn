package X;

import com.instagram.api.schemas.ContentAppreciationFeatureStatus;

/* renamed from: X.Jyd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45137Jyd extends C0T6 implements MRX {
    public final ContentAppreciationFeatureStatus A00;

    public C45137Jyd(ContentAppreciationFeatureStatus contentAppreciationFeatureStatus) {
        C14360o3.A0B(contentAppreciationFeatureStatus, 1);
        this.A00 = contentAppreciationFeatureStatus;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C45137Jyd) && this.A00 == ((C45137Jyd) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
