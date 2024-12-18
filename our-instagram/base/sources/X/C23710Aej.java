package X;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.api.schemas.StoryGroupMentionTappableData;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Aej, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23710Aej implements InterfaceC60152ox, InterfaceC25184BCh {
    public C217859kI A00;
    public String A01;
    public final Context A02;
    public final Fragment A03;
    public final UserSession A04;
    public final AnonymousClass840 A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final C3I9 A0I;
    public final C8O8 A0J;
    public final InterfaceC1810081c A0K;
    public final C8NX A0L;
    public final C190388bw A0M;
    public final String A0N;

    public C23710Aej(View view, Fragment fragment, UserSession userSession, C3I9 c3i9, C8O8 c8o8, AnonymousClass840 anonymousClass840, InterfaceC1810081c interfaceC1810081c, C8NX c8nx, C190388bw c190388bw, String str) {
        AbstractC167007dF.A1I(str, 3, c190388bw);
        C14360o3.A0B(c8o8, 9);
        this.A04 = userSession;
        this.A05 = anonymousClass840;
        this.A0N = str;
        this.A0K = interfaceC1810081c;
        this.A0I = c3i9;
        this.A0L = c8nx;
        this.A0M = c190388bw;
        this.A0J = c8o8;
        this.A03 = fragment;
        this.A02 = view.getContext();
        this.A08 = B8T.A02(view, 39);
        this.A0D = B8T.A02(view, 44);
        this.A0C = B8T.A02(this, 43);
        this.A0B = B8T.A02(this, 42);
        this.A06 = B8T.A02(this, 37);
        this.A0H = B8T.A02(this, 48);
        this.A0F = B8T.A02(this, 46);
        this.A09 = B8T.A02(this, 40);
        this.A0E = B8T.A02(this, 45);
        this.A0G = B8T.A02(this, 47);
        this.A0A = B8T.A02(view, 41);
        this.A07 = B8T.A02(this, 38);
    }

    private final void A00(int i) {
        InterfaceC09390do interfaceC09390do = this.A06;
        ViewGroup.LayoutParams layoutParams = AbstractC166987dD.A0d(interfaceC09390do).getLayoutParams();
        C14360o3.A0C(layoutParams, AbstractC111324zv.A00(0));
        C56302iJ c56302iJ = (C56302iJ) layoutParams;
        if (c56302iJ.A0W != i) {
            View A0d = AbstractC166987dD.A0d(this.A0B);
            C14360o3.A0C(A0d, "null cannot be cast to non-null type android.view.ViewGroup");
            TransitionManager.beginDelayedTransition((ViewGroup) A0d);
            c56302iJ.A0W = i;
            AbstractC166987dD.A0d(interfaceC09390do).setLayoutParams(c56302iJ);
            C8NX c8nx = this.A0L;
            boolean A1N = AbstractC167007dF.A1N(i);
            View[] viewArr = {((C8NW) c8nx).A1j};
            if (A1N) {
                C55942hf c55942hf = C150956qv.A02;
                AbstractC125325le.A04(null, viewArr, false);
            } else {
                C150956qv.A08(viewArr, false);
            }
        }
    }

    public static final void A01(C23710Aej c23710Aej) {
        C217859kI c217859kI = c23710Aej.A00;
        if (c217859kI != null) {
            String str = c217859kI.A00.A03;
            if (str == null || str.length() == 0) {
                str = "@";
            }
            ((TextView) c23710Aej.A0E.getValue()).setText(str);
            ImageView imageView = (ImageView) c23710Aej.A09.getValue();
            Context context = c23710Aej.A02;
            C14360o3.A06(context);
            String str2 = c23710Aej.A0N;
            C217859kI c217859kI2 = c23710Aej.A00;
            if (c217859kI2 != null) {
                imageView.setImageDrawable(new C216189hb(context, c217859kI2, str2));
                C8NX c8nx = c23710Aej.A0L;
                C217859kI c217859kI3 = c23710Aej.A00;
                if (c217859kI3 != null) {
                    boolean z = true;
                    if (c217859kI3.A06.size() + c217859kI3.A05.size() <= 1) {
                        z = false;
                    }
                    ((C8NW) c8nx).A1Q(z);
                    return;
                }
            }
        }
        C14360o3.A0F("model");
        throw C00O.createAndThrow();
    }

    public static final void A02(C23710Aej c23710Aej, boolean z) {
        Drawable background = AbstractC166987dD.A0d(c23710Aej.A0F).getBackground();
        C217859kI c217859kI = c23710Aej.A00;
        if (c217859kI != null) {
            background.setTint(AbstractC22747A1r.A00(c217859kI));
            InterfaceC09390do interfaceC09390do = c23710Aej.A0E;
            TextPaint paint = ((TextView) interfaceC09390do.getValue()).getPaint();
            Context context = c23710Aej.A02;
            C14360o3.A06(context);
            C217859kI c217859kI2 = c23710Aej.A00;
            if (c217859kI2 != null) {
                TextPaint paint2 = ((TextView) interfaceC09390do.getValue()).getPaint();
                C14360o3.A07(paint2);
                int[] A00 = AbstractC22746A1q.A00(context, c217859kI2);
                String str = c217859kI2.A00.A03;
                if (str == null || str.length() == 0) {
                    str = "@";
                }
                paint.setShader(new LinearGradient(0.0f, 0.0f, paint2.measureText(str), 0.0f, A00, (float[]) null, Shader.TileMode.CLAMP));
                AbstractC114525Ex.A02((TextView) interfaceC09390do.getValue(), ALl.A01(context, AbstractC167007dF.A0g((EditText) interfaceC09390do.getValue())));
                AbstractC166987dD.A0d(interfaceC09390do).requestLayout();
                if (z) {
                    ImageView imageView = (ImageView) c23710Aej.A09.getValue();
                    String str2 = c23710Aej.A0N;
                    C217859kI c217859kI3 = c23710Aej.A00;
                    if (c217859kI3 != null) {
                        imageView.setImageDrawable(new C216189hb(context, c217859kI3, str2));
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        C14360o3.A0F("model");
        throw C00O.createAndThrow();
    }

    public static final void A03(C23710Aej c23710Aej, boolean z) {
        String str;
        Editable text;
        InterfaceC09390do interfaceC09390do = c23710Aej.A0E;
        TextView textView = (TextView) interfaceC09390do.getValue();
        if (z && ((text = ((EditText) interfaceC09390do.getValue()).getText()) == null || text.length() == 0)) {
            str = c23710Aej.A02.getString(2131963351);
        } else {
            str = null;
        }
        textView.setHint(str);
    }

    public static final void A04(C23710Aej c23710Aej, boolean z) {
        Fragment fragment = c23710Aej.A03;
        Fragment A0Q = fragment.getChildFragmentManager().A0Q("group_mention_search_fragment_tag");
        if (A0Q != null) {
            C14240no c14240no = new C14240no(fragment.getChildFragmentManager());
            c14240no.A07(R.anim.bottom_in, R.anim.bottom_out, 0, 0);
            if (z) {
                c14240no.A08(A0Q);
            } else {
                c14240no.A02(A0Q);
                c23710Aej.A00(0);
            }
            c14240no.A01();
            int i = 2131963359;
            if (z) {
                i = 2131963358;
            }
            InterfaceC09390do interfaceC09390do = c23710Aej.A0G;
            AbstractC166987dD.A0d(interfaceC09390do).getHandler().removeCallbacksAndMessages(null);
            AbstractC166987dD.A1P(AbstractC166987dD.A0d(interfaceC09390do).getContext(), (TextView) interfaceC09390do.getValue(), i);
            AbstractC125325le.A04(null, new View[]{AbstractC166987dD.A0d(interfaceC09390do)}, true);
            AbstractC166987dD.A0d(interfaceC09390do).getHandler().postDelayed(new RunnableC24373ArG(c23710Aej), 2500L);
        }
    }

    @Override // X.InterfaceC25184BCh
    public final void DDv(Object obj) {
        C14360o3.A0B(obj, 0);
        C217859kI c217859kI = ((C8VE) obj).A00;
        if (c217859kI == null) {
            C190388bw c190388bw = this.A0M;
            String A05 = this.A05.A02.A01.A05();
            c217859kI = new C217859kI(new StoryGroupMentionTappableData(0, null, "", null, AbstractC166987dD.A1J(C17060sy.A01.A01(this.A04))));
            c190388bw.A00 = new C38687GzS(c217859kI, A05);
        }
        this.A00 = c217859kI;
        String str = "model";
        if (c217859kI.A04.length() == 0) {
            C1816783z c1816783z = this.A05.A02;
            if (c1816783z.A01.A0n.size() > 1) {
                C217859kI c217859kI2 = this.A00;
                if (c217859kI2 != null) {
                    if (c217859kI2.A02 == null) {
                        c217859kI2.A02 = AbstractC166997dE.A0n();
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            this.A01 = AbstractC166997dE.A0n();
            this.A0I.A9e(this);
            Fragment fragment = this.A03;
            if (fragment.getChildFragmentManager().A0Q("group_mention_search_fragment_tag") == null) {
                C198308pf A00 = c1816783z.A00();
                UserSession userSession = this.A04;
                C217859kI c217859kI3 = this.A00;
                if (c217859kI3 != null) {
                    List list = c217859kI3.A05;
                    List list2 = c217859kI3.A06;
                    String str2 = A00.A06;
                    C14360o3.A07(str2);
                    String str3 = c1816783z.A01().A01;
                    String str4 = this.A01;
                    if (str4 == null) {
                        str = "sessionId";
                    } else {
                        C32330EMc A002 = AbstractC34280FAa.A00(userSession, this, EnumC33393EpQ.A04, null, str2, str3, str4, this.A02.getString(2131963360), list, list2, -1, false, false, false);
                        C14240no c14240no = new C14240no(fragment.getChildFragmentManager());
                        c14240no.A0C(A002, "group_mention_search_fragment_tag", R.id.group_mention_sticker_user_search_container);
                        c14240no.A07(R.anim.bottom_in, R.anim.bottom_out, 0, 0);
                        c14240no.A01();
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            InterfaceC09390do interfaceC09390do = this.A0D;
            if (!AbstractC167007dF.A1a(interfaceC09390do)) {
                InterfaceC09390do interfaceC09390do2 = this.A07;
                C3P9 A0s = AbstractC166987dD.A0s(AbstractC167007dF.A0L(interfaceC09390do2));
                View A0L = AbstractC167007dF.A0L(interfaceC09390do2);
                InterfaceC09390do interfaceC09390do3 = this.A0F;
                A0s.A02(A0L, AbstractC166987dD.A0d(interfaceC09390do3));
                C216559iC.A02(A0s, this, 9);
                InterfaceC09390do interfaceC09390do4 = this.A09;
                C3P9 A0s2 = AbstractC166987dD.A0s(AbstractC166987dD.A0d(interfaceC09390do4));
                A0s2.A02(AbstractC166987dD.A0d(interfaceC09390do4));
                C216559iC.A02(A0s2, this, 10);
                InterfaceC09390do interfaceC09390do5 = this.A0E;
                TextView textView = (TextView) interfaceC09390do5.getValue();
                textView.setOnFocusChangeListener(new ViewOnFocusChangeListenerC23253ASo(this, 0));
                textView.addTextChangedListener(new C35469Fl4(this, 2));
                ArrayList arrayList = new ArrayList(2);
                AbstractC15480q3.A00(textView.getFilters(), arrayList);
                arrayList.add(new C23187APj(AbstractC166987dD.A0d(interfaceC09390do3), textView, (IgSimpleImageView) interfaceC09390do4.getValue()));
                textView.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[arrayList.size()]));
                textView.setTypeface(AbstractC167017dG.A0S(AbstractC166997dE.A0L(textView)));
                textView.setHintTextColor(((TextView) interfaceC09390do5.getValue()).getTextColors().withAlpha(119).getDefaultColor());
            }
            A01(this);
            A04(this, true);
            AbstractC125325le.A04(null, new View[]{AbstractC166987dD.A0d(this.A08), AbstractC167017dG.A0V(interfaceC09390do)}, false);
            AbstractC166997dE.A1L(AbstractC166987dD.A0d(this.A0A), false);
        } else {
            this.A0K.E4u(C8UR.A00);
        }
        C8O8 c8o8 = this.A0J;
        C217859kI c217859kI4 = this.A00;
        if (c217859kI4 != null) {
            String str5 = c217859kI4.A04;
            if (str5.length() == 0) {
                str5 = "group_mention_sticker_bundle_id";
            }
            c8o8.Dom(str5);
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC25184BCh
    public final void DEy() {
        this.A0I.EFx(this);
        C8NX c8nx = this.A0L;
        C217859kI c217859kI = this.A00;
        if (c217859kI != null) {
            String str = "group_mention_sticker_bundle_id";
            c8nx.Dog(c217859kI, "group_mention_sticker_bundle_id");
            InterfaceC09390do interfaceC09390do = this.A0D;
            if (AbstractC167007dF.A1a(interfaceC09390do)) {
                Fragment fragment = this.A03;
                Fragment A0Q = fragment.getChildFragmentManager().A0Q("group_mention_search_fragment_tag");
                if (A0Q != null) {
                    C14240no c14240no = new C14240no(fragment.getChildFragmentManager());
                    c14240no.A03(A0Q);
                    c14240no.A01();
                }
                AbstractC166997dE.A1J((View) this.A08.getValue(), AbstractC167017dG.A0V(interfaceC09390do), false);
            }
            C8O8 c8o8 = this.A0J;
            C217859kI c217859kI2 = this.A00;
            if (c217859kI2 != null) {
                String str2 = c217859kI2.A04;
                if (str2.length() != 0) {
                    str = str2;
                }
                c8o8.Doh(str);
                return;
            }
        }
        C14360o3.A0F("model");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000d, code lost:
    
        if (X.AbstractC166987dD.A0d(r4.A0E).hasFocus() == false) goto L5;
     */
    @Override // X.InterfaceC60152ox
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DOK(int r5, boolean r6) {
        /*
            r4 = this;
            if (r5 == 0) goto Lf
            X.0do r0 = r4.A0E
            android.view.View r0 = X.AbstractC166987dD.A0d(r0)
            boolean r1 = r0.hasFocus()
            r0 = 0
            if (r1 != 0) goto L10
        Lf:
            r0 = 1
        L10:
            A04(r4, r0)
            if (r5 != 0) goto L1e
            X.0do r0 = r4.A0B
            android.view.View r0 = X.AbstractC166987dD.A0d(r0)
            r0.clearFocus()
        L1e:
            androidx.fragment.app.Fragment r0 = r4.A03
            X.0h2 r1 = r0.getChildFragmentManager()
            java.lang.String r0 = "group_mention_search_fragment_tag"
            androidx.fragment.app.Fragment r0 = r1.A0Q(r0)
            if (r0 == 0) goto L6e
            boolean r0 = r0.mDetached
            if (r0 != 0) goto L6e
            android.content.Context r0 = r4.A02
            android.util.DisplayMetrics r0 = X.AbstractC167007dF.A0K(r0)
            int r1 = r0.heightPixels
            X.0do r3 = r4.A0B
            android.view.View r0 = X.AbstractC166987dD.A0d(r3)
            int r0 = r0.getHeight()
            int r1 = r1 - r0
            int r5 = r5 - r1
            r0 = 0
            int r0 = java.lang.Math.max(r5, r0)
            r4.A00(r0)
            if (r0 != 0) goto L6f
            r2 = 1059481190(0x3f266666, float:0.65)
        L51:
            X.0do r3 = r4.A0H
            android.view.View r0 = X.AbstractC166987dD.A0d(r3)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r0 = 0
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.C14360o3.A0C(r1, r0)
            X.2iJ r1 = (X.C56302iJ) r1
            r1.A05 = r2
            android.view.View r0 = X.AbstractC166987dD.A0d(r3)
            r0.setLayoutParams(r1)
        L6e:
            return
        L6f:
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = (float) r0
            android.view.View r0 = X.AbstractC166987dD.A0d(r3)
            int r0 = r0.getBottom()
            float r0 = (float) r0
            float r1 = r1 / r0
            float r2 = r2 - r1
            goto L51
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23710Aej.DOK(int, boolean):void");
    }
}
