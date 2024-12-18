package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.7SY, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7SY extends AbstractC129515tG implements InterfaceC129555tK {
    public final ImageUrl A00;
    public final DirectMessageIdentifier A01;
    public final String A02;
    public final boolean A03;
    public final C7QX A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7SY(ImageUrl imageUrl, C7QX c7qx, DirectMessageIdentifier directMessageIdentifier, String str, boolean z) {
        super(c7qx);
        C14360o3.A0B(imageUrl, 1);
        this.A00 = imageUrl;
        this.A01 = directMessageIdentifier;
        this.A02 = str;
        this.A04 = c7qx;
        this.A03 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7SY) {
                C7SY c7sy = (C7SY) obj;
                if (!C14360o3.A0K(this.A00, c7sy.A00) || !C14360o3.A0K(this.A01, c7sy.A01) || !C14360o3.A0K(this.A02, c7sy.A02) || !C14360o3.A0K(this.A04, c7sy.A04) || this.A03 != c7sy.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StaticStickerContentViewModel(stickerUrl=");
        sb.append(this.A00);
        sb.append(", messageIdentifier=");
        sb.append(this.A01);
        sb.append(", messageSenderUsername=");
        sb.append(this.A02);
        sb.append(AbstractC43591JPw.A00(511));
        sb.append(this.A04);
        sb.append(", isReplyContext=");
        sb.append(this.A03);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.A00.hashCode() * 31) + this.A01.hashCode()) * 31;
        String str = this.A02;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 + hashCode) * 31) + this.A04.hashCode()) * 31;
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        return hashCode3 + i;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
