package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.mediapicker.MediaPickerItemView;
import java.util.List;

/* renamed from: X.Jnj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44562Jnj extends C2UU {
    public C8SF A00;
    public final C9BB A01 = new C9BB(null, 0, 0, 15, 3, false, false);
    public final List A02;
    public final InterfaceC16620sF A03;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C44706Jqp(AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.media_picker_gallery_folder_item, false));
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        Medium medium;
        C44706Jqp c44706Jqp = (C44706Jqp) c3oo;
        C14360o3.A0B(c44706Jqp, 0);
        C55057OaC c55057OaC = (C55057OaC) this.A02.get(i);
        String str = c55057OaC.A01;
        c44706Jqp.A01.setText(str);
        TextView textView = c44706Jqp.A00;
        List list = c55057OaC.A02;
        textView.setText(String.valueOf(list.size()));
        if (!list.isEmpty() && (medium = ((GalleryItem) list.get(0)).A00) != null) {
            MediaPickerItemView mediaPickerItemView = c44706Jqp.A02;
            mediaPickerItemView.setVisibility(0);
            mediaPickerItemView.A03(this.A01, this.A00, AbstractC167017dG.A0d(medium), false, false, false, false);
        } else {
            c44706Jqp.A02.setVisibility(4);
        }
        ViewOnClickListenerC48069LPu.A00(c44706Jqp.itemView, c55057OaC, this, str, 7);
    }

    public C44562Jnj(Context context, UserSession userSession, List list, InterfaceC16620sF interfaceC16620sF) {
        this.A02 = list;
        this.A03 = interfaceC16620sF;
        int A06 = AbstractC43594JPz.A06(context);
        this.A00 = new C8SF(context, userSession, C05F.A00, A06, A06, false);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(2092151773);
        int size = this.A02.size();
        C0f9.A0A(656736987, A03);
        return size;
    }
}
