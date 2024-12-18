package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.6Fq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136376Fq {
    public AnonymousClass632 A00;
    public C63162tt A01;
    public final C6FD A02;
    public final C136386Fr A03;
    public final C136386Fr A04;
    public final C1339162z A05;
    public final Map A0A;
    public final Map A0B;
    public final java.util.Set A0D;
    public final InterfaceC103074ki A0E;
    public final String A0F;
    public final List A07 = new ArrayList();
    public final Map A09 = new HashMap();
    public final HashMap A06 = new HashMap();
    public final Map A0C = new HashMap();
    public final List A08 = new ArrayList();

    public final C6FQ A00(C102884kP c102884kP, InterfaceC136406Ft interfaceC136406Ft, InterfaceC103384lE interfaceC103384lE) {
        List list = c102884kP.A0A;
        Map map = this.A09;
        AnonymousClass632 anonymousClass632 = this.A00;
        Map map2 = this.A0C;
        InterfaceC103074ki interfaceC103074ki = this.A0E;
        return new C6FQ(null, null, null, anonymousClass632, interfaceC136406Ft, this.A01, interfaceC103384lE, interfaceC103074ki, C05F.A00, this.A0F, null, list, map, map2);
    }

    public C136376Fq(AnonymousClass632 anonymousClass632, C6FD c6fd, C6AV c6av, C63162tt c63162tt, C1339162z c1339162z, InterfaceC103074ki interfaceC103074ki, String str, Map map) {
        this.A0E = interfaceC103074ki;
        this.A0A = map;
        this.A01 = c63162tt;
        this.A0F = str;
        this.A00 = anonymousClass632;
        this.A02 = c6fd;
        this.A05 = c1339162z;
        if (c6av != null) {
            C136386Fr c136386Fr = c6av.A00;
            this.A04 = new C136386Fr(c136386Fr);
            this.A03 = c136386Fr;
            this.A0B = c6av.A07;
            this.A0D = new HashSet();
            for (Map.Entry entry : c6av.A06.entrySet()) {
                Object key = entry.getKey();
                if (!C6AO.A00(entry.getValue(), anonymousClass632.A08.get(key))) {
                    this.A0D.add(key);
                }
            }
            return;
        }
        this.A04 = new C136386Fr(null);
        this.A03 = new C136386Fr(null);
        this.A0B = Collections.emptyMap();
    }
}
