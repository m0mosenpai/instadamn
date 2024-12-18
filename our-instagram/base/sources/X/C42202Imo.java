package X;

/* renamed from: X.Imo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42202Imo implements InterfaceC43435JGz {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C42202Imo(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC43435JGz
    public final void CqG() {
        J28 j28;
        C41101vI c41101vI;
        int i = this.A00;
        Object obj = this.A02;
        if (i != 0) {
            J25 j25 = (J25) obj;
            int i2 = this.A01;
            AbstractC24321Hb.A00(j25.A03).A00(false);
            C5TA c5ta = j25.A00;
            if (c5ta != null) {
                c5ta.A02(0.0f, i2);
            }
            c41101vI = j25.A02;
            j28 = j25;
        } else {
            J28 j282 = (J28) obj;
            int i3 = this.A01;
            AbstractC24321Hb.A00(j282.A04).A00(false);
            C5TA c5ta2 = j282.A01;
            if (c5ta2 != null) {
                c5ta2.A02(0.0f, i3);
            }
            c41101vI = j282.A03;
            j28 = j282;
        }
        c41101vI.A03(j28);
    }

    @Override // X.InterfaceC43435JGz
    public final void Eb6(float f) {
    }
}
