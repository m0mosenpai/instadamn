package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2xT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65312xT extends C65322xU {
    public C3XG A00;
    public String A01;
    public boolean A02;
    public final Object A03;

    public final void A0G(C61762rd c61762rd, String str, List list, boolean z) {
        List A02;
        C14360o3.A0B(list, 0);
        C14360o3.A0B(c61762rd, 1);
        synchronized (this.A03) {
            if (str != null) {
                if (str.length() != 0) {
                    this.A01 = str;
                }
            }
            if (list.isEmpty()) {
                A02 = new ArrayList();
            } else {
                A02 = C15500q5.A02(list);
            }
            if (str == null) {
                str = "";
            }
            if (((C3ZF) C3ZF.A01.get(str)) != null) {
                C0w9.A03("MainFeedItemList", "pagination source exists when FeedItemGroupSet doesn't. Potentially delivering feed recs above EOF.");
            }
            int size = A02.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    C3XG c3xg = (C3XG) A02.get(size);
                    if (C1XV.A0O == c3xg.A06) {
                        InterfaceC38381qS interfaceC38381qS = c3xg.A05;
                        C14360o3.A0C(interfaceC38381qS, "null cannot be cast to non-null type com.instagram.feed.feeditem.FeedItemGroupSet");
                        C110424yE c110424yE = (C110424yE) interfaceC38381qS;
                        String str2 = ((C110394yB) c110424yE.A00).A06;
                        if (str2 != null) {
                            HashMap hashMap = new HashMap();
                            for (C110434yF c110434yF : c110424yE.A01()) {
                                String str3 = c110434yF.A03;
                                if (str3 != null) {
                                    hashMap.put(str3, c110434yF);
                                }
                            }
                            String str4 = c110424yE.A01;
                            if (str4 == null) {
                                str4 = "";
                            }
                            C110434yF c110434yF2 = (C110434yF) hashMap.get(str4);
                            if (c110434yF2 != null) {
                                this.A01 = c110434yF2.A01;
                            }
                        }
                        C14360o3.A0C(interfaceC38381qS, "null cannot be cast to non-null type com.instagram.feed.feeditem.FeedItemGroupSet");
                        Map map = c61762rd.A09;
                        if (((C110454yH) map.get(str2)) == null) {
                            C110454yH c110454yH = new C110454yH();
                            if (str2 == null) {
                                str2 = "";
                            }
                            map.put(str2, c110454yH);
                        }
                    } else if (i < 0) {
                        break;
                    } else {
                        size = i;
                    }
                }
            }
            int size2 = A02.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    break;
                }
                C3XG c3xg2 = (C3XG) A02.get(i2);
                if (c3xg2.A06 == C1XV.A0F) {
                    InterfaceC38381qS interfaceC38381qS2 = c3xg2.A05;
                    C14360o3.A0C(interfaceC38381qS2, "null cannot be cast to non-null type com.instagram.feed.feeditem.EndOfFeedDemarcatorUnit");
                    C1XV c1xv = ((C3CL) interfaceC38381qS2).A00;
                    if (c1xv == null) {
                        break;
                    }
                    int i3 = i2 + 1;
                    if (i3 < A02.size() && ((C3XG) A02.get(i3)).A06 == c1xv) {
                        C3XG c3xg3 = (C3XG) A02.get(i3);
                        if (c3xg3.A06 == C1XV.A0C) {
                            InterfaceC38381qS interfaceC38381qS3 = c3xg3.A05;
                            C14360o3.A0C(interfaceC38381qS3, "null cannot be cast to non-null type com.instagram.feed.feeditem.ClipsNetego");
                            c61762rd.A01((C76403bk) interfaceC38381qS3).A04 = true;
                        }
                    } else {
                        C7L c7l = (C7L) C7L.A01.get(c1xv);
                        if (c7l == null) {
                            break;
                        }
                        C29278CvZ c29278CvZ = new C29278CvZ(c7l);
                        C3XG c3xg4 = new C3XG(c29278CvZ, C1XV.A0X, c29278CvZ.getId());
                        this.A00 = c3xg4;
                        A02.add(i3, c3xg4);
                    }
                }
                i2++;
            }
            Iterator it = A02.iterator();
            while (it.hasNext()) {
                AbstractC65332xV.A01(this, it.next(), ((AbstractC65332xV) this).A02.size(), z);
            }
        }
    }

    @Override // X.AbstractC65332xV
    public final void A04() {
        synchronized (this.A03) {
            this.A00 = null;
            this.A01 = null;
            super.A04();
        }
    }

    public C65312xT(UserSession userSession) {
        super(userSession);
        this.A03 = new Object();
    }
}
