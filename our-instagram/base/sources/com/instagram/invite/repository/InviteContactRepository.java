package com.instagram.invite.repository;

import X.AbstractC12220kQ;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC208910l;
import X.AbstractC23451Ch;
import X.AbstractC25225BEi;
import X.AbstractC31171DnF;
import X.AbstractC31176DnK;
import X.AbstractC31178DnM;
import X.AbstractC35171FfO;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C10E;
import X.C16910sj;
import X.EnumC33338EoX;
import X.EnumC33510Erj;
import X.FNN;
import X.InterfaceC02590Ai;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.request.InviteContactApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes6.dex */
public final class InviteContactRepository {
    public final C0UO A00;
    public final C0UO A01;
    public final C0UO A02;
    public final C0UO A03;
    public final UserSession A04;
    public final InviteContactApi A05;
    public final C05A A06;
    public final C05A A07;
    public final C05A A08;
    public final C05A A09;

    public final void A01(Context context, EnumC33510Erj enumC33510Erj) {
        InterfaceC02590Ai A0f;
        List list;
        AbstractC167007dF.A1K(context, enumC33510Erj);
        C05A c05a = this.A06;
        c05a.Egh(EnumC33338EoX.A04);
        if (AbstractC23451Ch.A07(context, "android.permission.READ_CONTACTS")) {
            UserSession userSession = this.A04;
            LinkedHashMap A02 = AbstractC35171FfO.A02(context, userSession, false, false);
            ArrayList A17 = AbstractC25225BEi.A17(A02.size());
            Iterator A14 = AbstractC166997dE.A14(A02);
            while (A14.hasNext()) {
                A17.add(AbstractC31176DnK.A0j(A14));
            }
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : A17) {
                FNN fnn = (FNN) obj;
                if (!fnn.A04.isEmpty() && (list = fnn.A05) != null && !list.isEmpty()) {
                    A1E.add(obj);
                }
            }
            this.A07.Egh(A1E);
            c05a.Egh(EnumC33338EoX.A02);
            A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "contact_list_client_fetch_success");
            if (A0f.isSampled()) {
                AbstractC31176DnK.A1H(enumC33510Erj, A0f, AbstractC31178DnM.A0b());
            } else {
                return;
            }
        } else {
            c05a.Egh(EnumC33338EoX.A03);
            A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(this.A04), "contact_list_client_fetch_failed");
            if (A0f.isSampled()) {
                AbstractC31176DnK.A1H(enumC33510Erj, A0f, AbstractC31178DnM.A0b());
                A0f.AAP("error", null);
            } else {
                return;
            }
        }
        A0f.Cht();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.EnumC33510Erj r6, X.InterfaceC23621Ds r7, boolean r8) {
        /*
            r5 = this;
            r3 = 48
            boolean r0 = X.MAK.A01(r7, r3)
            if (r0 == 0) goto L6b
            r4 = r7
            X.MAK r4 = (X.MAK) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6b
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A03
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L54
            if (r0 != r2) goto L9e
            java.lang.Object r6 = r4.A02
            X.Erj r6 = (X.EnumC33510Erj) r6
            java.lang.Object r4 = r4.A01
            com.instagram.invite.repository.InviteContactRepository r4 = (com.instagram.invite.repository.InviteContactRepository) r4
            X.AbstractC09560e7.A00(r1)
        L2c:
            X.Gaw r1 = (X.InterfaceC37247Gaw) r1
            if (r1 == 0) goto La3
            X.E7u r1 = (X.E7u) r1
            java.util.List r0 = r1.A00
            if (r0 == 0) goto La3
            java.util.ArrayList r3 = X.AbstractC166987dD.A1E()
            java.util.Iterator r1 = r0.iterator()
        L3e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r0 = r1.next()
            X.DlW r0 = (X.InterfaceC31088DlW) r0
            X.E7e r0 = (X.E7e) r0
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L3e
            r3.add(r0)
            goto L3e
        L54:
            X.AbstractC09560e7.A00(r1)
            X.05A r1 = r5.A09
            X.EoX r0 = X.EnumC33338EoX.A04
            r1.Egh(r0)
            com.instagram.request.InviteContactApi r0 = r5.A05
            X.AbstractC31172DnG.A1V(r5, r6, r4, r2)
            java.lang.Object r1 = r0.A00(r4, r8)
            if (r1 == r3) goto Ld2
            r4 = r5
            goto L2c
        L6b:
            X.MAK r4 = new X.MAK
            r4.<init>(r5, r7, r3)
            goto L16
        L71:
            X.05A r1 = r4.A08
            java.util.Set r0 = X.AbstractC001800i.A0k(r3)
            r1.Egh(r0)
            X.05A r1 = r4.A09
            X.EoX r0 = X.EnumC33338EoX.A02
            r1.Egh(r0)
            com.instagram.common.session.UserSession r0 = r4.A04
            X.C14360o3.A0B(r6, r2)
            X.0wW r1 = X.AbstractC12220kQ.A02(r0)
            java.lang.String r0 = "contact_list_server_fetch_success"
            X.0Ai r1 = X.AbstractC166987dD.A0f(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto Ld0
            java.lang.String r0 = X.AbstractC31178DnM.A0b()
            X.AbstractC31176DnK.A1H(r6, r1, r0)
            goto Lcd
        L9e:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        La3:
            X.05A r1 = r4.A09
            X.EoX r0 = X.EnumC33338EoX.A03
            r1.Egh(r0)
            com.instagram.common.session.UserSession r1 = r4.A04
            r2 = 0
            r0 = 2
            X.C14360o3.A0B(r6, r0)
            X.0wW r1 = X.AbstractC12220kQ.A02(r1)
            java.lang.String r0 = "contact_list_server_fetch_failed"
            X.0Ai r1 = X.AbstractC166987dD.A0f(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto Ld0
            java.lang.String r0 = X.AbstractC31178DnM.A0b()
            X.AbstractC31176DnK.A1H(r6, r1, r0)
            java.lang.String r0 = "error"
            r1.AAP(r0, r2)
        Lcd:
            r1.Cht()
        Ld0:
            X.0eB r3 = X.C0eB.A00
        Ld2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.invite.repository.InviteContactRepository.A00(X.Erj, X.1Ds, boolean):java.lang.Object");
    }

    public InviteContactRepository(UserSession userSession, InviteContactApi inviteContactApi) {
        this.A05 = inviteContactApi;
        this.A04 = userSession;
        C008002u A00 = C10E.A00(C16910sj.A00);
        this.A08 = A00;
        this.A02 = AbstractC208910l.A02(A00);
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A07 = A0o;
        this.A01 = AbstractC208910l.A02(A0o);
        EnumC33338EoX enumC33338EoX = EnumC33338EoX.A04;
        C008002u A1H = AbstractC25225BEi.A1H(enumC33338EoX);
        this.A09 = A1H;
        this.A03 = AbstractC208910l.A02(A1H);
        C008002u A1H2 = AbstractC25225BEi.A1H(enumC33338EoX);
        this.A06 = A1H2;
        this.A00 = AbstractC208910l.A02(A1H2);
    }
}
