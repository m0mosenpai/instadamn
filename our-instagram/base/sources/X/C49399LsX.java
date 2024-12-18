package X;

/* renamed from: X.LsX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49399LsX implements AnonymousClass786 {
    public final /* synthetic */ C49170Lon A00;
    public final /* synthetic */ C45895KSy A01;

    public C49399LsX(C49170Lon c49170Lon, C45895KSy c45895KSy) {
        this.A00 = c49170Lon;
        this.A01 = c45895KSy;
    }

    @Override // X.AnonymousClass786
    public final void DBL() {
        C49170Lon c49170Lon = this.A00;
        C7Q8 c7q8 = c49170Lon.A00;
        if (c7q8 != null) {
            c7q8.DBb(this.A01, c49170Lon);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
