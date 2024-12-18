package X;

import com.facebook.proxygen.TraceEventType;
import java.util.List;

/* renamed from: X.Gh8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37613Gh8 implements JIH {
    public String A00;
    public final InterfaceC43399JFo A01;
    public final String A02;
    public final IG5 A03;

    @Override // X.JIH
    public final void DzP(C120985dq c120985dq, Integer num, int i) {
        String str;
        C14360o3.A0B(c120985dq, 0);
        String str2 = this.A03.A00;
        if (str2 != null && !AbstractC001900j.A0T(str2) && AbstractC001900j.A0a(c120985dq.getId(), str2, false) && (str = this.A00) != null && !AbstractC001900j.A0T(str)) {
            InterfaceC43399JFo interfaceC43399JFo = this.A01;
            String str3 = this.A02;
            Integer num2 = C05F.A0u;
            if (!C14360o3.A0K(str3, TraceEventType.Push)) {
                num2 = C05F.A0j;
            }
            interfaceC43399JFo.Cx8(c120985dq, num2, this.A00);
            this.A00 = null;
        }
    }

    @Override // X.JIH
    public final void E1V() {
    }

    public C37613Gh8(InterfaceC43399JFo interfaceC43399JFo, IG5 ig5, String str, String str2) {
        AbstractC167017dG.A1P(interfaceC43399JFo, ig5);
        this.A01 = interfaceC43399JFo;
        this.A03 = ig5;
        this.A00 = str;
        this.A02 = str2;
    }

    @Override // X.JIH
    public final void D8r(C120985dq c120985dq, List list) {
    }

    @Override // X.JIH
    public final void Dbv(C25370BKn c25370BKn, boolean z) {
    }

    @Override // X.JIH
    public final void DzC(C120985dq c120985dq, int i, int i2) {
    }

    @Override // X.JIH
    public final void DzJ(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void DzL(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void E1U(C120985dq c120985dq, InterfaceC31077DlK interfaceC31077DlK, boolean z) {
    }

    @Override // X.JIH
    public final void Dby(C120985dq c120985dq, int i, int i2, boolean z) {
    }

    @Override // X.JIH
    public final void DzO(C120985dq c120985dq, C37644Ghd c37644Ghd, C37563GgJ c37563GgJ, C25370BKn c25370BKn, boolean z) {
    }
}
