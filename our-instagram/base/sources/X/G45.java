package X;

/* loaded from: classes6.dex */
public final class G45 implements C7Q8 {
    public final /* synthetic */ C34543FKd A00;

    public G45(C34543FKd c34543FKd) {
        this.A00 = c34543FKd;
    }

    @Override // X.C7Q8
    public final /* bridge */ /* synthetic */ boolean DBb(Object obj, Object obj2) {
        C36211FyP c36211FyP = (C36211FyP) obj;
        C3OO c3oo = (C3OO) obj2;
        if (!c36211FyP.A0E && c36211FyP.A09) {
            c3oo.itemView.performHapticFeedback(3);
            this.A00.A02.A00(c36211FyP.A06, c36211FyP.A0D);
            return true;
        }
        return true;
    }
}
