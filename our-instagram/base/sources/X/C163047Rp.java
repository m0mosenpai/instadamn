package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.HashSet;

/* renamed from: X.7Rp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163047Rp implements C7QD {
    public MessageIdentifier A00;
    public boolean A01;
    public AnonymousClass794 A02;
    public HashSet A03;
    public final View A04;
    public final RecyclerView A05;
    public final C66362zD A06;
    public final IgLinearLayout A07;
    public final IgTextView A08;
    public final C7ZX A09;
    public final AnonymousClass988 A0A;

    public C163047Rp(View view, final InterfaceC11380iw interfaceC11380iw, final C7RB c7rb, final C7ZX c7zx, final AnonymousClass988 anonymousClass988) {
        C14360o3.A0B(view, 1);
        C14360o3.A0B(c7rb, 5);
        this.A04 = view;
        this.A0A = anonymousClass988;
        this.A09 = c7zx;
        View requireViewById = view.requireViewById(R.id.pills_view_container);
        C14360o3.A07(requireViewById);
        this.A07 = (IgLinearLayout) requireViewById;
        View requireViewById2 = view.requireViewById(R.id.message_pills_hidden_reaction_nux);
        C14360o3.A07(requireViewById2);
        this.A08 = (IgTextView) requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.message_multiple_reaction_pills_recycler_view);
        C14360o3.A07(requireViewById3);
        this.A05 = (RecyclerView) requireViewById3;
        C66392zG A00 = C66362zD.A00(view.getContext());
        A00.A01(new AbstractC66422zJ(interfaceC11380iw, c7rb, c7zx, anonymousClass988) { // from class: X.7Rq
            public final InterfaceC11380iw A00;
            public final C7RB A01;
            public final C7ZX A02;
            public final AnonymousClass988 A03;

            @Override // X.AbstractC66422zJ
            public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
                C14360o3.A0B(viewGroup, 0);
                C14360o3.A0B(layoutInflater, 1);
                boolean booleanValue = ((Boolean) this.A03.A1L.getValue()).booleanValue();
                int i = R.layout.message_single_reaction_pill;
                if (booleanValue) {
                    i = R.layout.message_single_reaction_pill_with_countertextview;
                }
                View inflate = layoutInflater.inflate(i, viewGroup, false);
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C14360o3.A0A(inflate);
                return new C43740JVz(layoutInflater, inflate, this.A00, this.A01, this.A02, booleanValue);
            }

            /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
            
                if (r3 != r2) goto L8;
             */
            @Override // X.AbstractC66422zJ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r23, X.C3OO r24) {
                /*
                    Method dump skipped, instructions count: 375
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C163057Rq.bind(X.2zP, X.3OO):void");
            }

            @Override // X.AbstractC66422zJ
            public final Class modelClass() {
                return C163107Rv.class;
            }

            @Override // X.AbstractC66422zJ
            public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
                C43740JVz c43740JVz = (C43740JVz) c3oo;
                C14360o3.A0B(c43740JVz, 0);
                c43740JVz.A01 = null;
                c43740JVz.A00 = null;
                c43740JVz.A0A.A00 = null;
            }

            {
                this.A03 = anonymousClass988;
                this.A02 = c7zx;
                this.A00 = interfaceC11380iw;
                this.A01 = c7rb;
            }
        });
        A00.A01(new AbstractC66422zJ(c7rb, c7zx) { // from class: X.7Rr
            public final C7RB A00;
            public final C7ZX A01;

            @Override // X.AbstractC66422zJ
            public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
                C14360o3.A0B(viewGroup, 0);
                C14360o3.A0B(layoutInflater, 1);
                View inflate = layoutInflater.inflate(R.layout.message_overflow_reactions_pill, viewGroup, false);
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C14360o3.A0A(inflate);
                return new C44734JrH(inflate, this.A00, this.A01);
            }

            @Override // X.AbstractC66422zJ
            public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
                C163117Rw c163117Rw = (C163117Rw) interfaceC66482zP;
                C44734JrH c44734JrH = (C44734JrH) c3oo;
                C14360o3.A0B(c163117Rw, 0);
                C14360o3.A0B(c44734JrH, 1);
                TextView textView = c44734JrH.A02;
                C7R4.A00(textView, C05F.A00, c163117Rw.A02, false);
                C7IH c7ih = c163117Rw.A00;
                C14360o3.A0B(textView, 0);
                C14360o3.A0B(c7ih, 1);
                textView.setTextColor(c7ih.A0C);
                C7R4.A04(c44734JrH.A01, c7ih, false);
                C0fQ.A00(new ViewOnClickListenerC48039LOl(c163117Rw, c44734JrH), c44734JrH.A00);
            }

            @Override // X.AbstractC66422zJ
            public final Class modelClass() {
                return C163117Rw.class;
            }

            {
                this.A01 = c7zx;
                this.A00 = c7rb;
            }
        });
        A00.A01(new AbstractC66422zJ(c7rb, c7zx) { // from class: X.7Rs
            public final C7RB A00;
            public final C7ZX A01;

            @Override // X.AbstractC66422zJ
            public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
                C14360o3.A0B(viewGroup, 0);
                C14360o3.A0B(layoutInflater, 1);
                View inflate = layoutInflater.inflate(R.layout.message_overflow_reactions_pill, viewGroup, false);
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C14360o3.A0A(inflate);
                return new C44721Jr4(inflate, this.A00, this.A01);
            }

            @Override // X.AbstractC66422zJ
            public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
                C163127Rx c163127Rx = (C163127Rx) interfaceC66482zP;
                C44721Jr4 c44721Jr4 = (C44721Jr4) c3oo;
                C14360o3.A0B(c163127Rx, 0);
                C14360o3.A0B(c44721Jr4, 1);
                TextView textView = c44721Jr4.A01;
                C7R4.A00(textView, C05F.A00, c163127Rx.A02, false);
                C7IH c7ih = c163127Rx.A00;
                C14360o3.A0B(textView, 0);
                C14360o3.A0B(c7ih, 1);
                textView.setTextColor(c7ih.A0C);
                LinearLayout linearLayout = c44721Jr4.A00;
                C7R4.A04(linearLayout, c7ih, false);
                C0fQ.A00(new ViewOnClickListenerC48040LOm(c163127Rx, c44721Jr4), linearLayout);
            }

            @Override // X.AbstractC66422zJ
            public final Class modelClass() {
                return C163127Rx.class;
            }

            {
                this.A01 = c7zx;
                this.A00 = c7rb;
            }
        });
        A00.A01(new AbstractC66422zJ(c7rb, c7zx) { // from class: X.7Rt
            public final C7RB A00;
            public final C7ZX A01;

            @Override // X.AbstractC66422zJ
            public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
                C14360o3.A0B(viewGroup, 0);
                C14360o3.A0B(layoutInflater, 1);
                View inflate = layoutInflater.inflate(R.layout.message_add_custom_reaction_pill, viewGroup, false);
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C14360o3.A0A(inflate);
                return new C44733JrG(inflate, this.A00, this.A01);
            }

            @Override // X.AbstractC66422zJ
            public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
                C163137Ry c163137Ry = (C163137Ry) interfaceC66482zP;
                C44733JrG c44733JrG = (C44733JrG) c3oo;
                C14360o3.A0B(c163137Ry, 0);
                C14360o3.A0B(c44733JrG, 1);
                LinearLayout linearLayout = c44733JrG.A02;
                C7IH c7ih = c163137Ry.A01;
                C7R4.A04(linearLayout, c7ih, false);
                ImageView imageView = c44733JrG.A01;
                C14360o3.A0B(imageView, 0);
                C14360o3.A0B(c7ih, 1);
                imageView.setColorFilter(C3DY.A00(c7ih.A0C));
                C14360o3.A0B(linearLayout, 0);
                AbstractC56952jT.A04(linearLayout, C05F.A01);
                C0fQ.A00(new ViewOnClickListenerC48038LOk(c163137Ry, c44733JrG), c44733JrG.A00);
            }

            @Override // X.AbstractC66422zJ
            public final Class modelClass() {
                return C163137Ry.class;
            }

            {
                this.A01 = c7zx;
                this.A00 = c7rb;
            }
        });
        A00.A01(new AbstractC66422zJ(c7zx) { // from class: X.7Ru
            public final C7ZX A00;

            @Override // X.AbstractC66422zJ
            public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
                C14360o3.A0B(viewGroup, 0);
                C14360o3.A0B(layoutInflater, 1);
                View inflate = layoutInflater.inflate(R.layout.message_replies_pill, viewGroup, false);
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C14360o3.A0A(inflate);
                return new C31967E2v(inflate, this.A00);
            }

            @Override // X.AbstractC66422zJ
            public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
                C163147Rz c163147Rz = (C163147Rz) interfaceC66482zP;
                C31967E2v c31967E2v = (C31967E2v) c3oo;
                C14360o3.A0B(c163147Rz, 0);
                C14360o3.A0B(c31967E2v, 1);
                View view2 = c31967E2v.A00;
                C7R4.A04(view2, c163147Rz.A00, false);
                C7R4.A00(c31967E2v.A01, C05F.A00, c163147Rz.A02, false);
                C0fQ.A00(new ViewOnClickListenerC35549Fn1(c163147Rz, c31967E2v), view2);
            }

            @Override // X.AbstractC66422zJ
            public final Class modelClass() {
                return C163147Rz.class;
            }

            {
                this.A00 = c7zx;
            }
        });
        C66362zD A002 = A00.A00();
        A002.setHasStableIds(true);
        this.A06 = A002;
        this.A03 = new HashSet();
    }

    public final void A00() {
        this.A03.clear();
        this.A01 = false;
        this.A02 = null;
        this.A00 = null;
        this.A05.setVisibility(8);
        this.A08.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
    
        if (r0.contains(r6) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00af, code lost:
    
        if (r0.contains(r6) != true) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.AnonymousClass794 r11) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163047Rp.A01(X.794):void");
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A04;
    }
}
