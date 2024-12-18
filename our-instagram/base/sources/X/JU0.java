package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.text.TightTextView;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class JU0 implements C7QD, InterfaceC50477MQf, C7QE, InterfaceC162937Re {
    public FrameLayout A00;
    public C7QH A01;
    public final Context A02;
    public final Drawable A03;
    public final ForegroundColorSpan A04;
    public final StyleSpan A05;
    public final ImageView A06;
    public final TightTextView A07;
    public final AnonymousClass988 A08;
    public final C7RY A09;

    public JU0(View view, AnonymousClass988 anonymousClass988, C7RY c7ry) {
        C14360o3.A0B(view, 1);
        this.A00 = (FrameLayout) view.requireViewById(R.id.message_content_visual_bubble_container);
        TightTextView tightTextView = (TightTextView) view.requireViewById(R.id.direct_visual_message_digest);
        this.A07 = tightTextView;
        this.A06 = AbstractC31173DnH.A0I(view, R.id.direct_visual_message_icon);
        Context A0L = AbstractC166997dE.A0L(view);
        tightTextView.setMaxWidth(C7N9.A00(A0L, false));
        this.A04 = new ForegroundColorSpan(AbstractC31174DnI.A01(A0L));
        this.A05 = new StyleSpan(1);
        this.A03 = AbstractC162807Qr.A00();
        this.A02 = this.A00.getContext();
        this.A08 = anonymousClass988;
        this.A09 = c7ry;
    }

    @Override // X.InterfaceC50477MQf
    public final void DS5() {
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A00;
    }

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A01;
    }

    @Override // X.InterfaceC50477MQf
    public final void DQ6() {
        C7RY c7ry = this.A09;
        HashMap hashMap = c7ry.A05;
        if (hashMap.containsKey(this)) {
            ((InterfaceC165367aP) c7ry.A02).DS3((MessageIdentifier) hashMap.get(this));
        }
    }

    @Override // X.InterfaceC50477MQf
    public final void DQ7() {
        this.A07.setText(2131959363);
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A01 = c7qh;
    }

    @Override // X.InterfaceC162937Re
    public final void F82(int i) {
        C7MU.A00(this.A07.getBackground(), i);
        C7MU.A00(this.A06.getDrawable(), i);
    }
}
