package X;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.4Cn, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4Cn extends C3OO implements C3QU {
    public TextView A00;
    public C206249Bh A01;
    public View A02;
    public final View A03;
    public final ViewStub A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4Cn(View view, boolean z) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A03 = view;
        this.A05 = z;
        this.A04 = (ViewStub) view.findViewById(R.id.row_feed_view_all_comments_stub);
    }

    @Override // X.C3QU
    public final void DFc() {
    }

    public final void A00() {
        View inflate;
        TextView textView;
        ViewStub viewStub = this.A04;
        if (viewStub == null) {
            inflate = this.A03;
        } else {
            if (this.A02 != null) {
                return;
            }
            inflate = viewStub.inflate();
            this.A02 = inflate;
            if (inflate == null) {
                textView = null;
                this.A00 = textView;
            }
        }
        textView = (TextView) inflate.findViewById(R.id.row_feed_view_all_comments_text);
        this.A00 = textView;
    }

    public final void A01(final C206249Bh c206249Bh) {
        if (c206249Bh != null) {
            final TextView textView = this.A00;
            if (textView != null) {
                textView.setVisibility(0);
                textView.setText((CharSequence) c206249Bh.A03);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setLongClickable(false);
                C0fQ.A00(new View.OnClickListener() { // from class: X.4z4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int A05 = C0f9.A05(1606981191);
                        TextView textView2 = textView;
                        if (textView2.getSelectionStart() == -1 && textView2.getSelectionEnd() == -1) {
                            ((InterfaceC16820sZ) ((C206209Bd) c206249Bh.A01).A00).invoke();
                        }
                        C0f9.A0C(557232815, A05);
                    }
                }, textView);
            }
            TextView textView2 = this.A00;
            if (textView2 != null) {
                AbstractC56952jT.A04(textView2, C05F.A01);
                if (this.A05) {
                    AbstractC56932jR.A04(textView2, 4);
                }
            }
        }
    }

    @Override // X.C3QU
    public final void DFd() {
        C75113Zb c75113Zb;
        C206249Bh c206249Bh = this.A01;
        if (c206249Bh != null && (c75113Zb = (C75113Zb) c206249Bh.A02) != null && c75113Zb.A3E) {
            A00();
            A01(this.A01);
        }
    }

    @Override // X.C3QU
    public final void DFe(float f) {
        C75113Zb c75113Zb;
        TextView textView;
        C206249Bh c206249Bh = this.A01;
        if (c206249Bh != null && (c75113Zb = (C75113Zb) c206249Bh.A02) != null && c75113Zb.A3E && (textView = this.A00) != null) {
            textView.setAlpha(f);
        }
    }
}
