package com.instagram.closefriends.audiencelists.repository;

import X.AbstractC001800i;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC208910l;
import X.AbstractC25225BEi;
import X.AbstractC31171DnF;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C14360o3;
import X.C4A7;
import X.C4A8;
import X.EnumC33343Eoc;
import com.instagram.closefriends.audiencelists.model.AudienceListViewModel;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class AudienceListsListRepository extends C4A7 {
    public List A00;
    public final C05A A01;
    public final C0UO A02;
    public final C0UO A03;
    public final UserSession A04;
    public final C05A A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceListsListRepository(UserSession userSession) {
        super("AudienceListsList", C4A8.A00(687420290));
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A01 = A0o;
        C008002u A1H = AbstractC25225BEi.A1H(EnumC33343Eoc.A03);
        this.A05 = A1H;
        this.A02 = AbstractC208910l.A02(A0o);
        this.A03 = AbstractC208910l.A02(A1H);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.InterfaceC23621Ds r15) {
        /*
            r14 = this;
            r3 = 23
            boolean r0 = X.MAG.A01(r15, r3)
            if (r0 == 0) goto L82
            r4 = r15
            X.MAG r4 = (X.MAG) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L82
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L68
            if (r0 != r2) goto L91
            java.lang.Object r2 = r4.A01
            com.instagram.closefriends.audiencelists.repository.AudienceListsListRepository r2 = (com.instagram.closefriends.audiencelists.repository.AudienceListsListRepository) r2
            X.AbstractC09560e7.A00(r1)
        L28:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L88
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r0 = r1.A00
            X.Gb2 r0 = (X.Gb2) r0
            X.E83 r0 = (X.E83) r0
            java.util.List r0 = r0.A00
            java.util.ArrayList r4 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r5 = r0.iterator()
        L40:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L96
            java.lang.Object r3 = r5.next()
            X.MRc r3 = (X.InterfaceC50499MRc) r3
            X.E82 r3 = (X.E82) r3
            long r0 = r3.A01
            java.lang.String r7 = java.lang.String.valueOf(r0)
            java.lang.String r8 = r3.A04
            int r10 = r3.A00
            java.util.List r9 = r3.A05
            boolean r11 = r3.A07
            boolean r12 = r3.A08
            r13 = 0
            com.instagram.closefriends.audiencelists.model.AudienceListViewModel r6 = new com.instagram.closefriends.audiencelists.model.AudienceListViewModel
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r4.add(r6)
            goto L40
        L68:
            X.AbstractC09560e7.A00(r1)
            X.05A r1 = r14.A05
            X.Eoc r0 = X.EnumC33343Eoc.A04
            r1.Egh(r0)
            com.instagram.closefriends.audiencelists.api.AudienceListsApiUtil r1 = com.instagram.closefriends.audiencelists.api.AudienceListsApiUtil.A00
            com.instagram.common.session.UserSession r0 = r14.A04
            r4.A01 = r14
            r4.A00 = r2
            java.lang.Object r1 = r1.A09(r0, r4)
            if (r1 == r3) goto Lb6
            r2 = r14
            goto L28
        L82:
            X.MAG r4 = new X.MAG
            r4.<init>(r14, r15, r3)
            goto L16
        L88:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto La5
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L91:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L96:
            r0 = 0
            r2.A01(r4, r0)
            X.05A r1 = r2.A05
            X.Eoc r0 = X.EnumC33343Eoc.A05
            r1.Egh(r0)
            X.3NX r1 = X.AbstractC25227BEk.A0i()
        La5:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto Lb4
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto Lb7
            X.05A r1 = r2.A05
            X.Eoc r0 = X.EnumC33343Eoc.A02
            r1.Egh(r0)
        Lb4:
            X.0eB r3 = X.C0eB.A00
        Lb6:
            return r3
        Lb7:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.closefriends.audiencelists.repository.AudienceListsListRepository.A00(X.1Ds):java.lang.Object");
    }

    public final void A01(List list, boolean z) {
        List<AudienceListViewModel> list2 = list;
        C14360o3.A0B(list2, 0);
        C05A c05a = this.A01;
        List list3 = (List) c05a.getValue();
        List list4 = this.A00;
        if (list4 != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list2) {
                AudienceListViewModel audienceListViewModel = (AudienceListViewModel) obj;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator it = list4.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (C14360o3.A0K(it.next(), audienceListViewModel.A01)) {
                                A1E.add(obj);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            list2 = A1E;
        }
        if (!z) {
            ArrayList A0q = AbstractC167017dG.A0q(list2);
            for (AudienceListViewModel audienceListViewModel2 : list2) {
                ArrayList A1E2 = AbstractC166987dD.A1E();
                for (Object obj2 : list3) {
                    if (C14360o3.A0K(((AudienceListViewModel) obj2).A01, audienceListViewModel2.A01)) {
                        A1E2.add(obj2);
                    }
                }
                AudienceListViewModel audienceListViewModel3 = (AudienceListViewModel) AbstractC001800i.A0O(A1E2, 0);
                if (audienceListViewModel3 != null) {
                    audienceListViewModel2 = new AudienceListViewModel(audienceListViewModel2.A01, audienceListViewModel2.A02, audienceListViewModel2.A03, audienceListViewModel2.A00, audienceListViewModel2.A05, audienceListViewModel2.A06, audienceListViewModel3.A04);
                }
                A0q.add(audienceListViewModel2);
            }
            list2 = A0q;
        }
        c05a.Egh(list2);
    }
}
