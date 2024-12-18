package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public abstract class T1G implements InterfaceC65232TgO {
    public final String A00;
    public final HashMap A01 = AbstractC166987dD.A1G();

    public final synchronized Object A01(InterfaceC65497TlL interfaceC65497TlL) {
        HashMap hashMap;
        try {
            hashMap = this.A01;
            if (!hashMap.containsKey(interfaceC65497TlL)) {
                hashMap.put(interfaceC65497TlL, interfaceC65497TlL.CEb().newInstance());
            }
        } catch (Exception e) {
            throw AbstractC58318PtA.A0e(String.format("Incorrect usage for %s type %s", interfaceC65497TlL.BKd(), interfaceC65497TlL.CEb()), e);
        }
        return hashMap.get(interfaceC65497TlL);
    }

    public final synchronized JSONObject A02(boolean z) {
        JSONObject A0q;
        boolean z2 = this instanceof C60551R6o;
        synchronized (this) {
            if (z2) {
                A0q = AbstractC31171DnF.A0q();
                Iterator A14 = AbstractC166997dE.A14(this.A01);
                long j = 0;
                while (A14.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                    switch (((EnumC61223Rij) A1K.getKey()).ordinal()) {
                        case 0:
                        case 1:
                            j += ((AtomicLong) A1K.getValue()).longValue();
                            break;
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                            if (z) {
                                A0q.putOpt(((InterfaceC65497TlL) A1K.getKey()).BKd(), Long.valueOf(((AtomicLong) A1K.getValue()).getAndSet(0L)));
                                break;
                            } else {
                                A0q.putOpt(((InterfaceC65497TlL) A1K.getKey()).BKd(), A1K.getValue());
                                continue;
                            }
                    }
                    A0q.putOpt(((InterfaceC65497TlL) A1K.getKey()).BKd(), A1K.getValue());
                }
                A0q.putOpt("mt", Long.valueOf(j));
            } else {
                A0q = AbstractC31171DnF.A0q();
                Iterator A142 = AbstractC166997dE.A14(this.A01);
                while (A142.hasNext()) {
                    Map.Entry A1K2 = AbstractC166987dD.A1K(A142);
                    A0q.putOpt(((InterfaceC65497TlL) A1K2.getKey()).BKd(), A1K2.getValue());
                }
            }
        }
        return A0q;
    }

    public final synchronized void A03(InterfaceC65497TlL interfaceC65497TlL, Object obj) {
        this.A01.put(interfaceC65497TlL, obj);
    }

    public final String toString() {
        try {
            return A02(false).toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public T1G(String str) {
        this.A00 = str;
    }

    public static void A00(InterfaceC65497TlL interfaceC65497TlL, T1G t1g) {
        ((AtomicLong) t1g.A01(interfaceC65497TlL)).incrementAndGet();
    }
}
