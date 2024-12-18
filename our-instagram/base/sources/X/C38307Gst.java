package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.api.schemas.AudioFilterInfoIntf;
import com.instagram.api.schemas.OriginalAudioPartMetadataIntf;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* renamed from: X.Gst, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38307Gst extends BaseAdapter {
    public final INT A00;
    public final List A01;
    public final LayoutInflater A02;
    public final InterfaceC11380iw A03;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A01.size();
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A01.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        AudioFilterInfoIntf audioFilterInfoIntf;
        int i2 = 0;
        View A0R = AbstractC25226BEj.A0R(this.A02, viewGroup, R.layout.layout_clips_mix_sheet_item, false);
        OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf = (OriginalAudioPartMetadataIntf) this.A01.get(i);
        IgImageView A0Z = AbstractC31172DnG.A0Z(A0R, R.id.music_album_art);
        ImageUrl C88 = originalAudioPartMetadataIntf.C88();
        if (C88 != null) {
            A0Z.setUrl(C88, this.A03);
        }
        TextView A0T = AbstractC166997dE.A0T(A0R, R.id.primary_text);
        A0T.setText(originalAudioPartMetadataIntf.getDisplayTitle());
        if (originalAudioPartMetadataIntf.isExplicit()) {
            Drawable A00 = this.A00.A00();
            A0T.setCompoundDrawablePadding(AbstractC167017dG.A05(A0T.getContext()));
            A0T.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, A00, (Drawable) null);
        }
        TextView A0T2 = AbstractC166997dE.A0T(A0R, R.id.filter_pill);
        List Ado = originalAudioPartMetadataIntf.Ado();
        if (Ado != null && (audioFilterInfoIntf = (AudioFilterInfoIntf) AbstractC001800i.A0J(Ado)) != null) {
            AbstractC31173DnH.A19(AbstractC25228BEl.A0M(A0T2), A0T2, AbstractC92574Cr.A00(audioFilterInfoIntf.B6T()));
        } else {
            i2 = 8;
        }
        A0T2.setVisibility(i2);
        AbstractC166997dE.A0T(A0R, R.id.secondary_text).setText(originalAudioPartMetadataIntf.getDisplayArtist());
        ViewOnClickListenerC42028Ijx.A00(A0R.requireViewById(R.id.track_container), originalAudioPartMetadataIntf, this, i, 7);
        A0R.setContentDescription(originalAudioPartMetadataIntf.getDisplayTitle());
        AbstractC56952jT.A01(A0R);
        A0R.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC41861Igz(this, i));
        return A0R;
    }

    public C38307Gst(Context context, InterfaceC11380iw interfaceC11380iw, INT r5, List list) {
        this.A01 = list;
        this.A03 = interfaceC11380iw;
        this.A00 = r5;
        Object systemService = context.getSystemService(AbstractC58317Pt9.A00(44));
        C14360o3.A0C(systemService, AbstractC111324zv.A00(479));
        this.A02 = (LayoutInflater) systemService;
    }
}
