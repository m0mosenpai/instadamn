package com.instagram.user.model;

import X.C1DV;
import X.C1DY;
import X.C41566IaF;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import java.util.List;

/* loaded from: classes7.dex */
public interface UpcomingDropCampaignEventMetadata extends Parcelable {
    public static final C41566IaF A00 = C41566IaF.A00;

    ProductCollection Ap9();

    UpcomingEventMedia AsQ();

    String AzY();

    String BML();

    User BSW();

    List BhR();

    UpcomingDropCampaignEventMetadata ECH(C1DY c1dy);

    UpcomingDropCampaignEventMetadataImpl F7Y(C1DY c1dy);

    UpcomingDropCampaignEventMetadataImpl F7Z(C1DV c1dv);

    TreeUpdaterJNI F7o();
}
