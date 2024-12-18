package X;

import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.7Rx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163127Rx extends C4F4 {
    public final C7IH A00;
    public final MessageIdentifier A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C163127Rx) {
                C163127Rx c163127Rx = (C163127Rx) obj;
                if (!C14360o3.A0K(this.A01, c163127Rx.A01) || !C14360o3.A0K(this.A03, c163127Rx.A03) || !C14360o3.A0K(this.A02, c163127Rx.A02) || !C14360o3.A0K(this.A00, c163127Rx.A00) || this.A04 != c163127Rx.A04) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C14360o3.A0B(obj, 0);
        return equals(obj);
    }

    public final int hashCode() {
        int hashCode;
        MessageIdentifier messageIdentifier = this.A01;
        int i = 0;
        if (messageIdentifier == null) {
            hashCode = 0;
        } else {
            hashCode = messageIdentifier.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.A03;
        if (str != null) {
            i = str.hashCode();
        }
        int hashCode2 = (((((i2 + i) * 31) + this.A02.hashCode()) * 31) + this.A00.hashCode()) * 31;
        int i3 = 1237;
        if (this.A04) {
            i3 = 1231;
        }
        return hashCode2 + i3;
    }

    public C163127Rx(C7IH c7ih, MessageIdentifier messageIdentifier, String str, String str2, boolean z) {
        this.A01 = messageIdentifier;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = c7ih;
        this.A04 = z;
    }
}
