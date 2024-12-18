package X;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.reels.question.constants.QuestionStickerType;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.ASs, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnFocusChangeListenerC23257ASs implements View.OnFocusChangeListener, InterfaceC25184BCh, InterfaceC195198kL {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public EditText A04;
    public C24014Aks A05;
    public final View A06;
    public final ViewStub A07;
    public final C88W A08;
    public final ArrayList A09;
    public final ArrayList A0A;
    public final Context A0B;
    public final C8NX A0C;
    public final C1810281e A0D;

    public ViewOnFocusChangeListenerC23257ASs(View view, C3I9 c3i9, C8NX c8nx, C1810281e c1810281e) {
        C14360o3.A0B(c1810281e, 3);
        this.A0C = c8nx;
        this.A0D = c1810281e;
        Context A0L = AbstractC166997dE.A0L(view);
        this.A0B = A0L;
        this.A06 = AbstractC166997dE.A0S(view, R.id.text_overlay_edit_text_container);
        this.A07 = AbstractC167007dF.A0M(view, R.id.pics_please_sticker_editor_stub);
        this.A08 = new C88W(A0L, c3i9, this);
        this.A0A = AbstractC16960so.A1M(Integer.valueOf(A0L.getColor(R.color.black)), Integer.valueOf(AbstractC167007dF.A09(A0L, R.attr.igds_color_creation_tools_pink)), Integer.valueOf(AbstractC167007dF.A09(A0L, R.attr.igds_color_creation_tools_purple)), Integer.valueOf(AbstractC167007dF.A09(A0L, R.attr.igds_color_creation_tools_orange)), Integer.valueOf(AbstractC167007dF.A09(A0L, R.attr.igds_color_creation_tools_green)), Integer.valueOf(AbstractC167007dF.A09(A0L, R.attr.igds_color_creation_tools_blue)));
        this.A09 = AbstractC16960so.A1M(AbstractC167027dH.A0P(A0L, 2131953859), AbstractC167027dH.A0P(A0L, 2131969662), AbstractC167027dH.A0P(A0L, 2131971167), AbstractC167027dH.A0P(A0L, 2131969234), AbstractC167027dH.A0P(A0L, 2131963285), AbstractC167027dH.A0P(A0L, 2131953959));
    }

    @Override // X.InterfaceC195198kL
    public final void E0p(int i, int i2) {
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        C14360o3.A0B(view, 0);
        C88W c88w = this.A08;
        if (z) {
            c88w.A00();
            AbstractC13880nE.A0S(view);
            return;
        }
        c88w.A01();
        AbstractC13880nE.A0O(view);
        View view2 = this.A01;
        if (view2 == null) {
            return;
        }
        AbstractC166997dE.A1J(this.A06, view2, false);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, X.AlD] */
    @Override // X.InterfaceC25184BCh
    public final void DDv(Object obj) {
        C24014Aks c24014Aks;
        C8WB c8wb;
        C14360o3.A0B(obj, 0);
        if (!(obj instanceof C8WB) || (c8wb = (C8WB) obj) == null || (c24014Aks = c8wb.A00) == null) {
            QuestionStickerType questionStickerType = QuestionStickerType.A07;
            Context context = this.A0B;
            AlD.A00(context);
            int A01 = AlD.A01(context);
            int A0P = AbstractC167017dG.A0P(this.A0A, this.A00);
            ?? obj2 = new Object();
            ArrayList A1E = AbstractC166987dD.A1E();
            A1E.add(QuestionResponseType.A05);
            obj2.A00 = new URE(questionStickerType, false, AbstractC166997dE.A0a(), AbstractC167007dF.A0d(), AbstractC13950nL.A0F(A0P), null, null, null, null, AbstractC13950nL.A0F(A01), A1E);
            obj2.A01 = null;
            c24014Aks = new C24014Aks(obj2);
        }
        this.A05 = c24014Aks;
        if (this.A01 == null) {
            View inflate = this.A07.inflate();
            this.A01 = inflate;
            C14360o3.A0A(inflate);
            EditText editText = (EditText) inflate.requireViewById(R.id.pics_please_sticker_edit_text);
            C221549qJ.A00(editText);
            editText.setOnFocusChangeListener(this);
            InputFilter[] filters = editText.getFilters();
            C14360o3.A07(filters);
            InputFilter.AllCaps allCaps = new InputFilter.AllCaps();
            int length = filters.length;
            Object[] copyOf = Arrays.copyOf(filters, length + 1);
            copyOf[length] = allCaps;
            editText.setFilters((InputFilter[]) copyOf);
            this.A04 = editText;
            this.A02 = inflate.requireViewById(R.id.pics_please_sticker_editor_container);
            this.A03 = inflate.requireViewById(R.id.pics_please_sticker_container);
            ImageView imageView = (ImageView) inflate.requireViewById(R.id.pics_please_sticker_color_button);
            if (imageView != null) {
                imageView.setImageResource(R.drawable.instagram_icons_exceptions_color_picker_filled_44);
                C3P9 A0s = AbstractC166987dD.A0s(imageView);
                A0s.A02(imageView, this.A03);
                C216559iC.A02(A0s, this, 19);
            }
            View view = this.A02;
            if (view != null) {
                this.A08.A03(view);
            }
        }
        View view2 = this.A01;
        if (view2 != null) {
            AbstractC125325le.A04(null, new View[]{this.A06, view2}, false);
        }
        EditText editText2 = this.A04;
        if (editText2 != null) {
            C24014Aks c24014Aks2 = this.A05;
            if (c24014Aks2 == null) {
                C14360o3.A0F("model");
                throw C00O.createAndThrow();
            }
            editText2.setText(c24014Aks2.A00.A05());
        }
        this.A08.A02(this.A04);
    }

    @Override // X.InterfaceC25184BCh
    public final void DEy() {
        Editable text;
        View view = this.A01;
        if (view != null) {
            AbstractC166997dE.A1J(this.A06, view, false);
        }
        C24014Aks c24014Aks = this.A05;
        String str = null;
        if (c24014Aks != null) {
            EditText editText = this.A04;
            if (editText != null && (text = editText.getText()) != null) {
                str = text.toString();
            }
            c24014Aks.A00.A07(str);
            C8NX c8nx = this.A0C;
            C24014Aks c24014Aks2 = this.A05;
            if (c24014Aks2 != null) {
                c8nx.Dog(c24014Aks2, AbstractC111324zv.A00(5054));
                return;
            }
        }
        C14360o3.A0F("model");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC195198kL
    public final void DOI() {
        EditText editText = this.A04;
        if (editText != null) {
            editText.clearFocus();
        }
        this.A0D.A04(new Object());
    }
}
