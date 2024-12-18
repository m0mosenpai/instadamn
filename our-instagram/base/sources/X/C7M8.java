package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.messaginguser.MessagingUser;

/* renamed from: X.7M8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7M8 extends C0T6 implements InterfaceC66482zP, C7VC {
    public final int A00;
    public final int A01;
    public final ImageUrl A02;
    public final MessagingUser A03;
    public final Integer A04;
    public final String A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7M8) {
                C7M8 c7m8 = (C7M8) obj;
                if (!C14360o3.A0K(this.A05, c7m8.A05) || this.A00 != c7m8.A00 || this.A06 != c7m8.A06 || !C14360o3.A0K(this.A03, c7m8.A03) || !C14360o3.A0K(this.A02, c7m8.A02) || this.A01 != c7m8.A01 || !C14360o3.A0K(this.A04, c7m8.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C7VC
    public final long C8f() {
        return 0L;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "TypingIndicatorViewModel";
    }

    @Override // X.C7VC
    public final int getType() {
        return 2;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.A05;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = ((hashCode * 31) + this.A00) * 31;
        int i3 = 1237;
        if (this.A06) {
            i3 = 1231;
        }
        int hashCode3 = (((i2 + i3) * 31) + this.A03.hashCode()) * 31;
        ImageUrl imageUrl = this.A02;
        if (imageUrl == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = imageUrl.hashCode();
        }
        int i4 = (((hashCode3 + hashCode2) * 31) + this.A01) * 31;
        Integer num = this.A04;
        if (num != null) {
            i = num.hashCode();
        }
        return i4 + i;
    }

    public C7M8(ImageUrl imageUrl, MessagingUser messagingUser, Integer num, String str, int i, int i2, boolean z) {
        this.A05 = str;
        this.A00 = i;
        this.A06 = z;
        this.A03 = messagingUser;
        this.A02 = imageUrl;
        this.A01 = i2;
        this.A04 = num;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
