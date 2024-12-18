package X;

/* renamed from: X.WkC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70909WkC implements C3A6 {
    public final C66425UGy A00;

    @Override // X.C3A6
    public final Class CAN(Object obj) {
        C14360o3.A0B(obj, 0);
        if (obj instanceof XLM) {
            return XLM.class;
        }
        return obj.getClass();
    }

    @Override // X.C3A6
    public final Object CAM(int i) {
        return this.A00.A02.A00.get(i);
    }

    public C70909WkC(C66425UGy c66425UGy) {
        this.A00 = c66425UGy;
    }
}
