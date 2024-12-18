package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.5Ko, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C115545Ko extends C0T6 {
    public float A00;
    public int A01;
    public List A02;
    public List A03;
    public java.util.Set A04;
    public boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115545Ko) {
                C115545Ko c115545Ko = (C115545Ko) obj;
                if (Float.compare(this.A00, c115545Ko.A00) != 0 || this.A01 != c115545Ko.A01 || this.A05 != c115545Ko.A05 || !C14360o3.A0K(this.A04, c115545Ko.A04) || !C14360o3.A0K(this.A02, c115545Ko.A02) || !C14360o3.A0K(this.A03, c115545Ko.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RecordingSettings(speed=");
        sb.append(this.A00);
        sb.append(", timerDurationInMs=");
        sb.append(this.A01);
        sb.append(", isGhostModeOn=");
        sb.append(this.A05);
        sb.append(", cameraTool=");
        sb.append(this.A04);
        sb.append(", cameraAREffectList=");
        sb.append(this.A02);
        sb.append(", cameraToolsStruct=");
        sb.append(this.A03);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        List list;
        Float valueOf = Float.valueOf(this.A00);
        Integer valueOf2 = Integer.valueOf(this.A01);
        Boolean valueOf3 = Boolean.valueOf(this.A05);
        java.util.Set set = this.A04;
        List list2 = this.A02;
        if (list2 != null) {
            list = AbstractC001800i.A0X(AbstractC001800i.A0a(list2));
        } else {
            list = null;
        }
        return Arrays.hashCode(new Object[]{valueOf, valueOf2, valueOf3, set, list, this.A03});
    }

    public C115545Ko(List list, List list2, java.util.Set set, float f, int i, boolean z) {
        this.A00 = f;
        this.A01 = i;
        this.A05 = z;
        this.A04 = set;
        this.A02 = list;
        this.A03 = list2;
    }

    public C115545Ko() {
        this(null, null, null, 1.0f, -1, false);
    }
}
