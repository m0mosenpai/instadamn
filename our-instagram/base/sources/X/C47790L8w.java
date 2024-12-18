package X;

import java.util.Arrays;

/* renamed from: X.L8w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47790L8w {
    public final EnumC46175KcD A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public C47790L8w(EnumC46175KcD enumC46175KcD, String str, String str2, boolean z) {
        C14360o3.A0B(enumC46175KcD, 3);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = enumC46175KcD;
        this.A03 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C14360o3.A0K(getClass(), AbstractC43593JPy.A0o(obj))) {
            return false;
        }
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.messagethread.contentgating.MediaShareContentGatingViewModel");
        C47790L8w c47790L8w = (C47790L8w) obj;
        return C14360o3.A0K(this.A02, c47790L8w.A02) && C14360o3.A0K(this.A01, c47790L8w.A01) && this.A00 == c47790L8w.A00;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A01, this.A00});
    }
}
