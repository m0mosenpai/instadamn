package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.ui.text.LinkTextView;
import com.instagram.ui.widget.thumbnailview.ThumbnailView;

/* renamed from: X.Whq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70833Whq implements InterfaceC69513Al {
    public final int A00;
    public final Object A01;

    public C70833Whq(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC69513Al
    public final void DLu(View view) {
        switch (this.A00) {
            case 0:
                ((Vg7) this.A01).A00 = new C69469Vns(view);
                return;
            case 1:
                C69361Vm7 c69361Vm7 = (C69361Vm7) this.A01;
                c69361Vm7.A00 = view.getContext();
                c69361Vm7.A03 = (LinkTextView) view.findViewById(R.id.fundraiser_sticker_consumption_sheet_recipient_biography);
                c69361Vm7.A01 = (TextView) view.findViewById(R.id.fundraiser_sticker_consumption_sheet_recipient_external_url);
                c69361Vm7.A02 = (TextView) view.findViewById(R.id.fundraiser_sticker_consumption_sheet_recipient_follow_context);
                c69361Vm7.A04 = new Vg7(AbstractC31177DnL.A0V(view, R.id.fundraiser_sticker_recipient_header_neue_stub));
                return;
            case 2:
                C14360o3.A0B(view, 0);
                C69435VnK c69435VnK = (C69435VnK) this.A01;
                c69435VnK.A01 = (IgImageView) view.requireViewById(R.id.saved_collection_context_image);
                c69435VnK.A00 = (IgTextView) view.requireViewById(R.id.saved_collection_context_text);
                return;
            default:
                ThumbnailView.A03((ViewGroup) view, (ThumbnailView) this.A01);
                return;
        }
    }
}
