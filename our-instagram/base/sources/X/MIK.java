package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.List;

/* loaded from: classes8.dex */
public final class MIK extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MIK(int i, Object obj, Object obj2, Object obj3, boolean z, boolean z2) {
        super(1);
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
        this.A05 = z;
        this.A04 = z2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, X.DiP] */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        InterfaceC16660sJ interfaceC16660sJ;
        C5C3 c5c3;
        String str;
        String str2;
        String str3;
        String str4;
        C117325Sr c117325Sr;
        C117335Ss A09;
        C117325Sr c117325Sr2;
        C117335Ss A092;
        C117325Sr c117325Sr3;
        C117335Ss A093;
        InterfaceC19630xq interfaceC19630xq;
        String str5;
        switch (this.A00) {
            case 0:
                C5C8 c5c8 = (C5C8) obj;
                if (!this.A05 && this.A04) {
                    CWQ cwq = (CWQ) this.A01;
                    C27946CTf c27946CTf = cwq.A04;
                    if (c27946CTf != null) {
                        List A1Q = AbstractC16960so.A1Q(new Object(), new C28857CoR(c5c8, 1));
                        C27945CTe c27945CTe = cwq.A0M;
                        interfaceC16660sJ = cwq.A0O;
                        c5c3 = c27945CTe.A00(A1Q);
                        c27946CTf.A00(null, c5c3);
                    } else {
                        C5C3 c5c32 = (C5C3) this.A03;
                        String str6 = c5c32.A01.A00;
                        long j = c5c32.A00;
                        int A06 = AbstractC25225BEi.A06(j);
                        String obj2 = AbstractC001900j.A0N(str6, c5c8, A06, (int) (j & 4294967295L)).toString();
                        int length = A06 + c5c8.length();
                        long A00 = C60Z.A00(length, length);
                        interfaceC16660sJ = cwq.A0O;
                        c5c3 = new C5C3(obj2, A00);
                    }
                    interfaceC16660sJ.invoke(c5c3);
                    return true;
                }
                return false;
            case 1:
                String str7 = (String) obj;
                C14360o3.A0B(str7, 0);
                LLH llh = (LLH) this.A03;
                int[] iArr = (int[]) this.A02;
                LLH.A04(llh, "FETCH_BACKUP_STATUS_GRAPHQL_REQUEST_FAIL", iArr);
                LLH.A03(llh, "backup_state", "FETCH_BACKUP_STATUS_ERROR", iArr);
                String A0R = AnonymousClass001.A0R("GRAPHQL_RESPONSE_ERROR: ", str7);
                for (int i : iArr) {
                    C117315Sq A062 = new C11L("error=(.*?),").A06(str7, 0);
                    if (A062 != null && (c117325Sr3 = A062.A02) != null && (A093 = c117325Sr3.A09(1)) != null) {
                        str2 = A093.A00;
                    } else {
                        str2 = "no type found";
                    }
                    C117315Sq A063 = new C11L("errorDomain=(.*?),").A06(str7, 0);
                    if (A063 != null && (c117325Sr2 = A063.A02) != null && (A092 = c117325Sr2.A09(1)) != null) {
                        str3 = A092.A00;
                    } else {
                        str3 = "no domain found";
                    }
                    C117315Sq A064 = new C11L("domainErrorCode=(.*?)\\)").A06(str7, 0);
                    if (A064 != null && (c117325Sr = A064.A02) != null && (A09 = c117325Sr.A09(1)) != null) {
                        str4 = A09.A00;
                    } else {
                        str4 = "no domain error found";
                    }
                    LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = llh.A03;
                    lightweightQuickPerformanceLogger.markerAnnotate(i, "error_domain_code", str4);
                    lightweightQuickPerformanceLogger.markerAnnotate(i, AbstractC58317Pt9.A00(23), str3);
                    lightweightQuickPerformanceLogger.markerAnnotate(i, "error_type", str2);
                }
                AbstractC46542Kih.A00((LK0) this.A01, new Exception());
                if (this.A05) {
                    LLH.A04(llh, "NETWORK_PROBE_STARTED", iArr);
                    if (AbstractC46549Kio.A00()) {
                        str = "NETWORK_PROBE_SUCCEEDED";
                    } else {
                        str = "NETWORK_PROBE_FAILED";
                    }
                    LLH.A04(llh, str, iArr);
                    LLH.A04(llh, "NETWORK_PROBE_ENDED", iArr);
                }
                LLH.A05(llh, A0R, iArr, this.A04);
                return C0eB.A00;
            case 2:
                if (this.A01 != null) {
                    if (this.A05 && this.A04) {
                        interfaceC19630xq = ((C23031Ai) this.A02).A01;
                        str5 = "comment_cover_updated_nux_count";
                    } else {
                        interfaceC19630xq = ((C23031Ai) this.A02).A01;
                        str5 = "comment_cover_nux_count";
                    }
                    AbstractC167017dG.A0g(interfaceC19630xq, str5).apply();
                }
                ((C26344Bkp) this.A03).A00.A0A.A0Y(true);
                return C0eB.A00;
            default:
                if (this.A04) {
                    ((InterfaceC31159Dn3) this.A03).Dnd((C120985dq) this.A01, (C37644Ghd) this.A02, "social_context_followers_count_tap", this.A05);
                }
                return C0eB.A00;
        }
    }
}
