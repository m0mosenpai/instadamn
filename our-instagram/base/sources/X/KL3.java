package X;

import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class KL3 extends AbstractC146246iN {
    public int A00;
    public C44691Jqa A01;
    public LEU A02;
    public final List A03 = AbstractC166987dD.A1E();
    public final InterfaceC16820sZ A04;

    public final void A00(int i, int i2) {
        List list = this.A03;
        if (i < list.size()) {
            ((C45095JxP) list.get(i)).A00 = R.color.badge_color;
        }
        if (i2 >= 0 && i2 < list.size()) {
            ((C45095JxP) list.get(i2)).A00 = R.color.blue_5_60_transparent;
        }
        C0fA.A00(this, 1318761992);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A03.size();
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A03.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        if (((C45095JxP) this.A03.get(i)).A03 != null) {
            return r0.hashCode();
        }
        return 0L;
    }

    @Override // X.AbstractC146246iN, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C8QJ c8qj;
        View view2 = view;
        C14360o3.A0B(viewGroup, 2);
        if (view == null) {
            view2 = AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.rewrite_text_cell, viewGroup, false);
            int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
            C14360o3.A0A(view2);
            view2.setTag(R.id.rewrite_text_view_holder_key, new C44691Jqa(view2, this.A02, this.A04));
        }
        Object tag = view2.getTag(R.id.rewrite_text_view_holder_key);
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.direct.fragment.writewithai.RewriteTextViewHolder");
        C44691Jqa c44691Jqa = (C44691Jqa) tag;
        this.A01 = c44691Jqa;
        if (c44691Jqa != null) {
            c44691Jqa.A00.setMaxHeight(this.A00);
        }
        C44691Jqa c44691Jqa2 = this.A01;
        if (c44691Jqa2 != null) {
            C45095JxP c45095JxP = (C45095JxP) this.A03.get(i);
            C14360o3.A0B(c45095JxP, 0);
            LEU leu = c44691Jqa2.A01;
            if (leu != null) {
                String str = c45095JxP.A03;
                Context context = leu.A00;
                c8qj = new C8QJ(context, leu.A02, null, false);
                ArrayList A1E = AbstractC166987dD.A1E();
                A1E.add(LEU.A00(context, new ME3(str, leu, 43), 2131958916, R.drawable.instagram_thumb_up_pano_outline_24));
                A1E.add(LEU.A00(context, new ME3(str, leu, 44), 2131958915, R.drawable.instagram_thumb_down_pano_outline_24));
                c8qj.A02(A1E);
            } else {
                c8qj = null;
            }
            TextView textView = c44691Jqa2.A00;
            textView.setText(c45095JxP.A05);
            textView.setMovementMethod(new ScrollingMovementMethod());
            textView.setOnTouchListener(new ViewOnTouchListenerC55494Okn(1, new GestureDetector(AbstractC31172DnG.A05(c44691Jqa2), new C44403Jjg(0, c45095JxP, c44691Jqa2, c8qj)), c44691Jqa2, new Object(), new Object()));
            AbstractC31172DnG.A1B(AbstractC31172DnG.A05(c44691Jqa2), textView, c45095JxP.A00);
        }
        return view2;
    }

    public KL3(InterfaceC16820sZ interfaceC16820sZ) {
        this.A04 = interfaceC16820sZ;
    }
}
