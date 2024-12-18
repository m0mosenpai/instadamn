package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgButton;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class W5F {
    public ImageButton A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public boolean A06;
    public IgButton A07;
    public IgButton A08;
    public final Context A09;
    public final C31R A0A;
    public final InterfaceC671731i A0B;
    public final View.OnClickListener A0C;
    public final View.OnClickListener A0D;
    public final View.OnClickListener A0E;

    public final void A02(View view) {
        C14360o3.A0B(view, 0);
        this.A03 = (TextView) view.requireViewById(R.id.pool_debug_info);
        this.A04 = (TextView) view.requireViewById(R.id.debug_gap_rules);
        this.A05 = (TextView) view.requireViewById(R.id.debug_insertion_log);
        this.A01 = (TextView) view.requireViewById(R.id.debug_ad_pool);
        this.A00 = (ImageButton) view.requireViewById(R.id.media_pause_button);
        this.A07 = (IgButton) view.requireViewById(R.id.debug_clear_pool);
        this.A08 = (IgButton) view.requireViewById(R.id.debug_fill_pool);
        TextView textView = this.A04;
        if (textView != null) {
            C0fQ.A00(this.A0E, textView);
        }
        TextView textView2 = this.A05;
        if (textView2 != null) {
            C0fQ.A00(this.A0E, textView2);
        }
        TextView textView3 = this.A01;
        if (textView3 != null) {
            C0fQ.A00(this.A0E, textView3);
        }
        ImageButton imageButton = this.A00;
        if (imageButton != null) {
            C0fQ.A00(this.A0C, imageButton);
        }
        IgButton igButton = this.A07;
        if (igButton != null) {
            C0fQ.A00(this.A0D, igButton);
        }
        IgButton igButton2 = this.A08;
        if (igButton2 != null) {
            C0fQ.A00(this.A0D, igButton2);
        }
        TextView textView4 = this.A04;
        this.A02 = textView4;
        if (textView4 != null) {
            textView4.performClick();
        }
    }

    public static final void A00(StringBuilder sb, Map map) {
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry entry = (Map.Entry) A15.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            sb.append(str);
            AbstractC58320PtC.A1N(": ", str2, "\n", sb);
        }
        sb.append("\n");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.StringBuilder] */
    public final void A01() {
        TextView textView;
        Integer valueOf;
        ?? sb;
        if (this.A03 != null && (textView = this.A02) != null && (valueOf = Integer.valueOf(textView.getId())) != null) {
            int intValue = valueOf.intValue();
            if (intValue == R.id.debug_gap_rules) {
                InterfaceC671731i interfaceC671731i = this.A0B;
                Map Aut = interfaceC671731i.Aut();
                sb = new StringBuilder();
                sb.append("Current State");
                sb.append(": \n");
                StringBuilder sb2 = new StringBuilder();
                A00(sb2, Aut);
                sb.append(sb2);
                if (interfaceC671731i.AuJ() != null) {
                    StringBuilder sb3 = new StringBuilder();
                    Map B9T = interfaceC671731i.B9T();
                    sb3.append("Gap Rules Enforced");
                    sb3.append(": \n");
                    StringBuilder sb4 = new StringBuilder();
                    A00(sb4, B9T);
                    sb3.append((CharSequence) sb4);
                    sb.append(sb3);
                }
                sb.append("Pool Size");
                sb.append(": ");
                sb.append(Integer.valueOf(interfaceC671731i.BeQ().size()));
            } else if (intValue == R.id.debug_insertion_log) {
                List BIF = this.A0B.BIF();
                sb = new StringBuilder();
                if (BIF != null) {
                    Iterator it = BIF.iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append("\n");
                    }
                }
            } else {
                if (intValue != R.id.debug_ad_pool) {
                    return;
                }
                Map BeQ = this.A0B.BeQ();
                sb = new StringBuilder();
                boolean z = false;
                if (!BeQ.isEmpty()) {
                    z = true;
                }
                if (z) {
                    sb.append("Pool List");
                    sb.append(":\n");
                    sb.append("\n");
                }
                Iterator A15 = AbstractC166997dE.A15(BeQ);
                while (A15.hasNext()) {
                    sb.append((String) AbstractC31176DnK.A0j(A15));
                    sb.append("\n");
                }
            }
            ?? r0 = this.A03;
            if (r0 != 0) {
                r0.setText(sb);
            }
        }
    }

    public W5F(Context context, C31R c31r, InterfaceC671731i interfaceC671731i) {
        this.A0B = interfaceC671731i;
        this.A0A = c31r;
        this.A09 = context;
        interfaceC671731i.EQn(this);
        this.A0E = new WNS(this, 10);
        this.A0C = new WNS(this, 8);
        this.A0D = new WNS(this, 9);
    }
}
