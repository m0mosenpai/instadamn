package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.igds.components.imagebutton.IgImageButton;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.HEi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38980HEi extends AbstractC65632xz {
    public int A00;
    public Context A01;
    public HD6 A02;
    public InterfaceC11380iw A03;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        C105824pt c105824pt;
        ImageUrl A02;
        boolean z;
        int A03 = C0f9.A03(1119709469);
        if (view == null) {
            view = createView(i, null);
        }
        IEE iee = (IEE) AbstractC31172DnG.A0x(view);
        C153126ug c153126ug = ((IED) obj).A00;
        C153336v2 c153336v2 = (C153336v2) obj2;
        HD6 hd6 = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A03;
        C14360o3.A0B(iee, 0);
        C14360o3.A0B(c153126ug, 1);
        AbstractC167007dF.A1E(c153336v2, 2, hd6);
        C14360o3.A0B(interfaceC11380iw, 4);
        View view2 = iee.A00;
        AbstractC13880nE.A0Y(view2, AbstractC37303Gc4.A01(view2, c153336v2.A04 ? 1 : 0));
        List list = iee.A01;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C42796IwY c42796IwY = (C42796IwY) list.get(i2);
            if (i2 < c153126ug.A01()) {
                C41087IHe c41087IHe = (C41087IHe) c153126ug.A02(i2);
                if (c41087IHe != null) {
                    int intValue = c41087IHe.A01.intValue();
                    C14360o3.A0B(c42796IwY, 0);
                    if (intValue != 2) {
                        AbstractC40466Hwv.A00(c42796IwY);
                        if (intValue != 1) {
                            c42796IwY.A03.setVisibility(4);
                        } else {
                            MediaFrameLayout mediaFrameLayout = c42796IwY.A03;
                            mediaFrameLayout.setVisibility(0);
                            mediaFrameLayout.setBackgroundColor(c42796IwY.A00);
                        }
                    } else {
                        AbstractC40466Hwv.A00(c42796IwY);
                        c42796IwY.A03.setVisibility(0);
                        IgImageButton igImageButton = c42796IwY.A02;
                        igImageButton.setVisibility(0);
                        IJT ijt = c41087IHe.A00;
                        if (ijt != null && (c105824pt = ijt.A02) != null && (A02 = c105824pt.A02()) != null) {
                            igImageButton.setUrl(A02, interfaceC11380iw);
                            ViewOnClickListenerC42029Ijy.A00(igImageButton, hd6, c42796IwY, ijt, 0);
                            UserSession userSession = hd6.A01;
                            C105824pt c105824pt2 = ijt.A02;
                            c105824pt2.getClass();
                            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31172DnG.A0Q(hd6, userSession, 0), "ig_live_archive_thumbnail_impression");
                            User user = c105824pt2.A09;
                            user.getClass();
                            A0f.A9K("a_pk", AbstractC25228BEl.A13(user.getId()));
                            String str = c105824pt2.A0e;
                            str.getClass();
                            AbstractC37300Gc1.A0l(A0f, str);
                            String str2 = c105824pt2.A0X;
                            str2.getClass();
                            A0f.A9K(TraceFieldType.BroadcastId, AbstractC25228BEl.A13(str2));
                            C109954xP c109954xP = c105824pt2.A07;
                            if (c109954xP != null) {
                                A0f.A9K("archive_id", AbstractC25228BEl.A13(c109954xP.A00));
                                C109954xP c109954xP2 = c105824pt2.A07;
                                boolean z2 = false;
                                if (c109954xP2 != null) {
                                    z = c109954xP2.A01;
                                } else {
                                    z = false;
                                }
                                A0f.A7v("can_share_to_igtv", Boolean.valueOf(z));
                                if (c105824pt2.A05(userSession) != null) {
                                    z2 = true;
                                }
                                A0f.A7v("is_archived_playback_ready", Boolean.valueOf(z2));
                                A0f.A9K("published_time", Long.valueOf(c105824pt2.A01()));
                                AbstractC31171DnF.A1I(A0f, "archive_live");
                                A0f.Cht();
                            } else {
                                throw AbstractC166997dE.A0g();
                            }
                        } else {
                            igImageButton.setPlaceHolderColor(c42796IwY.A00);
                        }
                    }
                } else {
                    continue;
                }
            } else {
                AbstractC40466Hwv.A00(c42796IwY);
            }
        }
        C0f9.A0A(-1461864432, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(2049336061);
        Context context = this.A01;
        int i2 = this.A00;
        C14360o3.A0B(context, 0);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing);
        int i3 = i2 - 1;
        int A0A = (AbstractC13880nE.A0A(context) - (AbstractC166997dE.A04(context, R.dimen.photo_grid_spacing) * i3)) / i2;
        float A05 = AbstractC13880nE.A05(AbstractC13880nE.A0I(context));
        LinearLayout linearLayout = new LinearLayout(context);
        IEE iee = new IEE(linearLayout);
        for (int i4 = 0; i4 < i2; i4++) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.layout_archive_live_item, (ViewGroup) linearLayout, false);
            C14360o3.A0C(inflate, MSV.A00(241));
            MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) inflate;
            mediaFrameLayout.A00 = A05;
            IgImageButton igImageButton = (IgImageButton) AbstractC166997dE.A0R(mediaFrameLayout, R.id.day_cover_image);
            ((ConstrainedImageView) igImageButton).A00 = A05;
            igImageButton.setEnableTouchOverlay(false);
            C42796IwY c42796IwY = new C42796IwY(context, AbstractC167007dF.A0M(mediaFrameLayout, R.id.error_badge_stub), igImageButton, mediaFrameLayout);
            mediaFrameLayout.setTag(c42796IwY);
            iee.A01.add(c42796IwY);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A0A, -2);
            int i5 = dimensionPixelSize;
            if (i4 == i3) {
                i5 = 0;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i5;
            linearLayout.addView(c42796IwY.A03, layoutParams);
        }
        linearLayout.setTag(iee);
        C0f9.A0A(1492523219, A03);
        return linearLayout;
    }
}
