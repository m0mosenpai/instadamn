package X;

import com.instagram.api.schemas.CameraTool;

/* renamed from: X.5JB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5JB extends C0T6 {
    public int A00;
    public CameraTool A01;
    public Float A02;
    public Float A03;
    public Float A04;

    public C5JB(CameraTool cameraTool, Float f, Float f2, Float f3, int i) {
        C14360o3.A0B(cameraTool, 2);
        this.A00 = i;
        this.A01 = cameraTool;
        this.A02 = f;
        this.A03 = f2;
        this.A04 = f3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5JB) {
                C5JB c5jb = (C5JB) obj;
                if (this.A00 != c5jb.A00 || this.A01 != c5jb.A01 || !C14360o3.A0K(this.A02, c5jb.A02) || !C14360o3.A0K(this.A03, c5jb.A03) || !C14360o3.A0K(this.A04, c5jb.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A00 * 31) + this.A01.hashCode()) * 31;
        Float f = this.A02;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.A03;
        int hashCode3 = (hashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.A04;
        return hashCode3 + (f3 != null ? f3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CameraToolInfoWithSegmentIndex(segmentIndex=");
        sb.append(this.A00);
        sb.append(", cameraTool=");
        sb.append(this.A01);
        sb.append(", durationSelectorSeconds=");
        sb.append(this.A02);
        sb.append(", speedSelector=");
        sb.append(this.A03);
        sb.append(", timerSelectorSeconds=");
        sb.append(this.A04);
        sb.append(')');
        return sb.toString();
    }
}
