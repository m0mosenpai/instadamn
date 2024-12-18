package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.HashMap;

/* renamed from: X.76K, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C76K extends C0T6 implements InterfaceC129555tK {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final MessageIdentifier A04;
    public final CharSequence A05;
    public final String A06;
    public final String A07;
    public final HashMap A08;

    public C76K(MessageIdentifier messageIdentifier, CharSequence charSequence, String str, String str2, HashMap hashMap, int i, int i2, int i3, int i4) {
        C14360o3.A0B(charSequence, 1);
        this.A05 = charSequence;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = i4;
        this.A04 = messageIdentifier;
        this.A06 = str;
        this.A07 = str2;
        this.A08 = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76K) {
                C76K c76k = (C76K) obj;
                if (!C14360o3.A0K(this.A05, c76k.A05) || this.A01 != c76k.A01 || this.A02 != c76k.A02 || this.A03 != c76k.A03 || this.A00 != c76k.A00 || !C14360o3.A0K(this.A04, c76k.A04) || !C14360o3.A0K(this.A06, c76k.A06) || !C14360o3.A0K(this.A07, c76k.A07) || !C14360o3.A0K(this.A08, c76k.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.A05.hashCode() * 31) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31) + this.A00) * 31;
        MessageIdentifier messageIdentifier = this.A04;
        int hashCode2 = (hashCode + (messageIdentifier == null ? 0 : messageIdentifier.hashCode())) * 31;
        String str = this.A06;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A07;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        HashMap hashMap = this.A08;
        return hashCode4 + (hashMap != null ? hashMap.hashCode() : 0);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
