package X;

import com.instagram.model.direct.gifs.DirectAnimatedMediaUser;

/* renamed from: X.54b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1120954b extends C0T6 implements InterfaceC1121054c {
    public final C9BH A00;
    public final DirectAnimatedMediaUser A01;
    public final Boolean A02;
    public final Boolean A03;
    public final String A04;
    public final boolean A05;

    public C1120954b(C9BH c9bh, DirectAnimatedMediaUser directAnimatedMediaUser, Boolean bool, Boolean bool2, String str, boolean z) {
        C14360o3.A0B(str, 1);
        this.A04 = str;
        this.A03 = bool;
        this.A05 = z;
        this.A00 = c9bh;
        this.A01 = directAnimatedMediaUser;
        this.A02 = bool2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1120954b) {
                C1120954b c1120954b = (C1120954b) obj;
                if (!C14360o3.A0K(this.A04, c1120954b.A04) || !C14360o3.A0K(this.A03, c1120954b.A03) || this.A05 != c1120954b.A05 || !C14360o3.A0K(this.A00, c1120954b.A00) || !C14360o3.A0K(this.A01, c1120954b.A01) || !C14360o3.A0K(this.A02, c1120954b.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1121054c
    public final DirectAnimatedMediaUser CDi() {
        return this.A01;
    }

    @Override // X.InterfaceC1121054c
    public final Boolean CPm() {
        return this.A02;
    }

    @Override // X.InterfaceC1121054c
    public final boolean Cdi() {
        return this.A05;
    }

    @Override // X.InterfaceC1121054c
    public final String getId() {
        return this.A04;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.A04.hashCode() * 31;
        Boolean bool = this.A03;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        int i3 = 1237;
        if (this.A05) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        C9BH c9bh = this.A00;
        if (c9bh == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c9bh.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        DirectAnimatedMediaUser directAnimatedMediaUser = this.A01;
        if (directAnimatedMediaUser == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = directAnimatedMediaUser.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        Boolean bool2 = this.A02;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return i6 + i;
    }
}
