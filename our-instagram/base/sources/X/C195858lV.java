package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.8lV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195858lV implements C8IT {
    public final int A00;
    public final ImageUrl A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final String A05;

    @Override // X.C8IT
    public final String B8m() {
        return this.A05;
    }

    @Override // X.C8IT
    public final String BK3() {
        return this.A02;
    }

    @Override // X.C8IT
    public final int BpZ() {
        return 0;
    }

    @Override // X.C8IT
    public final boolean CPp() {
        return this.A03;
    }

    @Override // X.C8IT
    public final boolean Cff() {
        return this.A04;
    }

    public final boolean equals(Object obj) {
        if (obj != null && C14360o3.A0K(getClass(), obj.getClass())) {
            if (this == obj) {
                return true;
            }
            return C14360o3.A0K(this.A02, ((C195858lV) obj).A02);
        }
        return false;
    }

    @Override // X.C8IT
    public final int getDuration() {
        return this.A00;
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    @Override // X.C8IT
    public final boolean isValid() {
        if (this.A01 == null) {
            return false;
        }
        return true;
    }

    public C195858lV(ImageUrl imageUrl, String str, int i, boolean z, boolean z2) {
        this.A02 = str;
        this.A01 = imageUrl;
        this.A04 = z;
        this.A00 = i;
        this.A03 = z2;
        this.A05 = AbstractC189358aC.A01(i);
    }
}
