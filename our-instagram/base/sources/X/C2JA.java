package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: X.2JA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2JA implements InterfaceC12870lZ, InterfaceC13000lm {
    public ConcurrentHashMap A00;
    public final long A01;
    public final BroadcastReceiver A02;
    public final Context A03;
    public final Handler A04;
    public final C18920wW A05;
    public final UserSession A06;
    public final C2JB A07;
    public final boolean A08;

    /* JADX WARN: Type inference failed for: r0v9, types: [X.2JB] */
    public C2JA(UserSession userSession, Context context) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(context, 2);
        this.A06 = userSession;
        this.A03 = context;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A01 = C18U.A01(c06090Tz, userSession, 36599615352606318L) * 1000;
        this.A08 = C18U.A06(c06090Tz, userSession, 36318140375767004L);
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = "firstpartyinstalltracker";
        this.A05 = c12210kP.A00();
        this.A04 = new Handler(Looper.getMainLooper());
        this.A07 = new Runnable() { // from class: X.2JB
            @Override // java.lang.Runnable
            public final void run() {
                C2JA c2ja = C2JA.this;
                for (Map.Entry entry : c2ja.A00.entrySet()) {
                    Object key = entry.getKey();
                    C40R c40r = (C40R) entry.getValue();
                    if (c40r.A09) {
                        String str = c40r.A05;
                        String str2 = c40r.A03;
                        String str3 = c40r.A06;
                        if (str3 == null) {
                            str3 = "";
                        }
                        C18920wW c18920wW = c2ja.A05;
                        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "store_conversion_v2");
                        if (A00.isSampled()) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("adid", str2);
                            hashMap.put("ei", str3);
                            String obj = new JSONObject(hashMap).toString();
                            C14360o3.A07(obj);
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("0", obj);
                            A00.AAP("installer_package_name", str);
                            A00.A9M("tracking", linkedHashMap);
                            A00.Cht();
                        }
                        c2ja.A00.remove(key);
                        C2JA.A00(c2ja);
                    }
                }
                c2ja.A04.postDelayed(this, c2ja.A01);
            }
        };
        this.A02 = new BroadcastReceiver() { // from class: X.2JC
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
                int i;
                String encodedSchemeSpecificPart;
                int A01 = C0f9.A01(-1234627363);
                C0fM.A01(this, context2, intent);
                C14360o3.A0B(context2, 0);
                C14360o3.A0B(intent, 1);
                if (!C08310bt.A02().A00(context2, intent, this)) {
                    i = 198120870;
                } else {
                    android.net.Uri data = intent.getData();
                    if (data != null && (encodedSchemeSpecificPart = data.getEncodedSchemeSpecificPart()) != null && encodedSchemeSpecificPart.length() != 0) {
                        C40R c40r = (C40R) C2JA.this.A00.get(encodedSchemeSpecificPart);
                        if (c40r == null) {
                            i = 1254226717;
                        } else {
                            c40r.A09 = true;
                            c40r.A00 = System.currentTimeMillis();
                            i = 616495469;
                        }
                    } else {
                        i = 1691740503;
                    }
                }
                C0f9.A0E(i, A01, intent);
            }
        };
        this.A00 = new ConcurrentHashMap();
    }

    public static final void A00(C2JA c2ja) {
        C1UM A00 = C1U4.A00(c2ja.A03).A00("IG_1PD_INSTALL_TRACKER_V2");
        C14360o3.A07(A00);
        C1UP c1up = (C1UP) A00;
        C1UP.A03(c1up);
        C1ZT c1zt = new C1ZT(c1up);
        c1zt.A09("encoded_app_list", C40P.A00(null, c2ja.A00));
        c1zt.A03();
    }

    public final void A01(String str, String str2, String str3, String str4) {
        this.A00.put(str, new C40R(null, str2, str, null, str3, null, str4, System.currentTimeMillis(), 0L, 0L, false, false));
        A00(this);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        if (this.A08) {
            C218914p.A06(this);
            this.A04.removeCallbacks(this.A07);
            this.A03.unregisterReceiver(this.A02);
        }
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-1255851211);
        if (this.A08) {
            A00(this);
            this.A04.removeCallbacks(this.A07);
        }
        C0f9.A0A(653008539, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(1963295800);
        if (this.A08) {
            this.A04.postDelayed(this.A07, this.A01);
        }
        C0f9.A0A(-718491838, A03);
    }
}
