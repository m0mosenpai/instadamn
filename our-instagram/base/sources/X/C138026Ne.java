package X;

/* renamed from: X.6Ne, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138026Ne {
    public final InterfaceC16820sZ A00;
    public final InterfaceC24901Jp A01;

    public final String toString() {
        InterfaceC24901Jp interfaceC24901Jp = this.A01;
        interfaceC24901Jp.getContext().get(PWD.A00);
        StringBuilder sb = new StringBuilder();
        sb.append("Request@");
        String num = Integer.toString(hashCode(), 16);
        C14360o3.A07(num);
        sb.append(num);
        sb.append("(");
        sb.append("currentBounds()=");
        sb.append(this.A00.invoke());
        sb.append(", continuation=");
        sb.append(interfaceC24901Jp);
        sb.append(')');
        return sb.toString();
    }

    public C138026Ne(InterfaceC16820sZ interfaceC16820sZ, InterfaceC24901Jp interfaceC24901Jp) {
        this.A00 = interfaceC16820sZ;
        this.A01 = interfaceC24901Jp;
    }
}
