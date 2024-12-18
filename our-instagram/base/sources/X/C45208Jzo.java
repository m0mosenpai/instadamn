package X;

import com.instagram.direct.emojipong.data.EmojiPongUser;

/* renamed from: X.Jzo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45208Jzo extends C0T6 implements InterfaceC66482zP {
    public final int A00;
    public final int A01;
    public final EmojiPongUser A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45208Jzo) {
                C45208Jzo c45208Jzo = (C45208Jzo) obj;
                if (!C14360o3.A0K(this.A02, c45208Jzo.A02) || this.A00 != c45208Jzo.A00 || this.A01 != c45208Jzo.A01 || this.A03 != c45208Jzo.A03) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02.A03;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A03, (((AbstractC166987dD.A0G(this.A02) + this.A00) * 31) + this.A01) * 31);
    }

    public C45208Jzo(EmojiPongUser emojiPongUser, int i, int i2, boolean z) {
        this.A02 = emojiPongUser;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = z;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }
}
