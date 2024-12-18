package X;

/* renamed from: X.4ey, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100364ey extends AbstractC88103wI {
    public final int A00;
    public final String A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C100364ey(String str, int i, String str2) {
        super(AnonymousClass001.A0b(str, " failed with ", i));
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 3);
        this.A02 = str;
        this.A00 = i;
        this.A01 = str2;
    }

    @Override // X.AbstractC88103wI
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A02);
        sb.append(" failed with ");
        sb.append(this.A00);
        sb.append(' ');
        sb.append(this.A01);
        return sb.toString();
    }
}
