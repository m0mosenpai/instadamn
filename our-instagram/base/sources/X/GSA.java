package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GSA extends AbstractC23611Dp implements InterfaceC16660sJ {
    public int A00;
    public Object A01;
    public final int A02;
    public final long A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GSA(ELF elf, InterfaceC23621Ds interfaceC23621Ds, long j) {
        super(1, interfaceC23621Ds);
        this.A02 = 0;
        this.A04 = elf;
        this.A03 = j;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        Object obj;
        long j;
        Object obj2;
        int i;
        switch (this.A02) {
            case 0:
                return new GSA((ELF) this.A04, interfaceC23621Ds, this.A03);
            case 1:
                obj = this.A04;
                j = this.A03;
                obj2 = this.A01;
                i = 1;
                return new GSA(obj, obj2, interfaceC23621Ds, i, j);
            default:
                obj = this.A04;
                j = this.A03;
                obj2 = this.A01;
                i = 2;
                return new GSA(obj, obj2, interfaceC23621Ds, i, j);
        }
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((GSA) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        ELF elf;
        C0eB c0eB;
        long j;
        InterfaceC19610xo A0e;
        String str;
        C0eB c0eB2;
        C0eB c0eB3;
        switch (this.A02) {
            case 0:
                C1JX c1jx = C1JX.A02;
                if (this.A00 != 0) {
                    elf = (ELF) this.A01;
                    AbstractC09560e7.A00(obj);
                } else {
                    AbstractC09560e7.A00(obj);
                    elf = (ELF) this.A04;
                    long j2 = this.A03;
                    this.A01 = elf;
                    this.A00 = 1;
                    if (AbstractC89993zf.A01(this, j2) == c1jx) {
                        return c1jx;
                    }
                }
                Context context = elf.getContext();
                if (context != null) {
                    InterfaceC09390do interfaceC09390do = elf.A0F;
                    UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                    String str2 = elf.A08;
                    AbstractC25230BEn.A15(1, A0r, str2);
                    C16920sk c16920sk = C16920sk.A00;
                    C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
                    C35142Fej.A00(A0r, "customer_details_tos_impression", str2, c16920sk);
                    C41451vu.A01.E4s(new C3KG(new C34676FPl(context, AbstractC166987dD.A0r(interfaceC09390do), new C36380G3g(elf)).A00()));
                    return C0eB.A00;
                }
                return null;
            case 1:
                C1JX c1jx2 = C1JX.A02;
                if (this.A00 != 0) {
                    AbstractC09560e7.A00(obj);
                } else {
                    AbstractC09560e7.A00(obj);
                    UserSession userSession = ((L28) this.A04).A01;
                    long j3 = this.A03;
                    this.A00 = 1;
                    C25621Ms A0c = AbstractC167017dG.A0c(userSession);
                    A0c.A0B("mental_well_being/update_daily_limit_settings/");
                    A0c.A0E("daily_limit_length_in_sec", j3);
                    obj = AbstractC31178DnM.A0K(A0c, "entrypoint", "android_client_dl_update").A00(296496486, this);
                    if (obj == c1jx2) {
                        return c1jx2;
                    }
                }
                Object obj2 = obj;
                FK0 fk0 = (FK0) this.A01;
                c0eB = null;
                if (obj instanceof C3NX) {
                    if (fk0 != null) {
                        InterfaceC19610xo A0e2 = AbstractC31174DnI.A0e(fk0.A01.A00, AnonymousClass280.A01);
                        A0e2.E7G("DAILY_QUOTA", -1L);
                        A0e2.apply();
                        c0eB2 = C0eB.A00;
                    } else {
                        c0eB2 = null;
                    }
                    obj2 = AbstractC25225BEi.A0z(c0eB2);
                } else if (!(obj instanceof C194848jk)) {
                    throw B4Z.A00();
                }
                if (obj2 instanceof C3NX) {
                    return obj2;
                }
                if (obj2 instanceof C194848jk) {
                    if (fk0 != null) {
                        AnonymousClass282 anonymousClass282 = AnonymousClass280.A01;
                        UserSession userSession2 = fk0.A01.A00;
                        j = fk0.A00;
                        A0e = AbstractC31174DnI.A0e(userSession2, anonymousClass282);
                        str = "DAILY_QUOTA";
                        A0e.E7G(str, j);
                        A0e.apply();
                        c0eB = C0eB.A00;
                    }
                    return new C194848jk(c0eB);
                }
                throw B4Z.A00();
            default:
                C1JX c1jx3 = C1JX.A02;
                if (this.A00 != 0) {
                    AbstractC09560e7.A00(obj);
                } else {
                    AbstractC09560e7.A00(obj);
                    UserSession userSession3 = ((L29) this.A04).A01;
                    long j4 = this.A03;
                    this.A00 = 1;
                    C25621Ms A0c2 = AbstractC167017dG.A0c(userSession3);
                    A0c2.A0B("mental_well_being/update_take_a_break_controls/");
                    A0c2.A0E("break_reminder_length_in_sec", j4);
                    obj = AbstractC31178DnM.A0K(A0c2, "entrypoint", "android_client_tab_update").A00(1527586101, this);
                    if (obj == c1jx3) {
                        return c1jx3;
                    }
                }
                Object obj3 = obj;
                FK1 fk1 = (FK1) this.A01;
                c0eB = null;
                if (obj instanceof C3NX) {
                    if (fk1 != null) {
                        InterfaceC19610xo A0e3 = AbstractC31174DnI.A0e(fk1.A01.A00, AnonymousClass280.A01);
                        A0e3.E7G("TAKE_A_BREAK", -1L);
                        A0e3.apply();
                        c0eB3 = C0eB.A00;
                    } else {
                        c0eB3 = null;
                    }
                    obj3 = AbstractC25225BEi.A0z(c0eB3);
                } else if (!(obj instanceof C194848jk)) {
                    throw B4Z.A00();
                }
                if (!(obj3 instanceof C3NX)) {
                    if (obj3 instanceof C194848jk) {
                        if (fk1 != null) {
                            AnonymousClass282 anonymousClass2822 = AnonymousClass280.A01;
                            UserSession userSession4 = fk1.A01.A00;
                            j = fk1.A00;
                            A0e = AbstractC31174DnI.A0e(userSession4, anonymousClass2822);
                            str = "TAKE_A_BREAK";
                            A0e.E7G(str, j);
                            A0e.apply();
                            c0eB = C0eB.A00;
                        }
                        return new C194848jk(c0eB);
                    }
                    throw B4Z.A00();
                }
                return obj3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GSA(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, int i, long j) {
        super(1, interfaceC23621Ds);
        this.A02 = i;
        this.A04 = obj;
        this.A03 = j;
        this.A01 = obj2;
    }
}
