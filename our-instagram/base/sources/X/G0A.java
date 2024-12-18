package X;

/* loaded from: classes6.dex */
public final class G0A implements C11R {
    public final /* synthetic */ C36689GFk A00;
    public final /* synthetic */ String A01;

    @Override // X.C11R
    public final int getRunnableId() {
        return 301436582;
    }

    @Override // X.C11R
    public final void onCancel() {
    }

    @Override // X.C11R
    public final void onStart() {
    }

    public G0A(C36689GFk c36689GFk, String str) {
        this.A00 = c36689GFk;
        this.A01 = str;
    }

    @Override // X.C11R
    public final void onFinish() {
        this.A00.A0F.Eby(this.A01);
    }

    @Override // X.C11R
    public final void run() {
        C36689GFk c36689GFk = this.A00;
        C35035Fc8 c35035Fc8 = c36689GFk.A0C;
        C1GJ.A02(AbstractC121115e3.A01(c35035Fc8.A0F, new EZ5(3, new EZ9(c36689GFk, 15), c35035Fc8)));
    }

    @Override // X.C11R
    public final String getName() {
        return "banyan null state";
    }
}
