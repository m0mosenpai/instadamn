package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.gallery.Medium;

/* renamed from: X.ASr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnFocusChangeListenerC23256ASr implements View.OnFocusChangeListener, InterfaceC25184BCh, InterfaceC195198kL {
    public View A00;
    public EditText A01;
    public ImageView A02;
    public TextView A03;
    public C24016Aku A04;
    public final int A05;
    public final int A06;
    public final Context A07;
    public final View A08;
    public final ViewStub A09;
    public final C88W A0A;
    public final InterfaceC1810081c A0B;
    public final C8NX A0C;

    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0105  */
    @Override // X.InterfaceC25184BCh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DDv(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnFocusChangeListenerC23256ASr.DDv(java.lang.Object):void");
    }

    @Override // X.InterfaceC195198kL
    public final void E0p(int i, int i2) {
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        C14360o3.A0B(view, 0);
        C88W c88w = this.A0A;
        if (z) {
            c88w.A00();
            AbstractC13880nE.A0S(view);
            return;
        }
        c88w.A01();
        AbstractC13880nE.A0O(view);
        View view2 = this.A00;
        if (view2 == null) {
            return;
        }
        AbstractC166997dE.A1J(this.A08, view2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.5NL, X.Aku, java.lang.Object] */
    @Override // X.InterfaceC25184BCh
    public final void DEy() {
        View view = this.A00;
        if (view != null) {
            AbstractC166997dE.A1J(this.A08, view, false);
        }
        EditText editText = this.A01;
        Medium medium = null;
        if (editText == null) {
            C14360o3.A0F("captionEditText");
            throw C00O.createAndThrow();
        }
        String A0g = AbstractC167007dF.A0g(editText);
        C24016Aku c24016Aku = this.A04;
        if (c24016Aku != null) {
            medium = c24016Aku.A00;
        }
        ?? obj = new Object();
        obj.A00 = medium;
        obj.A01 = A0g;
        this.A0C.Dog(obj, "polaroid_sticker_bundle_id");
    }

    @Override // X.InterfaceC195198kL
    public final void DOI() {
        EditText editText = this.A01;
        if (editText == null) {
            C14360o3.A0F("captionEditText");
            throw C00O.createAndThrow();
        }
        editText.clearFocus();
        InterfaceC1810081c.A00(this.A0B);
    }

    public ViewOnFocusChangeListenerC23256ASr(View view, C3I9 c3i9, InterfaceC1810081c interfaceC1810081c, C8NX c8nx) {
        this.A0C = c8nx;
        this.A0B = interfaceC1810081c;
        Context A0L = AbstractC166997dE.A0L(view);
        this.A07 = A0L;
        this.A06 = A0L.getResources().getDimensionPixelSize(R.dimen.browser_error_screen_description_width);
        this.A05 = A0L.getResources().getDimensionPixelSize(R.dimen.ar_effect_picker_background_height);
        this.A08 = AbstractC166997dE.A0S(view, R.id.text_overlay_edit_text_container);
        this.A09 = AbstractC167007dF.A0M(view, R.id.polaroid_sticker_editor_stub);
        this.A0A = new C88W(A0L, c3i9, this);
    }
}
