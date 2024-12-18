package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.6UE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6UE implements C6UB {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public IgImageView A0A;
    public final InterfaceC56392iX A0B;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        if (r9 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a4, code lost:
    
        r8 = r11.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a6, code lost:
    
        if (r8 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a8, code lost:
    
        X.C14360o3.A0F("ctaSectionDivider");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ac, code lost:
    
        r6 = r11.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ae, code lost:
    
        if (r6 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b0, code lost:
    
        r3 = new X.C110964z8();
        r0 = r7.getParent();
        X.C14360o3.A0C(r0, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        r3.A0I((androidx.constraintlayout.widget.ConstraintLayout) r0);
        r3.A0C(r7.getId(), 3, r10.getId(), 4);
        r3.A0C(r9.getId(), 3, r7.getId(), 4);
        r3.A0C(r8.getId(), 3, r9.getId(), 4);
        r3.A0C(r6.getId(), 3, r8.getId(), 4);
        r0 = r7.getParent();
        X.C14360o3.A0C(r0, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        r3.A0G((androidx.constraintlayout.widget.ConstraintLayout) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fd, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009e, code lost:
    
        if (r9 == null) goto L51;
     */
    @Override // X.C6UB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Eld(java.lang.Boolean r12, java.lang.CharSequence r13, java.lang.CharSequence r14) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6UE.Eld(java.lang.Boolean, java.lang.CharSequence, java.lang.CharSequence):void");
    }

    @Override // X.C6UB
    public final void CMx() {
        String str;
        TextView textView = this.A07;
        if (textView == null) {
            str = "bodySignalTextView";
        } else {
            textView.setVisibility(8);
            TextView textView2 = this.A08;
            if (textView2 == null) {
                str = "bottomSignalTextView";
            } else {
                textView2.setVisibility(8);
                View view = this.A03;
                if (view == null) {
                    str = "signalsDivider";
                } else {
                    view.setVisibility(8);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public C6UE(ViewStub viewStub) {
        InterfaceC56392iX A01 = AbstractC56372iV.A01(viewStub, false, false);
        this.A0B = A01;
        A01.EZv(new InterfaceC69513Al() { // from class: X.6UF
            @Override // X.InterfaceC69513Al
            public final void DLu(View view) {
                C14360o3.A0B(view, 0);
                C6UE c6ue = C6UE.this;
                View requireViewById = view.requireViewById(R.id.generic_card_container);
                C14360o3.A0B(requireViewById, 0);
                c6ue.A00 = requireViewById;
                View requireViewById2 = view.requireViewById(R.id.generic_card_sticker);
                C14360o3.A0B(requireViewById2, 0);
                c6ue.A04 = requireViewById2;
                View requireViewById3 = view.requireViewById(R.id.generic_card_dimmer_overlay);
                C14360o3.A0B(requireViewById3, 0);
                c6ue.A02 = requireViewById3;
                IgImageView igImageView = (IgImageView) view.requireViewById(R.id.generic_card_avatar_image);
                C14360o3.A0B(igImageView, 0);
                c6ue.A0A = igImageView;
                TextView textView = (TextView) view.requireViewById(R.id.generic_card_avatar_subtitle);
                C14360o3.A0B(textView, 0);
                c6ue.A05 = textView;
                TextView textView2 = (TextView) view.requireViewById(R.id.generic_card_avatar_url);
                C14360o3.A0B(textView2, 0);
                c6ue.A06 = textView2;
                c6ue.A07 = (TextView) view.requireViewById(R.id.generic_card_signal_body);
                c6ue.A08 = (TextView) view.requireViewById(R.id.generic_card_signal_bottom);
                c6ue.A03 = view.requireViewById(R.id.generic_card_signals_divider);
                c6ue.A01 = view.requireViewById(R.id.generic_card_cta_section_divider);
                TextView textView3 = (TextView) view.requireViewById(R.id.generic_card_cta_section);
                C14360o3.A0B(textView3, 0);
                c6ue.A09 = textView3;
            }
        });
    }
}
