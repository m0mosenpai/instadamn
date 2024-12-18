package X;

import com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType;

/* loaded from: classes9.dex */
public final class NJU extends AbstractC53462Nkp {
    public final PublishScreenCategoryType A00;

    public NJU(PublishScreenCategoryType publishScreenCategoryType) {
        C14360o3.A0B(publishScreenCategoryType, 1);
        this.A00 = publishScreenCategoryType;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof NJU) && this.A00 == ((NJU) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CategoryRowItem(category=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
