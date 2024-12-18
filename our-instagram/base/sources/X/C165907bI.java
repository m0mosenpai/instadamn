package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7bI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165907bI implements InterfaceC13000lm {
    public double A00;
    public int A01;
    public boolean A02;
    public List A03;
    public final UserSession A04;
    public final List A05;
    public final List A06;
    public final List A07;
    public final List A08;
    public final Map A09;
    public final InterfaceC09390do A0A;

    public C165907bI(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        this.A05 = new ArrayList();
        this.A03 = new ArrayList();
        this.A06 = new ArrayList();
        this.A07 = new ArrayList();
        this.A00 = Double.MIN_VALUE;
        this.A08 = new ArrayList();
        this.A01 = -1;
        this.A0A = AbstractC09440dt.A00(EnumC09460dv.A02, new C206869Dr(this, 27));
        this.A09 = new LinkedHashMap();
    }

    public final int A03(String str) {
        C14360o3.A0B(str, 0);
        List A00 = A00(this);
        ArrayList arrayList = new ArrayList();
        for (Object obj : A00) {
            if (((C51u) obj).A02 != null) {
                arrayList.add(obj);
            }
        }
        for (Object obj2 : arrayList) {
            if (C14360o3.A0K(((C9CG) ((C51u) obj2).A01).A03, str)) {
                if (obj2 != null) {
                    return arrayList.indexOf(obj2);
                }
                return -1;
            }
        }
        return -1;
    }

    public final C83403nh A06(String str) {
        C14360o3.A0B(str, 0);
        for (C51u c51u : this.A05) {
            if (str.equals(((C9CG) c51u.A01).A03)) {
                return (C83403nh) c51u.A00;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public final void A08(String str, boolean z) {
        Object obj;
        ?? arrayList;
        Object obj2;
        C83403nh c83403nh;
        if (z) {
            List list = this.A05;
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (C14360o3.A0K(((C83403nh) ((C51u) obj2).A00).A0h(), str)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            C51u c51u = (C51u) obj2;
            if (c51u != null && (c83403nh = (C83403nh) c51u.A00) != null && A02(c83403nh)) {
                arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (A02((C83403nh) ((C51u) obj3).A00)) {
                        arrayList.add(obj3);
                    }
                }
                this.A03 = AbstractC001800i.A0U(arrayList);
            }
        }
        List<List> list2 = ((C7Om) this.A0A.getValue()).A00;
        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(list2, 10));
        for (List list3 : list2) {
            ArrayList arrayList3 = new ArrayList(AbstractC06950Ym.A1E(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                C83403nh c83403nh2 = (C83403nh) ((C09530e4) it2.next()).A00;
                String A0h = c83403nh2.A0h();
                if (A0h == null) {
                    A0h = c83403nh2.A0g();
                }
                arrayList3.add(A0h);
            }
            arrayList2.add(arrayList3);
        }
        Iterator it3 = arrayList2.iterator();
        while (true) {
            if (it3.hasNext()) {
                obj = it3.next();
                if (((List) obj).contains(str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Iterable iterable = (Iterable) obj;
        if (iterable != null) {
            List A0X = AbstractC001800i.A0X(iterable);
            if (C7M3.A00(this.A04)) {
                List list4 = this.A05;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : list4) {
                    if (A0X.contains(((C9CG) ((C51u) obj4).A01).A03)) {
                        arrayList4.add(obj4);
                    }
                }
                arrayList = AbstractC001800i.A0Y(arrayList4);
                this.A03 = AbstractC001800i.A0U(arrayList);
            }
        }
        List list5 = this.A05;
        arrayList = new ArrayList();
        for (Object obj5 : list5) {
            if (C14360o3.A0K(((C9CG) ((C51u) obj5).A01).A03, str)) {
                arrayList.add(obj5);
            }
        }
        this.A03 = AbstractC001800i.A0U(arrayList);
    }

    public static final List A00(C165907bI c165907bI) {
        if (C7M3.A00(c165907bI.A04)) {
            return c165907bI.A03;
        }
        return c165907bI.A05;
    }

    public static final boolean A02(C83403nh c83403nh) {
        Object obj = c83403nh.A1T;
        if (obj instanceof List) {
            C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            if (((List) obj).size() > 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final ImmutableList A05(boolean z) {
        List list;
        ArrayList arrayList = new ArrayList();
        for (C51u c51u : A00(this)) {
            if (z) {
                C83403nh c83403nh = (C83403nh) c51u.A00;
                if (A02(c83403nh)) {
                    Object obj = c83403nh.A1T;
                    if ((obj instanceof List) && (list = (List) obj) != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            it.next();
                            arrayList.add(c51u.A01);
                        }
                    }
                }
            }
            if (c51u.A02 != null) {
                arrayList.add(c51u.A01);
            }
        }
        ImmutableList copyOf = ImmutableList.copyOf((Collection) arrayList);
        C14360o3.A07(copyOf);
        return copyOf;
    }

    public final void A07() {
        this.A05.clear();
        this.A08.clear();
        this.A03.clear();
        ((C7Om) this.A0A.getValue()).A00.clear();
        this.A09.clear();
    }

    public static final void A01(C165907bI c165907bI, C83403nh c83403nh, List list, int i) {
        C910143t c910143t;
        String str;
        List list2;
        String str2;
        Boolean bool = null;
        if (A02(c83403nh)) {
            Map map = c165907bI.A09;
            map.put(c83403nh, new ArrayList());
            Object obj = c83403nh.A1T;
            if ((obj instanceof List) && (list2 = (List) obj) != null) {
                int size = list2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    List list3 = (List) map.get(c83403nh);
                    if (list3 != null) {
                        list3.add(C128085qc.A00());
                    }
                    Object obj2 = c83403nh.A1T;
                    C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    Object obj3 = ((List) obj2).get(i2);
                    if ((obj3 instanceof C910143t) && (str2 = ((C910143t) obj3).A0w) != null) {
                        android.net.Uri A03 = AbstractC08820cl.A03(str2);
                        C14360o3.A07(A03);
                        String queryParameter = A03.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        if (queryParameter != null) {
                            UserSession userSession = c165907bI.A04;
                            C1DX A00 = C1DW.A00(userSession);
                            String path = A03.getPath();
                            Boolean bool2 = null;
                            if (path != null) {
                                bool2 = Boolean.valueOf(AbstractC001900j.A0a(path, "reel", false));
                            }
                            C38321qM A02 = A00.A02(queryParameter);
                            if (A02 != null && C14360o3.A0K(bool2, true)) {
                                List list4 = (List) map.get(c83403nh);
                                if (list4 != null) {
                                    list4.set(i2, C128085qc.A02(A02));
                                }
                            } else if (C14360o3.A0K(bool2, true)) {
                                FVK.A01(userSession, C1GJ.A01(), new C29280Cvb(c165907bI, c83403nh, i2), queryParameter);
                            }
                        }
                    }
                }
                return;
            }
            return;
        }
        ImmutableList A0H = c83403nh.A0H();
        if (A0H != null && (c910143t = (C910143t) AbstractC001800i.A0J(A0H)) != null && (str = c910143t.A0w) != null) {
            android.net.Uri A032 = AbstractC08820cl.A03(str);
            C14360o3.A07(A032);
            String queryParameter2 = A032.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            if (queryParameter2 != null) {
                UserSession userSession2 = c165907bI.A04;
                C1DX A002 = C1DW.A00(userSession2);
                String path2 = A032.getPath();
                if (path2 != null) {
                    bool = Boolean.valueOf(AbstractC001900j.A0a(path2, "reel", false));
                }
                C38321qM A022 = A002.A02(queryParameter2);
                if (A022 != null && C14360o3.A0K(bool, true)) {
                    c83403nh.A15(A022);
                    return;
                }
                if (!C14360o3.A0K(bool, true)) {
                    return;
                }
                FVK.A01(userSession2, C1GJ.A01(), new C29283Cve(c83403nh, A002, list, i), queryParameter2);
                int i3 = c165907bI.A01;
                if (i >= i3) {
                    return;
                }
                c165907bI.A01 = i3 - 1;
            }
        }
    }

    public final ImmutableList A04() {
        List A00 = A00(this);
        ArrayList arrayList = new ArrayList();
        int size = A00.size();
        for (int i = 0; i < size; i++) {
            C51u c51u = (C51u) A00.get(i);
            C83403nh c83403nh = (C83403nh) c51u.A00;
            if (this.A02 || !A02(c83403nh)) {
                if (A02(c83403nh)) {
                    Map map = this.A09;
                    if (map.get(c83403nh) == null) {
                        A01(this, c83403nh, A00, i);
                    }
                    List list = (List) map.get(c83403nh);
                    if (list == null) {
                        list = C16930sl.A00;
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new C09530e4(c83403nh, it.next()));
                    }
                } else {
                    if (c83403nh.A0s == null) {
                        A01(this, c83403nh, A00, i);
                    }
                    C38321qM c38321qM = c83403nh.A0s;
                    if (c38321qM != null) {
                        arrayList.add(new C09530e4(c83403nh, C128085qc.A02(c38321qM)));
                        A00.set(i, new C51u(c51u.A00, c51u.A01, C128085qc.A02(c38321qM)));
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object obj = ((C09530e4) it2.next()).A01;
            ((C120985dq) obj).A08 = C16930sl.A00;
            arrayList2.add(obj);
        }
        ImmutableList copyOf = ImmutableList.copyOf((Collection) arrayList2);
        C14360o3.A07(copyOf);
        return copyOf;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        A07();
    }
}
