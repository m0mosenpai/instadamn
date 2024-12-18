package X;

/* renamed from: X.LZy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC48325LZy implements InterfaceC66482zP, InterfaceC162797Qq, InterfaceC129555tK {
    public final C162777Qo A00;
    public final C7SZ A01;
    public final String A02;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public AbstractC48325LZy(C162777Qo c162777Qo, C7SZ c7sz, String str) {
        AbstractC167017dG.A1R(c7sz, c162777Qo);
        this.A02 = str;
        this.A01 = c7sz;
        this.A00 = c162777Qo;
    }

    @Override // X.InterfaceC66492zQ
    public final boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
