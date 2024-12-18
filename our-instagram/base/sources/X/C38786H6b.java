package X;

import com.instagram.api.schemas.TemplateTopic;
import java.util.List;

/* renamed from: X.H6b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38786H6b extends C0T6 implements InterfaceC43494JJg {
    public final String A00;
    public final List A01;
    public final TemplateTopic A02;
    public final String A03;
    public final String A04;

    @Override // X.InterfaceC43494JJg
    public final C38786H6b F2q(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38786H6b) {
                C38786H6b c38786H6b = (C38786H6b) obj;
                if (!C14360o3.A0K(this.A03, c38786H6b.A03) || this.A02 != c38786H6b.A02 || !C14360o3.A0K(this.A01, c38786H6b.A01) || !C14360o3.A0K(this.A00, c38786H6b.A00) || !C14360o3.A0K(this.A04, c38786H6b.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A04, (AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0J(this.A03))) + AbstractC167017dG.A0O(this.A00)) * 31);
    }

    public C38786H6b(TemplateTopic templateTopic, String str, String str2, String str3, List list) {
        AbstractC167027dH.A13(str, templateTopic, list);
        C14360o3.A0B(str3, 5);
        this.A03 = str;
        this.A02 = templateTopic;
        this.A01 = list;
        this.A00 = str2;
        this.A04 = str3;
    }

    @Override // X.InterfaceC43494JJg
    public final InterfaceC43494JJg EB0(C1DY c1dy) {
        return this;
    }
}
