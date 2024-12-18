package com.instagram.creation.album;

import X.C14360o3;
import X.InterfaceC16660sJ;
import X.OTR;
import android.content.Context;
import android.util.AttributeSet;
import com.instagram.common.ui.base.IgSimpleImageView;

/* loaded from: classes9.dex */
public final class AlbumPostCapCropToggleButton extends IgSimpleImageView {
    public OTR A00;
    public InterfaceC16660sJ A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlbumPostCapCropToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A00 = OTR.A02;
    }

    public final void setUiState(OTR otr) {
        C14360o3.A0B(otr, 0);
        this.A00 = otr;
    }

    public final OTR getUiState() {
        return this.A00;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlbumPostCapCropToggleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A00 = OTR.A02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlbumPostCapCropToggleButton(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A00 = OTR.A02;
    }
}
