package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.instagram.user.model.User;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Jp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93814Jp implements InterfaceC13000lm {
    public final Handler A00;
    public final C93834Jr A01;
    public final C93834Jr A02;
    public final C18A A03;
    public final java.util.Set A04;
    public final Handler.Callback A05;
    public final C25671My A06;
    public final InterfaceC41501vz A07;
    public final C93824Jq A08;

    public C93814Jp(C25671My c25671My, C93824Jq c93824Jq, C18A c18a) {
        C14360o3.A0B(c25671My, 1);
        C14360o3.A0B(c18a, 2);
        this.A06 = c25671My;
        this.A03 = c18a;
        this.A01 = new C93834Jr();
        this.A02 = new C93834Jr();
        this.A04 = new HashSet();
        this.A08 = c93824Jq;
        Handler.Callback callback = new Handler.Callback() { // from class: X.4Js
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                C14360o3.A0B(message, 0);
                if (message.what != 1) {
                    return false;
                }
                Object obj = message.obj;
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.presence.DirectThreadActivityController.ActivityInvalidationData");
                C47578Kzo c47578Kzo = (C47578Kzo) obj;
                C93814Jp c93814Jp = C93814Jp.this;
                C6C2 c6c2 = c47578Kzo.A00;
                C6C2 c6c22 = c47578Kzo.A01;
                C93834Jr c93834Jr = c93814Jp.A02;
                String str = c6c22.A01;
                if (str != null) {
                    c93834Jr.A02.remove(str);
                }
                C93814Jp.A00(c93814Jp, c6c2, c6c22, 0);
                return true;
            }
        };
        this.A05 = callback;
        this.A00 = new Handler(Looper.getMainLooper(), callback);
        InterfaceC41501vz interfaceC41501vz = new InterfaceC41501vz() { // from class: X.4Jt
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                String str;
                String str2;
                Object remove;
                int A03 = C0f9.A03(-1688861647);
                C2Io c2Io = (C2Io) obj;
                int A032 = C0f9.A03(2118399968);
                C14360o3.A0B(c2Io, 0);
                C93814Jp c93814Jp = C93814Jp.this;
                List list = c2Io.A02;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String str3 = ((C83403nh) it.next()).A1u;
                        C14360o3.A07(str3);
                        User A02 = c93814Jp.A03.A02(str3);
                        if (A02 != null) {
                            if (A02.BTC() == null) {
                                C0w9.A03("updateActivityIndicatorOnNewMessages_nullMessagingUserFbid", "Attempting to update activity indicator for user with null interop_messaging_user_fbid");
                            }
                            str3 = A02.getId();
                            Long BTC = A02.BTC();
                            str = null;
                            if (BTC != null) {
                                str = Long.toString(BTC.longValue());
                            }
                        } else {
                            C0w9.A03("updateActivityIndicatorOnNewMessages_nullUser", "Attempting to update activity indicator for user not found in UserCache");
                            str = null;
                        }
                        C6C2 c6c2 = new C6C2(str3, str);
                        C93834Jr c93834Jr = c93814Jp.A02;
                        String str4 = c6c2.A01;
                        if ((str4 != null && (remove = c93834Jr.A02.remove(str4)) != null) || ((str2 = c6c2.A00) != null && (remove = c93834Jr.A01.remove(str2)) != null)) {
                            Handler handler = c93814Jp.A00;
                            handler.removeMessages(1, remove);
                            handler.obtainMessage(1, remove).sendToTarget();
                        }
                    }
                }
                C0f9.A0A(-495773251, A032);
                C0f9.A0A(-1056734170, A03);
            }
        };
        this.A07 = interfaceC41501vz;
        c25671My.A01(interfaceC41501vz, C2Io.class);
    }

    public static final void A00(C93814Jp c93814Jp, C6C2 c6c2, C6C2 c6c22, int i) {
        C44079Je4 c44079Je4;
        C93834Jr c93834Jr = c93814Jp.A01;
        C44079Je4 c44079Je42 = (C44079Je4) c93834Jr.A00(c6c2);
        if (c44079Je42 == null) {
            C93834Jr c93834Jr2 = new C93834Jr();
            c93834Jr2.A01(c6c22, Integer.valueOf(i));
            c44079Je4 = new C44079Je4(c6c2, c93834Jr2);
        } else {
            C14360o3.A0B(c6c22, 1);
            C93834Jr c93834Jr3 = new C93834Jr(c44079Je42.A02);
            c93834Jr3.A01(c6c22, Integer.valueOf(i));
            c44079Je4 = new C44079Je4(c44079Je42.A01, c93834Jr3);
        }
        C14360o3.A0A(c44079Je4);
        c93834Jr.A01(c6c2, c44079Je4);
        Iterator it = c93814Jp.A04.iterator();
        while (it.hasNext()) {
            ((InterfaceC50441MOv) it.next()).Dsn(c44079Je4);
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C93834Jr c93834Jr = this.A01;
        c93834Jr.A02.clear();
        c93834Jr.A01.clear();
        this.A04.clear();
        this.A06.A02(this.A07, C2Io.class);
    }
}
