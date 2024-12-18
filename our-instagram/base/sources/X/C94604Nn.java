package X;

/* renamed from: X.4Nn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C94604Nn extends C1KR implements InterfaceC73073Pi {
    @Override // X.C1KP
    public final String A00() {
        return "image failed to load";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Image View ");
        sb.append(((C1KR) this).A01.hashCode());
        sb.append(" failed to load on ");
        sb.append(((C1KP) this).A01);
        sb.append(" at ");
        sb.append(((C1KP) this).A00);
        return sb.toString();
    }
}
