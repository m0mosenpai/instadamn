package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import java.util.List;

/* renamed from: X.Fet, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35151Fet {
    public ViewGroup A00;
    public IgImageView A01;
    public InterfaceC37232Gah A02;
    public Integer A03;
    public final UserSession A04;
    public final InterfaceViewOnFocusChangeListenerC37281Gbi A05;
    public final List A06 = AbstractC166987dD.A1E();
    public final ViewOnFocusChangeListenerC35694FpU A07 = new ViewOnFocusChangeListenerC35694FpU(this, 5);
    public final boolean A08 = true;

    public static void A00(C35151Fet c35151Fet) {
        InterfaceC37232Gah c36473G6x;
        IgImageView igImageView;
        c35151Fet.A00.getClass();
        ViewStub A07 = AbstractC31171DnF.A07(c35151Fet.A00, R.id.recipient_picker_search_bar_above_pogs);
        ViewStub A072 = AbstractC31171DnF.A07(c35151Fet.A00, R.id.recipient_picker_pogs);
        Integer num = c35151Fet.A03;
        if (num == C05F.A0C && A07 != null && A072 != null) {
            View inflate = A07.inflate();
            IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) inflate.requireViewById(R.id.search_box);
            UserSession userSession = c35151Fet.A04;
            if (C18U.A06(C06090Tz.A05, userSession, 36330200643945197L)) {
                igImageView = AbstractC31172DnG.A0a(inflate, R.id.back_arrow);
            } else {
                igImageView = null;
            }
            c35151Fet.A01 = igImageView;
            ViewOnFocusChangeListenerC35694FpU viewOnFocusChangeListenerC35694FpU = c35151Fet.A07;
            c36473G6x = new C36472G6w(c35151Fet.A00, (RecyclerView) A072.inflate(), viewOnFocusChangeListenerC35694FpU, userSession, igdsInlineSearchBox, new GRS(c35151Fet, 4));
        } else {
            UserSession userSession2 = c35151Fet.A04;
            c36473G6x = new C36473G6x(c35151Fet.A00, c35151Fet.A07, userSession2, AbstractC167007dF.A1X(num, C05F.A01), c35151Fet.A08);
        }
        c35151Fet.A02 = c36473G6x;
        IgImageView igImageView2 = c35151Fet.A01;
        if (igImageView2 != null) {
            InterfaceViewOnFocusChangeListenerC37281Gbi interfaceViewOnFocusChangeListenerC37281Gbi = c35151Fet.A05;
            interfaceViewOnFocusChangeListenerC37281Gbi.getClass();
            ViewOnClickListenerC35666Fp0.A00(igImageView2, 53, interfaceViewOnFocusChangeListenerC37281Gbi);
        }
    }

    public final void A01(List list, boolean z) {
        List list2 = this.A06;
        list2.clear();
        list2.addAll(list);
        this.A02.FCP(null, list2, z, false);
    }

    public C35151Fet(ViewGroup viewGroup, UserSession userSession, InterfaceViewOnFocusChangeListenerC37281Gbi interfaceViewOnFocusChangeListenerC37281Gbi) {
        this.A04 = userSession;
        this.A00 = viewGroup;
        this.A05 = interfaceViewOnFocusChangeListenerC37281Gbi;
        A00(this);
    }

    public C35151Fet(ViewGroup viewGroup, UserSession userSession, InterfaceViewOnFocusChangeListenerC37281Gbi interfaceViewOnFocusChangeListenerC37281Gbi, Integer num) {
        this.A04 = userSession;
        this.A00 = viewGroup;
        this.A05 = interfaceViewOnFocusChangeListenerC37281Gbi;
        this.A03 = num;
        A00(this);
    }
}
