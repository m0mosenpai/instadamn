package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.78p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1583078p implements InterfaceC1582578k {
    public static final C1583078p A00 = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.List] */
    @Override // X.InterfaceC1582578k
    public final C7QY AMI(Context context, UserSession userSession, C7QL c7ql, AnonymousClass988 anonymousClass988, C160787Im c160787Im) {
        boolean z;
        C158747Ak c158747Ak;
        String A02;
        ArrayList arrayList;
        boolean z2;
        List list;
        C1583978z c1583978z;
        String string;
        C9C9 c9c9;
        C9CP c9cp;
        List list2;
        List list3;
        String A022;
        String str;
        C31200Dnj c31200Dnj;
        String str2;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c7ql, 2);
        C14360o3.A0B(anonymousClass988, 3);
        C14360o3.A0B(c160787Im, 4);
        C9E8 c9e8 = new C9E8(userSession, 26);
        C7TW c7tw = (C7TW) userSession.A01(C7TV.class, C7TU.A00);
        C83403nh c83403nh = c160787Im.A0e;
        C7QX A002 = C7QM.A00(context, userSession, anonymousClass988, c160787Im, c83403nh.A10);
        C14360o3.A0B(c7tw, 5);
        C7TT c7tt = c160787Im.A0G;
        if (c7tt.A08 == 29) {
            z = c7tt.A0n;
        } else {
            z = true;
        }
        Object obj = c83403nh.A1T;
        if (!(obj instanceof C910143t)) {
            if (obj instanceof List) {
                C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                if (((List) obj).get(0) instanceof C910143t) {
                    Object obj2 = c83403nh.A1T;
                    C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    obj = ((List) obj2).get(0);
                }
            }
            throw new IllegalArgumentException("Unexpected message content object type");
        }
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.GenericFBAttachment");
        C910143t c910143t = (C910143t) obj;
        C83553nw c83553nw = c910143t.A0O;
        if (c83553nw == null && c160787Im.A0G.A08 != 29) {
            throw new IllegalArgumentException("Poll Message missing action log");
        }
        String str3 = null;
        if (c83553nw != null) {
            c158747Ak = LBz.A01(context, userSession, c160787Im, c7ql.A03, c83553nw, c83403nh.A2P, c160787Im.A0G.A0x, C14360o3.A0K(userSession.userId, c83403nh.BtE()), false);
        } else {
            c158747Ak = null;
        }
        C7TT c7tt2 = c160787Im.A0G;
        InterfaceC83733oI interfaceC83733oI = c7tt2.A0P;
        if (c910143t.A0D != 0 && z) {
            if (interfaceC83733oI != null && AbstractC1345466e.A02(interfaceC83733oI) != null) {
                str2 = AbstractC1345466e.A01(interfaceC83733oI).A00;
            } else if (interfaceC83733oI instanceof MsysThreadId) {
                str2 = String.valueOf(((MsysThreadId) interfaceC83733oI).A00);
            } else {
                str2 = null;
            }
            A02 = AbstractC13670mt.A06("instagram://thread/%s/group_polls/%s", str2, Long.valueOf(c910143t.A0D));
        } else {
            A02 = AbstractC1583478u.A02(interfaceC83733oI, c7tt2.A08);
        }
        String str4 = c83403nh.A1u;
        C14360o3.A07(str4);
        C9C9 c9c92 = new C9C9(A02, str4, 5);
        ImmutableList A01 = c910143t.A01();
        if (A01 != null) {
            arrayList = new ArrayList(AbstractC06950Ym.A1E(A01, 10));
            Iterator it = A01.iterator();
            while (it.hasNext()) {
                C9CP c9cp2 = (C9CP) it.next();
                String str5 = c9cp2.A04;
                String str6 = c9cp2.A05;
                if (z) {
                    A022 = c9cp2.A02;
                } else {
                    A022 = AbstractC1583478u.A02(interfaceC83733oI, c160787Im.A0G.A08);
                }
                C51755Mte c51755Mte = (C51755Mte) c9cp2.A01;
                if (c51755Mte != null && (c31200Dnj = (C31200Dnj) c51755Mte.A00) != null) {
                    str = c31200Dnj.A00;
                } else {
                    str = null;
                }
                arrayList.add(new C9CP((Integer) c9cp2.A00, str5, str6, A022, str, c9cp2.A03));
            }
        } else {
            arrayList = null;
        }
        if (c160787Im.A0G.A08 != 29 && !c7tw.A02(c83403nh.A0h())) {
            c9c9 = null;
            c1583978z = null;
        } else {
            C18A c18a = (C18A) c9e8.invoke();
            int i = c160787Im.A0G.A08;
            String str7 = c910143t.A19;
            if (str7 != null) {
                ArrayList arrayList2 = new ArrayList();
                C14360o3.A0B(c18a, 1);
                ImageUrl imageUrl = c910143t.A0N;
                if (imageUrl == null) {
                    User A023 = c18a.A02(c910143t.A18);
                    if (A023 != null) {
                        imageUrl = A023.Bhu();
                    } else {
                        imageUrl = null;
                    }
                }
                String str8 = c910143t.A1B;
                if (str8 == null) {
                    str8 = "";
                }
                if (i == 29) {
                    z2 = true;
                    list = A00(c910143t.A1Z);
                } else {
                    z2 = false;
                    List list4 = c910143t.A1c;
                    if (list4 != null) {
                        list = new ArrayList();
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            User A024 = c18a.A02((String) it2.next());
                            if (A024 != null) {
                                list.add(A024.Bhu());
                            }
                        }
                    } else {
                        list = C16930sl.A00;
                    }
                }
                arrayList2.add(new C45034JwP(str8, list, c910143t.A03, c910143t.A0H));
                String str9 = c910143t.A1C;
                if (str9 != null) {
                    if (z2) {
                        list2 = A00(c910143t.A1a);
                    } else {
                        List list5 = c910143t.A1d;
                        if (list5 != null) {
                            list2 = new ArrayList();
                            Iterator it3 = list5.iterator();
                            while (it3.hasNext()) {
                                User A025 = c18a.A02((String) it3.next());
                                if (A025 != null) {
                                    list2.add(A025.Bhu());
                                }
                            }
                        } else {
                            list2 = C16930sl.A00;
                        }
                    }
                    arrayList2.add(new C45034JwP(str9, list2, c910143t.A04, c910143t.A0I));
                    String str10 = c910143t.A1D;
                    if (str10 != null) {
                        if (z2) {
                            list3 = A00(c910143t.A1b);
                        } else {
                            List list6 = c910143t.A1e;
                            if (list6 != null) {
                                list3 = new ArrayList();
                                Iterator it4 = list6.iterator();
                                while (it4.hasNext()) {
                                    User A026 = c18a.A02((String) it4.next());
                                    if (A026 != null) {
                                        list3.add(A026.Bhu());
                                    }
                                }
                            } else {
                                list3 = C16930sl.A00;
                            }
                        }
                        arrayList2.add(new C45034JwP(str10, list3, c910143t.A05, c910143t.A0J));
                    }
                }
                long j = c910143t.A0D;
                String str11 = c910143t.A1A;
                c1583978z = new C1583978z(imageUrl, str7, str11, arrayList2, j);
                String str12 = c910143t.A16;
                String str13 = "";
                if (str12 == null) {
                    str12 = "";
                }
                String str14 = c910143t.A17;
                if (str14 == null) {
                    str14 = "";
                }
                if (str11 != null) {
                    str13 = str11;
                }
                String string2 = context.getString(2131960139, c1583978z.A02, c910143t.A15, str12, str14, str13);
                C14360o3.A07(string2);
                if (arrayList == null || (c9cp = (C9CP) AbstractC001800i.A0O(arrayList, 0)) == null || (string = c9cp.A04) == null) {
                    string = context.getResources().getString(2131960150);
                    C14360o3.A07(string);
                }
                c9c9 = new C9C9(string2, string, 3);
            } else {
                throw new IllegalStateException("poll message require a question");
            }
        }
        DirectMessageIdentifier A0V = c83403nh.A0V();
        EnumC910243u enumC910243u = EnumC910243u.SINGLE;
        User user = c160787Im.A0K;
        if (user != null) {
            str3 = user.getUsername();
        }
        return new C7QY(null, null, null, c9c92, c9c9, null, null, c158747Ak, A002, c7ql, null, null, null, null, c1583978z, null, enumC910243u, null, A0V, null, null, null, null, null, null, null, str3, null, null, null, null, null, null, null, null, null, arrayList, null, null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false);
    }

    public static final List A00(List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new SimpleImageUrl((String) it.next()));
            }
            return arrayList;
        }
        return C16930sl.A00;
    }
}
