package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class OYA {
    public static final void A00(Context context, Fragment fragment, UserSession userSession, FilmstripTimelineView filmstripTimelineView, OEB oeb, String str, int i, int i2, int i3) {
        MSZ.A1O(userSession, filmstripTimelineView);
        ArrayList A1E = AbstractC166987dD.A1E();
        long j = oeb.A03;
        String str2 = oeb.A05;
        if (str2 != null) {
            A1E.add(new C54630OBf(j, str2, 100, oeb.A04));
            A01(context, fragment, userSession, filmstripTimelineView, oeb, str, A1E, i, i2, i3);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [X.0e5] */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v3, types: [java.util.AbstractCollection, java.util.AbstractList, java.util.ArrayList] */
    public static final void A01(Context context, Fragment fragment, UserSession userSession, FilmstripTimelineView filmstripTimelineView, OEB oeb, String str, List list, int i, int i2, int i3) {
        List A1D;
        int i4;
        double d;
        int i5 = i;
        C14360o3.A0B(context, 0);
        AbstractC167017dG.A1P(userSession, fragment);
        if (list.isEmpty()) {
            C0w9.A03("BitmapTimelineHelper", AnonymousClass001.A0R("Bitmaps requested for empty video for surface: ", str));
            return;
        }
        C183298Bb A01 = ((C87G) AbstractC31175DnJ.A0A(fragment).A00(C87G.class)).A01(str);
        if (filmstripTimelineView != null) {
            C11T.A02(new RunnableC57054PSt(fragment, filmstripTimelineView, A01));
        }
        if (i <= 0) {
            try {
                i5 = 10;
                AbstractC12120kG.A07("ClipsFilmstripFrameTimesCalculator", "requested thumbnails are less than zero", null);
            } catch (Throwable th) {
                A1D = MSW.A1D(th);
            }
        }
        int i6 = oeb.A02;
        long j = (oeb.A01 - i6) / i5;
        A1D = AbstractC166987dD.A1E();
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            A1D.add(new O7L());
        }
        if (list.size() > i5) {
            int i8 = i6;
            int i9 = 0;
            for (int i10 = 0; i10 < i5; i10++) {
                int i11 = ((int) ((C54630OBf) list.get(i9)).A01) + i6;
                while (i9 < AbstractC25226BEj.A05(list) && i8 >= i11) {
                    i9++;
                    i6 = i11;
                    i11 = ((int) ((C54630OBf) list.get(i9)).A01) + i11;
                }
                A02(((O7L) A1D.get(i9)).A01, list, i8 - i6, i9);
                i8 += (int) j;
            }
            i4 = i5;
        } else {
            int size2 = list.size();
            i4 = 0;
            for (int i12 = 0; i12 < size2; i12++) {
                int i13 = (int) ((C54630OBf) list.get(i12)).A01;
                if (j == 0) {
                    d = (i13 / Math.max(i13, r20)) * i5;
                } else {
                    d = i13 / j;
                }
                int A00 = C1H4.A00(d);
                if (A00 >= 0) {
                    if (A00 > i5) {
                        A00 = i5;
                    }
                } else {
                    A00 = 0;
                }
                if (d >= 1.0d && A00 != 0) {
                    double d2 = A00;
                    double d3 = i13 / d2;
                    O7L o7l = (O7L) A1D.get(i12);
                    o7l.A01.ensureCapacity(A00);
                    for (int i14 = 0; i14 < A00; i14++) {
                        A02(o7l.A01, list, 0.0d + (i14 * d3), i12);
                        o7l.A00 = d / d2;
                        i4++;
                    }
                } else {
                    double d4 = 0.0d + (i13 / 2.0d);
                    O7L o7l2 = (O7L) A1D.get(i12);
                    A02(o7l2.A01, list, d4, i12);
                    o7l2.A00 = d;
                    i4++;
                }
            }
        }
        Iterator it = A1D.iterator();
        while (it.hasNext()) {
            O7L o7l3 = (O7L) it.next();
            o7l3.A00 = (o7l3.A00 * i4) / i5;
        }
        Throwable A002 = C09550e6.A00(A1D);
        if (A002 == null) {
            List<O7L> list2 = A1D;
            ArrayList A1E = AbstractC166987dD.A1E();
            int i15 = 0;
            for (O7L o7l4 : list2) {
                ArrayList arrayList = o7l4.A01;
                i15 += arrayList.size();
                int size3 = arrayList.size();
                for (int i16 = 0; i16 < size3; i16++) {
                    A1E.add(Double.valueOf(o7l4.A00));
                }
            }
            int i17 = A01.A00 + 1;
            A01.A00 = i17;
            double[] dArr = new double[A1E.size()];
            int size4 = A1E.size();
            for (int i18 = 0; i18 < size4; i18++) {
                dArr[i18] = MSW.A00(A1E.get(i18));
            }
            A01.A06.A0A(new C51683MsE(dArr, i15, i2, i3, false));
            int size5 = list2.size();
            int i19 = 0;
            for (int i20 = 0; i20 < size5; i20++) {
                O7L o7l5 = (O7L) list2.get(i20);
                if (AbstractC25226BEj.A1b(o7l5.A01)) {
                    C54630OBf c54630OBf = (C54630OBf) list.get(i20);
                    ArrayList arrayList2 = o7l5.A01;
                    OF8 of8 = new OF8(context, userSession, c54630OBf, new OJV(A01, str, i17, i19, i2, i3), MYH.A00(userSession), oeb, arrayList2);
                    C54630OBf c54630OBf2 = of8.A04;
                    if (c54630OBf2.A03 != null) {
                        C14120nc.A00().ATO(new C52380NGb(of8, i2, i3));
                    } else {
                        OXC oxc = of8.A00;
                        if (oxc != null) {
                            oxc.A02();
                        }
                        try {
                            OXC oxc2 = new OXC(of8.A03, of8.A07, c54630OBf2.A02, i2, i3, 0, c54630OBf2.A01);
                            of8.A00 = oxc2;
                            oxc2.A02 = new PJR(of8, i2, i3);
                            C11T.A03(new RunnableC56874PLt(of8));
                        } catch (IOException e) {
                            AbstractC12120kG.A09("BitmapTimelineController", "Video frame generator setup failed", e);
                        }
                    }
                    i19 += arrayList2.size();
                }
            }
            return;
        }
        AbstractC12120kG.A0I("BitmapTimelineHelper:generateBitmapsAndRender: failed to generate frame info for filmstrip", A002, AbstractC06930Yk.A0E());
    }

    public static void A02(AbstractCollection abstractCollection, List list, double d, int i) {
        abstractCollection.add(Double.valueOf((d * ((C54630OBf) list.get(i)).A00) / 100.0d));
    }
}
