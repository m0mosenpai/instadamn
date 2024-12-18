package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;

/* renamed from: X.Gsp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38306Gsp extends TouchDelegate {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ C75113Zb A04;
    public final /* synthetic */ String A05;

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        EnumC906041v enumC906041v;
        float f;
        Integer num;
        EnumC71343Hv enumC71343Hv;
        ILZ ilz;
        C14360o3.A0B(motionEvent, 0);
        if (!this.A00.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        motionEvent.getX();
        motionEvent.getY();
        UserSession userSession = this.A02;
        C38321qM c38321qM = this.A03;
        C75113Zb c75113Zb = this.A04;
        AndroidLink androidLink = (AndroidLink) AbstractC001800i.A0J(c38321qM.A3Y());
        if (androidLink != null) {
            enumC906041v = AbstractC114965Hm.A01(androidLink);
        } else {
            enumC906041v = null;
        }
        View view = this.A01;
        if (motionEvent.getActionMasked() == 1) {
            C71313Hs A07 = AbstractC37301Gc2.A07(userSession);
            if (c38321qM.A5M()) {
                ilz = new ILZ(EnumC71343Hv.A0A);
                ilz.A01 = Integer.valueOf(c75113Zb.A03);
            } else {
                if (enumC906041v == EnumC906041v.AD_DESTINATION_AR_CAMERA) {
                    enumC71343Hv = EnumC71343Hv.A04;
                } else {
                    enumC71343Hv = EnumC71343Hv.A0A;
                }
                ilz = new ILZ(enumC71343Hv);
            }
            A07.A09(view, ilz.A00(), new String[0], 1);
        }
        String str = this.A05;
        String A00 = AbstractC111324zv.A00(2219);
        boolean A0K = C14360o3.A0K(str, A00);
        String A002 = AbstractC111324zv.A00(4218);
        if (A0K) {
            f = view.getHeight() - motionEvent.getY();
        } else if (C14360o3.A0K(str, A002)) {
            f = motionEvent.getY();
        } else {
            f = 0.0f;
        }
        motionEvent.setLocation(motionEvent.getX(), f);
        c75113Zb.A0e = motionEvent;
        Integer num2 = null;
        if (C14360o3.A0K(str, A00)) {
            num2 = C05F.A00;
        } else if (C14360o3.A0K(str, A002)) {
            num2 = C05F.A01;
        }
        if (c75113Zb.A12 != null && c75113Zb.A11 != num2) {
            c75113Zb.A11 = num2;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    num = C05F.A0C;
                }
                return true;
            }
            num = C05F.A01;
        } else {
            num = C05F.A00;
        }
        if (c75113Zb.A12 != num) {
            c75113Zb.A12 = num;
            C75113Zb.A00(c75113Zb, 56);
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38306Gsp(Rect rect, View view, View view2, UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb, String str) {
        super(rect, view);
        this.A00 = rect;
        this.A02 = userSession;
        this.A03 = c38321qM;
        this.A04 = c75113Zb;
        this.A01 = view2;
        this.A05 = str;
    }
}
