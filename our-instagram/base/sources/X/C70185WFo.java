package X;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.WFo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70185WFo {
    public int A00;
    public int A01;
    public ImageView A02;
    public TextView A03;
    public IgFrameLayout A04;
    public boolean A05;
    public final int A06;
    public final View A07;
    public final ViewStub A08;
    public final CameraAREffect A09;
    public final C25671My A0A;
    public final InterfaceC41501vz A0B;
    public final Runnable A0C;
    public final Runnable A0D;
    public final List A0E;
    public final ViewStub A0F;

    public C70185WFo(View view, CameraAREffect cameraAREffect, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A07 = view;
        this.A09 = cameraAREffect;
        this.A0A = AbstractC25651Mw.A00(userSession);
        this.A0F = AbstractC167007dF.A0M(view, R.id.ar_effect_instruction_text_stub);
        this.A08 = AbstractC167007dF.A0M(view, R.id.ar_effect_instruction_image_stub);
        this.A06 = (int) view.getResources().getDimension(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        this.A0E = new ArrayList();
        this.A0D = new RunnableC71304WrY(this);
        this.A0C = new RunnableC71303WrX(this);
        this.A0B = new C70723Wfo(this, 0);
    }

    public static final void A04(C70185WFo c70185WFo, boolean z) {
        c70185WFo.A05 = true;
        c70185WFo.A07.removeCallbacks(c70185WFo.A0C);
        if (z) {
            ImageView imageView = c70185WFo.A02;
            if (imageView != null) {
                AbstractC125325le A00 = AbstractC125325le.A00(imageView);
                C14360o3.A07(A00);
                A00.A0I(0.0f);
                A00.A05 = new C71037Wms(c70185WFo, 1);
                A00.A0H();
                return;
            }
        } else {
            ImageView imageView2 = c70185WFo.A02;
            if (imageView2 != null) {
                imageView2.setVisibility(4);
                return;
            }
        }
        C14360o3.A0F("instructionImageView");
        throw C00O.createAndThrow();
    }

    public static final void A00(C70185WFo c70185WFo) {
        List list = c70185WFo.A0E;
        synchronized (list) {
            if (c70185WFo.A05) {
                c70185WFo.A01 = 0;
                return;
            }
            ImageView imageView = c70185WFo.A02;
            if (imageView == null) {
                C14360o3.A0F("instructionImageView");
                throw C00O.createAndThrow();
            }
            imageView.setImageBitmap((Bitmap) list.get(c70185WFo.A01));
            ImageView imageView2 = c70185WFo.A02;
            if (imageView2 != null) {
                AbstractC125325le.A01(imageView2, 0).A0G();
                c70185WFo.A08.setVisibility(0);
                ImageView imageView3 = c70185WFo.A02;
                if (imageView3 != null) {
                    imageView3.setVisibility(0);
                    ImageView imageView4 = c70185WFo.A02;
                    if (imageView4 != null) {
                        imageView4.setBackgroundColor(0);
                        ImageView imageView5 = c70185WFo.A02;
                        if (imageView5 != null) {
                            AbstractC125325le A00 = AbstractC125325le.A00(imageView5);
                            C14360o3.A07(A00);
                            A00.A0M(0.0f, 0.5f);
                            A00.A05 = new C71037Wms(c70185WFo, 0);
                            A00.A0H();
                            return;
                        }
                    }
                }
            }
            C14360o3.A0F("instructionImageView");
            throw C00O.createAndThrow();
        }
    }

    public static final void A01(C70185WFo c70185WFo) {
        c70185WFo.A07.removeCallbacks(c70185WFo.A0D);
        TextView textView = c70185WFo.A03;
        if (textView == null) {
            C14360o3.A0F("instructionTextView");
            throw C00O.createAndThrow();
        }
        AbstractC125325le A00 = AbstractC125325le.A00(textView);
        A00.A06 = new C71041Wmw(c70185WFo, 0);
        A00.A0I(0.0f);
        A00.A05 = new C71037Wms(c70185WFo, 2);
        A00.A0H();
    }

    public static final void A02(C70185WFo c70185WFo) {
        if (c70185WFo.A03 == null) {
            View inflate = c70185WFo.A0F.inflate();
            C14360o3.A0C(inflate, AbstractC111324zv.A00(3));
            TextView textView = (TextView) inflate;
            c70185WFo.A03 = textView;
            if (textView == null) {
                C14360o3.A0F("instructionTextView");
                throw C00O.createAndThrow();
            }
            c70185WFo.A00 = Color.alpha(textView.getShadowColor());
            int paddingLeft = textView.getPaddingLeft();
            int i = c70185WFo.A06;
            textView.setPadding(paddingLeft + i, textView.getPaddingTop(), textView.getPaddingRight() + i, textView.getPaddingBottom());
        }
    }

    public static final void A03(C70185WFo c70185WFo, String str) {
        A02(c70185WFo);
        TextView textView = c70185WFo.A03;
        if (textView != null) {
            textView.setText(str);
            TextView textView2 = c70185WFo.A03;
            if (textView2 != null) {
                textView2.setVisibility(0);
                TextView textView3 = c70185WFo.A03;
                if (textView3 != null) {
                    AbstractC125325le.A01(textView3, 0).A0G();
                    TextView textView4 = c70185WFo.A03;
                    if (textView4 != null) {
                        AbstractC125325le A01 = AbstractC125325le.A01(textView4, 0);
                        A01.A06 = new C71041Wmw(c70185WFo, 0);
                        A01.A0M(0.0f, 1.0f);
                        A01.A0H();
                        return;
                    }
                }
            }
        }
        C14360o3.A0F("instructionTextView");
        throw C00O.createAndThrow();
    }
}
