package com.instagram.user.model;

import X.C1DV;
import X.C1DY;
import X.C41213IMc;
import X.C41567IaG;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.EventPageNavigationMetadata;
import com.instagram.api.schemas.IGLocalEventDict;
import com.instagram.api.schemas.UpcomingEventIDType;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;

/* loaded from: classes7.dex */
public interface UpcomingEvent extends Parcelable {
    public static final C41567IaG A00 = C41567IaG.A00;

    C41213IMc AKp();

    UpcomingDropCampaignEventMetadata Aza();

    Long B24();

    EventPageNavigationMetadata B2l();

    IGLocalEventDict BG0();

    Long BLn();

    UpcomingEventLiveMetadata BNx();

    UpcomingEventMedia BQO();

    User Bah();

    UpcomingEventIDType CD5();

    Boolean CW7();

    UpcomingEvent ECI(C1DY c1dy);

    UpcomingEventImpl F7a(C1DY c1dy);

    UpcomingEventImpl F7b(C1DV c1dv);

    TreeUpdaterJNI F7o();

    String getId();

    boolean getReminderEnabled();

    long getStartTime();

    String getStrongId();

    String getTitle();
}
