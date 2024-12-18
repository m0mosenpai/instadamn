package X;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.1B4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1B4 extends C1B5 implements C1B6, InterfaceC23181Ax, InterfaceC12870lZ {
    public static C1B4 A07;
    public C1B8 A00;
    public final C23111Aq A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;

    @Override // X.C1B6
    public final C1MU AJx(C1B1 c1b1) {
        C1MU c1mu;
        C14360o3.A0B(c1b1, 0);
        String A00 = c1b1.A00();
        switch (A00.hashCode()) {
            case -800334406:
                if (!A00.equals("master_slave")) {
                    return null;
                }
                c1mu = (C23485Ab0) this.A03.getValue();
                break;
            case 101264299:
                if (!A00.equals("eviction.v2")) {
                    return null;
                }
                c1mu = (C1MS) this.A02.getValue();
                break;
            case 1738660166:
                if (!A00.equals("stale_removal")) {
                    return null;
                }
                c1mu = (C23484Aaz) this.A05.getValue();
                break;
            case 1934313696:
                if (!A00.equals("user_scope")) {
                    return null;
                }
                c1mu = (C25481Mc) this.A06.getValue();
                break;
            default:
                return null;
        }
        return c1mu;
    }

    @Override // X.C1B6
    public final void DwH(C1F9 c1f9, C1B1 c1b1) {
        C14360o3.A0B(c1b1, 1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.1B8] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.1B7] */
    public C1B4(C23111Aq c23111Aq) {
        C23191Ay c23191Ay;
        Context context = c23111Aq.A05;
        ?? obj = new Object();
        C14360o3.A0B(context, 0);
        synchronized (C23191Ay.class) {
            c23191Ay = C23191Ay.A03;
            if (c23191Ay == null) {
                c23191Ay = new C23191Ay(context);
                C23191Ay.A03 = c23191Ay;
            }
        }
        super.A00 = c23191Ay;
        super.A01 = this;
        super.A02 = obj;
        final ?? obj2 = new Object();
        obj2.A01 = this;
        obj2.A00 = new C1B9(context);
        obj2.A02 = new Comparator() { // from class: X.1BA
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(Object obj3, Object obj4) {
                throw new IllegalStateException("Two plugins with the same ordering provided");
            }
        };
        this.A00 = obj2;
        this.A01 = c23111Aq;
        this.A04 = AbstractC09440dt.A00(EnumC09460dv.A02, C1BB.A00);
        this.A03 = AbstractC09440dt.A01(new C9E0(this, 7));
        this.A02 = AbstractC09440dt.A01(new C9E0(this, 6));
        this.A05 = AbstractC09440dt.A01(new C9E0(this, 8));
        this.A06 = AbstractC09440dt.A01(new C9E0(this, 9));
    }

    public static final void A00(C1B4 c1b4) {
        String absolutePath;
        ((C1MS) c1b4.A02.getValue()).A02();
        C23485Ab0 c23485Ab0 = (C23485Ab0) c1b4.A03.getValue();
        Iterator it = c23485Ab0.A02.entrySet().iterator();
        while (it.hasNext()) {
            c23485Ab0.A01.A04(C05F.A00).execute(new RunnableC24575AuW(c23485Ab0, (Map.Entry) it.next()));
        }
        C23484Aaz c23484Aaz = (C23484Aaz) c1b4.A05.getValue();
        HashMap hashMap = new HashMap();
        C1MX c1mx = c23484Aaz.A00;
        for (Map.Entry entry : c1mx.A00().entrySet()) {
            String str = (String) entry.getKey();
            JSONObject jSONObject = (JSONObject) entry.getValue();
            if (!TextUtils.isEmpty(str)) {
                C14360o3.A0B(jSONObject, 0);
                long optLong = jSONObject.optLong("stale_age_s", -1L);
                if (optLong < 0) {
                    c1mx.A01(str);
                } else {
                    C1FC c1fc = new C1FC(optLong, jSONObject.optBoolean("is_itemized", false));
                    String optString = jSONObject.optString("feature_name");
                    if (TextUtils.isEmpty(optString)) {
                        optString = "n/a";
                    }
                    hashMap.put(str, new C214099e8(c1fc, optString, jSONObject.optLong("usage_timestamp_s", -1L)));
                }
            }
        }
        int[] A05 = AbstractC23201Az.A05();
        int i = 0;
        do {
            int i2 = A05[i];
            String A04 = AbstractC23201Az.A04(i2);
            C1FC A01 = AbstractC23201Az.A01(i2);
            if (A01 != null && A04 != null && !A01.A01) {
                for (File file : new C23891Ez(c23484Aaz.A01).A02(null, i2).keySet()) {
                    try {
                        absolutePath = file.getCanonicalPath();
                    } catch (IOException unused) {
                        absolutePath = file.getAbsolutePath();
                    }
                    if (!hashMap.containsKey(absolutePath)) {
                        hashMap.put(absolutePath, new C214099e8(A01, A04, -1L));
                    }
                }
            }
            i++;
        } while (i < 146);
        for (Map.Entry entry2 : hashMap.entrySet()) {
            String str2 = (String) entry2.getKey();
            C214099e8 c214099e8 = (C214099e8) entry2.getValue();
            File file2 = new File(str2);
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            long j = c214099e8.A00;
            if (j <= 0) {
                j = file2.lastModified() / 1000;
            }
            if (j <= 0 || currentTimeMillis >= j) {
                if (j > 0) {
                    long j2 = j + ((C1FC) ((C1UW) c214099e8).A00).A00;
                    if (j2 > 0 && j2 < currentTimeMillis) {
                        c23484Aaz.A01.A08.A00(file2);
                        c1mx.A01(str2);
                        file2.mkdirs();
                    }
                }
            }
        }
        C25481Mc c25481Mc = (C25481Mc) c1b4.A06.getValue();
        c25481Mc.A01.A04(C05F.A00).execute(new RunnableC24299Aq4(c25481Mc));
    }

    @Override // X.AbstractC23171Aw
    public final C23191Ay A01() {
        return new C23891Ez(this.A01);
    }

    @Override // X.InterfaceC23181Ax
    public final String Bqg() {
        return this.A01.A01().A01;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-1111251309);
        if (((Boolean) AbstractC15930qn.A02.A01.invoke()).booleanValue()) {
            AbstractC23641Du.A05(C12L.A00.CPG(1210717538, 3), new PYX(this, null, 4), (C19L) this.A04.getValue());
        } else {
            A00(this);
        }
        C0f9.A0A(574011130, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(784069419, C0f9.A03(223587803));
    }
}
