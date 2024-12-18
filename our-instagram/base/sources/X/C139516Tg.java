package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;

/* renamed from: X.6Tg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139516Tg {
    public Context A00;
    public C9CQ A01;
    public C9CQ A02;
    public IgLinearLayout A03;
    public InterfaceC145496h8 A04;
    public final InterfaceC56392iX A05;

    public static final void A00(Context context, C9CQ c9cq, IgLinearLayout igLinearLayout, C139516Tg c139516Tg, Integer num) {
        String str = c9cq.A03;
        if (str.length() > 0) {
            String str2 = c9cq.A02;
            if (str2.length() > 0) {
                KKG kkg = new KKG(context, new C45064Jwt(null, str, str2, AbstractC53242c7.A0H(context, R.attr.igds_color_icon_on_media), R.drawable.story_afi_pill_background, R.style.afi_dwell_story_pill_text, 6, 18, AbstractC13620mo.A02(context)));
                C0fQ.A00(new ViewOnClickListenerC41978Ij9(context, c9cq, c139516Tg, num), kkg);
                if (igLinearLayout.getChildCount() < 2) {
                    igLinearLayout.addView(kkg);
                }
            }
        }
    }

    public C139516Tg(InterfaceC56392iX interfaceC56392iX) {
        this.A05 = interfaceC56392iX;
        interfaceC56392iX.EZv(new InterfaceC69513Al() { // from class: X.6Th
            @Override // X.InterfaceC69513Al
            public final void DLu(View view) {
                String str;
                C14360o3.A0B(view, 0);
                C139516Tg c139516Tg = C139516Tg.this;
                IgLinearLayout igLinearLayout = (IgLinearLayout) view.requireViewById(R.id.afi_container_for_footer);
                c139516Tg.A03 = igLinearLayout;
                Context context = c139516Tg.A00;
                if (context != null) {
                    str = "container";
                    if (igLinearLayout != null) {
                        C9CQ c9cq = c139516Tg.A01;
                        if (c9cq == null) {
                            str = "negativeRenderingData";
                        } else {
                            C139516Tg.A00(context, c9cq, igLinearLayout, c139516Tg, C05F.A01);
                            Context context2 = c139516Tg.A00;
                            if (context2 != null) {
                                IgLinearLayout igLinearLayout2 = c139516Tg.A03;
                                if (igLinearLayout2 != null) {
                                    C9CQ c9cq2 = c139516Tg.A02;
                                    if (c9cq2 == null) {
                                        str = "positiveRenderingData";
                                    } else {
                                        C139516Tg.A00(context2, c9cq2, igLinearLayout2, c139516Tg, C05F.A00);
                                        InterfaceC145496h8 interfaceC145496h8 = c139516Tg.A04;
                                        if (interfaceC145496h8 != null) {
                                            if (interfaceC145496h8.CQz()) {
                                                IgLinearLayout igLinearLayout3 = c139516Tg.A03;
                                                if (igLinearLayout3 != null) {
                                                    if (igLinearLayout3.getChildCount() == 2) {
                                                        IgLinearLayout igLinearLayout4 = c139516Tg.A03;
                                                        if (igLinearLayout4 != null) {
                                                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(igLinearLayout4, "alpha", 0.0f, 1.0f);
                                                            ofFloat.setDuration(400L);
                                                            ofFloat.start();
                                                            return;
                                                        }
                                                    } else {
                                                        return;
                                                    }
                                                }
                                            } else {
                                                return;
                                            }
                                        } else {
                                            str = "delegate";
                                        }
                                    }
                                }
                            }
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                str = "context";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        });
    }
}
