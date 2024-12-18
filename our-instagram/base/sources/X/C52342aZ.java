package X;

import android.os.SystemClock;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.2aZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52342aZ {
    public final String A00;
    public final InterfaceC52252aQ A01;
    public final C0YR A02;

    public final Object A01(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 0);
        return A02(abstractC12990ll, C05F.A00, C16030qx.A02.A04(abstractC12990ll.getDeviceSession().A06()));
    }

    public static final Object A00(C52342aZ c52342aZ) {
        C52432ai A00;
        C52462al A002 = AbstractC52312aW.A00(c52342aZ.A01);
        String str = ((AbstractC06830Ya) c52342aZ.A02).name;
        C14360o3.A0B(str, 0);
        C17240tK c17240tK = A002.A08;
        if (c17240tK != null && !((Boolean) c17240tK.A00()).booleanValue()) {
            A00 = A002.A05;
            if (A00 == null) {
                C14360o3.A0F("deployGroup");
                throw C00O.createAndThrow();
            }
        } else {
            A00 = C52462al.A00(A002);
        }
        Object obj = A00.A02.get(str);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException(AnonymousClass001.A0u("Parameter ", str, " was not set for group ", A00.A01));
    }

    public final Object A02(AbstractC12990ll abstractC12990ll, Integer num, String str) {
        C17240tK c17240tK;
        C52462al A00 = AbstractC52312aW.A00(this.A01);
        if (str != null && System.currentTimeMillis() < Long.MAX_VALUE && A00.A00 < A00.A01 && SystemClock.elapsedRealtime() - A00.A02 >= C52462al.A0B && ((c17240tK = A00.A08) == null || ((Boolean) c17240tK.A00()).booleanValue())) {
            A00.A02 = SystemClock.elapsedRealtime();
            boolean equals = num.equals(C05F.A00);
            C12210kP c12210kP = new C12210kP(abstractC12990ll);
            if (equals) {
                c12210kP.A01(C12180kM.A05);
            }
            C18920wW A002 = c12210kP.A00();
            double currentTimeMillis = System.currentTimeMillis();
            double A003 = C1Q9.A00();
            C12180kM c12180kM = A002.A00;
            InterfaceC02590Ai A004 = A002.A00(c12180kM, "ig_local_exposure");
            A004.AAP("waterfall_id", C1Q9.A01());
            String str2 = A00.A09;
            A004.AAP("experiment", str2);
            A004.AAP("test_group", C52462al.A00(A00).A01);
            A004.AAP("guid", str);
            A004.AAP("containermodule", "waterfall_log_in");
            Double valueOf = Double.valueOf(currentTimeMillis - A003);
            A004.A8I("elapsed_time", valueOf);
            Double valueOf2 = Double.valueOf(A003);
            A004.A8I(TraceFieldType.StartTime, valueOf2);
            A004.A8I("current_time", Double.valueOf(currentTimeMillis));
            A004.Cht();
            InterfaceC02590Ai A005 = A002.A00(c12180kM, "initial_app_launch_experiment_exposure");
            A005.AAP("exp_name", str2);
            A005.AAP("exp_group", C52462al.A00(A00).A01);
            A005.AAP("app_device_id", str);
            A005.AAP("containermodule", "waterfall_log_in");
            A005.A8I("elapsed_time", valueOf);
            A005.A8I(TraceFieldType.StartTime, valueOf2);
            A005.A9K("current_time", Long.valueOf((long) currentTimeMillis));
            A005.Cht();
        }
        return A00(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C52342aZ(InterfaceC52252aQ interfaceC52252aQ, C0YR c0yr) {
        this.A01 = interfaceC52252aQ;
        this.A02 = c0yr;
        this.A00 = ((AbstractC06830Ya) c0yr).name;
    }
}
