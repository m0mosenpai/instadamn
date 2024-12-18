package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.modal.TransparentModalActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.U6x, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66277U6x {
    public SparseArray A02;
    public C102884kP A03;
    public C102884kP A04;
    public String A05;
    public String A06;
    public Map A07;
    public final String A08;
    public final Map A0B;
    public final List A09 = new ArrayList();
    public final Map A0A = new HashMap();
    public long A01 = 0;
    public int A00 = 0;

    public static C66277U6x A00(String str) {
        return A01(str, new HashMap());
    }

    public static C66277U6x A01(String str, Map map) {
        return new C66277U6x(map, new HashMap(), str);
    }

    public static C66277U6x A02(String str, Map map, Map map2) {
        return new C66277U6x(map, map2, str);
    }

    public final C72743Nv A03(Context context, IgBloksScreenConfig igBloksScreenConfig) {
        Map map = this.A07;
        new ArrayList();
        String str = this.A08;
        Map map2 = this.A0B;
        int i = this.A00;
        List list = this.A09;
        String str2 = this.A05;
        String str3 = this.A06;
        C102884kP c102884kP = this.A03;
        C66273U6s c66273U6s = new C66273U6s(this.A02, c102884kP, str, str2, str3, (HashMap) map, list, this.A0A, map2, map2, i, false);
        long j = this.A01;
        AbstractC191798eb.A02(context, igBloksScreenConfig.A04(), str, this.A05, map, j);
        C1LZ.A00().A02();
        return W3Y.A00(c66273U6s, igBloksScreenConfig);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d5, code lost:
    
        if (r0 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x007d, code lost:
    
        if (X.AbstractC31178DnM.A1X(X.C06090Tz.A05, r24.A0B, 36318823276354068L) == false) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.53S, X.WdP, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(android.content.Context r23, com.instagram.bloks.hosting.IgBloksScreenConfig r24) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66277U6x.A04(android.content.Context, com.instagram.bloks.hosting.IgBloksScreenConfig):void");
    }

    public final void A05(Context context, IgBloksScreenConfig igBloksScreenConfig) {
        Map map = this.A07;
        new ArrayList();
        String str = this.A08;
        Map map2 = this.A0B;
        int i = this.A00;
        List list = this.A09;
        String str2 = this.A05;
        String str3 = this.A06;
        C102884kP c102884kP = this.A03;
        C66273U6s c66273U6s = new C66273U6s(this.A02, c102884kP, str, str2, str3, (HashMap) map, list, this.A0A, map2, map2, i, false);
        long j = this.A01;
        AbstractC191798eb.A02(context, igBloksScreenConfig.A04(), str, this.A05, map, j);
        C1LZ.A00().A02();
        Activity activity = (Activity) AbstractC13320mI.A00(context, FragmentActivity.class);
        if (activity != null) {
            Bundle bundle = new Bundle();
            AbstractC31175DnJ.A0r(bundle, igBloksScreenConfig.A0B);
            bundle.putString("cds_platform", "Bloks");
            IgBloksScreenConfig.A03(bundle, igBloksScreenConfig, false);
            C66273U6s.A02(bundle, c66273U6s, AbstractC66275U6v.A00(igBloksScreenConfig.A0B).booleanValue());
            C3DN A00 = C3DN.A00.A00(activity);
            if ((activity instanceof InterfaceC47352Fi) && ((A00 == null || !((C3DP) A00).A0h) && !igBloksScreenConfig.A0p)) {
                U60 u60 = new U60();
                C189478aR A002 = AbstractC70200WGp.A08(activity, igBloksScreenConfig, igBloksScreenConfig.A0B, u60).A00();
                u60.A0C = A002;
                u60.setArguments(bundle);
                A002.A02(activity, u60);
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString(MSV.A00(4), "bloks");
            bundle2.putBundle("bloks_screen_config", bundle);
            AbstractC25228BEl.A1G(activity, bundle2, igBloksScreenConfig.A0B, TransparentModalActivity.class, AbstractC111324zv.A00(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS));
            return;
        }
        throw new IllegalStateException();
    }

    public final void A06(Context context, IgBloksScreenConfig igBloksScreenConfig) {
        A07(context, igBloksScreenConfig, null, 32, false);
    }

    public final void A07(Context context, IgBloksScreenConfig igBloksScreenConfig, XBX xbx, int i, boolean z) {
        Map map = this.A07;
        new ArrayList();
        String str = this.A08;
        Map map2 = this.A0B;
        int i2 = this.A00;
        List list = this.A09;
        String str2 = this.A05;
        String str3 = this.A06;
        C102884kP c102884kP = this.A03;
        C66273U6s c66273U6s = new C66273U6s(this.A02, c102884kP, str, str2, str3, (HashMap) map, list, this.A0A, map2, map2, i2, false);
        long j = this.A01;
        AbstractC191798eb.A02(context, igBloksScreenConfig.A04(), str, this.A05, map, j);
        C1LZ.A00().A02().A01(context, c66273U6s, igBloksScreenConfig, this.A03, xbx, i, z);
    }

    public final void A08(Map map) {
        this.A0A.putAll(map);
    }

    public C66277U6x(Map map, Map map2, String str) {
        this.A08 = str;
        this.A07 = map;
        this.A0B = map2;
    }
}
