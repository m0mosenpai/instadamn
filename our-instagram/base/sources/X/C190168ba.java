package X;

import java.util.Map;

/* renamed from: X.8ba, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190168ba {
    public final String A00;
    public final Map A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C190168ba) {
                C190168ba c190168ba = (C190168ba) obj;
                if (!C14360o3.A0K(this.A00, c190168ba.A00) || !C14360o3.A0K(this.A01, c190168ba.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A00.hashCode() * 31) + 1000) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KaraokeBleeps(bleepAssetFilePath=");
        sb.append(this.A00);
        sb.append(", bleepAssetDurationInMs=");
        sb.append(1000);
        sb.append(", originalAudioBleeps=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public C190168ba(String str, Map map) {
        this.A00 = str;
        this.A01 = map;
    }
}
