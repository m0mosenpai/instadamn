package X;

import com.instagram.direct.msys.subtype.MsysThreadSubtype;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.Lam, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48372Lam implements C6D2 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1351769r A01;
    public final /* synthetic */ MsysThreadSubtype A02;
    public final /* synthetic */ MsysThreadId A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ boolean A05;

    public C48372Lam(C1351769r c1351769r, MsysThreadSubtype msysThreadSubtype, MsysThreadId msysThreadId, Integer num, int i, boolean z) {
        this.A03 = msysThreadId;
        this.A05 = z;
        this.A01 = c1351769r;
        this.A00 = i;
        this.A02 = msysThreadSubtype;
        this.A04 = num;
    }

    @Override // X.C6D2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        MsysThreadId msysThreadId = this.A03;
        boolean z = this.A05;
        C1351769r c1351769r = this.A01;
        return new C9ZG(this.A02, msysThreadId, Long.valueOf(c1351769r.mResultSet.getLong(this.A00, 2)), (String) ((C46h) obj).A04(), AbstractC31177DnL.A03(this.A04), z);
    }
}
