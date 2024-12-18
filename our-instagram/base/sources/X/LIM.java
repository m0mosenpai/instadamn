package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.VideoVersionIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class LIM {
    public static final LIM A00 = new Object();

    public static final Integer A00(EnumC40111tc enumC40111tc) {
        int ordinal;
        if (enumC40111tc != null && (ordinal = enumC40111tc.ordinal()) != 0) {
            if (ordinal != 1) {
                if (ordinal != 7) {
                    if (ordinal != 29) {
                        if (ordinal == 30) {
                            return C05F.A0j;
                        }
                    } else {
                        return C05F.A0Y;
                    }
                } else {
                    return C05F.A01;
                }
            } else {
                return C05F.A0N;
            }
        }
        return C05F.A00;
    }

    public final List A01(C83403nh c83403nh) {
        AnonymousClass544 anonymousClass544;
        String str;
        ExtendedImageUrl extendedImageUrl;
        String str2;
        C38321qM c38321qM;
        List list;
        Object obj = c83403nh.A1T;
        if (obj instanceof C38321qM) {
            c38321qM = (C38321qM) obj;
        } else if (obj instanceof C101584hT) {
            c38321qM = ((C101584hT) obj).A05;
        } else {
            if (obj instanceof C4G2) {
                str = ((C4G2) obj).A02();
            } else {
                if (obj instanceof List) {
                    ArrayList A1E = AbstractC166987dD.A1E();
                    for (Object obj2 : (List) obj) {
                        if ((obj2 instanceof C910143t) && (extendedImageUrl = ((C910143t) obj2).A0X) != null && (str2 = extendedImageUrl.A0A) != null) {
                            A1E.add(str2);
                        }
                    }
                    return A1E;
                }
                if (obj instanceof String) {
                    synchronized (c83403nh) {
                        anonymousClass544 = c83403nh.A0V;
                    }
                    if (anonymousClass544 != null) {
                        str = anonymousClass544.A01;
                    } else {
                        str = null;
                    }
                } else {
                    return C16930sl.A00;
                }
            }
            return AbstractC16960so.A1O(str);
        }
        if (c38321qM == null) {
            C0K8.A0C("ArmadilloExpressMediaUtil", "Invalid DirectMedia");
            return C16930sl.A00;
        }
        C01L A1I = C0eM.A1I();
        ImageInfo A1t = c38321qM.A1t();
        if (A1t == null || (list = A1t.AlQ()) == null) {
            list = C16930sl.A00;
        }
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(((ExtendedImageUrl) it.next()).A0A);
        }
        A1I.addAll(A0q);
        List CFe = c38321qM.A0C.CFe();
        if (CFe == null) {
            CFe = C16930sl.A00;
        }
        ArrayList A1E2 = AbstractC166987dD.A1E();
        Iterator it2 = CFe.iterator();
        while (it2.hasNext()) {
            String url = ((VideoVersionIntf) it2.next()).getUrl();
            if (url != null) {
                A1E2.add(url);
            }
        }
        A1I.addAll(A1E2);
        return C0eM.A1J(A1I);
    }
}
