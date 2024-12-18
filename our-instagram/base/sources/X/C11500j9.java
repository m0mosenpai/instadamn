package X;

import java.io.Serializable;

/* renamed from: X.0j9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11500j9 implements Serializable {
    public final Integer A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11500j9)) {
            return false;
        }
        C11500j9 c11500j9 = (C11500j9) obj;
        return this.A00.equals(c11500j9.A00) && this.A01.equals(c11500j9.A01);
    }

    public final int hashCode() {
        String str;
        switch (this.A00.intValue()) {
            case 1:
                str = "EXPLORE";
                break;
            case 2:
                str = "DISCOVERY";
                break;
            case 3:
                str = "SHOPPING";
                break;
            case 4:
                str = "CAMERA";
                break;
            case 5:
                str = "FEED";
                break;
            case 6:
                str = "COMMON";
                break;
            default:
                str = "STORIES";
                break;
        }
        return AnonymousClass001.A0g(str, " - ", this.A01).hashCode();
    }

    public C11500j9(Integer num, String str) {
        this.A00 = num;
        this.A01 = str;
    }
}
