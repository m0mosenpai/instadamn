package X;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.facebook.common.dextricks.StringTreeSet;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import java.util.List;

/* renamed from: X.BEz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25241BEz extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25241BEz(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A06 = obj4;
        this.A07 = obj5;
        this.A04 = obj6;
        this.A05 = obj7;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Drawable drawable;
        int[] iArr;
        int width;
        int height;
        Class<?> cls;
        switch (this.A00) {
            case 0:
                C2YN c2yn = (C2YN) obj;
                C14360o3.A0B(c2yn, 0);
                c2yn.A01 = true;
                C77993eR c77993eR = (C77993eR) this.A06;
                C170197iY c170197iY = (C170197iY) this.A07;
                c77993eR.A00 = c170197iY.A0D;
                Object obj2 = this.A01;
                try {
                    c2yn.A00 = C00Q.A03("recycler-decorations", StringTreeSet.MAX_SYMBOL_COUNT);
                    c2yn.A02(new C30484DbT(20, obj2, c170197iY), new Object[]{c170197iY.A0C, obj2});
                    c2yn.A00 = null;
                    C51762Yz c51762Yz = (C51762Yz) this.A02;
                    try {
                        c2yn.A00 = C00Q.A03("recycler-equivalent-mount", StringTreeSet.MAX_SYMBOL_COUNT);
                        Object obj3 = c51762Yz.A03;
                        Boolean valueOf = Boolean.valueOf(c170197iY.A0E);
                        Boolean valueOf2 = Boolean.valueOf(c170197iY.A0H);
                        Integer valueOf3 = Integer.valueOf(c170197iY.A01);
                        Integer valueOf4 = Integer.valueOf(c170197iY.A06);
                        Integer valueOf5 = Integer.valueOf(c170197iY.A05);
                        Boolean valueOf6 = Boolean.valueOf(c170197iY.A0G);
                        Boolean valueOf7 = Boolean.valueOf(c170197iY.A0I);
                        Boolean valueOf8 = Boolean.valueOf(c170197iY.A0O);
                        Integer valueOf9 = Integer.valueOf(c170197iY.A00);
                        Integer valueOf10 = Integer.valueOf(c170197iY.A04);
                        C3F1 c3f1 = c170197iY.A07;
                        if (c3f1 != null) {
                            cls = c3f1.getClass();
                        } else {
                            cls = null;
                        }
                        c2yn.A02(new C30484DbT(21, c77993eR, c170197iY), new Object[]{obj3, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, 0, valueOf6, 0, valueOf7, valueOf8, valueOf9, null, valueOf10, cls});
                        c2yn.A00 = null;
                        try {
                            c2yn.A00 = C00Q.A03("recycler-binder", StringTreeSet.MAX_SYMBOL_COUNT);
                            c2yn.A02(new C30193DRy(c170197iY, 28), new Object[]{c170197iY.A0A});
                            c2yn.A00 = null;
                            Object obj4 = this.A03;
                            Object obj5 = this.A04;
                            Object obj6 = this.A05;
                            try {
                                c2yn.A00 = C00Q.A03("recycler-equivalent-bind", StringTreeSet.MAX_SYMBOL_COUNT);
                                c2yn.A02(new DT0(2, c170197iY, obj4, obj6, obj5), AbstractC25230BEn.A1a());
                                return C0eB.A00;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            case 1:
                C6Nu A0T = AbstractC25228BEl.A0T(obj);
                List list = (List) this.A05;
                Object obj7 = this.A06;
                Object obj8 = this.A07;
                Object obj9 = this.A03;
                A0T.CgN(null, new BAO(6, C30043DMd.A00, list), C5UA.A04(new C30736DfY(1, obj8, obj7, this.A01, this.A02, obj9, list, this.A04), -632812321, true), list.size());
                return C0eB.A00;
            case 2:
                MotionEvent motionEvent = (MotionEvent) obj;
                C14360o3.A0B(motionEvent, 0);
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 3) {
                            drawable = (Drawable) this.A05;
                            iArr = new int[0];
                        }
                    } else {
                        C26447BmU c26447BmU = (C26447BmU) this.A07;
                        Drawable drawable2 = (Drawable) this.A05;
                        drawable2.setState(new int[0]);
                        drawable2.setState(new int[0]);
                        C92494Cg c92494Cg = (C92494Cg) this.A01;
                        C38321qM c38321qM = (C38321qM) this.A03;
                        C14360o3.A0B(c38321qM, 1);
                        c92494Cg.A01(DCR.A00);
                        C006802i c006802i = c92494Cg.A00;
                        if (c006802i != null) {
                            c006802i.markerStart(1056313521);
                            c006802i.markerAnnotate(1056313521, AbstractC111324zv.A00(1353), "LITHO");
                        }
                        C92494Cg.A00(c92494Cg, c38321qM);
                        if (!c38321qM.CdW()) {
                            UserSession userSession = c26447BmU.A00;
                            if (C18U.A06(C06090Tz.A05, userSession, 2342170985064905750L)) {
                                AbstractC40635Hzt.A00(userSession, c38321qM, c26447BmU.A03, (C75113Zb) this.A04);
                            }
                        }
                        C5LT c5lt = (C5LT) this.A06;
                        c5lt.A00.A0A.invoke(c26447BmU.A01, c5lt.A04, motionEvent, new D8M(7, c92494Cg, this.A02));
                    }
                    return true;
                }
                drawable = (Drawable) this.A05;
                iArr = new int[]{R.attr.state_pressed};
                drawable.setState(iArr);
                return true;
            case 3:
                C2YN A0p = AbstractC25228BEl.A0p(obj);
                Object obj10 = this.A06;
                C30496Dbf.A01(A0p, obj10, new Object[]{obj10}, 10);
                Object obj11 = this.A02;
                C30496Dbf.A01(A0p, obj11, new Object[]{obj11}, 11);
                Object obj12 = this.A07;
                C30496Dbf.A01(A0p, obj12, new Object[]{obj12}, 12);
                Object obj13 = this.A04;
                C30496Dbf.A01(A0p, obj13, new Object[]{obj13}, 13);
                Object obj14 = this.A03;
                C30496Dbf.A01(A0p, obj14, new Object[]{obj14}, 14);
                Object obj15 = this.A05;
                C30496Dbf.A01(A0p, obj15, new Object[]{obj15}, 15);
                Object obj16 = this.A01;
                C30496Dbf.A01(A0p, obj16, new Object[]{obj16}, 16);
                return C0eB.A00;
            case 4:
                Point point = (Point) obj;
                C14360o3.A0B(point, 0);
                View view = (View) this.A01;
                boolean z = view instanceof RoundedCornerImageView;
                int i = point.x;
                if (z) {
                    width = ((Context) this.A02).getResources().getDimensionPixelSize(com.facebook.R.dimen.account_group_management_clickable_width);
                } else {
                    width = view.getWidth();
                }
                int i2 = i - (width / 2);
                int i3 = point.y;
                if (z) {
                    height = ((Context) this.A02).getResources().getDimensionPixelSize(com.facebook.R.dimen.account_group_management_clickable_width);
                } else {
                    height = view.getHeight();
                }
                ((InterfaceC145616hK) this.A03).DU3((View) this.A06, view, (C41181vS) this.A04, (C41551w4) this.A07, (C141596ac) this.A05, AbstractC111324zv.A00(5410), AbstractC111324zv.A00(5121), i2, i3 - (height / 2));
                return C0eB.A00;
            case 5:
                Context A0N = AbstractC25229BEm.A0N(this.A06);
                C77123cy c77123cy = (C77123cy) this.A07;
                C2XI c2xi = (C2XI) this.A05;
                int A06 = AbstractC167007dF.A06(1, c77123cy, c2xi);
                float dimension = A0N.getResources().getDimension(com.facebook.R.dimen.album_preview_add_item_margin);
                AbstractC25233BEq.A1C(c77123cy);
                float[] fArr = new float[A06];
                fArr[0] = dimension / 2.0f;
                fArr[1] = (-dimension) / 2.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                ofFloat.setDuration(800L);
                ofFloat.setInterpolator(new DecelerateInterpolator());
                AbstractC25231BEo.A0w(new BFF(c2xi, 21), ofFloat, c77123cy);
                CZJ.A01((C2XI) this.A03, (C77123cy) this.A04, 400L);
                CZJ.A01((C2XI) this.A01, (C77123cy) this.A02, 100L);
                return C0eB.A00;
            default:
                C26564BoN c26564BoN = (C26564BoN) this.A07;
                C77123cy c77123cy2 = (C77123cy) this.A06;
                C2XI c2xi2 = (C2XI) this.A05;
                float dimension2 = c26564BoN.A00.getResources().getDimension(com.facebook.R.dimen.album_preview_add_item_margin);
                AbstractC25233BEq.A1C(c77123cy2);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(dimension2 / 2.0f, (-dimension2) / 2.0f);
                ofFloat2.setDuration(800L);
                ofFloat2.setInterpolator(new DecelerateInterpolator());
                AbstractC25231BEo.A0w(new BFF(c2xi2, 29), ofFloat2, c77123cy2);
                C26564BoN.A03((C2XI) this.A03, (C77123cy) this.A04, 400L);
                C26564BoN.A03((C2XI) this.A01, (C77123cy) this.A02, 100L);
                return C0eB.A00;
        }
    }
}
