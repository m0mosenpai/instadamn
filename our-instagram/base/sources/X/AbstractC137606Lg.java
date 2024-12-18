package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6Lg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC137606Lg extends C59V implements InterfaceC1131559d {
    public InterfaceC119205ac A01;
    public Map A02;
    public final C59U A04;
    public long A00 = 0;
    public final C119505b7 A03 = new C119505b7(this);
    public final Map A05 = new LinkedHashMap();

    @Override // X.InterfaceC1131659e
    public abstract int Cnj(int i);

    @Override // X.InterfaceC1131659e
    public abstract int Cnm(int i);

    @Override // X.InterfaceC1131659e
    public abstract int Cpe(int i);

    @Override // X.InterfaceC1131659e
    public abstract int Cph(int i);

    public static final void A00(InterfaceC119205ac interfaceC119205ac, AbstractC137606Lg abstractC137606Lg) {
        long j;
        Map map;
        if (interfaceC119205ac != null) {
            j = AbstractC119215ad.A00(interfaceC119205ac.getWidth(), interfaceC119205ac.getHeight());
        } else {
            j = 0;
        }
        abstractC137606Lg.A0H(j);
        if (!C14360o3.A0K(abstractC137606Lg.A01, interfaceC119205ac) && interfaceC119205ac != null && (((map = abstractC137606Lg.A02) != null && !map.isEmpty()) || (!interfaceC119205ac.Aaw().isEmpty()))) {
            Map Aaw = interfaceC119205ac.Aaw();
            if (!C14360o3.A0K(Aaw, abstractC137606Lg.A02)) {
                C121665fI c121665fI = abstractC137606Lg.A04.A0H.A0U.A05;
                C14360o3.A0A(c121665fI);
                c121665fI.A0I.A04();
                Map map2 = abstractC137606Lg.A02;
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    abstractC137606Lg.A02 = map2;
                }
                map2.clear();
                map2.putAll(Aaw);
            }
        }
        abstractC137606Lg.A01 = interfaceC119205ac;
    }

    public static final void A01(AbstractC137606Lg abstractC137606Lg, long j) {
        if (abstractC137606Lg.A00 != j) {
            abstractC137606Lg.A00 = j;
            C59U c59u = abstractC137606Lg.A04;
            C121665fI c121665fI = c59u.A0H.A0U.A05;
            if (c121665fI != null) {
                c121665fI.A0M();
            }
            C59V.A0D(c59u);
        }
        if (!((C59V) abstractC137606Lg).A02) {
            C59V.A0C(abstractC137606Lg, new C119245ag(abstractC137606Lg.A0N(), abstractC137606Lg));
        }
    }

    public final long A0P(AbstractC137606Lg abstractC137606Lg) {
        long j = 0;
        AbstractC137606Lg abstractC137606Lg2 = this;
        while (!C14360o3.A0K(abstractC137606Lg2, abstractC137606Lg)) {
            j = C119235af.A01(j, abstractC137606Lg2.A00);
            C59U c59u = abstractC137606Lg2.A04.A07;
            C14360o3.A0A(c59u);
            abstractC137606Lg2 = c59u.A0V();
            C14360o3.A0A(abstractC137606Lg2);
        }
        return j;
    }

    @Override // X.InterfaceC1128957x
    public final float Awk() {
        return this.A04.Awk();
    }

    @Override // X.C57y
    public final float B7e() {
        return this.A04.B7e();
    }

    @Override // X.InterfaceC1131259a
    public final AnonymousClass583 getLayoutDirection() {
        return this.A04.A0H.A0D;
    }

    public AbstractC137606Lg(C59U c59u) {
        this.A04 = c59u;
    }

    @Override // X.C59W
    public final void A0K(InterfaceC16660sJ interfaceC16660sJ, float f, long j) {
        A01(this, j);
        if (!((C59V) this).A03) {
            A0Q();
        }
    }

    public void A0Q() {
        A0N().E4Q();
    }
}
