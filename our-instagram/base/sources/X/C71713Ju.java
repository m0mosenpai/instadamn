package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Ju, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71713Ju implements InterfaceC13000lm {
    public final Handler A00;
    public final UserSession A01;
    public final HashSet A02;

    public C71713Ju(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = new HashSet();
        this.A00 = new Handler(Looper.getMainLooper());
    }

    public static final synchronized void A00(C006802i c006802i, C71713Ju c71713Ju, int i, short s) {
        synchronized (c71713Ju) {
            c006802i.markerEnd(974456648, i, s);
            c71713Ju.A02.remove(Integer.valueOf(i));
        }
    }

    public static final synchronized void A01(C71713Ju c71713Ju, String str) {
        synchronized (c71713Ju) {
            C006802i c006802i = C006802i.A0p;
            HashSet hashSet = c71713Ju.A02;
            Iterator it = hashSet.iterator();
            C14360o3.A07(it);
            while (it.hasNext()) {
                Object next = it.next();
                C14360o3.A07(next);
                int intValue = ((Number) next).intValue();
                C14360o3.A0A(c006802i);
                c006802i.markerAnnotate(974456648, intValue, "CANCEL_REASON", str);
            }
            c006802i.endAllInstancesOfMarker(974456648, (short) 4);
            hashSet.clear();
        }
    }

    public static final synchronized void A02(C71713Ju c71713Ju, String str) {
        synchronized (c71713Ju) {
            C006802i c006802i = C006802i.A0p;
            Iterator it = c71713Ju.A02.iterator();
            C14360o3.A07(it);
            while (it.hasNext()) {
                Object next = it.next();
                C14360o3.A07(next);
                c006802i.markerPoint(974456648, ((Number) next).intValue(), str);
            }
        }
    }

    public final synchronized void A03(AbstractC115105If abstractC115105If, C85773s6 c85773s6) {
        String localizedMessage;
        C14360o3.A0B(c85773s6, 0);
        C006802i c006802i = C006802i.A0p;
        Throwable A01 = abstractC115105If.A01();
        if (A01 != null && (localizedMessage = A01.getLocalizedMessage()) != null) {
            C14360o3.A0A(c006802i);
            c006802i.markerAnnotate(974456648, c85773s6.A03, "NETWORK_FAILURE_REASON", localizedMessage);
        }
        C40741uh c40741uh = (C40741uh) abstractC115105If.A00();
        if (c40741uh != null) {
            C14360o3.A0A(c006802i);
            c006802i.markerAnnotate(974456648, c85773s6.A03, "RESPONSE_CODE", c40741uh.mStatusCode);
        }
        C14360o3.A0A(c006802i);
        A00(c006802i, this, c85773s6.A03, (short) 3);
    }

    public final synchronized void A04(final C85773s6 c85773s6) {
        C14360o3.A0B(c85773s6, 0);
        UserSession userSession = this.A01;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36313252703045473L)) {
            int i = c85773s6.A03;
            HashSet hashSet = this.A02;
            Integer valueOf = Integer.valueOf(i);
            if (!hashSet.contains(valueOf)) {
                C006802i c006802i = C006802i.A0p;
                C14360o3.A0A(c006802i);
                c006802i.markerStart(974456648, i);
                this.A00.postDelayed(new Runnable() { // from class: X.5ND
                    @Override // java.lang.Runnable
                    public final void run() {
                        C71713Ju c71713Ju = C71713Ju.this;
                        int i2 = c85773s6.A03;
                        if (c71713Ju.A02.contains(Integer.valueOf(i2))) {
                            C006802i c006802i2 = C006802i.A0p;
                            C14360o3.A07(c006802i2);
                            C71713Ju.A00(c006802i2, c71713Ju, i2, (short) 113);
                        }
                    }
                }, C18U.A01(c06090Tz, userSession, 36594727679690570L) * 1000);
                hashSet.add(valueOf);
                c006802i.markerPoint(974456648, i, "REQUEST_SENT");
                c006802i.markerAnnotate(974456648, i, "REELS_REQUESTED", c85773s6.A05.size());
                c006802i.markerAnnotate(974456648, i, "CONTAINER_MODULE", c85773s6.A04);
                c006802i.markerAnnotate(974456648, i, "FETCH_REASON", String.valueOf(c85773s6.A02));
            }
        }
    }

    public final synchronized void A05(C85773s6 c85773s6) {
        C14360o3.A0B(c85773s6, 0);
        int i = c85773s6.A03;
        if (this.A02.contains(Integer.valueOf(i)) || !C50K.A00(this.A01).booleanValue()) {
            C006802i.A0p.markerPoint(974456648, i, "RESPONSE_RECEIVED");
        }
    }

    public final synchronized void A06(C85773s6 c85773s6, C40741uh c40741uh) {
        short s;
        Collection values;
        int i;
        int i2;
        Integer num;
        C14360o3.A0B(c85773s6, 0);
        int i3 = c85773s6.A03;
        if (this.A02.contains(Integer.valueOf(i3)) || !C50K.A00(this.A01).booleanValue()) {
            UserSession userSession = this.A01;
            C006802i c006802i = C006802i.A0p;
            c006802i.markerPoint(974456648, i3, "RESPONSE_PARSED");
            c006802i.markerAnnotate(974456648, i3, "REELS_RECEIVED", c40741uh.A03(userSession).size());
            int i4 = 0;
            if (C18U.A06(C06090Tz.A05, AbstractC25351Lp.A00(userSession).A00, 36324587121684731L)) {
                HashMap A03 = c40741uh.A03(userSession);
                C14360o3.A07(A03);
                if (A03.isEmpty()) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    for (Map.Entry entry : A03.entrySet()) {
                        Integer num2 = ((C37771pE) entry.getValue()).A18;
                        List list = ((C37771pE) entry.getValue()).A1k;
                        if (list != null) {
                            num = Integer.valueOf(list.size());
                        } else {
                            num = null;
                        }
                        if (!C14360o3.A0K(num2, num)) {
                            i2++;
                        }
                    }
                }
                c006802i.markerAnnotate(974456648, i3, "PARTIAL_REELS_RECEIVED", i2);
            }
            HashMap A032 = c40741uh.A03(userSession);
            if (A032 != null && (values = A032.values()) != null) {
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    List list2 = ((C37771pE) it.next()).A1l;
                    if (list2 != null) {
                        i = list2.size();
                    } else {
                        i = 0;
                    }
                    i4 += i;
                }
            }
            c006802i.markerAnnotate(974456648, i3, "MEDIA_IDS_RECEIVED", i4);
            c006802i.markerAnnotate(974456648, i3, "RESPONSE_CODE", c40741uh.mStatusCode);
            if (C14360o3.A0K(c40741uh.getStatus(), RealtimeConstants.SEND_FAIL)) {
                c006802i.markerAnnotate(974456648, i3, "failure_type", "SERVER");
                c006802i.markerAnnotate(974456648, i3, "NETWORK_FAILURE_REASON", "Client received a 200 response with a fail");
                s = 3;
            } else {
                s = 2;
            }
            A00(c006802i, this, i3, s);
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        A01(this, "Session Ending");
    }
}
