package X;

import android.app.Activity;
import android.view.View;
import com.instagram.api.schemas.CameraTool;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.ContentNotesRepository$deleteNote$1;

/* renamed from: X.Cl0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC28652Cl0 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public ViewOnClickListenerC28652Cl0(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A03 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
        this.A04 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        InterfaceC16620sF interfaceC16620sF;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(1178795747);
                C26738BrJ c26738BrJ = (C26738BrJ) this.A03;
                C25858BcD c25858BcD = (C25858BcD) c26738BrJ.A0E.getValue();
                String str = ((C51740MtP) this.A02).A00;
                String str2 = this.A04;
                String A15 = AbstractC25225BEi.A15(c26738BrJ.A05);
                String A152 = AbstractC25225BEi.A15(c26738BrJ.A0B);
                String A153 = AbstractC25225BEi.A15(c26738BrJ.A02);
                Integer num = (Integer) c26738BrJ.A03.getValue();
                String A0p = AbstractC166997dE.A0p(((View) this.A01).getContext(), 2131957687);
                AbstractC167017dG.A1N(str, str2);
                C4F0 c4f0 = c25858BcD.A00;
                String str3 = c25858BcD.A01;
                C14360o3.A0B(str3, 0);
                AbstractC166987dD.A1Z(new ContentNotesRepository$deleteNote$1(c4f0, num, str3, str, str2, A15, A152, A153, A0p, null), ((C4A7) c4f0).A01);
                AbstractC25233BEq.A14(c26738BrJ);
                i = -897848855;
                break;
            case 1:
                A05 = C0f9.A05(-368599615);
                C27889CRa c27889CRa = (C27889CRa) this.A01;
                C26070Bfy c26070Bfy = (C26070Bfy) this.A02;
                String str4 = c26070Bfy.A03;
                String str5 = c26070Bfy.A04;
                if (C18U.A06(C06090Tz.A05, c27889CRa.A02, 36327722447878972L) && str4 != null && str5 != null) {
                    interfaceC16620sF = c27889CRa.A01;
                } else {
                    str4 = c26070Bfy.A07;
                    str5 = c26070Bfy.A02;
                    if (str5 != null) {
                        interfaceC16620sF = c27889CRa.A00;
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
                if (interfaceC16620sF != null) {
                    interfaceC16620sF.invoke(str4, str5);
                }
                UserSession userSession = ((C25341BJk) this.A03).A00;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(C25341BJk.A02, userSession), "ig_rights_management_media_notice_click");
                if (A0f.isSampled()) {
                    A0f.A9K("ig_user_id", AbstractC25228BEl.A13(userSession.userId));
                    A0f.A9K("media_igid", AbstractC25228BEl.A13(this.A04));
                    A0f.Cht();
                }
                i = 580518634;
                break;
            case 2:
                A05 = C0f9.A05(-1018122958);
                C45128JyU B8i = ((InterfaceC30947Dj4) this.A01).B8i();
                if (B8i == null) {
                    i = -292689364;
                    break;
                } else {
                    Object obj = this.A03;
                    String str6 = this.A04;
                    C14360o3.A0A(str6);
                    InterfaceC31150Dmu interfaceC31150Dmu = (InterfaceC31150Dmu) this.A02;
                    AbstractC166987dD.A1Z(new PZQ(obj, interfaceC31150Dmu, str6, null, 1), AbstractC25229BEm.A0a(interfaceC31150Dmu));
                    C14360o3.A0A(str6);
                    interfaceC31150Dmu.Dd5(B8i, str6);
                    i = 1236538758;
                    break;
                }
            case 3:
                A05 = C0f9.A05(879939134);
                C28196Cbq.A00.A00((Activity) this.A01, C22P.A4k, (CameraTool) this.A02, (UserSession) this.A03, null, this.A04, null);
                i = -351714374;
                break;
            case 4:
                A05 = C0f9.A05(-67044974);
                C28196Cbq.A00.A00((Activity) this.A01, C22P.A4k, (CameraTool) this.A02, (UserSession) this.A03, null, this.A04, null);
                i = -145536590;
                break;
            case 5:
                A05 = C0f9.A05(1971542574);
                ((C25448BNn) this.A03).A07.E0n((C37644Ghd) this.A01, (C38321qM) this.A02, this.A04);
                i = -2064762024;
                break;
            default:
                return;
        }
        C0f9.A0C(i, A05);
    }
}
