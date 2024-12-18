package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.7U6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7U6 {
    public C7CO A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final C7U8 A03;
    public final C7WZ A04;
    public final C164197Wi A05;
    public final C163867Va A06;
    public final C164047Vt A07;
    public final C7WB A08;
    public final C7VQ A09;
    public final InterfaceC16820sZ A0A;
    public final InterfaceC16820sZ A0B;
    public final InterfaceC16820sZ A0C;
    public final C7VG A0D;

    public C7U6(C7WZ c7wz, C164197Wi c164197Wi, C163867Va c163867Va, C164047Vt c164047Vt, C7WB c7wb, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4) {
        this.A04 = c7wz;
        this.A05 = c164197Wi;
        this.A08 = c7wb;
        this.A06 = c163867Va;
        this.A07 = c164047Vt;
        this.A0A = interfaceC16820sZ;
        this.A0B = interfaceC16820sZ3;
        this.A0C = interfaceC16820sZ4;
        UserSession userSession = c7wz.A04;
        this.A02 = userSession;
        AbstractC59962oe abstractC59962oe = c7wz.A01;
        this.A01 = abstractC59962oe;
        C7VG c7vg = new C7VG(new C7U7(abstractC59962oe), userSession, new C9ED(this, 10));
        this.A0D = c7vg;
        this.A03 = new C7U8(userSession, c7vg, new C149596oC(userSession), interfaceC16820sZ2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        UserSession userSession2 = this.A02;
        if (AbstractC31268Doq.A08(userSession2)) {
            AbstractC31265Don.A00();
            C7WB c7wb2 = this.A08;
            C7U9 c7u9 = new C7U9(this);
            C9ED c9ed = new C9ED(this, 11);
            InterfaceC16820sZ interfaceC16820sZ5 = this.A0B;
            C9ED c9ed2 = new C9ED(this, 12);
            C9ED c9ed3 = new C9ED(this, 13);
            C14360o3.A0B(c7wb2, 1);
            C14360o3.A0B(interfaceC16820sZ5, 4);
            arrayList2.add(new C159437De(c7wb2, c7vg, c7u9, c9ed, interfaceC16820sZ5, c9ed2, c9ed3));
            arrayList2.add(new C7UI(c7vg, new C7UH(this), new C9ED(this, 14)));
            arrayList2.add(new C7UK(c7vg, new C7UJ(this), new C9ED(this, 15)));
        }
        arrayList.addAll(arrayList2);
        arrayList.add(this.A03);
        arrayList.add(new C7UL(c7vg));
        C163697Uh c163697Uh = new C163697Uh(this);
        arrayList.add(new C163707Ui(userSession2, this.A06, new C60352pJ(userSession2), c7vg, c163697Uh));
        ImmutableList of = ImmutableList.of((Object) new C7UA(c7vg, new C163717Uj(this), new C9ED(this, 16), new C9ED(this, 17)), (Object) new C163757Un(userSession2, new C163747Um(this), c7vg, new C163737Ul(this), new C9ED(this, 18)));
        C14360o3.A07(of);
        arrayList.addAll(of);
        arrayList.add(new C163767Uq(userSession2, c7vg, this.A04.A09, new C7Up(this), new C9ED(this, 19)));
        C06090Tz c06090Tz = C06090Tz.A05;
        C18U.A06(c06090Tz, userSession2, 36329470499504477L);
        C18U.A06(c06090Tz, userSession2, 36329470499570014L);
        if (AbstractC28415CgL.A03(userSession2)) {
            CQW cqw = new CQW(this, this.A0A);
            this.A00 = new C7CO(c7vg, new D5W(cqw), new C30519Dc2(cqw, 16));
        }
        C7CO c7co = this.A00;
        if (c7co != null) {
            arrayList.add(c7co);
        }
        this.A09 = new C7VQ(arrayList);
    }
}
