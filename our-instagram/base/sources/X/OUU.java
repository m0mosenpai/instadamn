package X;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes9.dex */
public final class OUU {
    public InterfaceC57878Pli A00;
    public final Context A01;
    public final View A02;
    public final View A03;
    public final TextView A04;
    public final C07X A05;
    public final UserSession A06;
    public final IgEditText A07;
    public final IgTextView A08;
    public final InterfaceC09390do A09;

    public static C51048Mh0 A00(OUU ouu) {
        return (C51048Mh0) ouu.A09.getValue();
    }

    public OUU(View view, C07X c07x, InterfaceC018407e interfaceC018407e, UserSession userSession) {
        AbstractC25234BEr.A1P(userSession, interfaceC018407e, view);
        this.A06 = userSession;
        this.A05 = c07x;
        this.A01 = view.getContext();
        View requireViewById = view.requireViewById(R.id.reel_viewer_message_composer);
        AbstractC31173DnH.A0z(this.A01, requireViewById, R.drawable.story_message_composer_background);
        this.A02 = requireViewById;
        View requireViewById2 = view.requireViewById(R.id.reel_viewer_message_composer_container);
        AbstractC31172DnG.A1B(this.A01, requireViewById2, R.color.black_65_transparent);
        Ok3.A00(requireViewById2, 53, this);
        this.A03 = requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.reel_viewer_message_composer_text);
        IgEditText igEditText = (IgEditText) requireViewById3;
        Context context = igEditText.getContext();
        igEditText.setHintTextColor(context.getColor(AbstractC53242c7.A0A(context)));
        igEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(context.getResources().getInteger(R.integer.max_message_length))});
        C55346Oi6.A01(igEditText, this, 27);
        ViewOnFocusChangeListenerC55473OkS.A00(igEditText, 5, this);
        C14360o3.A07(requireViewById3);
        this.A07 = igEditText;
        View requireViewById4 = view.requireViewById(R.id.reel_viewer_message_composer_text_send_btn);
        TextView textView = (TextView) requireViewById4;
        textView.setTypeface(AbstractC167017dG.A0R(AbstractC166997dE.A0L(textView)));
        Ok3.A00(textView, 54, this);
        C14360o3.A07(requireViewById4);
        this.A04 = textView;
        this.A08 = AbstractC25231BEo.A0d(view, R.id.reel_viewer_composer_top_message);
        C60842q8 A00 = Ny8.A00(new Om2(), interfaceC018407e, AbstractC25225BEi.A1D(C51048Mh0.class));
        this.A09 = A00;
        this.A00 = (InterfaceC57878Pli) ((C51048Mh0) A00.getValue()).A0G.getValue();
        PZE.A02(this, C07Y.A00(c07x), 10);
    }
}
