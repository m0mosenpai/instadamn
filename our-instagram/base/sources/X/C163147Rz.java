package X;

import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.7Rz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163147Rz extends C4F4 {
    public final C7IH A00;
    public final MessageIdentifier A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C163147Rz) {
                C163147Rz c163147Rz = (C163147Rz) obj;
                if (!C14360o3.A0K(this.A01, c163147Rz.A01) || !C14360o3.A0K(this.A03, c163147Rz.A03) || !C14360o3.A0K(this.A02, c163147Rz.A02) || !C14360o3.A0K(this.A00, c163147Rz.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        MessageIdentifier messageIdentifier = this.A01;
        return ((((((messageIdentifier == null ? 0 : messageIdentifier.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A00.hashCode();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C14360o3.A0B(obj, 0);
        return equals(obj);
    }

    public C163147Rz(C7IH c7ih, MessageIdentifier messageIdentifier, String str, String str2) {
        this.A01 = messageIdentifier;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = c7ih;
    }
}
