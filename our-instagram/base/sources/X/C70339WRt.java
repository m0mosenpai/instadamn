package X;

/* renamed from: X.WRt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70339WRt implements InterfaceC71878X8l {
    public final long A00;
    public final /* synthetic */ WRY A01;

    public C70339WRt(WRY wry, long j) {
        this.A01 = wry;
        this.A00 = j;
    }

    @Override // X.InterfaceC71878X8l
    public final C69736VuW Bs4(long j) {
        WRY wry = this.A01;
        C69736VuW A00 = wry.A08[0].A00(j);
        int i = 1;
        while (true) {
            C69654Vsv[] c69654VsvArr = wry.A08;
            if (i < c69654VsvArr.length) {
                C69736VuW A002 = c69654VsvArr[i].A00(j);
                if (A002.A00.A00 < A00.A00.A00) {
                    A00 = A002;
                }
                i++;
            } else {
                return A00;
            }
        }
    }
}
