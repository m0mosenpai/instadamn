package X;

import android.os.Bundle;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.privacy.zone.policy.ZonePolicy;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.QEr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58881QEr extends AbstractC63223SfY implements BEG, InterfaceC65639Tq2, InterfaceC65638Tq1 {
    public QF6 A00;
    public boolean A01;
    public final C62618SJa A04;
    public final MessageDigest A05;
    public final Map A08;
    public final Map A09;
    public final Map A0A;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final List A0H = AbstractC166987dD.A1E();
    public final List A06 = AbstractC166987dD.A1E();
    public final Map A0B = AbstractC166987dD.A1G();
    public final Map A07 = AbstractC166987dD.A1G();
    public final C23101AGn A03 = new C23101AGn();
    public boolean A02 = false;
    public final Map A0C = AbstractC166987dD.A1G();

    public static void A00(C58881QEr c58881QEr) {
        HashMap hashMap;
        HashSet hashSet;
        HashSet hashSet2;
        Bundle bundle;
        if (!c58881QEr.A02) {
            HashMap A1G = AbstractC166987dD.A1G();
            C23101AGn c23101AGn = c58881QEr.A03;
            java.util.Set set = c23101AGn.A02;
            synchronized (set) {
                hashMap = new HashMap(c23101AGn.A00);
            }
            Iterator A15 = AbstractC166997dE.A15(hashMap);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                A1G.put(A1K.getKey(), AbstractC31171DnF.A0V(AbstractC43593JPy.A04(A1K)));
            }
            C62618SJa c62618SJa = c58881QEr.A04;
            List list = c58881QEr.A0H;
            C14360o3.A0B(list, 0);
            c62618SJa.A06 = list;
            List list2 = c58881QEr.A06;
            C14360o3.A0B(list2, 0);
            c62618SJa.A05 = list2;
            synchronized (set) {
                hashSet = new HashSet(set);
            }
            c62618SJa.A0E = hashSet;
            c62618SJa.A0C = A1G;
            synchronized (set) {
                hashSet2 = new HashSet(c23101AGn.A01);
            }
            c62618SJa.A0D = hashSet2;
            c62618SJa.A0F = c58881QEr.A01;
            Map map = c58881QEr.A0B;
            C14360o3.A0B(map, 0);
            c62618SJa.A07 = map;
            Map map2 = c58881QEr.A07;
            C14360o3.A0B(map2, 0);
            c62618SJa.A08 = map2;
            c62618SJa.A09 = c58881QEr.A08;
            c62618SJa.A0B = c58881QEr.A0A;
            c62618SJa.A0A = c58881QEr.A09;
            c58881QEr.A02 = true;
            C63305ShB A00 = C63305ShB.A00();
            Map singletonMap = Collections.singletonMap("INTEGRITY_LOGGER", new C64521THo(c62618SJa));
            InterfaceC172717mh interfaceC172717mh = ((AbstractC63223SfY) c58881QEr).A03;
            ZonePolicy zonePolicy = null;
            if (interfaceC172717mh == null) {
                bundle = null;
            } else {
                BrowserLiteFragment browserLiteFragment = (BrowserLiteFragment) interfaceC172717mh;
                bundle = browserLiteFragment.A09;
                zonePolicy = browserLiteFragment.A0f;
            }
            C63305ShB.A02(new C58860QDb(bundle, A00, zonePolicy, singletonMap), A00, false);
        }
    }

    public C58881QEr(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        MessageDigest messageDigest;
        C62618SJa c62618SJa = new C62618SJa();
        this.A04 = c62618SJa;
        this.A08 = AbstractC166987dD.A1G();
        this.A0A = AbstractC166987dD.A1G();
        this.A09 = AbstractC166987dD.A1G();
        C14360o3.A0B(str, 0);
        c62618SJa.A01 = str;
        this.A01 = false;
        this.A0E = z;
        this.A0F = z2;
        this.A0D = z3;
        this.A0G = z4;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
            messageDigest = null;
        }
        this.A05 = messageDigest;
    }
}
