package X;

/* renamed from: X.973, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass973 implements InterfaceC06290Uu {
    public C0f6 A00;

    @Override // X.InterfaceC06290Uu
    public final void EHz(String str, String str2, int i, String str3) {
        C0f5 AEp = this.A00.AEp("content_resolver", 817892585);
        if (AEp.isSampled()) {
            AEp.ABW("operation", str);
            AEp.ABW("authority", str2);
            AEp.ABU("callsite_id", i);
            AEp.ERI(new Exception(str3));
            AEp.report();
        }
    }
}
