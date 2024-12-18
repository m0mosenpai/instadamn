package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.storiestemplates.footer.PinnablesFooterHorizontalScrollView;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import java.util.ArrayList;

/* renamed from: X.Aem, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23713Aem implements InterfaceC69513Al {
    public final int A00;
    public final Object A01;

    public C23713Aem(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC69513Al
    public final void DLu(View view) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(view, 0);
                NineSixteenLayoutConfigImpl nineSixteenLayoutConfigImpl = (NineSixteenLayoutConfigImpl) ((TargetViewSizeProvider) this.A01);
                int i = nineSixteenLayoutConfigImpl.A0A;
                View A0S = AbstractC166997dE.A0S(view, R.id.mode_picker);
                AbstractC13880nE.A0W(A0S, i);
                AbstractC13880nE.A0g(A0S, nineSixteenLayoutConfigImpl.A0K.getWidth());
                return;
            case 1:
                C14360o3.A0B(view, 0);
                C9V7 c9v7 = (C9V7) this.A01;
                SimpleVideoLayout simpleVideoLayout = (SimpleVideoLayout) view.requireViewById(R.id.gallery_grid_formats_thumbnail_video);
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                c9v7.A01 = simpleVideoLayout;
                return;
            case 2:
                RecyclerView recyclerView = (RecyclerView) view;
                C23790Ag1 c23790Ag1 = (C23790Ag1) this.A01;
                recyclerView.setLayoutManager(c23790Ag1.A04);
                recyclerView.setAdapter(c23790Ag1.A0C);
                c23790Ag1.A05.A0A(recyclerView);
                return;
            case 3:
                ImageView imageView = (ImageView) view;
                C14360o3.A0B(imageView, 0);
                C24151Ana c24151Ana = (C24151Ana) this.A01;
                AnonymousClass693 A00 = C68U.A00(c24151Ana.A0H.getContext(), R.raw.canvas_dice_animation);
                imageView.setImageDrawable(A00);
                ViewOnClickListenerC23248ASj.A00(imageView, 14, A00, c24151Ana);
                return;
            case 4:
                PinnablesFooterHorizontalScrollView pinnablesFooterHorizontalScrollView = (PinnablesFooterHorizontalScrollView) view;
                ArrayList A12 = AbstractC166997dE.A12(pinnablesFooterHorizontalScrollView, 0);
                C24151Ana c24151Ana2 = (C24151Ana) this.A01;
                A12.add(new C34582FLr(null, "info", new B8U(c24151Ana2, 48), R.drawable.instagram_info_outline_16));
                UserSession userSession = c24151Ana2.A0B;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36319909902819140L)) {
                    A12.add(new C34582FLr(2131974526, AppStateModule.APP_STATE_BACKGROUND, new B8U(c24151Ana2, 49), R.drawable.instagram_pin_pano_filled_16));
                }
                if (C18U.A06(c06090Tz, userSession, 36319909902360382L)) {
                    A12.add(new C34582FLr(2131974527, "music_only", new C57747Pja(c24151Ana2, 0), R.drawable.instagram_pin_pano_filled_16));
                }
                pinnablesFooterHorizontalScrollView.setButtons(A12);
                return;
            default:
                TextView textView = (TextView) view;
                C14360o3.A0B(textView, 0);
                textView.setTypeface(AbstractC15960qq.A00(AbstractC166997dE.A0L(((JV2) this.A01).A04)).A02(EnumC15950qp.A0z));
                return;
        }
    }
}
