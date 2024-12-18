package com.instagram.contacts.ccu.impl;

import X.AbstractC167007dF;
import X.AbstractC18680vv;
import X.AbstractC31173DnH;
import X.AnonymousClass001;
import X.C006802i;
import X.C023409i;
import X.C06090Tz;
import X.C0w9;
import X.C11830jh;
import X.C14360o3;
import X.C18U;
import X.C19280xC;
import X.C19T;
import X.C19U;
import X.C31680Dvl;
import X.C54P;
import X.C68967Vf5;
import X.C69451Vna;
import X.C69527Vqr;
import X.C69690Vtg;
import X.C69737VuX;
import X.C69758Vuv;
import X.SK4;
import X.VSP;
import X.WGO;
import X.WUT;
import X.WUU;
import X.XAL;
import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.HashSet;

/* loaded from: classes11.dex */
public final class CCUServiceImpl extends SK4 {
    public static final VSP Companion = new Object();

    @Override // X.SK4
    public boolean onStart(Context context, XAL xal) {
        String str;
        String str2;
        String str3;
        String str4;
        boolean A1R = AbstractC167007dF.A1R(0, context, xal);
        try {
            try {
                AbstractC18680vv A05 = C023409i.A0A.A05(this);
                if (A05 instanceof UserSession) {
                    UserSession userSession = (UserSession) A05;
                    "continuous_contact_upload_attempt".getClass();
                    C19280xC A01 = C19280xC.A01("continuous_contact_upload_attempt", null);
                    C19U A012 = C11830jh.A04.A01(userSession).A01(C19T.A1R);
                    if (A012 != null) {
                        A01.A0C("phone_id", A012.A01);
                    }
                    AbstractC31173DnH.A1S(A01, userSession);
                    Context applicationContext = context.getApplicationContext();
                    HashSet hashSet = new HashSet();
                    HashSet hashSet2 = new HashSet();
                    C31680Dvl c31680Dvl = new C31680Dvl(context, 0);
                    C69758Vuv c69758Vuv = new C69758Vuv(context, userSession);
                    C69527Vqr c69527Vqr = new C69527Vqr(userSession);
                    C68967Vf5 c68967Vf5 = new C68967Vf5(context, userSession);
                    hashSet.add(new WUT(xal));
                    C006802i c006802i = C006802i.A0p;
                    C14360o3.A07(c006802i);
                    C69451Vna c69451Vna = new C69451Vna(applicationContext, new C69737VuX(c006802i), c69527Vqr, c69758Vuv, c68967Vf5, hashSet2, hashSet, c31680Dvl);
                    if (C18U.A06(C06090Tz.A05, A05, 36311972802855760L)) {
                        C69758Vuv c69758Vuv2 = c69451Vna.A07;
                        UserSession userSession2 = c69758Vuv2.A01;
                        String str5 = userSession2.userId;
                        if (str5 != null && c69758Vuv2.A02.getBoolean(AnonymousClass001.A0R(str5, "user_remote_setting_migration_completed"), false)) {
                            c69451Vna.A05.A08(c69451Vna.A04);
                            return false;
                        }
                        if (C54P.A01(c69758Vuv2.A00, userSession2)) {
                            str4 = "on";
                        } else {
                            str4 = "off";
                        }
                        c69451Vna.A05.A07(3, "remote_setting_migration", str4, c69451Vna.A04);
                        return false;
                    }
                    boolean A1N = AbstractC167007dF.A1N(c69451Vna.A0A.checkCallingOrSelfPermission("android.permission.READ_CONTACTS"));
                    C69758Vuv c69758Vuv3 = c69451Vna.A07;
                    boolean A013 = C54P.A01(c69758Vuv3.A00, c69758Vuv3.A01);
                    long A00 = c69758Vuv3.A00();
                    WUU wuu = c69451Vna.A06;
                    if (A013 == A1R) {
                        str = "on";
                    } else {
                        str = "off";
                    }
                    wuu.A04(str, "", c69451Vna.A04, A00, A1N);
                    wuu.A05("background_job_new_protocol", "start_background_job", null, "");
                    C69527Vqr c69527Vqr2 = wuu.A00;
                    C69690Vtg A002 = c69527Vqr2.A00("mlite_ccu_background_job_funnel");
                    C19280xC c19280xC = A002.A00;
                    c19280xC.A0C("background_event_name", "start_background_job");
                    c19280xC.A0C("family_device_id", "");
                    A002.A00();
                    WGO wgo = c69451Vna.A05;
                    if (wgo.A0D) {
                        str2 = "exit_background_job";
                        str3 = "ccu_is_running";
                    } else if (!A1N) {
                        str2 = "exit_background_job";
                        str3 = "no_os_permission";
                    } else if (!A013) {
                        str2 = "exit_background_job";
                        str3 = "no_app_permission";
                    } else if (System.currentTimeMillis() - A00 < c69451Vna.A04) {
                        str2 = "exit_background_job";
                        str3 = "time_interval";
                    } else {
                        wuu.A05("background_job_new_protocol", "start_contact_upload", "time_interval", "");
                        C69690Vtg A003 = c69527Vqr2.A00("mlite_ccu_background_job_funnel");
                        C19280xC c19280xC2 = A003.A00;
                        c19280xC2.A0C("background_event_name", "start_contact_upload");
                        c19280xC2.A0C("family_device_id", "");
                        A003.A00();
                        wgo.A06();
                    }
                    wuu.A05("background_job_new_protocol", str2, str3, "");
                    C69690Vtg A004 = c69527Vqr2.A00("mlite_ccu_background_job_funnel");
                    C19280xC c19280xC3 = A004.A00;
                    c19280xC3.A0C("background_event_name", str3);
                    c19280xC3.A0C("family_device_id", "");
                    A004.A00();
                    return false;
                }
                return false;
            } catch (Exception e) {
                C0w9.A07("CCUJobService#onStartJob", e);
                xal.onFinish();
                return false;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
