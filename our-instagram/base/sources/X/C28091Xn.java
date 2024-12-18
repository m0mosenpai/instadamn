package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1Xn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28091Xn {
    public static final Comparator A0A = new Comparator() { // from class: X.1Xo
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return ((Long) ((Map.Entry) obj2).getValue()).compareTo((Long) ((Map.Entry) obj).getValue());
        }
    };
    public boolean A00;
    public int A02;
    public SharedPreferences A03;
    public boolean A04;
    public final int A05;
    public final Context A07;
    public final UserSession A08;
    public final String A09;
    public final Map A06 = new HashMap(50);
    public int A01 = 0;

    public static void A00(C28091Xn c28091Xn) {
        if (c28091Xn.A03 == null) {
            synchronized (c28091Xn) {
                SharedPreferences sharedPreferences = c28091Xn.A07.getSharedPreferences(c28091Xn.A09, 0);
                c28091Xn.A03 = sharedPreferences;
                java.util.Set<String> stringSet = sharedPreferences.getStringSet("seen_ids", new HashSet());
                if (stringSet != null) {
                    for (String str : stringSet) {
                        String[] split = str.split("\\|");
                        String str2 = str.split("\\|")[0];
                        long j = 0;
                        if (split.length > 1) {
                            try {
                                j = Long.parseLong(split[1]);
                            } catch (NumberFormatException e) {
                                C0w9.A06("PreferencesSeenStore", "Error parsing long from SharedPreferences", e);
                            }
                        }
                        c28091Xn.A06.put(str2, Long.valueOf(j));
                    }
                }
            }
        }
    }

    public final synchronized boolean A02(String str) {
        boolean z;
        A00(this);
        z = false;
        if (this.A06.put(str, Long.valueOf(System.currentTimeMillis() / 1000)) == null) {
            z = true;
        }
        if (this.A04) {
            A01(this, this.A00);
        }
        int i = this.A02;
        if (i > 0) {
            int i2 = this.A01;
            this.A01 = i2 + 1;
            if (i2 > i) {
                this.A01 = 0;
                A01(this, this.A00);
            }
        }
        return z;
    }

    public final synchronized boolean A03(String str) {
        A00(this);
        return this.A06.containsKey(str);
    }

    public static void A01(C28091Xn c28091Xn, boolean z) {
        HashSet hashSet;
        SharedPreferences sharedPreferences = c28091Xn.A03;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            synchronized (c28091Xn) {
                Map map = c28091Xn.A06;
                int size = map.size();
                int i = c28091Xn.A05;
                hashSet = new HashSet(Math.min(size, i));
                ArrayList arrayList = new ArrayList(map.entrySet());
                Collections.sort(arrayList, A0A);
                Iterator it = arrayList.iterator();
                for (int i2 = 0; it.hasNext() && i2 < i; i2++) {
                    Map.Entry entry = (Map.Entry) it.next();
                    StringBuilder sb = new StringBuilder();
                    sb.append((String) entry.getKey());
                    sb.append("|");
                    sb.append(entry.getValue());
                    hashSet.add(sb.toString());
                    it.remove();
                }
            }
            SharedPreferences.Editor putStringSet = edit.putStringSet("seen_ids", hashSet);
            if (z) {
                putStringSet.commit();
            } else {
                putStringSet.apply();
            }
        }
    }

    public C28091Xn(Context context, UserSession userSession, String str, int i) {
        this.A07 = context.getApplicationContext();
        this.A09 = AnonymousClass001.A0g(userSession.userId, "_", str);
        this.A05 = i;
        this.A08 = userSession;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A00 = C18U.A06(c06090Tz, userSession, 36328057459457146L);
        this.A02 = Long.valueOf(C18U.A01(c06090Tz, userSession, 36609532436223899L)).intValue();
        this.A04 = C18U.A06(c06090Tz, userSession, 36328057459391609L);
    }
}
