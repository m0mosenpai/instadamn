package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.5Lg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractViewOnTouchListenerC115705Lg implements View.OnTouchListener {
    public final AbstractC12990ll A00;
    public final boolean A01;

    public boolean A00(View view, MotionEvent motionEvent) {
        int i;
        C115695Lf c115695Lf = (C115695Lf) this;
        C92474Ce c92474Ce = c115695Lf.A02;
        C81373k7 c81373k7 = c115695Lf.A01;
        C5LT c5lt = c115695Lf.A00;
        C75113Zb c75113Zb = c115695Lf.A03;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    c81373k7.A0I.setVisibility(8);
                }
                return true;
            }
            c81373k7.A0I.setVisibility(8);
            C92494Cg c92494Cg = c92474Ce.A03;
            C38321qM c38321qM = c5lt.A02;
            C14360o3.A0B(c38321qM, 1);
            c92494Cg.A01(DCR.A00);
            C006802i c006802i = c92494Cg.A00;
            if (c006802i != null) {
                c006802i.markerStart(1056313521);
                c006802i.markerAnnotate(1056313521, "ui_framework", "NATIVE");
            }
            C92494Cg.A00(c92494Cg, c38321qM);
            if (!c38321qM.CdW()) {
                UserSession userSession = c92474Ce.A01;
                if (C18U.A06(C06090Tz.A05, userSession, 2342170985064905750L)) {
                    AbstractC40635Hzt.A00(userSession, c38321qM, c92474Ce.A04, c75113Zb);
                }
            }
            c5lt.A00.A09.invoke(c92474Ce.A02, c75113Zb, c81373k7, motionEvent);
            return true;
        }
        View view2 = c81373k7.A0I;
        view2.setVisibility(0);
        C92534Ck c92534Ck = c81373k7.A0U;
        boolean z = c75113Zb.A28;
        C92524Cj c92524Cj = c92534Ck.A00;
        if (z) {
            i = c92524Cj.A07;
        } else {
            i = c92524Cj.A08;
        }
        view2.setBackgroundColor(i);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        EnumC71343Hv enumC71343Hv;
        ILZ ilz;
        C14360o3.A0B(view, 0);
        C14360o3.A0B(motionEvent, 1);
        if (this.A01 && motionEvent.getActionMasked() == 1) {
            C71313Hs A00 = C71313Hs.A00(this.A00);
            C14360o3.A07(A00);
            if (this instanceof C115695Lf) {
                C115695Lf c115695Lf = (C115695Lf) this;
                C5LT c5lt = c115695Lf.A00;
                if (c5lt.A09) {
                    ilz = new ILZ(EnumC71343Hv.A0H);
                    ilz.A01 = Integer.valueOf(c115695Lf.A03.A03);
                } else {
                    if (c5lt.A05 == EnumC906041v.AD_DESTINATION_AR_CAMERA) {
                        enumC71343Hv = EnumC71343Hv.A04;
                    } else {
                        enumC71343Hv = EnumC71343Hv.A0H;
                    }
                    ilz = new ILZ(enumC71343Hv);
                }
                A00.A09(view, ilz.A00(), new String[0], 1);
            } else {
                A00.A0B(view, new String[0]);
            }
        }
        return A00(view, motionEvent);
    }

    public AbstractViewOnTouchListenerC115705Lg(AbstractC12990ll abstractC12990ll, boolean z) {
        this.A00 = abstractC12990ll;
        this.A01 = z;
    }
}
