package X;

import com.instagram.model.hashtag.HashtagImpl;

/* renamed from: X.V9z, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68090V9z extends AbstractC65924TwV {
    public HashtagImpl A00;
    public boolean A01;

    public C68090V9z() {
        super(1);
        this.A00 = new HashtagImpl(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    @Override // X.AbstractC65924TwV
    public final boolean equals(Object obj) {
        if (obj instanceof C68090V9z) {
            return C14360o3.A0K(this.A00, ((C68090V9z) obj).A00);
        }
        return false;
    }

    @Override // X.AbstractC65924TwV
    public final int hashCode() {
        return this.A00.hashCode();
    }
}
