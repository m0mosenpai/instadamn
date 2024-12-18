package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.text.fittingtextview.FittingTextView;
import com.instagram.ui.widget.drawing.EyedropperColorPickerTool;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.AdO, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23629AdO implements InterfaceC60072op, InterfaceC185958Mp {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public ImageView A05;
    public TextView A06;
    public W98 A07;
    public AM0 A08;
    public AbstractC202358xF A09;
    public AbstractC202368xG A0A;
    public AbstractC202348xE A0B;
    public AbstractC202378xH A0C;
    public C52253NAt A0D;
    public EnumC53230NgS A0E;
    public C190888ck A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public final View.OnClickListener A0J = new ViewOnClickListenerC23249ASk(this, 34);
    public final View A0K;
    public final View A0L;
    public final ViewStub A0M;
    public final ViewStub A0N;
    public final TextView A0O;
    public final AbstractC59962oe A0P;
    public final UserSession A0Q;
    public final TargetViewSizeProvider A0R;
    public final C8D9 A0S;
    public final ViewOnTouchListenerC1829889t A0T;
    public final AB3 A0U;
    public final AHD A0V;
    public final AG8 A0W;
    public final InterfaceC1810081c A0X;
    public final C8NW A0Y;
    public final C150286pc A0Z;
    public final FittingTextView A0a;
    public final EyedropperColorPickerTool A0b;
    public final View A0c;
    public final ViewStub A0d;
    public final C85H A0e;

    @Override // X.InterfaceC185958Mp
    public final /* synthetic */ void DFM() {
    }

    @Override // X.InterfaceC185958Mp
    public final /* synthetic */ void DFN(int i) {
    }

    public static String A00(C23629AdO c23629AdO) {
        AM0 am0 = c23629AdO.A08;
        if (am0 != null) {
            Product product = am0.A00;
            if (product != null) {
                return product.A0J;
            }
            List list = am0.A04;
            if (list != null) {
                return AbstractC167007dF.A0f(c23629AdO.A0L.getContext(), Integer.valueOf(list.size()), 2131973977);
            }
            ProductCollection productCollection = am0.A01;
            if (productCollection != null) {
                return productCollection.getTitle();
            }
            if (am0.A03 != null) {
                return c23629AdO.A0L.getContext().getString(2131976887);
            }
        }
        throw AbstractC166987dD.A1D("Unsupported Shopping sticker type");
    }

    public static void A01(Drawable drawable, C23629AdO c23629AdO) {
        AbstractC23114AHd.A02(drawable, c23629AdO.A0F);
        ImageView imageView = c23629AdO.A05;
        imageView.getClass();
        imageView.setImageDrawable(null);
    }

    public static void A02(C23629AdO c23629AdO) {
        ImageView imageView;
        Drawable drawable;
        AM0 am0 = c23629AdO.A08;
        am0.getClass();
        if (am0.A00 != null) {
            AM0 am02 = c23629AdO.A08;
            am02.getClass();
            Product product = am02.A00;
            product.getClass();
            AbstractC202348xE abstractC202348xE = c23629AdO.A0B;
            if (abstractC202348xE == null) {
                abstractC202348xE = (AbstractC202348xE) AbstractC166997dE.A0k(c23629AdO.A0V.A01(c23629AdO.A0L.getContext()));
                c23629AdO.A0B = abstractC202348xE;
            }
            abstractC202348xE.A03(product, c23629AdO.A0H, c23629AdO.A00, A04(c23629AdO));
            A01(c23629AdO.A0B, c23629AdO);
            imageView = c23629AdO.A05;
            drawable = c23629AdO.A0B;
        } else {
            AM0 am03 = c23629AdO.A08;
            am03.getClass();
            if (am03.A04 != null) {
                AM0 am04 = c23629AdO.A08;
                am04.getClass();
                List list = am04.A04;
                list.getClass();
                AbstractC202358xF abstractC202358xF = c23629AdO.A09;
                if (abstractC202358xF == null) {
                    abstractC202358xF = (AbstractC202358xF) AbstractC166997dE.A0k(c23629AdO.A0V.A04(c23629AdO.A0L.getContext(), list));
                    c23629AdO.A09 = abstractC202358xF;
                }
                abstractC202358xF.A01(c23629AdO.A0H, c23629AdO.A00);
                A01(c23629AdO.A09, c23629AdO);
                imageView = c23629AdO.A05;
                drawable = c23629AdO.A09;
            } else {
                AM0 am05 = c23629AdO.A08;
                am05.getClass();
                if (am05.A01 != null) {
                    AM0 am06 = c23629AdO.A08;
                    am06.getClass();
                    ProductCollection productCollection = am06.A01;
                    productCollection.getClass();
                    c23629AdO.A08.A00().getClass();
                    AbstractC202368xG abstractC202368xG = c23629AdO.A0A;
                    if (abstractC202368xG == null) {
                        abstractC202368xG = (AbstractC202368xG) AbstractC166997dE.A0k(c23629AdO.A0V.A02(c23629AdO.A0L.getContext(), productCollection));
                        c23629AdO.A0A = abstractC202368xG;
                    }
                    abstractC202368xG.A00(c23629AdO.A00);
                    A01(c23629AdO.A0A, c23629AdO);
                    imageView = c23629AdO.A05;
                    drawable = c23629AdO.A0A;
                } else {
                    AM0 am07 = c23629AdO.A08;
                    am07.getClass();
                    if (am07.A03 != null) {
                        AM0 am08 = c23629AdO.A08;
                        am08.getClass();
                        User user = am08.A03;
                        user.getClass();
                        AbstractC202378xH abstractC202378xH = c23629AdO.A0C;
                        if (abstractC202378xH == null) {
                            abstractC202378xH = (AbstractC202378xH) AbstractC166997dE.A0k(c23629AdO.A0V.A03(c23629AdO.A0L.getContext(), user));
                            c23629AdO.A0C = abstractC202378xH;
                        }
                        abstractC202378xH.A00(c23629AdO.A0H, c23629AdO.A00);
                        A01(c23629AdO.A0C, c23629AdO);
                        imageView = c23629AdO.A05;
                        drawable = c23629AdO.A0C;
                    } else {
                        throw AbstractC166987dD.A1D("Unsupported Shopping sticker type");
                    }
                }
            }
        }
        imageView.setImageDrawable(drawable);
    }

    public static boolean A03(C23629AdO c23629AdO) {
        Product product;
        String str;
        AM0 am0 = c23629AdO.A08;
        if (am0 != null && (product = am0.A00) != null && (str = product.A0J) != null && AbstractC69981Vyz.A01(str).size() > 1) {
            return true;
        }
        return false;
    }

    public static boolean A04(C23629AdO c23629AdO) {
        AM0 am0;
        Product product;
        String str;
        if (c23629AdO.A0H != null && (am0 = c23629AdO.A08) != null && (product = am0.A00) != null && (str = product.A0J) != null && (!str.equalsIgnoreCase(r1))) {
            return true;
        }
        return false;
    }

    public final void A05() {
        this.A0S.A02(false);
        EyedropperColorPickerTool eyedropperColorPickerTool = this.A0b;
        FittingTextView fittingTextView = this.A0a;
        TextView textView = this.A06;
        textView.getClass();
        C150956qv.A08(new View[]{eyedropperColorPickerTool, fittingTextView, textView, this.A0O}, false);
        AbstractC167007dF.A0x(this.A04);
        ((C194918js) this.A0Z.get()).A0A(false);
        View view = this.A0K;
        if (view != null) {
            view.setBackgroundColor(0);
            view.setOnTouchListener(new ViewOnTouchListenerC209789Po(this, 3));
            View view2 = this.A02;
            if (view2 != null) {
                view2.setClickable(false);
            }
        }
    }

    public final void A06() {
        this.A0S.A03(false, false);
        View view = this.A0K;
        View view2 = this.A02;
        view2.getClass();
        View[] viewArr = {view, view2, this.A0b, this.A0a, this.A0O};
        C55942hf c55942hf = C150956qv.A02;
        AbstractC125325le.A04(null, viewArr, false);
        ((C194918js) this.A0Z.get()).A08();
        if (A03(this)) {
            TextView textView = this.A06;
            textView.getClass();
            AbstractC125325le.A04(null, new View[]{textView}, false);
        }
        if (view != null) {
            view.setBackgroundColor(this.A0L.getContext().getColor(R.color.direct_light_mode_sticker_loading_end_color));
            view.setOnTouchListener(new ViewOnTouchListenerC209789Po(this, 4));
            View view3 = this.A02;
            if (view3 != null) {
                view3.setClickable(true);
            }
        }
    }

    @Override // X.InterfaceC185958Mp
    public final void DFK(int i) {
        this.A00 = i;
        A02(this);
        A06();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (this.A0X.CRB(EnumC1810181d.A1D) && !this.A0I) {
            W98 w98 = this.A07;
            w98.getClass();
            int i = 0;
            while (true) {
                List list = w98.A04;
                if (i < list.size()) {
                    ((C69159Vio) list.get(i)).A00 = AbstractC166987dD.A1a(w98.A03.get(i));
                    i++;
                } else {
                    w98.A01.removeAllViews();
                    W98.A00(w98);
                    w98.A02.A00(AbstractC69981Vyz.A00(list));
                    this.A0I = true;
                    return false;
                }
            }
        } else {
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [X.AG8, java.lang.Object] */
    public C23629AdO(final View view, AbstractC59962oe abstractC59962oe, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C8D9 c8d9, ViewOnTouchListenerC1829889t viewOnTouchListenerC1829889t, final C8C0 c8c0, C198308pf c198308pf, InterfaceC1810081c interfaceC1810081c, C8NW c8nw, EyedropperColorPickerTool eyedropperColorPickerTool) {
        C24058Alu c24058Alu = new C24058Alu(this);
        this.A0e = c24058Alu;
        this.A0U = new AB3(this);
        this.A00 = -1;
        this.A0I = true;
        this.A0E = null;
        this.A0X = interfaceC1810081c;
        ((C1809981b) interfaceC1810081c).A01.A01(c24058Alu, EnumC1810181d.A1C);
        this.A0L = view;
        this.A0Y = c8nw;
        this.A0Q = userSession;
        this.A0a = (FittingTextView) view.requireViewById(R.id.done_button);
        this.A0K = view.requireViewById(R.id.text_overlay_edit_text_container);
        this.A0M = (ViewStub) view.requireViewById(R.id.product_sticker_editor_stub);
        this.A0O = AbstractC166997dE.A0T(view, R.id.product_sticker_editor_title);
        this.A0N = (ViewStub) view.requireViewById(R.id.product_sticker_tokenized_edit_stub);
        this.A0S = c8d9;
        c8d9.A01(C8DA.A05);
        this.A0b = eyedropperColorPickerTool;
        this.A0T = viewOnTouchListenerC1829889t;
        this.A0V = new AHD(userSession, c198308pf);
        this.A0P = abstractC59962oe;
        C52253NAt A0X = C1XJ.A00.A0X(userSession);
        this.A0D = A0X;
        abstractC59962oe.registerLifecycleListener(A0X);
        this.A01 = c8c0.A0J;
        this.A0W = new Object();
        ViewStub viewStub = (ViewStub) view.requireViewById(R.id.shopping_overlay_sticker_editor_stub);
        this.A0d = viewStub;
        View inflate = viewStub.inflate();
        this.A0c = inflate;
        this.A04 = (ImageView) inflate.findViewById(R.id.shopping_sticker_picker_button);
        this.A0R = targetViewSizeProvider;
        this.A0Z = AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.B2L
            @Override // X.InterfaceC08830cm
            public final Object get() {
                C23629AdO c23629AdO = this;
                View view2 = view;
                C8C0 c8c02 = c8c0;
                Context context = view2.getContext();
                View view3 = c23629AdO.A0L;
                EditText editText = (EditText) view3.requireViewById(R.id.text_overlay_edit_text);
                return new C194918js(context, view3.requireViewById(R.id.direct_camera_text_format_button), editText, (RecyclerView) view3.requireViewById(R.id.text_tool_format_picker_recycler_view), c23629AdO.A0Q, c23629AdO.A0R, c8c02, new C23901Ahu(c23629AdO), null, false, true);
            }
        }, new InterfaceC143366db[0]);
    }

    @Override // X.InterfaceC185958Mp
    public final void DFI() {
        A06();
    }

    @Override // X.InterfaceC185958Mp
    public final void DFL() {
        A05();
    }
}
