package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

/* renamed from: X.Jnr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44567Jnr extends C2UU {
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC50472MQa A02;
    public final List A03 = AbstractC166987dD.A1E();

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        IgTextView igTextView;
        LayoutInflater A0P = AbstractC25228BEl.A0P(viewGroup);
        if (i == 1) {
            return new C44687JqW(A0P.inflate(R.layout.direct_quick_reply_hints, viewGroup, false));
        }
        View inflate = A0P.inflate(R.layout.direct_quick_reply_text_item, viewGroup, false);
        boolean A06 = C18U.A06(C06090Tz.A06, this.A01, 36329607938458029L);
        C44687JqW c44687JqW = new C44687JqW(inflate);
        if (!A06) {
            return c44687JqW;
        }
        ViewStub A07 = AbstractC31171DnF.A07(inflate, R.id.quick_reply_label);
        if (A07 != null) {
            igTextView = (IgTextView) A07.inflate();
        } else {
            igTextView = null;
        }
        c44687JqW.A00 = igTextView;
        return c44687JqW;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        int i2;
        C44687JqW c44687JqW = (C44687JqW) c3oo;
        if (c44687JqW.mItemViewType != 1) {
            C44178Jfh c44178Jfh = (C44178Jfh) this.A03.get(i);
            IgTextView igTextView = c44687JqW.A02;
            igTextView.getClass();
            igTextView.setText(c44178Jfh.A03);
            IgTextView igTextView2 = c44687JqW.A01;
            igTextView2.getClass();
            igTextView2.setText(c44178Jfh.A02);
            IgTextView igTextView3 = c44687JqW.A00;
            if (igTextView3 != null) {
                int A00 = AbstractC47853LBw.A00(c44178Jfh.A00);
                if (A00 != 0) {
                    Context context = this.A00;
                    AbstractC166987dD.A1P(context, igTextView3, A00);
                    i2 = 0;
                    String A0t = AbstractC31174DnI.A0t(context, c44178Jfh.A03, "", 2131954398);
                    igTextView.getClass();
                    igTextView.setText(A0t);
                } else {
                    i2 = 8;
                }
                igTextView3.setVisibility(i2);
                Integer A002 = AbstractC46785Kmg.A00(c44178Jfh.A00);
                if (A002 != null) {
                    AbstractC31177DnL.A0q(this.A00, igTextView3, A002.intValue());
                }
            }
            ViewOnClickListenerC48066LPr.A00(c44687JqW.itemView, 49, this, c44178Jfh);
            c44687JqW.itemView.setOnLongClickListener(new LQE(1, this, c44178Jfh));
        }
    }

    public C44567Jnr(Context context, UserSession userSession, InterfaceC50472MQa interfaceC50472MQa) {
        this.A02 = interfaceC50472MQa;
        this.A01 = userSession;
        this.A00 = context;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1054698566);
        int size = this.A03.size() + 1;
        C0f9.A0A(1670675421, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(-1616879138);
        int i2 = 0;
        int i3 = -1316002149;
        if (i >= this.A03.size()) {
            i2 = 1;
            i3 = -827634769;
        }
        C0f9.A0A(i3, A03);
        return i2;
    }
}
