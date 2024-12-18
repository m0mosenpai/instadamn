package X;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.api.schemas.AudioFilterInfoIntf;
import com.instagram.api.schemas.OriginalAudioPartMetadataIntf;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

/* renamed from: X.Gu0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38364Gu0 extends C2UU {
    public final OriginalAudioSubtype A00;
    public final INT A01;
    public final List A02;

    public C38364Gu0(OriginalAudioSubtype originalAudioSubtype, INT r3, List list) {
        C14360o3.A0B(r3, 2);
        this.A02 = list;
        this.A01 = r3;
        this.A00 = originalAudioSubtype;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C38465Gvm(AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.layout_audio_page_mix_track_item_view, false));
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onViewAttachedToWindow(C3OO c3oo) {
        C14360o3.A0B(c3oo, 0);
        int position = c3oo.getPosition();
        if (this.A02.size() > 3 && position == 3) {
            return;
        }
        this.A01.A04(this.A00, c3oo.getPosition(), false);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        Drawable drawable;
        IgTextView igTextView;
        int i2;
        View view;
        View.OnClickListener viewOnClickListenerC42028Ijx;
        AudioFilterInfoIntf audioFilterInfoIntf;
        C38465Gvm c38465Gvm = (C38465Gvm) c3oo;
        C14360o3.A0B(c38465Gvm, 0);
        List list = this.A02;
        if (list.size() > 3 && i == 3) {
            IgTextView igTextView2 = c38465Gvm.A02;
            INT r0 = this.A01;
            int size = list.size();
            SpannableStringBuilder A01 = AbstractC37300Gc1.A01();
            AbstractC37304Gc5.A0s(A01, r0.A00.getResources().getString(2131953316));
            A01.append((CharSequence) String.valueOf(size));
            igTextView2.setText(AbstractC166987dD.A19(A01));
            igTextView2.setCompoundDrawables(null, null, null, null);
            c38465Gvm.A01.setVisibility(8);
            view = c38465Gvm.A00;
            viewOnClickListenerC42028Ijx = ViewOnClickListenerC42035Ik4.A00(this, 63);
        } else {
            OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf = (OriginalAudioPartMetadataIntf) list.get(i);
            IgTextView igTextView3 = c38465Gvm.A02;
            INT r2 = this.A01;
            C14360o3.A0B(originalAudioPartMetadataIntf, 0);
            SpannableStringBuilder A012 = AbstractC37300Gc1.A01();
            AbstractC37304Gc5.A0s(A012, originalAudioPartMetadataIntf.getDisplayArtist());
            A012.append((CharSequence) originalAudioPartMetadataIntf.getDisplayTitle());
            igTextView3.setText(AbstractC166987dD.A19(A012));
            igTextView3.setCompoundDrawablePadding(AbstractC167017dG.A05(igTextView3.getContext()));
            if (originalAudioPartMetadataIntf.isExplicit()) {
                drawable = r2.A00();
            } else {
                drawable = null;
            }
            igTextView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            List Ado = originalAudioPartMetadataIntf.Ado();
            if (Ado != null && (audioFilterInfoIntf = (AudioFilterInfoIntf) AbstractC001800i.A0J(Ado)) != null) {
                igTextView = c38465Gvm.A01;
                AbstractC31173DnH.A19(AbstractC25228BEl.A0M(igTextView), igTextView, AbstractC92574Cr.A00(audioFilterInfoIntf.B6T()));
                i2 = 0;
            } else {
                igTextView = c38465Gvm.A01;
                i2 = 8;
            }
            igTextView.setVisibility(i2);
            view = c38465Gvm.A00;
            viewOnClickListenerC42028Ijx = new ViewOnClickListenerC42028Ijx(i, 6, originalAudioPartMetadataIntf, this);
        }
        C0fQ.A00(viewOnClickListenerC42028Ijx, view);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int size;
        int A03 = C0f9.A03(-902101334);
        List list = this.A02;
        if (list.size() > 3) {
            size = 4;
        } else {
            size = list.size();
        }
        C0f9.A0A(1845584617, A03);
        return size;
    }
}
