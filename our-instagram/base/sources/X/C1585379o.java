package X;

import android.content.Context;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.79o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1585379o implements C7QD {
    public final Context A00;
    public final IgTextView A01;
    public final InterfaceC09390do A02;
    public final InterfaceC165197a8 A03;

    public C1585379o(Context context, IgTextView igTextView, InterfaceC165197a8 interfaceC165197a8) {
        C14360o3.A0B(igTextView, 3);
        this.A00 = context;
        this.A03 = interfaceC165197a8;
        this.A01 = igTextView;
        this.A02 = AbstractC09440dt.A01(new C9EZ(this, 46));
    }

    public final void A00(C1585679r c1585679r) {
        String str;
        CharSequence charSequence = c1585679r.A04;
        if (charSequence != null && charSequence.length() != 0) {
            IgTextView igTextView = this.A01;
            igTextView.setMovementMethod(LinkMovementMethod.getInstance());
            igTextView.setHighlightColor(0);
            igTextView.setVisibility(0);
            InterfaceC165197a8 interfaceC165197a8 = this.A03;
            Context context = this.A00;
            MessageIdentifier messageIdentifier = c1585679r.A03;
            if (messageIdentifier != null) {
                str = messageIdentifier.A01;
            } else {
                str = null;
            }
            Spannable CoX = interfaceC165197a8.CoX(context, charSequence, str, c1585679r.A00, c1585679r.A07);
            igTextView.setText(((C1586179w) this.A02.getValue()).A00(CoX, c1585679r.A02, c1585679r.A06, c1585679r.A05, c1585679r.A08));
            igTextView.setTextColor(c1585679r.A01);
        }
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A01;
    }
}
