package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.88I, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C88I extends C88E {
    public boolean A00;
    public final AnonymousClass891 A01;
    public final C81J A02;
    public final java.util.Set A03;

    /* JADX WARN: Type inference failed for: r1v1, types: [X.895, X.89B, java.lang.Object] */
    public C88I(View view, InterfaceC11380iw interfaceC11380iw, C3I9 c3i9, TargetViewSizeProvider targetViewSizeProvider, C81J c81j, AnonymousClass880 anonymousClass880, InterfaceC1810081c interfaceC1810081c, AnonymousClass844 anonymousClass844) {
        super(view, interfaceC11380iw, c3i9, targetViewSizeProvider, c81j, anonymousClass880, interfaceC1810081c, anonymousClass844);
        this.A02 = c81j;
        this.A03 = new LinkedHashSet();
        String str = c81j.A2d;
        C88X c88x = null;
        if (str != null) {
            UserSession userSession = this.A0C;
            C14360o3.A06(userSession);
            User A02 = AnonymousClass189.A00(userSession).A02(str);
            if (A02 != null) {
                C189128Zd c189128Zd = new C189128Zd(null, null, C88Z.A0X, A02.Bhu(), null, null, A02.getUsername(), null);
                c189128Zd.A07 = A02.getId();
                c88x = new C88X(c189128Zd);
            }
        }
        this.A01 = new AnonymousClass891(this.A06, this.A09, c88x == null ? super.A00 : c88x, this.A0C, new AnonymousClass890() { // from class: X.893
            @Override // X.AnonymousClass890
            public final void DA6(List list) {
                boolean z;
                Object obj;
                ArrayList arrayList = new ArrayList(list);
                C88I c88i = C88I.this;
                C88M c88m = c88i.A0H;
                c88m.A06(arrayList);
                AnonymousClass880 anonymousClass8802 = c88i.A0J;
                anonymousClass8802.A00().ECt();
                anonymousClass8802.A00().FAh();
                C81J c81j2 = c88i.A02;
                String str2 = c81j2.A2d;
                if (str2 != null && !c88i.A00) {
                    List unmodifiableList = Collections.unmodifiableList(c88m.A08);
                    C14360o3.A07(unmodifiableList);
                    Iterator it = unmodifiableList.iterator();
                    int i = 0;
                    while (true) {
                        if (it.hasNext()) {
                            if (C14360o3.A0K(((C88X) it.next()).getId(), str2)) {
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            i = -1;
                            break;
                        }
                    }
                    Integer valueOf = Integer.valueOf(i);
                    z = true;
                    if (valueOf.intValue() == -1) {
                        valueOf = null;
                    }
                    anonymousClass8802.A00().EVD(false);
                    if (valueOf != null) {
                        c88m.A03(valueOf.intValue());
                    }
                    c88i.A00 = c88i.A01.A02;
                } else {
                    ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((C88X) it2.next()).getId());
                    }
                    java.util.Set A0k = AbstractC001800i.A0k(arrayList2);
                    java.util.Set set = c88i.A03;
                    boolean z2 = false;
                    if (!C14360o3.A0K(A0k, set)) {
                        if (!set.isEmpty()) {
                            java.util.Set A0m = AbstractC001800i.A0m(A0k, set);
                            if (A0m.size() == 1) {
                                obj = AbstractC001800i.A0A(A0m);
                            } else {
                                obj = null;
                            }
                            Iterator it3 = list.iterator();
                            int i2 = 0;
                            while (true) {
                                if (it3.hasNext()) {
                                    if (C14360o3.A0K(((C88X) it3.next()).getId(), obj)) {
                                        break;
                                    } else {
                                        i2++;
                                    }
                                } else {
                                    i2 = -1;
                                    break;
                                }
                            }
                            int intValue = Integer.valueOf(i2).intValue();
                            if (c88m.A07(intValue)) {
                                anonymousClass8802.A00().EVD(false);
                                c88m.A03(intValue);
                                anonymousClass8802.A00().EVD(true);
                                z2 = true;
                            }
                            set.clear();
                        }
                        set.addAll(A0k);
                        if (z2) {
                            return;
                        }
                    }
                    if (c81j2.A2d == null) {
                        UserSession userSession2 = c88i.A0C;
                        C14360o3.A06(userSession2);
                        String str3 = null;
                        String string = AbstractC23021Ah.A00(userSession2).A01.getString("quick_snap_last_selected_dial_id", null);
                        if (string != null) {
                            C88X A01 = c88m.A01();
                            if (A01 != null) {
                                str3 = A01.getId();
                            }
                            if (!string.equals(str3)) {
                                List unmodifiableList2 = Collections.unmodifiableList(c88m.A08);
                                C14360o3.A07(unmodifiableList2);
                                Iterator it4 = unmodifiableList2.iterator();
                                int i3 = 0;
                                while (true) {
                                    if (it4.hasNext()) {
                                        if (C14360o3.A0K(((C88X) it4.next()).getId(), string)) {
                                            break;
                                        } else {
                                            i3++;
                                        }
                                    } else {
                                        i3 = -1;
                                        break;
                                    }
                                }
                                int intValue2 = Integer.valueOf(i3).intValue();
                                z = true;
                                if (intValue2 != -1) {
                                    anonymousClass8802.A00().EVD(false);
                                    c88m.A03(intValue2);
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                anonymousClass8802.A00().EVD(z);
            }
        }, true);
        C88M c88m = this.A0H;
        ?? obj = new Object();
        c88m.A04 = obj;
        C174437pd c174437pd = c88m.A02;
        if (c174437pd != null) {
            c174437pd.A00 = obj;
        }
    }

    public final void A0B() {
        String str;
        UserSession userSession = this.A0C;
        C14360o3.A06(userSession);
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        C88X A01 = this.A0H.A01();
        if (A01 != null) {
            str = A01.getId();
        } else {
            str = null;
        }
        InterfaceC19610xo ARD = A00.A01.ARD();
        ARD.E7K("quick_snap_last_selected_dial_id", str);
        ARD.apply();
    }
}
