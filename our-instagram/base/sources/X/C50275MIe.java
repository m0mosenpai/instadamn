package X;

import android.content.Context;
import com.facebook.android.maps.model.LatLng;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.user.model.User;

/* renamed from: X.MIe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50275MIe extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50275MIe(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, int i) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A06 = obj2;
        this.A03 = obj3;
        this.A07 = str;
        this.A04 = obj4;
        this.A05 = obj5;
        this.A01 = obj6;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        AbstractC018607g abstractC018607g;
        Object obj2;
        Object obj3;
        C1ON A01;
        int i;
        if (this.A00 != 0) {
            C37771pE c37771pE = (C37771pE) obj;
            Context context = (Context) this.A02;
            C41220IMj c41220IMj = (C41220IMj) this.A06;
            if (c37771pE == null) {
                UserSession userSession = c41220IMj.A00;
                abstractC018607g = (AbstractC018607g) this.A03;
                String str = this.A07;
                obj2 = new C43210J8h(29, c41220IMj, this.A05, this.A01);
                obj3 = this.A04;
                AbstractC25233BEq.A0v(0, context, abstractC018607g, str);
                C14360o3.A0B(obj3, 5);
                C25621Ms A0c = AbstractC167017dG.A0c(userSession);
                A0c.A0B("commerce/shopping_auto_highlight/shop_reel/");
                A01 = AbstractC31178DnM.A0K(A0c, "story_id", str);
                i = 15;
            } else {
                UserSession userSession2 = c41220IMj.A00;
                abstractC018607g = (AbstractC018607g) this.A03;
                C37771pE c37771pE2 = AbstractC37741pB.A00;
                String str2 = c37771pE.A1V;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = this.A07;
                obj2 = this.A05;
                obj3 = this.A04;
                C14360o3.A0B(context, 0);
                AbstractC25234BEr.A1R(abstractC018607g, str2, str3, obj2, obj3);
                A01 = AbstractC1571873x.A01(EnumC53243Ngg.A04, userSession2, str2, null, null, null, null, AbstractC43592JPx.A16(str3), C16910sj.A00, -1, -1);
                i = 14;
            }
            A01.A00 = new C45543KEi(i, obj3, obj2);
            C1GJ.A00(context, abstractC018607g, A01);
            return C0eB.A00;
        }
        C45293K2v c45293K2v = (C45293K2v) obj;
        C14360o3.A0B(c45293K2v, 0);
        C46003KXr c46003KXr = (C46003KXr) this.A05;
        C45128JyU c45128JyU = c46003KXr.A02;
        C4F5 c4f5 = (C4F5) this.A04;
        C45119Jxo c45119Jxo = (C45119Jxo) this.A02;
        boolean z2 = c45119Jxo.A07;
        String str4 = c45128JyU.A0B;
        LatLng latLng = c45128JyU.A04;
        User user = c45128JyU.A06;
        long j = c45128JyU.A02;
        String str5 = c45128JyU.A0A;
        boolean z3 = c45128JyU.A0H;
        boolean z4 = c45128JyU.A0I;
        boolean z5 = c45128JyU.A0J;
        String str6 = c45128JyU.A09;
        boolean z6 = c45128JyU.A0C;
        boolean z7 = c45128JyU.A0E;
        int i2 = c45128JyU.A01;
        boolean z8 = c45128JyU.A0G;
        boolean z9 = c45128JyU.A0F;
        boolean z10 = c45128JyU.A00;
        boolean z11 = c45128JyU.A0D;
        String str7 = c45128JyU.A08;
        Integer num = c45128JyU.A07;
        C14360o3.A0B(str4, 0);
        AbstractC167017dG.A1Q(latLng, user);
        C14360o3.A0B(num, 19);
        C46003KXr c46003KXr2 = new C46003KXr(c45119Jxo, new C45128JyU(latLng, c4f5, user, num, str4, str5, str6, str7, i2, j, z3, z4, z5, z6, z7, z8, z9, z2, z10, z11), this.A07, c46003KXr.A00, c46003KXr.A06, false, c46003KXr.A04);
        JQC jqc = (JQC) this.A06;
        C45102JxW A02 = C45293K2v.A02(jqc);
        Boolean bool = (Boolean) this.A03;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = C45293K2v.A02(jqc).A05;
        }
        NoteAudience noteAudience = (NoteAudience) this.A01;
        if (noteAudience == null) {
            noteAudience = C45293K2v.A02(jqc).A01;
        }
        boolean z12 = A02.A08;
        boolean z13 = A02.A09;
        boolean z14 = A02.A0E;
        boolean z15 = A02.A0H;
        boolean z16 = A02.A0F;
        boolean z17 = A02.A0D;
        int i3 = A02.A00;
        boolean z18 = A02.A07;
        boolean z19 = A02.A0A;
        boolean z20 = A02.A0C;
        boolean z21 = A02.A0G;
        boolean z22 = A02.A04;
        boolean z23 = A02.A06;
        boolean z24 = A02.A03;
        boolean z25 = A02.A0B;
        C45044JwZ c45044JwZ = A02.A02;
        C14360o3.A0B(noteAudience, 15);
        return C45293K2v.A01(c46003KXr2, new C45102JxW(noteAudience, c45044JwZ, i3, z12, z13, z14, z15, z16, z17, z18, z19, z20, z21, z22, z23, z, z24, z25), c45293K2v.A02, c45293K2v.A03);
    }
}
