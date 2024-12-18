package X;

/* loaded from: classes11.dex */
public final class UMJ extends C1W1 implements C74M {
    @Override // X.C1W1
    public final /* bridge */ /* synthetic */ Object A02() {
        C1VO c1vo;
        synchronized (this) {
            C1VO c1vo2 = (C1VO) super.A02();
            if (c1vo2 != null) {
                c1vo = c1vo2.A03();
            } else {
                c1vo = null;
            }
        }
        return c1vo;
    }

    @Override // X.C74M
    public final void DIW(InterfaceC71992XEf interfaceC71992XEf, String str, String str2) {
        C14360o3.A0B(interfaceC71992XEf, 1);
        UON uon = new UON(interfaceC71992XEf);
        A09(C1VO.A00(C1VO.A05, C1VO.A06, uon), null, true);
    }

    @Override // X.C74M
    public final void DQ3(XEC xec, String str, String str2) {
    }

    @Override // X.C74M
    public final /* synthetic */ void DQ4(XEC xec, String str, String str2, String str3) {
    }

    @Override // X.C1W1
    public final /* bridge */ /* synthetic */ void A07(Object obj) {
        C1VO.A01((C1VO) obj);
    }

    @Override // X.C74M
    public final void Dbm(String str, float f) {
        A05(f / 100.0f);
    }

    @Override // X.C74M
    public final /* synthetic */ boolean EiZ() {
        return false;
    }

    @Override // X.C74M
    public final void onError(String str) {
        String A0R = AnonymousClass001.A0R("Failed to load GIF image ", str);
        C14360o3.A0B(A0R, 1);
        A0A(new Exception(A0R));
    }
}
