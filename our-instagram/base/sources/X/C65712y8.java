package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.2y8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65712y8 extends AbstractC65632xz {
    public C685736u A00;
    public final Context A01;
    public final InterfaceC11380iw A02;

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final String getBinderGroupName() {
        return "FamilyBridgesBasicNetego";
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return Integer.MIN_VALUE;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 6;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        Drawable drawable;
        int A03 = C0f9.A03(64300896);
        this.A00.getClass();
        final C3Py c3Py = (C3Py) obj;
        final C42663IuK c42663IuK = (C42663IuK) obj2;
        if (i != 0) {
            if (i != 1 && i != 2 && i != 3 && i != 4) {
                if (i == 5) {
                    Object tag = view.getTag();
                    tag.getClass();
                    C69304VlC c69304VlC = (C69304VlC) tag;
                    C685736u c685736u = this.A00;
                    C42663IuK c42663IuK2 = c69304VlC.A00;
                    if (c42663IuK2 != null && c42663IuK2 != c42663IuK) {
                        c42663IuK2.A00 = null;
                    }
                    c69304VlC.A00 = c42663IuK;
                    c42663IuK.A00 = new WeakReference(c69304VlC);
                    if (!c42663IuK.A01) {
                        IGC igc = IGC.A02;
                        if (igc == null) {
                            igc = new IGC();
                            IGC.A02 = igc;
                        }
                        int hashCode = c42663IuK.hashCode();
                        HashMap hashMap = igc.A01;
                        Integer valueOf = Integer.valueOf(hashCode);
                        Runnable runnable = (Runnable) hashMap.get(valueOf);
                        if (runnable != null) {
                            igc.A00.removeCallbacks(runnable);
                            hashMap.remove(valueOf);
                        }
                        RunnableC43116J4f runnableC43116J4f = new RunnableC43116J4f(c42663IuK, igc);
                        hashMap.put(Integer.valueOf(c42663IuK.hashCode()), runnableC43116J4f);
                        igc.A00.postDelayed(runnableC43116J4f, 4000L);
                    }
                    TextView textView = c69304VlC.A02;
                    textView.setText(((H3G) c3Py.A00).A07);
                    textView.getPaint().setFakeBoldText(true);
                    ColorFilterAlphaImageView colorFilterAlphaImageView = c69304VlC.A03;
                    colorFilterAlphaImageView.setNormalColor(c69304VlC.A04.A01);
                    colorFilterAlphaImageView.setActiveColor(-1);
                    colorFilterAlphaImageView.setVisibility(0);
                    VVP.A00(c69304VlC, c42663IuK.A01);
                    C0fQ.A00(new ViewOnClickListenerC41904Ihx(c3Py, c685736u), c69304VlC.A01);
                } else {
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unhandled view type");
                    C0f9.A0A(460469882, A03);
                    throw unsupportedOperationException;
                }
            } else {
                Context context = this.A01;
                Object tag2 = view.getTag();
                tag2.getClass();
                C47698L4f c47698L4f = (C47698L4f) tag2;
                InterfaceC11380iw interfaceC11380iw = this.A02;
                C0fQ.A00(new ViewOnClickListenerC41885IhN(c42663IuK), c47698L4f.A00);
                MediaFrameLayout mediaFrameLayout = c47698L4f.A05;
                H3G h3g = (H3G) c3Py.A00;
                mediaFrameLayout.A00 = h3g.A00;
                IgProgressImageView igProgressImageView = c47698L4f.A04;
                igProgressImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                igProgressImageView.setUrl(h3g.A03, interfaceC11380iw);
                List list = h3g.A0E;
                if (list != null && !list.isEmpty()) {
                    List list2 = c47698L4f.A06;
                    if (list2.size() <= list.size()) {
                        c47698L4f.A01.setVisibility(0);
                        for (int i2 = 0; i2 < list2.size(); i2++) {
                            View view2 = (View) list2.get(i2);
                            if (view2.getParent() instanceof FrameLayout) {
                                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                                shapeDrawable.getPaint().setColor((int) h3g.A01);
                                ((View) view2.getParent()).setBackgroundDrawable(shapeDrawable);
                            }
                            ((IgImageView) list2.get(i2)).setUrl((ImageUrl) list.get(i2), interfaceC11380iw);
                        }
                        c47698L4f.A02.setBackgroundColor(context.getColor(R.color.baseline_neutral_80));
                        TextView textView2 = c47698L4f.A03;
                        textView2.setText(h3g.A0A);
                        textView2.getPaint().setFakeBoldText(true);
                        C1OG A0J = C25821No.A00().A0J(h3g.A04, null);
                        A0J.A0I = false;
                        A0J.A02(new C48270LXt(context, c47698L4f));
                        A0J.A01();
                    }
                }
                c47698L4f.A01.setVisibility(8);
                c47698L4f.A02.setBackgroundColor(context.getColor(R.color.baseline_neutral_80));
                TextView textView22 = c47698L4f.A03;
                textView22.setText(h3g.A0A);
                textView22.getPaint().setFakeBoldText(true);
                C1OG A0J2 = C25821No.A00().A0J(h3g.A04, null);
                A0J2.A0I = false;
                A0J2.A02(new C48270LXt(context, c47698L4f));
                A0J2.A01();
            }
        } else {
            Context context2 = this.A01;
            Object tag3 = view.getTag();
            tag3.getClass();
            C69140ViV c69140ViV = (C69140ViV) tag3;
            final C685736u c685736u2 = this.A00;
            try {
                drawable = AbstractC56412ia.A00(context2.getResources(), R.drawable.growth_family_bridges_app_icons_netegofacebooklogo);
            } catch (Resources.NotFoundException unused) {
                drawable = context2.getDrawable(R.drawable.growth_family_bridges_app_icons_netegofacebooklogo);
            }
            c69140ViV.A00.setImageDrawable(drawable);
            TextView textView3 = c69140ViV.A01;
            textView3.setText(((H3G) c3Py.A00).A0C);
            textView3.getPaint().setFakeBoldText(true);
            textView3.setTextColor(context2.getColor(R.color.gradient_dark));
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: X.WMZ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    C685736u c685736u3 = c685736u2;
                    C3Py c3Py2 = c3Py;
                    C42663IuK c42663IuK3 = c42663IuK;
                    C14360o3.A0B(c42663IuK3, 1);
                    C42592ItB c42592ItB = new C42592ItB(c3Py2, c42663IuK3);
                    C70089W2l c70089W2l = new C70089W2l(c685736u3.A0O, c685736u3.A0J);
                    c70089W2l.A00 = new C69176Vj5(c42592ItB, c42663IuK3, c685736u3);
                    C193328hC c193328hC = new C193328hC(c70089W2l.A02);
                    c193328hC.A0m(c70089W2l.A03, c70089W2l.A04);
                    c193328hC.A0f(new WHL(c70089W2l), C70089W2l.A00(c70089W2l));
                    AbstractC31178DnM.A1R(c193328hC, true);
                }
            };
            ColorFilterAlphaImageView colorFilterAlphaImageView2 = c69140ViV.A02;
            C0fQ.A00(onClickListener, colorFilterAlphaImageView2);
            colorFilterAlphaImageView2.setVisibility(0);
        }
        C63762ux c63762ux = this.A00.A0M;
        C57112jm c57112jm = c63762ux.A00;
        C63622uj c63622uj = c63762ux.A01;
        String id = c3Py.getId();
        id.getClass();
        c57112jm.A05(view, c63622uj.A00(AnonymousClass001.A0b(id, ":", i)));
        C0f9.A0A(940541573, A03);
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C3Py c3Py = (C3Py) obj;
        C42663IuK c42663IuK = (C42663IuK) obj2;
        if (!c42663IuK.Ceb()) {
            int i = 0;
            anonymousClass306.A7a(0);
            C685736u c685736u = this.A00;
            c685736u.getClass();
            c685736u.A02(c3Py, c42663IuK, 0);
            List list = ((H3G) c3Py.A00).A0E;
            if (list != null) {
                i = list.size();
            }
            int i2 = 1;
            if (i != 0) {
                if (i != 1) {
                    i2 = 3;
                    if (i != 2) {
                        i2 = 4;
                    }
                } else {
                    anonymousClass306.A7a(2);
                    this.A00.A02(c3Py, c42663IuK, 2);
                    anonymousClass306.A7a(5);
                    this.A00.A02(c3Py, c42663IuK, 5);
                }
            }
            anonymousClass306.A7a(i2);
            this.A00.A02(c3Py, c42663IuK, i2);
            anonymousClass306.A7a(5);
            this.A00.A02(c3Py, c42663IuK, 5);
        }
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        return ((H3G) ((C3Py) obj).A00).A09.hashCode();
    }

    public C65712y8(Context context, InterfaceC11380iw interfaceC11380iw) {
        this.A01 = context;
        this.A02 = interfaceC11380iw;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        View inflate;
        int A03 = C0f9.A03(-864294842);
        if (i != 0) {
            int i2 = 1;
            if (i != 1) {
                if (i != 2) {
                    i2 = 3;
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                Context context = this.A01;
                                inflate = LayoutInflater.from(context).inflate(R.layout.family_bridges_basic_netego_footer, viewGroup, false);
                                inflate.setTag(new C69304VlC(inflate, context));
                            } else {
                                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unhandled view type");
                                C0f9.A0A(710917976, A03);
                                throw unsupportedOperationException;
                            }
                        }
                    } else {
                        inflate = AbstractC47061KrI.A00(this.A01, 2, viewGroup);
                    }
                }
                inflate = AbstractC47061KrI.A00(this.A01, i2, viewGroup);
            } else {
                inflate = AbstractC47061KrI.A00(this.A01, 0, viewGroup);
            }
        } else {
            inflate = LayoutInflater.from(this.A01).inflate(R.layout.family_bridges_feed_header_view, viewGroup, false);
            inflate.setTag(new C69140ViV(inflate));
        }
        C0f9.A0A(1712643438, A03);
        return inflate;
    }
}
