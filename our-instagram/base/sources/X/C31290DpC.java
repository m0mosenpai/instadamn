package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.DpC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31290DpC extends AbstractC46524KiP {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final C2056398n A02;

    @Override // X.AbstractC46524KiP
    public final View A06(Context context) {
        C14360o3.A0B(context, 0);
        return new FKU(context, this).A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r9.isMuted() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        r3 = !X.AbstractC14480oK.A01(r6.A00.getApplicationContext());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r2 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r4 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        r2 = r6.A02.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r2.getBoolean("has_seen_broadcast_channel_pushability_upsell", false) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (r3 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        r3 = r2.getInt("broadcast_channel_visit_count_for_pushability", 0);
        r5 = r6.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if (r3 < X.C18U.A01(X.C06090Tz.A06, r5, 36600852309610544L)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r5, 36319377332772218L) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r8.Dpu(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        r8.onFailure();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0011, code lost:
    
        if (r9 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r9.C7g() != 29) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r9.CPZ() != true) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r9.BI1() != 7) goto L15;
     */
    @Override // X.AbstractC46524KiP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07(X.InterfaceC50428MOi r7, X.InterfaceC37159GYw r8, X.C2EC r9, java.lang.String r10, boolean r11) {
        /*
            r6 = this;
            r3 = 1
            X.C14360o3.A0B(r8, r3)
            r4 = 0
            if (r9 == 0) goto L10
            int r1 = r9.C7g()
            r0 = 29
            r2 = 1
            if (r1 == r0) goto L13
        L10:
            r2 = 0
            if (r9 == 0) goto L27
        L13:
            boolean r0 = r9.CPZ()
            if (r0 != r3) goto L27
            int r1 = r9.BI1()
            r0 = 7
            if (r1 != r0) goto L27
            boolean r0 = r9.isMuted()
            if (r0 != 0) goto L27
            r4 = 1
        L27:
            androidx.fragment.app.FragmentActivity r0 = r6.A00
            android.content.Context r0 = r0.getApplicationContext()
            boolean r0 = X.AbstractC14480oK.A01(r0)
            r3 = r0 ^ 1
            if (r2 == 0) goto L6f
            if (r4 == 0) goto L6f
            X.98n r0 = r6.A02
            X.0xq r2 = r0.A00
            java.lang.String r0 = "has_seen_broadcast_channel_pushability_upsell"
            r1 = 0
            boolean r0 = r2.getBoolean(r0, r1)
            if (r0 != 0) goto L6f
            if (r3 == 0) goto L6f
            java.lang.String r0 = "broadcast_channel_visit_count_for_pushability"
            int r0 = r2.getInt(r0, r1)
            long r3 = (long) r0
            com.instagram.common.session.UserSession r5 = r6.A01
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36600852309610544(0x82084800641030, double:3.209864608175877E-306)
            long r1 = X.C18U.A01(r2, r5, r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L6f
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36319377332772218(0x81084800621d7a, double:3.031858699414562E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 == 0) goto L6f
            r8.Dpu(r6)
            return
        L6f:
            r8.onFailure()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31290DpC.A07(X.MOi, X.GYw, X.2EC, java.lang.String, boolean):void");
    }

    public C31290DpC(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = AbstractC2056298m.A00(userSession);
    }
}
