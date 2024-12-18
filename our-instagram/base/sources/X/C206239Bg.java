package X;

import com.instagram.api.schemas.OriginalAudioSubtype;
import java.util.List;

/* renamed from: X.9Bg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206239Bg extends C0T6 {
    public Object A00;
    public boolean A01;
    public final int A02;
    public final Object A03;
    public final Object A04;

    public C206239Bg(OriginalAudioSubtype originalAudioSubtype, List list, List list2, boolean z) {
        this.A02 = 1;
        C14360o3.A0B(originalAudioSubtype, 1);
        this.A03 = originalAudioSubtype;
        this.A00 = list;
        this.A04 = list2;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (this.A02 != 0) {
            if (this != obj) {
                if (obj instanceof C206239Bg) {
                    C206239Bg c206239Bg = (C206239Bg) obj;
                    if (c206239Bg.A02 != 1 || this.A03 != c206239Bg.A03 || !C14360o3.A0K(this.A00, c206239Bg.A00) || !C14360o3.A0K(this.A04, c206239Bg.A04) || this.A01 != c206239Bg.A01) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!(obj instanceof C206239Bg)) {
                return false;
            }
            C206239Bg c206239Bg2 = (C206239Bg) obj;
            if (c206239Bg2.A02 != 0 || !C14360o3.A0K(this.A03, c206239Bg2.A03) || !C14360o3.A0K(this.A04, c206239Bg2.A04) || this.A01 != c206239Bg2.A01 || this.A00 != c206239Bg2.A00) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode;
        int i2;
        int i3 = this.A02;
        int hashCode2 = this.A03.hashCode();
        if (i3 != 0) {
            i = ((((hashCode2 * 31) + this.A00.hashCode()) * 31) + this.A04.hashCode()) * 31;
            i2 = 1237;
            if (this.A01) {
                i2 = 1231;
            }
        } else {
            int i4 = hashCode2 * 31;
            Object obj = this.A04;
            i = 0;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            int i5 = (i4 + hashCode) * 31;
            int i6 = 1237;
            if (this.A01) {
                i6 = 1231;
            }
            i2 = (i5 + i6) * 31;
            Integer num = (Integer) this.A00;
            if (num != null) {
                i = AbstractC37798GkD.A01(num).hashCode() + num.intValue();
            }
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        if (this.A02 != 0) {
            sb = new StringBuilder();
            sb.append("OriginalAudioSubTypeAttributionModel(audioSubType=");
            sb.append(this.A03);
            sb.append(", originalAudioParts=");
            sb.append(this.A00);
            sb.append(", originalAudioPartsByFilter=");
            sb.append(this.A04);
            sb.append(", isAudioAutomaticallyAttributed=");
            sb.append(this.A01);
        } else {
            sb = new StringBuilder();
            sb.append("ClipsSponsoredContent(clipsItem=");
            sb.append(this.A03);
            sb.append(AbstractC111324zv.A00(1416));
            sb.append(this.A04);
            sb.append(", isSyncFlowDelivered=");
            sb.append(this.A01);
            sb.append(", deliveredContext=");
            Integer num = (Integer) this.A00;
            if (num != null) {
                str = AbstractC37798GkD.A01(num);
            } else {
                str = "null";
            }
            sb.append(str);
        }
        sb.append(')');
        return sb.toString();
    }

    public C206239Bg(C120985dq c120985dq, C671831j c671831j) {
        this.A02 = 0;
        this.A02 = 0;
        this.A03 = c120985dq;
        this.A04 = c671831j;
        this.A01 = false;
        this.A00 = null;
    }
}
