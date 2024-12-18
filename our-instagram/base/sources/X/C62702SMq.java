package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.SMq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62702SMq {
    public final Intent A00;
    public final Bundle A01;
    public final C00V A02;
    public final C00X A03;
    public final FragmentActivity A04;
    public final FragmentActivity A05;
    public final C64522THp A06;
    public final String A07;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.THp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.00g] */
    public C62702SMq(Intent intent, Bundle bundle, C00V c00v, FragmentActivity fragmentActivity, String str) {
        AbstractC167007dF.A1G(str, 2, bundle);
        ?? obj = new Object();
        this.A05 = fragmentActivity;
        this.A07 = str;
        this.A02 = c00v;
        this.A06 = obj;
        this.A00 = intent;
        this.A01 = bundle;
        this.A03 = new C05100Oz(fragmentActivity.registerForActivityResult(new C0P1(new Object(), AbstractC58322PtE.A0Z()), c00v));
        this.A04 = fragmentActivity;
    }

    public final void A00() {
        C62920SXc c62920SXc = C62920SXc.A00;
        C64522THp c64522THp = this.A06;
        FragmentActivity fragmentActivity = this.A05;
        C09Y c09y = C023409i.A0A;
        C18920wW A02 = AbstractC12220kQ.A02(c09y.A08(fragmentActivity));
        Integer num = C05F.A03;
        String str = this.A07;
        c62920SXc.A00(A02, num, str, null, null, null, 0L);
        try {
            C64058SyU c64058SyU = (C64058SyU) AbstractC58323PtF.A0l(null, SRV.class, "create");
            c64058SyU.A00.A04("oauth_integration_id", str);
            c64058SyU.A01 = true;
            c64522THp.A00(fragmentActivity, c64058SyU.build().setMaxToleratedCacheAgeMs(0L).setEnsureCacheWrite(false), new T8L(this.A02, AbstractC12220kQ.A02(c09y.A08(fragmentActivity)), str, 0));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw AbstractC58318PtA.A0f(e);
        }
    }
}
