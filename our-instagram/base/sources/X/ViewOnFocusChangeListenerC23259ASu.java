package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.ASu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnFocusChangeListenerC23259ASu implements View.OnFocusChangeListener, InterfaceC25184BCh, InterfaceC195198kL, InterfaceC25183BCg {
    public View A00;
    public EditText A01;
    public ImageView A02;
    public C24017Akv A03;
    public final Context A04;
    public final View A05;
    public final ViewStub A06;
    public final UserSession A07;
    public final C88W A08;
    public final InterfaceC1810081c A09;
    public final C8NX A0A;

    public ViewOnFocusChangeListenerC23259ASu(View view, UserSession userSession, C3I9 c3i9, InterfaceC1810081c interfaceC1810081c, C8NX c8nx, String str) {
        C14360o3.A0B(str, 3);
        this.A07 = userSession;
        this.A0A = c8nx;
        this.A09 = interfaceC1810081c;
        Context A0L = AbstractC166997dE.A0L(view);
        this.A04 = A0L;
        this.A05 = AbstractC166997dE.A0S(view, R.id.text_overlay_edit_text_container);
        this.A06 = AbstractC167007dF.A0M(view, R.id.secret_sticker_editor_stub);
        this.A08 = new C88W(A0L, c3i9, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r0 == null) goto L8;
     */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.Akv] */
    @Override // X.InterfaceC25184BCh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DDv(java.lang.Object r7) {
        /*
            r6 = this;
            r4 = 0
            X.C14360o3.A0B(r7, r4)
            X.0cb r1 = X.C17060sy.A01
            com.instagram.common.session.UserSession r0 = r6.A07
            com.instagram.user.model.User r1 = r1.A01(r0)
            boolean r0 = r7 instanceof X.C188308Vv
            r3 = 0
            if (r0 == 0) goto L19
            X.8Vv r7 = (X.C188308Vv) r7
            if (r7 == 0) goto L19
            X.Akv r0 = r7.A00
            if (r0 != 0) goto L22
        L19:
            X.Akv r0 = new X.Akv
            r0.<init>()
            r0.A01 = r3
            r0.A00 = r1
        L22:
            r6.A03 = r0
            android.view.View r0 = r6.A00
            if (r0 != 0) goto L89
            android.view.ViewStub r0 = r6.A06
            android.view.View r5 = r0.inflate()
            r6.A00 = r5
            X.C14360o3.A0A(r5)
            r0 = 2131440949(0x7f0b3535, float:1.8503896E38)
            android.view.View r0 = r5.requireViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r6.A02 = r0
            r0 = 2131440947(0x7f0b3533, float:1.8503892E38)
            android.view.View r0 = r5.requireViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            X.C221549qJ.A00(r0)
            r0.setOnFocusChangeListener(r6)
            r6.A01 = r0
            android.content.Context r0 = r6.A04
            int r1 = X.AbstractC167017dG.A0E(r0)
            android.widget.EditText r0 = r6.A01
            if (r0 == 0) goto Lae
            X.AbstractC13880nE.A0Y(r0, r1)
            android.widget.ImageView r1 = r6.A02
            if (r1 != 0) goto L6a
            java.lang.String r0 = "facepileView"
        L62:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L6a:
            r0 = 8
            r1.setVisibility(r0)
            r0 = 2131440942(0x7f0b352e, float:1.8503882E38)
            android.view.View r2 = r5.requireViewById(r0)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.content.Context r1 = X.AbstractC166997dE.A0L(r2)
            X.9hX r0 = new X.9hX
            r0.<init>(r1)
            r2.setImageDrawable(r0)
            X.88W r0 = r6.A08
            r0.A03(r5)
        L89:
            android.widget.EditText r1 = r6.A01
            if (r1 == 0) goto Lae
            X.Akv r0 = r6.A03
            if (r0 != 0) goto L94
            java.lang.String r0 = "model"
            goto L62
        L94:
            java.lang.String r0 = r0.A01
            r1.setText(r0)
            android.view.View r1 = r6.A05
            android.view.View r0 = r6.A00
            android.view.View[] r0 = new android.view.View[]{r1, r0}
            X.AbstractC125325le.A04(r3, r0, r4)
            X.88W r1 = r6.A08
            android.widget.EditText r0 = r6.A01
            if (r0 == 0) goto Lae
            r1.A02(r0)
            return
        Lae:
            java.lang.String r0 = "titleEditText"
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnFocusChangeListenerC23259ASu.DDv(java.lang.Object):void");
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
        View view2 = this.A00;
        if (view2 == null) {
            return;
        }
        AbstractC166997dE.A1J(this.A05, view2, false);
    }

    @Override // X.InterfaceC25183BCg
    public final View B0N() {
        View view = this.A00;
        if (view != null) {
            return view.requireViewById(R.id.secret_sticker_container);
        }
        return null;
    }

    @Override // X.InterfaceC25183BCg
    public final Class C0Y() {
        return C194778jd.class;
    }

    @Override // X.InterfaceC25184BCh
    public final void DEy() {
        View view = this.A00;
        if (view != null) {
            AbstractC166997dE.A1J(this.A05, view, false);
        }
        C24017Akv c24017Akv = this.A03;
        String str = "model";
        if (c24017Akv != null) {
            EditText editText = this.A01;
            if (editText == null) {
                str = "titleEditText";
            } else {
                c24017Akv.A01 = AbstractC167007dF.A0g(editText);
                C8NX c8nx = this.A0A;
                C24017Akv c24017Akv2 = this.A03;
                if (c24017Akv2 != null) {
                    c8nx.Dog(c24017Akv2, AbstractC111324zv.A00(5258));
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC195198kL
    public final void DOI() {
        EditText editText = this.A01;
        if (editText == null) {
            C14360o3.A0F("titleEditText");
            throw C00O.createAndThrow();
        }
        editText.clearFocus();
        InterfaceC1810081c.A00(this.A09);
    }
}
