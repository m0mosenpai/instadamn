package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Mib, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51132Mib extends C2UU {
    public final InterfaceC58083Pp8 A00;
    public final List A01 = AbstractC166987dD.A1E();
    public final boolean A02;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C51314Mlb(OOz.A00(viewGroup));
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        String str;
        User user;
        C51314Mlb c51314Mlb = (C51314Mlb) c3oo;
        C14360o3.A0B(c51314Mlb, 0);
        c51314Mlb.A01.setVisibility(8);
        MediaSuggestedProductTag mediaSuggestedProductTag = (MediaSuggestedProductTag) AbstractC001800i.A0O(this.A01, i);
        if (mediaSuggestedProductTag != null) {
            TextView textView = c51314Mlb.A02;
            Product A07 = mediaSuggestedProductTag.A07();
            String str2 = null;
            if (A07 == null || (str = A07.A0J) == null) {
                str = "";
            }
            if (this.A02) {
                Product A072 = mediaSuggestedProductTag.A07();
                if (A072 != null && (user = A072.A0B) != null) {
                    str2 = user.getUsername();
                }
                str = AnonymousClass001.A0j(str, "·", str2, ' ', ' ');
            }
            textView.setText(str);
            OkD.A00(c51314Mlb.A00, mediaSuggestedProductTag, this, i, 16);
        }
    }

    public C51132Mib(InterfaceC58083Pp8 interfaceC58083Pp8, boolean z) {
        this.A00 = interfaceC58083Pp8;
        this.A02 = z;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1007148120);
        int size = this.A01.size();
        C0f9.A0A(833714661, A03);
        return size;
    }
}
