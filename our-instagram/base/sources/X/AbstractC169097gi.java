package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.7gi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC169097gi {
    public static final C169127gl A00(final InterfaceC28041Xi interfaceC28041Xi, final UserSession userSession, C1GL c1gl, InterfaceC169327h6 interfaceC169327h6, final String str, final List list, boolean z) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(interfaceC169327h6, 3);
        return new C169127gl(c1gl, new InterfaceC169117gk(interfaceC28041Xi, userSession, str, list) { // from class: X.7gj
            public final C195218kN A00;
            public final /* synthetic */ InterfaceC28041Xi A01;
            public final /* synthetic */ String A02;
            public final /* synthetic */ List A03;

            @Override // X.InterfaceC169117gk
            public final Object E7Q(String str2) {
                C14360o3.A0B(str2, 0);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                C195218kN c195218kN = this.A00;
                String str3 = this.A02;
                InterfaceC28041Xi interfaceC28041Xi2 = this.A01;
                c195218kN.A08(interfaceC28041Xi2, str3, str2, linkedHashSet);
                List list2 = this.A03;
                if (list2 != null) {
                    C01L A1I = C0eM.A1I();
                    A1I.addAll(list2);
                    AbstractC169147gn.A00(interfaceC28041Xi2, str2, C0eM.A1J(A1I), linkedHashSet);
                }
                ArrayList A0U = AbstractC001800i.A0U(linkedHashSet);
                c195218kN.A09(str3, A0U);
                return new C169177gq(A0U, linkedHashSet);
            }

            {
                this.A02 = str;
                this.A03 = list;
                C195218kN A00 = C195218kN.A00(userSession);
                C14360o3.A07(A00);
                this.A00 = A00;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r3v2 */
            /* JADX WARN: Type inference failed for: r3v3, types: [X.0sl] */
            @Override // X.InterfaceC169117gk
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ java.lang.Object AIV(java.lang.Object r6, java.lang.Object r7) {
                /*
                    r5 = this;
                    java.util.List r7 = (java.util.List) r7
                    X.1Xi r4 = r5.A01
                    if (r7 != 0) goto L37
                    X.0sl r3 = X.C16930sl.A00
                L8:
                    r7 = r3
                L9:
                    if (r6 == 0) goto L5d
                    X.7gq r6 = (X.C169177gq) r6
                    X.01L r4 = X.C0eM.A1I()
                    java.util.List r0 = r6.A00
                    r4.addAll(r0)
                    java.util.ArrayList r3 = new java.util.ArrayList
                    r3.<init>()
                    java.util.Iterator r2 = r7.iterator()
                L1f:
                    boolean r0 = r2.hasNext()
                    if (r0 == 0) goto L56
                    java.lang.Object r1 = r2.next()
                    java.util.Set r0 = r6.A01
                    boolean r0 = r0.contains(r1)
                    r0 = r0 ^ 1
                    if (r0 == 0) goto L1f
                    r3.add(r1)
                    goto L1f
                L37:
                    if (r4 == 0) goto L9
                    java.util.ArrayList r3 = new java.util.ArrayList
                    r3.<init>()
                    java.util.Iterator r2 = r7.iterator()
                L42:
                    boolean r0 = r2.hasNext()
                    if (r0 == 0) goto L8
                    java.lang.Object r1 = r2.next()
                    boolean r0 = r4.apply(r1)
                    if (r0 == 0) goto L42
                    r3.add(r1)
                    goto L42
                L56:
                    r4.addAll(r3)
                    X.01L r7 = X.C0eM.A1J(r4)
                L5d:
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C169107gj.AIV(java.lang.Object, java.lang.Object):java.lang.Object");
            }

            @Override // X.InterfaceC169117gk
            public final /* bridge */ /* synthetic */ Object ARP() {
                return C16930sl.A00;
            }
        }, new C169337h7(c1gl, interfaceC169327h6, true), z, true);
    }
}
