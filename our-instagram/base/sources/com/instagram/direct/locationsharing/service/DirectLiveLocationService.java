package com.instagram.direct.locationsharing.service;

import X.AbstractC001800i;
import X.AbstractC166987dD;
import X.AbstractC31171DnF;
import X.AbstractC31178DnM;
import X.AbstractC34770FTt;
import X.AbstractC43592JPx;
import X.AbstractC53242c7;
import X.C00O;
import X.C04750Mt;
import X.C06090Tz;
import X.C0f9;
import X.C14360o3;
import X.C24940B1o;
import X.C50363MLp;
import X.C60728ROm;
import X.C7CR;
import X.C7CX;
import X.C7CY;
import X.DSA;
import X.InterfaceC159157Cb;
import X.InterfaceC65486Tl6;
import X.MHM;
import X.RGW;
import X.SCM;
import X.SCN;
import X.SMM;
import X.SXJ;
import X.TVN;
import X.XN9;
import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes10.dex */
public final class DirectLiveLocationService extends Service implements InterfaceC159157Cb {
    public RGW A00;
    public UserSession A01;
    public SMM A02;
    public boolean A03;
    public final HashMap A06 = AbstractC166987dD.A1G();
    public final Set A07 = AbstractC31171DnF.A0l();
    public final C60728ROm A04 = new C60728ROm(this);
    public final SCM A05 = new SCM(this);

    @Override // X.InterfaceC159157Cb
    public final void DPN(long j, String str, boolean z, String str2) {
        C14360o3.A0B(str2, 1);
        if (A04(this)) {
            Object computeIfAbsent = this.A06.computeIfAbsent(str2, new TVN(new C50363MLp(27, this, this), 1));
            C14360o3.A07(computeIfAbsent);
            SXJ sxj = (SXJ) computeIfAbsent;
            if (z) {
                A01(this, sxj, j);
            } else {
                A02(this, sxj, j);
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    private final void A00() {
        Intent A00 = AbstractC34770FTt.A00(this, "all", "direct-inbox", null, 67108864);
        XN9 xn9 = new XN9(this, "ig_location_sharing_channel_id");
        xn9.A0C(getString(R.string.res_0x7f13004c_name_removed));
        int i = R.drawable.notification_icon;
        int A0H = AbstractC53242c7.A0H(this, R.attr.defaultNotificationIcon);
        if (A0H != 0) {
            i = A0H;
        }
        xn9.A04(i);
        C04750Mt c04750Mt = new C04750Mt();
        c04750Mt.A0A(A00);
        xn9.A0C = c04750Mt.A01(this, 0, 268435456);
        xn9.A0E(false);
        XN9.A02(xn9, 2, true);
        Notification A03 = xn9.A03();
        C14360o3.A07(A03);
        if (Build.VERSION.SDK_INT >= 29) {
            startForeground(20017, A03, 8);
        } else {
            startForeground(20017, A03);
        }
    }

    public static final void A01(DirectLiveLocationService directLiveLocationService, SXJ sxj, long j) {
        Set set = directLiveLocationService.A07;
        Long valueOf = Long.valueOf(j);
        if (!set.contains(valueOf) && sxj.A04.A01()) {
            Set set2 = sxj.A09;
            if (!set2.contains(valueOf)) {
                set2.add(valueOf);
                sxj.A01 = AbstractC001800i.A0a(set2);
                if (set2.size() == 1) {
                    sxj.A05.A07((InterfaceC65486Tl6) sxj.A0A.getValue(), sxj.A03, "InstagramDirectLocationManager");
                }
            }
            set.add(valueOf);
        }
    }

    public static final void A02(DirectLiveLocationService directLiveLocationService, SXJ sxj, long j) {
        Set set = directLiveLocationService.A07;
        Long valueOf = Long.valueOf(j);
        if (set.contains(valueOf)) {
            Set set2 = sxj.A09;
            if (set2.contains(valueOf)) {
                set2.remove(valueOf);
                sxj.A01 = AbstractC001800i.A0a(set2);
                if (set2.isEmpty()) {
                    sxj.A05.A06();
                }
                set.remove(valueOf);
            }
        }
    }

    private final void A03(String str) {
        SMM smm = this.A02;
        if (smm != null) {
            if (!smm.A02.containsKey(str)) {
                UserSession userSession = this.A01;
                if (userSession != null) {
                    C7CY c7cy = (C7CY) userSession.A01(C7CY.class, new MHM(userSession, 49));
                    c7cy.A01.add(this);
                    SMM smm2 = this.A02;
                    if (smm2 != null) {
                        UserSession userSession2 = this.A01;
                        if (userSession2 != null) {
                            C7CX A00 = new C7CR(this, userSession2).A00();
                            smm2.A01.put(str, c7cy);
                            smm2.A03.put(str, A00);
                            AbstractC43592JPx.A1W(str, smm2.A02, true);
                            return;
                        }
                    }
                }
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            }
            return;
        }
        C14360o3.A0F("repositoriesManager");
        throw C00O.createAndThrow();
    }

    public static final boolean A04(DirectLiveLocationService directLiveLocationService) {
        UserSession userSession = directLiveLocationService.A01;
        if (userSession == null) {
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
        return AbstractC31178DnM.A1X(C06090Tz.A05, userSession, 36321086723728532L);
    }

    @Override // android.app.Service
    public final void onCreate() {
        int A04 = C0f9.A04(1304246933);
        super.onCreate();
        A00();
        this.A02 = new SMM(new SCN(this));
        C0f9.A0B(749841824, A04);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        int A04 = C0f9.A04(-156558816);
        super.onDestroy();
        Set set = this.A07;
        if (!set.isEmpty()) {
            this.A06.forEach(new C24940B1o(new DSA(12, AbstractC001800i.A0a(set), this), 2));
        }
        C0f9.A0B(2055884650, A04);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009d, code lost:
    
        if (r0 == null) goto L34;
     */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int onStartCommand(android.content.Intent r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.locationsharing.service.DirectLiveLocationService.onStartCommand(android.content.Intent, int, int):int");
    }
}
