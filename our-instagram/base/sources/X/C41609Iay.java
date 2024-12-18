package X;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.Map;

/* renamed from: X.Iay, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41609Iay {
    public static final C41609Iay A00 = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.2he, java.lang.Object] */
    public final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, IJ5 ij5, C38376GuD c38376GuD, C42332Iou c42332Iou) {
        int A0A;
        Point point;
        int A06 = AbstractC167007dF.A06(1, ij5, c42332Iou);
        Context context = ij5.A00;
        C38632GyZ c38632GyZ = c42332Iou.A00;
        float f = c38632GyZ.A00;
        int A0A2 = (int) (AbstractC13880nE.A0A(context) / 1.1111112f);
        boolean z = false;
        if (f < 1.1111112f) {
            z = true;
        }
        boolean z2 = c38632GyZ.A03;
        boolean z3 = !z2;
        if (z && z3) {
            A0A = (int) (A0A2 * f);
        } else {
            A0A = AbstractC13880nE.A0A(context);
        }
        Point point2 = new Point(A0A, A0A2);
        View view = ij5.A01;
        AbstractC13880nE.A0W(view, point2.y);
        ViewOnClickListenerC42033Ik2.A00(view, 31, c42332Iou);
        Map map = c38376GuD.A03;
        C42103IlD c42103IlD = (C42103IlD) map.get(c42332Iou);
        Map map2 = c38376GuD.A02;
        String str = c42332Iou.A02;
        C42332Iou c42332Iou2 = (C42332Iou) map2.get(str);
        C42103IlD c42103IlD2 = c42103IlD;
        c42103IlD2 = c42103IlD;
        if (c42103IlD == null && c42332Iou2 != null) {
            c42103IlD2 = c42103IlD;
            c42103IlD2 = c42103IlD;
            if (c42332Iou2.A00.A03 && !z2) {
                c42103IlD2 = c42103IlD;
                if (c38632GyZ.A02) {
                    c42103IlD2 = c42103IlD;
                    if (f < 1.1111112f) {
                        ?? obj = new Object();
                        map.put(c42332Iou, obj);
                        int A0A3 = AbstractC13880nE.A0A(c38376GuD.A00);
                        C55982hj A02 = c38376GuD.A01.A02();
                        A02.A05(A0A3);
                        A02.A06((A0A3 * f) / 1.1111112f);
                        A02.A0A(obj);
                        A02.A0A(new C44290Jhg(A06, c38376GuD, c42332Iou));
                        c42103IlD2 = obj;
                    }
                }
            }
        }
        map2.put(str, c42332Iou);
        if (c42103IlD2 != null) {
            C42104IlE c42104IlE = ij5.A04;
            C42103IlD c42103IlD3 = c42104IlE.A00;
            if (c42103IlD3 != null && c42103IlD3.A00 == c42104IlE) {
                c42103IlD3.A00 = null;
            }
            c42104IlE.A00 = c42103IlD2;
            c42103IlD2.A00 = c42104IlE;
        } else {
            C42104IlE c42104IlE2 = ij5.A04;
            C42103IlD c42103IlD4 = c42104IlE2.A00;
            if (c42103IlD4 != null && c42103IlD4.A00 == c42104IlE2) {
                c42103IlD4.A00 = null;
            }
            AbstractC13880nE.A0g(view, point2.x);
        }
        if (f < 1.1111112f) {
            int A0A4 = (int) (AbstractC13880nE.A0A(context) / 1.1111112f);
            point = new Point((int) (A0A4 * f), A0A4);
        } else {
            int A0A5 = AbstractC13880nE.A0A(context);
            point = new Point(A0A5, (int) (A0A5 / f));
        }
        View view2 = ij5.A02;
        AbstractC13880nE.A0g(view2, point.x);
        AbstractC13880nE.A0W(view2, point.y);
        boolean z4 = true;
        boolean A1O = AbstractC167007dF.A1O((f > 1.1111112f ? 1 : (f == 1.1111112f ? 0 : -1)));
        if (f >= 1.1111112f) {
            z4 = false;
        }
        if (A1O || (z4 && c38632GyZ.A02)) {
            InterfaceC56392iX interfaceC56392iX = ij5.A03;
            interfaceC56392iX.setVisibility(0);
            ((IgImageView) interfaceC56392iX.getView()).A0I = new C56170Owd(userSession);
            ExtendedImageUrl A002 = c42332Iou.A00(context);
            if (A002 != null) {
                ((IgImageView) interfaceC56392iX.getView()).setUrl(A002, interfaceC11380iw);
                return;
            }
            return;
        }
        ij5.A03.setVisibility(8);
    }
}
