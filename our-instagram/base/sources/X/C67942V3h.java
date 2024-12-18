package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import java.util.HashSet;

/* renamed from: X.V3h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67942V3h extends C1P1 {
    public final /* synthetic */ AbstractC69743Bi A00;
    public final /* synthetic */ C38321qM A01;
    public final /* synthetic */ InterfaceC16820sZ A02;

    public C67942V3h(AbstractC69743Bi abstractC69743Bi, C38321qM c38321qM, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = abstractC69743Bi;
        this.A01 = c38321qM;
        this.A02 = interfaceC16820sZ;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(49624791);
        C67846UzR c67846UzR = (C67846UzR) obj;
        int A032 = C0f9.A03(1670590663);
        C14360o3.A0B(c67846UzR, 0);
        AbstractC69743Bi abstractC69743Bi = this.A00;
        C38321qM c38321qM = this.A01;
        c67846UzR.A03 = c38321qM.A1S();
        if (c67846UzR.A05 != null && c67846UzR.A06 != null && c67846UzR.A04 != null) {
            XCH A00 = abstractC69743Bi.A00(c67846UzR, c38321qM);
            HashSet hashSet = AbstractC69743Bi.A04;
            if (!AbstractC001800i.A0u(hashSet, c67846UzR.A06)) {
                C69763Bk c69763Bk = abstractC69743Bi.A02;
                boolean A01 = abstractC69743Bi.A01();
                C69753Bj c69753Bj = abstractC69743Bi.A01;
                Context context = abstractC69743Bi.A00;
                C14360o3.A0B(c69753Bj, 2);
                View A0R = AbstractC25226BEj.A0R(LayoutInflater.from(context), null, R.layout.celebration_fullscreen_dialog, false);
                View findViewById = A0R.findViewById(R.id.outer_content_container_view);
                View findViewById2 = A0R.findViewById(R.id.inner_content_container_view);
                IgImageView igImageView = (IgImageView) A0R.findViewById(R.id.reel_preview_image_view);
                TextView textView = (TextView) A0R.findViewById(R.id.text);
                IgdsMediaButton igdsMediaButton = (IgdsMediaButton) A0R.findViewById(R.id.share_button);
                TextView textView2 = (TextView) A0R.findViewById(R.id.dismiss_button);
                ImageView imageView = (ImageView) A0R.findViewById(R.id.animation_view);
                Dialog dialog = new Dialog(context, android.R.style.Theme.Translucent.NoTitleBar.Fullscreen);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setColor(context.getColor(R.color.share_background));
                gradientDrawable.setCornerRadius(500.0f);
                igdsMediaButton.setBackground(gradientDrawable);
                textView.setText(c67846UzR.A05);
                textView2.setText(c67846UzR.A04);
                C0fQ.A00(new WNR(dialog, c67846UzR, c69753Bj, A00, 3), textView2);
                if (c67846UzR.A07 != null) {
                    igdsMediaButton.setVisibility(0);
                    igdsMediaButton.setLabel(c67846UzR.A07);
                    C0fQ.A00(new WNR(dialog, c67846UzR, c69753Bj, A00, 4), igdsMediaButton);
                } else {
                    igdsMediaButton.setVisibility(8);
                }
                dialog.addContentView(A0R, new ViewGroup.LayoutParams(-1, -1));
                ImageUrl imageUrl = c67846UzR.A03;
                if (imageUrl != null) {
                    igImageView.setUrl(imageUrl, c69753Bj);
                    if (A01) {
                        igImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        if (!igImageView.getClipToOutline()) {
                            igImageView.setClipToOutline(true);
                        }
                    }
                    igImageView.setVisibility(0);
                }
                C14360o3.A0A(findViewById);
                if (findViewById.isLaidOut() && !findViewById.isLayoutRequested()) {
                    ImageUrl imageUrl2 = c67846UzR.A03;
                    if (imageUrl2 != null) {
                        C14360o3.A0A(igImageView);
                        C69763Bk.A00(context, findViewById, textView, igImageView, imageUrl2);
                    }
                    findViewById2.requestLayout();
                } else {
                    findViewById.addOnLayoutChangeListener(new AT5(0, context, findViewById2, findViewById, textView, c67846UzR, c69763Bk, igImageView));
                }
                A0R.setAlpha(0.0f);
                igdsMediaButton.setAlpha(0.0f);
                textView2.setAlpha(0.0f);
                textView.setTranslationY(300.0f);
                textView.setAlpha(0.0f);
                igImageView.setTranslationY(600.0f);
                igImageView.setAlpha(0.0f);
                Handler A0J = AbstractC167007dF.A0J();
                A0R.animate().alpha(1.0f).setDuration(300L);
                igdsMediaButton.animate().alpha(1.0f).setDuration(300L);
                textView2.animate().alpha(1.0f).setDuration(300L);
                A0J.postDelayed(new RunnableC71564WwE(textView, c69763Bk, igImageView), 300L);
                A0J.postDelayed(new Wx0(context, imageView, c67846UzR, c69763Bk), 1200L);
                C0fJ.A00(dialog);
                String str = c67846UzR.A06;
                if (str != null) {
                    hashSet.add(str);
                }
                if (c67846UzR.A06 == null) {
                    C0w9.A03("brand_experiences_reel_celebration", "promotionId was null when attempting to log");
                }
                C0f9.A0A(414388880, A032);
                C0f9.A0A(1502771441, A03);
            }
        }
        this.A02.invoke();
        C0f9.A0A(414388880, A032);
        C0f9.A0A(1502771441, A03);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -326785161);
        Throwable A01 = abstractC115105If.A01();
        if (A01 == null) {
            A01 = new RuntimeException(AbstractC43591JPw.A00(634));
        }
        C0w9.A07("brand_experiences_reel_celebration", A01);
        this.A02.invoke();
        C0f9.A0A(-203411804, A0N);
    }
}
