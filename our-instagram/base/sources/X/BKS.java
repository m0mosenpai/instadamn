package X;

/* loaded from: classes5.dex */
public final /* synthetic */ class BKS implements InterfaceC14180ni {
    public final /* synthetic */ C37595Ggq A00;

    public BKS(C37595Ggq c37595Ggq) {
        this.A00 = c37595Ggq;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(6, this.A00, C37595Ggq.class, "openRecipeSheet", "openRecipeSheet(Lcom/instagram/feed/media/Media;Lcom/instagram/clips/model/ClipsItem;Lcom/instagram/clips/viewer/ui/state/ClipsItemState;IZI)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BKS) || !(obj instanceof InterfaceC14180ni)) {
            return false;
        }
        return AbstractC167007dF.A1Y(obj, getFunctionDelegate());
    }
}
