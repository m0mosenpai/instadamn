package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2kr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57782kr extends AbstractC57542kT {
    public int A00;
    public C57802kt A01;
    public final C25301Lk A02;
    public final Map A03;
    public final java.util.Set A04;

    public static synchronized C57782kr A00(UserSession userSession) {
        C57782kr c57782kr;
        synchronized (C57782kr.class) {
            C57502kP A00 = AbstractC57492kO.A00(userSession);
            c57782kr = (C57782kr) ((AbstractC57542kT) A00.A04.get(C57782kr.class));
            if (c57782kr == null) {
                c57782kr = new C57782kr(new C25301Lk(AbstractC12290kX.A00, new InterfaceC25281Li() { // from class: X.2ks
                    @Override // X.InterfaceC25281Li
                    public final /* bridge */ /* synthetic */ String EOt(Object obj) {
                        C94964Pd c94964Pd = (C94964Pd) obj;
                        StringWriter stringWriter = new StringWriter();
                        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                        A0A.A0d();
                        if (c94964Pd.A00 != null) {
                            A0A.A0r("pending_clips_seen_states");
                            A0A.A0d();
                            for (Map.Entry entry : c94964Pd.A00.entrySet()) {
                                if (!C16V.A04(A0A, entry)) {
                                    C57802kt c57802kt = (C57802kt) entry.getValue();
                                    A0A.A0d();
                                    String str = c57802kt.A00;
                                    if (str != null) {
                                        A0A.A0S(TraceFieldType.RequestID, str);
                                    }
                                    if (c57802kt.A02 != null) {
                                        C16V.A03(A0A, "seen_clip_ids");
                                        for (String str2 : c57802kt.A02) {
                                            if (str2 != null) {
                                                A0A.A0u(str2);
                                            }
                                        }
                                        A0A.A0Z();
                                    }
                                    if (c57802kt.A01 != null) {
                                        A0A.A0r("blend_impressions");
                                        A0A.A0d();
                                        for (Map.Entry entry2 : c57802kt.A01.entrySet()) {
                                            if (!C16V.A04(A0A, entry2)) {
                                                A0A.A0u((String) entry2.getValue());
                                            }
                                        }
                                        A0A.A0a();
                                    }
                                    A0A.A0a();
                                }
                            }
                            A0A.A0a();
                        }
                        A0A.A0a();
                        A0A.close();
                        return stringWriter.toString();
                    }

                    @Override // X.InterfaceC25281Li
                    public final /* bridge */ /* synthetic */ Object E3T(String str) {
                        return AbstractC116255Oe.parseFromJson(C16V.A00(str));
                    }
                }, 1000143069), userSession);
                A00.A03(c57782kr, C57782kr.class);
            }
        }
        return c57782kr;
    }

    public final ArrayList A0L() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.A03.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll(((C57802kt) it.next()).A02);
        }
        arrayList.addAll(this.A01.A02);
        return arrayList;
    }

    public final HashMap A0M() {
        HashMap hashMap = new HashMap();
        Iterator it = this.A03.values().iterator();
        while (it.hasNext()) {
            hashMap.putAll(((C57802kt) it.next()).A01);
        }
        hashMap.putAll(this.A01.A01);
        return hashMap;
    }

    public final void A0N() {
        C57802kt c57802kt = this.A01;
        UserSession userSession = super.A02;
        C1ON A01 = c57802kt.A01(userSession);
        if (this.A01.A00() != 0) {
            C57802kt c57802kt2 = this.A01;
            String str = c57802kt2.A00;
            A01.A00 = new C37424Ge4(this, str);
            this.A03.put(str, c57802kt2);
            this.A01 = new C57802kt();
            AbstractC57492kO.A00(userSession).A02(A01);
        }
    }

    public final void A0O(String str, String str2) {
        boolean contains = this.A04.contains(str);
        boolean contains2 = A0L().contains(str);
        if (!contains && !contains2) {
            C57802kt c57802kt = this.A01;
            if (str2 != null) {
                HashSet hashSet = new HashSet();
                if (c57802kt.A01.containsKey(str2)) {
                    hashSet.addAll(Arrays.asList(((String) c57802kt.A01.get(str2)).split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1)));
                }
                hashSet.add(str);
                c57802kt.A01.put(str2, AbstractC93184Fu.A00(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, hashSet));
            } else {
                c57802kt.A02.add(str);
            }
            if (this.A01.A00() >= C18U.A01(C06090Tz.A05, super.A02, 36612006333127006L)) {
                A0N();
            }
        }
        if (this.A00 != A0L().size()) {
            A0A();
        }
    }

    public C57782kr(C25301Lk c25301Lk, UserSession userSession) {
        super(userSession);
        this.A04 = new HashSet();
        this.A00 = 0;
        this.A03 = new ConcurrentHashMap();
        this.A02 = c25301Lk;
        this.A01 = new C57802kt();
    }
}
