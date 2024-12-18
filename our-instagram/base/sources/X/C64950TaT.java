package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import java.util.LinkedHashMap;

/* renamed from: X.TaT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64950TaT extends AbstractC23611Dp implements InterfaceC16620sF {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64950TaT(Object obj, Object obj2, String str, String str2, String str3, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A01 = obj2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        String str;
        String str2;
        String str3;
        Object obj2;
        Object obj3;
        int i;
        if (this.A00 != 0) {
            obj2 = this.A02;
            str3 = this.A03;
            str = this.A05;
            str2 = this.A04;
            obj3 = this.A01;
            i = 1;
        } else {
            str = this.A05;
            str2 = this.A04;
            str3 = this.A03;
            obj2 = this.A02;
            obj3 = this.A01;
            i = 0;
        }
        return new C64950TaT(obj2, obj3, str3, str, str2, interfaceC23621Ds, i);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C64950TaT) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, X.S25] */
    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A00;
        AbstractC09560e7.A00(obj);
        if (i != 0) {
            C27886CQx c27886CQx = ((C27267C1k) this.A02).A00;
            String str = this.A03;
            String str2 = this.A05;
            String str3 = this.A04;
            Object obj2 = this.A01;
            C14360o3.A0B(str, 0);
            AbstractC25233BEq.A0v(1, str2, str3, obj2);
            C2JM A0b = AbstractC25225BEi.A0b();
            C2JM A0b2 = AbstractC25225BEi.A0b();
            C2JO c2jo = new C2JO();
            c2jo.A09(str3, "parent_clip_id");
            C0CA.A00(c2jo.A02(), Double.valueOf(System.currentTimeMillis()), "device_timestamp");
            C2JO c2jo2 = new C2JO();
            c2jo2.A09(str2, "element_id");
            c2jo2.A09("TEXT", "element_type");
            AbstractC31173DnH.A1M(AbstractC25227BEk.A0T(GraphQlCallInput.A02, str, "new_text"), c2jo2, "swapped_text");
            c2jo.A05("swapped_elements", AbstractC166987dD.A1J(c2jo2));
            AbstractC58318PtA.A1K(c2jo, A0b);
            C64006Sxd.A00(C64023Sxu.A00, new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "CreateClipsSpin", A0b.getParamsCopy(), A0b2.getParamsCopy(), R08.class, true, null, 0, null, "xdt_create_clips_spin", AbstractC166987dD.A1E()), c27886CQx.A01, obj2, 17);
        } else {
            Object obj3 = this.A02;
            String str4 = this.A03;
            C63615SqN c63615SqN = new C63615SqN(obj3, this.A01, str4, 3);
            ?? obj4 = new Object();
            String str5 = this.A05;
            String str6 = this.A04;
            AbstractC167027dH.A12(str5, str6, str4);
            C58444PvN c58444PvN = new C58444PvN();
            String A0i = AnonymousClass001.A0i("proof.", str4, str6, '.');
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            A1I.put("secret_and_key", A0i);
            A1I.put("device_key", str4);
            Q8J A01 = AbstractC63245Sfz.A01(SEA.A00("secret_and_key", A1I));
            C14360o3.A07(A01);
            C63406Sjd.A0B(A01, new C63616SqO(c58444PvN, obj4, str5, str4));
            new Q8H(c58444PvN).A06(C65705Tsd.A08, c63615SqN);
        }
        return C0eB.A00;
    }
}
