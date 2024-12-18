package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.FcB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35038FcB {
    public static final AtomicInteger A03 = new AtomicInteger(1);
    public final int A00;
    public final C006802i A01;
    public final UserSession A02;

    public final void A00() {
        this.A01.markerEnd(383649364, this.A00, (short) 2);
    }

    public final void A01(Fragment fragment) {
        C07X c07x = (C07X) fragment.mViewLifecycleOwnerLiveData.A02();
        if (c07x == null) {
            this.A01.markerAnnotate(383649364, this.A00, "view_lifecycle", "null");
        } else {
            c07x.getLifecycle().A09(new C35759Fqw(this, 2));
        }
    }

    public final void A03(Integer num) {
        String str;
        C006802i c006802i = this.A01;
        int i = this.A00;
        switch (num.intValue()) {
            case 0:
                str = "ACTIVITY_DESTROY";
                break;
            case 1:
                str = "MANAGER_IS_DISPLAYING";
                break;
            case 2:
                str = "BOTTOMSHEET_NULL";
                break;
            case 3:
                str = "NULL_ACTIVITY";
                break;
            default:
                str = "TIMEOUT";
                break;
        }
        c006802i.markerAnnotate(383649364, i, AbstractC111324zv.A00(406), str);
        c006802i.markerEnd(383649364, i, (short) 3);
    }

    public C35038FcB(C006802i c006802i, UserSession userSession, int i) {
        this.A02 = userSession;
        this.A00 = i;
        this.A01 = c006802i;
    }

    public final void A02(C07X c07x, Integer num, String str, String str2) {
        String str3;
        AbstractC167017dG.A1P(str, str2);
        C006802i c006802i = this.A01;
        int i = this.A00;
        c006802i.markerStart(383649364, i);
        c006802i.markerAnnotate(383649364, i, "entrypoint", str);
        c006802i.markerAnnotate(383649364, i, "variant", str2);
        if (num != null) {
            if (1 - num.intValue() != 0) {
                str3 = "CXP_NOTICE";
            } else {
                str3 = "NATIVE";
            }
            c006802i.markerAnnotate(383649364, i, CacheBehaviorLogger.SOURCE, str3);
        }
        if (c07x == null) {
            A03(C05F.A0N);
        } else {
            AbstractC166987dD.A1Z(new PZC(this, null, 49), C07Y.A00(c07x));
        }
    }
}
