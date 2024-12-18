package X;

import com.instagram.api.schemas.LinkStickerType;

/* loaded from: classes11.dex */
public final class UR2 extends C0T6 implements XFK {
    public final LinkStickerType A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UR2) {
                UR2 ur2 = (UR2) obj;
                if (this.A00 != ur2.A00 || !C14360o3.A0K(this.A01, ur2.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public UR2(LinkStickerType linkStickerType, String str) {
        AbstractC167017dG.A1P(linkStickerType, str);
        this.A00 = linkStickerType;
        this.A01 = str;
    }
}
