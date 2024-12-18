package X;

/* renamed from: X.09U, reason: invalid class name */
/* loaded from: classes.dex */
public class C09U implements C0LR {
    public final Integer A00;
    public final C0LR[] A01;

    @Override // X.C0LR
    public final Integer BW4() {
        return this.A00;
    }

    @Override // X.C0LR
    public final /* synthetic */ boolean CKv(Integer num) {
        return false;
    }

    @Override // X.C0LR
    public final void E4h(C024209q c024209q, C0M6 c0m6) {
        for (C0LR c0lr : this.A01) {
            try {
                c0lr.E4h(c024209q, c0m6);
            } catch (Throwable th) {
                C0PC.A00().DEh(C0LX.A00(this.A00), th, null);
                C10850hu c10850hu = C0LK.A6R;
                String str = (String) c024209q.A09.get(c10850hu);
                if (str == null) {
                    str = "";
                }
                c024209q.A03(c10850hu, AnonymousClass001.A13(str, "Error: ", C0LX.A00(c0lr.BW4()), ": ", th.getMessage(), "\n"));
            }
        }
    }

    public C09U(Integer num, C0LR... c0lrArr) {
        this.A00 = num;
        this.A01 = c0lrArr;
    }
}
