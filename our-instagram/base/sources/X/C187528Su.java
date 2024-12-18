package X;

/* renamed from: X.8Su, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187528Su extends AbstractC187488Sq implements InterfaceC187498Sr {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C187528Su) && this.A00 == ((C187528Su) obj).A00);
    }

    public final int hashCode() {
        return this.A00 * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Speed(segmentIndex=");
        sb.append(this.A00);
        sb.append(", recordingSpeed=");
        sb.append((Object) null);
        sb.append(')');
        return sb.toString();
    }

    public C187528Su(int i) {
        this.A00 = i;
    }
}
