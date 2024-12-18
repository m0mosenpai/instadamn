package X;

import android.content.DialogInterface;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.user.model.User;

/* renamed from: X.Fiz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35384Fiz implements DialogInterface.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final String A0A;
    public final String A0B;

    public DialogInterfaceOnClickListenerC35384Fiz(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, String str, String str2, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj4;
        this.A01 = i;
        this.A0A = str;
        this.A0B = str2;
        this.A07 = obj2;
        this.A03 = obj5;
        this.A08 = obj7;
        this.A05 = obj8;
        this.A04 = obj;
        this.A09 = obj3;
        this.A06 = obj6;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C41761wQ c41761wQ;
        C42221xC EF9;
        GK3 gk3;
        if (this.A00 != 0) {
            C7DU c7du = (C7DU) this.A06;
            int i2 = this.A01;
            String str = this.A0A;
            String str2 = this.A0B;
            AbstractC34065F1s.A00(c7du.A00, str, str2, "resign_moderator_attempt", "tap", MSV.A00(1551), "thread_details", null, i2);
            c41761wQ = (C41761wQ) this.A07;
            EF9 = ((InterfaceC37169GZg) this.A02).C78().EFn(((E70) this.A08).A0L, AbstractC166987dD.A1J(MessagingUser.A00((User) this.A04)));
            Object obj = this.A03;
            gk3 = new GK3(this.A05, this.A09, obj, c7du, str, str2, i2, 1);
        } else {
            C142846ck c142846ck = (C142846ck) this.A02;
            int i3 = this.A01;
            String str3 = this.A0A;
            String str4 = this.A0B;
            C25531Mh A0I = AbstractC31172DnG.A0I(c142846ck);
            if (AbstractC25226BEj.A1Z(A0I)) {
                AbstractC31175DnJ.A1B(A0I, c142846ck);
                AbstractC31174DnI.A1I(A0I, "resign_collaborator_attempt");
                A0I.A0o(MSV.A00(1550));
                A0I.A0h(AbstractC31179DnN.A0a(A0I, "thread_details", str3, str4, i3));
                A0I.Cht();
            }
            c41761wQ = (C41761wQ) this.A07;
            EF9 = ((InterfaceC37169GZg) this.A03).C78().EF9(((E70) this.A08).A0L, AbstractC166987dD.A1J(MessagingUser.A00((User) this.A05)));
            gk3 = new GK3(this.A04, this.A09, c142846ck, this.A06, str3, str4, i3, 0);
        }
        c41761wQ.A02(EF9, gk3);
    }
}
