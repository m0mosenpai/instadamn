package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.9GB, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9GB extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9GB(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i, boolean z, boolean z2) {
        super(0);
        this.A00 = i;
        this.A03 = obj;
        this.A01 = obj2;
        this.A05 = obj3;
        this.A04 = obj4;
        this.A08 = z;
        this.A07 = z2;
        this.A02 = obj5;
        this.A06 = str;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            FragmentActivity fragmentActivity = (FragmentActivity) this.A03;
            return new C85793s8((Context) this.A01, fragmentActivity, (UserSession) this.A05, ((AnonymousClass373) this.A02).BQw(), (C1M1) this.A04, this.A06, this.A08, this.A07);
        }
        AnonymousClass398 anonymousClass398 = (AnonymousClass398) this.A05;
        final InterfaceC60442pS interfaceC60442pS = anonymousClass398.A04;
        final C07X c07x = anonymousClass398.A00;
        InterfaceC686136y interfaceC686136y = (InterfaceC686136y) this.A02;
        final InterfaceC76043b9 BS4 = interfaceC686136y.BS4();
        final InterfaceC75453aC BQw = interfaceC686136y.BQw();
        final C4FY c4fy = (C4FY) anonymousClass398.A0U.getValue();
        final AnonymousClass399 anonymousClass399 = anonymousClass398.A05;
        final C30E c30e = ((C33P) this.A03).A0G;
        final C39D c39d = anonymousClass398.A06;
        final InterfaceC75403a7 BS6 = interfaceC686136y.BS6();
        final C62862tP c62862tP = anonymousClass398.A01;
        final InterfaceC60682pr Br6 = interfaceC686136y.Br6();
        final Context context = (Context) this.A01;
        final UserSession userSession = (UserSession) this.A04;
        final boolean z = this.A08;
        final boolean z2 = this.A07;
        final String str = this.A06;
        return new AbstractC65902yS(context, c07x, c62862tP, userSession, c4fy, BS6, interfaceC60442pS, BQw, BS4, anonymousClass399, c39d, c30e, Br6, str, z, z2) { // from class: X.5dC
            public final InterfaceC09390do A00;
            public final C07X A01;
            public final C62862tP A02;
            public final UserSession A03;
            public final C39G A04;
            public final C4FY A05;
            public final InterfaceC75403a7 A06;
            public final InterfaceC60442pS A07;
            public final InterfaceC75453aC A08;
            public final InterfaceC76043b9 A09;
            public final AnonymousClass399 A0A;
            public final C39D A0B;
            public final C30E A0C;
            public final InterfaceC60682pr A0D;
            public final String A0E;
            public final boolean A0F;
            public final boolean A0G;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context, c07x, userSession, null, C120675dD.A00, new C9EL(anonymousClass399, 42), 152);
                C14360o3.A0B(context, 1);
                C14360o3.A0B(userSession, 2);
                C14360o3.A0B(BS4, 7);
                C14360o3.A0B(BQw, 8);
                C14360o3.A0B(c4fy, 10);
                C14360o3.A0B(anonymousClass399, 11);
                C14360o3.A0B(c30e, 12);
                C14360o3.A0B(c39d, 13);
                C14360o3.A0B(BS6, 14);
                C14360o3.A0B(Br6, 16);
                this.A03 = userSession;
                this.A07 = interfaceC60442pS;
                this.A0G = z;
                this.A01 = c07x;
                this.A0F = z2;
                this.A09 = BS4;
                this.A08 = BQw;
                this.A0E = str;
                this.A05 = c4fy;
                this.A0A = anonymousClass399;
                this.A0C = c30e;
                this.A0B = c39d;
                this.A06 = BS6;
                this.A02 = c62862tP;
                this.A0D = Br6;
                this.A04 = BS4.Ar3();
                this.A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C206939Dy(context, 19));
            }

            @Override // X.AbstractC65902yS
            public final AbstractC50812Vc A02(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
                C14360o3.A0B(interfaceC16820sZ, 0);
                C14360o3.A0B(interfaceC16820sZ2, 1);
                UserSession userSession2 = this.A03;
                InterfaceC60442pS interfaceC60442pS2 = this.A07;
                boolean z3 = this.A0G;
                InterfaceC76043b9 interfaceC76043b9 = this.A09;
                InterfaceC75453aC interfaceC75453aC = this.A08;
                C39D c39d2 = this.A0B;
                boolean z4 = this.A0F;
                String str2 = this.A0E;
                C39G c39g = this.A04;
                C4FY c4fy2 = this.A05;
                C120695dF c120695dF = new C120695dF(this.A0A);
                C30E c30e2 = this.A0C;
                return new C120705dG(this.A02, userSession2, c39g, c4fy2, this.A06, interfaceC60442pS2, interfaceC75453aC, interfaceC76043b9, c120695dF, c39d2, c30e2, this.A0D, str2, interfaceC16820sZ, z3, z4);
            }

            @Override // X.AbstractC65902yS
            public final int A01() {
                return ((Number) this.A00.getValue()).intValue();
            }

            @Override // X.AbstractC65902yS
            public final String A04() {
                return "LITHO_FULL_HEIGHT_SINGLE_MEDIA";
            }
        };
    }
}
