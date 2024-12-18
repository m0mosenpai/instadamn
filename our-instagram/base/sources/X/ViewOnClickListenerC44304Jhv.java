package X;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;

/* renamed from: X.Jhv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnClickListenerC44304Jhv implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public ViewOnClickListenerC44304Jhv(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj5;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A05 = obj4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(1482654275);
                Context context = (Context) this.A01;
                C14360o3.A0A(context);
                boolean z = ((C195788lL) this.A02).A06;
                boolean z2 = ((C9BB) this.A03).A02;
                GalleryItem galleryItem = (GalleryItem) this.A04;
                boolean A052 = galleryItem.A05();
                boolean A06 = galleryItem.A06();
                C44298Jhp c44298Jhp = (C44298Jhp) this.A05;
                C14360o3.A0B(context, 0);
                if (z || !z2) {
                    if (!A052) {
                        AbstractC44294Jhk.A01(context, A06);
                    } else {
                        c44298Jhp.A00.A04.invoke(c44298Jhp.A01.A01);
                    }
                }
                i = -507657322;
                break;
            case 1:
                A05 = C0f9.A05(-1503128989);
                ((C47947LGc) this.A04).A01();
                C180627zq c180627zq = (C180627zq) this.A05;
                c180627zq.A00 = null;
                Object obj = this.A01;
                AbstractC23641Du.A05(AbstractC43592JPx.A0W((C12N) c180627zq.A01.getValue(), 23341140), new MC7(this.A03, obj, c180627zq, null, 31), (C19L) this.A02);
                i = 1320383312;
                break;
            case 2:
                A05 = C0f9.A05(-886492053);
                ((C47947LGc) this.A03).A01();
                C180627zq c180627zq2 = (C180627zq) this.A05;
                c180627zq2.A00 = null;
                Object obj2 = this.A01;
                AbstractC23641Du.A05(AbstractC43592JPx.A0W((C12N) c180627zq2.A01.getValue(), 23341140), new MC7(this.A04, obj2, c180627zq2, null, 32), (C19L) this.A02);
                i = -2120470617;
                break;
            case 3:
                A05 = C0f9.A05(2042213498);
                UserSession userSession = (UserSession) this.A05;
                View view2 = (View) this.A03;
                C14360o3.A0A(view2);
                AbstractC47850LBt.A00(view2, (InterfaceC11380iw) this.A01, userSession, (InterfaceC148366m6) this.A04, (C45078Jx7) this.A02);
                i = -2045302905;
                break;
            default:
                A05 = C0f9.A05(-336644397);
                IgSimpleImageView igSimpleImageView = (IgSimpleImageView) this.A01;
                if (igSimpleImageView != null) {
                    C51688MsJ c51688MsJ = (C51688MsJ) this.A04;
                    L8P l8p = (L8P) this.A05;
                    IgBouncyUfiButtonImageView igBouncyUfiButtonImageView = (IgBouncyUfiButtonImageView) this.A03;
                    boolean z3 = c51688MsJ.A00;
                    if (!z3) {
                        igSimpleImageView.setVisibility(0);
                        igBouncyUfiButtonImageView.setVisibility(8);
                        igSimpleImageView.setScaleX(0.0f);
                        igSimpleImageView.setScaleY(0.0f);
                        ViewPropertyAnimator duration = AbstractC43593JPy.A0E(igSimpleImageView.animate(), 1.0f).setInterpolator(new DecelerateInterpolator()).setDuration(200L);
                        C14360o3.A07(duration);
                        duration.withEndAction(new M42(igSimpleImageView, new RunnableC50016M6f(c51688MsJ, igSimpleImageView, igSimpleImageView, l8p, igBouncyUfiButtonImageView)));
                    } else {
                        l8p.A00.A02(z3, false, false);
                    }
                } else {
                    ((L8P) this.A05).A00.A02(((C51688MsJ) this.A04).A00, false, false);
                }
                ((InterfaceC50425MOf) this.A02).F7w();
                i = -1512434080;
                break;
        }
        C0f9.A0C(i, A05);
    }
}
