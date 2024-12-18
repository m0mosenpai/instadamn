package X;

import android.text.SpannableString;

/* renamed from: X.7Lh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161467Lh extends C4F4 implements C7VC {
    public final int A00;
    public final int A01;
    public final long A02;
    public final SpannableString A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final int A07 = 159;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C161467Lh) {
                C161467Lh c161467Lh = (C161467Lh) obj;
                if (!C14360o3.A0K(this.A03, c161467Lh.A03) || !C14360o3.A0K(this.A04, c161467Lh.A04) || this.A00 != c161467Lh.A00 || !C14360o3.A0K(this.A05, c161467Lh.A05) || this.A01 != c161467Lh.A01 || this.A06 != c161467Lh.A06 || this.A02 != c161467Lh.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NullStateActionLogMessageViewModel(description=");
        sb.append((Object) this.A03);
        sb.append(", actionUri=");
        sb.append(this.A04);
        sb.append(", actionLogTextColor=");
        sb.append(this.A00);
        sb.append(", ctaText=");
        sb.append(this.A05);
        sb.append(", ctaTextColor=");
        sb.append(this.A01);
        sb.append(", backgroundEnabled=");
        sb.append(this.A06);
        sb.append(", timestampMicro=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    @Override // X.C7VC
    public final long C8f() {
        return this.A02;
    }

    @Override // X.C7VC
    public final int getType() {
        return this.A07;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.A03.hashCode() * 31;
        String str = this.A04;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((((((hashCode2 + hashCode) * 31) + this.A00) * 31) + this.A05.hashCode()) * 31) + this.A01) * 31;
        int i = 1237;
        if (this.A06) {
            i = 1231;
        }
        int i2 = (hashCode3 + i) * 31;
        long j = this.A02;
        return i2 + ((int) (j ^ (j >>> 32)));
    }

    public C161467Lh(SpannableString spannableString, String str, String str2, int i, int i2, long j, boolean z) {
        this.A03 = spannableString;
        this.A04 = str;
        this.A00 = i;
        this.A05 = str2;
        this.A01 = i2;
        this.A06 = z;
        this.A02 = j;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
