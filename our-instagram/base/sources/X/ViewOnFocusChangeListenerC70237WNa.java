package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.WNa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnFocusChangeListenerC70237WNa implements View.OnFocusChangeListener, InterfaceC25184BCh, InterfaceC195198kL, InterfaceC25183BCg, TextView.OnEditorActionListener {
    public int A01;
    public View.OnTouchListener A02;
    public View A03;
    public ViewGroup A04;
    public EditText A05;
    public LinearLayout A06;
    public TextView A07;
    public EnumC209229Ne A08;
    public ArrayList A0A;
    public final Context A0C;
    public final View A0D;
    public final View A0E;
    public final ViewStub A0F;
    public final TargetViewSizeProvider A0G;
    public final C8NX A0H;
    public final C88W A0I;
    public final List A0K;
    public final String[] A0L;
    public final UserSession A0M;
    public final C8O8 A0N;
    public final List A0J = new ArrayList();
    public int A00 = -1;
    public int[] A0B = new int[2];
    public String A09 = "";

    private void A05(List list) {
        for (int i = 0; i < list.size(); i++) {
            WDH wdh = (WDH) this.A0J.get(i);
            wdh.A02((InterfaceC43540JLa) list.get(i));
            wdh.A03(false);
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 5) {
            List list = this.A0J;
            if (((WDH) list.get(list.size() - 1)).A04.hasFocus()) {
                this.A05.requestFocus();
                return true;
            }
            return false;
        }
        return false;
    }

    private void A00() {
        EditText editText;
        if (this.A05.hasFocus()) {
            editText = this.A05;
        } else {
            Iterator it = this.A0J.iterator();
            while (it.hasNext()) {
                editText = ((WDH) it.next()).A04;
                if (editText.hasFocus()) {
                }
            }
            return;
        }
        editText.clearFocus();
    }

    private void A01() {
        if (this.A03 != null) {
            View view = this.A0E;
            ViewGroup viewGroup = this.A04;
            viewGroup.getClass();
            C150956qv.A08(new View[]{view, viewGroup}, false);
            A00();
            View view2 = this.A0D;
            view2.getClass();
            view2.setEnabled(true);
            AJq.A01(view2, true);
        }
    }

    private void A02(InterfaceC43540JLa interfaceC43540JLa, int i) {
        View inflate = LayoutInflater.from(this.A0C).inflate(R.layout.quiz_sticker_editor_answer_row, (ViewGroup) this.A06, false);
        WDH wdh = new WDH(inflate, interfaceC43540JLa, this, i);
        int[] iArr = this.A0B;
        int[] iArr2 = wdh.A05;
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        WDH.A00(wdh);
        this.A0J.add(wdh);
        this.A06.addView(inflate);
    }

    public static void A03(ViewOnFocusChangeListenerC70237WNa viewOnFocusChangeListenerC70237WNa, EnumC209229Ne enumC209229Ne) {
        viewOnFocusChangeListenerC70237WNa.A08 = enumC209229Ne;
        viewOnFocusChangeListenerC70237WNa.A0B = AbstractC209259Nh.A02(enumC209229Ne);
        Drawable background = viewOnFocusChangeListenerC70237WNa.A05.getBackground();
        background.getClass();
        ((GradientDrawable) background.mutate()).setColors(viewOnFocusChangeListenerC70237WNa.A0B);
        for (WDH wdh : viewOnFocusChangeListenerC70237WNa.A0J) {
            int[] iArr = viewOnFocusChangeListenerC70237WNa.A0B;
            int[] iArr2 = wdh.A05;
            iArr2[0] = iArr[0];
            iArr2[1] = iArr[1];
            WDH.A00(wdh);
        }
    }

    public static boolean A06(ViewOnFocusChangeListenerC70237WNa viewOnFocusChangeListenerC70237WNa) {
        int i;
        List list = viewOnFocusChangeListenerC70237WNa.A0J;
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (!TextUtils.isEmpty(AbstractC31177DnL.A0c(((WDH) it.next()).A04))) {
                i2++;
            }
        }
        if (i2 >= 2 && (i = viewOnFocusChangeListenerC70237WNa.A00) != -1 && !TextUtils.isEmpty(AbstractC31177DnL.A0c(((WDH) list.get(i)).A04))) {
            return true;
        }
        return false;
    }

    public final void A07() {
        List list = this.A0J;
        if (list.size() < 4) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (TextUtils.isEmpty(AbstractC31177DnL.A0c(((WDH) it.next()).A04))) {
                        break;
                    }
                } else {
                    if (this.A00 == -1) {
                        A08(1);
                        C149686oL c149686oL = new C149686oL(2131971435);
                        Context context = this.A0C;
                        ViewGroup viewGroup = this.A04;
                        viewGroup.getClass();
                        C5SU c5su = new C5SU(context, viewGroup, c149686oL);
                        c5su.A03(this.A06.getChildAt(0));
                        c5su.A02();
                        AbstractC166997dE.A1P(c5su);
                    }
                    A02(new C38784H5y(true, null, this.A0L[list.size()], null), list.size());
                }
            }
        }
        boolean A06 = A06(this);
        View view = this.A0D;
        view.getClass();
        view.setEnabled(A06);
        AJq.A01(view, A06);
        C150956qv.A08(new View[]{this.A07}, false);
    }

    public final void A08(int i) {
        int i2 = this.A00;
        if (i2 != -1 && i2 != i) {
            ((WDH) this.A0J.get(i2)).A03(false);
        }
        this.A00 = i;
        if (i != -1) {
            ((WDH) this.A0J.get(i)).A03(true);
        }
        boolean A06 = A06(this);
        View view = this.A0D;
        view.getClass();
        view.setEnabled(A06);
        AJq.A01(view, A06);
    }

    @Override // X.InterfaceC25183BCg
    public final View B0N() {
        if (C18U.A06(C06090Tz.A06, this.A0M, 36323238502083678L)) {
            return this.A03;
        }
        return null;
    }

    @Override // X.InterfaceC25183BCg
    public final Class C0Y() {
        return V9Y.class;
    }

    @Override // X.InterfaceC25184BCh
    public final void DDv(Object obj) {
        EnumC209229Ne enumC209229Ne;
        if (this.A03 == null) {
            ViewGroup viewGroup = (ViewGroup) this.A0F.inflate();
            this.A04 = viewGroup;
            viewGroup.getClass();
            View requireViewById = viewGroup.requireViewById(R.id.quiz_sticker);
            this.A03 = requireViewById;
            C88W c88w = this.A0I;
            c88w.A03(requireViewById);
            c88w.A03.A04 = true;
            View view = this.A03;
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC70241WNe(((NineSixteenLayoutConfigImpl) this.A0G).A0K.getHeight(), 0, view, c88w));
            WO5.A00(this.A03, 8, this);
            EditText editText = (EditText) this.A03.requireViewById(R.id.quiz_sticker_question);
            this.A05 = editText;
            editText.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
            C6QV.A02(this.A05);
            this.A05.setOnFocusChangeListener(this);
            EditText editText2 = this.A05;
            editText2.addTextChangedListener(new C221549qJ(editText2, 2));
            this.A06 = (LinearLayout) this.A03.requireViewById(R.id.quiz_sticker_answer_list);
            A04(this.A0K);
            ViewGroup viewGroup2 = this.A04;
            viewGroup2.getClass();
            ImageView imageView = (ImageView) viewGroup2.requireViewById(R.id.quiz_sticker_color_button);
            imageView.setImageResource(R.drawable.instagram_icons_exceptions_color_picker_filled_44);
            C3P9 c3p9 = new C3P9(imageView);
            c3p9.A02(imageView, this.A03);
            c3p9.A04 = new C68003V5v(this, 5);
            c3p9.A00();
            ViewGroup viewGroup3 = this.A04;
            viewGroup3.getClass();
            this.A07 = (TextView) viewGroup3.requireViewById(R.id.incomplete_error_view);
            this.A02 = new WO5(this, 9);
        }
        this.A04.getClass();
        C150956qv.A09(new View[]{this.A0E, this.A04}, false);
        this.A04.setOnTouchListener(this.A02);
        C88W c88w2 = this.A0I;
        c88w2.A02(c88w2.A01);
        C8UV c8uv = (C8UV) obj;
        Wm1 wm1 = c8uv.A00;
        EditText editText3 = this.A05;
        if (wm1 == null) {
            editText3.setText("");
            List list = this.A0K;
            A04(list);
            A05(list);
            this.A00 = -1;
            this.A01 = 0;
            enumC209229Ne = (EnumC209229Ne) this.A0A.get(0);
        } else {
            editText3.setText(wm1.A01);
            URM urm = wm1.A02;
            List list2 = urm.A0B;
            if (list2 != null) {
                while (list2.size() < 2) {
                    list2.add(this.A0K.get(list2.size()));
                }
                A04(list2);
                A05(list2);
            }
            A08(wm1.A00());
            String str = urm.A04;
            if (str != null) {
                this.A09 = str;
                this.A05.setHint(str);
            }
            A07();
            this.A01 = this.A0A.indexOf(wm1.A00);
            enumC209229Ne = wm1.A00;
        }
        A03(this, enumC209229Ne);
        AbstractC167017dG.A18(this.A05);
        String str2 = c8uv.A01;
        this.A09 = str2;
        this.A05.setHint(str2);
        boolean A06 = A06(this);
        View view2 = this.A0D;
        view2.getClass();
        view2.setEnabled(A06);
        AJq.A01(view2, A06);
        C8O8 c8o8 = this.A0N;
        C148276lx c148276lx = C148276lx.A1L;
        c8o8.Dom("quiz_sticker_bundle_id");
    }

    @Override // X.InterfaceC25184BCh
    public final void DEy() {
        C8NX c8nx = this.A0H;
        ArrayList arrayList = new ArrayList();
        int i = this.A00;
        if (i != -1 && TextUtils.isEmpty(AbstractC31177DnL.A0c(((WDH) this.A0J.get(i)).A04))) {
            this.A00 = -1;
        }
        int i2 = 0;
        while (true) {
            List list = this.A0J;
            if (i2 < list.size()) {
                WDH wdh = (WDH) list.get(i2);
                if (TextUtils.isEmpty(AbstractC31177DnL.A0c(wdh.A04))) {
                    int i3 = this.A00;
                    if (i2 <= i3) {
                        this.A00 = i3 - 1;
                    }
                } else {
                    arrayList.add(new C38784H5y(null, null, this.A0L[arrayList.size()], AbstractC31177DnL.A0c(wdh.A04)));
                }
                i2++;
            } else {
                C69659Vt0 A00 = VWC.A00();
                A00.A07 = AbstractC31177DnL.A0c(this.A05);
                A00.A0B = arrayList;
                A00.A02 = Integer.valueOf(this.A00);
                A00.A0A = AbstractC13950nL.A0F(this.A05.getCurrentTextColor());
                A00.A09 = AbstractC13950nL.A0F(this.A0B[0]);
                A00.A05 = AbstractC13950nL.A0F(this.A0B[1]);
                A00.A04 = this.A09;
                Wm1 wm1 = new Wm1(A00.A00());
                EnumC209229Ne enumC209229Ne = this.A08;
                C14360o3.A0B(enumC209229Ne, 0);
                wm1.A00 = enumC209229Ne;
                c8nx.Dog(wm1, null);
                A01();
                C8O8 c8o8 = this.A0N;
                C148276lx c148276lx = C148276lx.A1L;
                c8o8.Doh("quiz_sticker_bundle_id");
                return;
            }
        }
    }

    @Override // X.InterfaceC195198kL
    public final void E0p(int i, int i2) {
        this.A03.requestLayout();
        this.A07.setTranslationY(-this.A0I.A03.A01);
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (view instanceof EditText) {
            EditText editText = (EditText) view;
            if (z) {
                this.A0I.A00();
                C14360o3.A0B(view, 0);
                AbstractC13880nE.A0S(view);
                AbstractC167017dG.A18(editText);
            } else {
                editText.setText(AbstractC31177DnL.A0c(editText));
                if (!this.A05.hasFocus()) {
                    Iterator it = this.A0J.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((WDH) it.next()).A04.hasFocus()) {
                                break;
                            }
                        } else {
                            this.A0I.A01();
                            C14360o3.A0B(view, 0);
                            AbstractC13880nE.A0O(view);
                            A01();
                            break;
                        }
                    }
                }
            }
            C150956qv.A08(new View[]{this.A07}, false);
        }
    }

    public ViewOnFocusChangeListenerC70237WNa(View view, UserSession userSession, C3I9 c3i9, C8O8 c8o8, TargetViewSizeProvider targetViewSizeProvider, C8NX c8nx) {
        this.A0M = userSession;
        Context context = view.getContext();
        this.A0C = context;
        this.A0G = targetViewSizeProvider;
        this.A0I = new C88W(context, c3i9, this);
        this.A0H = c8nx;
        this.A0N = c8o8;
        this.A0L = context.getResources().getStringArray(R.array.quiz_sticker_answer_row_hint_text);
        this.A0E = view.requireViewById(R.id.text_overlay_edit_text_container);
        this.A0F = (ViewStub) view.requireViewById(R.id.quiz_sticker_editor_stub);
        this.A0D = view.findViewById(R.id.done_button);
        this.A0K = VZ0.A00(context.getResources());
        ArrayList arrayList = A4H.A05;
        this.A0A = arrayList;
        this.A08 = (EnumC209229Ne) arrayList.get(0);
    }

    private void A04(List list) {
        int max = Math.max(list.size(), 2) - this.A06.getChildCount();
        int i = 0;
        if (max < 0) {
            int i2 = -max;
            while (i < i2) {
                this.A06.removeViewAt(r1.getChildCount() - 1);
                this.A0J.remove(r1.size() - 1);
                i++;
            }
            return;
        }
        while (i < max) {
            A02((InterfaceC43540JLa) list.get(i), i);
            i++;
        }
    }

    @Override // X.InterfaceC195198kL
    public final void DOI() {
        A00();
        this.A0H.DOI();
    }
}
