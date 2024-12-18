package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.ui.widget.mediapicker.MediaPickerItemView;
import java.util.List;

/* renamed from: X.Jhu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnLongClickListenerC44303Jhu implements View.OnLongClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public ViewOnLongClickListenerC44303Jhu(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A04 = obj4;
        this.A03 = obj3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C38210GrF c38210GrF;
        C38321qM BQN;
        Context context;
        Object obj;
        int i;
        C8QJ c8qj;
        C199928sw c199928sw;
        final MediaPickerItemView mediaPickerItemView;
        InterfaceC16820sZ c29901DGp;
        switch (this.A00) {
            case 0:
                Context context2 = (Context) this.A01;
                C14360o3.A0A(context2);
                GalleryItem galleryItem = (GalleryItem) this.A02;
                boolean A05 = galleryItem.A05();
                boolean A06 = galleryItem.A06();
                boolean z = ((C177977vW) this.A04).A03.A06;
                C50156MDj c50156MDj = new C50156MDj(this.A03, 44);
                C14360o3.A0B(context2, 0);
                if (!A05) {
                    AbstractC44294Jhk.A01(context2, A06);
                    return false;
                }
                if (!z) {
                    return false;
                }
                return AbstractC166987dD.A1a(c50156MDj.invoke());
            case 1:
                C43767JXg c43767JXg = (C43767JXg) this.A02;
                ViewGroup viewGroup = c43767JXg.A07;
                viewGroup.requestDisallowInterceptTouchEvent(true);
                MRS mrs = (MRS) this.A01;
                JRL jrl = (JRL) this.A04;
                C3o9 c3o9 = jrl.A0J;
                DirectShareTarget directShareTarget = jrl.A0H;
                C45127Jxw c45127Jxw = jrl.A07;
                mrs.DT9(c43767JXg.A0O.Ahl(), viewGroup, (C31446Drq) this.A03, directShareTarget, c3o9, c45127Jxw.A01, (List) c45127Jxw.A00, jrl.A0c, jrl.A0Y);
                return true;
            case 2:
                c38210GrF = (C38210GrF) this.A02;
                BQN = ((C37931GmT) this.A04).BQN();
                context = (Context) this.A01;
                obj = this.A03;
                c38210GrF.A00(context, BQN, (InterfaceC60442pS) obj);
                return true;
            case 3:
                c38210GrF = (C38210GrF) this.A01;
                BQN = ((C37931GmT) this.A03).BQN();
                context = AbstractC166997dE.A0L((View) this.A04);
                obj = this.A02;
                c38210GrF.A00(context, BQN, (InterfaceC60442pS) obj);
                return true;
            case 4:
                Context context3 = (Context) this.A01;
                UserSession userSession = (UserSession) this.A04;
                i = 0;
                c8qj = new C8QJ(context3, userSession, null, false);
                c199928sw = new C199928sw(null, null, null, new C70940Wkj(0, userSession, this.A02, this.A03), null, "Pin User", 0, 0, 0, false, false, false, true, false, false, false);
                c8qj.A02(AbstractC166987dD.A1J(c199928sw));
                c8qj.getContentView().measure(i, i);
                c8qj.showAsDropDown(view);
                return true;
            case 5:
                Context context4 = (Context) this.A01;
                UserSession userSession2 = (UserSession) this.A04;
                i = 0;
                c8qj = new C8QJ(context4, userSession2, null, false);
                c199928sw = new C199928sw(null, null, null, new C70940Wkj(1, userSession2, this.A02, this.A03), null, "Unpin User", 0, 0, 0, false, false, false, true, false, false, false);
                c8qj.A02(AbstractC166987dD.A1J(c199928sw));
                c8qj.getContentView().measure(i, i);
                c8qj.showAsDropDown(view);
                return true;
            case 6:
                LHw lHw = (LHw) this.A03;
                mediaPickerItemView = lHw.A00;
                c29901DGp = new C29901DGp(28, this.A01, this.A04, lHw, this.A02);
                return AbstractC44294Jhk.A02(mediaPickerItemView, c29901DGp);
            case 7:
                final Jo2 jo2 = (Jo2) this.A01;
                mediaPickerItemView = (MediaPickerItemView) this.A02;
                final GalleryItem galleryItem2 = (GalleryItem) this.A03;
                final C9BB c9bb = (C9BB) this.A04;
                c29901DGp = new InterfaceC16820sZ() { // from class: X.M99
                    @Override // X.InterfaceC16820sZ
                    public final Object invoke() {
                        Jo2 jo22 = jo2;
                        MediaPickerItemView mediaPickerItemView2 = mediaPickerItemView;
                        GalleryItem galleryItem3 = galleryItem2;
                        return Boolean.valueOf(jo22.A02.DNX(mediaPickerItemView2, c9bb, galleryItem3));
                    }
                };
                return AbstractC44294Jhk.A02(mediaPickerItemView, c29901DGp);
            default:
                return false;
        }
    }
}
