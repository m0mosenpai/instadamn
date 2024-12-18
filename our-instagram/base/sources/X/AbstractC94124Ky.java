package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.realtimeclient.EventRouter;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.4Ky, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC94124Ky {
    public Looper A00;
    public String A01;
    public final Handler A02;
    public final C28821aL A03;
    public final C2DS A04;

    public final void A01(C5lP c5lP) {
        C14360o3.A0B(c5lP, 0);
        for (C125205lR c125205lR : c5lP.A05) {
            C14360o3.A0B(c125205lR, 1);
            this.A03.A00(c5lP, c125205lR, new C206989Ed(this, 24), BAU.A00, true);
        }
    }

    public final void A00() {
        if (this instanceof C94114Kx) {
            C94114Kx c94114Kx = (C94114Kx) this;
            ((AbstractC94124Ky) c94114Kx).A01 = null;
            C94394Lz c94394Lz = c94114Kx.A01;
            c94394Lz.A01 = -1L;
            c94394Lz.A02 = C4M1.A02;
            c94394Lz.A00 = 0;
            c94394Lz.A0E.clear();
            c94394Lz.A0C.clear();
            Runnable runnable = c94394Lz.A03;
            if (runnable != null) {
                c94394Lz.A08.removeCallbacks(runnable);
            }
            c94394Lz.A03 = null;
            return;
        }
        this.A01 = null;
    }

    public final void A02(List list) {
        String str;
        Map A0E;
        String str2;
        String str3;
        if (this instanceof C94114Kx) {
            C94114Kx c94114Kx = (C94114Kx) this;
            C14360o3.A0B(list, 0);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C5lP c5lP = (C5lP) it.next();
                C94394Lz c94394Lz = c94114Kx.A01;
                boolean z = false;
                if (((AbstractC94124Ky) c94114Kx).A01 != null) {
                    z = true;
                }
                C14360o3.A0B(c5lP, 0);
                Long l = c5lP.A02;
                C006802i c006802i = c94394Lz.A0B.A00;
                c006802i.markerStart(991103806);
                if (c5lP.A05.isEmpty()) {
                    str = "empty_delta";
                } else {
                    C125205lR c125205lR = (C125205lR) AbstractC001800i.A0O(c5lP.A05, 0);
                    C94114Kx c94114Kx2 = c94394Lz.A0A.A00;
                    C28821aL c28821aL = c94114Kx2.A03;
                    if (c125205lR != null) {
                        Iterator<Map.Entry<String, C4L3>> it2 = c28821aL.A01.entrySet().iterator();
                        while (it2.hasNext()) {
                            A0E = EventRouter.match(it2.next().getKey(), c125205lR.A01);
                            if (A0E != null) {
                                break;
                            }
                        }
                    }
                    A0E = AbstractC06930Yk.A0E();
                    LinkedList linkedList = c94394Lz.A0C;
                    C14360o3.A0B(linkedList, 2);
                    if (c125205lR != null) {
                        String str4 = c125205lR.A01;
                        C14360o3.A06(str4);
                        c006802i.markerAnnotate(991103806, "incoming_delta_path", str4);
                        if (l == null || (str3 = l.toString()) == null) {
                            str3 = "null";
                        }
                        c006802i.markerAnnotate(991103806, "incoming_tq_seq_id", str3);
                        c006802i.markerAnnotate(991103806, "previous_delta_tq_seq_ids", (String[]) linkedList.toArray(new String[0]));
                        String str5 = (String) A0E.get(RealtimeProtocol.THREAD_ID);
                        if (str5 != null) {
                            c006802i.markerAnnotate(991103806, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str5);
                        }
                        String str6 = (String) A0E.get(RealtimeProtocol.ITEM_ID);
                        if (str6 != null) {
                            c006802i.markerAnnotate(991103806, "item_id", str6);
                        }
                    }
                    if (l != null && c94394Lz.A00 < c94394Lz.A06 && z) {
                        if (C18U.A06(C06090Tz.A05, c94394Lz.A09, 36315846866898563L)) {
                            long longValue = l.longValue();
                            long j = c94394Lz.A01;
                            if (longValue <= j) {
                                str = "delta_before_current_seq_id";
                            } else if (j != -1 && longValue != j + 1) {
                                if (longValue - j >= c94394Lz.A04) {
                                    C94394Lz.A00(C4M3.A02, c94394Lz, c5lP);
                                    str2 = "gap_tolerance_exceeded";
                                } else {
                                    C94394Lz.A00(C4M3.A03, c94394Lz, c5lP);
                                    str2 = "hole_detected";
                                }
                                c006802i.markerAnnotate(991103806, "event", str2);
                                c006802i.markerEnd(991103806, (short) 2);
                                int i = c94394Lz.A05;
                                if (i > 0) {
                                    while (linkedList.size() >= i) {
                                        linkedList.removeFirst();
                                    }
                                    linkedList.add(String.valueOf(longValue));
                                }
                            } else {
                                c94394Lz.A01 = longValue;
                                C94394Lz.A00(C4M3.A06, c94394Lz, c5lP);
                                int i2 = c94394Lz.A05;
                                if (i2 > 0) {
                                    while (linkedList.size() >= i2) {
                                        linkedList.removeFirst();
                                    }
                                    linkedList.add(String.valueOf(longValue));
                                }
                                str = "message_in_order";
                            }
                        }
                    }
                    c94114Kx2.A01(c5lP);
                    str = "null_seq_id";
                }
                c006802i.markerAnnotate(991103806, "event", str);
                c006802i.markerEnd(991103806, (short) 2);
            }
            return;
        }
        C14360o3.A0B(list, 0);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            A01((C5lP) it3.next());
        }
    }

    public AbstractC94124Ky(UserSession userSession) {
        this.A00 = ((C4HD) userSession.A01(C4HC.class, C4HE.A00)).A02();
        this.A04 = AbstractC28761aE.A00(userSession);
        final Looper looper = this.A00;
        this.A02 = new Handler(looper) { // from class: X.4Kz
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C14360o3.A0B(message, 0);
                if (message.what == 1) {
                    AbstractC94124Ky abstractC94124Ky = this;
                    Object obj = message.obj;
                    C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<com.instagram.direct.realtime.shared.RealtimeSyncMessage>");
                    abstractC94124Ky.A02((List) obj);
                }
            }
        };
        this.A03 = C4L0.A00(userSession);
    }
}
