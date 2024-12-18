package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* renamed from: X.Kn0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46805Kn0 {
    public static final void A00(View view, InterfaceC11380iw interfaceC11380iw, C7QY c7qy, boolean z) {
        int i;
        boolean z2;
        TextView A0N;
        C1579877i c1579877i;
        CharSequence charSequence;
        C14360o3.A0B(c7qy, 1);
        IgImageView A0T = AbstractC167007dF.A0T(view, R.id.avatar_view);
        View A0S = AbstractC166997dE.A0S(view, R.id.image_view);
        List list = c7qy.A0c;
        ImageUrl imageUrl = null;
        if (list != null) {
            imageUrl = (ImageUrl) AbstractC001800i.A0J(list);
        }
        if (imageUrl != null) {
            A0T.setUrl(imageUrl, interfaceC11380iw);
        } else if (!z) {
            A0T.setVisibility(8);
            A0S.setVisibility(8);
            TextView A0C = AbstractC31178DnM.A0C(view);
            A0C.setText(c7qy.A0a);
            int A04 = AbstractC167017dG.A04(A0C.getContext());
            i = c7qy.A02;
            z2 = true;
            if (i != 1 && i != 3) {
                z2 = false;
            }
            C85963sQ.A0A(A0C, A04, z2);
            AbstractC167007dF.A0N(view, R.id.subtitle).setText(c7qy.A0Z);
            A0N = AbstractC167007dF.A0N(view, R.id.metadata);
            c1579877i = c7qy.A0D;
            if (c1579877i == null && (charSequence = c1579877i.A05) != null && !AbstractC001900j.A0T(charSequence)) {
                A0N.setText(charSequence);
                A0N.setVisibility(0);
                return;
            } else {
                A0N.setVisibility(8);
            }
        }
        A0T.setVisibility(0);
        A0S.setVisibility(8);
        TextView A0C2 = AbstractC31178DnM.A0C(view);
        A0C2.setText(c7qy.A0a);
        int A042 = AbstractC167017dG.A04(A0C2.getContext());
        i = c7qy.A02;
        z2 = true;
        if (i != 1) {
            z2 = false;
        }
        C85963sQ.A0A(A0C2, A042, z2);
        AbstractC167007dF.A0N(view, R.id.subtitle).setText(c7qy.A0Z);
        A0N = AbstractC167007dF.A0N(view, R.id.metadata);
        c1579877i = c7qy.A0D;
        if (c1579877i == null) {
        }
        A0N.setVisibility(8);
    }
}
