package X;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.ui.NoteUserRowsRecyclerView;
import java.util.List;

/* loaded from: classes8.dex */
public final class L8C {
    public C44528JmY A00;
    public C49512LuR A01;
    public NoteUserRowsRecyclerView A02;
    public C3FR A03;
    public boolean A04;
    public final Fragment A05;
    public final InterfaceC11380iw A06;
    public final UserSession A07;
    public final C48762LhU A08;
    public final String A09;
    public final java.util.Set A0A;

    public L8C(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        this.A07 = userSession;
        this.A09 = str;
        this.A05 = fragment;
        this.A06 = interfaceC11380iw;
        this.A0A = AbstractC31171DnF.A0l();
        this.A08 = new C48762LhU(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6, types: [android.text.SpannableStringBuilder] */
    public final void A00(ViewStub viewStub, FragmentActivity fragmentActivity, List list, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        String str;
        String A0t;
        Object obj;
        SpannableStringBuilder spannableStringBuilder;
        ClickableSpan c46058KaF;
        ?? r7;
        int A06 = AbstractC167007dF.A06(1, viewStub, list);
        View inflate = viewStub.inflate();
        ImageView imageView = (ImageView) inflate.findViewById(R.id.bottom_sheet_reactions_facepile);
        imageView.setImageDrawable(AbstractC89513yr.A01(AbstractC166997dE.A0L(imageView), null, null, this.A09, list, imageView.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material), true, false, false));
        AbstractC56952jT.A01(imageView);
        TextView A0e = AbstractC166987dD.A0e(inflate, R.id.bottom_sheet_reactions_text_view);
        Resources resources = fragmentActivity.getResources();
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                int i = 2131954097;
                if (size != A06) {
                    if (z) {
                        i = 2131954089;
                    }
                    String A0t2 = AbstractC31176DnK.A0t(list, 0);
                    SpannableStringBuilder A0H = AbstractC25225BEi.A0H(resources.getString(i, AbstractC31176DnK.A0t(list, 0), resources.getString(2131954094)));
                    AnonymousClass773.A04(A0H, new C46058KaF(fragmentActivity, this, AbstractC31171DnF.A0g(list.get(0)), fragmentActivity.getColor(R.color.igds_primary_text)), A0t2);
                    A0t = AbstractC166997dE.A0q(resources, 2131954094);
                    c46058KaF = new C46061KaI(interfaceC16820sZ, fragmentActivity.getColor(R.color.igds_primary_text));
                    r7 = A0H;
                    AnonymousClass773.A04(r7, c46058KaF, A0t);
                    str = r7;
                } else {
                    if (z) {
                        i = 2131954089;
                    }
                    String A0t3 = AbstractC31176DnK.A0t(list, 0);
                    SpannableStringBuilder A0H2 = AbstractC25225BEi.A0H(resources.getString(i, AbstractC31176DnK.A0t(list, 0), AbstractC31176DnK.A0t(list, 1)));
                    AnonymousClass773.A04(A0H2, new C46058KaF(fragmentActivity, this, AbstractC31171DnF.A0g(list.get(0)), fragmentActivity.getColor(R.color.igds_primary_text)), A0t3);
                    A0t = AbstractC31176DnK.A0t(list, 1);
                    obj = list.get(1);
                    spannableStringBuilder = A0H2;
                }
            } else {
                int i2 = 2131954098;
                if (z) {
                    i2 = 2131954090;
                }
                A0t = AbstractC31176DnK.A0t(list, 0);
                SpannableStringBuilder A0H3 = AbstractC25225BEi.A0H(AbstractC166997dE.A0r(resources, AbstractC31176DnK.A0t(list, 0), i2));
                obj = list.get(0);
                spannableStringBuilder = A0H3;
            }
            c46058KaF = new C46058KaF(fragmentActivity, this, AbstractC31171DnF.A0g(obj), fragmentActivity.getColor(R.color.igds_primary_text));
            r7 = spannableStringBuilder;
            AnonymousClass773.A04(r7, c46058KaF, A0t);
            str = r7;
        } else {
            str = "";
        }
        AbstractC31176DnK.A1G(A0e, str);
        ViewOnClickListenerC48062LPn.A00(inflate, 26, interfaceC16820sZ);
    }
}
