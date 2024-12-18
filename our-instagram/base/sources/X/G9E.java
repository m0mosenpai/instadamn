package X;

/* loaded from: classes6.dex */
public final class G9E implements InterfaceC190658cN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C31864DzW A01;
    public final /* synthetic */ C15370ps A02;

    public G9E(C31864DzW c31864DzW, C15370ps c15370ps, int i) {
        this.A02 = c15370ps;
        this.A01 = c31864DzW;
        this.A00 = i;
    }

    @Override // X.InterfaceC190658cN
    public final boolean onToggle(boolean z) {
        Object obj = this.A02.A00;
        ((C51758Mth) obj).A01 = z;
        C31864DzW c31864DzW = this.A01;
        FHY fhy = c31864DzW.A00;
        C14360o3.A06(obj);
        int i = this.A00;
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(fhy.A00.A01);
        AbstractC166987dD.A1Z(new C50530MSj(A0Z, obj, null, i, 23), AbstractC141776au.A00(A0Z));
        c31864DzW.notifyItemChanged(i);
        return true;
    }
}
