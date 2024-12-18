package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.text.SimpleDateFormat;

/* renamed from: X.NEf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52341NEf extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final O63 A01;
    public final InterfaceC16660sJ A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        String str;
        ImageInfo BGx;
        ExtendedImageUrl A02;
        C56088Ov5 c56088Ov5 = (C56088Ov5) interfaceC66482zP;
        C51350MmB c51350MmB = (C51350MmB) c3oo;
        AbstractC167017dG.A1N(c56088Ov5, c51350MmB);
        if (c56088Ov5 instanceof InterfaceC66482zP) {
            SimpleDateFormat simpleDateFormat = AbstractC54348O0g.A00;
            int A0H = AbstractC166987dD.A0H(this.A02.invoke(c56088Ov5));
            O63 o63 = this.A01;
            InterfaceC11380iw interfaceC11380iw = this.A00;
            AbstractC37302Gc3.A1U(o63, interfaceC11380iw);
            UpcomingEvent upcomingEvent = c56088Ov5.A00;
            c51350MmB.A01.setText(AbstractC43593JPy.A10(AbstractC54348O0g.A00, AbstractC41774Ieq.A02(upcomingEvent)));
            c51350MmB.A03.setText(upcomingEvent.getTitle());
            TextView textView = c51350MmB.A02;
            User Bah = upcomingEvent.Bah();
            if (Bah != null) {
                str = Bah.getUsername();
            } else {
                str = null;
            }
            textView.setText(str);
            View view = c51350MmB.A00;
            OkD.A00(view, o63, upcomingEvent, A0H, 17);
            TextView textView2 = c51350MmB.A04;
            ViewOnClickListenerC55468OkN.A00(textView2, 27, o63, upcomingEvent);
            Context context = view.getContext();
            int i = 2131976237;
            if (upcomingEvent.getReminderEnabled()) {
                i = 2131976238;
            }
            AbstractC166987dD.A1P(context, textView2, i);
            IgImageView igImageView = c51350MmB.A05;
            igImageView.setVisibility(8);
            if (A0H == 0) {
                view.setPadding(0, 0, 8, 0);
            } else {
                view.setPadding(8, 0, 8, 0);
            }
            UpcomingEventMedia BQO = upcomingEvent.BQO();
            if (BQO != null && (BGx = BQO.BGx()) != null && (A02 = AbstractC40161tk.A02(BGx)) != null) {
                IgImageView igImageView2 = c51350MmB.A06;
                igImageView2.A0E = null;
                igImageView2.setUrl(A02, interfaceC11380iw);
                return;
            }
            IgImageView igImageView3 = c51350MmB.A06;
            igImageView3.A0I = C56176Owj.A00;
            User Bah2 = upcomingEvent.Bah();
            if (Bah2 == null) {
                return;
            }
            ImageUrl Bhu = Bah2.Bhu();
            igImageView3.setUrl(new SimpleImageUrl(Bhu), interfaceC11380iw);
            igImageView.setVisibility(0);
            igImageView.setUrl(new SimpleImageUrl(Bhu), interfaceC11380iw);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56088Ov5.class;
    }

    public C52341NEf(InterfaceC11380iw interfaceC11380iw, O63 o63, InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = o63;
        this.A02 = interfaceC16660sJ;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        SimpleDateFormat simpleDateFormat = AbstractC54348O0g.A00;
        return new C51350MmB(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.layout_iglive_explore_upcoming_event_list_item, false));
    }
}
