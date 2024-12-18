package X;

import android.content.SharedPreferences;
import android.util.Base64;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.base.Strings;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Vmp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69405Vmp {
    public long A00;
    public Integer A01;
    public final AbstractC95374Qx A02;
    public final C214189eI A03;
    public final Object A04;
    public final ArrayList A05;
    public final Map A06;
    public final Executor A07;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public C69405Vmp(C62688SMc c62688SMc, C69518Vqh c69518Vqh, AbstractC95374Qx abstractC95374Qx, String str, Executor executor, long j, boolean z, boolean z2) {
        ?? r10;
        List list;
        HashMap hashMap = new HashMap();
        this.A06 = hashMap;
        this.A05 = new ArrayList();
        this.A04 = new Object();
        this.A01 = C05F.A00;
        this.A02 = abstractC95374Qx;
        this.A07 = executor;
        C200148tJ c200148tJ = new C200148tJ();
        c200148tJ.A01(10L);
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (z2) {
            timeUnit.getClass();
            long j2 = c200148tJ.A02;
            C18C.A06(j2, "refresh was already set to %s ns", AbstractC167007dF.A1N((j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1))));
            if (j > 0) {
                c200148tJ.A02 = timeUnit.toNanos(j);
            } else {
                throw new IllegalArgumentException(Strings.A00("duration must be positive: %s %s", Long.valueOf(j), timeUnit));
            }
        } else {
            c200148tJ.A02(j, timeUnit);
        }
        C18C.A0F(AbstractC25229BEm.A1Z(c200148tJ.A04));
        c200148tJ.A04 = abstractC95374Qx;
        C70559Wcs c70559Wcs = new C70559Wcs(c69518Vqh);
        C18C.A0F(AbstractC25229BEm.A1Z(c200148tJ.A05));
        c200148tJ.A05 = c70559Wcs;
        this.A03 = new C214189eI(c200148tJ, new C67781Uy6(this, c62688SMc, c69518Vqh, abstractC95374Qx, executor, j));
        if (z) {
            long A00 = abstractC95374Qx.A00();
            SharedPreferences sharedPreferences = c69518Vqh.A00.getSharedPreferences("act_dns_cache", 0);
            C14360o3.A07(sharedPreferences);
            Map<String, ?> all = sharedPreferences.getAll();
            if (all != null && !all.isEmpty()) {
                HashMap hashMap2 = new HashMap();
                Iterator A15 = AbstractC166997dE.A15(all);
                while (A15.hasNext()) {
                    Map.Entry entry = (Map.Entry) A15.next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    C14360o3.A0C(key, "null cannot be cast to non-null type kotlin.String");
                    C14360o3.A0C(value, "null cannot be cast to non-null type kotlin.String");
                    hashMap2.put(key, value);
                }
                Iterator A14 = AbstractC166997dE.A14(hashMap2);
                while (A14.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) A14.next();
                    String str2 = (String) entry2.getKey();
                    String str3 = (String) entry2.getValue();
                    long j3 = A00;
                    C14360o3.A0B(str2, 1);
                    if (str3 != null && str3.length() != 0) {
                        try {
                            int A04 = AbstractC001900j.A04(str3, ';', 0);
                            if (A04 != -1) {
                                long parseLong = Long.parseLong(AbstractC25227BEk.A0w(str3, 0, A04));
                                j3 = parseLong <= A00 ? parseLong : j3;
                                String substring = str3.substring(A04 + 1);
                                C14360o3.A07(substring);
                                if (substring.length() == 0) {
                                    r10 = C16930sl.A00;
                                } else {
                                    List A0h = AbstractC31175DnJ.A0h(substring, ";");
                                    if (!A0h.isEmpty()) {
                                        ListIterator listIterator = A0h.listIterator(A0h.size());
                                        while (listIterator.hasPrevious()) {
                                            if (((String) listIterator.previous()).length() != 0) {
                                                list = AbstractC001800i.A0d(A0h, listIterator.nextIndex() + 1);
                                                break;
                                            }
                                        }
                                    }
                                    list = C16930sl.A00;
                                    String[] A1b = AbstractC31173DnH.A1b(list, 0);
                                    r10 = new ArrayList(A1b.length);
                                    for (String str4 : A1b) {
                                        try {
                                            try {
                                                byte[] decode = Base64.decode(str4, 3);
                                                C14360o3.A07(decode);
                                                InetAddress byAddress = InetAddress.getByAddress(str2, decode);
                                                C14360o3.A0A(byAddress);
                                                r10.add(byAddress);
                                            } catch (IllegalArgumentException unused) {
                                                throw new UnknownHostException("Failed to decodeSingleAddress an InetAddress");
                                                break;
                                            }
                                        } catch (UnknownHostException unused2) {
                                        }
                                    }
                                }
                                hashMap.put(str2, new C68913VeD(r10, j3));
                            } else {
                                continue;
                            }
                        } catch (Exception unused3) {
                            continue;
                        }
                    }
                }
            }
            hashMap.size();
        }
        for (String str5 : AbstractC167007dF.A0m(str, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0)) {
            if (str5.length() != 0) {
                C68913VeD c68913VeD = (C68913VeD) this.A06.remove(str5);
                if (c68913VeD != null) {
                    this.A03.A00.put(str5, c68913VeD.A01);
                }
                this.A07.execute(new RunnableC71418Wtg(this, str5));
            }
        }
    }
}
