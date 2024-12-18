package X;

/* renamed from: X.Gor, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38063Gor {
    public final Long A00;
    public final Long A01;
    public final Long A02;
    public final String A03;

    public C38063Gor(InterfaceC43459JHx interfaceC43459JHx, String str) {
        this.A03 = str;
        long[] itemInformation = interfaceC43459JHx.getItemInformation(str);
        this.A02 = Long.valueOf(itemInformation[0]);
        this.A01 = Long.valueOf(itemInformation[1]);
        this.A00 = Long.valueOf(itemInformation[2]);
    }
}
