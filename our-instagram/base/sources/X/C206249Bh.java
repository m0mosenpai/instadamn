package X;

import com.instagram.user.model.User;

/* renamed from: X.9Bh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206249Bh extends C0T6 {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;
    public final boolean A05;

    public C206249Bh(C76593c4 c76593c4, C76353bf c76353bf, User user, boolean z, boolean z2) {
        this.A04 = z;
        this.A03 = user;
        this.A05 = z2;
        this.A01 = c76593c4;
        this.A02 = c76353bf;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C206249Bh) {
                    C206249Bh c206249Bh = (C206249Bh) obj;
                    if (c206249Bh.A00 == 1 && this.A04 == c206249Bh.A04 && C14360o3.A0K(this.A03, c206249Bh.A03) && this.A05 == c206249Bh.A05 && C14360o3.A0K(this.A01, c206249Bh.A01)) {
                        obj2 = this.A02;
                        obj3 = c206249Bh.A02;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else if (this != obj) {
            if (!(obj instanceof C206249Bh)) {
                return false;
            }
            C206249Bh c206249Bh2 = (C206249Bh) obj;
            if (c206249Bh2.A00 != 0 || !C14360o3.A0K(this.A02, c206249Bh2.A02) || this.A05 != c206249Bh2.A05 || this.A04 != c206249Bh2.A04 || !C14360o3.A0K(this.A03, c206249Bh2.A03)) {
                return false;
            }
            obj2 = this.A01;
            obj3 = c206249Bh2.A01;
        } else {
            return true;
        }
        if (!C14360o3.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        Object obj;
        int hashCode2;
        if (this.A00 != 0) {
            int i = 1237;
            if (this.A04) {
                i = 1231;
            }
            int hashCode3 = ((i * 31) + this.A03.hashCode()) * 31;
            int i2 = 1237;
            if (this.A05) {
                i2 = 1231;
            }
            int i3 = (hashCode3 + i2) * 31;
            Object obj2 = this.A01;
            if (obj2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = obj2.hashCode();
            }
            hashCode = (i3 + hashCode2) * 31;
            obj = this.A02;
        } else {
            int hashCode4 = this.A02.hashCode() * 31;
            int i4 = 1237;
            if (this.A05) {
                i4 = 1231;
            }
            int i5 = (hashCode4 + i4) * 31;
            int i6 = 1237;
            if (this.A04) {
                i6 = 1231;
            }
            hashCode = (((i5 + i6) * 31) + this.A03.hashCode()) * 31;
            obj = this.A01;
        }
        return hashCode + obj.hashCode();
    }

    public C206249Bh(C206209Bd c206209Bd, C75113Zb c75113Zb, CharSequence charSequence, boolean z, boolean z2) {
        C14360o3.A0B(charSequence, 4);
        this.A02 = c75113Zb;
        this.A05 = z;
        this.A04 = z2;
        this.A03 = charSequence;
        this.A01 = c206209Bd;
    }
}
