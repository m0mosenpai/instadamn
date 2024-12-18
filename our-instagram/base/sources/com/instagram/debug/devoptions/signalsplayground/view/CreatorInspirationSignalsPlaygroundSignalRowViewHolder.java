package com.instagram.debug.devoptions.signalsplayground.view;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25231BEo;
import X.C0f9;
import X.C0fQ;
import X.C14360o3;
import X.C3OO;
import X.VFD;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalsQueryResponse;

/* loaded from: classes5.dex */
public final class CreatorInspirationSignalsPlaygroundSignalRowViewHolder extends C3OO {
    public final Delegate delegate;
    public final RoundedCornerImageView signalImageView;
    public final ConstraintLayout signalRowContainer;
    public final IgTextView signalSubtitle;
    public final IgTextView signalTitle;

    /* loaded from: classes5.dex */
    public interface Delegate {
        void onSignalRowClick(CreatorInspirationSignalsPlaygroundSignalsQueryResponse.XdtGetCreatorsSignalPlayground.Signals signals);
    }

    /* loaded from: classes11.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VFD.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final void bind(final CreatorInspirationSignalsPlaygroundSignalsQueryResponse.XdtGetCreatorsSignalPlayground.Signals signals) {
        C14360o3.A0B(signals, 0);
        Integer iconDrawableResByType = getIconDrawableResByType(signals.getEntityTypeV2());
        if (iconDrawableResByType != null) {
            int intValue = iconDrawableResByType.intValue();
            AbstractC166997dE.A19(this.itemView.getContext(), this.signalImageView, intValue);
        }
        this.signalTitle.setText(signals.getDisplayName());
        this.signalSubtitle.setText(signals.getIdentifier());
        C0fQ.A00(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.signalsplayground.view.CreatorInspirationSignalsPlaygroundSignalRowViewHolder$bind$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(925491384);
                CreatorInspirationSignalsPlaygroundSignalRowViewHolder creatorInspirationSignalsPlaygroundSignalRowViewHolder = CreatorInspirationSignalsPlaygroundSignalRowViewHolder.this;
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                creatorInspirationSignalsPlaygroundSignalRowViewHolder.delegate.onSignalRowClick(signals);
                C0f9.A0C(1009243037, A05);
            }
        }, this.signalRowContainer);
    }

    private final Integer getIconDrawableResByType(VFD vfd) {
        int i;
        if (vfd != null) {
            int ordinal = vfd.ordinal();
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 1) {
                        i = R.drawable.instagram_users_pano_outline_24;
                    } else {
                        return null;
                    }
                } else {
                    i = R.drawable.instagram_reels_pano_outline_24;
                }
            } else {
                i = R.drawable.instagram_music_pano_outline_24;
            }
            return Integer.valueOf(i);
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatorInspirationSignalsPlaygroundSignalRowViewHolder(View view, Delegate delegate) {
        super(view);
        AbstractC167017dG.A1P(view, delegate);
        this.delegate = delegate;
        this.signalRowContainer = (ConstraintLayout) AbstractC166997dE.A0R(view, R.id.signal_row_container);
        this.signalImageView = (RoundedCornerImageView) AbstractC166997dE.A0R(view, R.id.signal_image);
        this.signalTitle = AbstractC25231BEo.A0d(view, R.id.signal_title);
        this.signalSubtitle = AbstractC25231BEo.A0d(view, R.id.signal_subtitle);
    }
}
