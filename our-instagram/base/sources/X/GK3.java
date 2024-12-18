package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class GK3 implements InterfaceC42241xE {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;

    public GK3(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj3;
        this.A01 = i;
        this.A06 = str;
        this.A07 = str2;
        this.A03 = obj;
        this.A05 = obj2;
        this.A04 = obj4;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        Object obj2;
        C32025E5d c32025E5d;
        Object obj3;
        InterfaceC132965zL interfaceC132965zL = (InterfaceC132965zL) obj;
        boolean z = interfaceC132965zL instanceof C48496Lcn;
        if (this.A00 != 0) {
            if (z) {
                Object A00 = AbstractC132975zM.A00(interfaceC132965zL);
                C14360o3.A07(A00);
                c32025E5d = (C32025E5d) A00;
                C7DU c7du = (C7DU) this.A04;
                int i = this.A01;
                String str = this.A06;
                String str2 = this.A07;
                String str3 = c32025E5d.A02;
                String str4 = c32025E5d.A01;
                HashMap A1G = AbstractC166987dD.A1G();
                if (str3 == null) {
                    str3 = "";
                }
                A1G.put("error_message", str3);
                if (str4 == null) {
                    str4 = "";
                }
                AbstractC31171DnF.A1U(str4, A1G);
                AbstractC34065F1s.A00(c7du.A00, str, str2, "resign_moderator_error", "view", "resign_moderator", "thread_details", A1G, i);
                obj3 = this.A02;
                AbstractC46744Km1.A00((UserSession) this.A05, (Context) obj3, c32025E5d.A05);
                return;
            }
            C7DU c7du2 = (C7DU) this.A04;
            int i2 = this.A01;
            AbstractC34065F1s.A00(c7du2.A00, this.A06, this.A07, "resign_moderator_success", "view", "resign_moderator", "thread_details", null, i2);
            obj2 = this.A03;
            ((InterfaceC37157GYu) obj2).Ch3();
        }
        if (z) {
            Object A002 = AbstractC132975zM.A00(interfaceC132965zL);
            C14360o3.A07(A002);
            c32025E5d = (C32025E5d) A002;
            C142846ck c142846ck = (C142846ck) this.A02;
            int i3 = this.A01;
            String str5 = this.A06;
            String str6 = this.A07;
            String str7 = c32025E5d.A00;
            String str8 = c32025E5d.A01;
            C25531Mh A0I = AbstractC31172DnG.A0I(c142846ck);
            if (AbstractC25226BEj.A1Z(A0I)) {
                HashMap A1G2 = AbstractC166987dD.A1G();
                if (str7 == null) {
                    str7 = "";
                }
                A1G2.put("error_message", str7);
                if (str8 == null) {
                    str8 = "";
                }
                AbstractC31171DnF.A1U(str8, A1G2);
                AbstractC31175DnJ.A1B(A0I, c142846ck);
                AbstractC31174DnI.A1J(A0I, "resign_collaborator_error");
                A0I.A0o("resign_collaborator");
                AbstractC31175DnJ.A1C(A0I, AbstractC31179DnN.A0a(A0I, "thread_details", str5, str6, i3), A1G2);
            }
            obj3 = this.A03;
            AbstractC46744Km1.A00((UserSession) this.A05, (Context) obj3, c32025E5d.A05);
            return;
        }
        C142846ck c142846ck2 = (C142846ck) this.A02;
        int i4 = this.A01;
        String str9 = this.A06;
        String str10 = this.A07;
        C25531Mh A0I2 = AbstractC31172DnG.A0I(c142846ck2);
        if (AbstractC25226BEj.A1Z(A0I2)) {
            AbstractC31175DnJ.A1B(A0I2, c142846ck2);
            AbstractC31174DnI.A1J(A0I2, "resign_collaborator_success");
            A0I2.A0o("resign_collaborator");
            A0I2.A0h(AbstractC31179DnN.A0a(A0I2, "thread_details", str9, str10, i4));
            A0I2.Cht();
        }
        obj2 = this.A04;
        ((InterfaceC37157GYu) obj2).Ch3();
    }
}
