package X;

import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.Lat, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C48379Lat implements C6D2 {
    public final /* synthetic */ C6JY A00;
    public final /* synthetic */ C2EY A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ Long A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    public /* synthetic */ C48379Lat(C6JY c6jy, C2EY c2ey, Integer num, Integer num2, Long l, String str, String str2, String str3, boolean z) {
        this.A00 = c6jy;
        this.A05 = str;
        this.A08 = z;
        this.A04 = l;
        this.A06 = str2;
        this.A07 = str3;
        this.A01 = c2ey;
        this.A02 = num;
        this.A03 = num2;
    }

    @Override // X.C6D2
    public final Object apply(Object obj) {
        C6JY c6jy = this.A00;
        String str = this.A05;
        boolean z = this.A08;
        Long l = this.A04;
        String str2 = this.A06;
        String str3 = this.A07;
        C2EY c2ey = this.A01;
        Integer num = this.A02;
        Integer num2 = this.A03;
        InterfaceC132965zL interfaceC132965zL = (InterfaceC132965zL) obj;
        if (interfaceC132965zL instanceof C48496Lcn) {
            return C48496Lcn.A00(interfaceC132965zL);
        }
        MsysThreadId msysThreadId = (MsysThreadId) AbstractC132975zM.A01(interfaceC132965zL);
        long j = msysThreadId.A00;
        Long A01 = AbstractC92784Dr.A01(msysThreadId);
        String A14 = AbstractC25225BEi.A14();
        return AbstractC43593JPy.A0N(AbstractC43593JPy.A0M(new C48381Lav(c6jy, c2ey, num2, num, A01, l, str, str2, str3, A14, j, z), c6jy.A00), "rxmailbox_send_secure_text_message");
    }
}
