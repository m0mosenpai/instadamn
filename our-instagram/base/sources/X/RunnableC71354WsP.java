package X;

import android.app.Dialog;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.WsP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71354WsP implements Runnable {
    public final /* synthetic */ MediaMapFragment A00;

    public RunnableC71354WsP(MediaMapFragment mediaMapFragment) {
        this.A00 = mediaMapFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaMapFragment mediaMapFragment = this.A00;
        if (mediaMapFragment.isResumed() && mediaMapFragment.getContext() != null) {
            Context requireContext = mediaMapFragment.requireContext();
            AnonymousClass693 A00 = C68U.A00(requireContext, R.raw.map_nux);
            A00.getClass();
            A00.EH1();
            A00.A8x(new C70203WGv(A00, 4));
            int round = Math.round(requireContext.getResources().getDimensionPixelSize(R.dimen.call_participant_text_max_width) * 0.5588235f);
            C193328hC c193328hC = new C193328hC(requireContext);
            c193328hC.A0A(2131960992);
            c193328hC.A09(2131960991);
            c193328hC.A0t(true);
            c193328hC.A0J(new DialogInterfaceOnClickListenerC35301Fha(7), 2131960990);
            c193328hC.A0h(new WIG(A00, 5));
            c193328hC.A07 = true;
            Dialog A02 = c193328hC.A02();
            ViewStub viewStub = (ViewStub) A02.requireViewById(R.id.dialog_image_holder);
            viewStub.setLayoutResource(R.layout.dialog_rounded_corner_framed_image);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewStub.getLayoutParams();
            ((ViewGroup.LayoutParams) marginLayoutParams).height = round;
            ((ViewGroup.LayoutParams) marginLayoutParams).width = -1;
            marginLayoutParams.setMargins(0, 0, 0, 0);
            viewStub.setLayoutParams(marginLayoutParams);
            RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) viewStub.inflate();
            float A03 = AbstractC167017dG.A03(requireContext);
            roundedCornerFrameLayout.A01(A03, A03, 0.0f, 0.0f);
            ImageView imageView = (ImageView) roundedCornerFrameLayout.requireViewById(R.id.dialog_image);
            imageView.setImageDrawable(A00);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            C0fJ.A00(A02);
            InterfaceC19610xo ARD = C48b.A00(mediaMapFragment.A02).A00.ARD();
            ARD.E77("has_seen_main_nux", true);
            ARD.apply();
        }
    }
}
