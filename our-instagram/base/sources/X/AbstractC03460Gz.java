package X;

/* renamed from: X.0Gz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC03460Gz implements InterfaceC03680Ii {
    public C03740Ip A00 = null;
    public boolean A01;
    public boolean A02;
    public final boolean A03;

    public abstract void A02(int i, int i2, Object obj, Object obj2);

    @Override // X.InterfaceC03680Ii
    public final void DVm(int i, int i2, Object obj, Object obj2) {
        try {
            this.A01 = false;
            this.A02 = this.A03;
            A02(i, i2, obj, obj2);
        } catch (ClassCastException e) {
            throw new RuntimeException("Failed to init ObjPoolItem cls because of likely improver type", e);
        }
    }

    public final void A01(boolean z) {
        if (!this.A01) {
            if (z && !this.A02) {
                return;
            }
            this.A01 = true;
            this.A02 = this.A03;
            C03740Ip c03740Ip = this.A00;
            if (c03740Ip == null) {
                return;
            }
            c03740Ip.A04(this);
            return;
        }
        throw new IllegalStateException(String.format("We have already called clean for this item %s.", this));
    }

    public final void finalize() {
        String str;
        String str2;
        try {
            if (!this.A01) {
                if (this.A02) {
                    str = "Y";
                } else {
                    str = "N";
                }
                boolean z = this.A03;
                if (z) {
                    str2 = "Y";
                } else {
                    str2 = "N";
                }
                String.format("Forgot to call clean for this obj pool item. Cur Temp: %s Def Temp: %s", str, str2);
                this.A01 = true;
                this.A02 = z;
                C03740Ip c03740Ip = this.A00;
                if (c03740Ip != null) {
                    c03740Ip.A04(this);
                }
            }
        } finally {
        }
    }

    public AbstractC03460Gz(boolean z) {
        this.A03 = z;
        this.A02 = z;
    }
}
