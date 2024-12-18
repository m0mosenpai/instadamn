package com.instagram.api.schemas;

import X.C1DV;
import X.C1DY;
import X.IUW;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public interface CreatorViewerSignalModel extends Parcelable {
    public static final IUW A00 = IUW.A00;

    CreatorViewerSignalDetails AxA();

    InspirationSignalType BxI();

    CreatorViewerSignalModel E90(C1DY c1dy);

    CreatorViewerSignalModelImpl Esw(C1DY c1dy);

    CreatorViewerSignalModelImpl Esx(C1DV c1dv);

    TreeUpdaterJNI F7o();

    String getTitle();
}
