package X;

import android.app.Activity;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.ViewConfiguration;
import com.facebook.msys.mci.TraceLogger;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9Ft, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207409Ft extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207409Ft(String str, Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, X.7di] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.0sJ] */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        UserSession userSession;
        String str;
        switch (this.A00) {
            case 0:
                C9BW c9bw = (C9BW) obj;
                C14360o3.A0B(c9bw, 0);
                C206209Bd c206209Bd = (C206209Bd) c9bw.A00;
                String str2 = this.A02;
                ?? r4 = (InterfaceC16660sJ) this.A01;
                List<??> list = (List) c206209Bd.A01;
                ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                for (?? r1 : list) {
                    if (C14360o3.A0K(r1.A0K, str2)) {
                        r1 = r4.invoke(r1);
                    }
                    arrayList.add(r1);
                }
                return C9BW.A00(C206209Bd.A00((C168557fp) c206209Bd.A00, arrayList, (List) c206209Bd.A02), (C167297di) c9bw.A01);
            case 1:
                C8DN c8dn = ((C172437mC) this.A01).A0F;
                String str3 = this.A02;
                C183688Ct c183688Ct = c8dn.A00;
                C150286pc c150286pc = c183688Ct.A1h;
                if (((C8NW) c150286pc.get()).A1V()) {
                    userSession = c183688Ct.A0w;
                    str = "has_seen_template_disclosure";
                    if (!AbstractC23021Ah.A00(userSession).A01.getBoolean("has_seen_template_disclosure", false)) {
                        AbstractC23125AKj.A02(c183688Ct.A0o, new AS2(str3, c8dn, 0), userSession);
                        InterfaceC19610xo ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
                        ARD.E77(str, true);
                        ARD.apply();
                        break;
                    }
                }
                if (C8NW.A03((C8NW) c150286pc.get(), C194788je.class) != null) {
                    userSession = c183688Ct.A0w;
                    str = "has_seen_music_pick_disclosure";
                    if (!AbstractC23021Ah.A00(userSession).A01.getBoolean("has_seen_music_pick_disclosure", false)) {
                        AbstractC34832FWn.A00(c183688Ct.A0o, new AS2(str3, c8dn, 1), userSession);
                        InterfaceC19610xo ARD2 = AbstractC23021Ah.A00(userSession).A01.ARD();
                        ARD2.E77(str, true);
                        ARD2.apply();
                    }
                }
                C8DN.A01(c8dn, str3);
                break;
            case 2:
                C172437mC c172437mC = (C172437mC) this.A01;
                C8DN c8dn2 = c172437mC.A0F;
                boolean z = c172437mC.A03;
                String str4 = this.A02;
                C8Y8 c8y8 = (C8Y8) c8dn2.A00.A1z.get();
                if (c8y8 != null) {
                    C8Y8.A04(c8y8);
                    c8y8.A06.requestDisallowInterceptTouchEvent(true);
                    if (!z && !C180377zR.A07(c8y8.A05)) {
                        if (!C8Y8.A0C(new AOD(c8y8, 1), c8y8)) {
                            C8Y8.A03(c8y8);
                            break;
                        }
                    } else {
                        N54 n54 = new N54();
                        Bundle bundle = new Bundle();
                        bundle.putBoolean(MSV.A00(1360), z);
                        bundle.putBoolean(MSV.A00(1010), !C183688Ct.A0M(c8y8.A0A));
                        n54.setArguments(bundle);
                        n54.A02 = new C22879A6z(c8y8, str4);
                        C189448aO c189448aO = new C189448aO(c8y8.A05);
                        c189448aO.A0a = false;
                        Activity activity = c8y8.A00;
                        c189448aO.A0F = ViewConfiguration.get(activity).getScaledPagingTouchSlop();
                        c189448aO.A00().A0D(activity, n54);
                        C8Y8.A02(EnumC201098ur.VIEW, c8y8, str4, z);
                        break;
                    }
                }
                break;
            case 3:
                List list2 = (List) obj;
                C14360o3.A0B(list2, 0);
                AbstractC161587Lt.A03(((C163547Tr) this.A01).A0g, this.A02, list2);
                break;
            case 4:
                return TraceLogger.getTraceIdForAliasId(((Number) obj).intValue(), this.A02);
            case 5:
                ((InterfaceC16620sF) this.A01).invoke(this.A02, obj);
                break;
            case 6:
                long longValue = ((Number) obj).longValue();
                C55312gW c55312gW = (C55312gW) this.A01;
                SparseIntArray sparseIntArray = C55312gW.A02;
                c55312gW.A01.flowEndFail(longValue, this.A02, "");
                break;
            case 7:
                long longValue2 = ((Number) obj).longValue();
                C55312gW c55312gW2 = (C55312gW) this.A01;
                SparseIntArray sparseIntArray2 = C55312gW.A02;
                c55312gW2.A01.flowMarkPoint(longValue2, this.A02);
                break;
            default:
                String str5 = (String) obj;
                C14360o3.A0B(str5, 0);
                ((C2ZI) this.A01).A0A(str5, this.A02);
                return C0eB.A00;
        }
        return C0eB.A00;
    }
}
