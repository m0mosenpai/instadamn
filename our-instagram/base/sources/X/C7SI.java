package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.7SI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7SI implements C7QD {
    public LayerDrawable A00;
    public LayerDrawable A01;
    public C9C0 A02;
    public IgSimpleImageView A03;
    public IgSimpleImageView A04;
    public IgdsMediaButton A05;
    public final UserSession A06;
    public final InterfaceC56392iX A07;
    public final C163537Tq A08;
    public final InterfaceC164907Zd A09;

    public final void A01(C9C0 c9c0) {
        String str;
        if (!C14360o3.A0K(this.A02, c9c0)) {
            this.A02 = c9c0;
            this.A07.setVisibility(0);
            IgSimpleImageView igSimpleImageView = this.A04;
            if (igSimpleImageView == null) {
                str = "thumbsUpPill";
            } else {
                igSimpleImageView.setVisibility(0);
                IgSimpleImageView igSimpleImageView2 = this.A03;
                if (igSimpleImageView2 == null) {
                    str = "thumbsDownPill";
                } else {
                    igSimpleImageView2.setVisibility(0);
                    IgdsMediaButton igdsMediaButton = this.A05;
                    if (igdsMediaButton != null) {
                        igdsMediaButton.setVisibility(8);
                        IgSimpleImageView igSimpleImageView3 = this.A04;
                        str = "thumbsUpPill";
                        if (igSimpleImageView3 != null) {
                            C0fQ.A00(new LOc(c9c0, this), igSimpleImageView3);
                            IgSimpleImageView igSimpleImageView4 = this.A04;
                            if (igSimpleImageView4 != null) {
                                int i = c9c0.A01;
                                igSimpleImageView4.setColorFilter(i);
                                LayerDrawable layerDrawable = this.A01;
                                if (layerDrawable == null) {
                                    str = "thumbsUpPillDrawable";
                                } else {
                                    int i2 = c9c0.A02;
                                    layerDrawable.findDrawableByLayerId(R.id.message_reactions_pill_background_layer).setColorFilter(C3DY.A00(i2));
                                    IgSimpleImageView igSimpleImageView5 = this.A03;
                                    str = "thumbsDownPill";
                                    if (igSimpleImageView5 != null) {
                                        C0fQ.A00(new LOd(c9c0, this), igSimpleImageView5);
                                        IgSimpleImageView igSimpleImageView6 = this.A03;
                                        if (igSimpleImageView6 != null) {
                                            igSimpleImageView6.setColorFilter(i);
                                            LayerDrawable layerDrawable2 = this.A00;
                                            if (layerDrawable2 == null) {
                                                str = "thumbsDownPillDrawable";
                                            } else {
                                                layerDrawable2.findDrawableByLayerId(R.id.message_reactions_pill_background_layer).setColorFilter(C3DY.A00(i2));
                                                IgdsMediaButton igdsMediaButton2 = this.A05;
                                                if (igdsMediaButton2 != null) {
                                                    C0fQ.A00(new LOe(c9c0, this), igdsMediaButton2);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    str = "regenerateButton";
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    public static final void A00(C9C0 c9c0, C7SI c7si) {
        String str;
        if (c7si.A09.AFt((DirectMessageIdentifier) c9c0.A03)) {
            IgSimpleImageView igSimpleImageView = c7si.A04;
            if (igSimpleImageView == null) {
                str = "thumbsUpPill";
            } else {
                igSimpleImageView.setVisibility(8);
                IgSimpleImageView igSimpleImageView2 = c7si.A03;
                if (igSimpleImageView2 == null) {
                    str = "thumbsDownPill";
                } else {
                    igSimpleImageView2.setVisibility(8);
                    IgdsMediaButton igdsMediaButton = c7si.A05;
                    if (igdsMediaButton == null) {
                        str = "regenerateButton";
                    } else {
                        igdsMediaButton.setVisibility(0);
                        return;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        c7si.A07.setVisibility(8);
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A07.getView();
    }

    public C7SI(UserSession userSession, InterfaceC56392iX interfaceC56392iX, InterfaceC164907Zd interfaceC164907Zd) {
        this.A07 = interfaceC56392iX;
        this.A09 = interfaceC164907Zd;
        this.A06 = userSession;
        this.A08 = new C163537Tq(userSession);
        interfaceC56392iX.EZv(new InterfaceC69513Al() { // from class: X.7SJ
            @Override // X.InterfaceC69513Al
            public final void DLu(View view) {
                String str;
                C14360o3.A0B(view, 0);
                C7SI c7si = C7SI.this;
                c7si.A04 = (IgSimpleImageView) view.requireViewById(R.id.thumbs_up);
                c7si.A03 = (IgSimpleImageView) view.requireViewById(R.id.thumbs_down);
                IgSimpleImageView igSimpleImageView = c7si.A04;
                if (igSimpleImageView == null) {
                    str = "thumbsUpPill";
                } else {
                    Drawable background = igSimpleImageView.getBackground();
                    if (background != null) {
                        c7si.A01 = (LayerDrawable) background;
                        IgSimpleImageView igSimpleImageView2 = c7si.A03;
                        if (igSimpleImageView2 == null) {
                            str = "thumbsDownPill";
                        } else {
                            Drawable background2 = igSimpleImageView2.getBackground();
                            if (background2 != null) {
                                c7si.A00 = (LayerDrawable) background2;
                                c7si.A05 = (IgdsMediaButton) view.requireViewById(R.id.regenerate_button);
                                return;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        });
    }
}
