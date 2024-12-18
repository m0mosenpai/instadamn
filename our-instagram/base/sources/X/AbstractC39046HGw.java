package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.HGw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39046HGw extends AbstractC65806TuP {
    public View A00;
    public C38321qM A01;
    public C41727Idy A02;
    public INQ A03;
    public C38376GuD A04;
    public JPq A05;
    public JID A06;
    public C41726Idx A07;
    public IKK A08;
    public INL A09;
    public InterfaceC60442pS A0A;
    public IN1 A0B;
    public final C41121IIm A0C;
    public final C6FG A0D;
    public final C102884kP A0E;
    public final UserSession A0F;

    @Override // X.AbstractC65806TuP
    public final View A0J(Context context) {
        C14360o3.A0B(context, 0);
        return A0O(context);
    }

    @Override // X.AbstractC65806TuP
    public final void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        this.A00 = null;
        INQ inq = this.A03;
        if (inq != null) {
            inq.A03("scroll");
        }
    }

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        return A0O(context);
    }

    public final FrameLayout A0O(Context context) {
        View A0C;
        Object iie;
        if (!(this instanceof HE4) && !(this instanceof HE3)) {
            boolean z = this instanceof HE2;
            LayoutInflater from = LayoutInflater.from(context);
            if (z) {
                A0C = AbstractC31173DnH.A0C(from, null, R.layout.hero_carousel_media_photo, false);
                iie = new C41068IGl(A0C);
            } else {
                A0C = AbstractC31173DnH.A0C(from, null, R.layout.hero_carousel_product_video, false);
                iie = new IID(A0C);
            }
        } else {
            A0C = AbstractC31173DnH.A0C(LayoutInflater.from(context), null, R.layout.hero_carousel_media_video, false);
            iie = new IIE(A0C);
        }
        A0C.setTag(iie);
        FrameLayout A00 = AbstractC41652Ibk.A00(A0C);
        this.A00 = A00;
        return A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        if (r1.A01.A0F != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0P(android.view.View r33, X.C6FG r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC39046HGw.A0P(android.view.View, X.6FG, boolean):void");
    }

    public AbstractC39046HGw(C41121IIm c41121IIm, C6FG c6fg, C102884kP c102884kP, UserSession userSession, InterfaceC60442pS interfaceC60442pS, IN1 in1) {
        super(c6fg, c102884kP);
        this.A0E = c102884kP;
        this.A0D = c6fg;
        this.A0F = userSession;
        this.A0A = interfaceC60442pS;
        this.A0B = in1;
        this.A0C = c41121IIm;
    }

    @Override // X.AbstractC65806TuP
    public final Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        A0P(view, c6fg, AbstractC167017dG.A1a(view, c6fg));
        return null;
    }
}
