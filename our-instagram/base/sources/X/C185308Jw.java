package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.8Jw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185308Jw extends C0T6 implements InterfaceC185318Jx {
    public final int A00;
    public final EnumC185288Jt A01;
    public final Integer A02;
    public final String A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C185308Jw) {
                C185308Jw c185308Jw = (C185308Jw) obj;
                if (this.A01 != c185308Jw.A01 || this.A02 != c185308Jw.A02 || !C14360o3.A0K(this.A03, c185308Jw.A03) || this.A04 != c185308Jw.A04 || this.A00 != c185308Jw.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC185318Jx
    public final boolean Cce() {
        return this.A04;
    }

    @Override // X.InterfaceC185318Jx
    public final String getName() {
        return this.A03;
    }

    public final int hashCode() {
        int hashCode;
        String str;
        EnumC185288Jt enumC185288Jt = this.A01;
        int i = 0;
        if (enumC185288Jt == null) {
            hashCode = 0;
        } else {
            hashCode = enumC185288Jt.hashCode();
        }
        int i2 = hashCode * 31;
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 1:
                str = "PROCESSING";
                break;
            case 2:
                str = "DONE";
                break;
            default:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
        }
        int hashCode2 = (i2 + str.hashCode() + intValue) * 31;
        String str2 = this.A03;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i3 = (hashCode2 + i) * 31;
        int i4 = 1237;
        if (this.A04) {
            i4 = 1231;
        }
        return ((i3 + i4) * 31) + this.A00;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("AudioFilterListItemModel(audioFilter=");
        sb.append(this.A01);
        sb.append(", filteringStatus=");
        Integer num = this.A02;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "PROCESSING";
                    break;
                case 2:
                    str = "DONE";
                    break;
                default:
                    str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                    break;
            }
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", name=");
        sb.append(this.A03);
        sb.append(MSV.A00(22));
        sb.append(this.A04);
        sb.append(", itemType=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C185308Jw(EnumC185288Jt enumC185288Jt, Integer num, String str, int i, boolean z) {
        this.A01 = enumC185288Jt;
        this.A02 = num;
        this.A03 = str;
        this.A04 = z;
        this.A00 = i;
    }
}
