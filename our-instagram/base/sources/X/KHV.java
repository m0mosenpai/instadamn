package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.direct.fragment.thread.poll.view.PollMessageVoterInfoViewModel;

/* loaded from: classes8.dex */
public final class KHV extends AbstractC66412zI {
    public final InterfaceC11380iw A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44690JqZ(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.poll_message_option_voters_item, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        if (r2.length() == 0) goto L6;
     */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r8, X.C3OO r9) {
        /*
            r7 = this;
            com.instagram.direct.fragment.thread.poll.view.PollMessageVoterInfoViewModel r8 = (com.instagram.direct.fragment.thread.poll.view.PollMessageVoterInfoViewModel) r8
            X.JqZ r9 = (X.C44690JqZ) r9
            r6 = 0
            X.AbstractC167007dF.A1K(r8, r9)
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r9.A02
            com.instagram.common.typedurl.ImageUrl r1 = r8.A00
            X.0iw r0 = r7.A00
            r2.setUrl(r1, r0)
            android.view.View r5 = r9.itemView
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout"
            X.C14360o3.A0C(r5, r0)
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            X.4z8 r4 = new X.4z8
            r4.<init>()
            r4.A0I(r5)
            java.lang.String r2 = r8.A02
            if (r2 == 0) goto L2d
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L2e
        L2d:
            r0 = 1
        L2e:
            r3 = 4
            com.instagram.common.ui.base.IgTextView r1 = r9.A00
            if (r0 == 0) goto L4f
            java.lang.String r0 = r8.A03
            r1.setText(r0)
            com.instagram.common.ui.base.IgTextView r1 = r9.A01
            r0 = 8
            r1.setVisibility(r0)
            X.AbstractC31171DnF.A14(r1)
            r1 = 2131437404(0x7f0b275c, float:1.8496706E38)
            r0 = 2131437403(0x7f0b275b, float:1.8496704E38)
            r4.A0C(r1, r3, r0, r3)
        L4b:
            r4.A0G(r5)
            return
        L4f:
            r1.setText(r2)
            com.instagram.common.ui.base.IgTextView r1 = r9.A01
            r1.setVisibility(r6)
            java.lang.String r0 = r8.A03
            r1.setText(r0)
            r2 = 2131437404(0x7f0b275c, float:1.8496706E38)
            r1 = 2131437405(0x7f0b275d, float:1.8496708E38)
            r0 = 3
            r4.A0C(r2, r3, r1, r0)
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KHV.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return PollMessageVoterInfoViewModel.class;
    }

    public KHV(InterfaceC11380iw interfaceC11380iw) {
        this.A00 = interfaceC11380iw;
    }
}
