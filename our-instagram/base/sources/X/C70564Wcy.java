package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Wcy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70564Wcy implements C2JL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C70564Wcy(C35029Fc2 c35029Fc2, C006802i c006802i, AbstractC12990ll abstractC12990ll, List list, int i) {
        this.A00 = i;
        this.A02 = c35029Fc2;
        this.A04 = abstractC12990ll;
        this.A03 = c006802i;
        this.A01 = list;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        C006802i c006802i;
        int i;
        String str;
        C35029Fc2 c35029Fc2;
        AbstractC12990ll abstractC12990ll;
        String str2;
        switch (this.A00) {
            case 0:
                ((C35029Fc2) this.A02).A02((AbstractC12990ll) this.A04, "facebook_active_session", "other_exception");
                c006802i = (C006802i) this.A03;
                i = 896612552;
                str = "add_active_fb_account_end";
                c006802i.markerPoint(i, str);
                return;
            case 1:
                ((C006802i) this.A03).markerPoint(896612552, "add_active_msgr_account_end");
                c35029Fc2 = (C35029Fc2) this.A02;
                abstractC12990ll = (AbstractC12990ll) this.A04;
                str2 = "messenger_active_session";
                c35029Fc2.A02(abstractC12990ll, str2, "other_exception");
                return;
            case 2:
                ((C006802i) this.A03).markerPoint(896612552, "add_active_fblite_account_end");
                c35029Fc2 = (C35029Fc2) this.A02;
                abstractC12990ll = (AbstractC12990ll) this.A04;
                str2 = "facebook_lite_active_session";
                c35029Fc2.A02(abstractC12990ll, str2, "other_exception");
                return;
            case 3:
                ((C35029Fc2) this.A02).A02((AbstractC12990ll) this.A04, "facebook_local_auth", "other_exception");
                c006802i = (C006802i) this.A03;
                i = 896612552;
                str = "add_saved_fb_accounts_end";
                c006802i.markerPoint(i, str);
                return;
            case 4:
                ((C006802i) this.A03).markerPoint(896612552, "add_saved_msgr_accounts_end");
                c35029Fc2 = (C35029Fc2) this.A02;
                abstractC12990ll = (AbstractC12990ll) this.A04;
                str2 = "messenger_local_auth";
                c35029Fc2.A02(abstractC12990ll, str2, "other_exception");
                return;
            default:
                return;
        }
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        C006802i c006802i;
        String str;
        switch (this.A00) {
            case 0:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                if (list != null) {
                    List list2 = (List) this.A01;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C203128yU c203128yU = ((C203148yW) it.next()).A01;
                        String str2 = c203128yU.A01.A02;
                        list2.add(AbstractC25232BEp.A1F("token", c203128yU.A00, new C09530e4("uid", str2), new C09530e4("credential_type", "facebook_active_session")));
                        i2++;
                        arrayList.add(WEK.A01(str2));
                    }
                }
                i = 896612552;
                C35029Fc2 c35029Fc2 = (C35029Fc2) this.A02;
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A04;
                if (i2 == 0) {
                    c35029Fc2.A01(abstractC12990ll, "facebook_active_session");
                } else {
                    c35029Fc2.A03(abstractC12990ll, "facebook_active_session", arrayList);
                    ((C006802i) this.A03).markerAnnotate(896612552, "count_of_fb_sso_accounts", i2);
                }
                c006802i = (C006802i) this.A03;
                str = "add_active_fb_account_end";
                break;
            case 1:
                List<C203148yW> list3 = (List) obj;
                ArrayList arrayList2 = new ArrayList();
                int i3 = 0;
                if (list3 != null) {
                    List list4 = (List) this.A01;
                    for (C203148yW c203148yW : list3) {
                        C09530e4 c09530e4 = new C09530e4("account_type", "");
                        C203128yU c203128yU2 = c203148yW.A01;
                        String str3 = c203128yU2.A01.A02;
                        list4.add(AbstractC167017dG.A0u("token", c203128yU2.A00, c09530e4, new C09530e4("uid", str3), new C09530e4("credential_type", "messenger_active_session")));
                        i3++;
                        arrayList2.add(WEK.A01(str3));
                    }
                }
                i = 896612552;
                C35029Fc2 c35029Fc22 = (C35029Fc2) this.A02;
                AbstractC12990ll abstractC12990ll2 = (AbstractC12990ll) this.A04;
                if (i3 == 0) {
                    c35029Fc22.A01(abstractC12990ll2, "messenger_active_session");
                } else {
                    c35029Fc22.A03(abstractC12990ll2, "messenger_active_session", arrayList2);
                    ((C006802i) this.A03).markerAnnotate(896612552, "count_of_msgr_sso_accounts", i3);
                }
                c006802i = (C006802i) this.A03;
                str = "add_active_msgr_account_end";
                break;
            case 2:
                List<C203148yW> list5 = (List) obj;
                if (list5 != null) {
                    List list6 = (List) this.A01;
                    String str4 = "";
                    boolean z = false;
                    for (C203148yW c203148yW2 : list5) {
                        C09530e4 c09530e42 = new C09530e4("account_type", "");
                        C203128yU c203128yU3 = c203148yW2.A01;
                        str4 = c203128yU3.A01.A02;
                        list6.add(AbstractC167017dG.A0u("token", c203128yU3.A00, c09530e42, new C09530e4("uid", str4), new C09530e4("credential_type", "facebook_lite_active_session")));
                        z = true;
                    }
                    if (z) {
                        ((C35029Fc2) this.A02).A03((AbstractC12990ll) this.A04, "facebook_lite_active_session", AbstractC16960so.A1M(str4));
                        ((C006802i) this.A03).markerPoint(896612552, "add_active_fblite_account_end");
                        return;
                    }
                }
                ((C35029Fc2) this.A02).A01((AbstractC12990ll) this.A04, "facebook_lite_active_session");
                ((C006802i) this.A03).markerPoint(896612552, "add_active_fblite_account_end");
                return;
            case 3:
                List<C203148yW> list7 = (List) obj;
                ArrayList arrayList3 = new ArrayList();
                int i4 = 0;
                if (list7 != null) {
                    List list8 = (List) this.A01;
                    for (C203148yW c203148yW3 : list7) {
                        C09530e4 c09530e43 = new C09530e4("account_type", "");
                        C203128yU c203128yU4 = c203148yW3.A01;
                        String str5 = c203128yU4.A01.A02;
                        list8.add(AbstractC167017dG.A0u("token", c203128yU4.A00, c09530e43, new C09530e4("uid", str5), new C09530e4("credential_type", "facebook_local_auth")));
                        i4++;
                        arrayList3.add(WEK.A01(str5));
                    }
                }
                i = 896612552;
                C35029Fc2 c35029Fc23 = (C35029Fc2) this.A02;
                AbstractC12990ll abstractC12990ll3 = (AbstractC12990ll) this.A04;
                if (i4 == 0) {
                    c35029Fc23.A01(abstractC12990ll3, "facebook_local_auth");
                } else {
                    c35029Fc23.A03(abstractC12990ll3, "facebook_local_auth", arrayList3);
                    ((C006802i) this.A03).markerAnnotate(896612552, "count_of_fb_local_auth_accounts", i4);
                }
                c006802i = (C006802i) this.A03;
                str = "add_saved_fb_accounts_end";
                break;
            case 4:
                List<C203148yW> list9 = (List) obj;
                ArrayList arrayList4 = new ArrayList();
                int i5 = 0;
                if (list9 != null) {
                    List list10 = (List) this.A01;
                    for (C203148yW c203148yW4 : list9) {
                        C09530e4 c09530e44 = new C09530e4("account_type", "");
                        C203128yU c203128yU5 = c203148yW4.A01;
                        String str6 = c203128yU5.A01.A02;
                        list10.add(AbstractC167017dG.A0u("token", c203128yU5.A00, c09530e44, new C09530e4("uid", str6), new C09530e4("credential_type", "messenger_local_auth")));
                        i5++;
                        arrayList4.add(WEK.A01(str6));
                    }
                }
                i = 896612552;
                C35029Fc2 c35029Fc24 = (C35029Fc2) this.A02;
                AbstractC12990ll abstractC12990ll4 = (AbstractC12990ll) this.A04;
                if (i5 == 0) {
                    c35029Fc24.A01(abstractC12990ll4, "messenger_local_auth");
                } else {
                    c35029Fc24.A03(abstractC12990ll4, "messenger_local_auth", arrayList4);
                    ((C006802i) this.A03).markerAnnotate(896612552, "count_of_msgr_local_auth_accounts", i5);
                }
                c006802i = (C006802i) this.A03;
                str = "add_saved_msgr_accounts_end";
                break;
            default:
                return;
        }
        c006802i.markerPoint(i, str);
    }
}
