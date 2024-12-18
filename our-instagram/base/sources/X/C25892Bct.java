package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Bct, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25892Bct extends C2UU {
    public List A00;
    public final Context A01;
    public final InterfaceC110214xq A02;
    public final UserSession A03;
    public final C38321qM A04;
    public final Map A05;

    public C25892Bct(Context context, InterfaceC110214xq interfaceC110214xq, UserSession userSession, C38321qM c38321qM, Map map) {
        C14360o3.A0B(context, 1);
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = interfaceC110214xq;
        this.A04 = c38321qM;
        this.A05 = map;
        this.A00 = C16930sl.A00;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        return new C25928BdV(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.clips_template_landing_page_metadata_pills_item_layout, false));
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        ImageView imageView;
        int A0F;
        C3x9 A0u;
        C25928BdV c25928BdV = (C25928BdV) c3oo;
        C14360o3.A0B(c25928BdV, 0);
        C38321qM c38321qM = this.A04;
        if (c38321qM != null) {
            Context context = this.A01;
            UserSession userSession = this.A03;
            InterfaceC110214xq interfaceC110214xq = this.A02;
            String str = (String) ((C09530e4) this.A00.get(i)).A00;
            C14360o3.A0B(str, 4);
            int hashCode = str.hashCode();
            if (hashCode != -1306084975) {
                if (hashCode != 93166550) {
                    if (hashCode == 1362253043 && str.equals("clips_count")) {
                        c25928BdV.A02.setText(AbstractC167007dF.A0f(context, Integer.valueOf(interfaceC110214xq.BsT().size()), 2131975262));
                        imageView = c25928BdV.A00;
                        A0F = R.drawable.instagram_templates_pano_filled_24;
                    } else {
                        return;
                    }
                } else {
                    if (!str.equals(MediaStreamTrack.AUDIO_TRACK_KIND) || (A0u = AbstractC25226BEj.A0u(c38321qM)) == null) {
                        return;
                    }
                    String A07 = AbstractC76643c9.A07(A0u);
                    String A06 = AbstractC76643c9.A06(A0u);
                    C14360o3.A07(A06);
                    C92584Cs c92584Cs = new C92584Cs(AbstractC76643c9.A00(A0u.BZw()), A0u.AZi(), A07, A06, R.dimen.abc_text_size_menu_header_material, false, AbstractC76643c9.A0D(A0u), false, false, true, true, AbstractC76643c9.A0H(userSession, c38321qM), AbstractC92574Cr.A03(A0u), false);
                    SpannableStringBuilder A03 = C92604Cu.A03(AbstractC166997dE.A0M(context), C92604Cu.A01(context, c92584Cs), C92604Cu.A00(context, c92584Cs), userSession, c92584Cs, true);
                    IgTextView igTextView = c25928BdV.A01;
                    igTextView.setText(A03);
                    igTextView.setVisibility(0);
                    igTextView.setSelected(true);
                    c25928BdV.A02.setVisibility(8);
                    imageView = c25928BdV.A00;
                    A0F = R.drawable.instagram_music_pano_filled_12;
                }
            } else {
                if (!str.equals("effect")) {
                    return;
                }
                IgTextView igTextView2 = c25928BdV.A02;
                C28201Cby c28201Cby = C28201Cby.A00;
                igTextView2.setText((CharSequence) c28201Cby.A00(context, userSession, c38321qM).A01);
                imageView = c25928BdV.A00;
                A0F = AbstractC25230BEn.A0F(c28201Cby.A00(context, userSession, c38321qM));
            }
            imageView.setImageResource(A0F);
        }
    }

    @Override // X.C2UU
    public final int getItemCount() {
        Long BaN;
        int A03 = C0f9.A03(1786077035);
        Map map = this.A05;
        Boolean A0b = AbstractC166997dE.A0b();
        map.put("clips_count", A0b);
        C38321qM c38321qM = this.A04;
        if (c38321qM != null && AbstractC25226BEj.A0u(c38321qM) != null && C37722Gix.A02(this.A01, c38321qM)) {
            map.put(MediaStreamTrack.AUDIO_TRACK_KIND, A0b);
        }
        InterfaceC110134xi B0l = this.A02.B0l();
        if (B0l == null || (BaN = B0l.BaN()) == null || ((int) BaN.longValue()) != 0) {
            map.put("effect", A0b);
        }
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            if (AbstractC166987dD.A1a(A1K.getValue())) {
                A1I.put(A1K.getKey(), A1K.getValue());
            }
        }
        List A00 = C01S.A00(A1I);
        this.A00 = A00;
        int size = A00.size();
        C0f9.A0A(1948480140, A03);
        return size;
    }
}
