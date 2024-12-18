package X;

/* renamed from: X.IyJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42905IyJ implements InterfaceC43416JGg {
    public final /* synthetic */ C42933Iyl A00;

    public C42905IyJ(C42933Iyl c42933Iyl) {
        this.A00 = c42933Iyl;
    }

    @Override // X.InterfaceC43416JGg
    public final void DbP(EnumC77213d7 enumC77213d7) {
        long j;
        C1QT c1qt;
        String str;
        C14360o3.A0B(enumC77213d7, 0);
        if (enumC77213d7 == EnumC77213d7.A04) {
            ILe A00 = I6L.A00(this.A00.A00);
            j = A00.A00;
            if (j > 0) {
                c1qt = A00.A01;
                str = "SAVE_PRODUCT";
            } else {
                return;
            }
        } else {
            if (enumC77213d7 != EnumC77213d7.A03) {
                return;
            }
            ILe A002 = I6L.A00(this.A00.A00);
            j = A002.A00;
            if (j <= 0) {
                return;
            }
            c1qt = A002.A01;
            str = "UNSAVE_PRODUCT";
        }
        c1qt.flowMarkPoint(j, str);
    }
}
