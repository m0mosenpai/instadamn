package X;

import com.facebook.graphql.enums.EnumHelper;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.instagram.common.api.base.CacheBehaviorLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class LLH {
    public final L36 A00;
    public final C47214Ktn A01;
    public final K3W A02;
    public final LightweightQuickPerformanceLogger A03;
    public final C47311KvM A04;

    public static final void A03(LLH llh, String str, String str2, int[] iArr) {
        for (int i : iArr) {
            llh.A03.markerAnnotate(i, str, str2);
        }
    }

    public static final void A04(LLH llh, String str, int[] iArr) {
        for (int i : iArr) {
            llh.A03.markerPoint(i, str);
        }
    }

    public static final void A05(LLH llh, String str, int[] iArr, boolean z) {
        for (int i : iArr) {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = llh.A03;
            lightweightQuickPerformanceLogger.markerAnnotate(i, TraceFieldType.ErrorCode, str);
            if (i != 1021652813 || z) {
                lightweightQuickPerformanceLogger.markerEnd(i, (short) 3);
            }
        }
    }

    public final LK0 A06(String str, boolean z, boolean z2) {
        int i = 231356437;
        if (str.equals("OMNISTORE")) {
            i = 231352282;
        }
        int[] iArr = {1021652813, i};
        LK0 A00 = LK0.A00();
        if (!AbstractC25231BEo.A1b(this.A01.A00)) {
            AbstractC46542Kih.A00(A00, new Exception());
            return A00;
        }
        int i2 = 0;
        do {
            int i3 = iArr[i2];
            if (i3 != 1021652813 || z2) {
                this.A03.markerStartWithCancelPolicy(i3, false, 0, -1L, TimeUnit.NANOSECONDS);
            }
            this.A03.markerAnnotate(i3, CacheBehaviorLogger.SOURCE, str);
            i2++;
        } while (i2 < 2);
        A03(this, "transport", "GRAPHQL", iArr);
        A04(this, "FETCH_BACKUP_STATUS_GRAPHQL_REQUEST_START", iArr);
        A03(this, "request_uuid", AbstractC25231BEo.A0p(), iArr);
        C47311KvM c47311KvM = this.A04;
        M8M.A01(LFN.A00.A00(c47311KvM.A00), new C50364MLq(0, new MIA(this, A00, iArr, z2, z), new MIK(1, this, iArr, A00, true, z2), c47311KvM), 1);
        return A00;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.K3W, com.facebook.msys.mca.MailboxFeature] */
    public LLH(L36 l36, C47214Ktn c47214Ktn, AbstractC135836Cl abstractC135836Cl, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, C47311KvM c47311KvM) {
        this.A02 = new MailboxFeature(abstractC135836Cl);
        this.A03 = lightweightQuickPerformanceLogger;
        this.A01 = c47214Ktn;
        this.A00 = l36;
        this.A04 = c47311KvM;
    }

    public static final void A02(LLH llh, LK0 lk0, EnumC46240KdG enumC46240KdG) {
        Object c44827Jt1;
        Map map = llh.A00.A02;
        if (map != null) {
            Object obj = map.get(enumC46240KdG.toString());
            if (obj != null) {
                c44827Jt1 = new C44826Jt0(obj);
            } else {
                c44827Jt1 = new C44827Jt1(new Exception());
            }
            lk0.A05(c44827Jt1);
            return;
        }
        C14360o3.A0F("tpidMap");
        throw C00O.createAndThrow();
    }

    public static final LK0 A00(LLH llh, EnumC46240KdG enumC46240KdG, String str) {
        LK0 A00 = LK0.A00();
        if (!AbstractC25231BEo.A1b(llh.A01.A00)) {
            AbstractC46542Kih.A00(A00, new Exception());
            return A00;
        }
        if (llh.A00.A03) {
            A02(llh, A00, enumC46240KdG);
            return A00;
        }
        llh.A06(str, false, true).A04(new LSI(0, llh, A00, enumC46240KdG));
        return A00;
    }

    public static final ArrayList A01(List list) {
        Integer num;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            EnumC46244KdL enumC46244KdL = (EnumC46244KdL) EnumHelper.A00(String.valueOf(map.get("virtual_device_type")), EnumC46244KdL.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            C14360o3.A07(enumC46244KdL);
            EnumC46206Kci A00 = AbstractC46540Kif.A00(enumC46244KdL);
            EnumC46239KdF enumC46239KdF = (EnumC46239KdF) EnumHelper.A00(String.valueOf(map.get("migration_status")), EnumC46239KdF.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            C14360o3.A07(enumC46239KdF);
            int ordinal = enumC46239KdF.ordinal();
            if (ordinal != 2) {
                if (ordinal != 1) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            num = C05F.A00;
                        } else {
                            num = C05F.A0Y;
                        }
                    } else {
                        num = C05F.A0N;
                    }
                } else {
                    num = C05F.A01;
                }
            } else {
                num = C05F.A0C;
            }
            if (A00 != null) {
                Object obj = map.get("creation_time");
                if (obj != null) {
                    Long A13 = AbstractC25228BEl.A13((String) obj);
                    Object obj2 = map.get("virtual_device_id");
                    if (obj2 != null) {
                        A1E.add(new C47805L9n(A00, num, A13, obj2.toString(), String.valueOf(map.get("device_created_on")), (String) map.get("cloud_service_account")));
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
        }
        return A1E;
    }
}
