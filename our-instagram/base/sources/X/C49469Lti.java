package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Lti, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49469Lti implements C74M {
    public final /* synthetic */ C45097JxR A00;
    public final /* synthetic */ LGG A01;
    public final /* synthetic */ String A02;

    @Override // X.C74M
    public final /* synthetic */ void DIW(InterfaceC71992XEf interfaceC71992XEf, String str, String str2) {
    }

    @Override // X.C74M
    public final void DQ3(XEC xec, String str, String str2) {
        C14360o3.A0B(str2, 2);
        C159857Ex c159857Ex = this.A01.A0B.A01;
        if (c159857Ex != null) {
            String str3 = this.A02;
            C45097JxR c45097JxR = this.A00;
            c159857Ex.A00(str3, str2, ((ImageUrl) c45097JxR.A03).getUrl(), ((AnonymousClass541) c45097JxR.A04).A00);
        }
    }

    @Override // X.C74M
    public final /* synthetic */ void DQ4(XEC xec, String str, String str2, String str3) {
    }

    @Override // X.C74M
    public final void Dbm(String str, float f) {
    }

    @Override // X.C74M
    public final void onError(String str) {
    }

    public C49469Lti(C45097JxR c45097JxR, LGG lgg, String str) {
        this.A01 = lgg;
        this.A02 = str;
        this.A00 = c45097JxR;
    }

    @Override // X.C74M
    public final /* synthetic */ boolean EiZ() {
        return false;
    }
}
