package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.feed.feeditem.SuggestedChannels;
import java.util.List;

/* renamed from: X.Dze, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31872Dze extends C2UU {
    public SuggestedChannels A00;
    public final C65092x7 A01;
    public final Context A02;

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        SuggestedChannels suggestedChannels;
        List list;
        InterfaceC37253Gb6 interfaceC37253Gb6;
        C14360o3.A0B(c3oo, 0);
        if ((c3oo instanceof E31) && (suggestedChannels = this.A00) != null && (list = suggestedChannels.A00.A07) != null && (interfaceC37253Gb6 = (InterfaceC37253Gb6) list.get(i)) != null) {
            E31 e31 = (E31) c3oo;
            E8D e8d = (E8D) interfaceC37253Gb6;
            e31.A03.setUrl(AbstractC25225BEi.A0t(e8d.A03), this.A01.A02);
            e31.A02.setText(e8d.A07);
            Context context = this.A02;
            boolean z = false;
            String A0b = AbstractC31177DnL.A0b(context, AbstractC43744JWe.A01(context.getResources(), Integer.valueOf(e8d.A00), true), 2131974878);
            IgTextView igTextView = e31.A01;
            igTextView.setText(e8d.A05);
            Boolean bool = e8d.A01;
            if (bool != null) {
                z = bool.booleanValue();
            }
            C85963sQ.A0C(igTextView, z);
            e31.A00.setText(A0b);
            ViewOnClickListenerC31591DuJ.A00(c3oo.itemView, 54, this, interfaceC37253Gb6);
        }
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new E31(AbstractC25226BEj.A0R(LayoutInflater.from(this.A02), viewGroup, R.layout.suggested_channels_row, false));
    }

    public C31872Dze(Context context, C65092x7 c65092x7) {
        this.A02 = context;
        this.A01 = c65092x7;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int i;
        List list;
        int A03 = C0f9.A03(-941725412);
        SuggestedChannels suggestedChannels = this.A00;
        if (suggestedChannels != null && (list = suggestedChannels.A00.A07) != null) {
            i = list.size();
        } else {
            i = 0;
        }
        C0f9.A0A(-619658053, A03);
        return i;
    }
}
