package X;

import java.util.List;

/* renamed from: X.5ko, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124835ko extends C0T6 {
    public final EnumC124825kn A00;
    public final EnumC124815km A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final boolean A07;
    public final boolean A08;

    public C124835ko(EnumC124825kn enumC124825kn, EnumC124815km enumC124815km, String str, String str2, String str3, String str4, List list, boolean z, boolean z2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 3);
        C14360o3.A0B(str4, 7);
        this.A02 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A07 = z;
        this.A01 = enumC124815km;
        this.A00 = enumC124825kn;
        this.A05 = str4;
        this.A06 = list;
        this.A08 = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C124835ko) {
                C124835ko c124835ko = (C124835ko) obj;
                if (!C14360o3.A0K(this.A02, c124835ko.A02) || !C14360o3.A0K(this.A04, c124835ko.A04) || !C14360o3.A0K(this.A03, c124835ko.A03) || this.A07 != c124835ko.A07 || this.A01 != c124835ko.A01 || this.A00 != c124835ko.A00 || !C14360o3.A0K(this.A05, c124835ko.A05) || !C14360o3.A0K(this.A06, c124835ko.A06) || this.A08 != c124835ko.A08) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContentFilterDictionaryMetadataModel(dictionaryKey=");
        sb.append(this.A02);
        sb.append(", name=");
        sb.append(this.A04);
        sb.append(", language=");
        sb.append(this.A03);
        sb.append(", isEditable=");
        sb.append(this.A07);
        sb.append(", type=");
        sb.append(this.A01);
        sb.append(", strategyId=");
        sb.append(this.A00);
        sb.append(", version=");
        sb.append(this.A05);
        sb.append(", clientIds=");
        sb.append(this.A06);
        sb.append(", supportsVersioning=");
        sb.append(this.A08);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = ((((this.A02.hashCode() * 31) + this.A04.hashCode()) * 31) + this.A03.hashCode()) * 31;
        int i = 1237;
        if (this.A07) {
            i = 1231;
        }
        int hashCode2 = (((((((((hashCode + i) * 31) + this.A01.hashCode()) * 31) + this.A00.hashCode()) * 31) + this.A05.hashCode()) * 31) + this.A06.hashCode()) * 31;
        int i2 = 1237;
        if (this.A08) {
            i2 = 1231;
        }
        return hashCode2 + i2;
    }
}
