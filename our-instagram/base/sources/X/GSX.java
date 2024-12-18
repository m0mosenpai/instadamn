package X;

import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class GSX extends C06840Yb implements InterfaceC16600sD {
    public final int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GSX(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L13;
                case 1: goto L1b;
                default: goto L6;
            }
        L6:
            java.lang.Class<X.DzE> r3 = X.C31846DzE.class
            r1 = 4
            java.lang.String r4 = "combineSubscribedTabSections"
            java.lang.String r5 = "combineSubscribedTabSections(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;"
        Ld:
            r2 = r8
            r6 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L13:
            java.lang.Class<X.Dyu> r3 = X.C31835Dyu.class
            r1 = 4
            java.lang.String r4 = "processData"
            java.lang.String r5 = "processData(Ljava/lang/String;Lcom/instagram/user/model/User;Ljava/util/List;)Lcom/instagram/direct/fragment/cardgallery/model/DirectTextCardViewModel$ViewState;"
            goto Ld
        L1b:
            java.lang.Class<X.Eau> r3 = X.C32729Eau.class
            r1 = 4
            java.lang.String r4 = "calculateViewState"
            java.lang.String r5 = "calculateViewState(Lcom/instagram/direct/fragment/channels/discovery/base/ChannelDiscoveryViewModel$FetchStatus;Ljava/util/List;Ljava/util/List;)Lcom/instagram/direct/fragment/channels/discovery/base/ChannelDiscoveryViewModel$ViewState;"
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GSX.<init>(java.lang.Object, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.A00) {
            case 0:
                String str = (String) obj;
                User user = (User) obj2;
                List list = (List) obj3;
                C05A c05a = ((C31835Dyu) this.receiver).A08;
                C32050E6c c32050E6c = null;
                if (c05a.getValue() != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (C14360o3.A0K(((C32050E6c) next).A05, c05a.getValue())) {
                                c32050E6c = next;
                            }
                        }
                    }
                    c32050E6c = c32050E6c;
                }
                return new C45024JwF(c32050E6c, user, str);
            case 1:
                EnumC33356Eop enumC33356Eop = (EnumC33356Eop) obj;
                List list2 = (List) obj2;
                List list3 = (List) obj3;
                ArrayList A1N = AbstractC16960so.A1N(new C36184Fxy((EnumC33424Epv) ((AbstractC32730Eaw) this.receiver).A00.getValue()));
                if (AbstractC166987dD.A1b(list2)) {
                    A1N.add(new C43960Jc9(C05F.A01, null, "channel_directory_invites_header", 2131959581, false, false));
                    A1N.addAll(list2);
                }
                if (AbstractC166987dD.A1b(list3)) {
                    A1N.add(new C43960Jc9(C05F.A00, null, "channel_directory_suggestions_header", 2131959690, true, false));
                    A1N.addAll(list3);
                }
                return new FIV(enumC33356Eop, A1N);
            default:
                List list4 = (List) obj;
                List list5 = (List) obj2;
                List list6 = (List) obj3;
                C31846DzE c31846DzE = (C31846DzE) this.receiver;
                C01L A1I = C0eM.A1I();
                if (c31846DzE.A08) {
                    A1I.add(new EY4(BHS.A00(new Object[0], 2131974826)));
                }
                if (list4 != null) {
                    if (AbstractC166987dD.A1b(list4)) {
                        E91.A00(A1I, new Object[0], 2131974805);
                        boolean A06 = C18U.A06(C06090Tz.A05, c31846DzE.A01, 36318638591973754L);
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            User A15 = AbstractC25226BEj.A15(it2);
                            A15.A0Z();
                            A1I.add(C31846DzE.A00(c31846DzE, A15, A06));
                        }
                        if (A06 && !c31846DzE.A04.A01.getBoolean("has_seen_subscription_notification_settings_tooltip", false)) {
                            c31846DzE.A05.Egh(new C32917Edy(BHS.A00(new Object[0], 2131974837)));
                        }
                    }
                    if (list5 != null) {
                        if (AbstractC166987dD.A1b(list5)) {
                            E91.A00(A1I, new Object[0], 2131974803);
                            Iterator it3 = C31846DzE.A01(list5).iterator();
                            while (it3.hasNext()) {
                                User A152 = AbstractC25226BEj.A15(it3);
                                A152.A0Z();
                                A1I.add(C31846DzE.A00(c31846DzE, A152, false));
                            }
                        }
                        if (AbstractC166987dD.A1b(list6)) {
                            E91.A00(A1I, new Object[0], 2131974802);
                            Iterator it4 = C31846DzE.A01(list6).iterator();
                            while (it4.hasNext()) {
                                User A153 = AbstractC25226BEj.A15(it4);
                                A153.A0Z();
                                A1I.add(C31846DzE.A00(c31846DzE, A153, false));
                            }
                        }
                    }
                }
                if (AbstractC25226BEj.A1b(A1I)) {
                    A1I.add(C37384GdQ.A00(c31846DzE));
                }
                return C0eM.A1J(A1I);
        }
    }
}
