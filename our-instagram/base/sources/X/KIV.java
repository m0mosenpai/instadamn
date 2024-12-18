package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.direct.ui.polls.PollMessageOptionView;

/* loaded from: classes8.dex */
public final class KIV extends AbstractC66412zI {
    public final L6H A00;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if (X.AbstractC001900j.A0T(r8) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C44689JqY r6, X.KIV r7, java.lang.CharSequence r8) {
        /*
            r2 = 0
            if (r8 == 0) goto La
            boolean r1 = X.AbstractC001900j.A0T(r8)
            r0 = 0
            if (r1 == 0) goto Lb
        La:
            r0 = 1
        Lb:
            r3 = 8
            if (r0 != 0) goto L5c
            X.L6H r0 = r7.A00
            X.LJc r5 = r0.A00
            boolean r0 = r5.A0E
            if (r0 == 0) goto L51
            java.util.List r0 = r5.A0C
            int r0 = r0.size()
            java.util.List r4 = r5.A0B
            int r1 = X.AbstractC31172DnG.A02(r4, r0)
            r0 = 100
            if (r1 >= r0) goto L51
            int r1 = r4.size()
            r0 = 1
            int r1 = r1 - r0
            java.lang.Object r0 = r4.get(r1)
            X.Jzk r0 = (X.C45204Jzk) r0
            java.lang.CharSequence r0 = r0.A00
            if (r0 == 0) goto L51
            int r0 = r0.length()
            if (r0 == 0) goto L51
            int r1 = r5.A00
            int r0 = r1 + 1
            r5.A00 = r0
            X.Jzk r0 = new X.Jzk
            r0.<init>(r1)
            r4.add(r0)
            X.LJc.A01(r5)
            X.LJc.A00(r5)
        L51:
            com.instagram.common.ui.base.IgCheckBox r0 = r6.A00
            r0.setVisibility(r2)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r6.A01
            r0.setVisibility(r3)
            return
        L5c:
            com.instagram.common.ui.base.IgCheckBox r0 = r6.A00
            r0.setVisibility(r3)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r6.A01
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KIV.A00(X.JqY, X.KIV, java.lang.CharSequence):void");
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44689JqY(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.poll_message_add_option_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45204Jzk c45204Jzk = (C45204Jzk) interfaceC66482zP;
        C44689JqY c44689JqY = (C44689JqY) c3oo;
        AbstractC167017dG.A1N(c45204Jzk, c44689JqY);
        A00(c44689JqY, this, c45204Jzk.A00);
        PollMessageOptionView pollMessageOptionView = c44689JqY.A02;
        pollMessageOptionView.setText(String.valueOf(c45204Jzk.A00));
        pollMessageOptionView.A01 = new C48786Lht(c44689JqY, this, c45204Jzk);
        c44689JqY.A00.setOnCheckedChangeListener(new LRE(c45204Jzk, 12));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45204Jzk.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        PollMessageOptionView pollMessageOptionView;
        C44689JqY c44689JqY = (C44689JqY) c3oo;
        if (c44689JqY != null && (pollMessageOptionView = c44689JqY.A02) != null) {
            pollMessageOptionView.A01 = null;
        }
    }

    public KIV(L6H l6h) {
        this.A00 = l6h;
    }
}
