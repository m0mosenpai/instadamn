package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.4hO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101534hO implements C17D, AnonymousClass173 {
    public ImageUrl A00;
    public String A01;

    @Override // X.AnonymousClass173
    public final ImageUrl Bhu() {
        ImageUrl imageUrl = this.A00;
        if (imageUrl != null) {
            return imageUrl;
        }
        C14360o3.A0F("profilePicUrl");
        throw C00O.createAndThrow();
    }

    @Override // X.C17D
    public final String getId() {
        String str = this.A01;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("_id");
        throw C00O.createAndThrow();
    }
}
