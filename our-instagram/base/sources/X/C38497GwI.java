package X;

import android.text.TextWatcher;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.GwI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38497GwI extends C3OO {
    public TextWatcher A00;
    public String A01;
    public final LinearLayout A02;
    public final C57012jc A03;
    public final C57012jc A04;
    public final C57012jc A05;
    public final IgdsButton A06;

    public C38497GwI(View view) {
        super(view);
        this.A01 = "v1";
        this.A02 = (LinearLayout) view.requireViewById(R.id.question_list);
        this.A04 = AbstractC31177DnL.A0V(view, R.id.comment_edit_text_stub);
        this.A05 = AbstractC31177DnL.A0V(view, R.id.disclaimer_text_stub);
        this.A03 = AbstractC31177DnL.A0V(view, R.id.action_button_stub);
        this.A06 = (IgdsButton) view.requireViewById(R.id.action_button_v2);
    }
}
