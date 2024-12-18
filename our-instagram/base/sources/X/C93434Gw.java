package X;

/* renamed from: X.4Gw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93434Gw implements C2n2 {
    public static final C93434Gw A00 = new C93434Gw();

    @Override // X.C2n2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        String str;
        String str2;
        C83403nh c83403nh = (C83403nh) obj;
        if (c83403nh == null) {
            C18950wb.A01.AEp("Unexpected null DirectMesage when fetching keyFromElement", 20134884).report();
        }
        if (c83403nh == null || c83403nh.A0h() == null) {
            C0f5 AEp = C18950wb.A01.AEp("Unexpected null message id when fetching keyFromElement", 20134884);
            if (c83403nh != null) {
                str = c83403nh.A0h();
            } else {
                str = null;
            }
            AEp.ABW("message_id", str);
            if (c83403nh != null) {
                str2 = c83403nh.A0g();
            } else {
                str2 = null;
            }
            AEp.ABW("message_clientContext", str2);
            AEp.report();
            if (c83403nh == null) {
                return null;
            }
        }
        return c83403nh.A0h();
    }
}
