package X;

/* renamed from: X.Ioq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC42328Ioq implements InterfaceC66482zP {
    public final C41586IaZ A00;
    public final Integer A01;
    public final String A02;
    public final boolean A03;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public AbstractC42328Ioq(C41586IaZ c41586IaZ, Integer num, String str, boolean z) {
        this.A01 = num;
        this.A02 = str;
        this.A00 = c41586IaZ;
        this.A03 = z;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return false;
    }
}
