package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.5u6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130015u6 implements InterfaceC130025u7 {
    public InterfaceC130025u7 A00 = C130035u8.A00;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.6Ra, java.lang.Object] */
    public final void A00(boolean z) {
        InterfaceC130025u7 interfaceC130025u7;
        if (z) {
            final ?? obj = new Object();
            interfaceC130025u7 = new InterfaceC130025u7(obj) { // from class: X.6Rb
                public final C6Ra A00;

                @Override // X.InterfaceC130025u7
                public final void Chv(C6PB c6pb) {
                    String str;
                    C14360o3.A0B(c6pb.A00, 0);
                    if (C0K8.A01.isLoggable(3)) {
                        StringBuilder sb = new StringBuilder();
                        if (c6pb.A01.intValue() != 0) {
                            str = "Bloks";
                        } else {
                            str = "Native";
                        }
                        sb.append(AnonymousClass001.A0E(str, '[', ']'));
                        sb.append(AnonymousClass001.A0E(c6pb.A03, '[', ']'));
                        sb.append(AnonymousClass001.A0E(c6pb.A02, '[', ']'));
                        Iterator it = c6pb.A04.iterator();
                        while (it.hasNext()) {
                            sb.append(AnonymousClass001.A0E((String) it.next(), '[', ']'));
                        }
                        sb.append(AnonymousClass001.A0D((String) c6pb.A06.invoke(), ' '));
                        Map map = c6pb.A05;
                        if (!map.isEmpty()) {
                            sb.append(" extras=[");
                        }
                        for (Map.Entry entry : map.entrySet()) {
                            String str2 = (String) entry.getKey();
                            Object value = entry.getValue();
                            C14360o3.A0B(str2, 0);
                            if (!str2.equals("SRLog#errorKey")) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append('{');
                                sb2.append(str2);
                                sb2.append('=');
                                sb2.append(value);
                                sb2.append('}');
                                sb.append(sb2.toString());
                            }
                        }
                        if (!map.isEmpty()) {
                            sb.append("]");
                        }
                        C14360o3.A07(sb.toString());
                    }
                }

                {
                    this.A00 = obj;
                }
            };
        } else {
            interfaceC130025u7 = C130035u8.A00;
        }
        this.A00 = interfaceC130025u7;
    }

    @Override // X.InterfaceC130025u7
    public final void Chv(C6PB c6pb) {
        this.A00.Chv(c6pb);
    }
}
