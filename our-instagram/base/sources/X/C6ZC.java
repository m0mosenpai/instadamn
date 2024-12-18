package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgProgressBar;
import com.instagram.common.ui.base.IgSimpleImageView;
import java.util.List;

/* renamed from: X.6ZC, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6ZC {
    public static final void A00(UserSession userSession, InterfaceC144836g3 interfaceC144836g3, C144296fB c144296fB, InterfaceC41201vU interfaceC41201vU) {
        C84823qW c84823qW;
        String str;
        String str2;
        int i;
        C14360o3.A0B(c144296fB, 0);
        List BlY = interfaceC41201vU.BlY(EnumC75383a5.A0g);
        if (BlY != null && (c84823qW = (C84823qW) AbstractC001800i.A0J(BlY)) != null && c84823qW.A0y != null && interfaceC41201vU.CY4()) {
            C24012Akq A0A = c84823qW.A0A();
            if (A0A != null) {
                c144296fB.A05 = A0A;
                InterfaceC56392iX interfaceC56392iX = c144296fB.A06;
                if (!interfaceC56392iX.CWW()) {
                    View view = interfaceC56392iX.getView();
                    c144296fB.A01 = view;
                    if (view != null) {
                        IgSimpleImageView igSimpleImageView = (IgSimpleImageView) view.requireViewById(R.id.chat_sticker_view);
                        c144296fB.A03 = igSimpleImageView;
                        str = "stickerView";
                        if (igSimpleImageView != null) {
                            Context context = igSimpleImageView.getContext();
                            C24012Akq c24012Akq = c144296fB.A05;
                            str2 = "model";
                            if (c24012Akq != null) {
                                String str3 = c24012Akq.A00.A0M;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                Integer valueOf = Integer.valueOf(c24012Akq.A01());
                                Integer num = c24012Akq.A00.A0A;
                                if (num != null) {
                                    i = num.intValue();
                                } else {
                                    i = 0;
                                }
                                igSimpleImageView.setContentDescription(context.getString(2131955123, str3, valueOf, Integer.valueOf(i)));
                                View view2 = c144296fB.A01;
                                if (view2 != null) {
                                    c144296fB.A00 = view2.requireViewById(R.id.chat_sticker_button_view);
                                    View view3 = c144296fB.A01;
                                    if (view3 != null) {
                                        c144296fB.A02 = (IgProgressBar) view3.requireViewById(R.id.loading_spinner);
                                        View view4 = c144296fB.A00;
                                        str = "buttonView";
                                        if (view4 != null) {
                                            AbstractC56952jT.A04(view4, C05F.A01);
                                            View view5 = c144296fB.A00;
                                            if (view5 != null) {
                                                C24012Akq c24012Akq2 = c144296fB.A05;
                                                if (c24012Akq2 != null) {
                                                    View view6 = c144296fB.A01;
                                                    if (view6 != null) {
                                                        Context context2 = view6.getContext();
                                                        C14360o3.A07(context2);
                                                        view5.setContentDescription(c24012Akq2.A03(context2, userSession));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            C14360o3.A0F(str2);
                            throw C00O.createAndThrow();
                        }
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    C14360o3.A0F("stickerContainerView");
                    throw C00O.createAndThrow();
                }
                IgSimpleImageView igSimpleImageView2 = c144296fB.A03;
                str = "stickerView";
                if (igSimpleImageView2 != null) {
                    Context context3 = igSimpleImageView2.getContext();
                    C14360o3.A07(context3);
                    C24012Akq c24012Akq3 = c144296fB.A05;
                    if (c24012Akq3 == null) {
                        str2 = "model";
                    } else {
                        C202488xS c202488xS = new C202488xS(context3, userSession, c24012Akq3);
                        c144296fB.A04 = c202488xS;
                        IgSimpleImageView igSimpleImageView3 = c144296fB.A03;
                        if (igSimpleImageView3 != null) {
                            str = "stickerDrawable";
                            igSimpleImageView3.setImageDrawable(c202488xS);
                            View view7 = c144296fB.A00;
                            str2 = "buttonView";
                            if (view7 != null) {
                                C202488xS c202488xS2 = c144296fB.A04;
                                if (c202488xS2 != null) {
                                    AbstractC13880nE.A0W(view7, c202488xS2.A02.A00);
                                    View view8 = c144296fB.A00;
                                    if (view8 != null) {
                                        C202488xS c202488xS3 = c144296fB.A04;
                                        if (c202488xS3 != null) {
                                            AbstractC13880nE.A0g(view8, c202488xS3.A00);
                                            View view9 = c144296fB.A00;
                                            if (view9 != null) {
                                                C0fQ.A00(new ViewOnClickListenerC41970Ij1(interfaceC144836g3, c144296fB, c84823qW, interfaceC41201vU), view9);
                                                View view10 = c144296fB.A01;
                                                if (view10 == null) {
                                                    str2 = "stickerContainerView";
                                                } else {
                                                    AbstractC13880nE.A0r(view10, new D2O(userSession, c144296fB, c84823qW, interfaceC41201vU));
                                                    interfaceC56392iX.setVisibility(0);
                                                    IgProgressBar igProgressBar = c144296fB.A02;
                                                    if (igProgressBar == null) {
                                                        str2 = "loadingSpinner";
                                                    } else {
                                                        igProgressBar.setVisibility(4);
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            throw new IllegalStateException("Required value was null.");
        }
        c144296fB.A06.setVisibility(8);
    }
}
