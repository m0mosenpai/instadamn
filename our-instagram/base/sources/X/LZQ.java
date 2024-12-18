package X;

/* loaded from: classes8.dex */
public final class LZQ implements InterfaceC66482zP {
    public final EnumC46209Kcl A00;
    public final AbstractC46382Kg4 A01;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01.toString();
    }

    public LZQ(EnumC46209Kcl enumC46209Kcl, AbstractC46382Kg4 abstractC46382Kg4) {
        this.A01 = abstractC46382Kg4;
        this.A00 = enumC46209Kcl;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
