package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Own, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56180Own implements InterfaceC60152ox {
    public AnonymousClass195 A00;
    public final Fragment A01;
    public final UserSession A02;
    public final C3I9 A03;
    public final EnumC142806cg A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;

    public C56180Own(Fragment fragment, UserSession userSession, EnumC142806cg enumC142806cg) {
        C14360o3.A0B(userSession, 2);
        this.A01 = fragment;
        this.A02 = userSession;
        this.A04 = enumC142806cg;
        C57558PgW c57558PgW = new C57558PgW(this, 13);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57558PgW(new C57558PgW(fragment, 10), 11));
        this.A0G = AbstractC25225BEi.A0a(new C57558PgW(A00, 12), c57558PgW, C57530Pg4.A00(null, A00, 10), AbstractC25225BEi.A1D(C51006MgD.class));
        this.A06 = C57558PgW.A02(this, 0);
        this.A0C = C57558PgW.A02(this, 6);
        this.A07 = C57558PgW.A02(this, 1);
        this.A0A = C57558PgW.A02(this, 4);
        this.A08 = C57558PgW.A02(this, 2);
        this.A05 = AbstractC09440dt.A01(new C57542PgG(this, 49));
        this.A0F = C57558PgW.A02(this, 9);
        this.A0B = C57558PgW.A02(this, 5);
        this.A0D = C57558PgW.A02(this, 7);
        this.A09 = C57558PgW.A01(this, 3);
        C3I8 A01 = C3I7.A01(this, false, false);
        this.A03 = A01;
        this.A0E = C57558PgW.A01(this, 8);
        A01.A9e(this);
        if (enumC142806cg != EnumC142806cg.A05) {
            A01();
        }
    }

    public static final void A00(AbstractC125325le abstractC125325le, float f) {
        if (abstractC125325le != null) {
            AbstractC50522MSa.A1V(abstractC125325le, f);
        }
    }

    public final void A01() {
        this.A00 = AbstractC18560vj.A03(AbstractC25235BEs.A0S(this.A01), C57167PZl.A02(this, new C15430py(((C51006MgD) this.A0G.getValue()).A06), 16));
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        ((C51006MgD) this.A0G.getValue()).A05.Egh(Float.valueOf(i));
    }
}
