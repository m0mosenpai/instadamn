package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class IPK {
    public static H6P parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l = null;
            C38321qM c38321qM = null;
            ArrayList arrayList = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (DatePickerDialogModule.ARG_DATE.equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("profile_pic_media_dict".equals(A0s)) {
                    c38321qM = C38321qM.A00(c16l);
                } else if ("published_media_dicts".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1J(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (AbstractC50531MSk.A00().equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new H6P(c38321qM, l, str, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, H6P h6p) {
        anonymousClass182.A0d();
        Long l = h6p.A01;
        if (l != null) {
            anonymousClass182.A0R(DatePickerDialogModule.ARG_DATE, l.longValue());
        }
        C38321qM c38321qM = h6p.A00;
        if (c38321qM != null) {
            anonymousClass182.A0r("profile_pic_media_dict");
            C38801rC c38801rC = C38321qM.A0h;
            C38801rC.A07(anonymousClass182, c38321qM);
        }
        List list = h6p.A03;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "published_media_dicts", list);
            while (A0q.hasNext()) {
                C38321qM A0i = AbstractC31172DnG.A0i(A0q);
                if (A0i != null) {
                    C38801rC c38801rC2 = C38321qM.A0h;
                    C38801rC.A07(anonymousClass182, A0i);
                }
            }
            anonymousClass182.A0Z();
        }
        String str = h6p.A02;
        if (str != null) {
            anonymousClass182.A0S(AbstractC50531MSk.A00(), str);
        }
        anonymousClass182.A0a();
    }
}
