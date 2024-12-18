package X;

import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.HashMap;

/* renamed from: X.LaZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48359LaZ implements C6D2 {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C48359LaZ(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C6D2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        android.net.Uri uri;
        String obj2;
        HashMap hashMap;
        C51740MtP c51740MtP;
        Object obj3;
        String str;
        C5Fn A00;
        int i;
        switch (this.A00) {
            case 0:
                String str2 = ((C45775KOc) ((AbstractC46418Kge) this.A01)).A00;
                String str3 = this.A02;
                C14360o3.A0A(str3);
                return ((LAI) obj).A05(EnumC46206Kci.A08, str2, str3);
            case 1:
                String str4 = ((KOr) ((AbstractC46422Kgi) this.A01)).A00;
                String str5 = this.A02;
                C14360o3.A0A(str5);
                return ((LAI) obj).A05(EnumC46206Kci.A05, str4, str5);
            case 2:
                C137766Ly c137766Ly = (C137766Ly) this.A01;
                String str6 = this.A02;
                C47685L3s c47685L3s = (C47685L3s) obj;
                if (c47685L3s.A04 && (uri = c47685L3s.A00) != null && (obj2 = uri.toString()) != null) {
                    C137096In c137096In = c137766Ly.A0G;
                    String[] strArr = (String[]) AbstractC31178DnM.A1b(obj2, "/");
                    int length = strArr.length;
                    if (length > 2) {
                        String str7 = strArr[length - 2];
                        String A002 = AbstractC58317Pt9.A00(336);
                        if (str7 != null && str7.equalsIgnoreCase(A002)) {
                            C15500q5.A04(c137096In.A00).remove(LHB.A01(str6));
                            hashMap = c137096In.A01;
                            c51740MtP = new C51740MtP(obj2, 13, true);
                            hashMap.put(str6, c51740MtP);
                            return C42221xC.A09(obj2);
                        }
                    }
                    hashMap = c137096In.A01;
                    c51740MtP = new C51740MtP(obj2, 13, false);
                    hashMap.put(str6, c51740MtP);
                    return C42221xC.A09(obj2);
                }
                c137766Ly.A0G.A01.remove(str6);
                return C42221xC.A09("");
            case 3:
                obj3 = this.A01;
                str = this.A02;
                C137766Ly c137766Ly2 = C137766Ly.A0L;
                A00 = AbstractC137146It.A00("activate_thread_session");
                i = 0;
                break;
            case 4:
                obj3 = this.A01;
                str = this.A02;
                A00 = AbstractC137146It.A00("rxmailbox_save_draft_message");
                i = 2;
                break;
            case 5:
                C6JY c6jy = (C6JY) this.A01;
                String str8 = this.A02;
                String str9 = "unified_identity_settings_fragment";
                InterfaceC132965zL interfaceC132965zL = (InterfaceC132965zL) obj;
                if (interfaceC132965zL instanceof C48496Lcn) {
                    return C48496Lcn.A00(interfaceC132965zL);
                }
                MsysThreadId msysThreadId = (MsysThreadId) AbstractC132975zM.A01(interfaceC132965zL);
                long j = msysThreadId.A00;
                return AbstractC43593JPy.A0N(AbstractC43593JPy.A0M(new C48381Lav(c6jy, C2EY.A1i, null, 0 == true ? 1 : 0, AbstractC92784Dr.A01(msysThreadId), 0 == true ? 1 : 0, str8, 0 == true ? 1 : 0, str9, AbstractC25225BEi.A14(), j, false), c6jy.A00), "rxmailbox_send_secure_text_message").A0K(new JQI(16));
            default:
                return C46h.A00(((C47954LGp) this.A01).A00(this.A02));
        }
        return C42221xC.A07(new C48449Lc2(obj3, obj, str, i), A00);
    }
}
