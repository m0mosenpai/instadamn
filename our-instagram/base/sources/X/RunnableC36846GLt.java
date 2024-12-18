package X;

/* renamed from: X.GLt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36846GLt implements Runnable {
    public final /* synthetic */ C69453Af A00;

    public RunnableC36846GLt(C69453Af c69453Af) {
        this.A00 = c69453Af;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        C69453Af c69453Af = this.A00;
        InterfaceC72953Ov A00 = C69453Af.A00(c69453Af);
        if (A00 != 0) {
            C69473Ah c69473Ah = c69453Af.A0P;
            AbstractC34289FAj.A00(c69453Af.A0F, c69473Ah.A01(A00.BlW()), A00, 0L);
            C3OO c3oo = (C3OO) A00;
            boolean A04 = ((C69523Am) c69453Af.A0Q).A04();
            C14360o3.A0B(c3oo, 0);
            c69473Ah.A0C.bindViewHolder(c3oo, A04 ? 1 : 0);
        }
    }
}
