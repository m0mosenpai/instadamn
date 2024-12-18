package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.List;

/* renamed from: X.Bd0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25899Bd0 extends C2UU {
    public int A00;
    public final List A01 = AbstractC166987dD.A1E();
    public final String A02;
    public final InterfaceC16820sZ A03;

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        PendingRecipient pendingRecipient;
        String valueOf;
        C14360o3.A0B(c3oo, 0);
        if ((c3oo instanceof C25937Bde) && (pendingRecipient = (PendingRecipient) AbstractC001800i.A0O(this.A01, i)) != null) {
            C25937Bde c25937Bde = (C25937Bde) c3oo;
            ImageUrl imageUrl = pendingRecipient.A03;
            int i2 = this.A00;
            int i3 = 0;
            if (!imageUrl.equals(c25937Bde.A00)) {
                c25937Bde.A00 = imageUrl;
                ImageView imageView = c25937Bde.A01;
                if (imageView != null) {
                    Context A0L = AbstractC166997dE.A0L(imageView);
                    imageView.setImageDrawable(AbstractC28320Ce8.A01(A0L, imageUrl, c25937Bde.A03, A0L.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material), 0, 0));
                }
            }
            TextView textView = c25937Bde.A02;
            if (textView != null) {
                if (i2 > 3 && i == 0) {
                    Resources A0M = AbstractC166997dE.A0M(textView.getContext());
                    if (i2 > 9) {
                        valueOf = AbstractC166997dE.A0r(A0M, 9, 2131960468);
                        C14360o3.A07(valueOf);
                    } else {
                        valueOf = String.valueOf(i2);
                    }
                    textView.setText(valueOf);
                } else {
                    i3 = 8;
                }
                textView.setVisibility(i3);
            }
        }
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C25937Bde(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.direct_private_share_create_group_facepile_view, false), this.A02, this.A03);
    }

    public C25899Bd0(String str, InterfaceC16820sZ interfaceC16820sZ) {
        this.A02 = str;
        this.A03 = interfaceC16820sZ;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-139665218);
        int size = this.A01.size();
        C0f9.A0A(-887519513, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        int i2;
        Long A0j;
        int A03 = C0f9.A03(-721563284);
        PendingRecipient pendingRecipient = (PendingRecipient) AbstractC001800i.A0O(this.A01, i);
        long j = 0;
        if (pendingRecipient == null) {
            i2 = 1626660952;
        } else {
            String str = pendingRecipient.A0B;
            if (str != null && (A0j = AbstractC166997dE.A0j(str)) != null) {
                j = A0j.longValue();
            }
            i2 = -1260351485;
        }
        C0f9.A0A(i2, A03);
        return j;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        C0f9.A0A(310551374, C0f9.A03(1514179967));
        return 1;
    }
}
