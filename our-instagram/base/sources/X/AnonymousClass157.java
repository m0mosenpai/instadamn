package X;

import java.util.Map;

/* renamed from: X.157, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass157 {
    public static AnonymousClass157 A01;
    public final AnonymousClass150 A00;

    public final void A00(InterfaceC219914z interfaceC219914z, int i, int i2, boolean z) {
        int i3;
        AnonymousClass150 anonymousClass150 = this.A00;
        if (anonymousClass150.A00 && !(interfaceC219914z instanceof C219714x) && (interfaceC219914z instanceof AbstractC219814y)) {
            AbstractC219814y abstractC219814y = (AbstractC219814y) interfaceC219914z;
            String A03 = abstractC219814y.A03();
            C2050695w A02 = abstractC219814y.A02(i, i2);
            Integer valueOf = Integer.valueOf(i2);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(A03);
            stringBuffer.append("_");
            stringBuffer.append(i);
            stringBuffer.append("_");
            if (valueOf != null) {
                i3 = valueOf.intValue();
            } else {
                i3 = 0;
            }
            stringBuffer.append(i3);
            String obj = stringBuffer.toString();
            Map map = anonymousClass150.A01.A00;
            C2050595u c2050595u = (C2050595u) map.get(obj);
            if (c2050595u != null) {
                if (A02 != null) {
                    C2050695w c2050695w = c2050595u.A08;
                    c2050695w.A02.putAll(A02.A02);
                    c2050695w.A01.putAll(A02.A01);
                    c2050695w.A00.putAll(A02.A00);
                }
                int i4 = 2;
                if (z) {
                    i4 = 4;
                }
                try {
                    c2050595u.A00(i4);
                    anonymousClass150.CjC(c2050595u);
                    map.remove(obj);
                } catch (Throwable th) {
                    C0K8.A0L("MBLog", "Failed to end event for %s with trigger id: %d and key: %d, is timed out: %s ", th, A03, Integer.valueOf(i), valueOf, Boolean.valueOf(z));
                }
            }
        }
    }

    public AnonymousClass157(AnonymousClass150 anonymousClass150) {
        this.A00 = anonymousClass150;
    }
}
